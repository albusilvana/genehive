
    function insertProfesionalExposure() {
        var exposures = "Arsenic,Asbestos,Asphalt fumes,Benzene,Beryllium,1-Bromopropane,13-Butadiene,Cadmium,Chromium,Diacetyl,Diesel exhaust,Ethylene oxide,Formaldehyde,Hexavalent chromium,Hydrogen sulfide,Isocyanates,Lead,Mercury,Metals toxic,Metalworking fluids,Methylene chloride,SilicaCrystalline,Solvents,Synthetic mineral fibers,Toluene".split(",");
        for (var i = 0; i < exposures.length; i++) {
            $("#profestionalExposure").append($("<option />").val(exposures[i]).text(exposures[i]));
            $("#profestionalExposure1").append($("<option />").val(exposures[i]).text(exposures[i]));

        }
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
            loadClusterData('http://localhost:9095/hh/API/v1/entries/count/all?token='+localStorage.getItem("token"));
        } else {
            loadHighLightData('http://localhost:9095/hh/API/v1/entries/count/enhanced/all?token='+localStorage.getItem("token"));
        }
        $("#all").addClass("selected");
        $("#women").removeClass("selected");
        $("#men").removeClass("selected");
    }
    function refreshWithMen() {

        $("#all").removeClass("selected");
        $("#women").removeClass("selected");
        $("#men").addClass("selected");

        var selectedVal = $('input[name=mapType]:checked').val();
        if (selectedVal == "cluster") {
            loadClusterData('http://localhost:9095/hh/API/v1/entries/count/byGender?gender=M&token='+localStorage.getItem("token"));
        } else {
            loadHighLightData('http://localhost:9095/hh/API/v1/entries/count/enhanced/byGender?gender=M&token='+localStorage.getItem("token"));
        }

    }
    function refreshWithWomen() {

        $("#all").removeClass("selected");
        $("#women").addClass("selected");
        $("#men").removeClass("selected");

        var selectedVal = $('input[name=mapType]:checked').val();
        if (selectedVal == "cluster") {
            loadClusterData('http://localhost:9095/hh/API/v1/entries/count/byGender?gender=F&token='+localStorage.getItem("token"));
        } else {
            loadHighLightData('http://localhost:9095/hh/API/v1/entries/count/enhanced/byGender?gender=F&token='+localStorage.getItem("token"));
        }

    }
    function saveEntry() {

    }

    $(document).ready(function () {
        if(!localStorage.getItem("isUserLoggedIn")){
            localStorage.setItem("errorMessage", "You have to log in in order to access this page.");
            window.location = "http://localhost:9095/hh/login.html";
        }
        showHome();
        $.ajax({
            url: "http://localhost:9095/hh/API/v1/entries/total/all?token=dsf"
        }).then(function(data) {
            $("#currentEntriesCount").append(data);
        });
        insertProfesionalExposure();
        refreshWithAll();
    });
    function loadHighLightData(url) {

        $.getJSON(url, function (data) {
            $.each(data, function () {
                this.flag = this.code.replace('UK', 'GB').toLowerCase();
            });

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
        })
    }
    function loadClusterData(url) {

        $.getJSON(url, function (data) {

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

        });
    }


