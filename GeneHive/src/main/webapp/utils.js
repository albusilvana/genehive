$(document).ready(function () {
    if (!localStorage.getItem("isUserLoggedIn")) {
        localStorage.setItem("errorMessage", "You have to log in in order to access this page.");
        window.location = "http://localhost:9095/hh/login.html";
    }
    showHome();
    $.ajax({
        url: "http://localhost:9095/hh/API/v1/entries/total/all?token=dsf"
    }).then(function (data) {
        $("#currentEntriesCount").text(data);
    });
    insertProfesionalExposure();
    insertOperators();
    refreshWithAll();
});

function insertProfesionalExposure() {
    var exposures = ",Arsenic,Asbestos,Asphalt fumes,Benzene,Beryllium,1-Bromopropane,13-Butadiene,Cadmium,Chromium,Diacetyl,Diesel exhaust,Ethylene oxide,Formaldehyde,Hexavalent chromium,Hydrogen sulfide,Isocyanates,Lead,Mercury,Metals toxic,Metalworking fluids,Methylene chloride,SilicaCrystalline,Solvents,Synthetic mineral fibers,Toluene".split(",");
    for (var i = 0; i < exposures.length; i++) {
        $("#insertProfestionalExposure").append($("<option />").val(exposures[i]).text(exposures[i]));
        $("#profestionalExposure").append($("<option />").val(exposures[i]).text(exposures[i]));

    }
}

function insertOperators() {
    var operators = "<,>,<=,>=,=".split(",");
    for (var i = 0; i < operators.length; i++) {
        $("#operatorBirthDate").append($("<option />").val(operators[i]).text(operators[i]));
        $("#operatorDiagnosisDate").append($("<option />").val(operators[i]).text(operators[i]));
        $("#operatorDeathDate").append($("<option />").val(operators[i]).text(operators[i]));
    }
    var profExposure = $("#professionalExposureOperator");
    profExposure.append($("<option />").val(31536000000).text("Under 1 Year"));
    profExposure.append($("<option />").val(157766400000).text("Between 1 and 5 years"));
    profExposure.append($("<option />").val(315532800000).text("Between 5 and 10 years"));
    profExposure.append($("<option />").val(631152000000).text("Between 10 and 20 years"));
    profExposure.append($("<option />").val(662688000000).text("Over 20 years"));
}
function showInsert() {
    $("#insertContent").show();
    $("#statisticsContent").hide()
    $("#homeContent").hide();
    $("#homeLi").removeClass("active");
    $("#statsLi").removeClass("active");
    $("#insertLi").addClass("active");
    insertProfesionalExposure();
}

function showHome() {
    $("#homeContent").show();
    $("#statisticsContent").hide();
    $("#insertContent").hide();
    $("#homeLi").addClass("active");
    $("#statsLi").removeClass("active");
    $("#insertLi").removeClass("active");

}
function showStatistics() {
    $("#homeContent").hide();
    $("#statisticsContent").show();
    $("#insertContent").hide();
    $("#homeLi").removeClass("active");
    $("#statsLi").addClass("active");
    $("#insertLi").removeClass("active");
}

function refreshWithAll() {
    var selectedVal = $('input[name=mapType]:checked').val();
    if (selectedVal == "cluster") {
        var data = $.getJSON('http://localhost:9095/hh/API/v1/entries/count/all?token=' + localStorage.getItem("token"), function (data) {
            loadClusterData(data);
        });
    } else {
        var data = $.getJSON('http://localhost:9095/hh/API/v1/entries/count/enhanced/all?token=' + localStorage.getItem("token"), function (data) {
            loadHighLightData(data);
        });
    }
    $("#all").addClass("selected");
    $("#women").removeClass("selected");
    $("#men").removeClass("selected");
}

function refreshMapWithPrediction() {

}

function computeSearchJsonData() {
    var jsonData = {};

    var bdate = new Date($("#birthDay").val());
    var bmilliseconds = bdate.getTime();

    var ddate = new Date($("#diagnosticDay").val());
    var dmilliseconds = ddate.getTime();

    var dedate = new Date($("#deathDay").val());
    var demilliseconds = dedate.getTime();

    jsonData.dateOfBirthOperator = $("#operatorBirthDate").val();
    jsonData.dateOfDiagnosisOperator = $("#operatorDiagnosisDate").val();
    jsonData.dateOfDeathOperator = $("#operatorDeathDate").val();
    jsonData.dateOfBirth = bmilliseconds;
    jsonData.dateOfDiagnosis = dmilliseconds;
    jsonData.dateOfDeath = demilliseconds;
    jsonData.gender = $('input[name=sex]:checked').val();
    jsonData.professionalExposure = $("#profestionalExposure").val();
    jsonData.professionalExposureTime = parseInt($("#professionalExposureOperator").val());
    jsonData.mutation = $("#geneName").val();
    jsonData.locus = $("#locus").val();
    jsonData.disorder = $("#disprderName").val();
    console.log(jsonData);
    return jsonData;
}
function getResults() {
    var selectedVal = $('input[name=mapType]:checked').val();
    $.ajax({
        contentType: 'application/json',
        data: JSON.stringify(computeSearchJsonData()),
        dataType: 'json',
        success: function (data) {
            if (selectedVal == "cluster") {
                loadClusterData(data);
            } else {
                loadHighLightData(data);
            }
        },
        error: function () {
            alert("Error");
        },
        processData: false,
        type: 'POST',
        url: "http://localhost:9095/hh/API/v1/entries/filtered"
    });
}
$(document).on("submit", "form.fileDownloadForm", function (e) {
    var bdate = new Date($("#birthDay").val());
    var bmilliseconds = bdate.getTime();

    var ddate = new Date($("#diagnosticDay").val());
    var dmilliseconds = ddate.getTime();

    var dedate = new Date($("#deathDay").val());
    var demilliseconds = dedate.getTime();

    var url = "http://localhost:9095/hh/API/v1/entries/export/csv?dateOfBirthOperator='" + encodeURIComponent($("#operatorBirthDate").val()) +
        "'&dateOfDiagnosisOperator='" + encodeURIComponent( $("#operatorDiagnosisDate").val()) + "'&dateOfDeathOperator=" + encodeURIComponent( $("#operatorDeathDate").val())
        + "&dateOfBirth=" + bmilliseconds + "&dateOfDiagnosis=" + dmilliseconds + "&dateOfDeath=" + demilliseconds + "&gender=" +
        $('input[name=sex]:checked').val() + "&professionalExposure="+$("#profestionalExposure").val()+"&professionalExposureTime="+
        parseInt($("#professionalExposureOperator").val()) + "&mutation=" + $("#geneName").val() + "&locus=" + $("#locus").val() +
        "&disorder=" + $("#disprderName").val();
    $.fileDownload(url, {
        preparingMessageHtml: "We are preparing your report, please wait...",
        failMessageHtml: "There was a problem generating your report, please try again.",
        httpMethod: "GET"
    });
    e.preventDefault(); //otherwise a normal form submit would occur
});
$(document).on("submit", "form.fileDownloadFormPdf", function (e) {
    $.fileDownload($(this).prop('action'), {
        preparingMessageHtml: "We are preparing your report, please wait...",
        failMessageHtml: "There was a problem generating your report, please try again.",
        httpMethod: "GET"
    });
    e.preventDefault(); //otherwise a normal form submit would occur
});
function downloadCsv(format) {
    var url;
//    if(format == "csv"){
    url = "http://localhost:9095/hh/API/v1/entries/export/csv";
//    }else{
//        url =  "http://localhost:9095/hh/API/v1/entries/export/pdf"
//    }
    $.ajax({
        contentType: 'application/json',
        data: JSON.stringify(computeSearchJsonData()),
        dataType: 'json',
        success: function (data) {


        },
        error: function () {

        },
        processData: false,
        type: 'POST',
        url: url
    });
}

function downloadPdf() {

}

function saveEntry() {
    var jsonData = {};

    var bdate = new Date($("#insertBirthDate").val());
    var bmilliseconds = bdate.getTime();

    var ddate = new Date($("#insertDiagnosisDate").val());
    var dmilliseconds = ddate.getTime();

    var dedate = new Date($("#insertDeathDate").val());
    var demilliseconds = dedate.getTime();

    var sdate = new Date($("#insertStartDate").val());
    var edate = new Date($("#insertEndDate").val());
    var pemilliseconds = edate.getTime() - sdate.getTime();

    jsonData.name = "'" + $("#insertName").val() + "'";
    jsonData.identificationNumber = "'" + $("#insertIdentificationNumber").val() + "'";
    jsonData.countryCode = "'" + $("#insertCountry").val() + "'";
    jsonData.dateOfBirth = bmilliseconds;
    jsonData.dateOfDiagnosis = dmilliseconds;
    jsonData.dateOfDeath = demilliseconds;
    jsonData.gender = "'" + $("#insertGender").val() + "'";
    jsonData.professionalExposure = $("#insertProfestionalExposure").val();
    jsonData.professionalExposureTime = "'" + pemilliseconds + "'";
    jsonData.details = "'" + $("#insertDetails").val() + "'";
    jsonData.mutation = "'" + $("#insertMutation").val() + "'";
    jsonData.locus = "'" + $("#insertLocus").val() + "'";
    jsonData.disorder = "'" + $("#insertDisorder").val() + "'";
    jsonData.physician = "'" + $("#insertPhisician").val() + "'";


    $.ajax({
        contentType: 'application/json',
        data: JSON.stringify(jsonData),
        dataType: 'json',
        success: function (data) {
            alert("You have successfully created a new entry.");
        },
        error: function () {
            alert("The entry could not be saved.");
        },
        processData: false,
        type: 'POST',
        url: "http://localhost:9095/hh/API/v1/entries/create"
    });
    console.log(jsonData);


}

function loadHighLightData(data) {


    // Initiate the chart
    $('#container').highcharts('Map', {

        title: {
            text: 'Disorders by country'
        },

        legend: {
            title: {
                text: 'Mutations number',
                style: {
                    color: (Highcharts.theme && Highcharts.theme.textColor) || 'black'
                }
            }
        },

        mapNavigation: {
            enabled: true,
            buttonOptions: {
                verticalAlign: 'bottom'
            }
        },

        tooltip: {
            backgroundColor: 'none',
            borderWidth: 0,
            shadow: false,
            useHTML: true,
            padding: 0,
            pointFormat: '<span class="f32"><span class="flag {point.flag}"></span></span>'
                + ' {point.name}: <b>{point.value}</b>',
            positioner: function () {
                return { x: 0, y: 250 };
            }
        },

        colorAxis: {
            min: 1,
            max: 1000,
            type: 'logarithmic'
        },

        series: [
            {
                data: data,
                mapData: Highcharts.maps['custom/world'],
                joinBy: ['iso-a2', 'code'],
                name: 'Mutation count',
                states: {
                    hover: {
                        color: '#BADA55'
                    }
                }
            }
        ]
    });
}
function loadClusterData(data) {
    var mapData = Highcharts.geojson(Highcharts.maps['custom/world']);

    // Correct UK to GB in data
    $.each(data, function () {
        if (this.code === 'UK') {
            this.code = 'GB';
        }
    });

    $('#container').highcharts('Map', {
        chart: {
            borderWidth: 1
        },

        title: {
            text: 'Disorders by country'
        },

        subtitle: {
            text: 'Click to see more details'
        },

        legend: {
            enabled: false
        },

        mapNavigation: {
            enabled: true,
            buttonOptions: {
                verticalAlign: 'bottom'
            }
        },

        series: [
            {
                name: 'Countries',
                mapData: mapData,
                color: '#E0E0E0',
                enableMouseTracking: false
            },
            {
                type: 'mapbubble',
                mapData: mapData,
                name: 'Mutation count',
                joinBy: ['iso-a2', 'code'],
                data: data,
                minSize: 4,
                maxSize: '12%',
                tooltip: {
                    pointFormat: '{point.code}: {point.z} '
                }
            }
        ]
    });
}
