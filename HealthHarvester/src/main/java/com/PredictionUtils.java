package com;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Random;
//import weka.classifiers.Classifier;
//import weka.classifiers.Evaluation;
//import weka.classifiers.evaluation.NominalPrediction;
//import weka.classifiers.trees.J48;
//import weka.core.FastVector;
//import weka.classifiers.meta.FilteredClassifier;
//import weka.core.Instances;
//import weka.filters.unsupervised.attribute.Remove;

/**
 * Created by silvana.albert on 5/24/15.
 */
public class PredictionUtils {
//    public static BufferedReader readDataFile(String filename) {
//        BufferedReader inputReader = null;
//
//        try {
//            inputReader = new BufferedReader(new FileReader(filename));
//        } catch (FileNotFoundException ex) {
//            System.err.println("File not found: " + filename);
//        }
//
//        return inputReader;
//    }
//    public static void main(String[] args) throws Exception {
//        BufferedReader datafile = readDataFile("/Users/silvana.albert/Desktop/itshappening/HealthHarvester/src/main/java/com/defectPrediction.arff");
//
//        Instances data = new Instances(datafile);
//        Random rand = new Random();
//        data.randomize(rand);
//        data.setClassIndex(data.numAttributes() - 1);
//
//        double percent = 66.0;
//
//        int trainSize = (int) Math.round(data.numInstances() * percent / 100);
//        int testSize = data.numInstances() - trainSize;
//        Instances train = new Instances(data, 0, trainSize);
//        Instances test = new Instances(data, trainSize, testSize);
//
//        String summary = train.toSummaryString();
//        int number_test_samples = test.numInstances();
//        int number_train_samples = train.numInstances();
//        int number_attributes_per_sample = train.numAttributes();
//
//        System.out.println("Number of attributes in model = " + number_attributes_per_sample);
//        System.out.println("Number of test samples = " + number_test_samples);
//        System.out.println("Number of train samples = " + number_train_samples);
//
//        System.out.println();
//
//        System.out.println("Summary: " + summary);
//
//        System.out.println();
//
//        J48 C45Tree = new J48();
//
//        Remove removeFirstAttribute = new Remove();
//        removeFirstAttribute.setAttributeIndices("1");
//
//        FilteredClassifier filteredClassifier = new FilteredClassifier();
//        filteredClassifier.setFilter(removeFirstAttribute);
//        filteredClassifier.setClassifier(C45Tree);
//        filteredClassifier.buildClassifier(train);
//
//        for (int i = 0; i < test.numInstances(); i++) {
//            double pred = filteredClassifier.classifyInstance(test.instance(i));
//            System.out.print("Given value: " + test.classAttribute().value((int) test.instance(i).classValue()));
//            System.out.println(". Predicted value: " + test.classAttribute().value((int) pred));
//
//        }
//
//        FastVector predictions = new FastVector();
//        Evaluation validation = classify(C45Tree, train, test);
//        predictions.appendElements(validation.predictions());
//        double accuracy = calculateAccuracy(predictions);
//
//        System.out.println();
//        System.out.println("Accuracy of C4.5 Decision Tree: " + String.format("%.2f%%", accuracy) + "\n---------------------------------");
//
//    }
//
//    public static Evaluation classify(Classifier model, Instances trainingSet, Instances testingSet) throws Exception {
//        Evaluation evaluation = new Evaluation(trainingSet);
//
//        model.buildClassifier(trainingSet);
//        evaluation.evaluateModel(model, testingSet);
//
//        return evaluation;
//    }
//
//    public static double calculateAccuracy(FastVector predictions) {
//        double correct = 0;
//        for (int i = 0; i < predictions.size(); i++) {
//            NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
//            if (np.predicted() == np.actual()) {
//                correct++;
//            }
//        }
//
//        return 100 * correct / predictions.size();
//    }
}
