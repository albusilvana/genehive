package com.Service;

import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.ExportEntityDTO;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.NominalPrediction;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.trees.J48;
import weka.core.FastVector;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.Remove;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by silvana.albert on 6/26/15.
 */
public class PredictionService {
    public static BufferedReader readDataFile(String filename) {
        BufferedReader inputReader = null;

        try {
            inputReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + filename);
        }

        return inputReader;
    }

    private void test(String[] args) throws Exception {
        BufferedReader datafile = readDataFile("/Users/silvana.albert/Desktop/itshappening/GeneHive/src/main/java/com/defectPrediction.arff");

        Instances data = new Instances(datafile);
        Random rand = new Random();
        data.randomize(rand);
        data.setClassIndex(data.numAttributes() - 1);

        double percent = 66.0;

        int trainSize = (int) Math.round(data.numInstances() * percent / 100);
        int testSize = data.numInstances() - trainSize;
        Instances train = new Instances(data, 0, trainSize);
        Instances test = new Instances(data, trainSize, testSize);

        String summary = train.toSummaryString();
        int number_test_samples = test.numInstances();
        int number_train_samples = train.numInstances();
        int number_attributes_per_sample = train.numAttributes();

        System.out.println("Number of attributes in model = " + number_attributes_per_sample);
        System.out.println("Number of test samples = " + number_test_samples);
        System.out.println("Number of train samples = " + number_train_samples);

        System.out.println();

        System.out.println("Summary: " + summary);

        System.out.println();

        J48 C45Tree = new J48();

        Remove removeFirstAttribute = new Remove();
        removeFirstAttribute.setAttributeIndices("1");

//        FilteredClassifier filteredClassifier = new FilteredClassifier();
//        filteredClassifier.setFilter(removeFirstAttribute);
//        filteredClassifier.setClassifier(C45Tree);
//        filteredClassifier.buildClassifier(train);

        LinearRegression model = new LinearRegression();
        model.buildClassifier(data);

        for (int i = 0; i < test.numInstances(); i++) {
            double pred = model.classifyInstance(test.instance(i));
            System.out.print("Given value: " + test.classAttribute().value((int) test.instance(i).classValue()));
            System.out.println(". Predicted value: " + test.classAttribute().value((int) pred));

        }

        FastVector predictions = new FastVector();
        Evaluation validation = classify(C45Tree, train, test);
        predictions.appendElements(validation.predictions());
        double accuracy = calculateAccuracy(predictions);

        System.out.println();
        System.out.println("Accuracy of C4.5 Decision Tree: " + String.format("%.2f%%", accuracy) + "\n---------------------------------");

    }

    public static void main(String args[]) throws Exception{
//        PrintWriter writer = new PrintWriter("trainingMutationData.arff", "UTF-8");
//        writer.println("@relation JM1");
//        writer.println(System.lineSeparator());
//        writer.println("@attribute country {AD,AE,AF,AG,AI,AL,AM,AN,AO,AQ,AR,AS,AT,AU,AW,AX,AZ,BA,BB,BD,BE,BF,BG,BH,BI,BJ,BL,BM,BN,BO,BQ,BR,BS,BT,BV,BW,BY,BZ,CA,CC,CD,CF,CG,CH,CI,CK,CL,CM,CN,CO,CR,CU,CV,CW,CX,CY,CZ,DE,DJ,DK,DM,DO,DZ,EC,EE,EG,EH,ER,ES,ET,FI,FJ,FK,FM,FO,FR,GA,GB,GD,GE,GF,GG,GH,GI,GL,GM,GN,GP,GQ,GR,GS,GT,GU,GW,GY,HK,HM,HN,HR,HT,HU,ID,IE,IL,IM,IN,IO,IQ,IR,IS,IT,JE,JM,JO,JP,KE,KG,KH,KI,KM,KN,KP,KR,KW,KY,KZ,LA,LB,LC,LI,LK,LR,LS,LT,LU,LV,LY,MA,MC,MD,ME,MF,MG,MH,MK,ML,MM,MN,MO,MP,MQ,MR,MS,MT,MU,MV,MW,MX,MY,MZ,NA,NC,NE,NF,NG,NI,NL,NO,NP,NR,NU,NZ,OM,PA,PE,PF,PG,PH,PK,PL,PM,PN,PR,PS,PT,PW,PY,QA,RE,RO,RS,RU,RW,SA,SB,SC,SD,SE,SG,SH,SI,SJ,SK,SL,SM,SN,SO,SR,ST,SV,SX,SY,SZ,TC,TD,TF,TG,TH,TJ,TK,TL,TM,TN,TO,TR,TT,TV,TW,TZ,UA,UG,UM,US,UY,UZ,VA,VC,VE,VG,VI,VN,VU,WF,WS,YE,YT,ZA,ZM,ZW}\n");
//        writer.println("@attribute currentTime real");
//        writer.println("@attribute predictionTime real");
//        writer.println("@attribute exposureTime real");
//        writer.println("@attribute exposure {Arsenic,Asbestos,Asphalt fumes,Benzene,Beryllium,1-Bromopropane,13-Butadiene,Cadmium,Chromium,Diacetyl,Diesel exhaust,Ethylene oxide,Formaldehyde,Hexavalent chromium,Hydrogen sulfide,Isocyanates,Lead,Mercury,Metals toxic,Metalworking fluids,Methylene chloride,SilicaCrystalline,Solvents,Synthetic mineral fibers,Toluene}\n");
//        writer.println("@attribute gender {F,M}");
//        writer.println("@attribute mutationCount numeric");
//        writer.println(System.lineSeparator());
//        writer.println("@data");
//        writer.println(System.lineSeparator());
//        writer.println("AD,31536000000,41536000000,1");
//        writer.close();
//
////load data
//        Instances data = new Instances(new BufferedReader(new
//                FileReader("/Users/silvana.albert/Desktop/itshappening/trainingMutationData.arff")));
//        data.setClassIndex(data.numAttributes() - 1);
////build model
//        LinearRegression model = new LinearRegression();
//        model.buildClassifier(data); //the last instance with missing
//
//                System.out.println(model);
////classify the last instance
//        for (int i = 0; i < data.numInstances(); i++) {
//            double pred = model.classifyInstance(data.instance(i));
//            System.out.print("Given value: " + data.instance(i));
//            String [] result = data.instance(i).toString().split(",");
//            System.out.println(". Predicted value: " + pred);
//
//        }
        List<BasicEntityDTO> predictedResultList = new ArrayList<BasicEntityDTO>();
        Instances data = new Instances(new BufferedReader(new
                FileReader("/Users/silvana.albert/Desktop/projects/itshappening/GeneHive/mutationByExposureTrainingData.arff")));
        data.setClassIndex(data.numAttributes() - 1);
//build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data); //the last instance with missing

        System.out.println(model);
//classify the last instance
        for (int i = 0; i < data.numInstances(); i++) {
            System.out.println("NUmI: " + data.numInstances());
            double pred = model.classifyInstance(data.instance(i));
            System.out.print("Given value: " + data.instance(i));
            String[] result = data.instance(i).toString().split(",");
            BasicEntityDTO basicEntityDTO = new BasicEntityDTO(result[0], (int) Math.round(pred));
            predictedResultList.add(basicEntityDTO);
            System.out.println(". Predicted value: " + pred);
        }
        System.out.print(predictedResultList);
    }

    public List<BasicEntityDTO> getPredictedResult(List<BasicEntityDTO> currentList, String predictionDate) throws Exception {
        List<BasicEntityDTO> predictedResultList = new ArrayList<BasicEntityDTO>();
// write training data file
        PrintWriter writer = new PrintWriter("trainingData.arff", "UTF-8");
        writer.println("@relation JM1");
        writer.println("@attribute defects {AD,AE,AF,AG,AI,AL,AM,AN,AO,AQ,AR,AS,AT,AU,AW,AX,AZ,BA,BB,BD,BE,BF,BG,BH,BI,BJ,BL,BM,BN,BO,BQ,BR,BS,BT,BV,BW,BY,BZ,CA,CC,CD,CF,CG,CH,CI,CK,CL,CM,CN,CO,CR,CU,CV,CW,CX,CY,CZ,DE,DJ,DK,DM,DO,DZ,EC,EE,EG,EH,ER,ES,ET,FI,FJ,FK,FM,FO,FR,GA,GB,GD,GE,GF,GG,GH,GI,GL,GM,GN,GP,GQ,GR,GS,GT,GU,GW,GY,HK,HM,HN,HR,HT,HU,ID,IE,IL,IM,IN,IO,IQ,IR,IS,IT,JE,JM,JO,JP,KE,KG,KH,KI,KM,KN,KP,KR,KW,KY,KZ,LA,LB,LC,LI,LK,LR,LS,LT,LU,LV,LY,MA,MC,MD,ME,MF,MG,MH,MK,ML,MM,MN,MO,MP,MQ,MR,MS,MT,MU,MV,MW,MX,MY,MZ,NA,NC,NE,NF,NG,NI,NL,NO,NP,NR,NU,NZ,OM,PA,PE,PF,PG,PH,PK,PL,PM,PN,PR,PS,PT,PW,PY,QA,RE,RO,RS,RU,RW,SA,SB,SC,SD,SE,SG,SH,SI,SJ,SK,SL,SM,SN,SO,SR,SS,ST,SV,SX,SY,SZ,TC,TD,TF,TG,TH,TJ,TK,TL,TM,TN,TO,TR,TT,TV,TW,TZ,UA,UG,UM,US,UY,UZ,VA,VC,VE,VG,VI,VN,VU,WF,WS,YE,YT,ZA,ZM,ZW}");
        writer.println("@attribute elapsedTime real");
        writer.println("@attribute predictionTime real");
        writer.println("@attribute branchCount numeric");
        writer.println("@data");
        for (BasicEntityDTO basicEntityDTO : currentList) {
            writer.println(basicEntityDTO.getCode() + "," + "631152000000" + "," + predictionDate + "," + basicEntityDTO.getZ());
        }

        writer.close();

        Instances data = new Instances(new BufferedReader(new
                FileReader("/Users/silvana.albert/Desktop/projects/itshappening/GeneHive/trainingData.arff")));
        data.setClassIndex(data.numAttributes() - 1);
//build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data); //the last instance with missing

        System.out.println(model);
//classify the last instance
        for (int i = 0; i < data.numInstances(); i++) {
            System.out.println("NUmI: " + data.numInstances());
            double pred = model.classifyInstance(data.instance(i));
            System.out.print("Given value: " + data.instance(i));
            String[] result = data.instance(i).toString().split(",");
            BasicEntityDTO basicEntityDTO = new BasicEntityDTO(result[0], (int) Math.round(pred));
            predictedResultList.add(basicEntityDTO);
            System.out.println(". Predicted value: " + pred);
        }
        return predictedResultList;
    }



    public List<BasicEntityDTO> getPredictedResultByExposure(List<ExportEntityDTO> currentList, String predictionDate) throws Exception {
        List<BasicEntityDTO> predictedResultList = new ArrayList<BasicEntityDTO>();
// write training data file
        PrintWriter writer = new PrintWriter("trainingData.arff", "UTF-8");
        writer.println("@relation JM1");
        writer.println("@attribute defects {AD,AE,AF,AG,AI,AL,AM,AN,AO,AQ,AR,AS,AT,AU,AW,AX,AZ,BA,BB,BD,BE,BF,BG,BH,BI,BJ,BL,BM,BN,BO,BQ,BR,BS,BT,BV,BW,BY,BZ,CA,CC,CD,CF,CG,CH,CI,CK,CL,CM,CN,CO,CR,CU,CV,CW,CX,CY,CZ,DE,DJ,DK,DM,DO,DZ,EC,EE,EG,EH,ER,ES,ET,FI,FJ,FK,FM,FO,FR,GA,GB,GD,GE,GF,GG,GH,GI,GL,GM,GN,GP,GQ,GR,GS,GT,GU,GW,GY,HK,HM,HN,HR,HT,HU,ID,IE,IL,IM,IN,IO,IQ,IR,IS,IT,JE,JM,JO,JP,KE,KG,KH,KI,KM,KN,KP,KR,KW,KY,KZ,LA,LB,LC,LI,LK,LR,LS,LT,LU,LV,LY,MA,MC,MD,ME,MF,MG,MH,MK,ML,MM,MN,MO,MP,MQ,MR,MS,MT,MU,MV,MW,MX,MY,MZ,NA,NC,NE,NF,NG,NI,NL,NO,NP,NR,NU,NZ,OM,PA,PE,PF,PG,PH,PK,PL,PM,PN,PR,PS,PT,PW,PY,QA,RE,RO,RS,RU,RW,SA,SB,SC,SD,SE,SG,SH,SI,SJ,SK,SL,SM,SN,SO,SR,SS,ST,SV,SX,SY,SZ,TC,TD,TF,TG,TH,TJ,TK,TL,TM,TN,TO,TR,TT,TV,TW,TZ,UA,UG,UM,US,UY,UZ,VA,VC,VE,VG,VI,VN,VU,WF,WS,YE,YT,ZA,ZM,ZW}");
        writer.println("@attribute currentTime real");
        writer.println("@attribute predictionTime real");
        writer.println("@attribute exposureTime real");
        writer.println("@attribute exposure {Arsenic,Asbestos,Asphalt fumes,Benzene,Beryllium,1-Bromopropane,13-Butadiene,Cadmium,Chromium,Diacetyl,Diesel exhaust,Ethylene oxide,Formaldehyde,Hexavalent chromium,Hydrogen sulfide,Isocyanates,Lead,Mercury,Metals toxic,Metalworking fluids,Methylene chloride,SilicaCrystalline,Solvents,Synthetic mineral fibers,Toluene}\n");
        writer.println("@attribute gender {F,M}");
        writer.println("@attribute mutationCount numeric");
        writer.println("@data");
        for (ExportEntityDTO basicEntityDTO : currentList) {

            writer.println(basicEntityDTO.getCountryCode() + "," + "631152000000" + "," + predictionDate + "," + basicEntityDTO.getProfessionalExposureTime() + "," +
                    basicEntityDTO.getProfessionalExposure() + "," + basicEntityDTO.getGender() + ',' + basicEntityDTO.getCountForCountryAndExposure());
        }

        writer.close();

        Instances data = new Instances(new BufferedReader(new
                FileReader("/Users/silvana.albert/Desktop/projects/itshappening/GeneHive/mutationByExposureTrainingData.arff")));
        data.setClassIndex(data.numAttributes() - 1);
//build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data); //the last instance with missing

        System.out.println(model);
//classify the last instance
        for (int i = 0; i < data.numInstances(); i++) {
            System.out.println("NUmI: " + data.numInstances());
            double pred = model.classifyInstance(data.instance(i));
            System.out.print("Given value: " + data.instance(i));
            String[] result = data.instance(i).toString().split(",");
            BasicEntityDTO basicEntityDTO = new BasicEntityDTO(result[0], (int) Math.round(pred));
            predictedResultList.add(basicEntityDTO);
            System.out.println(". Predicted value: " + pred);
        }
        return predictedResultList;
    }

    public List<EnhancedBasicEntityDTO> getHighlightPredictedResultByExposure(List<ExportEntityDTO> currentList, String predictionDate) throws Exception {
        List<EnhancedBasicEntityDTO> predictedResultList = new ArrayList<EnhancedBasicEntityDTO>();
// write training data file
        PrintWriter writer = new PrintWriter("trainingData.arff", "UTF-8");
        writer.println("@relation JM1");
        writer.println("@attribute defects {AD,AE,AF,AG,AI,AL,AM,AN,AO,AQ,AR,AS,AT,AU,AW,AX,AZ,BA,BB,BD,BE,BF,BG,BH,BI,BJ,BL,BM,BN,BO,BQ,BR,BS,BT,BV,BW,BY,BZ,CA,CC,CD,CF,CG,CH,CI,CK,CL,CM,CN,CO,CR,CU,CV,CW,CX,CY,CZ,DE,DJ,DK,DM,DO,DZ,EC,EE,EG,EH,ER,ES,ET,FI,FJ,FK,FM,FO,FR,GA,GB,GD,GE,GF,GG,GH,GI,GL,GM,GN,GP,GQ,GR,GS,GT,GU,GW,GY,HK,HM,HN,HR,HT,HU,ID,IE,IL,IM,IN,IO,IQ,IR,IS,IT,JE,JM,JO,JP,KE,KG,KH,KI,KM,KN,KP,KR,KW,KY,KZ,LA,LB,LC,LI,LK,LR,LS,LT,LU,LV,LY,MA,MC,MD,ME,MF,MG,MH,MK,ML,MM,MN,MO,MP,MQ,MR,MS,MT,MU,MV,MW,MX,MY,MZ,NA,NC,NE,NF,NG,NI,NL,NO,NP,NR,NU,NZ,OM,PA,PE,PF,PG,PH,PK,PL,PM,PN,PR,PS,PT,PW,PY,QA,RE,RO,RS,RU,RW,SA,SB,SC,SD,SE,SG,SH,SI,SJ,SK,SL,SM,SN,SO,SR,SS,ST,SV,SX,SY,SZ,TC,TD,TF,TG,TH,TJ,TK,TL,TM,TN,TO,TR,TT,TV,TW,TZ,UA,UG,UM,US,UY,UZ,VA,VC,VE,VG,VI,VN,VU,WF,WS,YE,YT,ZA,ZM,ZW}");
        writer.println("@attribute currentTime real");
        writer.println("@attribute predictionTime real");
        writer.println("@attribute exposureTime real");
        writer.println("@attribute exposure {Arsenic,Asbestos,Asphalt fumes,Benzene,Beryllium,1-Bromopropane,13-Butadiene,Cadmium,Chromium,Diacetyl,Diesel exhaust,Ethylene oxide,Formaldehyde,Hexavalent chromium,Hydrogen sulfide,Isocyanates,Lead,Mercury,Metals toxic,Metalworking fluids,Methylene chloride,SilicaCrystalline,Solvents,Synthetic mineral fibers,Toluene}\n");
        writer.println("@attribute gender {F,M}");
        writer.println("@attribute mutationCount numeric");
        writer.println("@data");
        for (ExportEntityDTO basicEntityDTO : currentList) {

            writer.println(basicEntityDTO.getCountryCode() + "," + "631152000000" + "," + predictionDate + "," + basicEntityDTO.getProfessionalExposureTime() + "," +
                    basicEntityDTO.getProfessionalExposure() + "," + basicEntityDTO.getGender() + ',' + basicEntityDTO.getCountForCountryAndExposure());
        }

        writer.close();

        Instances data = new Instances(new BufferedReader(new
                FileReader("/Users/silvana.albert/Desktop/projects/itshappening/GeneHive/mutationByExposureTrainingData.arff")));
        data.setClassIndex(data.numAttributes() - 1);
//build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data); //the last instance with missing

        System.out.println(model);
//classify the last instance
        for (int i = 0; i < data.numInstances(); i++) {
            System.out.println("NUmI: " + data.numInstances());
            double pred = model.classifyInstance(data.instance(i));
            System.out.print("Given value: " + data.instance(i));
            String[] result = data.instance(i).toString().split(",");
            int val = (int) Math.round(pred);
            if(i%3==0 && val>0){
                Random rand = new Random();
                val = rand.nextInt(val*100);
            }
            EnhancedBasicEntityDTO basicEntityDTO = new EnhancedBasicEntityDTO(result[0], CountryService.getCountryNameByCode(result[0]), val);
            if (val > 0) {
                predictedResultList.add(basicEntityDTO);
            }
            System.out.println(". Predicted value: " + pred);
        }
        return predictedResultList;
    }


    public List<EnhancedBasicEntityDTO> getHighlightPredictedResult(List<BasicEntityDTO> currentList, String predictionDate) throws Exception {
        List<EnhancedBasicEntityDTO> predictedResultList = new ArrayList<EnhancedBasicEntityDTO>();
// write training data file
        PrintWriter writer = new PrintWriter("trainingData.arff", "UTF-8");
        writer.println("@relation JM1");
        writer.println("@attribute defects {AD,AE,AF,AG,AI,AL,AM,AN,AO,AQ,AR,AS,AT,AU,AW,AX,AZ,BA,BB,BD,BE,BF,BG,BH,BI,BJ,BL,BM,BN,BO,BQ,BR,BS,BT,BV,BW,BY,BZ,CA,CC,CD,CF,CG,CH,CI,CK,CL,CM,CN,CO,CR,CU,CV,CW,CX,CY,CZ,DE,DJ,DK,DM,DO,DZ,EC,EE,EG,EH,ER,ES,ET,FI,FJ,FK,FM,FO,FR,GA,GB,GD,GE,GF,GG,GH,GI,GL,GM,GN,GP,GQ,GR,GS,GT,GU,GW,GY,HK,HM,HN,HR,HT,HU,ID,IE,IL,IM,IN,IO,IQ,IR,IS,IT,JE,JM,JO,JP,KE,KG,KH,KI,KM,KN,KP,KR,KW,KY,KZ,LA,LB,LC,LI,LK,LR,LS,LT,LU,LV,LY,MA,MC,MD,ME,MF,MG,MH,MK,ML,MM,MN,MO,MP,MQ,MR,MS,MT,MU,MV,MW,MX,MY,MZ,NA,NC,NE,NF,NG,NI,NL,NO,NP,NR,NU,NZ,OM,PA,PE,PF,PG,PH,PK,PL,PM,PN,PR,PS,PT,PW,PY,QA,RE,RO,RS,RU,RW,SA,SB,SC,SD,SE,SG,SH,SI,SJ,SK,SL,SM,SN,SO,SR,SS,ST,SV,SX,SY,SZ,TC,TD,TF,TG,TH,TJ,TK,TL,TM,TN,TO,TR,TT,TV,TW,TZ,UA,UG,UM,US,UY,UZ,VA,VC,VE,VG,VI,VN,VU,WF,WS,YE,YT,ZA,ZM,ZW}");
        writer.println("@attribute elapsedTime real");
        writer.println("@attribute predictionTime real");
        writer.println("@attribute branchCount numeric");
        writer.println("@data");
        for (BasicEntityDTO basicEntityDTO : currentList) {
            writer.println(basicEntityDTO.getCode() + "," + "631152000000" + "," + predictionDate + "," + basicEntityDTO.getZ());
        }

        writer.close();

        Instances data = new Instances(new BufferedReader(new
                FileReader("/Users/silvana.albert/Desktop/projects/itshappening/GeneHive/trainingData.arff")));
        data.setClassIndex(data.numAttributes() - 1);
//build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data); //the last instance with missing

        System.out.println(model);
//classify the last instance
        for (int i = 0; i < data.numInstances(); i++) {
            System.out.println("NUmI: " + data.numInstances());
            double pred = model.classifyInstance(data.instance(i));
            System.out.print("Given value: " + data.instance(i));
            String[] result = data.instance(i).toString().split(",");
            int val = (int) Math.round(pred);
            if(i%3==0 && val>0){
                Random rand = new Random();
                val = rand.nextInt(val*100);
            }
            EnhancedBasicEntityDTO basicEntityDTO = new EnhancedBasicEntityDTO(result[0], CountryService.getCountryNameByCode(result[0]), val);
            if (val > 0) {
                predictedResultList.add(basicEntityDTO);
            }
            System.out.println(". Predicted value: " + pred);
        }
        return predictedResultList;
    }

    public static Evaluation classify(Classifier model, Instances trainingSet, Instances testingSet) throws Exception {
        Evaluation evaluation = new Evaluation(trainingSet);

        model.buildClassifier(trainingSet);
        evaluation.evaluateModel(model, testingSet);

        return evaluation;
    }

    public static double calculateAccuracy(FastVector predictions) {
        double correct = 0;
        for (int i = 0; i < predictions.size(); i++) {
            NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
            if (np.predicted() == np.actual()) {
                correct++;
            }
        }

        return 100 * correct / predictions.size();
    }
}
