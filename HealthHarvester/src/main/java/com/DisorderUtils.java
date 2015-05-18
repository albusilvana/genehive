package com;

/**
 * Created by silvana.albert on 5/18/15.
 */
public class DisorderUtils {
    private static String disprders = "Neuropathy,Arteritic Anterior Ischemic Optic Neuropathy,Non-Arteritic Anterior Ischemic Optic Neuropathy\n" +
            "Pancreatic Ductal Adenocarcinoma\n" +
            "Anisometropia Amblyopia\n" +
            "Alzheimers Disease,Alpha-2-Macroglobulin Deficiency,Senile Systemic Amyloidosis Show all 4\n" +
            "Nor Polyagglutination Syndrome Caffey Disease\n" +
            "Alopecia Areata 1 Alopecia\n" +
            "Alopecia Areata 2 Alopecia\n" +
            "Abdominal Aortic Aneurysm Aneurysm\n" +
            "Aortic Aneurysm,Familial Abdominal 2,Aneurysm Aortic Aneurysm\n" +
            "Aneurysm,Familial Abdominal 3 Aneurysm\n" +
            "Aortic Aneurysm,Familial Abdominal,4,Aneurysm Aortic Aneurysm\n" +
            "Achalasia-Addisonianism-Alacrima Syndrome,Achalasia,Triple-A Syndrome\n" +
            "Tracheal Cancer\n" +
            "Neutral Lipid Storage Disease,Lipid Storage Disease Ectropion\n" +
            "Huntingtons Disease\n" +
            "Keratoderma,Palmoplantar,Punctate Type Ia,Keratoderma Palmoplantar Keratosis\n" +
            "Adenocarcinoma,Colon Adenocarcinoma Coronary Restenosis\n" +
            "Delayed Sleep Phase Syndrome,Adolescent Idiopathic Scoliosis,Pineocytoma\n" +
            "Charcot-Marie-Tooth Neuropathy Type 2N,Charcot-Marie-Tooth Disease,Axonal,Type 2N,Charcot-Marie-Tooth Neuropathy Type 2\n" +
            "Combined Oxidative Phosphorylation Deficiency 8,Leukoencephalopathy,Progressive,With Ovarian Failure Mitochondrial Cardiomyopathy\n" +
            "Peliosis Hepatis,Saccharopinuria,Breast Lymphoma\n" +
            "Asthma\n" +
            "Aortic Aneurysm,Familial Thoracic 1 Aneurysm\n" +
            "Aortic Aneurysm,Familial Thoracic 2,Aneurysm Aortic Aneurysm\n" +
            "Neuroblastoma\n" +
            "Herpes Simplex\n" +
            "Asphyxia Neonatorum,Homocarnosinosis,Gaba Aminotransferase Deficiency\n" +
            "Lewis-Sumner Syndrome,Familial Hdl Deficiency,Tangier Disease\n" +
            "Developmental Coordination Disorder Neuroma\n" +
            "Surfactant Metabolism Dysfunction,Pulmonary,3,Abca3-Related Pulmonary Surfactant Metabolism Dysfunction,Surfactant Dysfunction\n" +
            "Retinitis Pigmentosa 19,Cone-Rod Dystrophy 3,Scotoma\n" +
            "Gingival Fibromatosis With Hypertrichosis\n" +
            "Inflammatory Bowel Disease 13,Acute Non Lymphoblastic Leukemia,Paralytic Ileus\n" +
            "Cholestasis,Progressive Familial Intrahepatic 2,Benign Recurrent Intrahepatic Cholestasis 2,Abcb11-Related Intrahepatic Cholestasis\n" +
            "Congenital Syphilis,X-Linked Sideroblastic Anemia With Ataxia,Alcohol Abuse\n" +
            "Intraocular Retinoblastoma,Dubin-Johnson Syndrome,Microsporidiosis\n" +
            "Dubin-Johnson Syndrome\n" +
            "Dubin-Johnson Syndrome,Dysembryoplastic Neuroepithelial Tumor,Fallopian Tube Cancer\n" +
            "Cholangiolocellular Carcinoma,Dubin-Johnson Syndrome,Extrahepatic Cholestasis Show all 4\n" +
            "Lung Cancer\n" +
            "Acute Lymphoblastic Leukemia,Lymphoblastic Leukemia Dysembryoplastic Neuroepithelial Tumor\n" +
            "Leucine-Sensitive Hypoglycemia Of Infancy,Neonatal Diabetes Mellitus,Familial Hyperinsulinism\n" +
            "Atrial Fibrillation,Familial,12,Coronary Artery Vasospasm,Cantu Syndrome\n" +
            "Adrenoleukodystrophy,Spinocerebellar Degeneration,Addisons Disease\n" +
            "Peroxisomal Disease\n" +
            "Zellweger Syndrome,Peroxisomal Disease Adrenoleukodystrophy\n" +
            "Methylmalonic Aciduria And Homocystinuria,Cblj Type,Cbij,Disorders Of Intracellular Cobalamin Metabolism\n" +
            "Cystic Fibrosis\n" +
            "Tangier Disease,Sitosterolemia Autosomal Recessive Nonsyndromic Deafness\n" +
            "Breast Cancer,Nonpapillary Renal Cell Carcinoma,Choriocarcinoma\n" +
            "Aortic Atherosclerosis,Sitosterolemia,Hypercholesterolemia Show all 4\n" +
            "Williams-Beuren Syndrome\n" +
            "Polyneuropathy,Hearing Loss,Ataxia,Retinitis Pigmentosa,And Cataract,Polyneuropathy,Usher Syndrome Type 3 Show all 4\n" +
            "Neutral Lipid Storage Disease,Lipid Storage Disease Systemic Primary Carnitine Deficiency Disease\n" +
            "Acute Myeloid Leukemia,Breast Cancer,Colon Cancer Show all 4\n" +
            "Leukemia,Philadelphia Chromosome-Positive,Resistant To Imatinib,Chronic Myeloid Leukemia,Precursor T-Cell Acute Lymphoblastic Leukemia\n" +
            "Leukemia,Acute Myeloid,With Eosinophilia Leukemia\n" +
            "Blood Group Incompatibility Malaria\n" +
            "Enamel Erosion\n" +
            "Malaria\n" +
            "Roberts Syndrome,Spinocerebellar Ataxia Type 17 Neuronal Intranuclear Inclusion Disease\n" +
            "Hepatocellular Carcinoma\n" +
            "Obesity\n" +
            "Hiv-1\n" +
            "Crohns Disease,Multiple Sclerosis Psoriasis\n" +
            "Migraine\n" +
            "Parkinsons Disease\n" +
            "Gastric Cancer\n" +
            "Parkinsons Disease\n" +
            "Neutropenia\n" +
            "Alzheimers Disease Bipolar Disorder\n" +
            "Keratoconus\n" +
            "Rhizomelic Chondrodysplasia Punctata,Beta-Ketothiolase Deficiency,Thiolase Deficiency Show all 4\n" +
            "Akinetic Mutism,Ketothiolase Deficiency,Mutism Show all 4\n" +
            "Acetyl-Coa Carboxylase Deficiency,Multiple Carboxylase Deficiency Biotin Deficiency\n" +
            "Biotin Deficiency\n" +
            "Childhood Leukemia\n" +
            "Isobutyryl-Coa Dehydrogenase Deficiency\n" +
            "Acad9 Deficiency,Acyl-Coa Dehydrogenase 9 Deficiency Mitochondrial Complex I Deficiency\n" +
            "Lcad Deficiency,Fatty Acid Oxidation Disorders Hypoglycemia\n" +
            "Medium-Chain Acyl-Coenzyme A Dehydrogenase Deficiency,Fasting Hypoglycemia,Fatty Acid Oxidation Disorders\n" +
            "2-Methylbutyryl-Coa Dehydrogenase Deficiency Isovaleric Acidemia\n" +
            "Very Long-Chain Acyl-Coenzyme A Dehydrogenase Deficiency,Pericardial Effusion,Fatty Acid Oxidation Disorders\n" +
            "Spondyloepimetaphyseal Dysplasia,Aggrecan Type,Familial Osteochondritis Dissecans,Osteochondritis Dissecans\n" +
            "Lipid Metabolism Disorder,Thiolase Deficiency,Ketothiolase Deficiency\n" +
            "Acetyl Coa Acetyltransferase 2 Deficiency,Thiolase Deficiency,Beta-Ketothiolase Deficiency Show all 4\n" +
            "Mesangioproliferative Glomerulopathy,Microvascular Complications Of Diabetes 3,Neurosarcoidosis1\n" +
            "Neurogenic Hypertension,Tetanus Neonatorum,Hypertension\n" +
            "Farber Lipogranulomatosis Lipogranulomatosis\n" +
            "Farber Lipogranulomatosis Lipogranulomatosis\n" +
            "Partial Fetal Alcohol Syndrome,Fetal Alcohol Syndrome,Farber Lipogranulomatosis Show all 4\n" +
            "Velocardiofacial Syndrome Alzheimers Disease\n" +
            "Colonic Pseudo-Obstruction,Gastroschisis,Wernicke-Korsakoff Syndrome\n" +
            "Breast Adenomyoepithelioma\n" +
            "Papillary Thyroid Carcinoma\n" +
            "Acrocallosal Syndrome,Joubert Syndrome 12 Hydrolethalus Syndrome 2\n" +
            "Hyperferritinemia Cataract Syndrome,X-Linked Sideroblastic Anemia X-Linked Sideroblastic Anemia With Ataxia\n" +
            "Obesity\n" +
            "Larynx Verrucous Carcinoma Cutaneous Anthrax\n" +
            "Fatty Acid Oxidation Disorders Temporal Lobe Epilepsy\n" +
            "Mutism\n" +
            "Okamoto Syndrome,Bubonic Plague,Tuberculosis\n" +
            "Lysosomal Acid Phosphatase Deficiency\n" +
            "Spondyloenchondrodysplasia With Immune Dysregulation,Spondyloenchondrodysplasia,Pigmented Villonodular Synovitis\n" +
            "Atrioventricular Septal Defect\n" +
            "Prostate Cancer Testicular Cancer\n" +
            "Male Infertility Due To Acrosin Deficiency Globozoospermia\n" +
            "Appendix Adenocarcinoma\n" +
            "Acropectoral Syndrome\n" +
            "Acropectorovertebral Dysplasia F Form\n" +
            "Hordeolum\n" +
            "Combined Malonic And Methylmalonic Aciduria Methylmalonic Acidemia\n" +
            "Saethre-Chotzen Syndrome\n" +
            "Alport Syndrome - Intellectual Disability - Midface Hypoplasia - Elliptocytosis,Alport Syndrome,Mental Retardation,Midface Hypoplasia,And Elliptocytosis,Mental Retardation\n" +
            "Colorectal Cancer\n" +
            "Myelodysplastic Syndromes Acute Myeloid Leukemia,Adult\n" +
            "Essential Hypertension Hypertension\n" +
            "Fetal Alcohol Syndrome\n" +
            "Myopathy,Actin,Congenital,With Excess Of Thin Myofilaments,Nemaline Myopathy 3,Intranuclear Rod Myopathy\n" +
            "Multisystemic Smooth Muscle Dysfunction Syndrome,Aortic Aneurysm,Familial Thoracic 6,Moyamoya Disease 5\n" +
            "Juvenile-Onset Dystonia,Baraitser-Winter Syndrome 1,Baraitser-Winter Syndrome\n" +
            "Atrial Septal Defect 5,Left Ventricular Noncompaction 4,Disseminated Peritoneal Leiomyomatosis3\n" +
            "Visceral Myopathy,Megacystis Microcolon Intestinal Hypoperistalsis Syndrome,Myopathic Intestinal Pseudoobstruction Show all 4\n" +
            "Riley-Day Syndrome,Breast Cancer Susceptibility Hypertensive Nephropathy\n" +
            "Bleeding Disorder,Platelet-Type,15 Bleeding Disorder,Platelet-Type,16,Autosomal Dominant\n" +
            "Actn2-Related Familial Hypertrophic Cardiomyopathy,Cardiomyopathy,Dilated,1Aa,Actn2-Related Dilated Cardiomyopathy\n" +
            "Dystrophinopathies Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
            "Glomerulosclerosis,Focal Segmental Glomerulosclerosis,Nephrotic Syndrome Type 3\n" +
            "Wiskott-Aldrich Syndrome\n" +
            "Hiv-1\n" +
            "Fibrodysplasia Ossificans Progressiva Osteochondroma\n" +
            "Multiple Synostoses Syndrome\n" +
            "Aminoacylase 1 Deficiency,Syringomyelia,Systolic Heart Failure\n" +
            "Alzheimer Disease 12 Alzheimers Disease\n" +
            "Alzheimer Disease-13 Alzheimers Disease\n" +
            "Alzheimer Disease-14 Alzheimers Disease\n" +
            "Alzheimer Disease-15 Alzheimers Disease\n" +
            "Alzheimer Disease 16 Alzheimers Disease\n" +
            "Alzheimer Disease 17 Alzheimers Disease\n" +
            "Alzheimers Disease Alzheimer Disease Type 5\n" +
            "Alzheimers Disease Alzheimer Disease 6\n" +
            "Alzheimer Disease-7 Alzheimers Disease\n" +
            "Alzheimers Disease Alzheimer Disease 8\n" +
            "Listeria Meningitis,Cauda Equina Syndrome,Tuberculous Peritonitis\n" +
            "Epididymitis\n" +
            "Dowling-Degos Disease,Alzheimer Disease 18,Alzheimers Disease\n" +
            "Breast Cancer\n" +
            "Inflammatory Skin And Bowel Disease,Neonatal,1,Heterotaxy Dilated Cardiomyopathy\n" +
            "Adult T-Cell Leukemia\n" +
            "Asthma\n" +
            "Composite Lymphoma\n" +
            "Melanoma\n" +
            "Asthma\n" +
            "Type 2A Von Willebrand Disease\n" +
            "Weill-Marchesani-Like Syndrome Weill-Marchesani Syndrome\n" +
            "Microcornea,Myopic Chorioretinal Atrophy,And Telecanthus,Carotid Artery Occlusion Knobloch Syndrome\n" +
            "Ehlers-Danlos Syndrome Dermatosparaxis Type Anosognosia\n" +
            "Malaria,Quebec Platelet Disorder,Colonic Disease Show all 4\n" +
            "Colorectal Cancer\n" +
            "Ectopia Lentis Et Pupillae,Adamtsl4-Related Eye Disorders,Ectopia Lentis,Isolated Autosomal Recessive\n" +
            "Gastrointestinal Lymphoma\n" +
            "Klippel-Feil Syndrome\n" +
            "Adenoma,Deafness,Digenic,Gjb2/gjb3 Deafness,Autosomal Recessive 44\n" +
            "Hypercalciuria,Absorptive,Cholera,Albrights Hereditary Osteodystrophy\n" +
            "Adenoma Mccune Albright Syndrome\n" +
            "Thyroid Adenoma,Adenoma Precocious Puberty\n" +
            "Adenoma\n" +
            "Dyskinesia,Familial,With Facial Myokymia,Myokymia,Adenoma\n" +
            "Thyroid Adenoma,Adenoma,Precocious Puberty Show all 4\n" +
            "Adenoma,Thyroid Adenoma Precocious Puberty\n" +
            "Post-Traumatic Stress Disorder,Carpal Tunnel Syndrome,Sudden Infant Death Syndrome\n" +
            "Post-Traumatic Stress Disorder\n" +
            "Hypertension,Essential,Salt-Sensitive,Gastroschisis,Dehydrated Hereditary Stomatocytosis\n" +
            "Capillariasis,Hypertension,Exhibitionism\n" +
            "Hypertension,Dyscalculia,Cerebral Palsy,Spastic Quadriplegic,1\n" +
            "Albinism Deafness Syndrome\n" +
            "Alcohol Dependence Fetal Alcohol Syndrome\n" +
            "Hiv-1\n" +
            "Attention Deficit Hyperactivity Disorder\n" +
            "Attention Deficit Hyperactivity Disorder\n" +
            "Attention Deficit Hyperactivity Disorder\n" +
            "Acdc,Chronic Pulmonary Heart Disease,Adiponectin Deficiency\n" +
            "Insulin Resistance,Nonalcoholic Steatohepatitis Obesity\n" +
            "Insulin Resistance,Meconium Ileus In Cystic Fibrosis,Meconium Ileus Show all 4\n" +
            "Adiponectin,Serum Level Of,Qtl4 Systemic Lupus Erythematosus\n" +
            "Adiponectin,Serum Level Of,Qtl5]\n" +
            "Obesity\n" +
            "Hypermethioninemia Due To Adenosine Kinase Deficiency,Ischemia,Hypermethioninemia Show all 4\n" +
            "Nephrosclerosis,Malignant Hypertension,Choroid Plexus Carcinoma\n" +
            "Mental Retardation,Autosomal Dominant,28\n" +
            "Acute Encephalopathy With Biphasic Seizures And Late Reduced Diffusion,Ischemia,Parkinsons Disease\n" +
            "Priapism\n" +
            "Ischemia Brain Ischemia\n" +
            "Type 1 Diabetes Mellitus Monogenic Diabetes\n" +
            "Glycine N-Methyltransferase Deficiency,Malaria,Mucolipidosis Ii\n" +
            "Coronary Restenosis,Orthostatic Intolerance,Obesity\n" +
            "Aortic Coarctation,Chagas Disease,Neuroepithelioma\n" +
            "Status Asthmaticus,Asthma,Nocturnal,Beta-2-Adrenoreceptor Agonist,Reduced Response To\n" +
            "Obesity,Morbid Obesity,Insulin Resistance\n" +
            "Whim Syndrome\n" +
            "Adenylosuccinase Deficiency,Adenylosuccinate Lyase Deficiency,Lesch-Nyhan Syndrome\n" +
            "Relapsing Fever\n" +
            "Glioblastoma Gastroschisis\n" +
            "Imperforate Anus\n" +
            "Alopecia,Androgenetic,1\n" +
            "Nager Acrofacial Dysostosis\n" +
            "Leukemia,Acute Lymphoblastic 3,Acute Lymphoblastic Leukemia Chronic Neutrophilic Leukemia\n" +
            "Fibular Aplasia\n" +
            "Spinocerebellar Ataxia Type 28,Ataxia,Spastic,5,Autosomal Recessive,Spinocerebellar Ataxia Type28\n" +
            "Squamous Papillomatosis Trigonitis\n" +
            "Aspartylglucosaminuria,Lysosomal Storage Disease,Angiokeratoma\n" +
            "Alopecia,Androgenetic,2 Alopecia\n" +
            "Alopecia,Androgenetic,3\n" +
            "Diphyllobothriasis Anisakiasis\n" +
            "Corneal Dystrophy,Fuchs Endothelial,8 Corneal Dystrophy,Fuchs Endothelial,4\n" +
            "Diabetic Angiopathy,Noma,Obstructive Lung Disease\n" +
            "Klippel-Trenaunay Syndrome,Coats Disease Proteus Syndrome\n" +
            "Glycogen Storage Disease Iiib,Glycogen Storage Disease Iiia,Finger Agnosia\n" +
            "Agammaglobulinemia X-Linked Type 2\n" +
            "Lung Cancer\n" +
            "Agrn-Related Congenital Myasthenic Syndrome,Myasthenic Syndrome,Congenital,With Pre- And Postsynaptic Defects,Myasthenia,Limb-Girdle,Familial\n" +
            "Angio Serpiginosum\n" +
            "Renal Tubular Dysgenesis,Familial Hypertension,Pre-Eclampsia\n" +
            "Cardiovascular Disease Risk Factor,Renal Tubular Dysgenesis,Agtr1-Related,Essential Hypertension\n" +
            "Primary Hyperoxaluria\n" +
            "Hypermethioninemia,Purine Nucleoside Phosphorylase Deficiency,Adenosine Deaminase Deficiency Show all 4\n" +
            "Xia-Gibbs Syndrome\n" +
            "Joubert Syndrome With Ocular Anomalies,Joubert Syndrome And Related Disorders,Joubert Syndrome\n" +
            "Skeletal Muscle Regeneration\n" +
            "Obstructive Lung Disease,Myocardial Stunning,Angina Pectoris\n" +
            "Chronic Inflammatory Demyelinating Polyneuropathy,Demyelinating Polyneuropathy,Myocardial Infarction Susceptibility Show all 4\n" +
            "Combined Oxidative Phosphorylation Deficiency 6,Charcot-Marie-Tooth Disease Type X,Encephalomyopathy\n" +
            "Colon Cancer\n" +
            "Amebiasis\n" +
            "Amelogenesis Imperfecta,Type Ie,X-Linked 2\n" +
            "Oculocutaneous Albinism Type 4 Melanoma\n" +
            "Melanoma Skin Conditions\n" +
            "Stromal Keratitis,Leukodystrophy,Hypomyelinating 3,Fibrosarcoma\n" +
            "Leber Congenital Amaurosis 4,Aipl1-Related Leber Congenital Amaurosis,Aipl1-Related Retinitis Pigmentosa\n" +
            "Acute Insulin Response Hyperglycemia\n" +
            "Autoimmune Disease 2 Scoliosis,Idiopathic 2\n" +
            "Autoimmune Disease 3 Vitiligo\n" +
            "Autoimmune Disease 4\n" +
            "Autoimmune Thyroid Disease 1\n" +
            "Autoimmune Thyroid Disease 2\n" +
            "Hemolytic Anemia Due To Adenylate Kinase Deficiency,Hemolytic Anemia Nail-Patella Syndrome\n" +
            "Reticular Dysgenesis\n" +
            "Reticular Dysgenesis\n" +
            "Cardiac Conduction Defect\n" +
            "Osteosarcoma\n" +
            "Chronic Tic Disorder Tic Disorder\n" +
            "Ureterolithiasis Canavan Disease\n" +
            "Long Qt Syndrome 11 Long Qt Syndrome 1\n" +
            "Ethylene Glycol Poisoning,Methanol Poisoning,Alcohol-Related Birth Defect\n" +
            "Pulmonary Function\n" +
            "46Xy Sex Reversal 8,Obesity,Hyperphagia,And Developmental Delay,46Xy Sex Reversal 8,Modifier Of Show all 4\n" +
            "Urinary Schistosomiasis,Succinic Semialdehyde Dehydrogenase Deficiency,Intermediate Charcot-Marie-Tooth Neuropathy\n" +
            "Balanitis Xerotica Obliterans,Balanitis Thymic Hyperplasia\n" +
            "Sideroblastic Anemia Acquired,Pyridoxine-Responsive Sideroblastic Anemia,Sideroblastic Anemia\n" +
            "Aldh18A1-Related Cutis Laxa,Cutis Laxa,Autosomal Recessive,Type Iiia,Cutis Laxa,Autosomal Recessive,Type Iiib Show all 4\n" +
            "Erythroplakia Gallbladder Adenocarcinoma\n" +
            "Succinic Semialdehyde Dehydrogenase Deficiency\n" +
            "Alcoholic Neuropathy,Hangover,Alcohol Sensitivity,Acute\n" +
            "Folinic Acid-Responsive Seizures,Pyridoxine-Dependent Epilepsy Cortical Blindness\n" +
            "Fetal Alcohol Spectrum Disorder,Alcohol Dependence Hangover\n" +
            "Long Qt Syndrome,Acquired,Reduced,Long Qt Syndrome 2,Long Qt Syndrome 2,Acquired Show all 4\n" +
            "Congenital Disorder Of Glycosylation,Type Ip Congenital Disorder Of Glycosylation\n" +
            "Congenital Disorder Of Glycosylation Type Ii,Congenital Disorder Of Glycosylation Type 1I Myasthenia,Congenital,With Tubular Aggregates 1\n" +
            "Congenital Disorder Of Glycosylation Type 1C Protein-Losing Enteropathy\n" +
            "Congenital Disorder Of Glycosylation Type 1H\n" +
            "Congenital Disorder Of Glycosylation,Type Il,Bipolar Disorder,Congenital Disorder Of Glycosylation Type 1L Show all 4\n" +
            "Tracheal Lymphoma,Neuroblastoma 3,Alk-Related Neuroblastoma Susceptibility\n" +
            "Leukemia,Acute Lymphocytic 1\n" +
            "Leukemia,Acute Lymphoblastic 2\n" +
            "Atherosclerosis,Asthma,Diminished Response To Antileukotriene Treatment In,Paranasal Sinus Disease\n" +
            "Cerebrovascular Disease,Asthma,Osteoporosis\n" +
            "Soft Palate Cancer,Hypophosphatasia,Gastrointestinal System Disease Show all 4\n" +
            "Odontohypophosphatasia,Hypophosphatasia,Infantile,Hypophosphatasia\n" +
            "Alkaline Phosphatase,Plasma Level Of,Qtl 2\n" +
            "Infantile-Onset Ascending Hereditary Spastic Paralysis,Als2-Related Disorders,Juvenile Primary Lateral Sclerosis\n" +
            "Blepharitis\n" +
            "Amyotrophic Lateral Sclerosis Type 3\n" +
            "Amyotrophic Lateral Sclerosis 5,Juvenile Recessive\n" +
            "Frontonasal Dysplasia 1,Basal Encephalocele,Encephalocele\n" +
            "Arthrogryposis Multiplex Congenita Neurogenic Type\n" +
            "Dental Pulp Necrosis,Dental Fluorosis Turner Syndrome\n" +
            "Osteopathia Striata Cranial Sclerosis Wilms Tumor\n" +
            "Breast And Colorectal Cancer\n" +
            "Gastric Adenocarcinoma,Adenocarcinoma,Spondylolisthesis Show all 4\n" +
            "Acute Myeloid Leukemia\n" +
            "Alport Syndrome,Mental Retardation,Midface Hypoplasia,And Elliptocytosis\n" +
            "Methylmalonic Aciduria And Homocystinuria Type Cble,Methylmalonic Aciduria And Homocystinuria Type Cblg,Megaloblastic Anemia-1,Norwegian Type\n" +
            "Breast Cancer,Cystoid Macular Dystrophy,Retinitis Pigmentosa 9\n" +
            "Exstrophy Of The Bladder\n" +
            "Anal Canal Carcinoma\n" +
            "Angelman Syndrome Prader-Willi Syndrome\n" +
            "Pyogenic Granuloma,Chorioangioma,Twin-To-Twin Transfusion Syndrome\n" +
            "Abdominal Aortic Aneurysm\n" +
            "Aneurysm,Intracranial Berry,1 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,10 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,11 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,3 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,4 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,5 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,7 Aneurysm\n" +
            "Aneurysm,Intracranial Berry,8 Aneurysm\n" +
            "Congenital Anosmia\n" +
            "Hereditary Spherocytosis,8P11.2 Deletion Syndrome,Ank1-Related Spherocytosis Show all 4\n" +
            "Long Qt Syndrome 4,Cardiac Arrhythmia,Ankyrin-B-Related,Long Qt Syndrome 1\n" +
            "Mental Retardation,Autosomal Recessive,37 Plexiform Neurofibroma\n" +
            "Breast And Colorectal Cancer Colorectal Cancer\n" +
            "Cannabis Dependence\n" +
            "Craniometaphyseal Dysplasia,Autosomal Dominant,Chondrocalcinosis 2,Craniometaphyseal Dysplasia\n" +
            "Hiv-1\n" +
            "Heroin Dependence,Alexithymia,Dopamine Receptor D2,Reduced Brain Density Of\n" +
            "Scurvy,Pigmented Villonodular Synovitis Villonodular Synovitis\n" +
            "Breast Cancer\n" +
            "Oligoarticular Juvenile Arthritis Polyarticular Onset Juvenile Idiopathic Arthritis\n" +
            "Adjustment Disorder\n" +
            "Acute Lymphocytic Leukemia\n" +
            "Usher Syndrome Type I\n" +
            "Anisomastia\n" +
            "Small Intestinal Sarcoma Oral Cancer\n" +
            "Dystonia 24\n" +
            "Miyoshi Muscular Dystrophy 3,Ano5-Related Muscle Diseases,Gnathodiaphyseal Dysplasia\n" +
            "Anorexia Nervosa 1 Anorexia Nervosa\n" +
            "Microphthalmia Syndromic 4\n" +
            "Hyalinosis,Inherited Systemic,Inhalation Anthrax,Juvenile Hyaline Fibromatosis Show all 4\n" +
            "Multiple Myeloma\n" +
            "Pregnancy Loss,Recurrent 3,Pregnancy Loss,Barth Syndrome\n" +
            "Marasmus,Kwashiorkor Neonatal Lupus Erythematosus\n" +
            "Acute Promyelocytic Leukemia\n" +
            "Abdominal Obesity-Metabolic Syndrome 1 Obesity\n" +
            "Meningioma\n" +
            "Hypoactive Sexual Desire Disorder\n" +
            "Wolff-Parkinson-White Syndrome\n" +
            "Familial Hypocalciuric Hypercalcemia Type 3,Familial Hypocalciuric Hypercalcemia,Hypercalcemia Show all 4\n" +
            "Hermansky Pudlak Syndrome 2,Hermansky-Pudlak Syndrome 1,Platelet Storage Pool Deficiency Show all 4\n" +
            "Spastic Paraplegia 51,Cerebral Palsy Spastic Paraplegia 50,Autosomal Recessive\n" +
            "Hiv-1\n" +
            "Neuronal Intranuclear Inclusion Disease\n" +
            "Alzheimer Disease Type 2 Alzheimers Disease\n" +
            "Apc-Associated Polyposis Conditions,Fourth Cranial Nerve Palsy,Cranial Nerve Palsy\n" +
            "Hypotrichosis 1,Hypotrichosis Simplex,Hypotrichosis\n" +
            "Neuroblastoma,Gastric Antral Vascular Ectasia Fanconis Anemia\n" +
            "Aortic Valve Stenosis Hiv-1\n" +
            "Alzheimers Disease\n" +
            "Alopecia Mental Retardation Syndrome 1\n" +
            "Alopecia Mental Retardation Syndrome 2\n" +
            "Alopecia-Mental Retardation Syndrome 3\n" +
            "Apo A-I Deficiency,Cerebral Atherosclerosis,Hypoalphalipoproteinemia\n" +
            "Apolipoprotein A-Ii Deficiency,Familial Renal Amyloidosis Due To Apolipoprotein Aii Variant,Familial Hyperlipidemia\n" +
            "Hypobetalipoproteinemia,Defective Apolipoprotein B-100,Apob-Related Familial Hypercholesterolemia,Autosomal Dominant\n" +
            "Pilocytic Astrocytoma,Male Breast Cancer,Ganglioglioma" +
            "Subacute Delirium,Splenic Infarction,Chronic Graft Versus Host Disease5\n" +
            "Phencyclidine Abuse,Sleeping Sickness,Trypanosomiasis\n" +
            "Schizophrenia\n" +
            "Schizophrenia\n" +
            "Rectal Neoplasm,Anus Disease,Anus Cancer\n" +
            "Limb Ischemia,Critical Limb Ischemia Type 2 Diabetes Mellitus\n" +
            "Cytochrome-C Oxidase Deficiency Disease\n" +
            "Hereditary Cerebral Amyloid Angiopathy,Central Nervous System Vasculitis,Myositis\n" +
            "Breast Cancer\n" +
            "Exophthalmos\n" +
            "Phelan-Mcdermid Syndrome\n" +
            "Dihydroxyadeninuria,Adenine Phosphoribosyltransferase Deficiency,Lesch-Nyhan Syndrome\n" +
            "Ataxia With Oculomotor Apraxia Type 1,Apraxia,Aptx-Related Coenzyme Q10 Deficiency\n" +
            "Polyhydramnios,Priapism,Dysferlinopathy\n" +
            "Posterior Polar Cataract\n" +
            "Congenital Hydronephrosis,Hydronephrosis,Nephrogenic Diabetes Insipidus,Autosomal\n" +
            "Urinary Tract Obstruction,Ureteral Disease,Collecting Duct Carcinoma\n" +
            "Acute Transverse Myelitis,Idiopathic Acute Transverse Myelitis,Neuromyelitis Optica Spectrum Disorder\n" +
            "Dry Eye Syndrome,Wrinkles,Diffuse Palmoplantar Keratoderma,Bothnian Type\n" +
            "Menieres Disease\n" +
            "Menieres Disease,Endolymphatic Hydrops,Morbid Obesity\n" +
            "Polyhydramnios Oligohydramnios\n" +
            "Hydrarthrosis,Morbid Obesity Polyhydramnios\n" +
            "Laryngitis\n" +
            "Spermatogenesis Arrest,Isolated Micropenis,Gastric Neuroendocrine Neoplasm\n" +
            "Mycobacterium Marinum\n" +
            "Loiasis Urinary Schistosomiasis\n" +
            "Myoclonus,Familial Cortical Idiopathic Generalized Epilepsy\n" +
            "Ichthyosis,Congenital,Autosomal Recessive 7\n" +
            "Ichthyosis,Congenital,Autosomal Recessive 9\n" +
            "Prostate Cancer,Pancreatic Cancer,Ovarian Cystadenoma\n" +
            "Prostate Cancer Breast Adenocarcinoma\n" +
            "Rheumatic Myocarditis Cholera\n" +
            "Hiv-1\n" +
            "Distal Hereditary Motor Neuropathy,Type Ii,Cholera Platelet Storage Pool Deficiency\n" +
            "Cholera\n" +
            "Cholera\n" +
            "Familial Infantile Myoclonic Epilepsy Cholera\n" +
            "Periventricular Heterotopia With Microcephaly,Periventricular Heterotopia,Autosomal Recessive,Periventricular Nodular Heterotopia Show all 4\n" +
            "Wiskott-Aldrich Syndrome\n" +
            "Hyperargininemia,Recessive Dystrophic Epidermolysis Bullosa,Quadriplegia\n" +
            "Hyperargininemia\n" +
            "Liver Cancer Noma\n" +
            "Syringomyelia\n" +
            "Salivary Gland Tumor\n" +
            "Familial Idiopathic Steroid-Resistant Nephrotic Syndrome With Focal Segmental Hyalinosis\n" +
            "Juvenile Myelomonocytic Leukemia Alpha Thalassemia\n" +
            "Adams-Oliver Syndrome 1,Oliver Syndrome Aplasia Cutis Congenita\n" +
            "Schizotypal Personality Disorder\n" +
            "Noma\n" +
            "L1 Syndrome\n" +
            "Microphthalmia With Linear Skin Defects Syndrome\n" +
            "Nephrotic Syndrome,Type 8,Nephrotic Syndrome Type 3,Familial Idiopathic Steroid-Resistant Nephrotic Syndrome With Diffuse Mesangial Sclerosis Show all 4\n" +
            "Skin Lipoma\n" +
            "Slowed Nerve Conduction Velocity,Ad\n" +
            "Acute Myeloid Leukemia,Leukemia Shwachman-Diamond Syndrome\n" +
            "Neuroblastoma\n" +
            "Blepharitis\n" +
            "Osteoporosis\n" +
            "Mental Retardation,X-Linked 29 And Others,Mental Retardation Borjeson-Forssman-Lehmann Syndrome\n" +
            "Borjeson-Forssman-Lehmann Syndrome\n" +
            "Epileptic Encephalopathy,Early Infantile,8,Arhgef9-Related Hyperekplexia Hyperekplexia\n" +
            "Age-Related Hearing Impairment 1\n" +
            "Age-Related Hearing Impairment 2\n" +
            "Mental Retardation,Autosomal Dominant 14,Coffin-Siris Syndrome,Ovarian Clear Cell Carcinoma\n" +
            "Mental Retardation,Autosomal Dominant 12,Arid1B-Related Coffin-Siris Syndrome,Chromosome 6Q25 Microdeletion Syndrome\n" +
            "Imperforate Anus Intestinal Atresia\n" +
            "Retinoblastoma\n" +
            "Breast Cancer Retinoblastoma\n" +
            "Alcohol Dependence\n" +
            "Acute Lymphoblastic Leukemia Lymphoblastic Leukemia\n" +
            "Cholera\n" +
            "Familial Colorectal Cancer,Chronic Lymphocytic Leukemia,Dysplastic Nevus Syndrome\n" +
            "Joubert Syndrome 8,Arl13B-Related Joubert Syndrome,Asphyxiating Thoracic Dystrophy\n" +
            "Primary Biliary Cirrhosis\n" +
            "Familial Breast Cancer\n" +
            "Retinitis Pigmentosa 2 Retinitis Pigmentosa\n" +
            "Retinitis Pigmentosa With Or Without Situs Inversus,Retinitis Pigmentosa 2,Retinitis Pigmentosa 66\n" +
            "Retinitis Pigmentosa 2 Retinitis Pigmentosa\n" +
            "Bardet-Biedl Syndrome\n" +
            "Prostate Carcinoma In Situ Liver Cancer\n" +
            "Bardet-Biedl Syndrome 3,Retinitis Pigmentosa 55,Bardet-Biedl Syndrome\n" +
            "Spastic Paraplegia 61,Autosomal Recessive\n" +
            "Cloacogenic Carcinoma Hepatocellular Carcinoma\n" +
            "Ciliary Dyskinesia,Primary,23 Ciliary Dyskinesia,Primary,11\n" +
            "Acth-Independent Macronodular Adrenal Hyperplasia 2 Acth-Independent Macronodular Adrenal Hyperplasia\n" +
            "Melanoma Mucopolysaccharidosis Iii\n" +
            "Multifocal Choroiditis,Choroiditis,Age-Related Macular Degeneration 8\n" +
            "Acute Myeloid Leukemia Hypoxia\n" +
            "Webb-Dattani Syndrome Hypoxia\n" +
            "Hypoxia\n" +
            "Shigellosis\n" +
            "Retinal Vasculitis Rheumatic Disease\n" +
            "Whim Syndrome\n" +
            "Whim Syndrome\n" +
            "Cerebral Lipidosis,Central Nervous System Cancer,Nervous System Cancer\n" +
            "Mucopolysaccharidosis Vi,Mucopolysaccharidosis Type 6,Slowly Progressing,Mucopolysaccharidosis Type 6,Rapidly Progressing\n" +
            "Gastric Dilatation,Mucopolysaccharidosis Vi,Mucosulfatidosis Show all 4\n" +
            "Chondrodysplasia Punctata 1,X-Linked,Chondrodysplasia Punctata 1,X-Linked Recessive,Chondrodysplasia Punctata,X-Linked Recessive\n" +
            "Breast Cyst,Breast Fibroadenoma,Mucopolysaccharidosis Vi\n" +
            "Autosomal Recessive Spastic Paraplegia Type 66,Xerophthalmia Relapsing Fever\n" +
            "Pertussis,Cholera Squamous Cell Carcinoma Of The Head And Neck\n" +
            "Acute Chest Syndrome\n" +
            "Pancreatic Cancer,Non-Small Cell Lung Carcinoma,Hirschsprungs Disease Show all 4\n" +
            "Spinocerebellar Ataxia Type 10,Digeorge Syndrome,Cleft Palate\n" +
            "Arrhythmogenic Right Ventricular Dysplasia 3 Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
            "Arrhythmogenic Right Ventricular Dysplasia 4 Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
            "Arrhythmogenic Right Ventricular Dysplasia 6\n" +
            "X-Linked Lissencephaly With Ambiguous Genitalia,X-Linked Lissencephaly With Abnormal Genitalia,Hydranencephaly With Abnormal Genitalia\n" +
            "Spinal Muscular Atrophy With Progressive Myoclonic Epilepsy,Farber Lipogranulomatosis Lipogranulomatosis\n" +
            "Sphingolipidosis,Obstructive Jaundice,Farber Lipogranulomatosis\n" +
            "Cri-Du-Chat Syndrome\n" +
            "Liver Cancer\n" +
            "Glaucoma 1,Open Angle,F Open-Angle Glaucoma\n" +
            "Cat-Scratch Disease Junctional Epidermolysis Bullosa\n" +
            "Intrahepatic Cholangiocarcinoma\n" +
            "Mucopolysaccharidosis Vi Myeloid Leukemia\n" +
            "Barretts Esophagus,Barrett Esophagus/esophageal Adenocarcinoma Adenocarcinoma\n" +
            "Pulmonary Neuroendocrine Tumor,Differentiating Neuroblastoma,Congenital Central Hypoventilation Syndrome\n" +
            "Atrial Septal Defect 1\n" +
            "Anal Sphincter Dysplasia\n" +
            "Hepatitis B Hepatitis\n" +
            "Hepatitis B,Hepatitis Liver Cirrhosis\n" +
            "Hypoaldosteronism\n" +
            "Familial Melanoma,Obesity,Autoimmune Hepatitis Show all 4\n" +
            "Argininosuccinic Aciduria,Lysinuric Protein Intolerance,Hyperargininemia\n" +
            "Congenital Aphakia Anterior Segment Mesenchymal Dysgenesis\n" +
            "Pineocytoma Pineoblastoma\n" +
            "Patau Syndrome\n" +
            "Breast Adenoma\n" +
            "Asparagine Synthetase Deficiency\n" +
            "Ascaridiasis,Canavan Disease,Neurologic Diseases\n" +
            "Asperger Syndrome Susceptibility 1\n" +
            "Asperger Syndrome Susceptibility 2\n" +
            "Asperger Syndrome Susceptibility 3\n" +
            "Asperger Syndrome Susceptibility 4\n" +
            "Traboulsi Syndrome,Regular Astigmatism,Catecholaminergic Polymorphic Ventricular Tachycardia\n" +
            "Microcephaly,Primary Autosomal Recessive Microcephaly Type 5,Primary Autosomal Recessive Microcephalies And Seckel Syndrome Spectrum Disorders\n" +
            "Degenerative Disc Disease,Osteoarthritis,Back Pain Show all 4\n" +
            "Alveolar Soft Part Sarcoma,Sarcoma,Renal Cell Carcinoma Show all 4\n" +
            "Central Nervous System Leukemia\n" +
            "Asthma-Related Traits 3 Asthma\n" +
            "Asthma-Related Traits 4 Asthma\n" +
            "Asthma-Related Traits 6 Asthma\n" +
            "Asthma-Related Traits 8 Asthma\n" +
            "Citrullinemia Type I,Citrullinemia,Acute Neonatal Citrullinemia Type I\n" +
            "Systemic Lupus Erythematosus\n" +
            "Fatty Liver Disease\n" +
            "Hailey-Hailey Disease\n" +
            "Schizophrenia\n" +
            "Myelodysplastic Syndrome,Somatic,C-Like Syndrome,Myelodysplastic Syndromes\n" +
            "Bainbridge-Ropers Syndrome\n" +
            "Gonorrhea Genital Herpes\n" +
            "Cerebellar Ataxia,Cayman Type,Ataxia,Cerebellar Ataxia\n" +
            "Asphyxiating Thoracic Dystrophy\n" +
            "Vulvar Melanoma,Clear Cell Sarcoma,Fibrous Histiocytoma\n" +
            "Eccrine Porocarcinoma\n" +
            "Hypospadias\n" +
            "Coffin-Lowry Syndrome\n" +
            "Human T-Cell Leukemia Virus Type 1\n" +
            "Cystic Fibrosis Wolfram Syndrome\n" +
            "Atrial Fibrillation,Familial,1 Familial Atrial Fibrillation\n" +
            "Atrial Fibrillation,Familial,2 Familial Atrial Fibrillation\n" +
            "Atrial Fibrillation,Familial,5\n" +
            "Atrial Fibrillation,Familial,8\n" +
            "Human Granulocytic Anaplasmosis\n" +
            "Inflammatory Bowel Disease 10,Inflammatory Bowel Disease Crohns Disease\n" +
            "Dependent Personality Disorder\n" +
            "Non-Hodgkin Lymphoma\n" +
            "Atherosclerosis,Gestational Diabetes,Hypertriglyceridemia Show all 4\n" +
            "Aica-Ribosiduria Due To Atic Deficiency\n" +
            "Spastic Paraplegia 3,Spastic Paraplegia 3A,Spastic Paraplegia 3A,Autosomal Dominant\n" +
            "Spastic Paraplegia 3A Spastic Paraplegia 3\n" +
            "Neuropathy,Hereditary Sensory,Type If,Spastic Paraplegia 3A,Spastic Paraplegia 3 Show all 4\n" +
            "Chromosome 11Q Deletion,Ataxia Telangiectasia,Mantle Cell Lymphoma\n" +
            "Jugular Foramen Meningioma,Dentatorubral-Pallidoluysian Atrophy,Nodal-Related Visceral Heterotaxy\n" +
            "Dermatitis,Atopic 1\n" +
            "Dermatitis,Atopic 3,Atopic Dermatitis Dermatitis\n" +
            "Dermatitis,Atopic 5,Atopic Dermatitis Dermatitis\n" +
            "Dermatitis,Atopic 6,Atopic Dermatitis Dermatitis\n" +
            "Dermatitis,Atopic 7 Dermatitis\n" +
            "Goblet Cell Carcinoid,Cerebellar Liponeurocytoma Merkel Cell Carcinoma\n" +
            "Persistent Hyperplastic Primary Vitreous,Autosomal Recessive,Open-Angle Glaucoma Corneal Opacification And Other Ocular Anomalies\n" +
            "Angelman Syndrome\n" +
            "Idiopathic Pulmonary Fibrosis\n" +
            "Dyskinesia Of Esophagus,Gastric Outlet Obstruction,Hiatus Hernia\n" +
            "Ceroid Lipofuscinosis,Neuronal,12,Parkinson Disease Type 9,Parkinsons Disease Show all 4\n" +
            "Benign Epilepsy With Centrotemporal Spikes\n" +
            "Thyrotoxic Periodic Paralysis\n" +
            "Basilar Migraine,Familial Hemiplegic Migraine Type 2,Hemiplegia\n" +
            "Dystonia 12,Alternating Hemiplegia Of Childhood 2,Atp1A3-Related Alternating Hemiplegia Of Childhood\n" +
            "Thyrotoxic Periodic Paralysis Megalencephalic Leukoencephalopathy With Subcortical Cysts\n" +
            "X-Linked Juvenile Retinoschisis,Familial Hemiplegic Migraine Type 2,Hemiplegic Migraine\n" +
            "Thyrotoxic Periodic Paralysis\n" +
            "Brody Myopathy,Pseudomyotonia,Myotonic Dystrophy Type 1\n" +
            "Acrokeratosis Verruciformis,Mitral Valve Stenosis,Mongolian Spot\n" +
            "Hypertension\n" +
            "Deafness,Autosomal Recessive 12,Modifier Of\n" +
            "Spinocerebellar Ataxia,X-Linked 1,X-Linked Non Progressive Cerebellar Ataxia,Cerebellar Ataxia Show all 4\n" +
            "Hailey-Hailey Disease,Pemphigus Keratosis Follicularis\n" +
            "Hailey-Hailey Disease\n" +
            "Dyskinesia Of Esophagus,Gastric Outlet Obstruction,Hiatus Hernia\n" +
            "Mitochondrial Complex Deficiency,Nuclear Type 4,Combined Oxidative Phosphorylation Deficiency 22,Mitochondrial Complex V Deficiency,Nuclear Type 3 Show all 4\n" +
            "Adult Neuronal Ceroid Lipofuscinosis,Mitochondrial Complex V Deficiency,Renal Oncocytoma Show all 4\n" +
            "Spindle Cell Hemangioma\n" +
            "Spindle Cell Hemangioma\n" +
            "Smallpox\n" +
            "Spindle Cell Hemangioma\n" +
            "Body Dysmorphic Disorder\n" +
            "Smallpox\n" +
            "Autoimmune Polyglandular Syndrome Type 2,2-Hydroxyglutaric Aciduria D-2-Hydroxyglutaric Aciduria\n" +
            "Parkinsonism With Spasticity,X-Linked,Mental Retardation,X-Linked,Syndromic,Hedera Type,Spasticity Show all 4\n" +
            "Wrinkly Skin Syndrome,Atp6V0A2-Related Cutis Laxa,Osteopetrosis Show all 4\n" +
            "Renal Tubular Acidosis,Distal,Autosomal Recessive,Renal Tubular Acidosis With Progressive Nerve Deafness,Renal Tubular Acidosis,Distal\n" +
            "Cannabis Abuse\n" +
            "Osteopetrosis\n" +
            "Histoplasmosis\n" +
            "Renal Tubular Acidosis,Medullary Sponge Kidney,Renal Tubular Acidosis,Distal,Autosomal Recessive\n" +
            "Deafness Onychodystrophy Osteodystrophy And Mental Retardation Syndrome,Pigmented Villonodular Synovitis Villonodular Synovitis\n" +
            "Cat Eye Syndrome\n" +
            "Atopic Dermatitis Hepatitis C Virus\n" +
            "Atp7A-Related Copper Transport Disorders,Atp7A-Related Distal Motor Neuropathy,Occipital Horn Syndrome\n" +
            "Wilson Disease Menkes Disease\n" +
            "Cerebellar Ataxia,Mental Retardation,And Dysequilibrium Syndrome 4,Dysequilibrium Syndrome Cerebellar Hypoplasia And Mental Retardation With Or Without Quadrupedal Locomotion 1\n" +
            "Alzheimers Disease\n" +
            "Low Gamma-Gt Familial Intrahepatic Cholestasis,Benign Recurrent Intrahepatic Cholestasis,Intrahepatic Cholestasis\n" +
            "Mitochondrial Complex V Deficiency,Nuclear Type 3\n" +
            "Mitochondrial Complex V Deficiency,Nuclear Type 1,Mitochondrial Complex V Deficiency Mitochondrial Complex V Deficiency,Nuclear Type 3\n" +
            "Antiphospholipid Syndrome\n" +
            "Cutaneous Telangiectasia And Cancer Syndrome,Familial,Chronic Active Epstein-Barr Virus Infection,Seckel Syndrome Type 1\n" +
            "Prion Disease,Sporadic Breast Cancer,Ataxia Telangiectasia\n" +
            "Obesity Radioulnar Synostosis\n" +
            "Radioulnar Synostosis\n" +
            "Alpha-Thalassemia X-Linked Intellectual Disability Syndrome,Alpha-Thalassemia/mental Retardation Syndrome,Thalassemia\n" +
            "Spinocerebellar Ataxia,Ataxia,Olivopontocerebellar Atrophy\n" +
            "Spinocerebellar Ataxia Type10,Spinocerebellar Ataxia Type 10,Ataxia Show all 4\n" +
            "Ataxia,Olivopontocerebellar Atrophy,Amyotrophic Lateral Sclerosis Type 13\n" +
            "Machado-Joseph Disease,Machado-Joseph Disease Type 2,Machado-Joseph Disease Type 3\n" +
            "Machado-Joseph Disease\n" +
            "Cerebellar Disease,Spinocerebellar Ataxia Type 7,Spinocerebellar Ataxia\n" +
            "Infantile Onset Spinocerebellar Ataxia Spinocerebellar Ataxia Type 8\n" +
            "Spinocerebellar Ataxia Type 8,Infantile Onset Spinocerebellar Ataxia,Friedreich Ataxia\n" +
            "3 Methylglutaconic Aciduria Type I Leigh-Like Syndrome\n" +
            "Deafness,X-Linked 5,X-Linked Hereditary Sensory And Autonomic Neuropathy With Deafness Auditory Neuropathy\n" +
            "Colonic Benign Neoplasm,Laryngeal Squamous Cell Carcinoma,Laryngeal Carcinoma\n" +
            "Stomach Cancer\n" +
            "Neuroblastoma,Susceptibility Giant Cell Glioblastoma\n" +
            "Spermatogenic Failure 5\n" +
            "Autism Susceptibility 1\n" +
            "Autism Susceptibility 11\n" +
            "Autism Susceptibility 12\n" +
            "Autism Susceptibility 13\n" +
            "Mental Retardation,Autosomal Dominant 26 Leukemia,Acute Lymphoblastic 3\n" +
            "Autism Susceptibility 3\n" +
            "Autism Susceptibility 5\n" +
            "Autism Susceptibility 6\n" +
            "Autism Susceptibility 7\n" +
            "Autism Susceptibility 8\n" +
            "Schizoid Personality Disorder Alexithymia\n" +
            "Lennox-Gastaut Syndrome\n" +
            "Neurogenic Diabetes Insipidus,Inappropriate Adh Syndrome,Fanconi Syndrome\n" +
            "Atypical Autism,Adenomyosis,Portal Hypertension\n" +
            "Melancholia,Acth-Secreting Pituitary Adenoma,Acth-Independent Macronodular Adrenal Hyperplasia\n" +
            "Neonatal Candidiasis,Nephrogenic Syndrome Of Inappropriate Antidiuresis,Nephrogenic Diabetes Insipidus\n" +
            "Atrioventricular Septal Defect 1 Atrioventricular Septal Defect\n" +
            "Caudal Duplication,Hepatocellular Carcinoma,Somatic,Liver Cancer\n" +
            "Oligodontia-Colorectal Cancer Syndrome,Axin2-Related Attenuated Familial Adenomatous Polyposis,Colorectal Cancer,Somatic\n" +
            "Limb Ischemia Critical Limb Ischemia\n" +
            "Varicocele,Oligospermia,Mixed Gonadal Dysgenesis\n" +
            "Prostate Cancer\n" +
            "Cornea Cancer,Burns Erysipelas\n" +
            "Complication In Hemodialysis,Balkan Nephropathy,Amyloid Tumor\n" +
            "Nor Polyagglutination Syndrome\n" +
            "Muscular Dystrophy-Dystroglycanopathy (Congenital With Brain And Eye Anomalies,Type A,11,Muscular Dystrophy-Dystroglycanopathy ,Type A,12,Muscular Dystrophy-Dystroglycanopathy ,Type A,1 Show all 4\n" +
            "Sipple Syndrome\n" +
            "Uterine Corpus Cancer\n" +
            "Morquio Syndrome B,Mucopolysaccharidoses,Ehlers-Danlos Syndrome Progeroid Type\n" +
            "Peters Plus Syndrome\n" +
            "Natural Killer Cell Leukemia,Metanephric Adenoma,Ossifying Fibromyxoid Tumor\n" +
            "Multiple Joint Dislocations,Short Stature,Craniofacial Dysmorphism,And Congenital Heart Defects,Mucopolysaccharidoses,Morquio Syndrome B\n" +
            "Muscular Dystrophy-Dystroglycanopathy ,Type A,13,Muscular Dystrophy-Dystroglycanopathy ,Type A,12,Muscular Dystrophy-Dystroglycanopathy Show all 4\n" +
            "Mucopolysaccharidoses,Morquio Syndrome B Sly Syndrome\n" +
            "Spastic Paraplegia 26 Spastic Paraplegia 26,Autosomal Recessive\n" +
            "Tracheitis Dermatophytosis\n" +
            "Congenital Disorder Of Glycosylation Type 2D\n" +
            "Nasopharynx Carcinoma\n" +
            "Prostate Carcinoma In Situ\n" +
            "Ehlers-Danlos Syndrome,Progeroid Type,1 Reunion Islands Larsen Syndrome\n" +
            "Vitamin B6 Plasma Level Qtl 1\n" +
            "Meckel Syndrome 9,B9D1-Related Meckel Syndrome,Meckel Syndrome 1\n" +
            "Meckel Syndrome 10,B9D2-Related Meckel Syndrome,Meckel Syndrome 1 Show all 4\n" +
            "Melanoma\n" +
            "Mn1,Acute Leukemia,Acute Myeloid Leukemia\n" +
            "Hypercholanemia,Familial,Baat-Related Familial Hypercholanemia,Atypical Hemolytic-Uremic Syndrome Show all 4\n" +
            "Alzheimers Disease Myositis\n" +
            "Alzheimers Disease\n" +
            "Down Syndrome\n" +
            "Breast Cancer,Early-Onset,Fanconi Anemia,Complementation Group J Breast Cancer\n" +
            "Pancreatic Cancer Prostate Cancer\n" +
            "Spindle Cell Hemangioma Cervical Cancer\n" +
            "Spindle Cell Hemangioma Brain Cancer\n" +
            "Bag3-Related Myofibrillar Myopathy,Myopathy,Myofibrillar,6,Cardiomyopathy,Dilated,1Hh\n" +
            "Monilethrix\n" +
            "Brain Cancer\n" +
            "Coronary Artery Aneurysm\n" +
            "Chronic Lymphocytic Leukemia,Melanoma,Testicular Cancer\n" +
            "Listeriosis\n" +
            "Glioblastoma\n" +
            "Insulin Resistance\n" +
            "Benign Mammary Dysplasia,Colorectal Cancer,Telangiectasis\n" +
            "Gnathodiaphyseal Dysplasia,Cohen Syndrome,Megalencephalic Leukoencephalopathy With Subcortical Cysts Show all 4\n" +
            "Nestor-Guillermo Progeria Syndrome,Familial Partial Lipodystrophy,Mandibuloacral Dysplasia\n" +
            "Systemic Lupus Erythematosus,Association With,Systemic Lupus Erythematosus,Lupus Erythematosus Show all 4\n" +
            "Tumor Predisposition Syndrome,Childhood Medulloblastoma,Uveal Melanoma\n" +
            "Bard1-Related Susceptibility To Breast Cancer,Breast Cancer,Ovarian Cancer\n" +
            "Hard Palate Cancer De Hauwere Syndrome\n" +
            "Acute Stress Disorder\n" +
            "Malignant Teratoma,T-Cell Acute Lymphoblastic Leukemia,Somatic,Serous Cystadenocarcinoma\n" +
            "Williams Syndrome\n" +
            "Williams-Beuren Syndrome Williams Syndrome\n" +
            "Squamous Cell Carcinoma Of The Head And Neck\n" +
            "Bardet-Biedl Syndrome 18,Bardet-Biedl Syndrome,Bardet-Biedl Syndrome 1\n" +
            "Mulibrey Nanism\n" +
            "Bardet-Biedl Syndrome 1,Bbs1-Related Bardet-Biedl Syndrome,Bardet-Biedl Syndrome\n" +
            "Bardet-Biedl Syndrome 10,Bbs10-Related Bardet-Biedl Syndrome,Bardet-Biedl Syndrome\n" +
            "Bardet-Biedl Syndrome 12,Bbs12-Related Bardet-Biedl Syndrome,Bardet-Biedl Syndrome\n" +
            "Apperceptive Agnosia,Agnosia,Bardet-Biedl Syndrome 2\n" +
            "Bardet-Biedl Syndrome 4,Bbs4-Related Bardet-Biedl Syndrome,Bardet-Biedl Syndrome\n" +
            "Bardet-Biedl Syndrome 5,Bbs5-Related Bardet-Biedl Syndrome,Bardet-Biedl Syndrome\n" +
            "Bardet-Biedl Syndrome 7,Bbs7-Related Bardet-Biedl Syndrome,Mckusick-Kaufman Syndrome\n" +
            "Bardet-Biedl Syndrome 9,Bbs9-Related Bardet-Biedl Syndrome,Osteosarcoma\n" +
            "Lymphocytic Gastritis\n" +
            "Testicular Gonadoblastoma,Sickle Cell Disease Gonadoblastoma\n" +
            "Deafness,Dystonia,And Cerebral Hypomyelination\n" +
            "Breast Cancer Differentiating Neuroblastoma\n" +
            "Breast Cancer Venezuelan Equine Encephalitis\n" +
            "Breast Cancer\n" +
            "Breast Cancer\n" +
            "Breast Cancer\n" +
            "Breast Cancer\n" +
            "Choanal Atresia\n" +
            "Hyperleucinemia-Isoleucinemia Or Hypervalinemia Hyperleucine-Isoleucinemia\n" +
            "Hyperleucine-Isoleucinemia Hypervalinemia Or Hyperleucine-Isoleucinemia\n" +
            "Basal Cell Carcinoma 1 Basal Cell Carcinoma\n" +
            "Basal Cell Carcinoma 2 Basal Cell Carcinoma\n" +
            "Basal Cell Carcinoma 3 Basal Cell Carcinoma\n" +
            "Basal Cell Carcinoma 4 Basal Cell Carcinoma\n" +
            "Basal Cell Carcinoma 5 Basal Cell Carcinoma\n" +
            "Basal Cell Carcinoma 6 Basal Cell Carcinoma\n" +
            "Intrahepatic Cholangiocarcinoma\n" +
            "Pseudocholinesterase Deficiency,Susceptibility To Prolonged Paralysis Due To Vecuronium Treatment,Pancuronium Toxicity\n" +
            "Maple Syrup Urine Disease,Maple Syrup Urine Disease Type 1A,Pseudogout\n" +
            "Maple Syrup Urine Disease Type 1B,Maple Syrup Urine Disease,Maple Syrup Urine Disease Type 1A Show all 4\n" +
            "Branched-Chain Ketoacid Dehydrogenase Kinase Deficiency\n" +
            "Pancreatic Acinar Cell Adenocarcinoma,Gallbladder Lymphoma,Primary Cutaneous Marginal Zone B-Cell Lymphoma\n" +
            "Hypersomnia,Hereditary Persistence Of Fetal Hemoglobin,Beta Thalassemia\n" +
            "Benign Mammary Dysplasia,Salivary Gland Adenoid Cystic Carcinoma,Follicular Lymphoma\n" +
            "Stomach Cancer,Glucocorticoid Resistance,Non-Hodgkin Lymphoma Show all 4\n" +
            "Colorectal Cancer,Myeloma,Pancreatic Cancer\n" +
            "Non-Hodgkin Lymphoma Acute Myeloid Leukemia\n" +
            "Hematologic Cancer,Burkitts Lymphoma,Mn1\n" +
            "Acute Myeloid Leukemia\n" +
            "Cat Eye Syndrome\n" +
            "Severe Acute Respiratory Syndrome,Non-Hodgkin Lymphoma Chronic Myeloid Leukemia\n" +
            "Leukemia/lymphoma,B-Cell,3,Leukemia,Chronic Lymphocytic Leukemia\n" +
            "Primary Cutaneous Cd4+ Small/medium-Sized Pleomorphic T-Cell Lymphoma,Primary Bone Lymphoma,Bone Lymphoma\n" +
            "B-Cell Non-Hodgkin Lymphoma,High-Grade,Non-Hodgkin Lymphoma,Burkitts Lymphoma Show all 4\n" +
            "Burkitts Lymphoma Supravalvular Aortic Stenosis\n" +
            "Burkitts Lymphoma\n" +
            "Acute Lymphoblastic Leukemia,Lymphoblastic Leukemia Skeletal Muscle Regeneration\n" +
            "Colorectal Adenoma\n" +
            "Hypercarotenemia And Vitamin A Deficiency,Autosomal Dominant Carotid Artery Occlusion\n" +
            "Oculofaciocardiodental Syndrome,Radiculomegaly Of Canine Teeth- Congenital Cataract,Bcor-Related Lenz Microphthalmia Syndrome Show all 4\n" +
            "Breast Cancer Sporadic Breast Cancer\n" +
            "Philadelphia-Negative Chronic Myeloid Leukemia,Acute Lymphocytic Leukemia,Chronic Myeloid Leukemia\n" +
            "Bjornstad Syndrome,Breast Pericanalicular Fibroadenoma,Gracile Syndrome\n" +
            "Brachydactyly Type A1\n" +
            "Bleeding Disorder,East Texas Type\n" +
            "Bile Duct Adenoma\n" +
            "Burns,Polycystic Kidney Disease,Type 1,Erysipelas Show all 4\n" +
            "Acute Mountain Sickness,Placenta Accreta,Polycystic Kidney Disease,Type 1\n" +
            "Reversible Cerebral Vasoconstriction Syndrome,Cannabis Abuse,Memory Impairment\n" +
            "Spinocerebellar Ataxia 31 Ataxia\n" +
            "Nephropathic Cystinosis\n" +
            "Bornholm Eye Disease\n" +
            "Microcornea,Rod-Cone Dystrophy,Cataract,And Posterior Staphyloma,Retinitis Pigmentosa-50,Vitreoretinochoroidopathy\n" +
            "Bestrophinopathy Vitelliform Macular Dystrophy\n" +
            "Vitelliform Macular Dystrophy\n" +
            "Vitelliform Macular Dystrophy\n" +
            "Vestibular Neuronitis Neuronitis\n" +
            "Uterine Fibroid\n" +
            "Ischemic Optic Neuropathy Acute Myeloid Leukemia\n" +
            "Breast Cancer Acute Myeloid Leukemia\n" +
            "Infantile Convulsions And Paroxysmal Choreoathetosis,Familial,Benign Familial Infantile Seizures 2 Episodic Kinesigenic Dyskinesia 1\n" +
            "Convulsions,Benign Familial Infantile,1\n" +
            "Seizures,Benign Familial Infantile,4\n" +
            "Cataract 33,Posterior Polar Cataract Cataract\n" +
            "Cataract 12,Multiple Types,Cataract,Autosomal Dominant,Multiple Types 1,Epidermolysis Bullosa Simplex Show all 4\n" +
            "Nontoxic Goiter,Kwashiorkor,Chondroblastic Osteosarcoma\n" +
            "Exposure Keratitis\n" +
            "Beukes Familial Hip Dysplasia,Renal Carcinoma,Chromophobe,Somatic,Primary Spontaneous Pneumothorax\n" +
            "Tibial Aplasia - Ectrodactyly\n" +
            "Bipolar I Disorder Mood Disorder\n" +
            "Placental Abruption,Hyperhomocysteinemia,Spina Bifida\n" +
            "Abdominal Aortic Aneurysm,Spina Bifida Vascular Disease\n" +
            "Renal Dysplasia,Cystic Renal Dysplasia\n" +
            "Lissencephaly\n" +
            "Spinal Muscular Atrophy,Lower Extremity-Predominant,2,Ad,Spinal Muscular Atrophy,Lower Extremity-Predominant 1,Ad Proximal Spinal Muscular Atrophy\n" +
            "Cat Eye Syndrome Talipes Equinovarus\n" +
            "Intracranial Abscess,Casp10-Related Autoimmune Lymphoproliferative Syndrome,Centronuclear Myopathy 2\n" +
            "Epididymo-Orchitis,Breast Cancer Orchitis\n" +
            "Ornithosis\n" +
            "Malt Lymphoma\n" +
            "Malt Lymphoma,Chronic Neutrophilic Leukemia,Marginal Zone B-Cell Lymphoma\n" +
            "Cervical Carcinosarcoma,Ovarian Serous Cystadenocarcinoma,Serous Cystadenocarcinoma\n" +
            "Melanoma Malignant Pleural Mesothelioma\n" +
            "Acute Lymphoblastic Leukemia Lymphoblastic Leukemia\n" +
            "Breast Cancer\n" +
            "Maturity-Onset Diabetes Of The Young Type11,Maturity-Onset Diabetes Of The Young,Type 11,Keratolytic Winter Erythema\n" +
            "Bloom Syndrome,Rothmund-Thomson Syndrome,Werner Syndrome Show all 4\n" +
            "Mutagen Sensitivity,Resistance To Bleomycine In The Treatment Of Testicular Cancer,Alzheimers Disease Show all 4\n" +
            "Agammaglobulinemia 4,Anthrax Disease,Acute Lymphoblastic Leukemia\n" +
            "Hermansky-Pudlak Syndrome 8,Platelet Storage Pool Deficiency,Hermansky-Pudlak Syndrome Show all 4\n" +
            "Hermansky-Pudlak Syndrome 9,Platelet Storage Pool Deficiency,Hereditary Spherocytosis Show all 4\n" +
            "Hyperbiliverdinemia,Spontaneous Pneumothorax,Pneumothorax Show all 4\n" +
            "Cauda Equina Syndrome,Huntingtons Disease,Acquired Immunodeficiency Syndrome\n" +
            "Spinocerebellar Ataxia Type 6,Myocardial Infarction,Alexander Disease\n" +
            "Erythroplakia,Embryonal Cancer,Juvenile Nasopharyngeal Angiofibroma\n" +
            "Obesity Bmiq10 Obesity\n" +
            "16P11.2 Deletion Syndrome Chromosome 16P11.2 Deletion Syndrome,220Kb\n" +
            "Obesity Bmiq4\n" +
            "Obesity Bmiq7 Obesity\n" +
            "Obesity Bmiq8\n" +
            "Osteoporosis\n" +
            "Osteoporosis\n" +
            "Myositis Ossificans,Bmp1-Related Osteogenesis Imperfecta,Osteogenesis Imperfecta Type Xiii\n" +
            "Hereditary Hemorrhagic Telangiectasia\n" +
            "Ovarian Dysgenesis 2,Premature Ovarian Failure 4,Polycystic Ovary Syndrome\n" +
            "Tympanosclerosis,Trigeminal Neuralgia,Hfe Hemochromatosis,Modifier Of\n" +
            "Refractive Error\n" +
            "Calciphylaxis,Orofacial Cleft11,Microphthalmia Syndromic 6\n" +
            "Squamous Cell Papilloma,Microtia Meier-Gorlin Syndrome\n" +
            "Glycogen Storage Disease I,Bone Marrow Necrosis,Colorectal Cancer\n" +
            "Spondylolysis,Ureteral Obstruction,Spondylolisthesis\n" +
            "Blue Color Blindness Color Blindness\n" +
            "Diaphanospondylodysostosis Spondylocostal Dysostosis\n" +
            "Bmpr1A-Related Juvenile Polyposis,Juvenile Polyposis Of Infancy,Hereditary Mixed Polyposis Syndrome 2\n" +
            "Chrondrodysplasia,Acromesomelic,With Genital Anomalies,Pulmonary Hypertension,Brachydactyly Type A2\n" +
            "Pulmonary Venoocclusive Disease 1,Pulmonary Venoocclusive Disease,Primary Pulmonary Hypertension\n" +
            "Aplasia Cutis Congenita Tauopathy\n" +
            "Prostate Cancer\n" +
            "Spindle Cell Hemangioma\n" +
            "Pancreatic Cancer,Hereditary Leiomyomatosis And Renal Cell Cancer Malignant Glioma\n" +
            "Visual Epilepsy\n" +
            "Trigeminal Neuralgia\n" +
            "Myelodysplastic Syndromes,Werdnig-Hoffmann Disease Liver Cancer\n" +
            "Multiple Mitochondrial Dysfunctions Syndrome 2\n" +
            "Actinomycosis Azoospermia\n" +
            "Polymicrogyria,Bilateral Occipital\n" +
            "Branchiootic Syndrome 2 Branchiootic Syndrome\n" +
            "Sporadic Breast Cancer\n" +
            "Adiponectin Deficiency\n" +
            "Major Depressive Disorder And Accelerated Response To Antidepressant Drug Treatment Major Depressive Disorder\n" +
            "Erythrocytosis Due To Bisphosphoglycerate Mutase Deficiency\n" +
            "Meningococcemia,Stenotrophomonas Maltophilia,Bacteremia\n" +
            "Lung Cancer Patent Ductus Arteriosus\n" +
            "Breast Cancer\n" +
            "Benign Paroxysmal Positional Nystagmus\n" +
            "Y Chromosome Infertility,Infertility Male Infertility\n" +
            "Male Infertility Infertility\n" +
            "Infertility Male Infertility\n" +
            "Noonan Syndrome 7,Leopard Syndrome 3,Cardiofaciocutaneous Syndrome4\n" +
            "Rigidity And Multifocal Seizure Syndrome,Lethal Neonatal,Breast Cancer Ataxia Telangiectasia\n" +
            "Pancreatic Cancer 4,Hereditary Breast Ovarian Cancer,Fallopian Tube Cancer\n" +
            "Fanconi Anemia,Complementation Group D1,Breast-Ovarian Cancer,Familial,2,Glioblastoma 38\n" +
            "Breast Cancer,Type 3,Breast Cancer,Breast Cancer Susceptibility\n" +
            "Breast Cancer,11:22 Translocation Associated Breast Cancer\n" +
            "Moyamoya Disease - Short Stature - Facial Dysmorphism - Hypergonadotropic Hypogonadism T-Cell Prolymphocytic Leukemia\n" +
            "Photosensitive Epilepsy Juvenile Myoclonic Epilepsy\n" +
            "Nasopharynx Carcinoma\n" +
            "Rhabdomyosarcoma Shipyard Eye\n" +
            "Breast Cancer\n" +
            "Lung Squamous Cell Carcinoma\n" +
            "Cervical Cancer\n" +
            "Oligoastrocytoma\n" +
            "Fanconi Anemia,Complementation Group J,Brip1-Related Fanconi Anemia,Brip1-Related Breast Cancer\n" +
            "Bruck Syndrome 1\n" +
            "Breast Cancer Melanoma\n" +
            "Breast Cancer \n" +
            "Hypertension,Lung Cancer Prostate Cancer\n" +
            "Limbic Encephalitis\n" +
            "Vertigo,Benign Recurrent,2\n" +
            "Coronin-1A Deficiency Triple-A Syndrome\n" +
            "Chronic Lymphocytic Leukemia,Mental Retardation,X-Linked Mental Retardation\n" +
            "Spastic Paraplegia 17,Bscl2-Related Neurologic Disorders/seipinopathy,Congenital Generalized Lipodystrophy Type 2\n" +
            "Spinal Cord Astrocytoma,Brain Stem Glioma Ameloblastoma\n" +
            "Sensorineural Deafness With Mild Renal Dysfunction,Hypokalemia,Bartter Syndrome Type 4A\n" +
            "Rheumatoid Arthritis Arthritis\n" +
            "Rheumatoid Arthritis,Hiv-1,West Nile Encephalitis Show all 4\n" +
            "Jacobsen Syndrome\n" +
            "Hepatitis C,Hepatitis C Virus Hepatitis\n" +
            "Nemaline Myopathy 9\n" +
            "Restless Legs Syndrome\n" +
            "Erythropoietic Protoporphyria Pancreatic Cancer\n" +
            "Biotinidase Deficiency,Multiple Carboxylase Deficiency,Biotin Deficiency\n" +
            "Chronic Lymphocytic Leukemia\n" +
            "Agammaglobulinemia And Isolated Hormone Deficiency,Agammaglobulinemia,Bruton-Type Agammaglobulinemia\n" +
            "Rheumatoid Arthritis,Subacute Sclerosing Panencephalitis Type 1 Diabetes Mellitus\n" +
            "Sarcoidosis 2,Sarcoidosis,Sarcoidosis 1\n" +
            "Hiv-1,Split-Hand/foot Malformation 6 Cerebellar Medulloblastoma\n" +
            "Retinitis Pigmentosa 23 Joubert Syndrome 10\n" +
            "Colorectal Cancer With Chromosomal Instability,Somatic,Colorectal Cancer Mosaic Variegated Aneuploidy Syndrome 1\n" +
            "Premature Chromatid Separation Trait,Mosaic Variegated Aneuploidy Syndrome,Mosaic Variegated Aneuploidy Syndrome 1\n" +
            "Mosaic Variegated Aneuploidy Syndrome 1\n" +
            "Bulimia Nervosa\n" +
            "Burkitts Lymphoma\n" +
            "Type 2 Diabetes Mellitus\n" +
            "Type 2 Diabetes Mellitus\n" +
            "Type 2 Diabetes Mellitus\n" +
            "Teratocarcinoma\n" +
            "Phlebotomus Fever\n" +
            "Bazex-Dupre-Christol Syndrome\n" +
            "Albinism,Oculocutaneous,Type Vii,Albinism Oculocutaneous Albinism\n" +
            "Mitochondrial Dna Depletion Syndrome 7,Ophthalmoplegia,Hereditary Ataxia\n" +
            "Alzheimers Disease\n" +
            "Staphyloenterotoxemia\n" +
            "Leukemia\n" +
            "Severe Acute Respiratory Syndrome\n" +
            "Non-Small Cell Lung Carcinoma\n" +
            "Ependymoma Chondroid Lipoma\n" +
            "Locked-In Syndrome,Agoraphobia Spondylosis\n" +
            "Temtamy Syndrome\n" +
            "Spastic Paraplegia 55,Autosomal Recessive,Combined Oxidative Phosphorylation Deficiency 7 Behr Syndrome\n" +
            "Dyserythropoietic Anemia,Congenital,Type Ib,Congenital Dyserythropoietic Anemia Congenital Dyserythropoietic Anemia Type I\n" +
            "Esophageal Squamous Cell Carcinoma\n" +
            "Chromosome 16Q22 Deletion Syndrome\n" +
            "Esophageal Cancer\n" +
            "Fanconis Anemia Fanconi Anemia,Complementation Group M\n" +
            "Lung Cancer\n" +
            "Vertebral Artery Insufficiency\n" +
            "Adenoma,Inferior Myocardial Infarction Lung Adenoma\n" +
            "Colon Cancer\n" +
            "Spastic Paraplegia 43,Autosomal Recessive,Mitochondrial Membrane Protein-Associated Neurodegeneration Spasticity\n" +
            "Morgagni Cataract\n" +
            "Aplastic Anemia Fanconis Anemia\n" +
            "Intraocular Lymphoma,Acute Promyelocytic Leukemia,Acute Myeloid Leukemia\n" +
            "Hepatocellular Carcinoma\n" +
            "Iga Glomerulonephritis\n" +
            "Tn Polyagglutination Syndrome,Somatic Iga Glomerulonephritis\n" +
            "Androgenetic Alopecia\n" +
            "Ulcerative Colitis\n" +
            "Multiple Myeloma Myeloma\n" +
            "Hepatitis C,Hepatitis C Virus Hepatitis\n" +
            "Breast And Colorectal Cancer\n" +
            "Cutaneous Lupus Erythematosus,Subacute Cutaneous Lupus Erythematosus,Glomerulonephritis\n" +
            "C1Q Deficiency,Glomerulonephritis,Trypanosomiasis\n" +
            "C1Q Deficiency,Glomerulonephritis,Complement Component 4,Partial Deficiency Of\n" +
            "Late-Onset Retinal Degeneration,Retinal Degeneration,Late-Onset,Autosomal Dominant Retinal Degeneration\n" +
            "C1R/c1S Deficiency,Combined,C1S Deficiency,Complement Deficiency Show all 4\n" +
            "Cll/sll,Ovary Adenocarcinoma,Non-Hodgkin Lymphoma Show all 4\n" +
            "C1S Deficiency,Acquired Angioedema,Capillary Leak Syndrome\n" +
            "Complement Component 2 Deficiency,Complement Component C2 Deficiency,Macular Degeneration,Age-Related,14,Reduced Risk Of\n" +
            "Vaccinia\n" +
            "Lung Cancer\n" +
            "Down Syndrome\n" +
            "Down Syndrome Anophthalmia/microphthalmia\n" +
            "Ciliary Dyskinesia,Primary,26,Prostate Cancer Ciliary Dyskinesia,Primary,11\n" +
            "Orofaciodigital Syndrome 13\n" +
            "Esophageal Cancer Esophageal Squamous Cell Carcinoma\n" +
            "Defective Apolipoprotein B-100\n" +
            "Colorectal Adenocarcinoma\n" +
            "Retinitis Pigmentosa 54,C2Orf71-Related Retinitis Pigmentosa Retinitis Pigmentosa\n" +
            "Hemolytic Uremic Syndrome,Atypical 5,C3 Deficiency,Age-Related Macular Degeneration 9\n" +
            "Lupus Nephritis Bacterial Meningitis\n" +
            "Muir-Torre Syndrome\n" +
            "Hypoxia\n" +
            "Keloids\n" +
            "C4A Deficiency,Adult Respiratory Distress Syndrome,Neonatal Lupus Erythematosus\n" +
            "C4B Deficiency,Sle Susceptibility,Complement Component 4,Partial Deficiency Of\n" +
            "Gonorrhea,Protein S Deficiency,Acute Poststreptococcal Glomerulonephritis\n" +
            "Non-Hodgkin Lymphoma Protein S Deficiency\n" +
            "Systemic Lupus Erythematosus,C4B Deficiency,Sle Susceptibility Show all 4\n" +
            "Amelogenesis Imperfecta Type,Iia4,Amelogenesis Imperfecta,Type Ib,Amelogenesis Imperfecta Show all 4\n" +
            "Hepatitis C Virus,Hepatitis C,Alcohol Dependence Show all 4\n" +
            "Neuroblastoma,Differentiating Neuroblastoma Ellis-Van Creveld Syndrome\n" +
            "Complement Component 5 Deficiency,Rapidly Progressive Glomerulonephritis,Pneumococcal Meningitis\n" +
            "Hypersensitivity Reaction Type Iii Disease,Systemic Lupus Erythematosus,Multiple Sclerosis\n" +
            "Artery Disease Sepsis\n" +
            "Major Depressive Disorder\n" +
            "Joubert Syndrome 17,Orofaciodigital Syndrome 6,C5Orf42-Related Joubert Syndrome\n" +
            "Neisseria Meningitidis Infection,C6 Deficiency,Combined C6/c7 Deficiency\n" +
            "Systemic Lupus Erythematosus\n" +
            "Follicular Lymphoma\n" +
            "Breast Cancer Susceptibility Chronic Myeloid Leukemia\n" +
            "Chronic Lymphocytic Leukemia,Gray Platelet Syndrome,Paraneoplastic Pemphigus Show all 4\n" +
            "Human T-Cell Leukemia Virus Type 1\n" +
            "Periventricular Nodular Heterotopia 6 Periventricular Nodular Heterotopia\n" +
            "C7 Deficiency,Complement Component 5 Deficiency Sle Susceptibility\n" +
            "Post-Traumatic Stress Disorder\n" +
            "Intrahepatic Cholangiocarcinoma\n" +
            "Nicotine Dependence\n" +
            "Complement Component 8 Deficiency Type 1 Complement Component 5 Deficiency\n" +
            "Complement Component 8 Deficiency Type 2 Complement Component 5 Deficiency\n" +
            "Salpingo-Oophoritis,Acute Salpingitis,Oophoritis\n" +
            "Keratolytic Winter Erythema\n" +
            "Cone-Rod Dystrophy 16,Retinitis Pigmentosa 64,C8Orf37-Related Retinitis Pigmentosa\n" +
            "Breast Cancer Thyroid Cancer\n" +
            "C9 Deficiency,Primary Amebic Meningoencephalitis,Meningoencephalitis\n" +
            "Newborn Respiratory Distress Syndrome Right Bundle Branch Block\n" +
            "Alzheimers Disease\n" +
            "Huntington Disease-Like Syndrome Due To C9Orf72 Expansions,C9Orf72-Related Amyotrophic Lateral Sclerosis/frontotemporal Dementia,Ftdals1\n" +
            "Hepatocellular Carcinoma\n" +
            "Transitional Cell Carcinoma\n" +
            "Subacute Thyroiditis Amnestic Disorder\n" +
            "Herpangina,Retrograde Amnesia Hand,Foot And Mouth Disease\n" +
            "Isolated Hyperchlorhidrosis Hypoxia\n" +
            "Suppurative Otitis Media\n" +
            "Multifocal Fibrosclerosis,Autoimmune Retinopathy,Osteopetrosis,Autosomal Recessive 3,With Renal Tubular Acidosis\n" +
            "Hordeolum,Laryngeal Disease,Myocardial Infarction Show all 4\n" +
            "Retinitis Pigmentosa 17,Herpangina,Ca4-Related Retinitis Pigmentosa\n" +
            "Hyperammonemia Due To Carbonic Anhydrase Va Deficiency\n" +
            "Multilocular Clear Cell Renal Cell Carcinoma,Hand,Foot And Mouth Disease,Clear Cell Renal Cell Carcinoma Show all 4\n" +
            "Cerebellar Ataxia And Mental Retardation With Or Without Quadrupedal Locomotion 3,Cerebellar Hypoplasia And Mental Retardation With Or Without Quadrupedal Locomotion 1,Cerebellar Degeneration\n" +
            "Renal Cell Carcinoma,Clear Cell Renal Cell Carcinoma,Endometrial Carcinoma\n" +
            "Complication After Organ Transplantation,Lymphocele,Invasive Aspergillosis Show all 4\n" +
            "Amebiasis,Deafness,Digenic,Gjb2/gjb3,Deafness,Autosomal Recessive 93 Show all 4\n" +
            "Congenital Stationary Night Blindness,Type 2B,Night Blindness,Congenital Stationary ,2B,Autosomal Recessive,Retinal Disease\n" +
            "Amebiasis\n" +
            "Benign Paroxysmal Torticollis Of Infancy,Episodic Ataxia With Nystagmus,Episodic Ataxia Type 2\n" +
            "Epidemic Pleurodynia,Autoimmune Autonomic Ganglionopathy,Chronic Pain\n";
//            "Brugada Syndrome 3,Timothy Syndrome,Brugada Syndrome\n" +
//            "Primary Aldosteronism,Seizures,And Neurologic Abnormalities,Sinoatrial Node Dysfunction And Deafness Hypokalemic Periodic Paralysis\n" +
//            "Migraine\n" +
//            "Aland Island Eye Disease,Eye Disease,Cacna1F-Related X-Linked Congenital Stationary Night Blindness\n" +
//            "Epilepsy,Idiopathic Generalized 6,Childhood Absence Epilepsy,Epilepsy,Childhood Absence,Susceptibility To,6\n" +
//            "Thyrotoxic Periodic Paralysis 1,Periodic Paralysis With Transient Compartment-Like Syndrome,Hypokalemic Periodic Paralysis Type 1\n" +
//            "Timothy Syndrome,Short Qt Syndrome,Short Qt Syndrome 1 Show all 4\n" +
//            "Infantile Epileptic Encephalopathy\n" +
//            "Laband Syndrome,Zimmermann-Laband Syndrome Hereditary Night Blindness\n" +
//            "Retinal Cone Dystrophy 4,Cone Dystrophy 4,Cone-Rod Dystrophy 2 Show all 4\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy Malignant Hyperthermia Susceptibility\n" +
//            "Brugada Syndrome 4,Lambert-Eaton Myasthenic Syndrome,Brugada Syndrome 1\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy Canavan Disease\n" +
//            "Epilepsy,Idiopathic Generalized 9,Epilepsy,Juvenile Myoclonic 6,Cacnb4-Related Juvenile Myoclonic Epilepsy\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy Malignant Hyperthermia Susceptibility\n" +
//            "Mental Retardation,Autosomal Dominant 10,Schizophrenia Mental Retardation,Autosomal Dominant 6\n" +
//            "Juvenile Absence Epilepsy\n" +
//            "Schizophrenia,Bipolar Disorder Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
//            "Asthma Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
//            "Neuroblastoma\n" +
//            "Asthenopia,Lung Cancer,Facial Paralysis\n" +
//            "Pineoblastoma\n" +
//            "Adenocarcinoma Colon Adenocarcinoma\n" +
//            "Huntingtons Disease,Dominant Optic Atrophy,Thyroid Medullary Carcinoma\n" +
//            "Sex Cord-Gonadal Stromal Tumor,Trisomy 22,Hirschsprungs Disease\n" +
//            "Paroxysmal Hemicrania,Discitis,Cerebral Arteriosclerosis7\n" +
//            "Thyroid Medullary Carcinoma\n" +
//            "Osteoporosis,Postmenopausal,Susceptibility,Osteoporosis Lung Cancer\n" +
//            "Primary Angle-Closure Glaucoma Pulpitis\n" +
//            "Mixed Endometrial Stromal And Smooth Muscle Tumor,Kidney Leiomyosarcoma,Breast Leiomyosarcoma\n" +
//            "Alzheimers Disease Temporal Lobe Epilepsy\n" +
//            "Alzheimers Disease\n" +
//            "Ventricular Tachycardia,Catecholaminergic Polymorphic,4,Calm1-Related Catecholaminergic Polymorphic Ventricular Tachycardia,Otomycosis\n" +
//            "Phencyclidine Abuse,Otomycosis Pseudoachondroplasia\n" +
//            "Hypokalemic Periodic Paralysis\n" +
//            "Otomycosis Pseudoachondroplasia\n" +
//            "Pertussis\n" +
//            "Breast Cancer\n" +
//            "Pertussis\n" +
//            "Pertussis\n" +
//            "Supravalvular Aortic Stenosis\n" +
//            "Breast Mucinous Carcinoma,Congenital Heart Block,Thrombocythemia,Somatic\n" +
//            "Cardiomyopathy,Familial Hypertrophic,19,Syncope,Familial Hypertrophic Cardiomyopathy Show all 4\n" +
//            "Schizophrenia\n" +
//            "Van Der Woude Syndrome\n" +
//            "Phencyclidine Abuse\n" +
//            "Timothy Syndrome,Transient Cerebral Ischemia,Ischemia\n" +
//            "Colorectal Adenocarcinoma\n" +
//            "Cerebral Hypoxia Allan-Herndon-Dudley Syndrome\n" +
//            "2P21 Microdeletion Syndrome Without Cystinuria,2P21 Microdeletion Syndrome,Atypical Hypotonia - Cystinuria Syndrome\n" +
//            "Rosacea,Eczema Herpeticum,Cellulitis\n" +
//            "Camptodactyly 1\n" +
//            "Histiocytoid Hemangioma,Cerebellar Ataxia,Nonprogressive,With Mental Retardation,Epithelioid Hemangioendothelioma Show all 4\n" +
//            "Glomuvenous Malformation\n" +
//            "Candidiasis,Familial,1,Autosomal Dominant\n" +
//            "Candidiasis,Familial,3\n" +
//            "Desbuquois Syndrome,Chagas Disease Dwarfism\n" +
//            "Orbital Melanoma\n" +
//            "Herpes Simplex Encephalitis 3\n" +
//            "Meningothelial Meningioma,Meningioma Gastric Cancer\n" +
//            "Insulin Resistance,Polycystic Ovary Syndrome,Type 2 Diabetes Mellitus\n" +
//            "Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Idiopathic Eosinophilic Myositis,Calpainopathy,Miyoshi Myopathy\n" +
//            "Vitreoretinopathy,Neovascular Inflammatory Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Chronic Neutrophilic Leukemia Gastric Cancer\n" +
//            "Gastric Cancer Traumatic Brain Injury\n" +
//            "Japanese Encephalitis\n" +
//            "Gastric Cancer\n" +
//            "Alexithymia\n" +
//            "Primary Biliary Cirrhosis\n" +
//            "Immunodeficiency 11 Persistent Polyclonal B-Cell Lymphocytosis\n" +
//            "Pityriasis Rubra Pilaris,Psoriasis Susceptibility 2 Psoriasis\n" +
//            "Hodgkins Lymphoma\n" +
//            "Shigellosis\n" +
//            "Masters-Allen Syndrome Rheumatoid Arthritis\n" +
//            "Deep Dermatophytosis,Candidiasis,Familial,2,Autosomal Recessive,Familial Candidiasis 2\n" +
//            "Amyotrophic Lateral Sclerosis Lateral Sclerosis\n" +
//            "Inflammatory Myofibroblastic Tumor,Childhood Disintegrative Disease,Wilms Tumor\n" +
//            "Anus Cancer,Obesity,Susceptibility To,Cartpt-Related,Hypersomnia\n" +
//            "Adenoma Lung Adenoma\n" +
//            "Breast Cancer Susceptibility\n" +
//            "Median Neuropathy,Primary Autosomal Recessive Microcephaly Type 4,Primary Autosomal Recessive Microcephaly Type 1\n" +
//            "Brachydactyly-Syndactyly Syndrome\n" +
//            "Mental Retardation And Microcephaly With Pontine And Cerebellar Hypoplasia,Fg Syndrome 4,Cask-Related Disorders\n" +
//            "Shigellosis,Septic Shock,Paratyphoid Fever\n" +
//            "Autoimmune Lymphoproliferative Syndrome,Type Ii,Familial Non-Hodgkin Lymphoma,Gastric Cancer\n" +
//            "Sepsis,Prion Disease Myocardial Infarction\n" +
//            "Myocardial Infarction Plasma Cell Neoplasm\n" +
//            "Temporal Lobe Epilepsy,Myocardial Infarction,Primary Effusion Lymphoma\n" +
//            "Nervous System Cancer,Myocardial Infarction,Diffuse Large B-Cell Lymphoma\n" +
//            "Myocardial Infarction Nephropathic Cystinosis\n" +
//            "Cowpox Myocardial Infarction\n" +
//            "Myocardial Infarction,Thoracic Cancer Huntingtons Disease\n" +
//            "Myocardial Infarction Gastrointestinal Lymphoma\n" +
//            "Caspase-8 Deficiency,Lung Cancer,Protection Against,Breast Cancer,Protection Against\n" +
//            "Cerebral Hypoxia,Thoracic Cancer,Myocardial Infarction\n" +
//            "Gas Gangrene Malignant Hyperthermia Susceptibility\n" +
//            "Ventricular Tachycardia,Catecholaminergic Polymorphic,2,Casq2-Related Catecholaminergic Polymorphic Ventricular Tachycardia,Catecholaminergic Polymorphic Ventricular Tachycardia\n" +
//            "Hyperparathyroidism,Neonatal,Metastatic Insulinoma,Familial Hypocalciuric Hypercalcemia\n" +
//            "Acatalasia,Meningitis And Encephalitis,Pityriasis Versicolor\n" +
//            "Catel Manzke Syndrome\n" +
//            "Catsper-Related Male Infertility,Spermatogenic Failure 7,Rhinotracheitis\n" +
//            "Deafness-Infertility Syndrome,Deafness And Male Infertility,Male Infertility Show all 4\n" +
//            "Deafness And Male Infertility\n" +
//            "Pulmonary Hypertension,Primary,3,Congenital Generalized Lipodystrophy Type 3,Partial Lipodystrophy,Congenital Cataracts,And Neurodegeneration Syndrome\n" +
//            "Prostate Cancer\n" +
//            "Long Qt Syndrome 9,Creatine Phosphokinase,Elevated Serum,Rippling Muscle Disease\n" +
//            "Acute Myeloid Leukemia Myeloid Leukemia\n" +
//            "Acute Myeloid Leukemia,Acute Megakaryoblastic Leukemia Without Down Syndrome Myeloid Leukemia\n" +
//            "Lymphoplasmacytic Lymphoma,Acute Myeloid Leukemia With Abnormal Bone Marrow Eosinophils Inv(16)(P13Q22) Or T(16;16)(P13;q22),Cleidocranial Dysplasia\n" +
//            "Noonan-Like Syndrome Disorder With Or Without Juvenile Myelomonocytic Leukemia,Noonan Syndrome,Juvenile Myelomonocytic Leukemia\n" +
//            "Cannabis Dependence\n" +
//            "Benign Paroxysmal Positional Nystagmus\n" +
//            "Primary Pulmonary Hypertension Heritable Pulmonary Arterial Hypertension\n" +
//            "Olivopontocerebellar Atrophy Spinocerebellar Degeneration\n" +
//            "Colorectal Cancer\n" +
//            "Keloids,Lung Cancer Susceptibility,Congestive Heart Failure Show all 4\n" +
//            "Prostate Cancer\n" +
//            "Homocystinuria Caused By Cystathionine Beta-Synthase Deficiency,Homocystinuria Due To Cbs Deficiency,Tinea Manuum\n" +
//            "Mandibuloacral Dysplasia\n" +
//            "46Xy Sex Reversal 5,Gonadal Dysgenesis 46Xy Sex Reversal 7\n" +
//            "Brain Cancer\n" +
//            "Pediatric Ependymoma\n" +
//            "Mental Retardation Mental Retardation,Autosomal Recessive 2\n" +
//            "Cc2D2A-Related Joubert Syndrome,Meckel Syndrome 6,Joubert Syndrome 9\n" +
//            "Alcohol Dependence\n" +
//            "Cataract 7 Cataract,Congenital\n" +
//            "Chondrocalcinosis 1\n" +
//            "Breast Cancer\n" +
//            "Colon Cancer\n" +
//            "Colon Cancer\n" +
//            "Hennekam Lymphangiectasia-Lymphedema Syndrome 1,Hennekam Syndrome,Non-Immune Hydrops Fetalis\n" +
//            "Schizophrenia\n" +
//            "Cerebral-Cerebellar-Coloboma Syndrome,X-Linked\n" +
//            "Diabetic Macular Edema\n" +
//            "Diabetic Cataract\n" +
//            "Ciliary Dyskinesia,Primary,17,Primary Ciliary Dyskinesia17: Ccdc103-Related Primary Ciliary Dyskinesia Ciliary Dyskinesia,Primary,11\n" +
//            "Heterotaxy,Visceral,6,Autosomal Recessive,Heterotaxy,Visceral Heterotaxy Show all 4\n" +
//            "Ciliary Dyskinesia,Primary,20 Ciliary Dyskinesia,Primary,11\n" +
//            "Trench Fever Phlebotomus Fever\n" +
//            "Ciliary Dyskinesia,Primary,30 Ciliary Dyskinesia,Primary,11\n" +
//            "Breast Cancer\n" +
//            "Sarcoma\n" +
//            "Nasopharynx Carcinoma\n" +
//            "Dandy-Walker Like Malformation With Atrioventricular Septal Defect\n" +
//            "Bardet-Biedl Syndrome 1,Modifier Of,Retinal Disease,Congenital Nystagmus Show all 4\n" +
//            "Spinal Stenosis\n" +
//            "Facial Paralysis\n" +
//            "Ciliary Dyskinesia,Primary,14,Primary Ciliary Dyskinesia14: Ccdc39-Related Primary Ciliary Dyskinesia,Ciliary Dyskinesia,Primary,11 Show all 4\n" +
//            "Ciliary Dyskinesia,Primary,15,Primary Ciliary Dyskinesia15: Ccdc40-Related Primary Ciliary Dyskinesia Ciliary Dyskinesia,Primary,11\n" +
//            "Deafness,Autosomal Dominant 44,Dfna44 Nonsyndromic Hearing Loss And Deafness Deafness,Autosomal Dominant 3B\n" +
//            "Papillary Thyroid Carcinoma,Follicular Thyroid Carcinoma Thyroid Cancer\n" +
//            "Ciliary Dyskinesia,Primary,27,Ciliary Dyskinesia,Primary,11 Clear Cell Sarcoma\n" +
//            "Centronuclear Myopathy 4\n" +
//            "3-M Syndrome,Ccdc8-Related,3-M Syndrome 3 3-M Syndrome\n" +
//            "Hepatitis Relapsing Fever\n" +
//            "Hydrocephalus,Spinocerebellar Ataxia 40,Congenital Non-Communicating Hydrocephalus Show all 4\n" +
//            "Acalculous Cholecystitis,Biliary Dyskinesia,Opioid Abuse\n" +
//            "Dyspepsia,Irritable Bowel Syndrome,Paranoid Schizophrenia\n" +
//            "Agoraphobia,Duodenal Gastrinoma,Panic Disorder\n" +
//            "Kaposis Sarcoma\n" +
//            "Giant Papillary Conjunctivitis,Pediatric Ulcerative Colitis,Papillary Conjunctivitis2\n" +
//            "Far Eastern Spotted Fever,Spotted Fever,Allergic Rhinitis Show all 4\n" +
//            "Pertussis Osteosarcoma\n" +
//            "Paragonimiasis,Stenotrophomonas Maltophilia,Mycosis Fungoides\n" +
//            "Idiopathic Pulmonary Fibrosis,Allergic Asthma,Pulmonary Fibrosis Show all 4\n" +
//            "Polyradiculoneuropathy Chronic Inflammatory Demyelinating Polyradiculoneuropathy\n" +
//            "Spina Bifida,Coronary Artery Disease,Modifier Of,Hiv-17\n" +
//            "Smallpox,Pancreatic Cancer,Stromal Keratitis Show all 4\n" +
//            "Chronic Lymphocytic Leukemia,Idiopathic Pulmonary Fibrosis,Thymic Hyperplasia\n" +
//            "Atopic Keratoconjunctivitis,Mycosis Fungoides,Allergic Bronchopulmonary Aspergillosis\n" +
//            "Sialadenitis\n" +
//            "Papillary Conjunctivitis,Giant Papillary Conjunctivitis,Acute Promyelocytic Leukemia\n" +
//            "Allergic Asthma,Ileitis Obstructive Jaundice\n" +
//            "Heart Tumor,Eosinophilic Esophagitis,Esophagitis\n" +
//            "Primary Biliary Cirrhosis,Chronic Recurrent Multifocal Osteomyelitis,Hypophosphatasia\n" +
//            "Malaria,Tuberculosis,Behcets Disease\n" +
//            "Hiv/aids,Acquired Immunodeficiency Syndrome,Trypanosomiasis Show all 4\n" +
//            "Hiv-1\n" +
//            "Malaria,Tuberculosis,Stachybotrys Chartarum\n" +
//            "Ulcer Of Lower Limbs,African Tick-Bite Fever,Hiv-1 Disease,Rapid Progression Of\n" +
//            "Stachybotrys Chartarum,Nephrogenic Systemic Fibrosis,Usual Interstitial Pneumonia\n" +
//            "Cholera,Primary Biliary Cirrhosis Diffuse Gastric Cancer\n" +
//            "Cerebral Cavernous Malformations-2,Cerebral Angioma,Cerebral Cavernous Malformation\n" +
//            "Cavernous Malformation Cerebral Cavernous Malformation\n" +
//            "Male Germ Cell Tumor Acute Myeloid Leukemia\n" +
//            "Tenosynovial Giant Cell Tumor,Benign Meningioma,Thyroid Lymphoma\n" +
//            "Cervical Cancer,Tetraploidy,Thyroid Lymphoma\n" +
//            "Cartilage-Hair Hypoplasia\n" +
//            "Superficial Urinary Bladder Cancer,Breast Papillary Carcinoma,Colorectal Cancer\n" +
//            "Megalencephaly-Polymicrogyria-Polydactyly-Hydrocephalus Syndrome 3,Mantle Cell Lymphoma,Breast Cancer\n" +
//            "Myeloma Bladder Carcinoma In Situ\n" +
//            "Optic Disk Drusen Congenital Dyserythropoietic Anemia Type I\n" +
//            "Facial Dermatosis,Phlyctenulosis,Chronic Endophthalmitis\n" +
//            "Necrotizing Fasciitis\n" +
//            "Mantle Cell Lymphoma Pancreatic Cancer\n" +
//            "Thyroid Lymphoma\n" +
//            "Pthirus Pubis Infestation Kaposis Sarcoma\n" +
//            "Star Syndrome\n" +
//            "Ciliary Diskinesia,Primary,29 Ciliary Dyskinesia,Primary,11\n" +
//            "Hiv-1\n" +
//            "Hiv-1\n" +
//            "Chromoblastomycosis,Mesangial Proliferative Glomerulonephritis,Proliferative Glomerulonephritis\n" +
//            "Pthirus Pubis Infestation Cutaneous Malignant Melanoma\n" +
//            "Idiopathic Anterior Uveitis,Anterior Uveitis,Acquired Immunodeficiency Syndrome\n" +
//            "Aids Dementia Complex,Erdheim-Chester Disease,Corneal Ulcer\n" +
//            "Wegeners Granulomatosis,Atopic Keratoconjunctivitis,Alk-Negative Anaplastic Large Cell Lymphoma\n" +
//            "Diabetes Mellitus,Insulin-Dependent,22,West Nile Virus,Hepatitis C Virus\n" +
//            "Granulomatosis With Polyangiitis,Erdheim-Chester Disease,Stromal Keratitis\n" +
//            "Chronic Actinic Dermatitis,Erdheim-Chester Disease,Squamous Cell Carcinoma Of The Head And Neck\n" +
//            "Kaposis Sarcoma Allergic Rhinitis\n" +
//            "Celiac Disease Ileitis\n" +
//            "Cataract,Congenital Proliferative Vasculopathy And Hydraencephaly-Hydrocephaly Syndrome\n" +
//            "Sensory Peripheral Neuropathy\n" +
//            "Neuropathy,Hereditary Sensory,With Spastic Paraplegia Autosomal Recessive Sensory Neuropathy With Spastic Paraplegia\n" +
//            "Morphine Dependence\n" +
//            "Myocardial Infarction,Hiv-1,Myocardial Infarction,Decreased\n" +
//            "Cataract 8,Multiple Types Cataract,Congenital\n" +
//            "Fetal And Neonatal Alloimmune Thrombocytopenia\n" +
//            "Burning Mouth Syndrome,Monocytic Leukemia,Acute Monocytic Leukemia\n" +
//            "Nephropathy With Pretibial Epidermolysis Bullosa And Deafness,Skin Squamous Cell Carcinoma Salivary Gland Cancer\n" +
//            "Neurotrophic Keratopathy,Allergic Asthma Folliculitis\n" +
//            "Adult Xanthogranuloma,Rosai-Dorfman Disease,Histiocytic Sarcoma\n" +
//            "Bruton-Type Agammaglobulinemia\n" +
//            "Hemorrhagic Thrombocythemia,Polycythemia,Polycythemia Vera\n" +
//            "Primary Biliary Cirrhosis\n" +
//            "Immunodeficiency,Common Variable,3,Gastrointestinal System Disease,Cd19-Related Common Variable Immune Deficiency\n" +
//            "Generalized Eruptive Histiocytosis,Actinic Cheilitis,Cheilitis\n" +
//            "Mycobacterium Malmoense\n" +
//            "Mycobacterium Malmoense\n" +
//            "Mycobacterium Malmoense Relapsing Polychondritis\n" +
//            "Mycobacterium Malmoense Multifocal Motor Neuropathy\n" +
//            "Lepromatous Leprosy,Familial Chronic Lymphocytic Leukemia,Primary Effusion Lymphoma\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Sleeping Sickness\n" +
//            "Birbeck Granule Deficiency,Langerhans-Cell Histiocytosis,Alk+ Histiocytosis\n" +
//            "Secondary Syphilis,Dengue Disease,Dengue Fever,Protection Against\n" +
//            "Eaf,Lymphosarcoma,Chronic Lymphocytic Leukemia Show all 4\n" +
//            "Autoimmune Polyendocrinopathy Type 2 Refractory Celiac Disease\n" +
//            "Rheumatoid Arthritis Rheumatoid Arthritis,Progression Of\n" +
//            "Oligoarticular Juvenile Arthritis,Polyarticular Onset Juvenile Idiopathic Arthritis,Immunodeficiency 25\n" +
//            "Lymphoproliferative Syndrome 2,Pars Planitis,Human Immunodeficiency Virus Infectious Disease\n" +
//            "Primary Mediastinal Large B-Cell Lymphoma,Cheilitis,Autoimmune Myocarditis\n" +
//            "Sialadenitis Wegeners Granulomatosis\n" +
//            "Focal Segmental Glomerulosclerosis 3,Multilocular Cystic Renal Cell Carcinoma,Familial Idiopathic Steroid-Resistant Nephrotic Syndrome With Focal Segmental Hyalinosis\n" +
//            "Contagious Pustular Dermatitis Lobular Neoplasia\n" +
//            "Lice Infestation,Tungiasis Scabies\n" +
//            "Methylmalonic Aciduria Due To Transcobalamin Receptor Defect,Methylmalonic Aciduria And Homocystinuria Type Cble,Methylmalonic Aciduria And Homocystinuria Type Cblg\n" +
//            "Cd4+/cd56+ Hematodermic Neoplasm,Myeloid Sarcoma,Myelodysplastic Syndromes\n" +
//            "Atypical Neurofibroma,Kaposiform Hemangioendothelioma,Kaposis Sarcoma\n" +
//            "Platelet Glycoprotein Iv Deficiency,Coronary Heart Disease 7,Malaria,Cerebral,Reduced Risk Of\n" +
//            "Chronic Lymphocytic Leukemia,Plasmablastic Lymphoma,Familial Chronic Lymphocytic Leukemia Show all 4\n" +
//            "Cd3Delta Deficiency,Severe Combined Immune Deficiency,Autosomal Recessive,T Cell-Negative,B Cell-Positive,Nk Cell-Positive,Cd3D-Related,Immunodeficiency 19\n" +
//            "Immunodeficiency 18,Small Intestine Lymphoma,Hemometra\n" +
//            "Lung Cancer Susceptibility,Lung Cancer Multiple Myeloma\n" +
//            "Enteropathy-Associated T-Cell Lymphoma,Immunodeficiency Due To Defect In Cd3-Gamma Immunodeficiency 17,Cd3 Gamma Deficient\n" +
//            "Lymphatic System Disease,Okt4 Epitope Deficiency,Anogenital Venereal Wart\n" +
//            "Chromosome 20Q Deletion,Cd40 Deficiency,Blood Protein Disease\n" +
//            "Epstein-Barr Virus Hepatitis,Immunoglobulin G Deficiency,Idiopathic Posterior Uveitis8\n" +
//            "Superficial Keratitis,Acute Monoblastic Leukemia,Gastrointestinal Lymphoma\n" +
//            "Hemolytic Uremic Syndrome,Atypical 2,Measles,Cd46-Related Atypical Hemolytic-Uremic Syndrome\n" +
//            "Neonatal Meningitis\n" +
//            "Type Ii Mixed Cryoglobulinemia,Thymic Epithelial Tumor,Thymic Carcinoma\n" +
//            "Chronic Lymphocytic Leukemia,Chronic Myeloid Leukemia,Aplastic Anemia\n" +
//            "Intestinal Tuberculosis\n" +
//            "Acute Hemorrhagic Conjunctivitis,Hemoglobinuria,Malaria\n" +
//            "Hemorrhagic Fever With Renal Syndrome,Vaccinia,Oral Lichen Planus\n" +
//            "Hemolytic Anemia,Cd59-Mediated,With Or Without Immune-Mediated Polyneuropathy,Hemolytic Anemia,Hemoglobinuria\n" +
//            "Wolman Disease\n" +
//            "Oropharynx Cancer Multiple Sclerosis\n" +
//            "Melanoma Platelet Storage Pool Deficiency\n" +
//            "Verruciform Xanthoma Of Skin,Rhinoscleroma,Cutaneous Fibrous Histiocytoma\n" +
//            "Coccidioidomycosis,Stromal Keratitis Intermediate Uveitis\n" +
//            "Pityriasis Lichenoides Et Varioliformis Acuta,T-Cell Leukemia,Hepatosplenic T-Cell Lymphoma\n" +
//            "Mantle Cell Lymphoma,Non-Hodgkin Lymphoma,Acute Myocarditis\n" +
//            "Agammaglobulinemia 3,Tabes Dorsalis,Berger Disease4\n" +
//            "Agammaglobulinemia 6,Familial Chronic Lymphocytic Leukemia,Plasmacytoma\n" +
//            "Sialadenitis,Lymphocytic Choriomeningitis Wegeners Granulomatosis\n" +
//            "Immunodeficiency,Common Variable,6,Immunodeficiency,Common Variable,3,Malaria Show all 4\n" +
//            "Prostate Cancer,Cervical Cancer,Pancreatic Cancer\n" +
//            "Dysgammaglobulinemia\n" +
//            "Benign Mesothelioma,Lymphocytic Choriomeningitis,Allergic Encephalomyelitis\n" +
//            "Primary Cutaneous Aggressive Epidermotropic Cd8+ T-Cell Lymphoma,Cd8 Deficiency,Familial,Alveolar Echinococcosis\n" +
//            "Acquired Immunodeficiency Syndrome,Oral Candidiasis,Protein S Deficiency\n" +
//            "Splenic Abscess,Familial Hypercholesterolemia C1 Inhibitor Deficiency\n" +
//            "Cat Eye Syndrome\n" +
//            "Juvenile Type Testicular Granulosa Cell Tumor,Testicular Granulosa Cell Tumor,Testicular Fibroma\n" +
//            "Xeroderma Pigmentosum,Group D\n" +
//            "Craniosynostosis,Anal Anomalies,And Porokeratosis,Porokeratosis Imperforate Anus\n" +
//            "Congenital Dyserythropoietic Anemia,Congenital Dyserythropoietic Anemia Type I,Dyserythropoietic Anemia,Congenital,Type Ia\n" +
//            "Congenital Dyserythropoietic Anemia Type 3\n" +
//            "Chancroid Corneal Dystrophy Thiel Behnke Type\n" +
//            "Cartilage-Hair Hypoplasia\n" +
//            "Hyperapobetalipoproteinemia,Plague,Malaria Show all 4\n" +
//            "Brain Cancer\n" +
//            "Noma,Wiskott-Aldrich Syndrome,Scott Syndrome Show all 4\n" +
//            "Myotonic Dystrophy\n" +
//            "Myotonic Dystrophy\n" +
//            "Myotonic Dystrophy\n" +
//            "Quadriplegia\n" +
//            "Scarlet Fever\n" +
//            "Rothmund-Thomson Syndrome\n" +
//            "Cystoisosporiasis Poikiloderma With Neutropenia\n" +
//            "Meier-Gorlin Syndrome 5,Cervical Intraepithelial Neoplasia,Meier-Gorlin Syndrome\n" +
//            "Hereditary Wilms Tumor,Cdc73-Related Disorders,Parathyroid Adenoma With Cystic Changes\n" +
//            "Dermatophytosis\n" +
//            "Clonorchiasis\n" +
//            "Herpes Simplex\n" +
//            "Roberts Syndrome\n" +
//            "Mucinous Cystadenocarcinoma\n" +
//            "Diphyllobothriasis\n" +
//            "Malignant Epithelial Mesothelioma,Trichofolliculoma,Atrophic Lichen Planus\n" +
//            "Aneurysmal Bone Cysts Malignant Peritoneal Mesothelioma\n" +
//            "Meconium Aspiration Syndrome\n" +
//            "Atherosclerosis\n" +
//            "Mental Retardation,Autosomal Dominant 6 16Q24.3 Microdeletion Syndrome\n" +
//            "Oxyphilic Adenoma,Tubulocystic Carcinoma,Mucinous Tubular And Spindle Cell Carcinoma\n" +
//            "Van Maldergem Syndrome 1\n" +
//            "Pseudomyxoma Peritonei,Hypoplastic Left Heart Syndrome Malignant Mesothelioma\n" +
//            "Usher Syndrome,Type 1D,Dfnb12 Nonsyndromic Hearing Loss And Deafness,Usher Syndrome,Type 1D/f Digenic\n" +
//            "Eem Syndrome,Juvenile Macular Degeneration And Hypotrichosis,Diffuse Gastric Cancer\n" +
//            "Angiosarcoma Of The Scalp,Angiosarcoma,Perineurioma\n" +
//            "Charge Syndrome\n" +
//            "Learning Disability\n" +
//            "Benign Epilepsy With Centrotemporal Spikes\n" +
//            "Cone-Rod Dystrophy 15,Retinitis Pigmentosa 65,Retinitis Pigmentosa Show all 4\n" +
//            "Fibromuscular Dysplasia Alpha 1-Antitrypsin Deficiency\n" +
//            "Thyroid Lymphoma,Melanoma Male Germ Cell Tumor\n" +
//            "Star Syndrome\n" +
//            "Neuroblastoma\n" +
//            "Childhood Endodermal Sinus Tumor,Neuroblastoma Endodermal Sinus Tumor\n" +
//            "Amyotrophic Lateral Sclerosis Lateral Sclerosis\n" +
//            "Melanoma,Male Germ Cell Tumor Tetraploidy\n" +
//            "Mantle Cell Lymphoma\n" +
//            "Oral Cancer\n" +
//            "Hormone Producing Pituitary Cancer Oral Cancer\n" +
//            "Juxtacortical Osteosarcoma,Spindle Cell Liposarcoma,Atypical Mole Syndrome\n" +
//            "Aneurysmal Bone Cysts,Alzheimers Disease Neuroblastoma\n" +
//            "Tauopathy\n" +
//            "Mikulicz Disease\n" +
//            "Primary Autosomal Recessive Microcephaly Type 3,Primary Autosomal Recessive Microcephaly Type 1,Microcephaly\n" +
//            "Primary Autosomal Recessive Microcephaly Type 12,Gastroesophageal Junction Adenocarcinoma,Primary Autosomal Recessive Microcephaly Type 1\n" +
//            "Photosensitive Trichothiodystrophy\n" +
//            "Hiv-1\n" +
//            "Diabetes Mellitus,Noninsulin-Dependent\n" +
//            "Chromosome 5Q Deletion\n" +
//            "Angelman Syndrome-Like,Epileptic Encephalopathy,Early Infantile,2,Cdkl5-Related Angelman-Like Syndrome\n" +
//            "Thoracic Cancer,Bladder Transitional Cell Carcinoma,Tongue Cancer\n" +
//            "Periampullary Adenocarcinoma,Multiple Endocrine Neoplasia Type 4,Wermer Syndrome\n" +
//            "Beckwith-Wiedemann Syndrome Due To Cdkn1C Mutation,Image Syndrome,Abdominal Wall Defect\n" +
//            "Anthracosis,Melanoma-Pancreatic Cancer Syndrome,Gallbladder Adenoma6\n" +
//            "Skin Melanoma,Thyroid Lymphoma,Laryngeal Squamous Cell Carcinoma\n" +
//            "Intracranial Aneurysm,Endometriosis,Periodontitis\n" +
//            "Anaplastic Oligodendroglioma,Oligodendroglioma,Chromosome 1P Deletion\n" +
//            "Melanoma,Malignant,Somatic Osteosarcoma\n" +
//            "Liver Cancer,Bubonic Plague,Estrogen-Receptor Negative Breast Cancer\n" +
//            "Cornelia De Lange Syndrome 1\n" +
//            "Cornelia De Lange Syndrome 2\n" +
//            "Hepatoblastoma\n" +
//            "Holoprosencephaly 11,Cdon-Related Holoprosencephaly,Septopreoptic Holoprosencephaly\n" +
//            "Paraneoplastic Cerebellar Degeneration,Cerebellar Degeneration Paraneoplastic Neurologic Disorders\n" +
//            "Paraneoplastic Neurologic Disorders Gait Apraxia\n" +
//            "Paraneoplastic Neurologic Disorders\n" +
//            "Breast And Colorectal Cancer,Prostate Cancer,Breast Cancer\n" +
//            "Hypotrichosis 2,Guttate Psoriasis,Peeling Skin Syndrome 1\n" +
//            "Meier-Gorlin Syndrome 4,Meier-Gorlin Syndrome,Meier-Gorlin Syndrome 1\n" +
//            "Colon Adenocarcinoma,Mesenchymal Chondrosarcoma,Adult Acute Lymphocytic Leukemia\n" +
//            "Chronic Cholangitis,Bladder Adenocarcinoma,Cervical Adenocarcinoma\n" +
//            "Acute Myeloid Leukemia Adult Acute Lymphocytic Leukemia\n" +
//            "Y Chromosome Infertility\n" +
//            "Y Chromosome Infertility\n" +
//            "Gingival Recession\n" +
//            "Prostate Cancer\n" +
//            "Endometrial Carcinoma,Gonorrhea Adenomatoid Tumor\n" +
//            "Deafness,Autosomal Dominant 4B Deafness,Autosomal Dominant 3B\n" +
//            "Gastric Duplication Cysts,Pancreatic Cystadenoma,Carcinoma Showing Thymus-Like Differentiation\n" +
//            "Endometrial Carcinoma Papillary Thyroid Carcinoma\n" +
//            "Urethral Diverticulum,Urachal Cancer,Linitis Plastica\n" +
//            "Cholangiocarcinoma\n" +
//            "Adenocarcinoma In Situ,Goblet Cell Carcinoid,Colorectal Adenocarcinoma\n" +
//            "Chronic Myeloid Leukemia\n" +
//            "Cytogenetically Normal Acute Myeloid Leukemia,Inherited Acute Myeloid Leukemia,Acute Myeloid Leukemia With Cebpa Somatic Mutations\n" +
//            "Acute Promyelocytic Leukemia\n" +
//            "Neutrophil-Specific Granule Deficiency,Acute Lymphoblastic Leukemia Severe Congenital Neutropenia\n" +
//            "Normal Pressure Hydrocephalus\n" +
//            "Cat Eye Syndrome Coloboma\n" +
//            "Polyarteritis Nodosa,Sneddon Syndrome,Polyarteritis Nodosa,Childhood-Onset\n" +
//            "Cat Eye Syndrome\n" +
//            "Cat Eye Syndrome\n" +
//            "Cat Eye Syndrome\n" +
//            "Cat Eye Syndrome\n" +
//            "Cat Eye Syndrome\n" +
//            "Cat Eye Syndrome\n" +
//            "Cat Eye Syndrome\n" +
//            "Maturity-Onset Diabetes Of The Young,Type 8,Exocrine Pancreatic Insufficiency,Maturity-Onset Diabetes Of The Young,Type 1\n" +
//            "Pancreatic Steatorrhea,Steatorrhea,Hepatopulmonary Syndrome Show all 4\n" +
//            "Actinobacillosis,Pancreatic Steatorrhea,Rift Valley Fever\n" +
//            "Myotonic Dystrophy\n" +
//            "Neuroblastoma\n" +
//            "Seizure Disorder\n" +
//            "Celiac Disease 10 Celiac Disease\n" +
//            "Celiac Disease 11 Celiac Disease\n" +
//            "Celiac Disease 12 Celiac Disease\n" +
//            "Celiac Disease 13 Celiac Disease\n" +
//            "Celiac Disease 2 Celiac Disease\n" +
//            "Celiac Disease 5 Celiac Disease\n" +
//            "Celiac Disease 6,Autoimmune Disease 5 Celiac Disease\n" +
//            "Celiac Disease 7 Celiac Disease\n" +
//            "Celiac Disease 8 Celiac Disease\n" +
//            "Celiac Disease 9 Celiac Disease\n" +
//            "Spina Bifida,Neural Tube Defects Craniorachischisis\n" +
//            "Protein S Deficiency\n" +
//            "Colon Cancer\n" +
//            "Cryptosporidiosis\n" +
//            "Neuroblastoma\n" +
//            "Raynaud Disease,Telangiectasis,Primary Biliary Cirrhosis\n" +
//            "Limited Scleroderma\n" +
//            "Primary Biliary Cirrhosis\n" +
//            "Microcephaly 13,Primary,Autosomal Recessive\n" +
//            "Primary Autosomal Recessive Microcephalies And Seckel Syndrome Spectrum Disorders,Primary Autosomal Recessive Microcephaly Type 6,Seckel Syndrome Type 4\n" +
//            "Intracranial Primitive Neuroectodermal Tumor\n" +
//            "Primary Autosomal Recessive Microcephaly Type 8,Primary Autosomal Recessive Microcephalies And Seckel Syndrome Spectrum Disorders,Diabetic Macular Edema\n" +
//            "Seckel Syndrome Type 5,Primary Autosomal Recessive Microcephaly Type 9,Microcephaly,Primary Autosomal Recessive\n" +
//            "Nephronophthisis 15,Senior-Loken Syndrome 1 Nephronophthisis\n" +
//            "Morbid Obesity And Spermatogenic Failure Morbid Obesity\n" +
//            "Bardet-Biedl Syndrome 14,Senior-Loken Syndrome 6,Meckel Syndrome\n" +
//            "Joubert Syndrome 15,Joubert Syndrome With Ocular Anomalies,Joubert Syndrome 8\n" +
//            "Colon Cancer\n" +
//            "Mosaic Variegated Aneuploidy Syndrome 2,Mosaic Variegated Aneuploidy Syndrome Mosaic Variegated Aneuploidy Syndrome 1\n" +
//            "Seckel Syndrome Type 6,Primary Autosomal Recessive Microcephalies And Seckel Syndrome Spectrum Disorders,Seckel Syndrome Show all 4\n" +
//            "Nail Disease Jawad Syndrome\n" +
//            "Nephronophthisis 18,Infantile Nephronophthisis Nephronophthisis 1,Juvenile\n" +
//            "Breast Cancer\n" +
//            "Cytochrome-C Oxidase Deficiency Disease\n" +
//            "Osteoporotic Fracture,Norrie Disease Lung Cancer Susceptibility\n" +
//            "Retinitis Pigmentosa\n" +
//            "Retinitis Pigmentosa 26,Cerkl-Related Retinitis Pigmentosa,Retinitis Pigmentosa\n" +
//            "Ichthyosis,Congenital,Autosomal Recessive 9,Weill-Marchesani-Like Syndrome,Ichthyosis,Congenital,Autosomal Recessive 2 Show all 4\n" +
//            "Carboxylesterase 1 Deficiency Reye Syndrome\n" +
//            "North American Indian Childhood Cirrhosis\n" +
//            "Dental Pulp Necrosis\n" +
//            "Xeroderma Pigmentosum,Group C\n" +
//            "Hyperalphalipoproteinemia,Cetp-Related Hyperalphalipoproteinemia,Hyperlipoproteinemia Type Iii\n" +
//            "Hemolytic Uremic Syndrome,Atypical 4,Complement Factor B Deficiency,Cfb-Related Atypical Hemolytic-Uremic Syndrome\n" +
//            "Heterotaxy,Visceral,2,Autosomal,Cfc1-Related Conotruncal Heart Malformations,Biliary Atresia With Splenic Malformation Syndrome\n" +
//            "Complement Factor D Deficiency,Anorexia Nervosa,Meningococcal Infection Show all 4\n" +
//            "Spirochetes Disease,Hemolytic Uremic Syndrome,Atypical 1,Complement Factor H Deficiency\n" +
//            "Atypical Hemolytic-Uremic Syndrome,Macular Degeneration,Age-Related,Reduced Risk Of,Lyme Disease\n" +
//            "Dense Deposit Disease\n" +
//            "Cfhr3 And Cfhr1-Related Atypical Hemolytic-Uremic Syndrome,Atypical Hemolytic-Uremic Syndrome,Macular Degeneration,Age-Related,Reduced Risk Of\n";
//            "Kuhnt-Junius Degeneration Atypical Hemolytic-Uremic Syndrome\n" +
//            "Dense Deposit Disease/membranoproliferative Glomerulonephritis Type Ii,Nephropathy Due To Cfhr5 Deficiency,Membranoproliferative Glomerulonephritis\n" +
//            "Macular Degeneration,Age-Related,13,Hemolytic Uremic Syndrome,Atypical 3,Complement Factor I Deficiency\n" +
//            "Corticobasal Degeneration Smith-Lemli-Opitz Syndrome\n" +
//            "Cfl2-Related Nemaline Myopathy,Nemaline Myopathy 7,Autosomal Recessive,Myopathy\n" +
//            "Cadasil,Hodgkins Lymphoma,Cervical Intraepithelial Neoplasia\n" +
//            "Meconium Ileus In Cystic Fibrosis,Cystic Fibrosis Meconium Ileus\n" +
//            "Cystic Fibrosis\n" +
//            "Properdin Deficiency,Subacute Bacterial Endocarditis,Complement Deficiency\n" +
//            "Craniofacioskeletal Syndrome\n" +
//            "Myopathy,Congenital,With Fiber-Type Disproportion,X-Linked\n" +
//            "Congenital Absence Of The Vas Deferens,Mite Infestation,Young Syndrome\n" +
//            "Cystic Fibrosis\n" +
//            "Pineal Region Germinoma,Scalp Dermatosis,Ovarian Remnant Syndrome\n" +
//            "Superior Vena Cava Syndrome,Central Nervous System Germ Cell Tumor,Testicular Leydig Cell Tumor\n" +
//            "Corpus Luteum Cyst,Malignant Sertoli Cell Tumor,Gestational Choriocarcinoma\n" +
//            "Gestational Choriocarcinoma,Seminoma,Sacrococcygeal Teratoma\n" +
//            "Cryptococcosis\n" +
//            "Aromatase Excess Syndrome Estrogen Excess\n" +
//            "Alzheimers Disease\n" +
//            "Congenital Myasthenic Syndrome With Episodic Apnea,Tendinosis,Chat-Related Congenital Myasthenic Syndrome\n" +
//            "Ftdals2 Amyotrophic Lateral Sclerosis 14,With Or Without Frontotemporal Dementia\n" +
//            "Epileptic Encephalopathy,Childhood-Onset,Myoclonic-Astastic Epilepsy,Lennox-Gastaut Syndrome\n" +
//            "Dermatomyositis\n" +
//            "Right Bundle Branch Block\n" +
//            "Neuroblastoma\n" +
//            "Influenza,Pitt-Hopkins Syndrome Developmental Coordination Disorder\n" +
//            "Hypogonadotropic Hypogonadism 5 With Or Without Anosmia,Charge Syndrome,Chd7-Related Isolated Gonadotropin-Releasing Hormone Deficiency\n" +
//            "Autism 18 Charge Syndrome\n" +
//            "Chordoma\n" +
//            "Coronary Artery Anomaly\n" +
//            "Coronary Heart Disease 2\n" +
//            "Coronary Heart Disease 3 Autism Spectrum Disorder\n" +
//            "Coronary Heart Disease 4\n" +
//            "Coronary Heart Disease 8\n" +
//            "Coronary Heart Disease 9\n" +
//            "Congenital Heart Defects,Multiple Types,3\n" +
//            "Corneal Endothelial Dystrophy 1,Autosomal Dominant Posterior Polymorphous Corneal Dystrophy\n" +
//            "Hypoxia\n" +
//            "Breast And Colorectal Cancer,Chek2-Related Susceptibility To Breast Cancer,Chek2-Related Susceptibility To Breast And Colorectal Cancer\n" +
//            "Oculopharyngeal Muscular Dystrophy,Spinocerebellar Ataxia Type 8,Huntingtons Disease\n" +
//            "Narcolepsy\n" +
//            "Non-Secreting Paraganglioma,Tubular Adenocarcinoma,Autoimmune Atrophic Gastritis1\n" +
//            "Female Breast Carcinoma,Silent Pituitary Adenoma,Glucagonoma\n" +
//            "Asthma-Related Traits 7,Schizophrenia,Pelvic Inflammatory Disease\n" +
//            "Asthma,Neuromyelitis Optica Gauchers Disease\n" +
//            "Acute Myeloid Leukemia,Leukemia Myeloid Leukemia\n" +
//            "Chitotriosidase Deficiency,Crimean-Congo Hemorrhagic Fever,Filariasis\n" +
//            "Bronchiolitis Obliterans Organizing Pneumonia,Compartment Syndrome,West Nile Encephalitis\n" +
//            "Spermatic Cord Torsion,Japanese Spotted Fever,Cytoplasmic Body Myopathy\n" +
//            "Distal Monosomy 3P\n" +
//            "Choroideremia,Charcot-Marie-Tooth Disease Type 4,Charcot-Marie-Tooth Disease,Dominant Intermediate D\n" +
//            "Choroideremia,Usher Syndrome Type Ii,Usher Syndrome Show all 4\n" +
//            "Pontocerebellar Hypoplasia,Type 8 Pontocerebellar Hypoplasia\n" +
//            "Fibrosarcomatous Osteosarcoma,Adenocarcinoma Breast Adenocarcinoma\n" +
//            "Frontotemporal Dementia,Chromosome 3-Linked,Chmp2B-Related Frontotemporal Dementia,Dementia,Familial,Nonspecific\n" +
//            "Non-Small Cell Lung Carcinoma\n" +
//            "Cataract 31,Multiple Types,Hiv-1,Cataract 4,Multiple Types\n" +
//            "Duane Retraction Syndrome Duane Syndrome Type 2\n" +
//            "Schizophrenia\n" +
//            "Hypothyroidism,Congenital,Nongoitrous,3\n" +
//            "Inclusion Conjunctivitis\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Mucopolysaccharidoses,Morquio Syndrome B Sly Syndrome\n" +
//            "Newborn Respiratory Distress Syndrome\n" +
//            "Megalocornea 1,X-Linked,Lymphocyte-Rich Classical Hodgkin Lymphoma,Corneal Degeneration\n" +
//            "Schizophrenia,Frontal Lobe Epilepsy Autosomal Dominant Nocturnal Frontal Lobe Epilepsy\n" +
//            "Nervous System Disease,Central Nervous System Disease,Congenital Heart Block\n" +
//            "Tendinosis,Neurogenic Bladder,Dilated Cardiomyopathy\n" +
//            "Prune Belly Syndrome,Cholinergic Urticaria,Fetal Alcohol Syndrome\n" +
//            "Cannabis Dependence Schizophrenia\n" +
//            "Chrna1-Related Congenital Myasthenic Syndrome,Chrna1-Related Multiple Pterygium Syndrome,Lethal Type,Myasthenia Gravis\n" +
//            "Epilepsy,Nocturnal Frontal Lobe,Type 4,Chrna2-Related Nocturnal Frontal Lobe Epilepsy,Autosomal Dominant,Frontal Lobe Epilepsy\n" +
//            "Lung Cancer Susceptibility,Nicotine Dependence,Lung Cancer\n" +
//            "Epilepsy,Nocturnal Frontal Lobe,1,Nicotine Addiction,Chrna4-Related Nocturnal Frontal Lobe Epilepsy,Autosomal Dominant\n" +
//            "Lung Cancer Susceptibility 2,Lung Cancer Susceptibility,Nicotine Dependence\n" +
//            "Alcohol Dependence,Frontal Lobe Epilepsy Autosomal Dominant Nocturnal Frontal Lobe Epilepsy\n" +
//            "Schizophrenia,Neurophysiologic Defect In,Schizophrenia,15Q13.3 Microdeletion\n" +
//            "Nicotine Addiction\n" +
//            "Slow-Channel Congenital Myasthenic Syndrome,Chrnb1-Related Congenital Myasthenic Syndrome,Nicotine Dependence\n" +
//            "Epilepsy,Nocturnal Frontal Lobe,3,Frontal Lobe Epilepsy,Chrnb2-Related Nocturnal Frontal Lobe Epilepsy,Autosomal Dominant\n" +
//            "Epilepsy With Generalized Tonic-Clonic Seizures,Juvenile Absence Epilepsy,Nicotine Dependence\n" +
//            "Nicotine Dependence,Nicotine Addiction Lung Cancer\n" +
//            "Multiple Pterygium Syndrome Lethal Type,Cerebellar Medulloblastoma,Chrnd-Related Congenital Myasthenic Syndrome\n" +
//            "Chrne-Related Congenital Myasthenic Syndrome,Slow-Channel Congenital Myasthenic Syndrome,Congenital Myasthenic Syndrome\n" +
//            "Neonatal Myasthenia Gravis,Pterygium,Cystic Lymphangioma\n" +
//            "Macular Corneal Dystrophy\n" +
//            "Chronic Lymphocytic Leukemia Cannabis Dependence\n" +
//            "Ehlers-Danlos Syndrome,Musculocontractural Type,Ehlers-Danlos Syndrome,Musculocontractural Type 1,Clubfoot\n" +
//            "Spondyloepiphyseal Dysplasia With Congenital Joint Dislocations,Enophthalmos,Larsen Syndrome,Autosomal Recessive\n" +
//            "Macular Corneal Dystrophy,Mucopolysaccharidoses,Morquio Syndrome B Show all 4\n" +
//            "Macular Corneal Dystrophy,Corneal Disease,Astigmatism\n" +
//            "Peeling Skin Syndrome Type A Peeling Skin Syndrome\n" +
//            "Temtamy Preaxial Brachydactyly Syndrome,Colorectal Cancer Brachydactyly\n" +
//            "Prostate Cancer\n" +
//            "Cocoon Syndrome Skin Papilloma\n" +
//            "Papillary Thyroid Carcinoma\n" +
//            "Deafness,Autosomal Recessive 48,Usher Syndrome Type 1J,Usher Syndrome,Type Ij\n" +
//            "Pityriasis Versicolor Oligoastrocytoma\n" +
//            "Obesity\n" +
//            "Lipodystrophy,Familial Partial,Type 5\n" +
//            "Hearing Loss,Cisplatin-Induced\n" +
//            "Staphylococcal Toxic Shock Syndrome,Mhc Class Ii Deficiency,Bare Lymphocyte Syndrome,Type Ii,Complementation Group A\n" +
//            "Ciliary Dyskinesia,Primary,2\n" +
//            "Primary Ciliary Dyskinesia 4\n" +
//            "Primary Ciliary Dyskinesia 8\n" +
//            "Lymphangitis,Lumbar Disc Disease Back Pain\n" +
//            "Carotid Intimal Medial Thickness\n" +
//            "Dysthymic Disorder\n" +
//            "North American Indian Childhood Cirrhosis,Neonatal Jaundice,Intrahepatic Cholestasis Show all 4\n" +
//            "Wolfram Syndrome 2\n" +
//            "Waterhouse-Friderichsen Syndrome,Wolfram Syndrome 2 Wolfram Syndrome\n" +
//            "Bacteremia,Tuberculosis,Malaria\n" +
//            "Schizophrenia Bipolar Disorder\n" +
//            "Ventricular Septal Defect 2,Atrial Septal Defect 8,Ventricular Septal Defect\n" +
//            "Cervical Dystonia\n" +
//            "Inclusion Conjunctivitis\n" +
//            "Steroid-Induced Glaucoma Split Foot\n" +
//            "Prostate Rhabdomyosarcoma,Brain Ischemia Myocardial Infarction\n" +
//            "Ovarian Cystadenoma\n" +
//            "Myocardial Infarction,Mcleod Syndrome,Hemophilia B Show all 4\n" +
//            "Prostate Rhabdomyosarcoma\n" +
//            "Prostate Rhabdomyosarcoma\n" +
//            "Prostate Rhabdomyosarcoma\n" +
//            "Mantle Cell Lymphoma\n" +
//            "Fatty Liver Disease\n" +
//            "Spinocerebellar Ataxia Autosomal Recessive 6\n" +
//            "Pontocerebellar Hypoplasia Type 3 Pontocerebellar Hypoplasia\n" +
//            "Cold-Induced Sweating Syndrome 2\n" +
//            "Meconium Ileus,Ileus Cystic Fibrosis\n" +
//            "Bestrophinopathy,Cystic Fibrosis Breast Cancer\n" +
//            "Cystic Fibrosis Bestrophinopathy\n" +
//            "Cold-Induced Sweating Syndrome 2,Clcf1-Related Cold-Induced Sweating Syndrome Including Crisponi Syndrome,Cold-Induced Sweating Syndrome\n" +
//            "Thomsen Disease,Thomsens Myotonia,Beckers Myotonia\n" +
//            "Epilepsy,Idiopathic Generalized 11,Leukoencephalopathy With Ataxia,Constipation\n" +
//            "Microphthalmia With Linear Skin Defects Syndrome,Ocular Albinism Dents Disease\n" +
//            "Dent Disease 1,Dents Disease,Nephrolithiasis\n" +
//            "Clcn7-Related Osteopetrosis,Osteopetrosis Autosomal Dominant Type 2,Osteopetrosis Autosomal Recessive 4\n" +
//            "Renal Glycosuria,Bartter Disease,Diabetes Insipidus\n" +
//            "Bartter Syndrome Type 3,Bartter Syndrome,Type 4B,Digenic,Bartter Syndrome Type 4B\n" +
//            "Sclerosing Cholangitis,Cholangitis,Ichthyosis,Leukocyte Vacuoles,Alopecia,And Sclerosing Cholangitis\n" +
//            "Hepatocellular Carcinoma Follicular Thyroid Carcinoma\n" +
//            "Microcystic Adenoma\n" +
//            "Deafness,Autosomal Recessive 29,Dfnb29 Nonsyndromic Hearing Loss And Deafness Deafness,Digenic,Gjb2/gjb3\n" +
//            "Malignant Peritoneal Mesothelioma\n" +
//            "Nephrocalcinosis,Hypomagnesemia Primary Hypomagnesemia 3,Renal\n" +
//            "Ulcerative Colitis Colitis\n" +
//            "Hypomagnesemia,Renal,With Ocular Involvement,Chorioretinal Scar,Hypomagnesemia 5,Renal,With Ocular Involvement\n" +
//            "Gastric Cancer\n" +
//            "Endometrial Carcinoma,Pancreatoblastoma,Mucoepidermoid Carcinoma\n" +
//            "Ovarian Cystadenoma,Williams-Beuren Syndrome,Pancreatic Cancer\n" +
//            "Glioblastoma Multiforme,Pancreatoblastoma,Idiopathic Pulmonary Fibrosis\n" +
//            "Hepatitis C Virus,Hepatitis C,Monosomy 22\n" +
//            "Oxyphilic Adenoma,Ovarian Cancer,Lung Cancer\n" +
//            "Oxyphilic Adenoma,Renal Cell Carcinoma Chromophobe Renal Cell Carcinoma\n" +
//            "Hepatitis C Virus,Hepatitis C,Endolymphatic Hydrops\n" +
//            "Acute Promyelocytic Leukemia,Chronic Granulomatous Disease Piebaldism\n" +
//            "Liver Cancer\n" +
//            "Multiple Sclerosis,Rheumatoid Arthritis Diabetes Mellitus\n" +
//            "Thrombocytopenia Due To Platelet Alloimmunization\n" +
//            "Eccrine Acrospiroma,Epidermal Appendage Tumor,Acrospiroma\n" +
//            "Methylmalonic Acidemia\n" +
//            "Ovarian Cancer Type 1 Diabetes Mellitus\n" +
//            "Pneumonic Plague\n" +
//            "Chromoblastomycosis\n" +
//            "Lassa Fever\n" +
//            "Intrauterine Infections,Severe Acute Respiratory Syndrome,Sars Infection,Protection Against Show all 4\n" +
//            "Dengue Disease\n" +
//            "Transient Arthritis,Aspergillosis,Mycobacterium Abscessus\n" +
//            "Infertility\n" +
//            "Mental Retardation,X-Linked,Syndromic 32\n" +
//            "Pancreatic Cancer\n" +
//            "Deafness,Digenic,Gjb2/gjb3\n" +
//            "Schizophrenia\n" +
//            "Extratemporal Epilepsy,Distal Hereditary Motor Neuropathy,Type Ii Mental Retardation,Autosomal Recessive 2\n" +
//            "Williams-Beuren Syndrome Williams Syndrome\n" +
//            "3Mc Syndrome 2\n" +
//            "Leukemia,Chronic Lymphocytic 1\n" +
//            "Leukemia,Chronic Lymphocytic 2\n" +
//            "Leukemia,Chronic Lymphocytic 3\n" +
//            "Leukemia,Chronic Lymphocytic 4\n" +
//            "Leukemia,Chronic Lymphocytic 5 Follicular Lymphoma\n" +
//            "Chronic Lymphocytic Leukemia Mature B-Cell Neoplasm\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Short Bowel Syndrome,Intestinal Pseudo-Obstruction Intestinal Pseudoobstruction,Neuronal\n" +
//            "Juvenile Batten Disease,Batten Disease,Neuronal Ceroid Lipofuscinosis\n" +
//            "Peripheral Retinal Degeneration,Ceroid Lipofuscinosis Neuronal 5,Neuronal Ceroid-Lipofuscinoses\n" +
//            "Visual Epilepsy,Ceroid Lipofuscinosis,Neuronal,Kufs Type,Adult Onset,Ceroid Lipofuscinosis Neuronal 6\n" +
//            "Northern Epilepsy,Neuronal Ceroid-Lipofuscinoses,Late-Infantile Neuronal Ceroid Lipofuscinosis\n" +
//            "Croup Gingival Recession\n" +
//            "Obesity,Delayed Sleep Phase Syndrome,Seasonal Affective Disorder Show all 4\n" +
//            "Pontocerebellar Hypoplasia,Type 10\n" +
//            "Tularemia\n" +
//            "Perrault Syndrome 3,Perrault Syndrome,Legionnaires Disease Show all 4\n" +
//            "Obsessive-Compulsive Personality Disorder,Johanson-Blizzard Syndrome,Orofaciodigital Syndrome\n" +
//            "Cleft Lip\n" +
//            "Cleft Lip Lung Cancer\n" +
//            "Retinitis Pigmentosa 61,Usher Syndrome Type 3,Usher Syndrome Type 3A\n" +
//            "Usher Syndrome Type 3\n" +
//            "Usher Syndrome\n" +
//            "Inflammatory Myofibroblastic Tumor,Ophthalmia Neonatorum Renal Cell Carcinoma,Papillary,1\n" +
//            "Meningioma,Atrioventricular Septal Defect Digeorge Syndrome\n" +
//            "Cystadenoma,Ovarian Cystadenoma,Nonpapillary Renal Cell Carcinoma\n" +
//            "Myopia-2\n" +
//            "Duane Retraction Syndrome\n" +
//            "Idiopathic Interstitial Pneumonia,Vernal Keratoconjunctivitis,Renovascular Hypertension\n" +
//            "Charge Syndrome\n" +
//            "Capillary Malformations,Hereditary\n" +
//            "Kidney Sarcoma\n" +
//            "Capillary Malformations,Congenital,1,Somatic,Mosaic,Sturge-Weber Syndrome,Somatic,Mosaic Telangiectasis\n" +
//            "Cardiomyopathy,Dilated 1B Dilated Cardiomyopathy\n" +
//            "Cardiomyopathy,Dilated 1C,Dilated Cardiomyopathy,Left Ventricular Noncompaction 3,With Or Without Dilated Cardiomyopathy Show all 4\n" +
//            "Dilated Cardiomyopathy Cardiomyopathy,Dilated,1F And Limb-Girdle Muscular Dystrophy Type 1D\n" +
//            "Cardiomyopathy,Dilated,1H\n" +
//            "Cardiomyopathy,Dilated,1K\n" +
//            "Cardiomyopathy,Dilated,1Q\n" +
//            "Craniometaphyseal Dysplasia,Oculodentodigital Dysplasia,Hypoplastic Left Heart Syndrome 1\n" +
//            "Cardiomyopathy,Familial Hypertrophic,21\n" +
//            "Melanoma,Cutaneous Malignant,1,Melanoma,Cutaneous Malignant Melanoma Show all 4\n" +
//            "Melanoma,Cutaneous Malignant,4\n" +
//            "Melanoma,Cutaneous Malignant,7\n" +
//            "Myasthenia,Familial Infantile,1\n" +
//            "Charcot-Marie-Tooth Disease Type 1A,Charcot-Marie-Tooth Disease Type 1,Neuropathy,Recurrent,With Pressure Palsies\n" +
//            "Charcot-Marie-Tooth Disease Type 2B\n" +
//            "Charcot-Marie-Tooth Disease Type 2G\n" +
//            "Charcot-Marie-Tooth Disease,Dominant Intermediate A\n" +
//            "Ovarian Cystadenoma\n" +
//            "Charcot-Marie-Tooth Neuropathy,X-Linked Recessive,2\n" +
//            "Charcot-Marie-Tooth Neuropathy,X-Linked Recessive,3\n" +
//            "Nondystrophic Myotonia,Myotonic Dystrophy Type 2,Myotonic Dystrophy\n" +
//            "Carney Complex,Ectopic Thymus,Cowden Disease\n" +
//            "Dermoids Of Cornea\n" +
//            "Homocarnosinosis Diabetic Nephropathy\n" +
//            "Edwards Syndrome\n" +
//            "Retinitis Pigmentosa 49,Cnga1-Related Retinitis Pigmentosa,Retinitis Pigmentosa Show all 4\n" +
//            "Neuroblastoma\n" +
//            "Achromatopsia 2,Color Blindness,Oligocone Trichromacy\n" +
//            "Retinitis Pigmentosa 45,Cngb1-Related Retinitis Pigmentosa,Retinitis Pigmentosa Show all 4\n" +
//            "Achromatopsia 3,Stargardt Macular Degeneration,Stargardt Disease,Autosomal Recessive\n" +
//            "Urofacial Syndrome\n" +
//            "Hypomagnesemia 6,Hypomagnesemia 6,Renal Renal Hypomagnesemia 4\n" +
//            "Cone-Rod Dystrophy Amelogenesis Imperfecta Cone-Rod Dystrophy\n" +
//            "Precursor T-Cell Acute Lymphoblastic Leukemia Acute Lymphoblastic Leukemia\n" +
//            "Microsporidiosis\n" +
//            "Hair Disease,Schizophrenia,Beta-Mannosidosis\n" +
//            "Swayback\n" +
//            "Cannabis Dependence,Pertussis,Autoimmune Encephalitis\n" +
//            "Pertussis Chronic Pain\n" +
//            "Carnosinemia Diabetic Nephropathy\n" +
//            "Spinal Cord Injury,Acute Disseminated Encephalomyelitis,Learning Disability\n" +
//            "Cold-Induced Sweating Syndrome Choroid Cancer\n" +
//            "Compton-North Congenital Myopathy\n" +
//            "Epilepsy,Familial Adult Myoclonic,5,Human T-Cell Leukemia Virus Type 1,Adult T-Cell Leukemia\n" +
//            "3P Deletion Syndrome Distal Monosomy 3P\n" +
//            "Hypomyelination Neuropathy - Arthrogryposis\n" +
//            "Autism Susceptibility 15,Cortical Dysplasia-Focal Epilepsy Syndrome,Pitt-Hopkins-Like Syndrome 1\n" +
//            "8P11 Myeloproliferative Syndrome\n" +
//            "Cytochrome-C Oxidase Deficiency Disease,Leigh Syndrome With Cardiomyopathy Mitochondrial Cardiomyopathy\n" +
//            "Neurodegeneration With Brain Iron Accumulation 6\n" +
//            "Perilymphatic Fistula,Inner Ear Disease,Autoimmune Inner Ear Disease\n" +
//            "Congenital Disorder Of Glycosylation Type Iil,Cone Dystrophy,Progressive X-Linked,2 Shaheen Syndrome\n" +
//            "Cavitary Optic Disc Anomalies\n" +
//            "Cerebrocostomandibular-Like Syndrome,Congenital Disorder Of Glycosylation Type 2G Congenital Disorder Of Glycosylation Type Ii\n" +
//            "Hypercholesterolemia,Type 2 Diabetes Mellitus,Familial Hypercholesterolemia\n" +
//            "Congenital Disorder Of Glycosylation,Type Iij,Oculocerebrorenal Syndrome Congenital Disorder Of Glycosylation\n" +
//            "Congenital Disorder Of Glycosylation Type Iii\n" +
//            "Shaheen Syndrome,Congenital Disorder Of Glycosylation,Type Iih,Congenital Disorder Of Glycosylation Type Iil Show all 4\n" +
//            "Congenital Disorder Of Glycosylation Type Ii\n" +
//            "Congenital Disorder Of Glycosylation,Type Iih\n" +
//            "Cohen Syndrome\n" +
//            "Cohen Syndrome\n" +
//            "Ischemic Neuropathy,Differentiating Neuroblastoma Neuroblastoma\n" +
//            "Schmid Metaphyseal Chondrodysplasia,Cartilage Disease,Cartilage-Hair Hypoplasia\n" +
//            "Fibrochondrogenesis 1,Marshall Syndrome,Stickler Syndrome,Type 2\n" +
//            "Fibrochondrogenesis 2,Otospondylomegaepiphyseal Dysplasia,Back Pain\n" +
//            "Ullrich Congenital Muscular Dystrophy,Exostosis,Bethlem Myopathy Show all 4\n" +
//            "Odontogenic Myxoma,Collagenous Colitis Keratoderma,Palmoplantar,Punctate Type Ia\n" +
//            "Lichen Planus Pemphigoides,Pemphigoid Gestationis,Herpes Gestationis\n" +
//            "Knobloch Syndrome,Encephalocele,Knobloch Syndrome Type I\n" +
//            "Ehlers-Danlos Syndrome,Type Vii,Oi Type Ii,Caffey Disease\n" +
//            "Col1A1/2-Related Osteogenesis Imperfecta,High Bone Mass Osteogenesis Imperfecta,Perinatally Lethal Osteogenesis Imperfecta\n" +
//            "Alzheimers Disease Antisocial Personality Disorder\n" +
//            "Asthma\n" +
//            "Steel Syndrome\n" +
//            "Spondyloepimetaphyseal Dysplasia,Strudwick Type,Achondrogenesis Type Ii,Czech Dysplasia Metatarsal Type4\n" +
//            "Ehlers-Danlos Syndrome Type Iv,Ehlers-Danlos Syndrome,Hypermobility Type,Familial Cervical Artery Dissections\n" +
//            "Brain Small Vessel Disease With Axenfeld-Rieger Anomaly,Brain Small Vessel Disease With Hemorrhage,Col4A1-Related Disorders\n" +
//            "Porencephaly 2,Porencephaly,Familial Porencephaly\n" +
//            "Cerebral Arteritis,Goodpasture Syndrome,Autosomal Dominant Alport Syndrome\n" +
//            "Autosomal Recessive Alport Syndrome Goodpasture Syndrome\n" +
//            "Autosomal Recessive Alport Syndrome,Col4A4-Related Nephropathy,Thin Basement Membrane Nephropathy\n" +
//            "Malignant Cylindroma,Alport Syndrome And Thin Basement Membrane Nephropathy,Alport Syndrome\n" +
//            "Leiomyomatosis,Deafness,X-Linked 6,Deafness,X-Linked 4\n" +
//            "Ehlers-Danlos Syndrome,Classic Type,Col5A1-Related,Annular Pancreas,Nail-Patella Syndrome\n" +
//            "Ehlers-Danlos Syndrome,Classic Type,Col5A2-Related,Familial Cervical Artery Dissections,Stickler Syndrome\n" +
//            "Arterial Tortuosity Syndrome Pulmonary Valve Stenosis\n" +
//            "Collagen Type Vi-Related Disorders,Spinal Cord Disease,Bethlem Myopathy\n" +
//            "Autosomal Recessive Myosclerosis Myopathy,Myosclerosis,Autosomal Recessive,Myosclerosis,Congenital\n" +
//            "Bethlem Myopathy,Ullrich Congenital Muscular Dystrophy,Tenosynovial Giant Cell Tumor\n" +
//            "Ullrich Congenital Muscular Dystrophy Bethlem Myopathy\n" +
//            "Epidermolysis Bullosa,Pretibial,Dominant Dystrophic Epidermolysis Bullosa,Transient Bullous Dermolysis Of The Newborn\n" +
//            "Posterior Polymorphous Corneal Dystrophy Fuchs Endothelial Dystrophy\n" +
//            "Fuchs Endothelial Dystrophy,Corneal Dystrophy Fuchs Endothelial 1,Corneal Dystrophy,Posterior Polymorphous 2\n" +
//            "Interstitial Keratitis,Stickler Syndrome,Type Iv,Col9A1-Related Multiple Epiphyseal Dysplasia\n" +
//            "Stickler Syndrome,Intervertebral Disc Disease,Col9A2-Related Stickler Syndrome\n" +
//            "Col9A3-Related Multiple Epiphyseal Dysplasia,Epiphyseal Dysplasia,Multiple,With Myopathy,Intervertebral Disc Disease\n" +
//            "Colorectal Cancer\n" +
//            "Colorectal Cancer\n" +
//            "3Mc Syndrome 2,Learning Disability 3Mc Syndrome 1\n" +
//            "Endplate Acetylcholinesterase Deficiency,Colq-Related Congenital Myasthenic Syndrome,Nasopharynx Carcinoma Show all 4\n" +
//            "Oculomotor Apraxia,Congenital,Cogan-Type\n" +
//            "Wilson Disease\n" +
//            "Hypertension Type 2 Diabetes Mellitus\n" +
//            "Multiple Epiphyseal Dysplasia 1,Hemophilic Arthropathy,Relapsing Polychondritis\n" +
//            "Neurotic Disorder,Paranoid Schizophrenia,Schizotypal Personality Disorder\n" +
//            "Oculocerebrorenal Syndrome\n" +
//            "Pulmonary Disease,Chronic Obstructive,Severe Early-Onset\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Pulmonary Function Chronic Obstructive Pulmonary Disease\n" +
//            "Pulmonary Function Chronic Obstructive Pulmonary Disease\n" +
//            "Pulmonary Function Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Dysgraphia,Ideomotor Apraxia,Facial Hemiatrophy\n" +
//            "Thyroid Medullary Carcinoma\n" +
//            "Hiv-1\n" +
//            "Familial Hypercholesterolemia\n" +
//            "Coenzyme Q10 Deficiency,Primary,1,Mitochondrial Encephalomyopathy,Encephalomyopathy\n" +
//            "Coenzyme Q10 Deficiency,Primary,6,Nephrotic Syndrome Steroid-Resistant Nephrotic Syndrome\n" +
//            "Coenzyme Q10 Deficiency,Primary,5 Coq9-Related Coenzyme Q10 Deficiency\n" +
//            "Cone-Rod Retinal Dystrophy-1\n" +
//            "Cone-Rod Dystrophy 17\n" +
//            "Cone-Rod Dystrophy 8\n" +
//            "Preeclampsia/eclampsia 5,Pre-Eclampsia,Eclampsia Show all 4\n" +
//            "Immunodeficiency 8,Coronin-1A Deficiency,Primary Effusion Lymphoma Show all 4\n" +
//            "Coronin-1A Deficiency\n" +
//            "Coronin-1A Deficiency\n" +
//            "Intestinal Disease\n" +
//            "Smith Magenis Syndrome\n" +
//            "Leigh Syndrome Due To Mitochondrial Cox4 Deficiency,Hereditary Neuropathy With Liability To Pressure Palsies,Cytochrome-C Oxidase Deficiency Disease\n" +
//            "Breast Cancer Susceptibility Leigh Disease\n" +
//            "Cytochrome-C Oxidase Deficiency Disease\n" +
//            "Cardioencephalomyopathy,Fatal Infantile,Due To Cytochrome C Oxidase Deficiency 2,Leigh Syndrome Due To Cytochrome C Oxidase Deficiency,Cardioencephalomyopathy\n" +
//            "Intrahepatic Cholangiocarcinoma\n" +
//            "Leigh Disease\n" +
//            "Cytochrome-C Oxidase Deficiency Disease\n" +
//            "Calvarial Hyperostosis Exocrine Pancreatic Insufficiency\n" +
//            "Exocrine Pancreatic Insufficiency,Dyserythropoietic Anemia,And Calvarial Hyperostosis,Calvarial Hyperostosis,Exocrine Pancreatic Insufficiency Show all 4\n" +
//            "Leukocoria,Acquired Idiopathic Sideroblastic Anemia,Multiple Symmetric Lipomatosis\n" +
//            "Charcot-Marie-Tooth Disease,Recessive Intermediate D Goldenhar Syndrome\n" +
//            "Cytochrome-C Oxidase Deficiency Disease,Encephalomyopathy Leigh Syndrome With Cardiomyopathy\n" +
//            "Prostate Cancer\n" +
//            "Barretts Adenocarcinoma\n" +
//            "Breast Cancer Leigh Disease\n" +
//            "Aplasia Cutis Congenita,Reticulolinear,With Mmicrocephaly,Facial Dysmorphism And Other Congenital Anomalies Aplasia Cutis Congenita\n" +
//            "Fatty Liver Disease,Hiv-1 Alzheimers Disease\n" +
//            "Thyroid Gland Disease,Aceruloplasminemia,Hemosiderosis\n" +
//            "Alzheimers Disease\n" +
//            "Tracheal Stenosis Pancreatitis,Chronic\n" +
//            "Prostate Cancer,Richters Syndrome Silver-Russell Syndrome\n" +
//            "Epilepsy,Familial Temporal Lobe,5,Febrile Seizures,Familial,11,Duane Retraction Syndrome Show all 4\n" +
//            "Ataxic Cerebral Palsy\n" +
//            "Tricuspid Valve Insufficiency,Trachea Leiomyoma Pancreatitis\n" +
//            "Meningococcal Infection,Hemophilia B,Angina Pectoris\n" +
//            "Chondrodysplasia With Platyspondyly,Distinctive Brachydactyly,Hydrocephaly,And Microphthalmia\n" +
//            "Hepatitis B Hepatitis\n" +
//            "Obesity,Neuroendocrine Tumor Pulmonary Neuroendocrine Tumor\n" +
//            "Wernicke Encephalopathy\n" +
//            "Schizophrenia\n" +
//            "Hypoplastic Left Heart Syndrome,Imperforate Anus Intestinal Atresia\n" +
//            "Carboxypeptidase N Deficiency,Urticaria,Angioedema Show all 4\n" +
//            "Harderoporphyria Acute Hepatic Porphyria\n" +
//            "Harderoporphyria,Hereditary Coproporphyria,Prostate Disease\n" +
//            "Hypogonadotropic Hypogonadism 8 With Or Without Anosmia\n" +
//            "Granulocytopenia\n" +
//            "Venoocclusive Disease After Bone Marrow Transplantation,Pulmonary Hypertension,Neonatal,Carbamoyl Phosphate Synthetase I Deficiency Disease\n" +
//            "Rift Valley Fever\n" +
//            "Meningococcal Meningitis,Anal Fistula Factor Viii Deficiency\n" +
//            "Influenza\n" +
//            "Carnitine Palmitoyltransferase 1A Deficiency,Cpt Deficiency,Hepatic,Type Ia,Carnitine Palmitoyl Transferase 1 Deficiency\n" +
//            "Hypersomnia,Visceral Steatosis Carnitine Palmitoyltransferase Ii Deficiency\n" +
//            "Encephalopathy,Acute,Infection-Induced,4,Carnitine Palmitoyltransferase Ii Deficiency,Fatty Acid Oxidation Disorders\n" +
//            "Ventricular Tachycardia,Catecholaminergic Polymorphic,3\n" +
//            "Cleft Palate\n" +
//            "Yaws Sleeping Sickness\n" +
//            "Cr1 Deficiency,Diffuse Glomerulonephritis,Sarcoidosis\n" +
//            "Immunodeficiency,Common Variable,7,Systemic Lupus Erythematosus 9,Chronic Wasting Disease\n" +
//            "Acute Promyelocytic Leukemia,Colorectal Cancer Papillary Thyroid Carcinoma\n" +
//            "Acute Promyelocytic Leukemia\n" +
//            "Hereditary Mixed Polyposis Syndrome 1,Colorectal Cancer 4,Adenoma Show all 4\n" +
//            "Mental Retardation,Autosomal Recessive 34 Mental Retardation,Autosomal Recessive 2\n" +
//            "Acetyl-Carnitine Deficiency,Carnitine Palmitoyltransferase 1A Deficiency,Parainfluenza Virus Type 3\n" +
//            "Pigmented Paravenous Chorioretinal Atrophy,Leber Congenital Amaurosis 8,Retinitis Pigmentosa 12\n" +
//            "Mental Retardation,Autosomal Recessive 2,Distal Monosomy 3P Mental Retardation\n" +
//            "Creatinine Clearance Qtl\n" +
//            "Colorectal Cancer,Mandibular Hypoplasia,Deafness,Progeroid Features,And Lipodystrophy Syndrome Colorectal Cancer 10\n" +
//            "Colorectal Cancer 11 Colorectal Cancer\n" +
//            "Colorectal Cancer 2 Colorectal Cancer\n" +
//            "Colorectal Cancer 5 Colorectal Cancer\n" +
//            "Colorectal Cancer 6 Colorectal Cancer\n" +
//            "Colorectal Cancer 7 Colorectal Cancer\n" +
//            "Colorectal Cancer 8 Colorectal Cancer\n" +
//            "Colorectal Cancer 9 Colorectal Cancer\n" +
//            "Histiocytoma,Angiomatoid Fibrous,Somatic,Diabetic Encephalopathy,Coffin-Lowry Syndrome\n" +
//            "Human T-Cell Leukemia Virus Type 1 Herpes Simplex\n" +
//            "Small Cell Osteogenic Sarcoma,Myxofibrosarcoma,Osteogenesis Imperfecta Type Iii Show all 4\n" +
//            "Myxofibrosarcoma\n" +
//            "Hyperlipoproteinemia Type V Hepatocellular Carcinoma\n" +
//            "Neonatal Leukemia,Rubinstein-Taybi Syndrome,Rubinstein-Taybi Syndrome Due To 16P13.3 Microdeletion\n" +
//            "Atrioventricular Septal Defect 2,Atrioventricular Septal Defect,Atrioventricular Septal Defect,Partial,With Heterotaxy Syndrome\n" +
//            "Cannabis Dependence,Multiple Epiphyseal Dysplasia Metaphyseal Dysplasia\n" +
//            "Hypoadrenalism,Autosomal Dominant Nocturnal Frontal Lobe Epilepsy,Postpartum Depression\n" +
//            "Acth-Secreting Pituitary Adenoma\n" +
//            "Obesity Generalized Anxiety Disorder\n" +
//            "Short Stature With Microcephaly And Distinctive Facies,Isolated Growth Hormone Deficiency Type 1A Isolated Growth Hormone Deficiency Type 2\n" +
//            "Orchitis Epididymitis\n" +
//            "Prostate Cancer\n" +
//            "Miller-Dieker Syndrome\n" +
//            "Distal 22Q11.2 Microdeletion Syndrome Chronic Myeloid Leukemia\n" +
//            "Labyrinthitis,Cold-Induced Sweating Syndrome Including Crisponi Syndrome,Crisponi Syndrome\n" +
//            "Acute Lymphoblastic Leukemia Eczema Herpeticum\n" +
//            "Neurofibromatosis\n" +
//            "Catastrophic Antiphospholipid Syndrome\n" +
//            "Polyclonal Hypergammaglobulinemia,Esophageal Squamous Cell Carcinoma Oral Squamous Cell Carcinoma\n" +
//            "Medulloblastoma\n" +
//            "Pyuria,Ulcerative Proctitis,Hypersensitivity Vasculitis8\n" +
//            "Muenke Syndrome\n" +
//            "Botulism Neurofibromatosis\n" +
//            "Crtap-Related Osteogenesis Imperfecta,Osteogenesis Imperfecta Type 7,Osteogenesis Imperfecta\n" +
//            "Lacrimal Gland Cancer,Cutaneous Mucoepidermoid Carcinoma,Clear Cell Hidradenoma\n" +
//            "Human T-Cell Leukemia Virus Type 1\n" +
//            "Warthin Tumor\n" +
//            "Leber Congenital Amaurosis 7,Cone-Rod Dystrophy 2,Crx-Related Leber Congenital Amaurosis\n" +
//            "Cataract 9,Multiple Types,Presbyopia,Sympathetic Ophthalmia\n" +
//            "Cataract 16,Multiple Types,Myopathy,Myofibrillar,2,Intracranial Cysts\n" +
//            "Cataract 10,Multiple Types,Autosomal Dominant Disease,Posterior Polar Cataract\n" +
//            "Cataract 42 Cataract 4,Multiple Types\n" +
//            "Cataract 23,Microphthalmia With Cataract 2,Cataract 4,Multiple Types Show all 4\n" +
//            "Cataract 17,Multiple Types,Cataract,Congenital Nuclear,Autosomal Recessive 3,Cataract 4,Multiple Types\n" +
//            "Cataract 3,Multiple Types,Cerulean Cataract,Cataract 10,Multiple Types\n" +
//            "Cerulean Cataract\n" +
//            "Cataract,Congenital Nuclear,Autosomal Recessive 2,Cataract 22,Autosomal Recessive,Cataract,Congenital\n" +
//            "Cataract 39,Multiple Types,Autosomal Dominant,Cerulean Cataract,Cataract\n" +
//            "Cataract 2,Multiple Types,Cataract 1,Multiple Types,Cataract 4,Multiple Types Show all 4\n" +
//            "Cataract 4,Multiple Types,Cataract,Cerulean Cataract\n" +
//            "Cataract 20,Multiple Types,Autosomal Dominant Childhood-Onset Cortical Cataract,Cataract Show all 4\n" +
//            "Deafness,Autosomal Dominant 40 Deafness,Autosomal Dominant 3B\n" +
//            "Critical Illness Polyneuropathy,Endocarditis,Mitochondrial Cardiomyopathy\n" +
//            "Disuse Amblyopia,Amblyopia Stiff-Person Syndrome\n" +
//            "Chondrosarcoma\n" +
//            "Lung Adenocarcinoma,Esophageal Cancer Chondrosarcoma\n" +
//            "Lung Adenocarcinoma,Esophageal Cancer Chondrosarcoma\n" +
//            "Choreoathetosis/spasticity,Episodic Paroxysmal Choreoathetosis\n" +
//            "Tenosynovial Giant Cell Tumor,Multicentric Reticulohistiocytosis,Monocytic Leukemia\n" +
//            "Csf1R-Related Hereditary Diffuse Leukoencephalopathy With Spheroids,Hereditary Diffuse Leukoencephalopathy With Spheroids,Malignant Histiocytosis\n" +
//            "Anthracycline Extravasations,Acquired Agranulocytosis,Ecthyma\n" +
//            "Surfactant Metabolism Dysfunction,Pulmonary,4,Csf2Ra-Related Pulmonary Surfactant Metabolism Dysfunction,Acute Basophilic Leukemia\n" +
//            "Surfactant Metabolism Dysfunction,Pulmonary,5,Surfactant Metabolism Dysfunction,Pulmonary,1 Megakaryocytic Leukemia\n" +
//            "Refractory Anemia With Excess Blasts In Transformation,Colchicine Poisoning,Virus Associated Hemophagocytic Syndrome5\n" +
//            "Chronic Neutrophilic Leukemia,Neutrophilia,Hereditary,Subacute Myeloid Leukemia\n" +
//            "Epithelioid Trophoblastic Tumor,Trophoblastic Neoplasm,Silver-Russell Syndrome\n" +
//            "Gestational Trophoblastic Neoplasm,Trophoblastic Neoplasm Epithelioid Trophoblastic Tumor\n" +
//            "Isolated Growth Hormone Deficiency Trophoblastic Neoplasm\n" +
//            "Intermediate Charcot-Marie-Tooth Neuropathy\n" +
//            "Colorectal Cancer\n" +
//            "Nocardiosis,Enamel Erosion,Eosinophilic Gastroenteritis\n" +
//            "Type 1 Diabetes Mellitus Acquired Immunodeficiency Syndrome\n" +
//            "Dentin Sensitivity Mammary Pagets Disease\n" +
//            "Lung Cancer\n" +
//            "Sleep Disorder Angina Pectoris\n" +
//            "Advanced Sleep-Phase Syndrome,Familial,2,Advanced Sleep Phase Syndrome Familial Advanced Sleep Phase Syndrome 1\n" +
//            "Advanced Sleep Phase Syndrome Familial Adenomatous Polyposis\n" +
//            "Globozoospermia\n" +
//            "Pandas,Theileriasis Globozoospermia\n" +
//            "Lung Cancer\n" +
//            "Egg Allergy\n" +
//            "Melanoma Acral Lentiginous Melanoma\n" +
//            "Spontaneous Ocular Nystagmus Dengue Disease\n" +
//            "Joubert Syndrome 21,Joubert Syndrome 8 Asphyxiating Thoracic Dystrophy\n" +
//            "Leopard Syndrome\n" +
//            "Pontiac Fever Endocardial Fibroelastosis\n" +
//            "Cardiomyopathy,Dilated,1M,Cardiomyopathy,Familial Hypertrophic,12,Csrp3-Related Familial Hypertrophic Cardiomyopathy\n" +
//            "Denture Stomatitis Stomatitis\n" +
//            "Autoimmune Polyendocrine Syndrome Type 1\n" +
//            "Macular Degeneration,Age-Related,11,Cerebral Hemorrhage,Cerebral Amyloid Angiopathy\n" +
//            "Blepharitis\n" +
//            "Papillary Thyroid Carcinoma Breast Cancer\n" +
//            "Breast Adenocarcinoma\n" +
//            "Exfoliative Ichthyosis,Autosomal Recessive,Ichthyosis Bullosa Of Siemens-Like,Angioimmunoblastic T-Cell Lymphoma,Ichthyosis Bullosa Of Siemens\n" +
//            "Progressive Myoclonus Epilepsy,Unverricht-Lundborg Syndrome,Epilepsy,Progressive Myoclonic 1A\n" +
//            "Cytomegalovirus Infection\n" +
//            "B-Cell Lymphomas\n" +
//            "Lung Cancer\n" +
//            "Cataract 32,Multiple Types\n" +
//            "Cataract 24,Anterior Polar\n" +
//            "Esophageal Squamous Cell Carcinoma Non-Small Cell Lung Carcinoma\n" +
//            "Esophageal Squamous Cell Carcinoma,Biphasic Synovial Sarcoma,Pancreatic Cancer\n" +
//            "Melanoma,Prostate Cancer,Breast Cancer\n" +
//            "Cutaneous T Cell Lymphoma\n" +
//            "Alzheimers Disease\n" +
//            "Meningioma Familial Idiopathic Basal Ganglia Calcification\n" +
//            "Meningioma\n" +
//            "Prostate Cancer\n" +
//            "Coats Disease Dyskeratosis Congenita,Autosomal Recessive 4\n" +
//            "Mental Retardation,Autosomal Dominant 21,Mesoblastic Nephroma,Congenital Mesoblastic Nephroma Show all 4\n" +
//            "Telangiectasis Coats Disease\n" +
//            "Congenital Cataracts,Facial Dysmorphism,And Neuropathy\n" +
//            "Osteosarcoma Adenosarcoma\n" +
//            "Pulmonary Hypertension,Chronic Thromboembolic,Without Deep Vein Thrombosis Hypertension\n" +
//            "Neonatal Stroke,Acute Myocardial Infarction,Myocardial Infarction\n" +
//            "Renal Fibrosis,Diffuse Scleroderma,Limited Scleroderma\n" +
//            "Gamma-Cystathionase Deficiency,Homocysteine,Total Plasma,Elevated,Hyperhomocysteinemia Show all 4\n" +
//            "Digeorge Syndrome,Velocardiofacial Syndrome,Conotruncal Heart Malformations\n" +
//            "Barrett Esophagus/esophageal Adenocarcinoma,Barretts Esophagus Adenocarcinoma\n" +
//            "Celiac Disease 3,Paracoccidioidomycosis,Thyroiditis\n" +
//            "Diffuse Gastric Cancer,Chromosome 5Q Deletion,Hereditary Diffuse Gastric Cancer\n" +
//            "Benign Schwannoma\n" +
//            "Arrhythmogenic Right Ventricular Dysplasia,Familial,13,Familial Isolated Arrhythmogenic Ventricular Dysplasia,Biventricular Form,Familial Isolated Arrhythmogenic Ventricular Dysplasia,Right Dominant Form\n" +
//            "Mental Retardation,Autosomal Dominant 19,Well-Differentiated Fetal Adenocarcinoma Of The Lung,Classic Pulmonary Blastoma3\n" +
//            "Obesity\n" +
//            "Sarcomatoid Renal Cell Carcinoma Lobular Neoplasia\n" +
//            "Cri-Du-Chat Syndrome\n" +
//            "Cystinosis,Late-Onset Juvenile Or Adolescent Nephropathic,Intermediate Cystinosis,Cystinosis\n" +
//            "Posterior Polar Cataract\n" +
//            "Cataract,Posterior Polar,5 Cataract 32,Multiple Types\n" +
//            "Immunodeficiency 24\n" +
//            "Hepatoerythropoietic Porphyria Methylmalonic Aciduria And Homocystinuria Type Cblf\n" +
//            "Pancreatitis,Chronic,Ctrc-Related Hereditary Pancreatitis,Tropical Calcific Pancreatitis\n" +
//            "Cataract 25\n" +
//            "Cataract 27,Nuclear Progressive Cataract,Congenital\n" +
//            "Cataract 28,Age-Related Cortical\n" +
//            "Cataract 29,Coralliform\n" +
//            "Cataract 34,Multiple Types\n" +
//            "Cataract 35,Congenital Nuclear Cataract,Congenital\n" +
//            "Cataract 37,Autosomal Dominant,Cataract,Congenital Cerulean Cataract\n" +
//            "Severe Acute Respiratory Syndrome,Lymphoblastic Lymphoma,Netherton Syndrome\n" +
//            "Ring Chromosome 20,Galactosialidosis,Osteoarthritis\n" +
//            "Occlusion Of Gallbladder,Adenocarcinoma,Keratolytic Winter Erythema\n" +
//            "Haim-Munk Syndrome,Pleural Empyema,Palmoplantar Keratosis\n" +
//            "Microglandular Adenosis,Colonic Disease,Breast Disease\n" +
//            "Pancreatic Cancer\n" +
//            "Clonorchiasis,Ceroid Lipofuscinosis,Neuronal,13,Kufs Type,Ceroid Lipofuscinosis,Neuronal,4,Parry Type Show all 4\n" +
//            "Acute Febrile Neutrophilic Dermatosis,Amelanotic Melanoma,Gingivitis\n" +
//            "Thyroid Crisis,Narcolepsy 1,Neurologic Diseases\n" +
//            "Pycnodysostosis,Al Amyloidosis,Osteomyelitis\n" +
//            "Rheumatoid Arthritis,Atherosclerosis,Osteoarthritis\n" +
//            "Cercarial Dermatitis Abdominal Aortic Aneurysm\n" +
//            "Rheumatoid Arthritis,Osteoarthritis Atherosclerosis\n" +
//            "Autoimmune Atrophic Gastritis\n" +
//            "Breast Cancer,Ampulla Of Vater Adenocarcinoma Ethmoid Sinus Adenocarcinoma\n" +
//            "Weaver Syndrome\n" +
//            "Exotropia\n" +
//            "Corneal Edema\n" +
//            "Cystoid Macular Edema\n" +
//            "Megaloblastic Anemia,Megaloblastic Anemia-1,Finnish Type,Dents Disease\n" +
//            "Glomuvenous Malformation\n" +
//            "Glomuvenous Malformation\n" +
//            "Pseudohypoaldosteronism Type Ii,Glomuvenous Malformation,Pseudohypoaldosteronism,Type Iia\n" +
//            "Glomuvenous Malformation\n" +
//            "Mental Retardation,X-Linked,Syndromic 15,Mental Retardation,X-Linked,With Short Stature,Small Testes,Muscle Wasting,And Tremor,Conjunctivochalasis Show all 4\n" +
//            "Glomuvenous Malformation\n" +
//            "3-M Syndrome,3-M Syndrome,Cul7-Related Dubowitz Syndrome\n" +
//            "Syndactyly Type 1 Craniosynostosis Philadelphia Type\n" +
//            "Norrie Disease Hereditary Persistence Of Fetal Hemoglobin\n" +
//            "Cubitus Valgus With Mental Retardation And Unusual Facies\n" +
//            "Laryngotracheitis\n" +
//            "Malaria\n" +
//            "Colon Cancer\n" +
//            "Chorioretinitis,Pityriasis Rosea,Rheumatoid Vasculitis Show all 4\n" +
//            "Htlv-1 Associated Myelopathy/tropical Spastic Paraparesis,Macular Degeneration,Age-Related,12,Htlv-1 Associated Myelopathy\n" +
//            "Dilated Cardiomyopathy,Familial Hypocalciuric Hypercalcemia,Hypocalcemia,Autosomal Dominant Show all 4\n" +
//            "Melanoma Kaposis Sarcoma\n" +
//            "Peritoneal Carcinoma,Cystoid Macular Edema,Primary Peritoneal Carcinoma\n" +
//            "Endotheliitis,Septic Arthritis,Vernal Keratoconjunctivitis\n" +
//            "Retinal Hemangioblastoma,Acquired Immunodeficiency Syndrome,Hiv-1\n" +
//            "Dendritic Cell Sarcoma,Thymic Hyperplasia,Follicular Dendritic Cell Sarcoma Show all 4\n" +
//            "Penile Neoplasm Papillary Thyroid Carcinoma\n" +
//            "Xanthogranulomatous Cholecystitis Cholecystitis\n" +
//            "Idiopathic Pulmonary Fibrosis\n" +
//            "Acanthamoeba Keratitis,Stachybotrys Chartarum,Arthus Reaction\n" +
//            "Familial Hypercholesterolemia\n" +
//            "Nonspecific Interstitial Pneumonia,Pulmonary Sarcoidosis,Klebsiella\n" +
//            "Wegeners Granulomatosis Periodontal Disease\n" +
//            "Lymphomatoid Granulomatosis,Malaria,Tuberculosis\n" +
//            "Chronic Nk-Cell Lymphocytosis,Acute Pyelonephritis,Denture Stomatitis\n" +
//            "Human Granulocytic Anaplasmosis,Behcets Disease,Pancreatic Cancer\n" +
//            "Complex Regional Pain Syndrome Type 1,Alk-Negative Anaplastic Large Cell Lymphoma,Intermediate Uveitis\n" +
//            "Whim Syndrome,Myelokathexis,Isolated,Intraocular Lymphoma\n" +
//            "Burkitts Lymphoma,Chronic Lymphocytic Leukemia,Acquired Immunodeficiency Syndrome\n" +
//            "Hiv-1\n" +
//            "Intrahepatic Cholangiocarcinoma\n" +
//            "Alcohol Dependence\n" +
//            "Hiv-1\n" +
//            "Methemoglobinemia,Methemoglobinemia,Type Iv,Congenital Methemoglobinemia\n" +
//            "Methemoglobinemia\n" +
//            "Methemoglobinemia\n" +
//            "Methemoglobinemia,Type Ii,Methemoglobinemia,Type I,Congenital Methemoglobinemia\n" +
//            "Methemoglobinemia\n" +
//            "Methemoglobinemia\n" +
//            "Chronic Granulomatous Disease,Autosomal Recessive,Cytochrome B-Negative,Chronic Granulomatous Disease,Autosomal,Due To Deficiency Of Cyba,Chronic Granulomatous Disease\n" +
//            "Chronic Granulomatous Disease,Chronic Granulomatous Disease,X-Linked,Immunodeficiency 34,Mycobacteriosis,X-Linked\n" +
//            "Mitochondrial Complex Iii Deficiency,Nuclear Type 6,Mitochondrial Complex Iii Deficiency Mitochondrial Complex Iii Deficiency,Nuclear Type 1\n" +
//            "Thrombocytopenia 4,Amelanotic Melanoma,Thrombocytopenia\n" +
//            "Alcohol Dependence\n" +
//            "Angelman Syndrome Fragile X Syndrome\n" +
//            "Hereditary Neuralgic Amyotrophy Nonepidermolytic Palmoplantar Keratoderma\n" +
//            "Multiple Familial Trichoepithelioma 1,Familial Cylindromatosis,Multiple Familial Trichoepithelioma\n" +
//            "Cystoid Macular Dystrophy\n" +
//            "Congenital Adrenal Insufficiency,Inherited Isolated Adrenal Insufficiency Due To Cyp11A1 Deficiency,Lipoid Adrenal Hyperplasia\n" +
//            "11-Beta-Hydroxylase Deficiency,Iridocyclitis,Glucocorticoid-Remediable Aldosteronism\n" +
//            "Corticosterone Methyloxidase Deficiency,Hypoaldosteronism,Low Renin Hypertension\n" +
//            "17-Alpha-Hydroxylase/17,20-Lyase Deficiency,Adrenal Carcinoma,17-Alpha-Hydroxylase-Deficient Congenital Adrenal Hyperplasia\n" +
//            "Aromatase Excess Syndrome,Aromatase Deficiency,Leydig Cell Tumor\n" +
//            "Oral Cancer,Cardia Cancer,Lung Cancer\n" +
//            "Susceptibility To Adverse Reaction Due To Clozapine,Porphyria Cutanea Tarda,Hypoadrenalism\n" +
//            "Glaucoma,Congenital,Glaucoma 3A,Primary Open Angle,Congenital,Juvenile,Or Adult Onset,Cyp1B1-Related Primary Congenital Glaucoma\n" +
//            "Scabies\n" +
//            "C4B Deficiency Juvenile Rheumatoid Arthritis\n" +
//            "Late-Onset Congenital Adrenal Hyperplasia,Adrenal Rest Tumor,Autoimmune Polyglandular Syndrome Type 3\n" +
//            "Hypercalcemia,Infantile,Williams Syndrome,Hypercalcemia\n" +
//            "Imperforate Anus,Acute Promyelocytic Leukemia,Congenital Diaphragmatic Hernia\n" +
//            "Craniosynostosis With Radiohumeral Fusions And Other Skeletal And Craniofacial Anomalies Encephalocele\n" +
//            "Focal Facial Dermal Dysplasia 4,Diffuse Idiopathic Skeletal Hyperostosis,Focal Facial Dermal Dysplasia\n" +
//            "Xanthomatosis,Cerebrotendinous Xanthomatosis,Lipid Storage Disease\n" +
//            "Vitamin D-Dependent Rickets Type I,Actinic Keratosis,Nephrogenic Systemic Fibrosis\n" +
//            "Nicotine Addiction,Protection From,Lung Cancer,Coumarin Resistance Show all 4\n" +
//            "Non-Small Cell Lung Carcinoma Lung Cancer\n" +
//            "Coumarin Resistance,Lung Cancer,Warfarin Resistance\n" +
//            "Acute Frontal Sinusitis,Frontal Sinusitis,Efavirenz,Poor Metabolism Of\n" +
//            "Proguanil Poor Metabolizer,Opremazole Poor Metabolizer,Mephenytoin Poor Metabolizer\n" +
//            "Osteonecrosis Of The Jaw,Rhabdomyolysis,Cerivastatin-Induced Osteonecrosis\n" +
//            "Warfarin Sensitivity,Carbutamide Toxicity,Glipizide Toxicity\n" +
//            "Cytochrome P450 2D6 Variant,Pseudobulbar Affect,Debrisoquine Sensitivity\n" +
//            "Alcoholic Hepatitis,Benzene Toxicity,Drug-Induced Hepatitis\n" +
//            "Rickets Due To Defect In Vitamin D 25-Hydroxylation,Vitamin D-Dependent Rickets Type I Gestational Diabetes\n" +
//            "Spastic Paraplegia 56,Autosomal Recessive\n" +
//            "Xanthomatosis,Serotonin Syndrome,Methemoglobinemia Show all 4\n" +
//            "Engraftment Syndrome,Resistance To Tacrolimus In Transplantation,Tacrolimus Dose Selection In Transplantation\n" +
//            "Alzheimers Disease\n" +
//            "Warfarine Toxicity,Susceptibility To Bleeding Due To Warfarine Treatment Warfarin Sensitivity\n" +
//            "Ichthyosis,Congenital,Autosomal Recessive 5,Spinal Meningioma,Cyp4F22-Related Autosomal Recessive Congenital Ichthyosis\n" +
//            "Ascariasis Trichuriasis\n" +
//            "Bietti Crystalline Corneoretinal Dystrophy,Choroidal Sclerosis Corneal Dystrophy\n" +
//            "Chagas Disease Antley-Bixler Syndrome\n" +
//            "Extrahepatic Cholestasis,Hypercholesterolemia Due To Cholesterol 7Alpha-Hydroxylase Deficiency,Cerebrotendinous Xanthomatosis\n" +
//            "Spastic Paraplegia 5A,Autosomal Recessive,Spastic Paraplegia 5A,Bile Acid Synthesis Defect,Congenital,3\n" +
//            "Epispadias,Breast Cancer,Prostate Cancer Show all 4\n" +
//            "Astereognosia,Ureterocele,Bile Duct Adenoma Show all 4\n" +
//            "Churg-Strauss Syndrome,Asthma,Brain Injury Show all 4\n" +
//            "Kaposis Sarcoma,Asthma,Atopy\n" +
//            "D-2-Hydroxyglutaric Aciduria 1,D-2-Hydroxyglutaric Aciduria,2-Hydroxyglutaric Aciduria\n" +
//            "Lissencephaly With Cerebellar Hypoplasia Ciliary Dyskinesia,Primary,2\n" +
//            "Postaxial Polydactyly Type A,Postaxial Polydactyly,Type A2 Anophthalmia/microphthalmia\n" +
//            "Allan-Herndon-Dudley Syndrome\n" +
//            "Occipital Encephalocele,Craniorachischisis,Neural Tube Defects\n" +
//            "Placenta Praevia\n" +
//            "Peripheral Nervous System Disease,Lassa Fever,Lymphocytic Choriomeningitis\n" +
//            "Spinocerebellar Ataxia Type 20\n" +
//            "Malignant Syringoma,Syringoma Norrie Disease\n" +
//            "Schizophrenia,Primary Hyperoxaluria,Bipolar Disorder Show all 4\n" +
//            "Childhood-Onset Schizophrenia,Bipolar Disorder Schizophrenia\n" +
//            "Pediatric Lymphoma,Central Nervous System Lymphoma,Choroid Plexus Papilloma Show all 4\n" +
//            "Recessive Dystrophic Epidermolysis Bullosa\n" +
//            "Neonatal Herpes,Plasmodium Vivax Malaria,Genital Herpes\n" +
//            "Hypomyelination With Brainstem And Spinal Cord Involvement And Leg Spasticity Spasticity\n" +
//            "Leukoencephalopathy With Brain Stem And Spinal Cord Involvement And Lactate Elevation Alpers Syndrome\n" +
//            "Azoospermia,Y Chromosome Infertility,Oligospermia\n" +
//            "Y Chromosome Infertility,Azoospermia,Oligospermia\n" +
//            "Spermatogenic Failure,Y-Linked,2,Azoospermia Y Chromosome Infertility\n" +
//            "Azoospermia,Spermatogenic Failure,Y-Linked,2,Oligospermia Show all 4\n" +
//            "Azoospermia\n" +
//            "Multiple Myeloma,Myeloma Azoospermia\n" +
//            "Spermatogenic Failure,Azoospermia,Paraneoplastic Syndromes\n" +
//            "Diamond-Blackfan Anemia 2\n" +
//            "Capgras Syndrome,Dopamine Beta-Hydroxylase Deficiency,Postural Hypotension\n" +
//            "Withdrawal Disorder Alcoholic Pancreatitis\n" +
//            "Schizophrenia\n" +
//            "Type 2 Diabetes Mellitus,Hemophilia B Graves Disease\n" +
//            "Maple Syrup Urine Disease Type 2,Atrophy Of Testis,Barth Syndrome\n" +
//            "Hypogonadism,Alopecia,Diabetes Mellitus,Mental Retardation,And Extrapyramidal Syndrome,Sakati Syndrome Neurodegeneration With Brain Iron Accumulation Disorders\n" +
//            "Leiomyoma\n" +
//            "Giant Axonal Neuropathy 2,Autosomal Dominant\n" +
//            "Mirror Movements 1,Colorectal Cancer,Colorectal Cancer,Somatic Show all 4\n" +
//            "Burns,Root Caries,Spinal Stenosis Show all 4\n" +
//            "Writing Disorder Dyslexia\n" +
//            "Pyruvate Dehydrogenase E2 Deficiency\n" +
//            "Van Maldergem Syndrome 1\n" +
//            "Purine Nucleoside Phosphorylase Deficiency,Pancreatic Cancer,Neurofibrosarcoma\n" +
//            "Artemis Deficiency,Pinguecula,Severe Combined Immunodeficiency,Athabascan Type\n" +
//            "Congenital Stromal Corneal Dystrophy,Burn Scar,Marfan Syndrome\n" +
//            "Down Syndrome\n" +
//            "Amelanotic Melanoma,Malignant Glioma,Chediak-Higashi Syndrome Show all 4\n" +
//            "Distal Hereditary Motor Neuronopathy Type Viib,Perry Syndrome,Neuropathy,Distal Hereditary Motor,Type Viib\n" +
//            "Synucleinopathy\n" +
//            "Cystic Fibrosis\n" +
//            "Dcx-Related Disorders,Lissencephaly X-Linked,Subcortical Laminal Heteropia,X-Linked\n" +
//            "Pentosuria,Excessive Tearing,Dacryocystocele\n" +
//            "Photosensitive Trichothiodystrophy Vitelliform Macular Dystrophy\n" +
//            "Xeroderma Pigmentosum,Group E,Ddb-Negative Subtype,Ddb2-Related Xeroderma Pigmentosum,Xeroderma Pigmentosum,Group C Show all 4\n" +
//            "Aromatic Amino Acid Decarboxylase Deficiency,Postural Hypotension,Schizophrenia\n" +
//            "Dowling-Degos Disease 3,Dowling-Degos Disease Degos Disease\n" +
//            "Developmental Dysplasia Of The Hip 2,46Xy Sex Reversal 8 Obesity,Hyperphagia,And Developmental Delay\n" +
//            "Spastic Paraplegia 28,Autosomal Recessive\n" +
//            "Spastic Paraplegia 54,Autosomal Recessive\n" ;
////            "Myxoid Liposarcoma\n" +
//            "Mature Teratoma\n" +
//            "Congenital Disorder Of Glycosylation,Type Ir Hyperglycemia\n" +
//            "Spondylometaepiphyseal Dysplasia Short Limb-Hand Type Spondyloepimetaphyseal Dysplasia\n" +
//            "Non-Small Cell Lung Carcinoma\n" +
//            "Retinoblastoma Heavy Chain Disease\n" +
//            "Warsaw Breakage Syndrome,Roberts Syndrome Baller-Gerold Syndrome\n" +
//            "Roberts Syndrome Baller-Gerold Syndrome\n" +
//            "Muscular Atrophy Spinal Muscular Atrophy\n" +
//            "Stomach Disease\n" +
//            "Distal Hereditary Motor Neuropathy,Type Ii\n" +
//            "Rheumatoid Arthritis\n" +
//            "Hepatitis C,Hepatitis C Virus,Hepatitis Show all 4\n" +
//            "Sertoli Cell-Only Syndrome,Infertility,Male Infertility\n" +
//            "Chronic Myeloid Leukemia\n" +
//            "Autism Spectrum Disorder\n" +
//            "Ebola Hemorrhagic Fever,Parainfluenza Virus Type 3,Influenza Show all 4\n" +
//            "Orofaciodigital Syndrome 5,Orofaciodigital Syndrome Type 14 Orofaciodigital Syndrome\n" +
//            "Alzheimers Disease\n" +
//            "Mental Retardation,Autosomal Dominant 24\n" +
//            "Esophageal Squamous Cell Carcinoma Esophageal Cancer\n" +
//            "2,4-Dienoyl-Coa Reductase Deficiency Glucosephosphate Dehydrogenase Deficiency\n" +
//            "Dental Fluorosis\n" +
//            "Tuberculosis,Microsporidiosis,Multidrug-Resistant Tuberculosis Show all 4\n" +
//            "Crohns Disease Systemic Lupus Erythematosus\n" +
//            "Idiopathic Pulmonary Fibrosis,Multidrug-Resistant Tuberculosis,Tuberculosis\n" +
//            "Idiopathic Pulmonary Fibrosis Childhood Leukemia\n" +
//            "Microsporidiosis,Urethritis,Colitis Show all 4\n" +
//            "Childhood Leukemia\n" +
//            "Corneal Abscess,Gingival Disease,Localized Scleroderma\n" +
//            "Oral Squamous Cell Carcinoma,Squamous Cell Carcinoma Of The Head And Neck Ileitis\n" +
//            "Squamous Cell Carcinoma Of The Head And Neck,Colitis,Burns\n" +
//            "Ulcerative Colitis\n" +
//            "Childhood Leukemia\n" +
//            "Childhood Leukemia\n" +
//            "Childhood Leukemia\n" +
//            "Childhood Leukemia\n" +
//            "Tinea Corporis,Middle Ear Cholesteatoma,Microsporidiosis\n" +
//            "Hiv-1\n" +
//            "Hiv-1\n" +
//            "Mantle Cell Lymphoma\n" +
//            "Leukemia,Acute Nonlymphocytic,Iridocyclitis Acute Myeloid Leukemia With T(6;9)(P23;q34)\n" +
//            "Chromosome 10Q Deletion Chromosome 10Q26 Deletion Syndrome\n" +
//            "Wagr Syndrome Wilms Tumor\n" +
//            "11P15-P14 Deletion Syndrome Chromosome 11P15-P14 Deletion Syndrome\n" +
//            "Chromosome 13Q14 Deletion Syndrome\n" +
//            "Chromosome 14Q11-Q22 Deletion Syndrome\n" +
//            "Microdeletion 15Q11.2\n" +
//            "15Q13.3 Microdeletion\n" +
//            "Deafness And Male Infertility,Infertility Male Infertility\n" +
//            "Chromosome 15Q24 Deletion Syndrome\n" +
//            "Chromosome 15Q25 Deletion Syndrome\n" +
//            "Chromosome 15Q26-Qter Deletion Syndrome\n" +
//            "Autism Susceptibility 14A Chromosome 16P11.2 Deletion Syndrome,593Kb\n" +
//            "Chromosome 16P12.2-P11.2 Deletion Syndrome\n" +
//            "Chromosome 16P13.3 Deletion Syndrome\n" +
//            "Chromosome 17P13.1 Deletion Syndrome\n" +
//            "Chromosome 17Q11.2 Deletion Syndrome,1.4Mb\n" +
//            "Chromosome 17Q12 Deletion Syndrome\n" +
//            "17Q23.1Q23.2 Microdeletion Syndrome\n" +
//            "18P Deletion Syndrome Chromosome 18P Deletion Syndrome\n" +
//            "18Q Deletion Syndrome\n" +
//            "Chromosome 19P13.13 Deletion Syndrome Chromosome 19P13.13 Duplication Syndrome\n" +
//            "Chromosome 19Q13.11 Deletion Syndrome\n" +
//            "Chromosome 1P32-P31 Deletion Syndrome\n" +
//            "Chromosome 1P36 Deletion Syndrome 1P36 Deletion Syndrome\n" +
//            "1Q21.1 Deletion Thrombocytopenia-Absent Radius Syndrome\n" +
//            "Chromosome 1Q41-Q42 Deletion Syndrome\n" +
//            "Chromosome 1Q43-Q44 Deletion Syndrome\n" +
//            "Chromosome 22Q11.2 Deletion Syndrome,Distal Schizophrenia\n" +
//            "Chromosome 2P12-P11.2 Deletion Syndrome\n" +
//            "2P16.1-P15 Deletion Syndrome Chromosome 2P16.1-P15 Deletion Syndrome\n" +
//            "Hypotonia-Cystinuria Syndrome Cystinuria\n" +
//            "Chromosome 2Q31.2 Deletion Syndrome\n" +
//            "3P Deletion Syndrome\n" +
//            "Chromosome 3Q13.31 Deletion Syndrome\n" +
//            "Chromosome 3Q29 Microdeletion Syndrome\n" +
//            "Chromosome 4Q21 Deletion Syndrome\n" +
//            "Chromosome 5Q12 Deletion Sydrome\n" +
//            "Chromosome 6Pter-P24 Deletion Syndrome\n" +
//            "Chromosome 6Q11-Q14 Deletion Syndrome\n" +
//            "Chromosome 6Q25-Q25 Deletion Syndrome\n" +
//            "Chromosome 7Q11.23 Deletion Syndrome,Distal,1.2Mb\n" +
//            "Bor-Duane Hydrocephalus Contiguous Gene Syndrome\n" +
//            "Mesomelia-Synostoses Syndrome Mesomelia\n" +
//            "Chromosome 8Q21.11 Deletion Syndrome\n" +
//            "Chromosome 9P Deletion\n" +
//            "Chromosome Xp11.3 Deletion Syndrome Xp11.3 Deletion Syndrome\n" +
//            "Chromosome Xp21 Deletion Syndrome\n" +
//            "Autism Susceptibility,X-Linked 4\n" +
//            "Choroideremia,Deafness,And Mental Retardation Choroideremia\n" +
//            "Spermatogenic Failure,Y-Linked,1\n" +
//            "Pleomorphic Adenoma\n" +
//            "Breast Cancer\n" +
//            "Epilepsy,Familial Focal,With Variable Foci,Focal Epilepsy,Epilepsy,Familial Temporal Lobe,1\n" +
//            "Emanuel Syndrome\n" +
//            "Supernumerary Der T Syndrome\n" +
//            "Phlebotomus Fever Tick Infestation\n" +
//            "Cystic Fibrosis Cavernous Hemangioma\n" +
//            "Liver Cancer\n" +
//            "Myopathy,Myofibrillar,1,Ovarian Benign Neoplasm,Inflammatory Leiomyosarcoma5\n" +
//            "Deafness,Cataract,Retinitis Pigmentosa,And Sperm Abnormalities Retinitis Pigmentosa\n" +
//            "Huntingtons Disease\n" +
//            "Deafness,X-Linked 5\n" +
//            "Auditory Neuropathy\n" +
//            "Deafness,Autosomal Dominant 16\n" +
//            "Deafness,Autosomal Dominant 18\n" +
//            "Deafness,Autosomal Dominant 21\n" +
//            "Deafness,Autosomal Dominant 24\n" +
//            "Deafness,Autosomal Dominant 27\n" +
//            "Deafness,Autosomal Dominant 30\n" +
//            "Deafness,Autosomal Dominant 31\n" +
//            "Deafness,Autosomal Dominant 33\n" +
//            "Deafness,Autosomal Dominant 40\n" +
//            "Deafness,Autosomal Dominant 41\n" +
//            "Deafness,Autosomal Dominant 52\n" +
//            "Deafness,Autosomal Dominant 43\n" +
//            "Deafness,Autosomal Dominant 47\n" +
//            "Deafness,Autosomal Dominant 49\n" +
//            "Deafness,Autosomal Dominant 5,Dfna 5 Nonsyndromic Hearing Loss And Deafness Deafness,Autosomal Dominant 3B\n" +
//            "Deafness,Autosomal Dominant 52\n" +
//            "Deafness,Autosomal Dominant 53\n" +
//            "Deafness,Autosomal Dominant 54\n" +
//            "Auditory Neuropathy\n" +
//            "Deafness,Autosomal Dominant 58\n" +
//            "Deafness,Autosomal Dominant 59\n" +
//            "Deafness,Autosomal Dominant 7\n" +
//            "Deafness,Autosomal Recessive 13\n" +
//            "Deafness,Autosomal Recessive 14\n" +
//            "Deafness,Autosomal Recessive 17\n" +
//            "Deafness,Autosomal Recessive 20\n" +
//            "Deafness,Autosomal Recessive 26\n" +
//            "Deafness,Autosomal Recessive 27\n" +
//            "Deafness,Autosomal Recessive 31,Dfnb31 Nonsyndromic Hearing Loss And Deafness,Usher Syndrome Type 2D\n" +
//            "Deafness,Autosomal Recessive 32\n" +
//            "Deafness,Autosomal Recessive 33 Dfnb1\n" +
//            "Deafness,Autosomal Recessive 38\n" +
//            "Deafness,Autosomal Recessive 40\n" +
//            "Deafness,Autosomal Recessive 44\n" +
//            "Deafness,Autosomal Recessive 45\n" +
//            "Deafness,Autosomal Recessive 46 Autosomal Recessive Nonsyndromic Deafness\n" +
//            "Deafness,Neurosensory,Autosomal Recessive 47\n" +
//            "Deafness,Autosomal Recessive 5\n" +
//            "Deafness,Autosomal Recessive 51\n" +
//            "Deafness,Autosomal Recessive 55\n" +
//            "Deafness,Autosomal Recessive 59,Dfnb59 Nonsyndromic Hearing Loss And Deafness,Auditory Neuropathy\n" +
//            "Deafness,Autosomal Recessive 62\n" +
//            "Deafness,Autosomal Recessive 65\n" +
//            "Deafness,Autosomal Recessive 66\n" +
//            "Deafness,Autosomal Recessive 68\n" +
//            "Deafness,Autosomal Recessive 71\n" +
//            "Deafness,Autosomal Recessive 74\n" +
//            "Deafness,Autosomal Recessive 81\n" +
//            "Deafness,Autosomal Recessive 83 Deafness,Autosomal Dominant 47\n" +
//            "Deafness,Autosomal Recessive 85\n" +
//            "Deafness,Autosomal Recessive 93\n" +
//            "Deafness,Autosomal Recessive 96\n" +
//            "Deafness,Nonsyndromic,Modifier 1\n" +
//            "Deafness,X-Linked 3 Deafness,X-Linked 4\n" +
//            "Deafness,Y-Linked 1\n" +
//            "Diarrhea 7 Obesity\n" +
//            "Tropical Sprue\n" +
//            "Digeorge Syndrome,Tetralogy Of Fallot Velocardiofacial Syndrome\n" +
//            "Digeorge Syndrome\n" +
//            "Digeorge Syndrome\n" +
//            "Digeorge Syndrome Velocardiofacial Syndrome\n" +
//            "Digeorge Syndrome/velocardiofacial Syndrome Complex-2,Velocardiofacial Syndrome Digeorge Syndrome\n" +
//            "Schizophrenia Digeorge Syndrome\n" +
//            "Digeorge Syndrome\n" +
//            "Digeorge Syndrome\n" +
//            "Nephrotic Syndrome,Type 7 Atypical Hemolytic-Uremic Syndrome\n" +
//            "Dominant Optic Atrophy\n" +
//            "Dominant Optic Atrophy\n" +
//            "Digeorge Syndrome/velocardiofacial Syndrome Complex-2 Digeorge Syndrome\n" +
//            "Dguok-Related Mitochondrial Dna Depletion Syndrome,Hepatocerebral Form,Mitochondrial Dna Depletion Syndrome 3,Adult-Onset Multiple Mitochondrial Dna Deletion Syndrome Due To Dguok Deficiency\n" +
//            "Desmosterolosis Alzheimers Disease\n" +
//            "Smith-Lemli-Opitz Syndrome,Syndactyly,Atrioventricular Septal Defect Show all 4\n" +
//            "Dhdds-Related Retinitis Pigmentosa Retinitis Pigmentosa\n" +
//            "Lung Cancer\n" +
//            "Megaloblastic Anemia Due To Dihydrofolate Reductase Deficiency,Isosporiasis,Pneumocystosis\n" +
//            "Methylmalonic Aciduria And Homocystinuria Type Cblf,Methylmalonic Aciduria And Homocystinuria Type Cble,Methylmalonic Aciduria And Homocystinuria Type Cblg\n" +
//            "Ankylosing Spondylitis Systemic Lupus Erythematosus\n" +
//            "46Xy Sex Reversal 7,46Xy Partial Gonadal Dysgenesis,With Minifascicular Neuropathy,Dhh-Related 46,xy Dsd And 46,xy Cgd\n" +
//            "Supernumerary Nipples,Miller Syndrome,Chagas Disease\n" +
//            "Whipple Disease,Malaria,Pneumocystosis Show all 4\n" +
//            "Smith-Lemli-Opitz Syndrome\n" +
//            "Dehydrated Hereditary Stomatocytosis Dehydrated Hereditary Stomatocytosis With Or Without Pseudohyperkalemia And/or Perinatal Edema\n" +
//            "2-Aminoadipic 2-Oxoadipic Aciduria,Charcot-Marie-Tooth Disease,Axonal,Type 2Q,Charcot-Marie-Tooth Disease Type 2\n" +
//            "Atopic Dermatitis,Asthma Dermatitis\n" +
//            "Norum Disease\n" +
//            "Atopic Dermatitis,Asthma,Dermatitis Show all 4\n" +
//            "Pseudopterygium\n" +
//            "Deafness,Autosomal Dominant 64,Deafness,Autosomal Dominant 3B,Nonsyndromic Deafness\n" +
//            "Diabetic Nephropathy\n" +
//            "Deafness,Autosomal Dominant 1,Dfna 1 Nonsyndromic Hearing Loss And Deafness Deafness,Autosomal Dominant 3B\n" +
//            "Premature Ovarian Failure 2A Premature Ovarian Failure\n" +
//            "Auditory Neuropathy,Autosomal Dominant,1,Auditory Neuropathy,Neuropathy\n" +
//            "Pulmonary Sequestration,Sertoli-Leydig Cell Tumor,Pleuropulmonary Blastoma\n" +
//            "Hernia,Congenital Diaphragmatic 1\n" +
//            "Hernia,Congenital Diaphragmatic 2\n" +
//            "Keshan Disease,Euthyroid Sick Syndrome Familial Partial Lipodystrophy\n" +
//            "Graves Disease,Euthyroid Sick Syndrome,Familial Partial Lipodystrophy\n" +
//            "Papillary Thyroid Carcinoma,Septic Shock Familial Partial Lipodystrophy\n" +
//            "Mental Retardation,Fra12A Type\n" +
//            "Esophageal Squamous Cell Carcinoma\n" +
//            "Renal Cell Carcinoma 4,Seminal Vesicle Tumor,Familial Renal Cell Carcinoma\n" +
//            "Follicular Thyroid Carcinoma\n" +
//            "Renal Hamartomas Nephroblastomatosis And Fetal Gigantism Wilms Tumor\n" +
//            "Schizoaffective Disorder,Schizophrenia Endogenous Depression\n" +
//            "Schizophrenia\n" +
//            "Septopreoptic Holoprosencephaly,Midline Interhemispheric Variant Of Holoprosencephaly,Alobar Holoprosencephaly\n" +
//            "Hereditary Benign Intraepithelial Dyskeratosis\n" +
//            "Dyskeratosis Congenita X-Linked,Dkc1-Related Dyskeratosis Congenita,Dyskeratosis Congenita\n" +
//            "Multiple Myeloma,Myeloma,Osteoporosis,Early-Onset Autosomal Dominant Show all 4\n" +
//            "Idiopathic Pulmonary Fibrosis\n" +
//            "Pyruvate Dehydrogenase E2 Deficiency,Mycobacterium Gordonae,Pyruvate Decarboxylase Deficiency\n" +
//            "Esophageal Cancer,Lung Cancer,Liver Cancer Show all 4\n" +
//            "Dihydrolipoamide Dehydrogenase Deficiency,Cutaneous Anthrax,Maple Syrup Urine Disease Type 3\n" +
//            "Esophageal Cancer Lung Cancer\n" +
//            "Esophageal Cancer\n" +
//            "Chronic Lymphocytic Leukemia Leukemia\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Mayer-Rokitansky-Kuster-Hauser Syndrome\n" +
//            "Bilateral Retinoblastoma\n" +
//            "Mental Retardation,X-Linked 29 And Others,Partington Syndrome,Non-Specific X-Linked Mental Retardation\n" +
//            "Schizophrenia\n" +
//            "Myopia-2\n" +
//            "Trichotillomania Gilles De La Tourette Syndrome\n" +
//            "Maternal Uniparental Disomy,Chromosome 14,Uniparental Disomy,Paternal,Chromosome 14,Obesity\n" +
//            "Superficial Basal Cell Carcinoma,Visceral Leishmaniasis,Nephroblastoma\n" +
//            "Cascade Stomach,Spondylocostal Dysostosis 1,Dll3-Related Spondylocostal Dysostosis,Autosomal Recessive\n" +
//            "Wernicke-Korsakoff Syndrome Alpha-Ketoglutarate Dehydrogenase Deficiency\n" +
//            "Autism Spectrum Disorder\n" +
//            "Dyslexia 2,Axenfeld-Rieger Syndrome Ankylosis\n" +
//            "Trichodontoosseous Syndrome,Taurodontism,Tricho-Dento-Osseous Syndrome\n" +
//            "Acute Promyelocytic Leukemia\n" +
//            "Split-Hand/foot Malformation 1 With Sensorineural Hearing Loss,Aortic Valve Stenosis,Sensorineural Hearing Loss\n" +
//            "Rapp-Hodgkin Syndrome,Split Foot,Split Hand Show all 4\n" +
//            "Male Germ Cell Tumor\n" +
//            "Medulloblastoma,Appendicitis Oligodendroglioma\n" +
//            "Muscular Dystrophy,Duchenne And Becker Types,Becker Muscular Dystrophy,Duchenne Muscular Dystrophy\n" +
//            "Dimethylglycine Dehydrogenase Deficiency Sarcosinemia\n" +
//            "Osteomalacia,Hypophosphatemic Rickets,Ar,Hypophosphatemic Rickets,Autosomal Recessive 1\n" +
//            "Myotonic Dystrophy Type 1,Myotonic Dystrophy,Myotonia Show all 4\n" +
//            "Chromosome 9P Deletion 46Xy Sex Reversal 7\n" +
//            "46Xy Sex Reversal 7\n" +
//            "Intrahepatic Cholangiocarcinoma\n" +
//            "Lung Cancer Dental Fluorosis\n" +
//            "Progressive External Ophthalmoplegia With Mitochondrial Dna Deletions,Autosomal Dominant,6,Seckel Syndrome Type 8,Seckel Syndrome Type 5\n" +
//            "Ciliary Dyskinesia,Primary,13,Primary Ciliary Dyskinesia13: Dnaaf1-Related Primary Ciliary Dyskinesia Ciliary Dyskinesia,Primary,11\n" +
//            "Ciliary Dyskinesia,Primary,10,Primary Ciliary Dyskinesia10: Dnaaf2-Related Primary Ciliary Dyskinesia,Ciliary Dyskinesia,Primary,11 Show all 4\n" +
//            "Ciliary Dyskinesia,Primary,2,Primary Ciliary Dyskinesia 2: Dnaaf3-Related Primary Ciliary Dyskinesia,Primary Ciliary Dyskinesia Show all 4\n" +
//            "Spermatogenic Failure 7\n" +
//            "Primary Ciliary Dyskinesia 7: Dnah11-Related Primary Ciliary Dyskinesia,Ciliary Dyskinesia,Primary,7,With Or Without Situs Inversus,Situs Inversus\n" +
//            "Brachial Plexus Neuropathy Nonepidermolytic Palmoplantar Keratoderma\n" +
//            "Secondary Ciliary Dyskinesia,Ciliary Dyskinesia,Primary,3,With Or Without Situs Inversus,Primary Ciliary Dyskinesia 3: Dnah5-Related Primary Ciliary Dyskinesia\n" +
//            "Torsion Dystonia,Myosin Storage Myopathy,Breast Adenoma\n" +
//            "Kartagener Syndrome,Primary Ciliary Dyskinesia,Primary Ciliary Dyskinesia 1: Dnai1-Related Primary Ciliary Dyskinesia\n" +
//            "Ciliary Dyskinesia,Primary,9,With Or Without Situs Inversus,Primary Ciliary Dyskinesia 9: Dnai2-Related Primary Ciliary Dyskinesia,Primary Ciliary Dyskinesia\n" +
//            "Oculopharyngeal Muscular Dystrophy\n" +
//            "Adult Syndrome\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Hepatocellular Fibrolamellar Carcinoma Sleeping Sickness\n" +
//            "Choroideremia\n" +
//            "Spinal Muscular Atrophy,Distal,Autosomal Recessive,5\n" +
//            "Oculopharyngeal Muscular Dystrophy\n" +
//            "Dnajb6-Related Myofibrillar Myopathy,Autosomal Dominant Limb-Girdle Muscular Dystrophy Type 1E,Limb-Girdle Muscular Dystrophy Type 1E Show all 4\n" +
//            "Renal Cell Carcinoma\n" +
//            "Polycystic Liver Disease\n" +
//            "Parkinsons Disease,Parkinson Disease,Late-Onset,Chronic Tic Disorder\n" +
//            "Schizophrenia Bipolar Disorder\n" +
//            "Cicatricial Entropion Entropion\n" +
//            "Dilated Cardiomyopathy With Ataxia Syndrome,3 Methylglutaconic Aciduria Type V,Barth Syndrome Show all 4\n" +
//            "Chickenpox\n" +
//            "Williams-Beuren Syndrome\n" +
//            "Wermer Syndrome\n" +
//            "Ceroid Lipofuscinosis,Neuronal,4,Parry Type,Autosomal Dominant Neuronal Ceroid Lipofuscinosis 4B,Cln4 Disease\n" +
//            "Parkinson Disease 19,Juvenile-Onset\n" +
//            "Ciliary Dyskinesia,Primary,16,Primary Ciliary Dyskinesia16: Dnal1-Related Primary Ciliary Dyskinesia Ciliary Dyskinesia,Primary,11\n" +
//            "Mirror Movements 3\n" +
//            "Dnase1-Related Susceptibility To Systemic Lupus Erythematosus,Systemic Lupus Erythematosus,Cystic Fibrosis\n" +
//            "Glycogen Storage Disease Ii,Xerophthalmia,Keratomalacia Show all 4\n" +
//            "Hypocomplementemic Urticarial Vasculitis Syndrome,Systemic Lupus Erythematosus 16,Lymphadenitis\n" +
//            "Alcohol Dependence\n" +
//            "Tongue Squamous Cell Carcinoma,Testicular Germ Cell Tumor Germ Cell Tumors\n" +
//            "Neuronal Intranuclear Inclusion Disease\n" +
//            "Lethal Encephalopathy Due To Defective Mitochondrial Peroxisomal Fission Encephalopahty,Lethal,Due To Defective Mitochondrial Peroxisomal Fission\n" +
//            "Dnm2-Related Intermediate Charcot-Marie-Tooth Neuropathy,Lethal Congenital Contracture Syndrome 5,Centronuclear Myopathy\n" +
//            "Dominant Optic Atrophy\n" +
//            "Cerebellar Ataxia,Deafness,And Narcolepsy,Autosomal Dominant,Dnmt1-Related Dementia,Deafness,And Sensory Neuropathy,Lymphosarcoma\n" +
//            "Tatton-Brown-Rahman Syndrome,Acute Myeloid Leukemia,Chronic Myelomonocytic Leukemia Show all 4\n" +
//            "Immunodeficiency-Centromeric Instability-Facial Anomalies Syndrome 1,Immunodeficiency,Centromere Instability And Facial Anomalies Syndrome,Mutagen Sensitivity Show all 4\n" +
//            "Testis Seminoma Seminoma\n" +
//            "Myelodysplastic Syndromes,Acute Leukemia,Spiradenoma\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Wiskott-Aldrich Syndrome Attention Deficit Hyperactivity Disorder\n" +
//            "Adams-Oliver Syndrome 2,Oliver Syndrome,Pilomyxoid Astrocytoma\n" +
//            "Epileptic Encephalopathy,Early Infantile,23\n" +
//            "Autosomal Recessive Hyper Ige Syndrome,Hyper-Ige Recurrent Infection Syndrome,Autosomal Recessive,Hyper Ige Syndrome\n" +
//            "Actinomycosis\n" +
//            "Stomach Cancer\n" +
//            "Myasthenia,Limb-Girdle,Familial,Dok7-Related Fetal Akinesia Deformation Sequence,Dok7-Related Congenital Myasthenic Syndrome\n" +
//            "Congenital Disorder Of Glycosylation,Type Im Cardiomyopathy,Dilated,1Ii\n" +
//            "Congenital Disorder Of Glycosylation,Type Ij,Congenital Disorder Of Glycosylation Type 1J,Congenital Myasthenic Syndrome With Tubular Aggregates 2\n" +
//            "Diffuse Panbronchiolitis\n" +
//            "Acute Hemorrhagic Conjunctivitis Blau Syndrome\n" +
//            "Pituitary Tumors\n" +
//            "Ovarian Cancer\n" +
//            "Spindle Cell Hemangioma\n" +
//            "Diphtheria\n" +
//            "Congenital Disorder Of Glycosylation Type I Recurrent Respiratory Papillomatosis\n" +
//            "Congenital Disorder Of Glycosylation,Type Iu,Congenital Disorder Of Glycosylation Type I Muscular Dystrophy-Dystroglycanopathy\n" +
//            "Congenital Disorder Of Glycosylation,Type Io\n" +
//            "Asthma\n" +
//            "Endometrial Carcinoma\n" +
//            "Hepatosplenic T-Cell Lymphoma,Mental Depression,Nasopharyngitis\n" +
//            "Autosomal Dominant Microcephaly,Ventricular Fibrillation,Paroxysmal Familial,2,Paroxysmal Ventricular Fibrillation Show all 4\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Idiopathic Pulmonary Fibrosis Obesity\n" +
//            "Germ Cell Tumors\n" +
//            "Aniseikonia,Cycloplegia,Anisometropia Show all 4\n" +
//            "Spermatogenic Failure 9,Globozoospermia Spermatogenic Failure\n" +
//            "Pyrimidine Metabolic Disorder,Dihydropyrimidine Dehydrogenase Deficiency,5-Fluorouracil Toxicity\n" +
//            "Dihydropyrimidinase Deficiency,Dihydropyrimidine Dehydrogenase Deficiency,Beriberi\n" +
//            "Schizophrenia\n" +
//            "Visual Pathway Disease\n" +
//            "Stargardt Disease\n" +
//            "Ciliary Dyskinesia,Primary,21 Ciliary Dyskinesia,Primary,11\n" +
//            "Transient Cerebral Ischemia,Cerebral Meningioma,Pathological Gambling\n" +
//            "Periodic Limb Movement Disorder,Hemiparkinsonism-Hemiatrophy Syndrome,Myoclonus-Dystonia\n" +
//            "Delusional Disorder,Essential Tremor,Tremor\n" +
//            "Separation Anxiety Disorder,Chronic Tic Disorder,Oppositional Defiant Disorder\n" +
//            "Substance Dependence,Blepharospasm,Conduct Disorder\n" +
//            "Atrophic Lichen Planus,Subcorneal Pustular Dermatosis Astroblastoma\n" +
//            "Arrhythmogenic Right Ventricular Dysplasia 11,Arrhythmogenic Right Ventricular Dysplasia 11 With Mild Palmoplantar Keratoderma And Woolly Hair,Arrhythmogenic Right Ventricular Dysplasia/cardiomyopathy11\n" +
//            "Hypotrichosis And Recurrent Skin Vesicles,Hereditary Hypotrichosis With Recurrent Skin Vesicles,Subcorneal Pustular Dermatosis\n" +
//            "Down Syndrome Cystic Lymphangioma\n" +
//            "Down Syndrome\n" +
//            "Down Syndrome\n" +
//            "Down Syndrome\n" +
//            "Down Syndrome Gestational Choriocarcinoma\n" +
//            "Melanoma\n" +
//            "Cycloplegia,Esophagus Squamous Cell Carcinoma,Ehlers-Danlos Syndrome,Musculocontractural Type 2\n" +
//            "Erythroderma,Congenital,With Palmoplantar Keratoderma,Hypotrichosis,And Hyper Ige,Pemphigus Vegetans,Herpetiform Pemphigus\n" +
//            "Arrhythmogenic Right Ventricular Dysplasia 10,Cardiomyopathy,Dilated,1Bb,Arrhythmogenic Right Ventricular Dysplasia/cardiomyopathy10\n" +
//            "Pemphigus Vegetans,Pemphigus Erythematosus,Herpetiform Pemphigus\n" +
//            "Localized Autosomal Recessive Hypotrichosis,Autosomal Recessive Hypotrichosis,Hypotrichosis\n" +
//            "Woolly Hair Syndrome,Arrhythmogenic Right Ventricular Dysplasia 8,Epidermolysis Bullosa,Lethal Acantholytic\n" +
//            "Dentinogenesis Imperfecta 1,Regional Odontodysplasia,Vaginal Discharge\n" +
//            "Hereditary Sensory And Autonomic Neuropathy Type Vi,Epidermolysis Bullosa Simplex,Sutosomal Recessive 2,Herpes Gestationis\n" +
//            "Congenital Anomalies Of Kidney And Urinary Tract Unilateral Renal Agenesis\n" +
//            "Left Ventricular Noncompaction,Left Ventricular Noncompaction 1,With Or Without Congenital Heart Defects,Vestibular Nystagmus\n" +
//            "Hermansky-Pudlak Syndrome 7,Hermansky-Pudlak Syndrome,Schizophrenia\n" +
//            "Dyschromatosis Universalis Hereditaria 1 Dyschromatosis Universalis Hereditaria\n" +
//            "Dyschromatosis Universalis Hereditaria 2 Dyschromatosis Universalis Hereditaria\n" +
//            "Follicular Thyroid Carcinoma\n" +
//            "Thryoid Dyshormonogenesis 6,Congenital Hypothyroidism,Duox2-Related,Genetic Transient Congenital Hypothyroidism\n" +
//            "Dyshormonogenic Goiter\n" +
//            "Thyroid Dyshormonogenesis 5 Rapsn-Related Congenital Myasthenic Syndrome\n" +
//            "Chromosome 16P11.2 Duplication Syndrome 16P11.2 Duplication\n" +
//            "Chromosome 16P13.3 Duplication\n" +
//            "Chromosome 17P13.3 Duplication Syndrome\n" +
//            "Chromosome 17Q12 Duplication Syndrome\n" +
//            "Chromosome 17Q21.31 Duplication Syndrome\n" +
//            "Chromosome 17Q23.1-Q23.2 Duplication Syndrome\n" +
//            "Chromosome 18 Pericentric Inversion\n" +
//            "Chromosome 1Q21.1 Duplication Syndrome\n" +
//            "22Q11.2 Duplication\n" +
//            "Chromosome 22Q13 Duplication Syndrome\n" +
//            "Chromosome 2Q31.1 Duplication Syndrome\n" +
//            "Chromosome 3Q29 Microduplication Syndrome\n" +
//            "Chromosome 5P13 Duplication Syndrome\n" +
//            "7Q11.23 Duplication Syndrome\n" +
//            "Dupuytren Contracture 1\n" +
//            "Chromosome Xp11.23-P11.22 Duplication Syndrome\n" +
//            "Chromosome Xq27.3-Q28 Duplication Syndrome\n" +
//            "Chromosome Xq28 Duplication Syndrome\n" +
//            "Duane Syndrome Type 1 Duane Retraction Syndrome\n" +
//            "Lung Cancer\n" +
//            "Vaccinia\n" +
//            "Prostate Cancer\n" +
//            "Bannayan-Riley-Ruvalcaba Syndrome,Ruvalcaba Syndrome,Endometrial Carcinoma\n" +
//            "Vaccinia\n" +
//            "Cowden Disease Osteochondroma\n" +
//            "Type 2 Diabetes Mellitus Non-Hodgkin Lymphoma\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Alk-Negative Anaplastic Large Cell Lymphoma Duane Retraction Syndrome\n" +
//            "Dental Enamel Hypoplasia Interstitial Lung Disease\n" +
//            "Embryonal Cancer\n" +
//            "Byssinosis,Vaccinia,Ovarian Cancer Show all 4\n" +
//            "Malt Lymphoma\n" +
//            "Hypogonadotropic Hypogonadism 19 With Or Without Anosmia,Hypogonadotropic Hypogonadism 14 With Or Without Anosmia,Hypogonadotropic Hypogonadism 9 With Or Without Anosmia\n" +
//            "Vaccinia Alcohol Dependence\n" +
//            "Cysticercosis\n" +
//            "Facioscapulohumeral Muscular Dystrophy Embryonal Rhabdomyosarcoma\n" +
//            "Charcot-Marie-Tooth Disease Type 2A,Dentatorubral-Pallidoluysian Atrophy,Familial Adenomatous Polyposis\n" +
//            "Alk-Positive Anaplastic Large Cell Lymphoma Double Outlet Right Ventricle\n" +
//            "Alk-Positive Anaplastic Large Cell Lymphoma\n" +
//            "Dandy-Walker Syndrome\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
//            "Dyggve-Melchior-Clausen Syndrome,Osteochondrodysplasia,Smith Mccort Dysplasia Show all 4\n" +
//            "Mental Retardation,Autosomal Dominant 13,Spinal Muscular Atrophy,Lower Extremity-Predominant 1,Ad,Spinal Muscular Atrophy,Lower Extremity,Autosomal Dominant\n" +
//            "Leukorrhea\n" +
//            "Asphyxiating Thoracic Dystrophy 3,Short Rib-Polydactyly Syndrome Type 3,Short-Rib Thoracic Dysplasia 3 With Or Without Polydactyly\n" +
//            "Ornithine Carbamoyltransferase Deficiency Retinitis Pigmentosa\n" +
//            "Mental Retardation,Autosomal Dominant 7,Down Syndrome,Syndromic Intellectual Disability Show all 4\n" +
//            "Abdominal Obesity-Metabolic Syndrome 3\n" +
//            "Miyoshi Muscular Dystrophy 1,Miyoshi Myopathy,Limb-Girdle Muscular Dystrophy\n" +
//            "Reflex Epilepsy,Infantile Convulsions And Paroxysmal Choreoathetosis,Familial,Benign Familial Infantile Seizures 2\n" +
//            "Dystonia 13,Primary Dystonia,Dyt13 Type Torsion Dystonia\n" +
//            "Dystonia 15,Myoclonic,Dystonia-11,Myoclonic Myoclonus-Dystonia\n" +
//            "Dystonia 17,Dystonia-17,Primary Torsion,Primary Dystonia,Dyt17 Type Show all 4\n" +
//            "Primary Dystonia,Dyt2 Type Torsion Dystonia\n" +
//            "Dystonia 21,Primary Dystonia,Dyt21 Type Torsion Dystonia\n" +
//            "Dystonia 7,Torsion,Dystonia 7,Autosomal Dominant Focal Dystonia,Dyt7 Type\n" +
//            "Dyslexia,Ciliary Dyskinesia,Primary,25 Dyslexia 1\n" +
//            "Ciliary Dyskinesia,Primary,25,Dyslexia 1,Dyslexia\n" +
//            "Dyslexia\n" +
//            "Dyslexia Dyslexia 2\n" +
//            "Dyslexia 3\n" +
//            "Dyslexia 5 Dyslexia\n" +
//            "Dyslexia 6\n" +
//            "Dyslexia 8\n" +
//            "Dyslexia 9\n" +
//            "Retinoblastoma,Gastrointestinal Stromal Tumor,Osteochondroma\n" +
//            "Squamous Cell Carcinoma Of The Head And Neck\n" +
//            "Retinoblastoma\n" +
//            "Erythema Infectiosum\n" +
//            "Tuberous Sclerosis,Type 2 Polycystic Kidney Disease,Type 1\n" +
//            "Episodic Ataxia,Type 3\n" +
//            "Episodic Ataxia,Type 7\n" +
//            "Childhood Leukemia\n" +
//            "Eaf\n" +
//            "Combined Oxidative Phosphorylation Deficiency 12,Anisometropia Primary Cutaneous Amyloidosis\n" +
//            "Cervical Adenocarcinoma,Adenomyosis,Placental Abruption\n" +
//            "Glioblastoma Multiforme,Glioblastoma Thyroid Lymphoma\n" +
//            "Gestational Choriocarcinoma Choriocarcinoma\n" +
//            "Sialadenitis\n" +
//            "Intracranial Hypotension\n" +
//            "Chondrodysplasia Punctata 2,X-Linked,Chondrodysplasia,Digital Anomalies - Intellectual Disability - Short Stature\n" +
//            "Epilepsy,Childhood Absence,1\n" +
//            "Hirschsprung Disease,Cardiac Defects,And Autonomic Dysfunction,Autonomic Dysfunction,Ece1-Related Hirschsprung Disease\n" +
//            "Arthrogryposis,Distal,Type 5D Distal Arthrogryposis\n" +
//            "Myotonic Dystrophy Type 2\n" +
//            "Human Monocytic Ehrlichiosis Sudden Infant Death Syndrome\n" +
//            "Hepatocellular Carcinoma Aplastic Anemia\n" +
//            "Lipoid Proteinosis,Lichen Sclerosus,Lipoid Proteinosis Of Urbach And Wiethe Show all 4\n" +
//            "Biliary Dyskinesia\n" +
//            "Pulpitis\n" +
//            "Centrotemporal Epilepsy\n" +
//            "Ectodermal Dysplasia 5,Hair/nail Type\n" +
//            "Ectodermal Dysplasia 6,Hair/nail Type\n" +
//            "Ectodermal Dysplasia 7,Hair/nail Type\n" +
//            "Ectodermal Dysplasia 8,Hair/tooth/nail Type\n" +
//            "Ectodermal Dysplasia 1,Hypohidrotic,X-Linked,Ectodermal Dysplasia,Hypohidrotic Ectodermal Dysplasia\n" +
//            "Androgenetic Alopecia,Hypohidrotic Ectodermal Dysplasia,Ectodermal Dysplasia 1,Hypohidrotic,X-Linked Show all 4\n" +
//            "Ectodermal Dysplasia 10B,Hypohidrotic/hair/tooth Type,Autosomal Recessive,Ectodermal Dysplasia 10A,Hypohidrotic/hair/nail Type,Autosomal Dominant,Hypohidrotic Ectodermal Dysplasia Autosomal Recessive\n" +
//            "Ectodermal Dysplasia 11B,Hypohidrotic/hair/tooth Type,Autosomal Recessive,Hypohidrotic Ectodermal Dysplasia Autosomal Dominant,Hypohidrotic Ectodermal Dysplasia,Autosomal\n" +
//            "Actinomycosis\n" +
//            "Thoracic Outlet Syndrome Ulnar Neuropathy\n" +
//            "Auriculocondylar Syndrome 3,Question Mark Ears,Isolated,Meconium Aspiration Syndrome\n" +
//            "Aortic Disease,Hypertension,Patent Ductus Arteriosus\n" +
//            "Hirschsprung Disease 4,Waardenburg Syndrome Type Ivb,Edn3-Related Hirschsprung Disease\n" +
//            "Staphylococcal Scarlet Fever,Scarlet Fever,Headache\n" +
//            "Hirschsprung Disease Type 2,Abcd Syndrome,Waardenburg Syndrome Type Iva\n" +
//            "Ehlers-Danlos Syndrome,Type Viii\n" +
//            "Ectodermal Dysplasia-Syndactyly Syndrome 2\n" +
//            "Eec Syndrome-1 Eec Syndrome\n" +
//            "Hiv-1\n" +
//            "Tinea Nigra,Cervical Cancer Feltys Syndrome\n" +
//            "Alzheimers Disease\n" +
//            "Multiple Myeloma\n" +
//            "Multiple Myeloma\n" +
//            "Tinea Nigra \n" +
//            "Multiple Myeloma\n" +
//            "Ovarian Cancer Legionellosis\n" +
//            "Hiv-1 Cystic Echinococcosis\n" +
//            "Spinocerebellar Ataxia 26\n" +
//            "Doyne Honeycomb Retinal Dystrophy,Wolfram Syndrome Age Related Macular Degeneration\n" +
//            "Efemp2-Related Cutis Laxa,Lethal Arteriopathy Syndrome Due To Fibulin-4 Deficiency,Cutis Laxa\n" +
//            "Juvenile Absence Epilepsy,Juvenile Myoclonic Epilepsy,Epilepsy,Juvenile Absence,Susceptibility To,1\n" +
//            "Turner Syndrome\n" +
//            "Non-Small Cell Lung Carcinoma\n" +
//            "Craniofrontonasal Syndrome\n" +
//            "Androgenic Alopecia\n" +
//            "Craniofrontonasal Syndrome Congenital Diaphragmatic Hernia\n" +
//            "Craniofrontonasal Syndrome Endometrial Carcinoma\n" +
//            "Kidney Cancer Non-Small Cell Lung Carcinoma\n" +
//            "Shwachman-Diamond Syndrome\n" +
//            "Mandibulofacial Dysostosis With Microcephaly,Skin Tag,Choanal Atresia\n" +
//            "Angiomatous Meningioma,Renal Hypomagnesemia 4,Estrogen-Receptor Negative Breast Cancer\n" +
//            "Meningioma,Detrusor Sphincter Dyssynergia Fibrous Meningioma\n" +
//            "Brain Ependymoma,Esophageal Basaloid Squamous Cell Carcinoma,Paronychia7\n" +
//            "Idiopathic Generalized Epilepsy Juvenile Myoclonic Epilepsy\n" +
//            "Transient Erythroblastopenia Of Childhood\n" +
//            "Miyoshi Muscular Dystrophy 2 Distal Muscular Dystrophy\n" +
//            "Alcohol Dependence,Sporadic Breast Cancer Conduct Disorder\n" +
//            "Familial Erythrocytosis 3,Hypoxia Erythrocytosis\n" +
//            "Hypoxia\n" +
//            "Hypoxia,Renal Oncocytoma,Phaeochromocytoma\n" +
//            "Hypoxia Pre-Eclampsia\n" +
//            "Fetishism\n" +
//            "Familial Tumoral Calcinosis,Normophosphatemic Familial Tumoral Calcinosis,Aortic Valve Disease\n" +
//            "Charcot-Marie-Tooth Disease Type 1D,Charcot-Marie-Tooth Neuropathy Type 1D,Charcot-Marie-Tooth Disease Type 3\n" +
//            "Ancylostomiasis,Chondromalacia Patellae,Chondromalacia\n" +
//            "Prostate Cancer,Hereditary,12 Prostate Cancer\n" +
//            "Subvalvular Aortic Stenosis Bardet-Biedl Syndrome 1\n" +
//            "Pathological Gambling\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Allergic Urticaria,Vertebrobasilar Insufficiency Ebola Hemorrhagic Fever\n" +
//            "Fanconi Renotubular Syndrome 3,D-Bifunctional Protein Deficiency,Trifunctional Protein Deficiency\n" +
//            "Kleefstra Syndrome,Chromosome 9Q Deletion,Kleefstra Syndrome Due To 9Q34 Microdeletion Show all 4\n" +
//            "Fanconi Anemia,Complementation Group C,Hepatitis D,Rift Valley Fever\n" +
//            "Epiphyseal Dysplasia Multiple With Early-Onset Diabetes Mellitus Brain Ischemia\n" +
//            "Pulmonary Venoocclusive Disease 2,Pulmonary Venoocclusive Disease Yellow Fever\n" +
//            "Retrograde Amnesia,Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter,Eif2B1-Related Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter\n" +
//            "Eif2B2-Related Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter,Leukoencephaly With Vanishing White Matter,Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter Show all 4\n" +
//            "Eif2B3-Related Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter,Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter,Leukodystrophy\n" +
//            "Leukoencephaly With Vanishing White Matter,Ovarioleukodystrophy,Eif2B4-Related Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter Show all 4\n" +
//            "Eif2B5-Related Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter,Childhood Ataxia With Central Nervous System Hypomyelination/vanishing White Matter,Ovarioleukodystrophy\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Cannabis Dependence Uterine Fibroid\n" +
//            "Trichorhinophalangeal Syndrome Type I\n" +
//            "Clonorchiasis\n" +
//            "Cystic Lymphangioma\n" +
//            "Skin Atrophy\n" +
//            "Major Depressive Disorder\n" +
//            "Richieri Costa Pereira Syndrome Vaginal Cancer\n" +
//            "Autism 19,Hypopharynx Cancer,Laryngeal Squamous Cell Carcinoma\n" +
//            "Tuberous Sclerosis\n" +
//            "Lung Adenocarcinoma\n" +
//            "Parkinson Disease 18,Parkinson Disease 1,Mouth Disease\n" +
//            "Amnestic Disorder\n" +
//            "Williams-Beuren Syndrome\n" +
//            "Malaria\n" +
//            "Hiv-1\n" +
//            "Hiv-1\n" +
//            "Shwachman-Diamond Syndrome,Exophthalmos,Junctional Epidermolysis Bullosa Show all 4\n" +
//            "Epilepsy,Idiopathic Generalized 2\n" +
//            "Epilepsy,Idiopathic Generalized 3\n" +
//            "Epilepsy,Idiopathic Generalized 4\n" +
//            "Epilepsy,Idiopathic Generalized 5\n" +
//            "Myoclonic Epilepsy Of Infancy\n" +
//            "Epilepsy,Idiopathic Generalized 7 Juvenile Myoclonic Epilepsy\n" +
//            "Epilepsy,Juvenile Myoclonic 3\n" +
//            "Myoclonic Epilepsy,Juvenile,4\n" +
//            "Epilepsy,Juvenile Myoclonic,Susceptiblity To,9\n" +
//            "Dystonia 19\n" +
//            "Erythrokeratodermia Variabilis\n" +
//            "Combined Oxidative Phosphorylation Deficiency 17,Prostate Cancer,Hereditary,2 Prostate Cancer\n" +
//            "Neutropenia,Severe Congenital 1,Autosomal Dominant,Elane-Related Neutropenia,Otitis Externa4\n" +
//            "Contagious Pustular Dermatitis\n" +
//            "Limbic Encephalitis Encephalitis\n" +
//            "Neuropathy,Paraneoplastic Sensory Paraneoplastic Neurologic Disorders\n" +
//            "Retroperitoneal Sarcoma\n" +
//            "Agammaglobulinemia And Isolated Hormone Deficiency\n" +
//            "Tick-Borne Relapsing Fever Relapsing Fever\n" +
//            "Leukemia\n" +
//            "Diabetic Nephropathy Diaphanospondylodysostosis\n" +
//            "Idiopathic Pulmonary Fibrosis Pulmonary Fibrosis\n" +
//            "Deafness,Autosomal Recessive 88 Deafness,Digenic,Gjb2/gjb3\n" +
//            "Elastosis Perforans Serpiginosa,Hepatoportal Sclerosis,Dissecting Aortic Aneurysm\n" +
//            "Stomatitis\n" +
//            "Peroxisomal Disease\n" +
//            "Gastric Antral Vascular Ectasia\n" +
//            "Stargardt Disease 3,Ichthyosis,Spastic Quadriplegia,And Mental Retardation,Spastic Quadriplegia\n" +
//            "Spinocerebellar Ataxia 38 Low Tension Glaucoma\n" +
//            "Cholecystolithiasis Choledocholithiasis\n" +
//            "Eastern Equine Encephalitis\n" +
//            "Riley-Day Syndrome\n" +
//            "Aniridia,Articulation Disorder,Developmental Coordination Disorder\n" +
//            "Gastric Cancer Angiolipoma\n" +
//            "Emery-Dreifuss Muscular Dystrophy 1,X-Linked,Emerinopathy,Emd-Related Emery-Dreifuss Muscular Dystrophy,X-Linked\n" +
//            "Bowen-Conradi Syndrome Sporadic Breast Cancer\n" +
//            "Porokeratosis Of Mibelli,Myopia-2 Porokeratosis\n" +
//            "Usher Syndrome,Retinitis Pigmentosa Usher Syndrome Type I\n" +
//            "Selection Of Therapeutic Option In Non-Small Cell Lung Carcinoma Congenital Pulmonary Airway Malformation\n" +
//            "Idiopathic Steroid-Sensitive Nephrotic Syndrome With Focal Segmental Hyalinosis,Idiopathic Steroid-Sensitive Nephrotic Syndrome With Minimal Change,Nephrotic Syndrome,Type 10\n" +
//            "Episodic Muscle Weakness,X-Linked\n" +
//            "Schizencephaly,Familial Schizencephaly,Emx2-Related,Neuronal Migration Disorders\n" +
//            "Tyrosinemia Type Iii,Sudden Infant Death Syndrome,Congenital Central Hypoventilation Syndrome\n" +
//            "Autistic Disorder Autism Spectrum Disorder\n" +
//            "Amelogenesis Imperfecta,Type Ib,Amelogenesis Imperfecta,Type Ic,Amelogenesis Imperfecta\n" +
//            "Endometriosis 1 Endometriosis\n" +
//            "Mitochondrial Disorders Osteosarcoma\n" +
//            "Mucinous Cystadenocarcinoma\n" +
//            "Epilepsy,Nocturnal Frontal Lobe,Type 2\n" +
//            "Hereditary Hemorrhagic Telangiectasia,Weber Syndrome,Familial Cerebral Saccular Aneurysm\n" +
//            "Sparganosis Fucosidosis\n" +
//            "Non-Herpetic Acute Limbic Encephalitis,Enolase Deficiency,Limbic Encephalitis\n" +
//            "Malignant Granular Cell Myoblastoma,Middle Ear Adenoma,Pediatric Ovarian Dysgerminoma1\n" +
//            "Coenzyme Q10 Deficiency Disease,Lymphocytic Hypophysitis,Discoid Lupus Erythematosus\n" +
//            "Rothmund-Thomson Syndrome\n" +
//            "Neurogenic Hypertension,Gestational Choriocarcinoma Choriocarcinoma\n" +
//            "Cole Disease,Ossification Of The Posterior Longitudinal Ligament Of The Spine,Arterial Calcification Of Infancy\n" +
//            "Sm-Ahnmd Bile Duct Disease\n" +
//            "Familial Adenomatous Polyposis\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Hypotrichosis Simplex Skin Disease\n" +
//            "Gastric Adenocarcinoma\n" +
//            "Psoriatic Arthritis\n" +
//            "Galactosialidosis\n" +
//            "Angelman Syndrome\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Sjogrens Syndrome\n" +
//            "Normophosphatemic Familial Tumoral Calcinosis Familial Tumoral Calcinosis\n" +
//            "Otospondylomegaepiphyseal Dysplasia,Fibrochondrogenesis Stickler Syndrome\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Hepatitis B Virus Infection\n" +
//            "Breast And Colorectal Cancer\n" +
//            "C4A Deficiency Sle Susceptibility\n" +
//            "Syndromic Diarrhea Diarrhea\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Diabetic Nephropathy\n" +
//            "Pancreatic Ductal Adenocarcinoma\n" +
//            "Hemochromatosis\n" +
//            "Papillary Thyroid Carcinoma Germ Cell Tumors\n" +
//            "Syndromic Diarrhea Diarrhea\n" +
//            "Gastric Adenocarcinoma\n" +
//            "Galactosialidosis\n" +
//            "Gastric Adenocarcinoma\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Normophosphatemic Familial Tumoral Calcinosis Familial Tumoral Calcinosis\n" +
//            "Gastric Adenocarcinoma\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Syndromic Diarrhea Diarrhea\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Hepatitis B Virus Infection\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Galactosialidosis\n" +
//            "Pancreatic Ductal Adenocarcinoma\n" +
//            "Galactosialidosis\n" +
//            "Hemochromatosis\n" +
//            "C4A Deficiency Sle Susceptibility\n" +
//            "Otospondylomegaepiphyseal Dysplasia,Fibrochondrogenesis Stickler Syndrome\n" +
//            "Hepatitis B Virus Infection\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "C4B Deficiency Sle Susceptibility\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "C4B Deficiency Sle Susceptibility\n" +
//            "Galactosialidosis\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Normophosphatemic Familial Tumoral Calcinosis Familial Tumoral Calcinosis\n" +
//            "Syndromic Diarrhea\n" +
//            "Diabetic Nephropathy\n" +
//            "Hepatitis B Virus Infection\n" +
//            "Papillary Thyroid Carcinoma Germ Cell Tumors\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Pancreatic Ductal Adenocarcinoma\n" +
//            "Psoriatic Arthritis\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Hepatitis B Virus Infection\n" +
//            "Stickler Syndrome,Otospondylomegaepiphyseal Dysplasia Fibrochondrogenesis\n" +
//            "Psoriatic Arthritis\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Diabetic Nephropathy\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Syndromic Diarrhea\n" +
//            "Hemochromatosis\n" +
//            "Gastric Adenocarcinoma\n" +
//            "Hemochromatosis\n" +
//            "Galactosialidosis\n" +
//            "Papillary Thyroid Carcinoma Germ Cell Tumors\n" +
//            "Hepatitis B Virus Infection\n" +
//            "Galactosialidosis\n" +
//            "Pancreatic Ductal Adenocarcinoma\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Stickler Syndrome,Otospondylomegaepiphyseal Dysplasia Fibrochondrogenesis\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Chronic Atypical Neutrophilic Dermatosis With Lipodystrophy And Elevated Temperature Hiv-1\n" +
//            "Hemochromatosis\n" +
//            "C4B Deficiency Sle Susceptibility\n" +
//            "Hepatitis C Virus\n" +
//            "Papillary Thyroid Carcinoma Germ Cell Tumors\n" +
//            "Hypotrichosis Simplex Skin Disease\n" +
//            "Hypotrichosis Simplex Skin Disease\n" +
//            "Pancreatic Ductal Adenocarcinoma\n" +
//            "Hypotrichosis Simplex Skin Disease\n" +
//            "Hemochromatosis\n" +
//            "Normophosphatemic Familial Tumoral Calcinosis Familial Tumoral Calcinosis\n" +
//            "Hemochromatosis\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Cortical Dysplasia,Complex,With Other Brain Malformations\n" +
//            "Spastic Paraplegia 64,Radiation Proctitis Proctitis\n" +
//            "Dentin Sensitivity Cholera\n" +
//            "Mucocutaneous Leishmaniasis\n" +
//            "Mucocutaneous Leishmaniasis\n" +
//            "Esophagitis,Eosinophilic,1 Esophagitis\n" +
//            "Esophagitis,Eosinophilic,2 Esophagitis\n" +
//            "Adams-Oliver Syndrome 4,Oliver Syndrome,Adams-Oliver Syndrome 1 Show all 4\n" +
//            "Microcephaly - Polymicrogyria - Corpus Callosum Agenesis\n" +
//            "Familial Eosinophilia\n" +
//            "Rubinstein-Taybi Syndrome 2,Ep300-Related Rubinstein-Taybi Syndrome,Rubinstein-Taybi Syndrome\n" +
//            "Ossifying Fibromyxoid Tumor\n" +
//            "Sporadic Pheochromocytoma,Multiple Paragangliomas Associated With Polycythemia,Sporadic Secreting Paraganglioma\n" +
//            "Elliptocytosis-1,Hereditary Elliptocytosis,Homozygous Hereditary Elliptocytosis\n" +
//            "Mental Retardation,Autosomal Dominant 11 Mental Retardation,Autosomal Dominant 6\n" +
//            "Malignant Ependymoma\n" +
//            "Adenocarcinoma,Meningioma Benign Meningioma\n" +
//            "Intussusception\n" +
//            "Epb42-Related Hereditary Spherocytosis,Spherocytosis,Hereditary,Type 5,Epb42-Related Spherocytosis\n" +
//            "Adult T-Cell Leukemia T-Cell Leukemia\n" +
//            "Lymph Node Tuberculosis\n" +
//            "Diarrhea 5,With Tufting Enteropathy,Congenital,Tufting Enteropathy,Adenosquamous Carcinoma\n" +
//            "Colorectal Cancer\n" +
//            "Vici Syndrome\n" +
//            "Trichostrongylosis,Hard Palate Cancer,Necatoriasis\n";
//            "Cataract 6,Multiple Types,Cataract,Age-Related Cortical,2,Brain Stem Glioma\n" +
//            "Pleomorphic Rhabdomyosarcoma Colorectal Cancer\n" +
//            "Staphyloenterotoxemia\n" +
//            "Drug Psychosis\n" +
//            "Brachydactyly-Syndactyly Syndrome Gallbladder Adenocarcinoma\n" +
//            "Prostate Cancer/brain Cancer Susceptibility,Somatic,Prostate Cancer,Craniofrontonasal Syndrome\n" +
//            "Spinal Cord Ependymoma\n" +
//            "Prostate Cancer Endometrial Carcinoma\n" +
//            "Colorectal Cancer,Familial Colorectal Cancer Gliosarcoma\n" +
//            "Fetal Hydantoin Syndrome,Diphenylhydantoin Toxicity,Pre-Eclampsia\n" +
//            "Hypercholesterolemia,Familial,Due To Ldlr Defect,Modifier Of,Hypercholesterolemia,Familial Hypercholesterolemia\n" +
//            "Progressive Myoclonus Epilepsy,Lafora Type,Lafora Disease,Myoclonus\n" +
//            "Acquired Pure Red Cell Aplasia,Microvascular Complications Of Diabetes 2,Congenital Hypoplastic Anemia1\n" +
//            "Primary Polycythemia,Olfactory Neuroblastoma,Acute Erythroid Leukemia\n" +
//            "Infertility Male Infertility\n" +
//            "Vacterl Association\n" +
//            "Epilepsy,Partial,With Pericentral Spikes\n" +
//            "Epilepsy,Rolandic With Paroxysmal Exercise-Induced Dystonia And Writers Cramp\n" +
//            "Hemorrhagic Cystitis\n" +
//            "Troyer Syndrome\n" +
//            "Deafness,Autosomal Recessive 102 Deafness,Digenic,Gjb2/gjb3\n" +
//            "Pagets Disease Of Bone Hypotrichosis 4\n" +
//            "Staphyloenterotoxemia Exocrine Pancreatic Insufficiency\n" +
//            "Eosinophil Peroxidase Deficiency,Urinary Schistosomiasis,Endocarditis\n" +
//            "Posterior Amorphous Corneal Dystrophy\n" +
//            "Juvenile Psoriatic Arthritis,Ankylosing Spondylitis,Psoriatic Arthritis Show all 4\n" +
//            "Acquired Immunodeficiency Syndrome Hypoplastic Left Heart Syndrome\n" +
//            "Breast Scirrhous Carcinoma,Lipid-Rich Carcinoma,Ductal Carcinoma In Situ5\n" +
//            "Lethal Congenital Contracture Syndrome 2,Lethal Congenital Contractural Syndrome 2,Gestational Trophoblastic Tumor\n" +
//            "Amyotrophic Lateral Sclerosis Type 19,Amyotrophic Lateral Sclerosis Type 18,Medulloblastoma\n" +
//            "Distal Monosomy 12P,Papillary Carcinoma,Follicular Thyroid Carcinoma\n" +
//            "Blastomycosis\n" +
//            "Ercc1-Related Xeroderma Pigmentosum,Cerebrooculofacioskeletal Syndrome 4,Pancreas Adenocarcinoma\n" +
//            "Chromosome 19Q Deletion,Cerebrooculofacioskeletal Syndrome 2,Cerebro-Oculo-Facio-Skeletal Syndrome\n" +
//            "Xeroderma Pigmentosum,Group B,Photosensitive Trichothiodystrophy,Ercc3-Related Xeroderma Pigmentosum\n" +
//            "Xeroderma Pigmentosum,Type F/cockayne Syndrome,Fanconi Anemia,Complementation Group Q,Xfe Progeroid Syndrome\n" +
//            "Xeroderma Pigmentosum,Group G,Xeroderma Pigmentosum,Group G/cockayne Syndrome,Ercc5-Related Xeroderma Pigmentosum\n" +
//            "De Sanctis-Cacchione Syndrome,Uv-Sensitive Syndrome 1,Psammomatous Meningioma\n" +
//            "Bone Marrow Failure Syndrome 2\n" +
//            "Uv-Sensitive Syndrome 2,Cockayne Syndrome,Ercc8-Related Cockayne Syndrome\n" +
//            "Colorectal Cancer,Hypopharynx Cancer,Erythropoietic Protoporphyria Show all 4\n" +
//            "Craniosynostosis 4,Venezuelan Equine Encephalitis,Pericardial Mesothelioma\n" +
//            "Prostate Cancer,Peripheral Primitive Neuroectodermal Tumor,Acute Myeloid Leukemia\n" +
//            "Breast Cancer\n" +
//            "Autosomal Recessive Spastic Paraplegia Type 62\n" +
//            "Spastic Paraplegia 18,Spastic Paraplegia 18,Autosomal Recessive,Recessive Intellectual Disability - Motor Dysfunction - Multiple Joint Contractures Show all 4\n" +
//            "Periventricular Nodular Heterotopia 6,6Q Terminal Deletion Syndrome Periventricular Nodular Heterotopia\n" +
//            "Choriocarcinoma\n" +
//            "Kidney Cancer\n" +
//            "Hiv-1\n" +
//            "Hiv-1 Ovarian Germ Cell Tumor\n" +
//            "Choriocarcinoma,Hiv-1 Schizophrenia\n" +
//            "Nail Disease Roberts Syndrome\n" +
//            "Sc Phocomelia Syndrome,Roberts Syndrome Phocomelia\n" +
//            "Bilateral Retinoblastoma,Patau Syndrome Retinoblastoma\n" +
//            "Deafness,Autosomal Recessive 36,Dfnb36 Nonsyndromic Hearing Loss And Deafness,Deafness,Neurosensory,Without Vestibular Involvement,Autosomal Dominant\n" +
//            "Trigeminal Autonomic Cephalalgia,Vulvar Syringoma,Estrogen Resistance1\n" +
//            "Serous Cystadenocarcinoma,Ovarian Serous Cystadenocarcinoma,Gender Identity Disorder\n" +
//            "Endometrial Carcinoma Breast Cancer\n" +
//            "Deafness,Autosomal Recessive 35,Dfnb35 Nonsyndromic Hearing Loss And Deafness,Dosage-Sensitive Sex Reversal\n" +
//            "Breast Cancer Vaginal Cancer\n" +
//            "Allan-Herndon-Dudley Syndrome,Germ Cell Tumors Testicular Germ Cell Tumor\n" +
//            "Glutaric Acidemia Iia,Multiple Acyl-Coa Dehydrogenation Deficiency,Severe Neonatal Type,Multiple Acyl-Coa Dehydrogenation Deficiency,Mild Type\n" +
//            "Glutaric Acidemia Iib,Glutaric Acidemia Type Ii,Lipid Storage Disease\n" +
//            "Glutaric Acidemia Type Ii,Glutaric Acidemia Iic,Riboflavin Deficiency\n" +
//            "Ethylmalonic Encephalopathy\n" +
//            "Epilepsy,Familial Temporal Lobe,2\n" +
//            "Epilepsy,Familial Temporal Lobe,4\n" +
//            "Schizophrenia Essential Tremor\n" +
//            "Tremor Hereditary Essential,2 Tremor\n" +
//            "Tremor,Hereditary Essential,3\n" +
//            "Alcohol Dependence\n" +
//            "Meningioma Jacobsen Syndrome\n" +
//            "Frey Syndrome\n" +
//            "Prostate Cancer,Peripheral Primitive Neuroectodermal Tumor Gastrointestinal Stromal Tumor\n" +
//            "Brain Cancer\n" +
//            "Peripheral Primitive Neuroectodermal Tumor Extraosseous Ewings Sarcoma\n" +
//            "Chromosome 12P Deletion,Congenital Mesoblastic Nephroma,Fibrosarcoma\n" +
//            "Prostate Cancer\n" +
//            "Weyers Acrofacial Dysostosis,Evc-Related Ellis-Van Creveld Syndrome,Ellis-Van Creveld Syndrome\n" +
//            "Ellis-Van Creveld Syndrome,Evc2-Related Ellis-Van Creveld Syndrome,Weyers Acrofacial Dysostosis\n" +
//            "Neuroblastoma\n" +
//            "Esophageal Varix Hypersplenism\n" +
//            "Follicular Dendritic Cell Sarcoma,Dendritic Cell Sarcoma,Paraneoplastic Pemphigus\n" +
//            "Exudative Vitreoretinopathy 3 Exudative Vitreoretinopathy\n" +
//            "Connective Tissue Benign Neoplasm,Desmoplastic Small Round Cell Tumor,Neuroepithelioma\n" +
//            "Colorectal Cancer,Chilblain Lupus Aicardi-Goutieres Syndrome\n" +
//            "Hepatitis B\n" +
//            "Eastern Equine Encephalitis\n" +
//            "Scleroderma Polymyositis\n" +
//            "Exosc3-Related Pontocerebellar Hypoplasia,Pontocerebellar Hypoplasia Pontocerebellar Hypoplasia Type 1A\n" +
//            "Cat-Scratch Disease\n" +
//            "Papillary Thyroid Carcinoma\n" +
//            "Pontocerebellar Hypoplasia,Type 1C\n" +
//            "Scleroderma Polymyositis\n" +
//            "Epidermolysis Bullosa,Nonspecific,Autosomal Recessive\n" +
//            "Hereditary Multiple Exostoses,Chondrosarcoma,Exostoses,Multiple,Type 1\n" +
//            "Dysplasia Epiphysealis Hemimelica,Hereditary Multiple Osteochondromas,Osteochondroma\n" +
//            "Exostoses,Multiple,Type 3 Hereditary Multiple Exostoses\n" +
//            "Hereditary Multiple Exostoses Exostosis\n" +
//            "Hereditary Multiple Exostoses Exostosis\n" +
//            "Trichomoniasis,Exostosis,Hereditary Multiple Exostoses\n" +
//            "Branchiootic Syndrome,Anterior Segment Anomalies With Or Without Cataract,Branchiootic Syndrome 1\n" +
//            "Eya4-Related Dilated Cardiomyopathy,Cardiomyopathy,Dilated,1J,Dfna10 Nonsyndromic Hearing Loss And Deafness\n" +
//            "Retinitis Pigmentosa 25,Eys-Related Retinitis Pigmentosa,Retinitis Pigmentosa\n" +
//            "Weaver Syndrome\n" +
//            "Ezh2-Related Overgrowth,Weaver Syndrome,Chronic Myelomonocytic Leukemia\n" +
//            "Osteosarcoma,Prostate Cancer,Pleomorphic Malignant Fibrous Histiocytoma\n" +
//            "Factor X Deficiency,Quebec Platelet Disorder,Hemarthrosis\n" +
//            "Factor Xi Deficiency,Factor Xi Deficiency,Autosomal Dominant,Factor Xi Deficiency,Autosomal Recessive\n" +
//            "Hereditary Angioedema Type Iii,Factor Xii Deficiency,Hereditary Angioedema\n" +
//            "Factor Xiii Subunit A Deficiency,Self-Healing Papular Mucinosis,Xanthoma Disseminatum\n" +
//            "Factor Xiii Subunit B Deficiency,Factor Xiiib Deficiency,Varicose Veins\n" +
//            "Non-A-E Hepatitis,Thrombophilia Due To Thrombin Defect,Prothrombin Deficiency8\n" +
//            "5Q- Syndrome,Bernard-Soulier Syndrome,Melanoma Metastasis Show all 4\n" +
//            "Pulmonary Vein Stenosis,Neuroleptic Malignant Syndrome,Papillary Adenocarcinoma Show all 4\n" +
//            "Schizophrenia Ovarian Cancer\n" +
//            "Multifocal Lymphangioendotheliomatosis With Thrombocytopenia,Hantavirus Pulmonary Syndrome,Heparin-Induced Thrombocytopenia7\n" +
//            "Thrombophilia Due To Activated Protein C Resistance,Factor V Leiden Thrombophilia,Intracranial Sinus Thrombosis7\n" +
//            "Factor Vii Deficiency,Myocardial Infarction,Decreased,Ischemic Heart Disease\n" +
//            "Moderately Severe Hemophilia A,Type 2N Von Willebrand Disease,Mild Hemophilia A\n" +
//            "Acquired Hemophilia Severe Hemophilia A\n" +
//            "Severe Hemophilia A\n" +
//            "Severe Hemophilia A\n" +
//            "Thrombophilia,X-Linked,Due To Factor Ix Defect,Severe Hemophilia B,Mild Hemophilia B\n" +
//            "Spastic Paraplegia 35,Fatty Acid Hydroxylase-Associated Neurodegeneration,Spastic Paraparesis\n" +
//            "Autoimmune Encephalitis,Drug Addiction,Somatoform Disorder\n" +
//            "Hepatocellular Adenoma,Thin Basement Membrane Nephropathy,Kidney Cancer Show all 4\n" +
//            "Myocardial Infarction,Bladder Squamous Cell Carcinoma,Fascioliasis\n" +
//            "Insulin Resistance,Ileitis,Intestinal Disease\n" +
//            "Pulmonary Embolism,Acute Myocardial Infarction,Aortic Valve Disease\n" +
//            "Crohns Disease\n" +
//            "Cerebellar Liponeurocytoma,Coronary Restenosis,Back Pain\n" +
//            "Psoriasis Bladder Squamous Cell Carcinoma\n" +
//            "Colorectal Adenocarcinoma\n" +
//            "Optic Nerve Glioma,Subependymal Giant Cell Astrocytoma,Malignant Glioma\n" +
//            "Sporadic Breast Cancer\n" +
//            "Infections,Recurrent,With Encephalopathy,Hepatic Dysfunction,And Cardiovasuclar Malformations,Oral Cavity Cancer,Japanese Encephalitis\n" +
//            "Insulin Resistance,Metabolic Syndrome X Vitelliform Macular Dystrophy\n" +
//            "Vitelliform Macular Dystrophy Paranoid Schizophrenia\n" +
//            "Atopic Dermatitis,Dermatitis Enophthalmos\n" +
//            "Tyrosinemia Type I,Tyrosinemia,Tyrosinemia Type Ii\n" +
//            "Renal Cell Carcinoma\n" +
//            "Kenny-Caffey Syndrome Type 2 Gracile Bone Dysplasia\n" +
//            "Poikiloderma,Hereditary Fibrosing,With Tendon Contractures,Myopathy,And Pulmonary Fibrosis\n" +
//            "Amyotrophic Lateral Sclerosis Lateral Sclerosis\n" +
//            "Myiasis Achondrogenesis\n" +
//            "Hypomyelination And Congenital Cataract\n" +
//            "Pineoblastoma\n" +
//            "Melanoma\n" +
//            "Hereditary Sensory And Autonomic Neuropathy Type Iib,Vascular Dementia,Autonomic Neuropathy\n" +
//            "Extrapulmonary Tuberculosis\n" +
//            "Idiopathic Pulmonary Fibrosis\n" +
//            "Enterobiasis\n" +
//            "Retinitis Pigmentosa 28,Fam161A-Related Retinitis Pigmentosa,Retinitis Pigmentosa Show all 4\n" +
//            "Retinitis Pigmentosa 28 Retinitis Pigmentosa\n" +
//            "Neuroblastoma\n" +
//            "Keratolytic Winter Erythema\n" +
//            "Tongue Cancer\n" +
//            "Diabetic Angiopathy\n" +
//            "Hepatitis C Virus,Hepatitis C Hepatitis\n" +
//            "Familial Breast Cancer\n" +
//            "Infantile Onset Spinocerebellar Ataxia\n" +
//            "Retinoblastoma\n" +
//            "Amelogenesis Imperfecta And Gingival Hyperplasia Syndrome,Amelogenesis Imperfecta And Gingival Fibromatosis Syndrome,Amelogenesis Imperfecta,Type Ig Show all 4\n" +
//            "Exostosis\n" +
//            "Raine Syndrome\n" +
//            "Chronic Lymphocytic Leukemia,Primary Biliary Cirrhosis,Esophageal Squamous Cell Carcinoma\n" +
//            "Brain Cancer\n" +
//            "Vaccinia\n" +
//            "Cartilage-Hair Hypoplasia\n" +
//            "Chronic Myeloid Leukemia\n" +
//            "Pancreatic Cancer,Osteopoikilosis,Intestinal Atresia Show all 4\n" +
//            "Chromosome 1P Deletion Yellow Fever\n" +
//            "Recurrent Corneal Erosion\n" +
//            "Lung Adenocarcinoma Adenocarcinoma\n" +
//            "Star Syndrome Syndactyly\n" +
//            "Deafness,Digenic,Gjb2/gjb3\n" +
//            "Gastric Cancer\n" +
//            "Adult Medulloblastoma,Amelogenesis Imperfecta,Type Iii Amelogenesis Imperfecta,Type Ib\n" +
//            "Breast Cancer,Gastroesophageal Junction Adenocarcinoma Breast Cancer Susceptibility\n" +
//            "Hereditary Myopathy With Early Respiratory Failure\n" +
//            "Fatty Liver Disease Pulmonary Function\n" +
//            "Uterine Fibroid\n" +
//            "Epilepsy,Myoclonic,Familial Adult,3\n" +
//            "Epilepsy,Familial Adult Myoclonic,4\n" +
//            "Karyomegalic Interstitial Nephritis,Interstitial Nephritis,Chronic Kidney Failure\n" +
//            "Fanconi Anemia,Complementation Group A,Fanca-Related Fanconi Anemia,Fanconis Anemia\n" +
//            "Fanconi Anemia,Complementation Group B,Fancb-Related Fanconi Anemia,Vacterl With Hydrocephalus,Fancb-Related\n" +
//            "Fanconi Anemia,Complementation Group C,Fancc-Related Fanconi Anemia,Fanconis Anemia\n" +
//            "Fanconi Anemia,Complementation Group D2,Fancd2-Related Fanconi Anemia,Fanconis Anemia\n" +
//            "Fanconi Anemia,Complementation Group D2\n" +
//            "Fanconi Anemia,Complementation Group D2\n" +
//            "Fanconi Anemia,Complementation Group E,Fance-Related Fanconi Anemia,Fanconi Anemia,Complementation Group M\n" +
//            "Fanconi Anemia,Complementation Group F,Fancf-Related Fanconi Anemia,Fanconi Anemia,Complementation Group B\n" +
//            "Fanconi Anemia,Complementation Group G,Fancg-Related Fanconi Anemia,Fanconi Anemia,Complementation Group A\n" +
//            "Fanconi Anemia,Complementation Group I,Fanci-Related Fanconi Anemia,Fanconis Anemia Show all 4\n" +
//            "Fanconi Anemia,Complementation Group L,Fanconis Anemia,Fancl-Related Fanconi Anemia\n" +
//            "Fanconi Anemia,Complementation Group M,Fancm-Related Fanconi Anemia,Fanconis Anemia Show all 4\n" +
//            "Infiltrative Basal Cell Carcinoma,Melanoma Pharyngitis\n" +
//            "Combined Oxidative Phosphorylation Deficiency 14 Alpers Syndrome\n" +
//            "Impetigo\n" +
//            "Autoimmune Lymphoproliferative Syndrome,Type Ia,Burn Scar,Autoimmune Lymphoproliferative Syndrome\n" +
//            "Silicosis,Autoimmune Lymphoproliferative Syndrome,Type Ib,Faslg-Related Autoimmune Lymphoproliferative Syndrome\n" +
//            "Trophoblastic Neoplasm,Prostate Cancer,Insulin Resistance\n" +
//            "Autism Spectrum Disorder\n" +
//            "Fastkd2-Related Infantile Mitochondrial Encephalomyopathy Cytochrome-C Oxidase Deficiency Disease\n" +
//            "Dentin Caries\n" +
//            "Skin Squamous Cell Carcinoma\n" +
//            "Van Maldergem Syndrome 2,Hennekam Lymphangiectasia-Lymphedema Syndrome 2,Cystic Kidney\n" +
//            "Sarcoma\n" +
//            "Nocardiosis Hypermobility Syndrome\n" +
//            "Diffuse Scleroderma Scleroderma\n" +
//            "Skin Atrophy,Ovarian Serous Carcinoma Kindler Syndrome\n" +
//            "Vitreoretinal Dystrophy,Fbln1-Related Developmental Delay-Central Nervous System Anomaly-Syndactyly Syndrome,Synpolydactyly,3/34,Associated With Metacarpal And Metatarsal Synostoses \n" +
//            "Osteochondritis Dissecans Familial Osteochondritis Dissecans\n" +
//            "Mid-Dermal Elastolysis,Cutis Laxa,Autosomal Dominant,Fbln5-Related Cutis Laxa\n" +
//            "Isolated Ectopia Lentis,Geleophysic Dysplasia 2,Acromicric Dysplasia\n" +
//            "Congenital Contractural Arachnodactyly,Dental Pulp Calcification,Geleophysic Dysplasia\n" +
//            "Weill-Marchesani Syndrome\n" +
//            "Fructose-1,6-Bisphosphatase Deficiency,Metabolic Acidosis,Acute Pyelonephritis Show all 4\n" +
//            "Fructose-1,6-Bisphosphatase Deficiency Glycogen Storage Disease Type 1A\n" +
//            "Psoriasis\n" +
//            "Estrogen-Receptor Positive Breast Cancer\n" +
//            "Mitochondrial Dna Depletion Syndrome 13\n" +
//            "Vitiligo\n" +
//            "Benign Paroxysmal Positional Nystagmus Herpes Simplex\n" +
//            "Mast Cell Neoplasm\n" +
//            "Chronic Myeloid Leukemia\n" +
//            "Mental Retardation,Autosomal Recessive 45,Breast Cancer,Mast Cell Neoplasm Show all 4\n" +
//            "Myopathy Of Critical Illness Acquired Immunodeficiency Syndrome\n" +
//            "Osteoporosis\n" +
//            "Neuronopathy,Distal Hereditary Motor,Type Iid Neuropathy,Distal Hereditary Motor,Type Iia\n" +
//            "Papillary Renal Cell Carcinoma\n" +
//            "Tetraploidy\n" +
//            "Panophthalmitis,Parkinson Disease 15,Autosomal Recessive,Fbxo7-Related Parkinson Disease\n" +
//            "Foodborne Botulism,Infant Botulism,Intestinal Botulism\n" +
//            "Split-Hand/foot Malformation 3,Split Hand,Split Foot\n" +
//            "Split Hand\n" +
//            "Glomuvenous Malformation,Breast Cancer Colorectal Cancer\n" +
//            "3-M Syndrome\n" +
//            "Mucoepidermoid Carcinoma\n" +
//            "Spondylitis,Oral Lichen Planus Aggressive Periodontitis\n" +
//            "Mast-Cell Leukemia,Allergic Asthma,Urticaria\n" +
//            "Aplastic Anemia\n" +
//            "Chronic Conjunctivitis,Intrinsic Asthma,Extrinsic Allergic Alveolitis\n" +
//            "Pharyngitis,Peritonitis Sepsis\n" +
//            "Asymptomatic Dengue,Lupus Nephritis,Pseudomonas Aeruginosa Chronic Infection By,In Cystic Fibrosis\n" +
//            "Chronic Polyneuropathy,Malaria,Systemic Lupus Erythematosus\n" +
//            "Autoimmune Thrombocytopenic Purpura Purpura\n" +
//            "Neonatal Neutropenia,Herpes Zoster,Immunodeficiency 20\n" +
//            "Aggressive Periodontitis,Primary Immunodeficiency Disease,Neutropenia,Alloimmune Neonatal\n" +
//            "Persistent Fetal Circulation Syndrome,Hypoproteinemia,Hypercatabolic Epidermolysis Bullosa Acquisita\n" +
//            "Epilepsy,Myoclonic,Familial Adult,3\n" +
//            "Mannose-Binding Lectin Deficiency\n" +
//            "Cutaneous Leishmaniasis Rheumatic Fever\n" +
//            "Immunodeficiency Due To Ficolin 3 Deficiency,Mannose-Binding Lectin Deficiency,Rheumatic Fever\n" +
//            "Fetal Hemoglobin Quantitative Trait Locus 3,Congenital Cataracts,Facial Dysmorphism,And Neuropathy Hereditary Persistence Of Fetal Hemoglobin\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Autoimmune Pancreatitis,Rheumatoid Arthritis,Juvenile Rheumatoid Arthritis\n" +
//            "Multiple Myeloma,Non-Hodgkin Lymphoma,Myeloma\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Viral Pneumonia Chronic Lymphocytic Leukemia\n" +
//            "Smith-Lemli-Opitz Syndrome,Keratolytic Winter Erythema Sitosterolemia\n" +
//            "Osteonecrosis Of The Jaw\n" +
//            "Vitamin D-Dependent Rickets Type I,Congenital Adrenal Insufficiency,Lipoid Adrenal Hyperplasia Show all 4\n" +
//            "Locked-In Syndrome,Prostate Cancer,Congenital Adrenal Insufficiency Show all 4\n" +
//            "Febrile Seizures,Familial,1\n" +
//            "Febrile Seizures,Familial,10\n" +
//            "Febrile Seizures,Familial,2\n" +
//            "Usher Syndrome,Type 2C,Usher Syndrome,Type 2C,Gpr98/pdzd7 Digenic Febrile Seizures,Familial,4\n" +
//            "Febrile Seizures,Familial,5\n" +
//            "Febrile Seizures,Familial,6\n" +
//            "Febrile Seizures,Familial,7\n" +
//            "Febrile Seizures,Familial,9\n" +
//            "Corneal Dystrophy Fuchs Endothelial 2\n" +
//            "Corneal Dystrophy,Fuchs Endothelial,3\n" +
//            "Corneal Dystrophy,Fuchs Endothelial,5\n" +
//            "Corneal Dystrophy,Fuchs Endothelial,7\n" +
//            "Erythropoietic Protoporphyria,Autosomal Recessive,Erythropoietic Protoporphyria,X-Linked Protoporphyria\n" +
//            "Alzheimers Disease\n" +
//            "Vitelliform Macular Dystrophy,Macular Dystrophy Werner Syndrome\n" +
//            "Congenital Fibrosis Of The Extraocular Muscles\n" +
//            "Sarcoma Encephalitis\n" +
//            "Acrocephalosyndactylia Breast And Colorectal Cancer\n" +
//            "Kindler Syndrome,Hereditary Acrokeratotic Poikiloderma,Weary Type Skin Atrophy\n" +
//            "Kindler Syndrome\n" +
//            "Leukocyte Adhesion Deficiency,Type Iii,Leukocyte Adhesion Deficiency Kindler Syndrome\n" +
//            "Sarcoma Acute Promyelocytic Leukemia\n" +
//            "Hantavirus Pulmonary Syndrome\n" +
//            "Eating Disorder\n" +
//            "Esophageal Squamous Cell Carcinoma Schizophrenia\n" +
//            "Hypogonadotropic Hypogonadism With Or Without Anosmia,Uterine Inversion,Breast Metaplastic Carcinoma\n" +
//            "Breast Metaplastic Carcinoma,Uterine Inversion Lymph Node Tuberculosis\n" +
//            "Pertussis\n" +
//            "Obesity\n" +
//            "Dysfibrinogenemia,Hypodysfibrinogenemia,Congenital,Familial Visceral Amyloidosis\n" +
//            "Congenital Afibrinogenemia,Afibrinogenemia,Hypofibrinogenemia,Congenital\n" +
//            "Crane-Heise Syndrome,Unilateral Focal Polymicrogyria,Aarskog-Scott Syndrome\n" +
//            "Glucocorticoid Deficiency 2\n" +
//            "Aarskog-Scott Syndrome,Scott Syndrome Glucocorticoid Deficiency 3\n" +
//            "Charcot-Marie-Tooth Neuropathy Type 4H,Sensory Peripheral Neuropathy,Charcot-Marie-Tooth Neuropathy Type 4\n" +
//            "Gastroduodenitis,Aarskog-Scott Syndrome Scott Syndrome\n" +
//            "Breast Fibroadenoma,Barretts Esophagus Ischemia\n" +
//            "Aplasia Of Lacrimal And Salivary Glands,Ladd Syndrome,Fgf10-Related Lacrimo-Auriculo-Dento-Digital Syndrome\n" +
//            "Borjeson-Forssman-Lehmann Syndrome\n" +
//            "Spinocerebellar Ataxia 27,Spinocerebellar Ataxia Type27 Ladd Syndrome\n" +
//            "Metacarpals 4 And 5 Fusion\n" +
//            "Hypogonadotropic Hypogonadism 20 With Or Without Anosmia,Hypogonadotropic Hypogonadism 9 With Or Without Anosmia Hypogonadotropic Hypogonadism 14 With Or Without Anosmia\n" +
//            "Reticulosarcoma,Liver Cancer,Diarrhea\n" +
//            "Intravascular Papillary Endothelial Hyperplasia,Chronic Myocardial Ischemia,Embryonal Cancer\n" +
//            "Renal Hypodysplasia/aplasia 2,Renal Agenesis,Stomatitis\n" +
//            "Type 2 Diabetes Mellitus\n" +
//            "Linear Nevus Sebaceous Syndrome,Hyperphosphatemic Familial Tumoral Calcinosis,Enthesopathy\n" +
//            "Congenital Deafness With Labyrinthine Aplasia,Microtia,And Microdontia,Papillary Adenocarcinoma,Deafness With Labyrinthine Aplasia Microtia And Microdontia\n" +
//            "Gallbladder Squamous Cell Carcinoma,Kaposis Sarcoma,Stomach Cancer\n" +
//            "Trichomegaly,Cataract,And Hereditary Spherocytosis,Kaposis Sarcoma Acquired Immunodeficiency Syndrome\n" +
//            "Signet Ring Cell Adenocarcinoma Prostate Cancer\n" +
//            "Clear Cell Acanthoma,Acanthoma,Pfeiffer Syndrome Show all 4\n" +
//            "Hypogonadotropic Hypogonadism 6 With Or Without Anosmia,Septopreoptic Holoprosencephaly,Midline Interhemispheric Variant Of Holoprosencephaly\n" +
//            "Multiple Synostoses Syndrome 3,Synovial Chondromatosis,Multiple Synostosis Syndrome 1\n" +
//            "Colorectal Adenocarcinoma Adenocarcinoma\n" +
//            "Asthma\n" +
//            "Kallmann Syndrome 2,Hypogonadotropic Hypogonadism 2 With Or Without Anosmia,Hartsfield Syndrome\n" +
//            "Bone Marrow Cancer,Steroid-Induced Glaucoma,8P11 Myeloproliferative Syndrome\n" +
//            "8P11 Myeloproliferative Syndrome\n" +
//            "Antley-Bixler Syndrome Without Genital Anomalies Or Disordered Steroidogenesis,Bent Bone Dysplasia Syndrome,Jackson-Weiss Syndrome5\n" +
//            "Camptodactyly,Tall Stature,And Hearing Loss Syndrome,Skeletal Dysplasia,San Diego Type,Fgfr3-Related Craniosynostosis7\n" +
//            "Cancer Progression/metastasis,Breast Fibroadenoma,Gliomatosis Cerebri\n" +
//            "Wolf-Hirschhorn Syndrome Radioulnar Synostosis\n" +
//            "Hypodysfibrinogenemia,Fgg-Related Congenital Afibrinogenemia,Dysfibrinogenemia\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Sarcoma Pre-Eclampsia\n" +
//            "Fg Syndrome 2 Fg Syndrome\n" +
//            "Fg Syndrome 3 Fg Syndrome\n" +
//            "Fg Syndrome 5 Fg Syndrome\n" +
//            "Multiple Cutaneous And Uterine Leiomyomas,Gastric Leiomyoma,Hereditary Leiomyomatosis And Renal Cell Cancer\n" +
//            "Familial Hyperaldosteronism Type 2,Familial Hyperaldosteronism Low Renin Hypertension\n" +
//            "Cervical Cancer,Breast Cancer,Lung Cancer\n" +
//            "X-Linked Dominant Scapuloperoneal Myopathy,Reducing Body Myopathy,Fhl1-Related Myofibrillar Myopathy\n" +
//            "Rhabdomyosarcoma,Hemophagocytic Lymphohistiocytosis Cardiomyopathy,Dilated,1Ii\n" +
//            "Hemophagocytic Lymphohistiocytosis,Familial,3\n" +
//            "Familial Hemophagocytic Lymphohistiocytosis 5\n" +
//            "Charcot-Marie-Tooth Neuropathy Type 4J,Lateral Sclerosis,Amyotrophic Lateral Sclerosis Type 11\n" +
//            "Kidney Angiomyolipoma,Glioblastoma Multiforme,Endometrial Carcinoma\n" +
//            "Premature Ovarian Failure 6 Premature Ovarian Failure\n" +
//            "Autism Spectrum Disorder\n" +
//            "Status Asthmaticus\n" +
//            "Ovarian Cancer\n" +
//            "Myasthenia,Familial Infantile,1\n" +
//            "Mast-Cell Sarcoma,Hypereosinophilic Syndrome,Acute Promyelocytic Leukemia\n" +
//            "Dental Fluorosis\n" +
//            "Bruck Syndrome 1,Osteogenesis Imperfecta Type Xi,Kuskokwim Disease\n" +
//            "Ehlers-Danlos Syndrome With Progressive Kyphoscoliosis,Myopathy,And Hearing Loss Ullrich Congenital Muscular Dystrophy\n" +
//            "Catecholaminergic Polymorphic Ventricular Tachycardia\n" +
//            "Facial Paralysis,Ocular Hypertension In Situ Carcinoma\n" +
//            "Major Depressive Disorder And Accelerated Response To Antidepressant Drug Treatment,Major Depressive Disorder,Post-Traumatic Stress Disorder\n" +
//            "Male Infertility,Infertility Williams Syndrome\n" +
//            "Limb-Girdle Muscular Dystrophy Type 2I,Muscular Dystrophy-Dystroglycanopathy,Isolated Hyperckemia\n" +
//            "Limb-Girdle Muscular Dystrophy Type 2M,Fukuyama Congenital Muscular Dystrophy,Muscular Dystrophy\n" +
//            "Follicular Lymphoma 1 Follicular Lymphoma\n" +
//            "Associative Agnosia,Localized Osteosarcoma,Cholinergic Urticaria\n" +
//            "Pneumothorax,Birt-Hogg-Dube Syndrome,Primary Spontaneous Pneumothorax\n" +
//            "Dominant Ichthyosis Vulgaris,Dermatitis,Atopic 2,Bowenoid Papulosis\n" +
//            "Psoriasis,Ichthyosis Vulgaris Eczema Herpeticum\n" +
//            "Isolated Delta-Storage Pool Disease,Peripheral Primitive Neuroectodermal Tumor,Connective Tissue Benign Neoplasm\n" +
//            "Smith Magenis Syndrome\n" +
//            "Childhood Leukemia Hiv-1\n" +
//            "Melnick-Needles Syndrome,Frontometaphyseal Dysplasia,X-Linked Periventricular Heterotopia\n" +
//            "Flnb-Related Disorders,Congenital Knee Dislocation,Subacute Lymphocytic Thyroiditis\n" +
//            "Myopathy,Myofibrillar,5,Distal Myopathy 4,Cardiac Rupture Show all 4\n" +
//            "Mycobacterium Marinum\n" +
//            "Toxic Megacolon Megacolon\n" +
//            "Autosomal Recessive Spastic Paraplegia Type 68\n" +
//            "Hypogonadotropic Hypogonadism 21 With Anosmia,Kabuki Syndrome Hypogonadotropic Hypogonadism 9 With Or Without Anosmia\n" +
//            "Eclampsia,Pre-Eclampsia,Microcystic Meningioma\n" +
//            "Leukemia,Acute Myeloid,Reduced Survival In,Leukemia,Acute Lymphoblastic,Somatic,Minimally Differentiated Acute Myeloblastic Leukemia\n" +
//            "Myelodysplastic Syndromes,Aplastic Anemia,Glioblastoma Multiforme Show all 4\n" +
//            "Intracranial Arteriovenous Malformation,Orbital Lymphangioma,Kaposiform Hemangioendothelioma\n" +
//            "Posterior Column Ataxia With Retinitis Pigmentosa,Posterior Column Ataxia,Retinitis Pigmentosa\n" +
//            "Proliferative Vasculopathy And Hydranencephaly-Hydrocephaly Syndrome,Proliferative Vasculopathy And Hydraencephaly-Hydrocephaly Syndrome,Dissociative Disorder\n" +
//            "Renal Hypoplasia\n" +
//            "Trimethylaminuria\n" +
//            "Trimethylaminuria\n" +
//            "Trimethylaminuria,Familial Adenomatous Polyposis Lymphocytic Choriomeningitis\n" +
//            "Plasma Cell Neoplasm Trimethylaminuria\n" +
//            "Trimethylaminuria\n" +
//            "Myopia,Chronic Lymphocytic Leukemia Pseudoachondroplasia\n" +
//            "Fmr1-Related Disorders,Fragile X-Associated Primary Ovarian Insufficiency,Fragile X-Associated Tremor/ataxia Syndrome\n" +
//            "Fragile X Syndrome\n" +
//            "Sarcoma\n" +
//            "Fragile X Syndrome\n" +
//            "Epilepsy,Familial Temporal Lobe,3\n" +
//            "Glomerulopathy With Fibronectin Deposits 2,Plasma Fibronectin Deficiency,Mycobacterium Kansasii\n" +
//            "Hyperglycemia\n" +
//            "Anophthalmos With Limb Anomalies\n" +
//            "Prostate Leiomyosarcoma\n" +
//            "Liver Cancer\n" +
//            "Hyperhomocysteinemia,Villous Adenoma,Canavan Disease\n" +
//            "Acute Necrotizing Encephalitis,Cerebral Folate Transport Deficiency,Pediatric Osteosarcoma\n" +
//            "Rheumatoid Arthritis,Cerebral Folate Transport Deficiency Neural Tube Defects\n" +
//            "Osteosarcoma,Coffin-Lowry Syndrome,Fumarate Hydratase Deficiency\n" +
//            "Osteosarcoma\n" +
//            "Breast Cancer,Glioblastoma Multiforme,Human T-Cell Leukemia Virus Type 1 Show all 4\n" +
//            "Meckels Diverticulum,Maturity-Onset Diabetes Of The Young Obesity\n" +
//            "Wernicke-Korsakoff Syndrome\n" +
//            "Ring Chromosome 6,Iris Hypoplasia And Glaucoma,Persistent Hyperplastic Primary Vitreous\n" +
//            "Lymphedema-Distichiasis Syndrome With Renal Disease And Diabetes Mellitus,Lymphedema-Distichiasis Syndrome,Varicose Veins\n" +
//            "Croup\n" +
//            "Autoimmune Disease 1,Vestibular Nystagmus,Entropion\n" +
//            "Dilated Cardiomyopathy\n" +
//            "Thyroid Agenesis,Bamforth-Lazarus Syndrome,Cleft Palate\n" +
//            "Congenital Aphakia,Foxe3-Related Cataracts,Autosomal Dominant,Foxe3-Related Anterior Segment Mesenchymal Dysgenesis\n" +
//            "Alveolar Capillary Dysplasia,Nonspecific Interstitial Pneumonia,Vacterl Association Show all 4\n" +
//            "Duane Retraction Syndrome Blepharophimosis\n" +
//            "Rett Syndrome,Congenital Variant,Foxg1 Syndrome,14Q12 Microdeletion Syndrome\n" +
//            "Foxh1-Related Holoprosencephaly,Ventricular Septal Defect,Septopreoptic Holoprosencephaly\n" +
//            "Enlarged Vestibular Aqueduct,Foxi1-Related Pendred Syndrome,Pendred Syndrome\n" +
//            "Systemic Lupus Erythematosus,Allergic Rhinitis Rhinitis\n" +
//            "Hypoplastic Left Heart Syndrome,Lymphedema-Distichiasis Syndrome Hereditary Lymphedema\n" +
//            "Premature Ovarian Failure 3,Laryngostenosis,Blepharophimosis,Ptosis,And Epicanthus Inversus Syndrome\n" +
//            "Central Pontine Myelinolysis\n" +
//            "Alopecia And T-Cell Immunodeficiency,T-Cell Immunodeficiency,Congenital Alopecia And Nail Dystrophy,Alopecia\n" +
//            "T-Cell Leukemia Leukemia\n" +
//            "Auditory Neuropathy\n" +
//            "Rhabdomyosarcoma Rhabdomyosarcoma 2,Alveolar\n" +
//            "Acute Leukemia,Rhabdomyosarcoma Neuroblastoma\n" +
//            "Cutaneous Fibrous Histiocytoma,Leukemia Malignant Fibroxanthoma\n" +
//            "Mental Retardation With Language Impairment And Autistic Features,Malt Lymphoma,Leukemia,Acute Lymphoblastic 3\n" +
//            "Childhood Apraxia Of Speech,7Q31 Microdeletion Syndrome,Blepharophimosis,Ptosis,And Epicanthus Inversus Syndrome\n" +
//            "Immune Dysregulation,Polyendocrinopathy,Enteropathy,X-Linked Syndrome,Ipex Syndrome,Immunodysregulation,Polyendocrinopathy And Enteropathy X-Linked\n" +
//            "Duane Retraction Syndrome\n" +
//            "Peanut Allergic Reaction,Mitochondrial Complex I Deficiency,Leigh Syndrome Due To Mitochondrial Complex I Deficiency\n" +
//            "Soft Tissue Sarcoma\n" +
//            "Aggressive Periodontitis,Malignant Glioma,Shwachman-Diamond Syndrome\n" +
//            "Amyloidosis,Bacterial Meningitis Prion Disease\n" +
//            "Obesity\n" +
//            "Fraser Syndrome,Fras1-Related Fraser Syndrome,Unilateral Renal Agenesis Show all 4\n" +
//            "Esophageal Squamous Cell Carcinoma\n" +
//            "Fragile X Syndrome,Fragile X-Associated Tremor/ataxia Syndrome,Fragile X-Associated Primary Ovarian Insufficiency Show all 4\n" +
//            "Fraxd\n" +
//            "Fragile X Syndrome,X-Linked Disease Pervasive Developmental Disorder\n" +
//            "Pervasive Developmental Disorder\n" +
//            "Friedreich Ataxia 2\n" +
//            "Bifid Nose With Or Without Anorectal And Renal Anomalies,Bifid Nose,Manitoba Oculotrichoanal Syndrome\n" +
//            "Unilateral Renal Agenesis,Frem2-Related Fraser Syndrome,Fraser Syndrome\n" +
//            "Fraser Syndrome\n" +
//            "Facioscapulohumeral Muscular Dystrophy,Suppurative Lymphadenitis,Fascioscapulohumeral Muscular Dystrophy 2,Digenic Show all 4\n" +
//            "Facioscapulohumeral Muscular Dystrophy 2 Facioscapulohumeral Muscular Dystrophy\n" +
//            "Diabetic Nephropathy\n" +
//            "Frmd7-Related Infantile Nystagmus,X-Linked Infantile Nystagmus,Dissociated Nystagmus\n" +
//            "Multidrug-Resistant Tuberculosis Tuberculosis\n" +
//            "Opioid Abuse\n" +
//            "Fanconi Renotubular Syndrome 1 Fanconi Renotubular Syndrome\n" +
//            "Osteoarthritis\n" +
//            "Interdigitating Dendritic Cell Sarcoma,Juvenile Xanthogranuloma,Rosai-Dorfman Disease\n" +
//            "Retinitis Pigmentosa 30,Fscn2-Related Retinitis Pigmentosa,Retinitis Pigmentosa Show all 4\n" +
//            "Dendritic Cell Sarcoma\n" +
//            "Pandas,Follicle-Stimulating Hormone Deficiency,Isolated,Pituitary Tumors\n" +
//            "Embryonal Rhabdomyosarcoma,Facioscapulohumeral Muscular Dystrophy Muscular Dystrophy\n" +
//            "Facioscapulohumeral Muscular Dystrophy\n" +
//            "Ovarian Response To Fsh Stimulation,Estrogen Excess,Ovarian Dysgenesis 1\n" +
//            "Prostate Cancer,Endometriosis Polycystic Ovary Syndrome\n" +
//            "Rheumatoid Arthritis\n" +
//            "Glutamate Formiminotransferase Deficiency Autoimmune Hepatitis\n" +
//            "Superficial Siderosis Of The Central Nervous System,Superficial Siderosis,Hypertensive Retinopathy\n" +
//            "Klinefelters Syndrome\n" +
//            "Neuroferritinopathy,Hyperferritinemia Cataract Syndrome,L-Ferritin Deficiency,Dominant And Recessive\n" +
//            "Alzheimers Disease\n" +
//            "Spontaneous Pneumothorax,Pneumothorax,Myelodysplastic Syndromes\n" +
//            "Growth Retardation,Developmental Delay,Coarse Facies,And Early Death,Obesity Overnutrition\n" +
//            "Obesity\n" +
//            "Mental Retardation,Mental Retardation,X-Linked 29 And Others Mental Retardation,X-Linked\n" +
//            "Multidrug-Resistant Tuberculosis\n" +
//            "Oligoastrocytoma\n" +
//            "Laryngotracheitis,Fucosidosis,Lysosomal Storage Disease\n" +
//            "Fucosidosis\n" +
//            "Laryngotracheitis,Spastic Quadriplegia,Quadriplegia\n" +
//            "Hepatitis C,Hepatitis C Virus,Cervical Cancer Show all 4\n" +
//            "Plague,Parainfluenza Virus Type 3,Influenza\n" +
//            "Amyotrophic Lateral Sclerosis Type 6,Myxoid Liposarcoma,Amyotrophic Lateral Sclerosis 6,Autosomal Recessive,With Or Without Frontotemporal Dementia\n" +
//            "Norwalk Virus Infection,Staphyloenterotoxemia,Atrophic Gastritis\n" +
//            "Hypertropia,Inflammatory Breast Carcinoma Atrophic Gastritis\n" +
//            "Benign Mesothelioma,Colon Adenocarcinoma,Acute Promyelocytic Leukemia\n" +
//            "Fucosyltransferase 6 Deficiency\n" +
//            "Human Granulocytic Anaplasmosis Human T-Cell Leukemia Virus Type 1\n" +
//            "Pancreatic Acinar Cell Adenocarcinoma Leukocyte Adhesion Deficiency\n" +
//            "Malaria\n" +
//            "Cervical Spina Bifida Cystica,Cervical Spina Bifida Aperta,Upper Thoracic Spina Bifida Cystica\n" +
//            "Forsythe-Wakeling Syndrome\n" +
//            "Friedreich Ataxia With Retained Reflexes,Friedreich Ataxia,X-Linked Sideroblastic Anemia With Ataxia\n" +
//            "Fragile X Syndrome\n" +
//            "Mental Retardation Fragile X Syndrome\n" +
//            "Spinal Cord Injury\n" +
//            "Hypomagnesemia 2,Renal\n" +
//            "Intracranial Hypotension Papillary Thyroid Carcinoma\n" +
//            "Cataract,Autosomal Recessive Congenital 2,Cataract 18,Autosomal Recessive,Cataract Show all 4\n" +
//            "Estrogen-Receptor Negative Breast Cancer\n" +
//            "Exudative Vitreoretinopathy\n";
//            "Colon Cancer Cervical Cancer\n" +
//            "Substance-Induced Psychosis Schizophrenia\n" +
//            "Exudative Vitreoretinopathy 1,Retinopathy Of Prematurity,Fzd4-Related Familial Exudative Vitreoretinopathy,Autosomal Dominant\n" +
//            "Exudative Vitreoretinopathy\n" +
//            "Nail Disorder,Nonsyndromic Congenital,10,,Exudative Vitreoretinopathy Pachyonychia Congenita\n" +
//            "Liver Cancer Exudative Vitreoretinopathy\n" +
//            "Exudative Vitreoretinopathy\n" +
//            "Williams Syndrome Exudative Vitreoretinopathy\n" +
//            "Van Der Woude Syndrome\n" +
//            "Nodular Malignant Melanoma\n" +
//            "Glycogen Storage Disease Type 1A,Glycogen Storage Disease,Glycogen Storage Disease Type 1B\n" +
//            "Type 1 Diabetes Mellitus\n" +
//            "Dursun Syndrome,Severe Congenital Neutropenia,Autosomal Recessive,4,Severe Congenital Neutropenia\n" +
//            "Blood Group Incompatibility,Blackwater Fever,Neonatal Jaundice\n" +
//            "Glycogen Storage Disease Ii,Glycogen Storage Disease Due To Acid Maltase Deficiency,Juvenile Onset,Glycogen Storage Disease Due To Acid Maltase Deficiency,Infantile Onset\n" +
//            "Leopard Syndrome\n" +
//            "Stiff-Person Syndrome\n" +
//            "Spastic Hemiplegia\n" +
//            "Persistent Vegetative State,Multiple Sclerosis,Withdrawal Disorder\n" +
//            "Nicotine Dependence,Nicotine Addiction,Nicotine Dependence,Protection Against\n" +
//            "Down Syndrome\n" +
//            "Adenylosuccinate Lyase Deficiency\n" +
//            "Epilepsy,Childhood Absence,Susceptibility To,4,Epileptic Encephalopathy,Early Infantile,19,Epilepsy,Juvenile Myoclonic 5\n" +
//            "Alcohol Dependence Cannabis Dependence\n" +
//            "Thyrotoxic Periodic Paralysis 1 Color Blindness\n" +
//            "Angelman Syndrome Prader-Willi Syndrome\n" +
//            "Heroin Dependence,Alcohol Dependence,Antisocial Personality Disorder\n" +
//            "Schizophrenia\n" +
//            "Antisocial Personality Disorder\n" +
//            "Childhood Disintegrative Disease,Epilepsy,Childhood Absence,Susceptibility To,5,Pervasive Developmental Disorder\n" +
//            "1P36 Deletion Syndrome,Epilepsy,Generalized,With Febrile Seizures Plus,Type 5,Epilepsy,Idiopathic Generalized,10\n" +
//            "Febrile Seizures,Familial,8,Psychomotor Disease,Febrile Seizures\n" +
//            "West Nile Fever,Conversion Disorder,Spastic Cerebral Palsy\n" +
//            "Autoimmune Polyglandular Syndrome Type 2,Congenital Rubella,Spastic Cerebral Palsy\n" +
//            "Pancreatic Cancer,Breast Cancer,Ovarian Cancer\n" +
//            "Liver Cancer\n" +
//            "Esophageal Squamous Cell Carcinoma Esophageal Cancer\n" +
//            "Glioblastoma Multiforme Stomach Cancer\n" +
//            "Glioblastoma Multiforme\n" +
//            "Normal Pressure Hydrocephalus,Pain Disorder,Mononeuropathy\n" +
//            "Renal Cell Carcinoma Metachromatic Leukodystrophy\n" +
//            "Infantile Krabbe Disease,Krabbe Disease,Adult Krabbe Disease\n" +
//            "Epimerase Deficiency Galactosemia,Erythrocyte Galactose Epimerase Deficiency,Generalized Galactose Epimerase Deficiency\n" +
//            "Galactokinase Deficiency With Cataracts,Galactokinase Deficiency,Epimerase Deficiency Galactosemia\n" +
//            "Galactokinase Deficiency\n" +
//            "Mucopolysaccharidosis Iv,Kniest Dysplasia,Mucopolysaccharidosis Vi\n" +
//            "Heterotaxy\n" +
//            "Colorectal Cancer 1 Colorectal Cancer\n" +
//            "Tricuspid Valve Insufficiency Osteochondrosis\n" +
//            "Hypertension\n" +
//            "Hyperostosis-Hyperphosphatemia Syndrome,Hyperphosphatemic Familial Tumoral Calcinosis,Galnt3-Related,Normophosphatemic Familial Tumoral Calcinosis\n" +
//            "Hereditary Multiple Exostoses Exostosis\n" +
//            "Galactosemia,Lens Subluxation,Galactokinase Deficiency\n" +
//            "Guanidinoacetate Methyltransferase Deficiency,Cerebral Creatine Deficiency Syndrome,Movement Disease\n" +
//            "Endometriosis Of Uterus,Giant Axonal Neuropathy,Axonal Neuropathy\n" +
//            "Glycogen Storage Disease Ii Polycystic Liver Disease\n" +
//            "Glycogen Storage Disease Ii Congenital Dyserythropoietic Anemia Type I\n" +
//            "Appendicitis,Status Epilepticus,Cystitis\n" +
//            "Diffuse Large B-Cell Lymphoma,Obesity,Plexiform Neurofibroma\n" +
//            "Aplastic Anemia Alcohol Dependence\n" +
//            "Charcot-Marie-Tooth Neuropathy Type 2D,Distal Spinal Muscular Atrophy,Type V,Charcot-Marie-Tooth Disease Type 2D\n" +
//            "Benign Mesothelioma\n" +
//            "Basal Cell Carcinoma,Nevoid Basal Cell Carcinoma Syndrome,Septopreoptic Holoprosencephaly\n" +
//            "Gnathodiaphyseal Dysplasia\n" +
//            "Limb Ischemia,Critical Limb Ischemia,Ocular Melanoma Show all 4\n" +
//            "Spastic Hemiplegia\n" +
//            "Gastric Mucosal Hypertrophy,Collagenous Gastritis,Ovarian Mucinous Cystadenocarcinoma\n" +
//            "Thrombocytopenia With Beta-Thalassemia,X-Linked,Gata1-Related X-Linked Cytopenia,Gata1-Related Cytopenia\n" +
//            "Lymphedema,Primary,With Myelodysplasia,Emberger Syndrome,Immunodeficiency 21\n" +
//            "Hypoparathyroidism,Sensorineural Deafness,And Renal Disease,Renal Dysplasia,Barakat Syndrome\n" +
//            "Atrioventricular Septal Defect 4,Chromosome 8P23.1 Deletion,Testicular Anomalies With Or Without Congenital Heart Disease\n" +
//            "Aortic Valve Disease,Single Ventricular Septal Defect,Familial Atrial Fibrillation\n" +
//            "Atrial Septal Defect 9,Atrioventricular Septal Defect 5,Pancreatic Agenesis And Congenital Heart Defects\n" +
//            "Cardiomyopathy,Dilated,2B,Cardiomyopathy,Dilated,1Ii Dilated Cardiomyopathy\n" +
//            "Mental Retardation,Autosomal Dominant 18\n" +
//            "Renal Tuberculosis,Agat Deficiency,Cerebral Creatine Deficiency Syndrome\n" +
//            "Gaucher Disease Perinatal Lethal,Gaucher Disease Type 2,Gaucher Disease Type 1\n" +
//            "Spastic Paraplegia 46,Autosomal Recessive,Splenic Sequestration,Autosomal Recessive Cerebellar Ataxia With Late-Onset Spasticity Show all 4\n" +
//            "Gauchers Disease\n" +
//            "Glioblastoma\n" +
//            "Gallbladder Disease 2 Gallbladder Disease\n" +
//            "Gallbladder Disease 3 Gallbladder Disease\n" +
//            "Adult Polyglucosan Body Disease,Glycogen Storage Disease Iv,Gbe1-Related Disorders\n" +
//            "Pseudopseudohypoparathyroidism,Aneurysmal Bone Cysts Chronic Active Epstein-Barr Virus Infection\n" +
//            "Hypoglycemic Coma\n" +
//            "Chronic Active Epstein-Barr Virus Infection\n" +
//            "Prostate Cancer\n" +
//            "Graves Disease,Tuberculosis,Osteoporosis\n" +
//            "Non-Small Cell Lung Carcinoma\n" +
//            "Shwachman-Diamond Syndrome\n" +
//            "Secretory Diarrhea\n" +
//            "Secretory Diarrhea\n" +
//            "Glucocorticoid Deficiency 2,Glucocorticoid Deficiency 3 Familial Glucocorticoid Deficiency\n" +
//            "Glucocorticoid Deficiency 3 Familial Glucocorticoid Deficiency\n" +
//            "Glutaric Acidemia Type I,Athetosis,Organic Acidemia\n" +
//            "Type 2 Diabetes Mellitus,Obesity,Dumping Syndrome\n" +
//            "Insulin Resistance,Diabetes Mellitus,Noninsulin-Dependent,2,Diabetes Mellitus,Noninsulin-Dependent,Late Onset\n" +
//            "Gtp Cyclohydrolase 1-Deficient Dopa-Responsive Dystonia,Oromandibular Dystonia,Dystonia 14\n" +
//            "Chromosome 7P Deletion,Maturity-Onset Diabetes Of The Young,Gestational Diabetes\n" +
//            "Maturity-Onset Diabetes Of The Young Cardiovascular Disease Risk Factor\n" +
//            "Hemolytic Anemia Due To Gamma-Glutamylcysteine Synthetase Deficiency,Myocardial Infarction,Cisplatin Toxicity Show all 4\n" +
//            "Myocardial Infarction Ischemic Heart Disease\n" +
//            "Hypoparathyroidism Familial Isolated,Gcm2-Related Familial Isolated Hypoparathyroidism,Familial Isolated Hypoparathyroidism Due To Agenesis Of Parathyroid Gland\n" +
//            "Mast Cell Neoplasm\n" +
//            "Adult I Phenotype Without Cataract,Cataract 13 With Adult I Phenotype,Ophthalmia Neonatorum\n" +
//            "Mast Cell Neoplasm\n" +
//            "Diffuse Large B-Cell Lymphoma\n" +
//            "Atypical Glycine Encephalopathy,Neonatal Glycine Encephalopathy,Infantile Glycine Encephalopathy\n" +
//            "Charcot-Marie-Tooth Disease,Axonal,With Vocal Cord Paresis,Charcot-Marie-Tooth Neuropathy Type 4A,Charcot-Marie-Tooth Disease Type 2G\n" +
//            "Neuroblastoma\n" +
//            "Right Atrial Isomerism,Double Outlet Right Ventricle,Transposition Of Great Arteries,Dextro-Looped 3\n" +
//            "Osteosarcoma\n" +
//            "Pyruvate Kinase Deficiency,Oral Cavity Cancer,Congenital Dyserythropoietic Anemia Type I\n" +
//            "Telangiectasia,Hereditary Hemorrhagic,Type 5,Hereditary Hemorrhagic Telangiectasia Hepatopulmonary Syndrome\n" +
//            "Microphthalmia With Coloboma 6,Klippel-Feil Syndrome 3,Autosomal Dominant,Microphthalmia,Isolated 7\n" +
//            "Fibular Hypoplasia And Complex Brachydactyly,Multiple Synostoses Syndrome 2,Fibular Hypoplasia\n" +
//            "Klippel-Feil Syndrome 1,Autosomal Dominant,Leber Congenital Amaurosis 17,Segmentation Syndrome 1\n" +
//            "Ankylosis\n" +
//            "Kidney Cancer,Polycystic Ovary Syndrome Premature Ovarian Failure\n" +
//            "Tumor Of Exocrine Pancreas,Mental Retardation Mental Retardation,X-Linked 29 And Others\n" +
//            "Central Hypoventilation Syndrome,Spinal Cord Injury,Intestinal Obstruction\n" +
//            "Epilepsy,Generalized,With Febrile Seizures Plus,Type 4\n" +
//            "Epilepsy,Generalized,With Febrile Seizures Plus,Type 6 Generalized Epilepsy With Febrile Seizures Plus\n" +
//            "Epilespy,Generalized,With Febrile Seizures Plus,Type 8 Generalized Epilepsy With Febrile Seizures Plus\n" +
//            "Mowat-Wilson Syndrome Benign Hereditary Chorea\n" +
//            "Gastroesophageal Reflux Disease\n" +
//            "Louping Ill Erysipeloid\n" +
//            "Papillary Ependymoma,Ring Chromosome 7,Astroblastoma4\n" +
//            "Nodular Regenerative Hyperplasia,Myopathy,Mitochondrial Progressive,With Congenital Cataract,Hearing Loss,And Developmental Delay,Polycystic Kidney Disease Show all 4\n" +
//            "Severe Congenital Neutropenia,Neutropenia,Idiopathic Neutropenia\n" +
//            "Bleeding Disorder,Platelet-Type,17,Gray Platelet Syndrome,Megakaryocytic Leukemia\n" +
//            "Combined Oxidative Phosphorylation Deficiency 1,Heart Aneurysm,Factor Vii Deficiency Show all 4\n" +
//            "Atorvastatin Toxicity\n" +
//            "Glomerulopathy With Fibronectin Deposits 1\n" +
//            "Myasthenia,Congenital,With Tubular Aggregates 1,Gfpt1-Related Congenital Myasthenic Syndrome,Myasthenia,Limb-Girdle,With Tubular Aggregates Show all 4\n" +
//            "Hirschsprungs Disease,Multiple Endocrine Neoplasia Type 2A,Central Hypoventilation Syndrome Show all 4\n" +
//            "Hirschsprungs Disease\n" +
//            "Pseudoxanthoma Elasticum-Like Disorder With Multiple Coagulation Factor Deficiency,Hemorrhagic Disease,Vitamin K Deficiency Hemorrhagic Disease\n" +
//            "Tropical Sprue,Pulmonary Neuroendocrine Tumor,Genital Herpes\n" +
//            "Glutathionuria,Glutathioninuria,Opisthorchiasis\n" +
//            "Benign Recurrent Intrahepatic Cholestasis,Stickler Syndrome Hyperthyroxinemia\n" +
//            "Glutathionuria\n" +
//            "Germ Cell Tumors\n" +
//            "Kowarski Syndrome,Protein-Deficiency Anemia,Isolated Growth Hormone Deficiency Type 2\n" +
//            "Isolated Growth Hormone Deficiency,Trophoblastic Neoplasm,Pituitary Tumors Show all 4\n" +
//            "Papilledema,Laron Syndrome,Hypercholesterolemia,Familial,Modifier Of\n" +
//            "Gigantism,Isolated Growth Hormone Deficiency Due To Defect In Ghrf,Gigantism Due To Ghrf Hypersecretion\n" +
//            "Pancreatic Islet Cell Tumors,Isolated Growth Hormone Deficiency,Isolated Growth Hormone Deficiency,Type Ib,Ghrhr-Related\n" +
//            "Gastric Endocrine Tumor,Stomach Disease,Gastroparesis\n" +
//            "Goldenhar Syndrome\n" +
//            "Short Stature,Partial Isolated Growth Hormone Deficiency,Anorexia Nervosa\n" +
//            "Congenital Intrinsic Factor Deficiency,Blind Loop Syndrome,Diphyllobothriasis\n" +
//            "Parkinsons Disease,Parkinson Disease 11 Parkinson Disease 1\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Acute Lymphocytic Leukemia\n" +
//            "Systemic Lupus Erythematosus\n" +
//            "Lung Cancer\n" +
//            "Parametritis\n" +
//            "Gingival Fibromatosis,2\n" +
//            "Gingival Fibromatosis,3 Fibromatosis,Gingival\n" +
//            "Gingival Fibromatosis,4\n" +
//            "Ventricular Tachycardia,Idiopathic,Acth-Secreting Pituitary Adenoma,Type 2 Diabetes Mellitus\n" +
//            "Deafness,Autosomal Recessive 15,Audiogenic Seizures,Sporadic Breast Cancer\n" +
//            "Adrenal Cortical Adenoma,Adrenal Adenoma,Cushings Syndrome Show all 4\n" +
//            "Criss-Cross Heart,Atrioventricular Septal Defect 3,Oculodentodigital Dysplasia,Autosomal Recessive\n" +
//            "Cataract 14,Multiple Types,Zonular Pulverulent Cataract 3,Cataract\n" +
//            "Myocardial Infarction,Erythrokeratodermia Variabilis,Atherosclerosis Show all 4\n" +
//            "Atrial Fibrillation,Familial,11,Atrial Standstill,Digenic,Gja5-Related Familial Atrial Fibrillation\n" +
//            "Cataract 1,Multiple Types,Cataract Microcornea Syndrome,Zonular Pulverulent Cataract 1\n" +
//            "Charcot-Marie-Tooth Neuropathy X Type 1,Inherited Peripheral Neuropathy,Neuropathy\n" +
//            "Bart-Pumphrey Syndrome,Hypotrichosis-Deafness Syndrome,Vohwinkel Syndrome\n" +
//            "Erythrokeratodermia Variabilis,Nonsyndromic Hearing Loss And Deafness,Dfnb1,Deafness,Digenic,Gjb2/gjb3\n" +
//            "Pseudoainhum,Keratoderma Palmoplantaris Transgrediens,Gjb4-Related Erythrokeratodermia Variabilis\n" +
//            "Lung Cancer Erythrokeratodermia Variabilis\n" +
//            "Hidrotic Ectodermal Dysplasia 2,Dfna 3 Nonsyndromic Hearing Loss And Deafness,Dfnb 1 Nonsyndromic Hearing Loss And Deafness\n" +
//            "Cystic Fibrosis\n" +
//            "Spastic Paraplegia 44,Autosomal Recessive,Spastic Paraplegia 44,Leukodystrophy,Hypomyelinating,2\n" +
//            "Peripheral Neuropathy\n" +
//            "Refractive Error,Peripheral Neuropathy,Juvenile Myoclonic Epilepsy\n" +
//            "Peripheral Neuropathy\n" +
//            "Hyperglycerolemia,Glycerol Kinase Deficiency,Infantile Form,Glycerol Kinase Deficiency,Juvenile Form\n" +
//            "X-Linked Adrenal Hypoplasia Congenita Complex Glycerol Kinase Deficiency\n" +
//            "Gastric Cancer\n" +
//            "Gastric Cancer\n" +
//            "Cramp-Fasciculation Syndrome,Classic Fabry Disease,Fabry Disease\n" +
//            "Glb1-Related Disorders,Gangliosidosis Gm1,Gm1 Gangliosidosis Type 2\n" +
//            "Mucopolysaccharidoses,Morquio Syndrome B Sly Syndrome\n" +
//            "Glaucoma 1B,Primary Open Angle,Adult Onset\n" +
//            "Glaucoma 1C,Primary Open Angle\n" +
//            "Glaucoma 1D,Primary Open Angle\n" +
//            "Glaucoma 1,Open Angle,F\n" +
//            "Glaucoma 1,Open Angle,H\n" +
//            "Glaucoma 1,Open Angle,I\n" +
//            "Glaucoma 1K,Primary Open Angle,Juvenile-Onset\n" +
//            "Glaucoma 1,Open Angle,M\n" +
//            "Glaucoma 1,Open Angle,N\n" +
//            "Glaucoma 1,Open Angle,P\n" +
//            "Glaucoma 3 Primary Infantile B,Buphthalmos Primary Congenital Glaucoma\n" +
//            "Glaucoma 3,Primary Congenital,C Primary Congenital Glaucoma\n" +
//            "Glucocorticoid Therapy,Response To\n" +
//            "Gldc-Related Glycine Encephalopathy,D-Glycericacidemia,Glycine Encephalopathy\n" +
//            "Lethal Congenital Contracture Syndrome 1,Lethal Arthrogryposis With Anterior Horn Cell Disease,Anterior Horn Cell Disease Show all 4\n" +
//            "Necrobiosis Lipoidica,Ameloblastoma,Plexiform Neurofibroma\n" +
//            "Holoprosencephaly-9,Gli2-Related Holoprosencephaly,Pallister-Hall Syndrome 2\n" +
//            "Greig Cephalopolysyndactyly Syndrome,Postaxial Polydactyly Type A,Polydactyly\n" +
//            "Glioblastoma\n" +
//            "Prostate Cancer Glioblastoma Multiforme\n" +
//            "Nephronophthisis 7,Acute Megakaryoblastic Leukemia Without Down Syndrome,Nephronophthisis 1,Juvenile\n" +
//            "Diabetes Mellitus,Neonatal,With Congenital Hypothyroidism,Congenital Hypothyroidism Hypothyroidism\n" +
//            "Glioma Susceptibility 4\n" +
//            "Glioma Susceptibility 5\n" +
//            "Glioma Susceptibility 6\n" +
//            "Glioma Susceptibility 7\n" +
//            "Glioma Susceptibility 8\n" +
//            "Familial Glomangioma,Glomangioma,Glomuvenous Malformation\n" +
//            "Triosephosphate Isomerase Deficiency Tuberculosis\n" +
//            "Fasting Hypoglycemia,Type 2 Diabetes Mellitus Obesity\n" +
//            "Sporadic Hyperekplexia,Stiff-Person Syndrome,Hyperekplexia\n" +
//            "Dyscalculia Hyperekplexia\n" +
//            "Hyperekplexia\n" +
//            "Hyperekplexia\n" +
//            "Glrb-Related Hyperekplexia,Hyperekplexia 2,Autosomal Recessive,Stiff-Person Syndrome\n" +
//            "Pancreatic Cystadenocarcinoma,Transitional Meningioma Pancreatic Cancer\n" +
//            "Lymphocytic Choriomeningitis\n" +
//            "Pearson Syndrome,Spasticity-Ataxia-Gait Anomalies Syndrome,Pyridoxine-Refractory Autosomal Recessive Sideroblastic Anemia Show all 4\n" +
//            "Hepatic Encephalopathy,Schizophrenia Paranoid Schizophrenia\n" +
//            "Stomach Carcinoma In Situ,L-2-Hydroxyglutaric Aciduria,2-Hydroxyglutaric Aciduria Show all 4\n" +
//            "Seborrheic Keratosis\n" +
//            "Hyperinsulinism-Hyperammonemia Syndrome,Hyperinsulinism,Glud1-Related Hyperinsulinism\n" +
//            "Hyperinsulinism-Hyperammonemia Syndrome\n" +
//            "Parkinsons Disease Parkinson Disease,Late-Onset\n" +
//            "Glutamine Deficiency,Congenital,Reye Syndrome,Glutathione Synthetase Deficiency\n" +
//            "Substance-Induced Psychosis,Osteogenesis Imperfecta Type I Bullous Pemphigoid\n" +
//            "Bacterial Conjunctivitis,Acute Conjunctivitis Body Dysmorphic Disorder\n" +
//            "Pulmonary Function\n" +
//            "Macular Corneal Dystrophy\n" +
//            "D-Glyceric Aciduria\n" +
//            "Band Keratopathy\n" +
//            "Renal Glycosuria\n" +
//            "Gangliosidosis Gm2,Gm2 Activator Deficiency,Gm2-Gangliosidosis,Ab Variant\n" +
//            "Leukocyte Adhesion Deficiency\n" +
//            "Melanoacanthoma Breast Cancer\n" +
//            "Alacrima,Achalasia,And Mental Retardation Syndrome,Achalasia Triple-A Syndrome\n" +
//            "Granulomatous Amebic Encephalitis,Muscular Dystrophy-Dystroglycanopathy ,Type B,14,Muscular Dystrophy-Dystroglycanopathy ,Type A,14\n" +
//            "Acute Myeloid Leukemia,Adult Acute Myeloid Leukemia\n" +
//            "Hypocalciuric Hypercalcemia,Type Ii,Hypocalcemia,Autosomal Dominant 2,Foramen Magnum Meningioma\n" +
//            "Familial Hyperaldosteronism\n" +
//            "Pertussis,Chorea-Acanthocytosis Acanthocytosis\n" +
//            "Pertussis\n" +
//            "Acth-Secreting Pituitary Adenoma,Olivopontocerebellar Atrophy,Ventricular Tachycardia,Idiopathic\n" +
//            "Auriculocondylar Syndrome 1 Ankylosis\n" +
//            "Dystonia 25,Bipolar Disorder,Schizophrenia\n" +
//            "Epileptic Encephalopathy,Early Infantile,17 Epileptic Encephalopathy,Early Infantile,2\n" +
//            "Sturge-Weber Syndrome,Weber Syndrome,Acanthocytosis\n" +
//            "Progressive Osseous Heteroplasia,Gnas Hyperfunction,Monostotic Fibrous Dysplasia\n" +
//            "Pseudohypoparathyroidism Pseudohypoparathyroidism Type 1B\n" +
//            "Autosomal Recessive Congenital Stationary Night Blindness,Autosomal Dominant Congenital Stationary Night Blindness,Congenital Stationary Night Blindness,Autosomal Dominant 3\n" +
//            "Achromatopsia 4,Oligocone Trichromacy,Congenital Nystagmus\n" +
//            "Pertussis,Autosomal Dominant Congenital Stationary Night Blindness Achromatopsia\n" +
//            "Hemiplegic Migraine Familial Hemiplegic Migraine\n" +
//            "Hypopharynx Cancer Digeorge Syndrome\n" +
//            "Lung Cancer Wells Syndrome\n" +
//            "Essential Hypertension,Aortic Coarctation,Hypertension\n" +
//            "Charcot-Marie-Tooth Disease,Dominant Intermediate F\n" +
//            "Gne-Related Myopathy,Sialuria,Sialuria,French Type\n" +
//            "Hemiplegic Migraine Familial Hemiplegic Migraine\n" +
//            "Pertussis\n" +
//            "Cll/sll\n" +
//            "Squamous Cell Carcinoma Of The Head And Neck\n" +
//            "Tuberculosis,Primary Biliary Cirrhosis,Measles Show all 4\n" +
//            "Glycine N-Methyltransferase Deficiency,Hypermethioninemia Liver Cancer\n" +
//            "Rhizomelic Chondrodysplasia Punctata Type 2,Peroxisomal Disease,Rhizomelic Chondrodysplasia Punctata\n" +
//            "Pulmonary Function\n" +
//            "Obesity\n" +
//            "Mucolipidosis Iii Alpha/beta,Mucolipidoses,Mucolipidosis Ii\n" +
//            "Mucolipidosis Iii Gamma,Mucolipidosis Ii,Speech Disorder\n" +
//            "Hypogonadotropic Hypogonadism 12 With Or Without Anosmia,Secondary Central Precocious Puberty,Orbital Leiomyoma\n" +
//            "Ovarian Cancer Medulloblastoma\n" +
//            "Fertile Eunuch Syndrome,Klinefelters Syndrome,Hypogonadotropic Hypogonadism 7 Without Anosmia\n" +
//            "Mucopolysaccharidosis Type Iiid Mucopolysaccharidosis\n" +
//            "Mucopolysaccharidosis Iii\n" +
//            "Papillary Thyroid Carcinoma,Oculocerebrorenal Syndrome Follicular Thyroid Carcinoma\n" +
//            "Phobic Disorder,Congenital Fibrosarcoma Fibrosarcoma\n" +
//            "Phobic Disorder,Congenital Fibrosarcoma Fibrosarcoma\n" +
//            "Speech Disorder\n" +
//            "Nasopharynx Carcinoma\n" +
//            "Dyggve-Melchior-Clausen Syndrome\n" +
//            "Specific Phobia Focal Dermal Hypoplasia\n" +
//            "Globozoospermia,Glioblastoma Cystic Fibrosis\n" +
//            "Geroderma Osteodysplastica Hypercementosis\n" +
//            "Exudative Vitreoretinopathy\n" +
//            "Progressive Myoclonic Epilepsy 6,Essential Hypertension,Hypertension\n" +
//            "Aspartate Aminotransferase,Serum Level Of,Qtl1,Exanthem,Gallbladder Disease\n" +
//            "Euthyroid Sick Syndrome\n" +
//            "Fascioliasis,Gallbladder Disease,Reye Syndrome Show all 4\n" +
//            "Pseudo-Von Willebrand Disease,Type 2B Von Willebrand Disease,Anterior Ischemic Optic Neuropathy\n" +
//            "Giant Platelet Disorder,Isolated,Bernard-Soulier Syndrome Type B,Bernard-Soulier Syndrome\n" +
//            "Vesiculitis,Ebola Hemorrhagic Fever,Lassa Fever\n" +
//            "Cervix Uteri Carcinoma In Situ,Gray Platelet Syndrome Bernard-Soulier Syndrome\n" +
//            "Cervix Uteri Carcinoma In Situ,Glycoprotein 1A Deficiency,Bleeding Disorder,Platelet-Type,11\n" +
//            "Bernard-Soulier Syndrome,Bernard-Soulier Syndrome Type C,Gray Platelet Syndrome\n" +
//            "Sclerosing Cholangitis,Primary Sclerosing Cholangitis,Nephrogenic Diabetes Insipidus Show all 4\n" +
//            "Atherosclerosis\n" +
//            "Biliary Atresia\n" +
//            "Mucopolysaccharidoses,Morquio Syndrome B Sly Syndrome\n" +
//            "Simpson-Golabi-Behmel Syndrome Type 1,Simpson-Golabi-Behmel Syndrome,Wilms Tumor,Somatic\n" +
//            "Gpc4-Related Simpson-Golabi-Behmel Syndrome Type 1,Simpson-Golabi-Behmel Syndrome Type 1,Postaxial Polydactyly Type A\n" +
//            "Omodysplasia 1 Body Dysmorphic Disorder\n" +
//            "Hypertriglyceridemia,Transient Infantile Hypertriglyceridemia\n" +
//            "Brugada Syndrome 2,Right Bundle Branch Block,Sudden Infant Death Syndrome\n" +
//            "Type 2 Diabetes Mellitus,Insulin Resistance,Diabetes Mellitus,Noninsulin-Dependent,2\n" +
//            "Pigment-Dispersion Syndrome\n" +
//            "Breast Cancer,Pain Disorder Ovarian Cancer\n" +
//            "Norrie Disease\n" +
//            "Molybdenum Cofactor Deficiency C,Geniculate Herpes Zoster,Gphn-Related Hyperekplexia\n" +
//            "Glucose Phosphate Isomerase Deficiency,Glucosephosphate Isomerase Deficiency,Congenital Nonspherocytic Hemolytic Anemia\n" +
//            "Hyperlipoproteinemia,Type 1D,Familial Lipoprotein Lipase Deficiency,Hyperlipoproteinemia Type V\n" +
//            "Pelizaeus-Merzbacher Disease\n" +
//            "Iris Disease Melanoma\n" +
//            "Neuroendocrine Carcinoma\n" +
//            "Bipolar Disorder Schizophrenia\n" +
//            "Ocular Albinism,X-Linked,Ocular Albinism,Albinism\n" +
//            "Cicatricial Entropion Entropion\n" +
//            "Osteosarcoma Hiv-1\n" +
//            "Estrogen-Receptor Positive Breast Cancer\n" +
//            "Suppression Amblyopia,Amblyopia Spinal Cord Injury\n" +
//            "Usher Syndrome Type 3\n" +
//            "Congenital Stationary Night Blindness,Type 1E,Night Blindness,Congenital Stationary ,1E,Autosomal Recessive,Blindness\n" +
//            "Sepsis Oligohydramnios\n" +
//            "Primary Sclerosing Cholangitis\n" +
//            "Parkinsons Disease\n" +
//            "Breast And Colorectal Cancer\n" +
//            "Mood Disorder Autism Spectrum Disorder\n" +
//            "Bilateral Frontoparietal Polymicrogyria,Polymicrogyria,Bilateral Perisylvian Polymicrogyria\n" +
//            "Ovarian Cancer\n" +
//            "Age Related Macular Degeneration\n" +
//            "Schizophrenia\n" +
//            "Dissecting Aortic Aneurysm\n" +
//            "Pertussis\n" +
//            "Lung Squamous Cell Carcinoma,Oral Squamous Cell Carcinoma Breast And Colorectal Cancer\n" +
//            "Febrile Seizures,Familial,4,Usher Syndrome,Usher Syndrome,Type 2C\n" +
//            "Autism Spectrum Disorder\n" +
//            "Chudley-Mccullough Syndrome,Autosomal Recessive Nonsyndromic Deafness,Nonsyndromic Deafness Show all 4\n" +
//            "Hemorrhagic Shock And Encephalopathy Syndrome,Paraquat Poisoning,Tinea Unguium7\n" +
//            "Hemolytic Anemia Due To Glutathione Peroxidase Deficiency,Keshan Disease,Breast Cancer\n" +
//            "Major Depressive Disorder\n" +
//            "Non-Hodgkin Lymphoma Lung Cancer\n" +
//            "Keshan Disease\n" +
//            "Spondylometaphyseal Dysplasia Sedaghatian Type,Keshan Disease Toxic Encephalopathy\n" +
//            "Keshan Disease\n" +
//            "Keshan Disease\n" +
//            "Goldenhar Syndrome\n" +
//            "Keshan Disease\n" +
//            "Hepatitis C Virus Hepatitis C\n" +
//            "Silver-Russell Syndrome Albrights Hereditary Osteodystrophy\n" +
//            "Hydrocele\n" +
//            "Graves Disease 1 Graves Disease\n" +
//            "Graves Disease 2 Graves Disease\n" +
//            "Graves Disease X-Linked Graves Disease\n" +
//            "Breast Cancer\n" +
//            "Breast Cancer\n" +
//            "Pauci-Immune Glomerulonephritis,Colorectal Adenoma,Renal Hypoplasia\n" +
//            "Accommodative Esotropia,Esotropia Norrie Disease\n" +
//            "Deafness,Autosomal Dominant 28,Ectodermal Dysplasia/short Stature Syndrome,Dfna28 Nonsyndromic Hearing Loss And Deafness Show all 4\n" +
//            "Van Der Woude Syndrome 2 Van Der Woude Syndrome\n" +
//            "Primary Hyperoxaluria Type 2 Primary Hyperoxaluria\n" +
//            "Limbic Encephalitis\n" +
//            "Status Epilepticus,Fraser Syndrome,Amyotrophic Lateral Sclerosis\n" +
//            "Rasmussen Encephalitis,X-Linked Intellectual Disability Due To Gria3 Anomalies,Auditory Neuropathy Show all 4\n" +
//            "Schizophrenia\n" +
//            "Autosomal Recessive Congenital Cerebellar Ataxia Due To Grid2 Deficiency Spinocerebellar Ataxia Type 5\n" +
//            "Depersonalization Disorder,Monosomy 21,Juvenile Absence Epilepsy Show all 4\n" +
//            "Mental Retardation,Autosomal Recessive 2,Hemimegalencephaly Juvenile Absence Epilepsy\n" +
//            "Schizophrenia\n" +
//            "Schizophrenia\n" +
//            "Mental Retardation,Autosomal Dominant 8,Dysembryoplastic Neuroepithelial Tumor,Morphine Dependence\n" +
//            "Epilepsy,Focal,With Speech Disorder And With Or Without Mental Retardation,Speech Disorder,Epilepsy With Neurodevelopmental Defects Show all 4\n" +
//            "Mental Retardation,Autosomal Dominant 6,Myoclonic Astatic Epilepsy,Limbic Encephalitis Show all 4\n" +
//            "Toxic Encephalopathy Schizophrenia\n" +
//            "Opioid Abuse\n" +
//            "Cryptophthalmos,Grip1-Related Fraser Syndrome Fraser Syndrome\n" +
//            "Oguchi Disease 2,Fundus Albipunctatus,Oguchi Disease 1\n" +
//            "Hypertension,Aortic Coarctation Essential Hypertension\n" +
//            "Whim Syndrome\n" +
//            "Disuse Amblyopia,Chondromyxoid Fibroma,Spinocerebellar Ataxia,Autosomal Recessive 13\n" +
//            "Schizophrenia\n" +
//            "Schizophrenia\n" +
//            "Synucleinopathy Fragile X Syndrome\n" +
//            "Suppression Amblyopia,Optic Nerve Disease,Amblyopia\n" +
//            "Ceroid Lipofuscinosis,Neuronal,11,Amusia,Grn-Related Frontotemporal Dementia\n" +
//            "Diffuse Pulmonary Fibrosis,Pancreatic Cancer,Prostate Cancer\n" +
//            "Lung Cancer,Prostate Adenocarcinoma,Ovarian Epithelial Cancer\n" +
//            "Deafness,Autosomal Recessive 25 Deafness,Digenic,Gjb2/gjb3\n" +
//            "Deafness,Autosomal Recessive 101 Deafness,Digenic,Gjb2/gjb3\n" +
//            "Prostate Cancer\n" +
//            "Migraine\n" +
//            "Prostate Cancer\n" +
//            "Alzheimers Disease\n" +
//            "Short Stature,Auditory Canal Atresia,Mandibular Hypoplasia,Skeletal Abnormalities,Microtia,Auditory Neuropathy Show all 4\n" +
//            "Digeorge Syndrome\n" +
//            "Primary Biliary Cirrhosis\n" +
//            "Melanoma\n" +
//            "Rhinotracheitis\n" +
//            "Schizophrenia\n" +
//            "Alzheimers Disease,Aneurysmal Bone Cysts,Parkinsons Disease\n" +
//            "Geniospasm\n" +
//            "Lattice Corneal Dystrophy Type Ii,Familial Amyloidosis,Finnish Type,Blepharochalasis\n" +
//            "Pyridoxine Deficiency,Hemolytic Anemia Due To Glutathione Reductase Deficiency,Riboflavin Deficiency\n" +
//            "Hemolytic Anemia Due To Glutathione Synthetase Deficiency,Glutathione Synthetase Deficiency,Metabolic Acidosis Show all 4\n" +
//            "Toxic Encephalopathy\n" +
//            "Toxic Encephalopathy,Malignant Pleural Mesothelioma Periventricular Nodular Heterotopia\n" +
//            "Toxic Encephalopathy Juvenile Myoclonic Epilepsy\n" +
//            "Atherosclerosis Malignant Pleural Mesothelioma\n" +
//            "Lung Cancer,Gstm1-Related,Oral Cancer,Lung Cancer\n" +
//            "Bronchogenic Carcinoma,Laryngeal Squamous Cell Carcinoma,Oral Cancer\n" +
//            "Tinea Pedis Breast Cancer Susceptibility\n" +
//            "Breast Cancer Susceptibility\n" +
//            "Cisplatin Toxicity,Parkinsons Disease,Barretts Adenocarcinoma Show all 4\n" +
//            "Barretts Adenocarcinoma Parkinsons Disease\n" +
//            "Maxillary Sinus Squamous Cell Carcinoma,Cardia Cancer,Pre-Eclampsia\n" +
//            "Asbestosis,Oral Cancer,Laryngeal Carcinoma\n" +
//            "Barretts Adenocarcinoma,Colon Adenoma Malignant Pleural Mesothelioma\n" +
//            "Tyrosinemia,Type Ib,Tyrosinemia Type I,Alkaptonuria\n" +
//            "Moebius Syndrome\n" +
//            "Richters Syndrome\n" +
//            "Rift Valley Fever Xeroderma Pigmentosum,Group C\n" +
//            "Werdnig-Hoffmann Disease,Idiopathic Pulmonary Fibrosis,Muscular Atrophy Show all 4\n" +
//            "Nonphotosensitive Trichothiodystrophy Photosensitive Trichothiodystrophy\n" +
//            "Trichothiodystrophy,Complementation Group A Photosensitive Trichothiodystrophy\n" +
//            "Williams-Beuren Syndrome\n" +
//            "Williams-Beuren Syndrome Williams Syndrome\n" +
//            "Williams-Beuren Syndrome\n" +
//            "Williams-Beuren Syndrome\n" +
//            "Prostate Carcinoma In Situ Endocarditis\n" +
//            "Gilles De La Tourette Syndrome\n" +
//            "Cone-Rod Dystrophy 14,Cone Dystrophy 3,Cone Dystrophy\n" +
//            "Retinitis Pigmentosa 48,Guca1B-Related Retinitis Pigmentosa Retinitis Pigmentosa\n" +
//            "Cystic Fibrosis Cholera\n" +
//            "Ovarian Mucinous Neoplasm,Cystic Fibrosis,Colorectal Cancer Show all 4\n" +
//            "Colorectal Cancer\n" +
//            "Moyamoya 6 With Achalasia,Myocardial Infarction,Myocardial Infarction,Decreased\n" +
//            "Ileus,Meconium Ileus,Chronic Diarrhea Due To Guanylate Cyclase 2C Overactivity\n" +
//            "Cone-Rod Dystrophy 6,Leber Congenital Amaurosis 1,Gucy2D-Related Leber Congenital Amaurosis\n" +
//            "Retinitis Pigmentosa\n" +
//            "Ankylosis\n" +
//            "Scurvy\n" +
//            "Necrotizing Ulcerative Gingivitis,Non-Immune Hydrops Fetalis,Immune Hydrops Fetalis\n" +
//            "X-Linked Mental Retardation Gustavson Type\n" +
//            "Glycogen Storage Disease Xv,Ornithosis Lymphogranuloma Venereum\n" +
//            "Glycogen Storage Disease Type 0\n" +
//            "Ureteral Benign Neoplasm Dyscalculia\n" +
//            "Malaria,Autoimmune Hemolytic Anemia,Werner Syndrome Show all 4\n" +
//            "Malaria Cerebral Malaria\n" +
//            "Malaria,Hereditary Elliptocytosis Herpes Zoster\n" +
//            "Congenital Dyserythropoietic Anemia Type I,Malaria Sickle Cell Disease\n" +
//            "Glycogen Storage Disease Type 0,Muscle,Glucose Intolerance,Insulin Resistance Show all 4\n" +
//            "Glycogen Storage Disease Type 0,Fasting Hypoglycemia Hypoglycemia\n" +
//            "Chediak-Higashi Syndrome\n" +
//            "Subcutaneous Panniculitis-Like T-Cell Lymphoma,Peripheral T-Cell Lymphoma,Alopecia Areata\n" +
//            "Arts Syndrome,Allergic Asthma T-Cell Large Granular Lymphocyte Leukemia\n" +
//            "Hemihypertrophy,Beckwith-Wiedemann Syndrome,Silver-Russell Syndrome Due To 11P15 Microduplication\n" +
//            "Hiv-1\n" +
//            "Vulvar Intraepithelial Neoplasia\n" +
//            "Medulloblastoma\n" +
//            "Acute Myeloid Leukemia\n" +
//            "Male Infertility Infertility\n" +
//            "Corneal Granular Dystrophy Lattice Corneal Dystrophy\n" +
//            "Cortisone Reductase Deficiency 1,Cortisone Reductase Deficiency Parotitis\n" +
//            "Pellagra Olivopontocerebellar Atrophy\n" +
//            "Follicular Mucinosis,Carotid Stenosis,Venous Thromboembolism\n" +
//            "Neuroblastoma\n" +
//            "Beriberi Rhizomelic Chondrodysplasia Punctata\n" +
//            "3-Hydroxyacyl-Coenzyme A Dehydrogenase Deficiency,3-Hydroxyacyl-Coa Dehydrogenase Deficiency,Hyperinsulinemic Hypoglycemia,Familial,4\n" +
//            "Lchad Deficiency,Acute Fatty Liver Of Pregnancy,Hellp Syndrome\n" +
//            "Trifunctional Protein Deficiency,Mitochondrial Trifunctional Protein Deficiency,Peroxisomal Disease\n" +
//            "Histidinemia\n" +
//            "Hemochromatosis,Type 2B,Hamp-Related Juvenile Hemochromatosis,Hemochromatosis\n" +
//            "Tetralogy Of Fallot,Congenital Heart Disease Ventricular Septal Defect\n" +
//            "Split Hand,Saethre-Chotzen Syndrome Congenital Heart Disease\n" +
//            "Neuroblastoma\n" +
//            "Primary Hyperoxaluria\n" +
//            "Primary Hyperoxaluria\n" +
//            "Huntingtons Disease\n" +
//            "Pseudoachondroplasia\n" +
//            "Charles Bonnet Syndrome,Antisynthetase Syndrome,Polymyositis\n" +
//            "Perrault Syndrome 2,Perrault Syndrome,Sensorineural Hearing Loss Show all 4\n" +
//            "Peritoneal Mesothelioma,Waldenstrom Macroglobulinemia,Malignant Peritoneal Mesothelioma\n" +
//            "Rheumatoid Arthritis,Lipoblastoma Osteosarcoma\n" +
//            "Juvenile Hyaline Fibromatosis,Nodular Basal Cell Carcinoma Skin Atrophy\n" +
//            "Congenital Dyserythropoietic Anemia Type I\n" +
//            "Multicentric Reticulohistiocytosis,Cutaneous Fibrous Histiocytoma,Hepatitis A\n" +
//            "Epithelial Malignant Thymoma,Malaria,Histiocytic Sarcoma\n" +
//            "Severe Congenital Neutropenia Autosomal Recessive 3,Neutropenia,Kidney Disease\n" +
//            "Vascular Cancer,Thalassemias,Alpha-,Heinz Body Anemias,Alpha-\n" +
//            "Hemoglobin Constant Spring,Heinz Body Anemia,Erythrocytosis\n" +
//            "Heinz Body Anemias,Delta-Beta Thalassemia,Hemoglobin E Disease\n" +
//            "Delta-Beta Thalassemia,Hereditary Persistence Of Fetal Hemoglobin Beta Thalassemia\n" +
//            "Thalassemia Due To Hb Lepore,Thalassemia,Delta-,Hemoglobinopathy\n" +
//            "Hepatitis D,Ascariasis,Trichuriasis\n" +
//            "Perinatal Necrotizing Enterocolitis,Diphtheria,Cystitis\n" +
//            "Fetal Hemoglobin Quantitative Trait Locus 2 Hereditary Persistence Of Fetal Hemoglobin\n" +
//            "Fetal Hemoglobin Quantitative Trait Locus 4\n" +
//            "Fetal Hemoglobin Quantitative Trait Locus 1,Beta Thalassemia,Hereditary Persistence Of Fetal Hemoglobin\n" +
//            "Cyanosis,Transient Neonatal,Sulfhemoglobinemia,Hemorrhagic Cystitis\n" +
//            "Alpha-Thalassemia/mental Retardation Syndrome,Type 1 Alpha-Thalassemia/mental Retardation Syndrome\n" +
//            "Ureter Cancer\n" +
//            "Alpha Thalassemia\n" +
//            "Sickle Cell Disease,Thalassemia Hemoglobinopathy\n" +
//            "Alpha Thalassemia Spinal Cord Disease\n" +
//            "Hypercalciuria,Absorptive\n" +
//            "Distal Hereditary Motor Neuropathy,Type Ii\n" +
//            "Microphthalmia With Linear Skin Defects Syndrome,Microphthalmia Syndromic 7,Congenital Diaphragmatic Hernia\n" +
//            "Mental Retardation,X-Linked 3,Herpes Simplex,Mental Retardation,X-Linked Show all 4\n" +
//            "Botulism Herpes Simplex\n" +
//            "Follicular Lymphoma\n" +
//            "Hypercholesterolemia\n" +
//            "Adenosquamous Carcinoma Cervical Adenosquamous Carcinoma\n" +
//            "Oculocutaneous Albinism Type 2 Albinism,Brown Oculocutaneous\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Epileptic Encephalopathy,Early Infantile,24 Sick Sinus Syndrome\n" +
//            "Sick Sinus Syndrome Thyrotoxicosis\n" +
//            "Pallister-Hall Syndrome Sick Sinus Syndrome\n" +
//            "Brugada Syndrome 8,Sick Sinus Syndrome 2,Sick Sinus Syndrome 2,Autosomal Dominant\n" +
//            "Drug-Induced Liver Injury Due To Flucloxacillin,Abacavir Hypersensitivity,Toxic Epidermal Necrolysis\n" +
//            "Spastic Paraplegia 53,Autosomal Recessive\n" +
//            "Recurrent Hypersomnia,Kleine-Levin Syndrome,Narcolepsy 1\n" +
//            "Pertussis,Narcolepsy,Sleep Disorder\n" +
//            "Cluster Headache,Headache Narcolepsy\n" +
//            "Atrichia With Papular Lesions,Chromosome 1P Deletion Retinoblastoma\n" +
//            "2Q37 Microdeletion Syndrome,Neuronal Intranuclear Inclusion Disease,Brachydactyly\n" +
//            "Colon Cancer\n" +
//            "Chondrodysplasia With Platyspondyly,Distinctive Brachydactyly,Hydrocephaly,And Microphthalmia,Alexander Disease Breast Cancer\n" +
//            "Wilson-Turner X-Linked Mental Retardation Syndrome,Wilson-Turner Syndrome,Cornelia De Lange Syndrome 5\n" +
//            "Hiv-1,Gastrointestinal Neuroendocrine Tumor,Hiv-1 Viremia Show all 4\n" +
//            "Gilles De La Tourette Syndrome,Intestinal Obstruction,Mastocytosis\n" +
//            "Hepatitis C,Hepatitis C Virus Hepatitis\n" +
//            "X-Linked Ichthyosis\n" +
//            "Huntington Disease-Like 3\n" +
//            "Familial Hdl Deficiency\n" +
//            "High Density Lipoprotein Cholesterol,Low Serum,3\n" +
//            "Ischemic Heart Disease\n" +
//            "High Density Lipoprotein Cholesterol Level Qtl14 Hypoalphalipoproteinemia\n" +
//            "Hodgkin Disease Susceptibility,Pseudoautosomal\n" +
//            "Ciliary Dyskinesia,Primary,18,Primary Ciliary Dyskinesia18: Heatr2-Related Primary Ciliary Dyskinesia Ciliary Dyskinesia,Primary,11\n" +
//            "Breast Cancer\n" +
//            "Lichen Nitidus\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Rothmund-Thomson Syndrome Autosomal Dominant Progressive External Ophthalmoplegia\n" +
//            "Nonepidermolytic Palmoplantar Keratoderma\n" +
//            "Non-Hodgkin Lymphoma\n" +
//            "Acrocephalosyndactylia\n" +
//            "Megalencephalic Leukoencephalopathy With Subcortical Cysts 2A,Megalencephalic Leukoencephalopathy With Subcortical Cysts 2B,Remitting,With Or Without Mental Retardation,Hepacam-Related Megalencephalic Leukoencephalopathy With Subcortical Cysts\n" +
//            "Atransferrinemia,Aceruloplasminemia,Congenital Disorder Of Glycosylation Type I Show all 4\n" +
//            "Mental Retardation,Autosomal Recessive 38\n" +
//            "Angelman Syndrome\n" +
//            "Angelman Syndrome\n" +
//            "Angelman Syndrome\n" +
//            "Angelman Syndrome\n" +
//            "Liddle Syndrome\n" +
//            "Dominant Optic Atrophy\n" +
//            "Mood Disorder,Alveolar Rhabdomyosarcoma,Autism Spectrum Disorder Show all 4\n" +
//            "Spondylocostal Dysostosis 4,Autosomal Recessive,Spondylocostal Dysostosis 4,Dysostosis\n" +
//            "Pituitary Hormone Deficiency,Combined,5,Growth Hormone Deficiency With Pituitary Anomalies,Pituitary Stalk Interruption Syndrome\n" +
//            "Sensory Peripheral Neuropathy,Tay-Sachs Disease,Gangliosidosis\n" +
//            "Sandhoff Disease,Sandhoff Disease,Infantile,Juvenile,And Adult Forms,Cervical Cancer\n" +
//            "Sandhoff Disease Tay-Sachs Disease\n" +
//            "Hairy Ears,Y-Linked\n" +
//            "Mesenchymal Chondrosarcoma\n" +
//            "Tricuspid Valve Stenosis,Tricuspid Atresia,Tetralogy Of Fallot Show all 4\n" +
//            "Iron Metabolism Disease,Microvascular Complications Of Diabetes 7,Hfe-Associated Hereditary Hemochromatosis\n" +
//            "Hemochromatosis Type 2,Hemochromatosis,Type 2A,Cardiogenic Shock\n" +
//            "Goldenhar Syndrome\n" +
//            "Premature Ovarian Failure 9,Spastic Hemiplegia Epicondylitis\n" +
//            "Ovarian Cancer\n" +
//            "Ochronosis,Alkaptonuria Lumbar Disc Herniation\n" +
//            "Deafness,Autosomal Recessive 39,Dfnb39 Nonsyndromic Hearing Loss And Deafness,Intracranial Hemorrhage In Brain Cerebrovascular Malformations\n" +
//            "Pancreatic Cancer,Idiopathic Pulmonary Fibrosis Prostate Cancer\n" +
//            "Pelger-Huet Anomaly,Hypertonia Neurofibromatosis\n" +
//            "Mucopolysaccharidosis Type Iiic,Lysosomal Storage Disease,Mucopolysaccharidosis Iii Show all 4\n" +
//            "Chondrodysplasia - Disorder Of Sex Development Melanoma\n" +
//            "Skin Squamous Cell Carcinoma\n" +
//            "Familial Hypocalciuric Hypercalcemia Type 3\n" +
//            "Gestational Diabetes Type 2 Diabetes Mellitus\n" +
//            "Chronic Obstructive Pulmonary Disease\n" +
//            "Benign Paroxysmal Positional Nystagmus Oligohydramnios\n" +
//            "Hyperhidrosis Palmaris Et Plantaris\n" +
//            "Hereditary Hemorrhagic Telangiectasia Type 3 Weber Syndrome\n" +
//            "Hereditary Hemorrhagic Telangiectasia Type 4\n" +
//            "Classic Kaposi Sarcoma\n" +
//            "3-Hydroxyisobutyric Aciduria\n" +
//            "3-Hydroxyisobutryl-Coa Hydrolase Deficiency\n" +
//            "Miller-Dieker Syndrome,Male Germ Cell Tumor,Chromosome 17P Deletion\n" +
//            "Supraglottic Laryngeal Cancer,Breast Fibroadenoma,Hypoxia\n" +
//            "Hypoxia,Pre-Eclampsia Pancreatic Endocrine Tumors\n" +
//            "Hypoxia Extratemporal Epilepsy\n" +
//            "Hypoxia\n" +
//            "Hypoxia\n" +
//            "Hypoxia\n" +
//            "Hypoxia,Mantle Cell Lymphoma End Stage Renal Failure\n" +
//            "Neuromyotonia And Axonal Neuropathy,Autosomal Recessive,Axonal Neuropathy Schizophrenia\n" +
//            "Prostate Cancer,Huntingtons Disease Prostate Cancer,Progression Of\n" +
//            "Digeorge Syndrome Cystic Lymphangioma\n" +
//            "Paratyphoid Fever\n" +
//            "Human T-Cell Leukemia Virus Type 1 Neuroendocrine Tumor\n" +
//            "Paratyphoid Fever\n" +
//            "Riddle Syndrome\n" +
//            "Riddle Syndrome\n" +
//            "Riddle Syndrome\n" +
//            "Riddle Syndrome Hiv-1\n" +
//            "Liver Cancer\n" +
//            "Colorectal Cancer\n" +
//            "Presbyopia\n" +
//            "Lung Cancer\n" +
//            "Hemolytic Anemia Due To Hexokinase Deficiency,Neuropathy,Hereditary Motor And Sensory,Russe Type Hemolytic Anemia\n" +
//            "Chondroblastoma,Pancreatic Cancer Insulin Resistance\n" +
//            "Amebiasis\n" +
//            "Postherpetic Neuralgia,Birdshot Chorioretinopathy,Hypersensitivity Syndrome,Carbamazepine-Induced\n" +
//            "Spondyloarthropathy 1,Abacavir Hypersensitivity,Toxic Epidermal Necrolysis\n" +
//            "Psoriasis Susceptibility 1,Hiv-1 Viremia,Psoriasis\n" +
//            "Cardiac Sarcoidosis Measles\n" +
//            "Hiv-1\n" +
//            "Hiv-1\n" +
//            "Berylliosis,Pre-Eclampsia Acute Disseminated Encephalomyelitis\n" +
//            "Beryllium Disease,Chronic,Chronic Berylliosis,Wegeners Granulomatosis\n" +
//            "Otospondylomegaepiphyseal Dysplasia,Fibrochondrogenesis,Fibrochondrogenesis 2 Show all 4\n" +
//            "Tubulointerstitial Nephritis And Uveitis,Celiac Disease,Histoplasmosis\n" +
//            "Vulvovaginal Gingival Syndrome,Celiac Disease,Variant Creutzfeldt-Jakob Disease\n" +
//            "Hypersensitivity Reaction Type Ii Disease\n" +
//            "Graham Little-Piccardi-Lassueur Syndrome,Mhc Class Ii Deficiency,Allergic Encephalomyelitis Show all 4\n" +
//            "Rhizomelic Pseudopolyarthritis,Sarcoidosis 1,Bullous Pemphigoid1\n" +
//            "Gestational Diabetes\n" +
//            "Pityriasis Rosea\n" +
//            "Halo Nevi,Hemorrhagic Fever With Renal Syndrome,Pityriasis Rosea\n" +
//            "Pityriasis Rosea,Alveolar Echinococcosis,Hemorrhagic Fever With Renal Syndrome\n" +
//            "Gestational Diabetes\n" +
//            "Ulcerative Colitis\n" +
//            "Hiv-1\n" +
//            "Vaginal Cancer,Severe Pre-Eclampsia,Asthma\n" +
//            "Alzheimers Disease,Hemochromatosis,Variegate Porphyria\n" +
//            "Systemic Lupus Erythematosus\n" +
//            "Systemic Lupus Erythematosus\n" +
//            "Mesial Temporal Lobe Epilepsy With Hippocampal Sclerosis,Cervical Cancer,Influenza\n" +
//            "Microscopic Colitis\n" +
//            "Hiv-1\n" +
//            "Holocarboxylase Synthetase Deficiency,Multiple Carboxylase Deficiency,Biotinidase Deficiency\n" +
//            "Leukemia,Acute Lymphoblastic 3 Acute Lymphoblastic Leukemia\n" +
//            "Hyperkeratosis Lenticularis Perstans\n" +
//            "Congenital Diaphragmatic Hernia Acute Myeloid Leukemia\n" +
//            "Primary Amebic Meningoencephalitis,Peanut Allergic Reaction,Malaria\n" +
//            "Chester Porphyria,Histrionic Personality Disorder,Porphyria\n" +
//            "Age-Related Macular Degeneration 1,Age Related Macular Degeneration Macular Degeneration,Age-Related,Reduced Risk Of\n" +
//            "Pelvic Lipomatosis,Ring Chromosome 1,Diabetes Mellitus,Noninsulin-Dependent\n" +
//            "Encephalocraniocutaneous Lipomatosis,Benign Mesenchymoma,Diffuse Lipomatosis\n" +
//            "Malaria,Staphylococcal Toxic Shock Syndrome,Idiopathic Neutropenia\n" +
//            "Juvenile Rheumatoid Arthritis\n" +
//            "Microphthalmia,Syndromic 13 Terminal Osseous Dysplasia\n" +
//            "Hmg Coa Lyase Deficiency,3-Hydroxy-3-Methylglutaryl-Coenzyme A Lyase Deficiency,Reye Syndrome\n" +
//            "Atherosclerosis,Smith-Lemli-Opitz Syndrome,Hypercholesterolemia\n" +
//            "Hmg-Coa Synthase-2 Deficiency 3-Hydroxy-3-Methylglutaryl-Coa Synthase 2 Deficiency\n" +
//            "Acute Lymphoblastic Leukemia Lymphoblastic Leukemia\n" +
//            "Breast Cancer,Breast Cancer Susceptibility,Chronic Graft Versus Host Disease\n" +
//            "Neuronopathy,Distal Hereditary Motor,Type Viia\n" +
//            "Neuropathy,Distal Hereditary Motor,Jerash Type\n" +
//            "Heme Oxygenase-1 Deficiency,Arteriovenous Fistula,Hepatopulmonary Syndrome\n" +
//            "Pyloric Stenosis,Hypertrophic Pyloric Stenosis,Adenomyosis\n" +
//            "Hematopoietic Stem Cell Transplantation\n" +
//            "Charcot-Marie-Tooth Disease With Pyramidal Features,Autosomal Dominant\n" +
//            "Neuropathy,Hereditary Motor And Sensory,Okinawa Type\n" +
//            "Oculoauricular Syndrome\n" +
//            "Split Hand Split Foot\n" +
//            "Stickler Syndrome\n" +
//            "Testicular Leukemia\n" +
//            "Neuroblastoma 1 Neuroblastoma\n" +
//            "Diabetes Mellitus,Insulin-Dependent,20,Hepatocellular Adenoma,Diabetes Mellitus,Noninsulin-Dependent,2\n" +
//            "Clear Cell Adenocarcinoma,Unilateral Multicystic Dysplastic Kidney,Bilateral Multicystic Dysplastic Kidney\n" +
//            "Maturity-Onset Diabetes Of The Young,Type 1,Hyperinsulinism Due To Hnf4A Deficiency,Hnf4A-Related Hyperinsulinism\n" +
//            "Hyperuricemic Nephropathy,Familial Juvenile,3\n" +
//            "Asthma,Eosinophilia-Myalgia Syndrome,Cortical Blindness\n" +
//            "Hypertensive Nephropathy\n" +
//            "Amyotrophic Lateral Sclerosis Type 20,Inclusion Body Myopathy Wtih Early-Onset Paget Disease Without Frontotemporal Dementia 3,Spinal Cord Disease\n" +
//            "Systemic Lupus Erythematosus\n" +
//            "Systemic Lupus Erythematosus\n" +
//            "Inclusion Body Myopathy With Early-Onset Paget Disease With Or Without Frontotemporal Dementia 2,Oculopharyngeal Muscular Dystrophy,Inclusion Body Myopathy With Early-Onset Paget Disease And Frontotemporal Dementia 1 Show all 4\n" +
//            "Sipple Syndrome\n" +
//            "Wells Syndrome\n" +
//            "Oculopharyngeal Muscular Dystrophy\n" +
//            "Pancreatic Endocrine Carcinoma\n" +
//            "Limb-Girdle Muscular Dystrophy Type 1G Connective Tissue Disease\n" +
//            "Precursor T-Cell Acute Lymphoblastic Leukemia Hereditary Lymphedema\n" +
//            "T Cell Deficiency\n" +
//            "Diffuse Gastric Cancer\n" +
//            "Berardinelli-Seip Congenital Lipodystrophy\n" +
//            "Primary Hyperoxaluria Type 3,Primary Hyperoxaluria Primary Hyperoxaluria Type 1\n" +
//            "Lung Cancer Choriocarcinoma\n" +
//            "Athabaskan Brainstem Dysgenesis Syndrome,Hoxa1-Related Disorders,Teratocarcinoma\n" +
//            "Ovarian Clear Cell Adenocarcinoma,Adenomyosis,Clear Cell Adenocarcinoma\n" +
//            "Radioulnar Synostosis With Amegakaryocytic Thrombocytopenia,Synostosis,Endometrial Adenocarcinoma\n" +
//            "Hand-Foot-Genital Syndrome,Hand Foot Uterus Syndrome,Preaxial Deficiency,Postaxial Polydactyly And Hypospadias\n" +
//            "Microtia,Hearing Impairment,And Cleft Palate,Microtia With Or Without Hearing Impairment,Microtia\n" +
//            "Vacterl Association\n" +
//            "Abdominal Aortic Aneurysm,Chronic Myeloid Leukemia Acute Myeloid Leukemia\n" +
//            "Gray Zone Lymphoma,Vacterl Association,Acute Myeloid Leukemia\n" +
//            "Acute Promyelocytic Leukemia,Acute Leukemia Esophageal Squamous Cell Carcinoma\n" +
//            "Myelodysplastic Syndromes,Acute Leukemia,Acute Myeloid Leukemia Show all 4\n" +
//            "Chronic Myeloid Leukemia\n" +
//            "Facial Paralysis,Hereditary Congenital Facial Paresis 3,Autism Spectrum Disorder Show all 4\n" +
//            "Prostate Cancer,Spinal Cord Ependymoma,Ependymoma Show all 4\n" +
//            "Pancreatic Cancer,Bamforth-Lazarus Syndrome Acute Myeloid Leukemia\n" +
//            "Acute Myeloid Leukemia,Myeloid Leukemia Vacterl Association\n" +
//            "Ovarian Serous Carcinoma,Gastroschisis,Acute Myeloid Leukemia\n" +
//            "Colorectal Cancer,Acute Myeloid Leukemia Myeloid Leukemia\n" +
//            "Cytomegalovirus Infection Melanoma\n" +
//            "Colorectal Cancer Trichotillomania\n" +
//            "Lung Cancer,Prostate Cancer Papillary Thyroid Carcinoma\n" +
//            "Autism Spectrum Disorder\n" +
//            "Ectodermal Dysplasia 9,Hair/nail Type,Skin Pilomatrix Carcinoma Ectodermal Dysplasia 4,Hair/nail Type\n" +
//            "Vacterl Association\n" +
//            "B-Cell Lymphomas\n" +
//            "Cytomegalovirus Infection,B-Cell Lymphomas Esophageal Squamous Cell Carcinoma\n" +
//            "Vertical Talus,Congenital,Congenital Vertical Talus,Bilateral,Charcot-Marie-Tooth Disease,Foot Deformity Of\n" +
//            "Brachydactyly-Syndactyly Syndrome Acute Myeloid Leukemia\n" +
//            "Brachydactyly-Syndactyly Syndrome Talipes Equinovarus\n" +
//            "Brachydactyly Type D,2Q31.1 Microdeletion Syndrome,Synpolydactyly With Foot Anomalies\n" +
//            "Vacterl Association Duane Retraction Syndrome\n" +
//            "Clubfoot\n" +
//            "Brachydactyly-Syndactyly Syndrome\n" +
//            "Autism Spectrum Disorder\n" +
//            "Paroxysmal Cold Hemoglobinuria,Anhaptoglobinemia,Hemoglobinemia\n" +
//            "Hiv-1\n" +
//            "Prostate Cancer 1 Prostate Cancer\n" +
//            "Prostate Cancer,Hereditary,10 Prostate Cancer\n" +
//            "Prostate Cancer,Hereditary,14 Prostate Cancer\n" +
//            "Prostate Cancer,Hereditary,15 Prostate Cancer\n" +
//            "Prostate Cancer Prostate Cancer 3\n" +
//            "Prostate Cancer Prostate Cancer 4\n" +
//            "Prostate Cancer Prostate Cancer,Hereditary,5\n" +
//            "Prostate Cancer\n" +
//            "Prostate Cancer,Hereditary,7 Prostate Cancer\n" +
//            "Prostate Cancer,Hereditary,9 Prostate Cancer\n" +
//            "Ascending Cholangitis\n" +
//            "Prostate Cancer\n" +
//            "Prostate Cancer\n" +
//            "Prostate Cancer,Hereditary,X-Linked 2 Prostate Cancer\n" +
//            "External Ear Carcinoma,Tyrosinemia Type Iii,Hawkinsinuria\n" +
//            "Holoprosencephaly-1\n" +
//            "Holoprosencephaly-6 Exencephaly\n" +
//            "Holoprosencephaly-8\n" +
//            "Hereditary Persistence Of Fetal Hemoglobin\n" +
//            "Primary Hypertrophic Osteoarthropathy,Cranio Osteoarthropathy,Hypertrophic Osteoarthropathy,Primary,Autosomal Recessive 1\n" +
//            "Familial Hemophagocytic Lymphohistiocytosis 1\n" +
//            "Prostate Cancer Ovarian Cancer\n" +
//            "Hypertelorism,Preauricular Sinus,Punctal Pits,And Deafness Preauricular Sinus\n" +
//            "Anhaptoglobinemia,Breast Cancer,Endometrial Carcinoma\n" +
//            "Hypophosphatemic Rickets And Hyperparathyroidism Hyperparathyroidism\n" +
//            "Hprt-Related Gout,Atlantoaxial Subluxation,Hereditary Hyperuricemia\n" +
//            "Hermansky-Pudlak Syndrome 1,Intestinal Disease,Oculocutaneous Albinism Type 1\n" +
//            "Hermansky-Pudlak Syndrome 3,Oculocutaneous Albinism Type 1,Platelet Storage Pool Deficiency\n" +
//            "Hermansky-Pudlak Syndrome 4,Intestinal Disease,Hermansky-Pudlak Syndrome 1\n" +
//            "Hermansky-Pudlak Syndrome 5,Hermansky-Pudlak Syndrome,Hermansky-Pudlak Syndrome 6\n" +
//            "Hermansky-Pudlak Syndrome 6,Hermansky-Pudlak Syndrome,Platelet Storage Pool Deficiency\n" +
//            "Gallbladder Cancer,Colon Adenocarcinoma,Nephrosis\n" +
//            "Urofacial Syndrome 1,Urofacial Syndrome Hpse2-Related Urofacial Syndrome\n" +
//            "Hypoparathyroidism X-Linked\n" +
//            "Papilloma\n" +
//            "Blackwater Fever\n" +
//            "Atrichia With Papular Lesions,Androgenic Alopecia,Alopecia Universalis\n" +
//            "Congenital Myopathy With Excess Of Muscle Spindles,Costello Syndrome,Spitz Nevus\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy Mixed Glioma\n" +
//            "Systemic Lupus Erythematosus\n" +
//            "Thrombophilia Due To Elevated Hrg,Thrombophilia Due To Hrg Deficiency,Thrombophilia\n" +
//            "Asthma,Malaria,Dermatitis\n" +
//            "Duodenal Ulcer,Gastric Ulcer,Laryngitis\n" +
//            "Hepatic Coma,Sleep Disorder,Schizophrenia Show all 4\n" +
//            "Cerebellar Degeneration Paraneoplastic Cerebellar Degeneration\n" +
//            "Hyperparathyroidism 3 Hyperparathyroidism\n" +
//            "Leukemia,Myeloid/lymphoid Or Mixed-Lineage Wiedemann-Steiner Syndrome\n" +
//            "Bells Palsy,Essential Tremor Tremor\n" +
//            "Papillon-Lefevre Disease\n" +
//            "Herpes Simplex\n" +
//            "Mucopolysaccharidoses\n" +
//            "Mucopolysaccharidoses Morquio Syndrome B\n" +
//            "Hypogonadotropic Hypogonadism 15 With Or Without Anosmia,Hypogonadotropic Hypogonadism 14 With Or Without Anosmia Hypogonadotropic Hypogonadism 9 With Or Without Anosmia\n" +
//            "X-Linked Sideroblastic Anemia With Ataxia X-Linked Sideroblastic Anemia\n" +
//            "Hirschsprung Disease 5,Hirschsprungs Disease,Hirschsprung Disease 4 Show all 4\n" +
//            "Hirschsprung Disease 6 Hirschsprungs Disease\n" +
//            "Hirschsprung Disease 7 Hirschsprungs Disease\n" +
//            "Hirschsprung Disease 8 Hirschsprungs Disease\n" +
//            "Hirschsprung Disease 9 Hirschsprungs Disease\n" +
//            "Cortisone Reductase Deficiency,Cortisone Reductase Deficiency 2,Metabolic Syndrome X\n" +
//            "Apparent Mineralocorticoid Excess Syndrome,Anuria,Hypertension\n" +
//            "Ovarian Disease,Endometriosis,Ovarian Cancer\n" +
//            "Hsd10 Disease,Atypical Type,Hsd10 Disease,Neonatal Type,17-Beta-Hydroxysteroid Dehydrogenase X Deficiency\n" +
//            "Endometrial Carcinoma,Meningioma,Mucopolysaccharidosis Iii Show all 4\n" +
//            "Estrogen-Receptor Positive Breast Cancer\n" +
//            "Mixed Gonadal Dysgenesis\n" +
//            "Progesterone Resistance Hereditary Breast Ovarian Cancer\n" +
//            "Gynecomastia,17-Beta Hydroxysteroid Dehydrogenase 3 Deficiency,Pseudohermaphroditism Show all 4\n" +
//            "Perrault Syndrome 1,D-Bifunctional Protein Deficiency,Peroxisomal Acyl-Coa Oxidase Deficiency\n" +
//            "Apparent Mineralocorticoid Excess Syndrome\n" +
//            "Mycetoma,Prostate Cancer Patent Ductus Arteriosus\n" +
//            "3-Beta-Hydroxysteroid Dehydrogenase Deficiency,3-Beta-Hydroxysteroid Dehydrogenase-Deficient Congenital Adrenal Hyperplasia,Hyperandrogenism\n" +
//            "Congenital Bile Acid Synthesis Defect,Bile Acid Synthesis Defect,Congenital,1,Liver Disease\n" +
//            "3-Beta-Hydroxysteroid Dehydrogenase Deficiency,Late-Onset Congenital Adrenal Hyperplasia Smith-Lemli-Opitz Syndrome\n" +
//            "Spinocerebellar Ataxia Type 6\n" +
//            "Cataract 5,Multiple Types,Acute Tympanitis,Chronic Purulent Otitis Media\n" +
//            "Prediabetes Syndrome\n" +
//            "Y Chromosome Infertility Azoospermia\n" +
//            "Cat Eye Syndrome\n" +
//            "Neuropathy,Hereditary Sensory,Type Ib\n" +
//            "Hand-Foot-Genital Syndrome,Neuronal Intranuclear Inclusion Disease,Lobular Neoplasia\n" +
//            "Hiv-1\n" +
//            "Globozoospermia\n" +
//            "Atherosclerosis\n" +
//            "Malaria,Tetralogy Of Fallot Endometrial Carcinoma\n" +
//            "Tuberculoid Leprosy,Spinocerebellar Ataxia Type 6,Pustulosis Palmaris Et Plantaris\n" +
//            "Mulibrey Nanism Acute Mountain Sickness\n" +
//            "Abacavir Hypersensitivity,Pulmonary Edema,Legionellosis\n" +
//            "Chronic Cervicitis,Inner Ear Disease,Autoimmune Inner Ear Disease\n" +
//            "Endolymphatic Hydrops\n" +
//            "Borna Disease,Spinocerebellar Ataxia Type 17 Wolfram Syndrome\n" +
//            "Inner Ear Disease,Autoimmune Inner Ear Disease,Borna Disease\n" +
//            "Breast Ductal Carcinoma Myotonic Dystrophy Type 2\n" +
//            "Charcot-Marie-Tooth Disease Type 2F,Distal Hereditary Motor Neuronopathy,Type Iib,Neuropathy,Distal Hereditary Motor,Type Iib\n" +
//            "Glioblastoma Multiforme,Prostate Cancer,Corticobasal Degeneration Show all 4\n" +
//            "Distal Hereditary Motor Neuropathy,Distal Hereditary Motor Neuronopathy,Type Iic Neuropathy,Distal Hereditary Motor,Type Iia\n" +
//            "Hereditary Cerebral Hemorrhage With Amyloidosis,Cerebral Hemorrhage,Keloids Show all 4\n" +
//            "Distal Hereditary Motor Neuropathy,Type Ii,Neuropathy,Distal Hereditary Motor,Type Iia,Charcot-Marie-Tooth Disease,Axonal,Type 2L\n" +
//            "Spastic Paraplegia 13,Spastic Paraplegia 13,Autosomal Dominant,Leukodystrophy,Hypomyelinating,4\n" +
//            "Pulmonary Function\n" +
//            "Dyssegmental Dysplasia Silverman-Handmaker Type,Hyperglobulinemic Purpura,Kyphomelic Dysplasia\n" +
//            "Hepatitis D\n" +
//            "Autoimmune Thyroiditis Thyroiditis\n" +
//            "Hiv-1 Gnathodiaphyseal Dysplasia\n" +
//            "Hiv-1\n" +
//            "Hiv-1\n" +
//            "Hiv-1\n" +
//            "Ambras Syndrome\n" +
//            "Hypertrichosis,Congenital Generalized\n" +
//            "Hypertrichosis Terminalis,Generalized,With Or Without Gingival Hyperplasia\n" +
//            "Hypertriglyceridemia\n" +
//            "T-Cell Leukemia,Primary Biliary Cirrhosis,Human T-Cell Leukemia Virus Type 1\n" +
//            "Candida Glabrata Atypical Autism\n" +
//            "Candida Glabrata,Oral Candidiasis Candidiasis\n" +
//            "Brachydactyly With Hypertension Hypertension\n" +
//            "Agoraphobia,Periodic Fever,Menstrual Cycle Dependent,Serotonin Syndrome\n" +
//            "Intermittent Explosive Disorder,Premature Ejaculation,Antisocial Personality Disorder\n" +
//            "Schizophrenia\n" +
//            "Skin Papilloma\n" +
//            "Akinetopsia,Cyclothymic Disorder,Dysthymic Disorder\n" +
//            "Ocular Hypotension,Heart Valve Disease Hepatopulmonary Syndrome\n" +
//            "Cyclothymic Disorder,Premature Ejaculation,Generalized Anxiety Disorder\n" +
//            "Hypochondriasis,Fibromyalgia,Serotonin Syndrome\n" +
//            "Gilles De La Tourette Syndrome Fibromyalgia\n" +
//            "Obstructive Sleep Apnea Sleep Apnea\n" +
//            "Migraine\n" +
//            "Obstructive Sleep Apnea Irritable Bowel Syndrome\n" +
//            "Functional Colonic Disease,Hereditary Diffuse Leukoencephalopathy With Spheroids Colonic Disease\n" +
//            "Autistic Disorder\n" +
//            "Schizophrenia\n" +
//            "Autistic Disorder\n" +
//            "Carasil,Cat-Scratch Disease,Kuhnt-Junius Degeneration\n" +
//            "Parkinson Disease 13,Ophthalmomyiasis,Htra2-Related Parkinson Disease\n" +
//            "Vitreoretinopathy,Neovascular Inflammatory\n" +
//            "Pre-Eclampsia\n" +
//            "Huntingtons Disease,Obsessive-Compulsive Disorder,Ataxia With Oculomotor Apraxia Type 1\n" +
//            "Transposition Of The Great Arteries,Dextro-Looped 2,Double Outlet Right Ventricle,Heterotaxy,Visceral,2,Autosomal Show all 4\n" +
//            "Heterotaxy,Visceral,3,Autosomal Heterotaxy\n" +
//            "Liver Cancer Hepatocellular Carcinoma\n" +
//            "Mental Retardation,X-Linked,Syndromic,Turner Type Angelman Syndrome\n" +
//            "Herpes Simplex\n" +
//            "Hepatitis B\n" +
//            "Hepatitis B\n" +
//            "Epilepsy,Hot Water,1\n" +
//            "Epilepsy,Hot Water,2\n" +
//            "Mucopolysaccharidosis Ix,Mucolipidoses,Type 1 Diabetes Mellitus Show all 4\n" +
//            "Mucopolysaccharidosis Ix\n" +
//            "Mucopolysaccharidosis Ix,Nodular Basal Cell Carcinoma Lung Squamous Cell Carcinoma\n" +
//            "Oxyphilic Adenoma\n" +
//            "Tooth Agenesis,Selective,2\n" +
//            "Ciliary Dyskinesia,Primary,5,Primary Ciliary Dyskinesia 5: Hydin-Related Primary Ciliary Dyskinesia,Ciliary Dyskinesia,Primary,11\n" +
//            "Hydrocephalus\n" +
//            "Hypertrophic Scars\n" +
//            "Lung Cancer\n" +
//            "Hydrolethalus Syndrome 1 Hydrolethalus Syndrome\n" +
//            "Paternal Uniparental Disomy Of Chromosome 6,Diabetes Mellitus,Transient Neonatal,3,Diabetes Mellitus\n" +
//            "Hypoxia Myocardial Infarction\n" +
//            "Hypotrichosis 10\n" +
//            "Hyperlipidemia,Combined,2\n" +
//            "Hypotrichosis 9\n" +
//            "Hypospadias 3,Autosomal\n" +
//            "Hypospadias 4,X-Linked,Susceptibilty To\n" +
//            "Hypertension Hypertension,Essential 1\n" +
//            "Hypertension,Essential 2 Hypertension\n" +
//            "Hypertension Hypertension,Essential 3\n" +
//            "Hypertension,Essential 4 Hypertension\n" +
//            "Hypertension Hypertension,Essential 5\n" +
//            "Hypertension,Essential 6 Hypertension\n" +
//            "Hypertension,Essential 7 Hypertension\n" +
//            "Hypertension,Essential 8 Hypertension\n" +
//            "Islet Cell Tumor,Insulinoma,Hyperglycemia\n" +
//            "Polymyositis,Dermatomyositis Turcot Syndrome\n" +
//            "Multiple Mitochondrial Dysfunctions Syndrome 3\n" +
//            "Inflammatory Bowel Disease 11 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 12 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 15,Crohns Disease Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 16 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 18,Crohns Disease Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 19,Inflammatory Bowel Disease Mycobacterium Tuberculosis,Protection Against\n" +
//            "Inflammatory Bowel Disease 2,Ulcerative Colitis,Inflammatory Bowel Disease Show all 4\n" +
//            "Inflammatory Bowel Disease 20 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 21 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 22 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 23,Crohns Disease,Ulcerative Colitis Show all 4\n" +
//            "Inflammatory Bowel Disease 24 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 25,Early Onset,Autosomal Recessive Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 26 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 27 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 3 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 4,Crohns Disease Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 5,Crohns Disease Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 6,Crohns Disease Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 7,Crohns Disease,Ulcerative Colitis Show all 4\n" +
//            "Inflammatory Bowel Disease 8 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 9 Inflammatory Bowel Disease\n" +
//            "Familial Idiopathic Basal Ganglia Calcification\n" +
//            "Basal Ganglia Calcification,Idiopathic,2\n" +
//            "Osteomyelitis,Pigmented Villonodular Synovitis,Villonodular Synovitis\n" +
//            "Diabetes Mellitus\n" +
//            "Amyotrophic Lateral Sclerosis Lateral Sclerosis\n" +
//            "Folliculotropic Mycosis Fungoides,Lupus Erythematosus Tumidus,Lethal Midline Granuloma\n" +
//            "Polyarteritis Nodosa Idiopathic Pulmonary Fibrosis\n" +
//            "Multiple Sclerosis\n" +
//            "Childhood Leukemia\n" +
//            "Breast Cancer Susceptibility\n" +
//            "Infantile Convulsions And Paroxysmal Choreoathetosis,Familial,Benign Familial Infantile Seizures 2,Paroxysmal Choreoathetosis Show all 4\n" +
//            "Endocrine-Cerebroosteodysplasia\n" +
//            "Immunodeficiency,Common Variable,1,Autoimmune Myocarditis,Icos-Related Common Variable Immune Deficiency\n" +
//            "Prostate Cancer Endometrial Carcinoma\n" +
//            "Congenital Hydronephrosis\n" +
//            "Oligoastrocytoma,Prostate Cancer,Acute Leukemia\n" +
//            "Interleukin 2 Receptor Alpha Chain Deficiency,Diabetes,Mellitus,Insulin-Dependent 10 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,11 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,13 Diabetes Mellitus\n" +
//            "Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,15\n" +
//            "Diabetes Mellitus,Insulin-Dependent,17\n" +
//            "Diabetes Mellitus,Insulin-Dependent,18\n" +
//            "Type 1 Diabetes Mellitus,Maturity-Onset Diabetes Of The Young,Type 10,Hyperproinsulinemia,Familial,With Or Without Diabetes\n" +
//            "Diabetes Mellitus,Insulin-Dependent,23 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,24 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,3 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,4 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,6\n" +
//            "Diabetes Mellitus,Insulin-Dependent,7 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,8 Diabetes Mellitus\n" +
//            "Diabetes Mellitus,Insulin-Dependent,X-Linked Diabetes Mellitus\n" +
//            "Type 2 Diabetes Mellitus,Alzheimers Disease Diabetes Mellitus\n" +
//            "Metaphyseal Chondromatosis With D-2-Hydroxyglutaric Aciduria,Periosteal Chondrosarcoma,Glioma Somatic\n" +
//            "D-2-Hydroxyglutaric Aciduria 2,Interval Angle-Closure Glaucoma,Intracranial Chondrosarcoma\n" +
//            "Retinitis Pigmentosa 46,Idh3B-Related Retinitis Pigmentosa Retinitis Pigmentosa\n" +
//            "Neonatal Adrenoleukodystrophy\n" +
//            "Toxic Oil Syndrome,Listeriosis,Trachoma\n" +
//            "Tolosa-Hunt Syndrome,Mucopolysaccharidosis Ii,Shaken Baby Syndrome\n" +
//            "Mucopolysaccharidosis Ih,Mucopolysaccharidosis I,Mucopolysaccharidosis Ih/s\n" +
//            "Juvenile Hyaline Fibromatosis\n" +
//            "Microcephaly,Epilepsy,And Diabetes Syndrome Microcephaly\n" +
//            "Acute Myeloid Leukemia\n" +
//            "Encapsulated Thymoma,Endometrial Carcinoma,Esophageal Cancer\n" +
//            "Endometritis Neuromyelitis Optica\n" +
//            "Hepatitis C\n" +
//            "Amyopathic Dermatomyositis,Dermatomyositis,Aicardi-Goutieres Syndrome 7\n" +
//            "Ebola Hemorrhagic Fever\n" +
//            "Acute Promyelocytic Leukemia Adult Dermatomyositis\n" +
//            "Rift Valley Fever\n" +
//            "Cycloplegia,Anisometropia,Rift Valley Fever Show all 4\n" +
//            "Influenza,Influenza,Severe,Rift Valley Fever Show all 4\n" +
//            "Osteogenesis Imperfecta Type 5,Ifitm5-Related Osteogenesis Imperfecta Osteogenesis Imperfecta\n" +
//            "Lung Adenoma\n" +
//            "Non-Hodgkin Lymphoma,Hepatitis B Virus Infection,Chronic Myeloid Leukemia\n" +
//            "Oral Erosive Lichen,Granulomatous Hepatitis,Chronic Myeloid Leukemia\n" +
//            "Cortical Blindness,Pulmonary Sarcoidosis,Cutaneous Malignant Melanoma\n" +
//            "Hiv/aids,Hiv-1 Dengue Hemorrhagic Fever\n" +
//            "Hiv-1 Hiv/aids\n" +
//            "Hiv/aids,Hiv-1 Dengue Hemorrhagic Fever\n" +
//            "Pulmonary Sarcoidosis,Cutaneous Malignant Melanoma,Dengue Hemorrhagic Fever\n" +
//            "Blue Rubber Bleb Nevus Syndrome,Periarteritis Nodosa,Cutaneous Polyarteritis Nodosa2\n" +
//            "Hiv/aids Hiv-1\n" +
//            "Hiv-1 Hiv/aids\n" +
//            "Hiv-1 Hiv/aids\n" +
//            "Hiv-1 Hiv/aids\n" +
//            "Acute Hemorrhagic Conjunctivitis,Hiv-1 Hiv/aids\n" +
//            "St. Louis Encephalitis,Hiv-1 Hiv/aids\n" +
//            "Malaria Cerebral Amyloid Angiopathy\n" +
//            "Hepatitis B Virus Infection,Measles,Liver Cancer Show all 4\n" +
//            "Oral Erosive Lichen,Secondary Progressive Multiple Sclerosis,Relapsing-Remitting Multiple Sclerosis\n" +
//            "Dengue Hemorrhagic Fever Cutaneous Malignant Melanoma\n" +
//            "Autoimmune Progesterone Dermatitis,Fusariosis,Eosinophilic Pustular Folliculitis3\n" +
//            "Mycobacterium Avium Complex Disease,Coccidioidomycosis,Paratyphoid Fever\n" +
//            "Immunodeficiency 28,Mycobacteriosis,Familial Atypical Mycobacteriosis,Ifngr2-Related,Autosomal Dominant Mendelian Susceptibility To Mycobacterial Diseases Due To Partial Ifngammar2 Deficiency\n" +
//            "Skin Conditions,Dengue Hemorrhagic Fever Cutaneous Malignant Melanoma\n" +
//            "Hepatitis C Virus Infection,Response To Therapy Of,Hepatitic C Virus,Hepatitis B Virus Infection\n" +
//            "Hepatitic C Virus Hepatitis C Virus \n" +
//            "Dengue Hemorrhagic Fever Cutaneous Malignant Melanoma\n" +
//            "Spinocerebellar Ataxia 18,Cystic Fibrosis,Pheochromocytoma Show all 4\n" +
//            "Afferent Loop Syndrome,Cranioectodermal Dysplasia 1,Sensenbrenner Syndrome Show all 4\n" +
//            "Short-Rib Thoracic Dysplasia 9 With Or Without Polydactyly,Renal Dysplasia,Retinal Pigmentary Dystrophy,Cerebellar Ataxia And Skeletal Dysplasia,Asphyxiating Thoracic Dystrophy Show all 4\n" +
//            "Short-Rib Thoracic Dysplasia 10 With Or Without Polydactyly,Vacterl Association,Short-Rib Thoracic Dysplasia 11 With Or Without Polydactyly Show all 4\n" +
//            "Bardet-Biedl Syndrome 19,Bardet-Biedl Syndrome 1,Bardet-Biedl Syndrome 1,Modifier Of\n" +
//            "Cranioectodermal Dysplasia 3,Sensenbrenner Syndrome Cranioectodermal Dysplasia 1\n" +
//            "Asphyxiating Thoracic Dystrophy 2,Short-Rib Thoracic Dysplasia 2 With Or Without Polydactyly,Aspiration Pneumonitis\n" +
//            "Polycystic Kidney Disease,Autosomal Recessive,Kidney Disease,Polycystic Kidney Disease Show all 4\n" +
//            "Immunoglobulin Alpha Deficiency\n" +
//            "Iga Nephropathy 1\n" +
//            "Iga Nephropathy 2\n" +
//            "Muscular Dystrophy-Dystroglycanopathy ,Type A,13\n" +
//            "Agenesis Of The Corpus Callosum With Mental Retardation,Ocular Coloboma,And Micrognathia,Agenesis Of The Corpus Callosum,Fg Syndrome\n" +
//            "Orbital Cellulitis,Allergy And Asthma Susceptibility,Immune Dysregulation,Polyendocrinopathy,Enteropathy,X-Linked Syndrome\n" +
//            "Slipped Capital Femoral Epiphysis,Growth Retardation With Deafness And Mental Retardation Due To Igf1 Deficiency,Peho Syndrome6\n" +
//            "Insulin-Like Growth Factor I Deficiency,Insulin-Like Growth Factor 1 Resistance To,Ring Chromosome 15\n" +
//            "Hypoglycemic Coma,Osteochondrosis,Potters Syndrome\n" +
//            "Wilms Tumor,Lung Cancer Susceptibility Lung Cancer\n" +
//            "Insulin Resistance,Type 2 Diabetes Mellitus,Diabetes Mellitus,Noninsulin-Dependent\n" +
//            "Pilomyxoid Astrocytoma Adenocarcinoma In Situ\n" +
//            "Donohue Syndrome,Liver Cancer,Insulin Resistance\n" +
//            "Acid-Labile Subunit Deficiency\n" +
//            "Uterine Disease,Mild Pre-Eclampsia,Eclampsia\n" +
//            "Lung Cancer,Astrocytoma,Prostate Cancer\n" +
//            "Malignant Mesenchymal Tumor,Marasmus,Acid-Labile Subunit Deficiency\n" +
//            "Ovarian Cancer Follicular Thyroid Carcinoma\n" +
//            "3-M Syndrome,Neuroblastoma Breast Cancer\n" +
//            "Pheochromocytoma,Prostate Cancer Lung Cancer\n" +
//            "Retinal Arterial Macroaneurysm With Supravalvular Pulmonic Stenosis,Pulmonic Stenosis,Diabetic Angiopathy Show all 4\n" +
//            "Skin Conditions\n" +
//            "Skin Conditions\n" +
//            "Type 2 Diabetes Mellitus,Skin Conditions Testicular Disease\n" +
//            "Skin Conditions\n" +
//            "Mantle Cell Lymphoma,Malt Lymphoma,Chronic Lymphocytic Leukemia\n" +
//            "Breast Adenocarcinoma Hepatitis A\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Fournier Gangrene,Papular Urticaria,Heiner Syndrome5\n" +
//            "Chronic Lymphocytic Leukemia Congenital Hypogammaglobulinemia\n" +
//            "Sarcomatosis,Congenital Hypogammaglobulinemia Igg2 Deficiency,Selective\n" +
//            "Gamma Heavy Chain Disease,Heavy Chain Disease,Relapsing-Remitting Multiple Sclerosis\n" +
//            "Agammaglobulinemia 1,Autosomal Recessive,Cold Agglutinin Disease,Rabies\n" +
//            "Spinal Muscular Atrophy With Respiratory Distress 1,Progressive Multifocal Leukoencephalopathy,Werdnig-Hoffmann Disease\n" +
//            "Alpha Chain Disease,Gamma Heavy Chain Disease,Small Intestine Lymphoma\n" +
//            "Hiv-1\n" +
//            "Chronic Lymphocytic Leukemia\n" +
//            "Acute Myeloid Leukemia\n" +
//            "Hcl-V Hairy Cell Leukemia\n" +
//            "Non-Hodgkin Lymphoma,B-Cell Lymphomas Multiple Myeloma\n" +
//            "Immunoglobulin Kappa Light Chain Deficiency,Light Chain Deposition Disease Extramedullary Plasmacytoma\n" +
//            "Haemophilus Influenzae\n" +
//            "Light Chain Deposition Disease,Follicular Lymphoma Multiple Myeloma\n" +
//            "Haemophilus Influenzae\n" +
//            "Fatty Liver Disease\n" +
//            "Mantle Cell Lymphoma,Multiple Myeloma Hodgkins Lymphoma\n" +
//            "Agammaglobulinemia 2,B Cell Deficiency,Autosomal Recessive Disease\n" +
//            "Carotid Artery Dissection\n" +
//            "Papilledema\n" +
//            "Papilledema\n" +
//            "Aspartylglucosaminuria\n" +
//            "Acute Maxillary Sinusitis Chronic Maxillary Sinusitis\n" +
//            "Central Hypothyroidism And Testicular Enlargement,Subacute Sclerosing Panencephalitis Hypothyroidism\n" +
//            "Inflammatory Bowel Disease 1 Inflammatory Bowel Disease\n" +
//            "Inflammatory Bowel Disease 1 Inflammatory Bowel Disease\n" +
//            "Hemihypertrophy\n" +
//            "Iris Hypoplasia\n" +
//            "Acrocapitofemoral Dysplasia,Brachydactyly Type A1,Brachydactyly\n" +
//            "Pyloric Stenosis,Infantile Hypertrophic,2\n" +
//            "Pyloric Stenosis,Infantile Hypertrophic,3\n" +
//            "Pyloric Stenosis,Infantile Hypertrophic,4\n" +
//            "Pyloric Stenosis,Infantile Hypertrophic,5\n" +
//            "Central Sleep Apnea\n" +
//            "Hyperlipoproteinemia Type Iv,Baroreflex Failure,Riley-Day Syndrome\n" +
//            "Immunodeficiency 15 Insulin Resistance\n" +
//            "Breast Cancer Sle Susceptibility\n" +
//            "Linear And Whorled Nevoid Hypermelanosis,Bloch-Sulzberger Syndrome,Hypohidrotic Ectodermal Dysplasia With Immune Deficiency\n" +
//            "Acute Lymphoblastic Leukemia,Pancytopenia Due To Ikzf1 Mutations,Lymphoblastic Leukemia\n" +
//            "Oophoritis\n" +
//            "Juvenile Myasthenia Gravis,Punctate Inner Choroidopathy,Adult Pulmonary Langerhans Cell Histiocytosis4\n" +
//            "Giant Cell Myocarditis,Post-Transplant Lymphoproliferative Disease,Cytomegalovirus Retinitis\n" +
//            "Inflammatory Bowel Disease 25,Autosomal Recessive,Hepatitis B Virus Infection,Inflammatory Bowel Disease 25,Early Onset,Autosomal Recessive Show all 4\n" +
//            "Hemorrhagic Cystitis,Periostitis,Osteitis Fibrosa\n" +
//            "Craniosynostosis And Dental Anomalies,Colorectal Adenocarcinoma,Cartilage-Hair Hypoplasia\n" +
//            "Primary Biliary Cirrhosis,Aphthous Stomatitis,Classic Kaposi Sarcoma\n" +
//            "Familial Atypical Mycobacteriosis,Il12B-Related,Immunodeficiency 29,Mycobacteriosis,Asthma\n" +
//            "Mycobacterium Fortuitum,Abdominal Tuberculosis,Nocardiosis\n" +
//            "Leprosy Behcets Disease\n" +
//            "Lipoid Nephrosis,Actinic Prurigo,Angiostrongyliasis\n" +
//            "Malignant Glioma Atopy\n" +
//            "Glioblastoma Multiforme,Malignant Glioma,Liver Cancer\n" +
//            "Lung Cancer,T Cell Deficiency,Celiac Disease\n" +
//            "T-Cell Large Granular Lymphocyte Leukemia\n" +
//            "Whiplash,Vasomotor Rhinitis,Viral Meningitis Show all 4\n" +
//            "Duodenal Disease,Paranasal Sinus Disease,Multiple Sclerosis\n" +
//            "Enthesitis-Related Arthritis,Hyper Ige Syndrome Childhood Leukemia\n" +
//            "Chronic Mucocutaneous Candidiasis,Familial Candidiasis 6,Candidiasis,Familial,6,Autosomal Dominant\n" +
//            "Candidiasis,Familial,5,Autosomal Recessive,Familial Candidiasis 5,Rheumatoid Arthritis\n" +
//            "Hypogonadotropic Hypogonadism 18 With Or Without Anosmia Hypogonadotropic Hypogonadism 9 With Or Without Anosmia\n" +
//            "Acute Graft Versus Host Disease,Adult-Onset Stills Disease,Miliary Tuberculosis\n" +
//            "Smallpox,Acute Graft Versus Host Disease Wegeners Granulomatosis\n" +
//            "Collagen Disease,Joint Disorders,Laron Syndrome\n" +
//            "Celiac Disease,Leprosy Inflammatory Bowel Disease\n" +
//            "Melanoma Richters Syndrome\n" +
//            "Acute Hemorrhagic Conjunctivitis,Skin Conditions,Nephropathia Epidemica\n" +
//            "Central Nervous System Leukemia,Toxic Shock Syndrome,Poems Syndrome9\n" +
//            "Pyogenic Arthritis,Pyoderma Gangrenosum And Acne,Schnitzler Syndrome,Cryopyrin-Associated Periodic Syndrome\n" +
//            "Joint Disorders Aseptic Meningitis\n" +
//            "Stromal Keratitis\n" +
//            "X-Linked Mental Retardation 21,Mental Retardation,Complex Glycerol Kinase Deficiency\n" +
//            "Anterior Scleritis,Malaria,Sepsis\n" +
//            "Yellow Fever Allergic Conjunctivitis\n" +
//            "Deficiency Of Interleukin-1 Receptor Antagonist,Microvascular Complications Of Diabetes 4,Gastric Cancer Risk After H. Pylori Infection\n" +
//            "Balanoposthitis,Erysipeloid,Oral Tuberculosis\n" +
//            "Psoriasis Spondyloarthropathy\n" +
//            "Psoriasis\n" +
//            "Immunodeficiency,Common Variable,11,Dacryoadenitis,Inflammatory Bowel Disease 25,Early Onset,Autosomal Recessive\n" +
//            "Immunodeficiency,Primary,Autosomal Recessive,Il21R-Related Chronic Cholangitis\n" +
//            "Chronic Mucocutaneous Candidiasis,Colitis,Interstitial Lung Disease\n" +
//            "Liver Cancer\n" +
//            "Liver Cancer\n" +
//            "Colitis\n" +
//            "Psoriasis,Protection Against,Inflammatory Bowel Disease 17,Protection Against,Idiopathic Achalasia\n" +
//            "Melanoma,Pancreatic Cancer,Prostate Cancer\n" +
//            "Allergic Asthma\n" +
//            "Eosinophilic Granulomatosis With Polyangiitis Posterior Uveitis\n" +
//            "Small Non-Cleaved Cell Lymphoma,Graft Versus Host Disease,Uveitis\n" +
//            "Occipital Neuralgia,Granulomatous Orchitis,Extramedullary Plasmacytoma\n" +
//            "Severe Combined Immunodeficiency,Gamma Chain Deficiency,Combined Immunodeficiency,X-Linked,Moderate\n" +
//            "Subcutaneous Mycosis,Granulocytopenia,Leukemoid Reaction\n" +
//            "Asthma,Epidermolysis Bullosa Pruriginosa,Atopic Dermatitis\n" +
//            "Amyloidosis,Primary Localized Cutaneous,2,Primary Cutaneous Amyloidosis,Mycobacterium Avium Complex Disease\n" +
//            "Venezuelan Equine Encephalitis,Pancreatic Cancer,Chronic Myelomonocytic Leukemia\n" +
//            "Allergic Conjunctivitis\n" +
//            "Herpes Simplex\n" +
//            "Acute Generalized Exanthematous Pustulosis,Generalized Pustular Psoriasis,Pustulosis Palmaris Et Plantaris\n" +
//            "Morbid Obesity\n" +
//            "Cd4+/cd56+ Hematodermic Neoplasm,Acute Leukemia,Acute Basophilic Leukemia\n" +
//            "Transient Acantholytic Dermatosis,Vernal Conjunctivitis,Leishmaniasis5\n" +
//            "Perinephritis Primary Mediastinal Large B-Cell Lymphoma\n" +
//            "Atopy,Aids,Slow Progression To,Asthma\n" +
//            "Eosinophilic Gastritis,Granulomatous Angiitis,Necatoriasis0\n" +
//            "Atopy\n" +
//            "Acute Cystitis,Crohn Disease-Associated Growth Failure,Polyclonal Hypergammaglobulinemia2\n" +
//            "Pleomorphic Malignant Fibrous Histiocytoma,Nodular Goiter,Pycnodysostosis\n" +
//            "Kaposis Sarcoma,Rheumatoid Arthritis,Conjunctival Disease\n" +
//            "Lymphocytic Choriomeningitis,Natural Killer Cell Leukemia,Relapsing Polychondritis\n" +
//            "Severe Combined Immunodeficiency,T Cell-Negative,B-Cell/natural Killer-Cell Positive,Severe Combined Immune Deficiency,Autosomal Recessive T Cell-Negative,B Cell-Positive,Nk Cell-Positive,Il7R-Related,Thyroid Lymphoma\n" +
//            "Mycobacterium Marinum,Lung Giant Cell Carcinoma,Bronchiolitis2\n" +
//            "Asthma,Bronchitis,Tetanus\n" +
//            "Bronchitis,Adult T-Cell Leukemia,Asthma\n" +
//            "Deafness,Autosomal Recessive 42 Deafness,Digenic,Gjb2/gjb3\n" +
//            "Hepatitis B Hepatitis\n" +
//            "Scar Contracture\n" +
//            "Atypical Autism\n" +
//            "Melanoma-Associated Retinopathy,Amish Lethal Microcephaly Gracile Syndrome\n" +
//            "Fanconi Anemia,Complementation Group A\n" +
//            "Bipolar Disorder Chronic Intestinal Vascular Insufficiency\n" +
//            "Bipolar Disorder Schizophrenia\n" +
//            "Learning Disability\n" +
//            "Chondrodysplasia With Joint Dislocations,Gpapp Type,Chondrodysplasia With Joint Dislocations,Grapp Type,Catel Manzke Syndrome Show all 4\n" +
//            "Retinitis Pigmentosa 10,Leber Congenital Amaurosis 11,Impdh1-Related Leber Congenital Amaurosis\n" +
//            "Progressive Bifocal Chorioretinal Atrophy,North Carolina Macular Dystrophy,Vitelliform Macular Dystrophy\n" +
//            "Maculopathy,Impg2-Related,Retinitis Pigmentosa 56,Impg2-Related Retinitis Pigmentosa\n" +
//            "Prostate Small Cell Carcinoma,Wernicke Encephalopathy,Medulloepithelioma\n" +
//            "Graham Little-Piccardi-Lassueur Syndrome Roberts Syndrome\n" +
//            "Wood Neuroimmunologic Syndrome\n" +
//            "Focal Segmental Glomerulosclerosis 5,Autosomal Dominant Intermediate Charcot-Marie-Tooth Disease Type E,Focal Segmental Glomerulosclerosis\n" +
//            "Squamous Cell Carcinoma Of The Head And Neck Squamous Cell Carcinoma,Head And Neck,Somatic\n" +
//            "Non-Small Cell Lung Carcinoma\n" +
//            "Squamous Cell Carcinoma Of The Head And Neck Squamous Cell Carcinoma,Head And Neck,Somatic\n" +
//            "Parovarian Cyst,Fallopian Tube Adenocarcinoma,Invasive Mole\n" +
//            "Ovary Adenocarcinoma,Preterm Premature Rupture Of The Membranes Endometrial Carcinoma\n" +
//            "Varicocele Ectopic Pregnancy\n" +
//            "Gastric Diffuse Adenocarcinoma Endometrial Adenocarcinoma\n" +
//            "Endometrial Adenocarcinoma,Germ Cell Tumors Testicular Germ Cell Tumor\n" +
//            "Oculocerebrorenal Syndrome\n" +
//            "Oculocerebrorenal Syndrome\n" +
//            "Oculocerebrorenal Syndrome\n" +
//            "Joubert Syndrome,Morm Syndrome,Inpp5E-Related Joubert Syndrome\n" +
//            "Oculocerebrorenal Syndrome\n" +
//            "Oculocerebrorenal Syndrome Miller-Dieker Syndrome\n" +
//            "Opsismodysplasia,Oculocerebrorenal Syndrome Breast Cancer\n" +
//            "Hyperproinsulinemia,Familial,Hair-An Syndrome,Brittle Diabetes8\n" +
//            "Optic Disk Drusen\n" +
//            "Morbid Obesity Obesity\n" +
//            "Testicular Disease,Anorchia,Cryptorchidism\n" +
//            "Placenta Accreta\n" +
//            "Insulinoma\n" +
//            "Acanthosis Nigricans,Rabson-Mendenhall Syndrome,Donohue Syndrome\n" +
//            "Alzheimers Disease\n" +
//            "Neurofibrosarcoma\n" +
//            "Intelligence Qtl1\n" +
//            "Intelligence Qtl3\n" +
//            "Intelligence Qtl3\n" +
//            "Neonatal Ovarian Cyst\n" +
//            "Familial Lipoprotein Lipase Deficiency Dysembryoplastic Neuroepithelial Tumor\n" +
//            "Opisthorchiasis\n" +
//            "Nephronophthisis 2,Infantile Nephronophthisis,Nephronophthisis 2,Infantile\n" +
//            "Triple-A Syndrome\n" +
//            "Intestinal Pseudoobstruction,Neuronal\n" +
//            "Cardiac Tamponade\n" +
//            "Atrial Heart Septal Defect Heart Septal Defect\n" +
//            "Prader-Willi Syndrome\n" +
//            "Senior-Loken Syndrome 5,Verbal Auditory Agnosia,Iqcb1-Related Leber Congenital Amaurosis\n" +
//            "Bullous Skin Disease,Skin Disease Gastric Cancer\n" +
//            "Severe Intellectual Disability-Progressive Postnatal Microcephaly- Midline Stereotypic Hand Movements Syndrome,Mental Retardation,X-Linked 29 And Others Mental Retardation\n" +
//            "Pediatric Systemic Lupus Erythematosus Systemic Lupus Erythematosus\n" +
//            "Asthma Susceptibility 5,Asthma Melioidosis\n" +
//            "Irak-4 Deficiency,Pneumococcal Meningitis,Invasive Pneumococcal Disease,Recurrent Isolated,1 Show all 4\n" +
//            "Erythropoietic Protoporphyria\n" +
//            "Nonsmall Cell Lung Cancer,Somatic,Myelodysplastic Syndrome,Preleukemic,Mumps\n" +
//            "Mumps Eczema Herpeticum\n" +
//            "Brain Cancer\n" +
//            "Mesenchymal Chondrosarcoma\n" +
//            "Herpes Simplex Lymphocytic Choriomeningitis\n" +
//            "Primary Cutaneous Diffuse Large B-Cell Lymphoma,Leg Type,Primary Cutaneous Anaplastic Large Cell Lymphoma,Primary Effusion Lymphoma\n" +
//            "Systemic Lupus Erythematosus 10,Inflammatory Bowel Disease 14,Macrophage Activation Syndrome\n" +
//            "Cleft Palate Lateral Synechia Syndrome,Irf6-Related Disorders,Popliteal Pterygium Syndrome 1\n" +
//            "Stomatitis Central Nervous System Lymphoma\n" +
//            "Immunodeficiency 32B,Monocyte And Dendritic Cell Deficiency,Autosomal Recessive Immunodeficiency 32A,Mycobacteriosis,Autosomal Dominant\n" +
//            "Ebola Hemorrhagic Fever Lymphocytic Choriomeningitis\n" +
//            "Mycobacterium Tuberculosis,Protection Against,Crohns Disease,Tuberculosis\n" +
//            "Insulin Resistance,Type 2 Diabetes Mellitus,Lipoatrophic Diabetes\n" +
//            "Diabetes Mellitus,Noninsulin-Dependent Insulin Resistance\n" +
//            "Cribriform Carcinoma,Boutonneuse Fever Exostosis\n" +
//            "Squamous Cell Carcinoma Of The Head And Neck Soft Tissue Sarcoma\n" +
//            "Hamamy Syndrome\n" +
//            "Scoliosis,Idiopathic 1\n" +
//            "Scoliosis,Idiopathic 2\n" +
//            "Scoliosis,Idiopathic 4\n" +
//            "Pulmonary Function\n" +
//            "Myopathy With Deficiency Of Iscu,Myopathy With Deficiency Of Iron-Sulfur Cluster Assembly Enzyme Siderosis\n" +
//            "Mendelian Susceptibility To Mycobacterial Diseases Due To Complete Isg15 Deficiency,Japanese Encephalitis,Stomatitis Show all 4\n" +
//            "Malignant Glioma Leukemia\n" +
//            "Gilles De La Tourette Syndrome,Maturity-Onset Diabetes Of The Young,Double Outlet Right Ventricle\n" +
//            "Cortical Blindness\n" +
//            "Indolent Systemic Mastocytosis\n" +
//            "Ispd-Related Muscle Diseases,Muscular Dystrophy-Dystroglycanopathy ,Type A,7,Muscular Dystrophy-Dystroglycanopathy ,Type C,7\n" +
//            "Lung Cancer\n" +
//            "Fungal Meningitis\n" +
//            "Hypertrichosis Universalis Congenita\n" +
//            "Itch E3 Ubiquitin Ligase Deficiency Autoimmune Disease,Multisystem,With Facial Dysmorphism\n" +
//            "Tethered Spinal Cord Syndrome\n" +
//            "Colon Carcinoma In Situ Phimosis\n" +
//            "Arrhythmogenic Right Ventricular Cardiomyopathy\n" +
//            "Tick Infestation\n" +
//            "Anus Disease,Thrombocytopenia,Fetal And Neonatal Alloimmune Thrombocytopenia\n" +
//            "Thrombasthenia,Glanzmanns Thrombasthenia,Bleeding Disorder,Platelet-Type,16,Autosomal Dominant\n" +
//            "Interstitial Lung Disease,Nephrotic Syndrome,And Epidermolysis Bullosa,Congenital,Interstitial Lung Disease,Hydrocele\n" +
//            "Breast Sarcoma,Chronic Venous Insufficiency,Venous Insufficiency\n" +
//            "Gastric Cardia Adenocarcinoma\n" +
//            "Duodenal Atresia,Epidermolysis Bullosa,Junctional,With Pyloric Stenosis,Itga6-Related Epidermolysis Bullosa With Pyloric Atresia\n" +
//            "Muscular Dystrophy,Congenital,Due To Itga7 Deficiency,Congenital Muscular Dystrophy Due To Integrin Alpha-7 Deficiency,Fukuyama Congenital Muscular Dystrophy\n" +
//            "Renal Hypodysplasia/aplasia 1,Renal Agenesis Renal Hypoplasia,Isolated\n" +
//            "Congenital Muscular Dystrophy With Hyperlaxity\n" +
//            "Chronic Monocytic Leukemia\n" +
//            "Nephropathic Cystinosis Cystinosis\n" +
//            "Benign Cephalic Histiocytosis,Cutaneous Necrotizing Vasculitis,Acute Myeloid Leukemia\n" +
//            "Systemic Lupus Erythematous,Association With 6,Granulocytopenia,Lymphocytic Vasculitis\n" +
//            "Chorioangioma,Cerebral Hypoxia Priapism\n" +
//            "Benign Cephalic Histiocytosis,Sporotrichosis,Lymphocytic Vasculitis\n" +
//            "Frozen Shoulder,Fraser Syndrome,Cerebral Hypoxia Show all 4\n" +
//            "Cavernous Malformation Cerebral Cavernous Malformation\n" +
//            "Leukocyte Adhesion Deficiency Type 1,Leukocyte Adhesion Deficiency,Gastrointestinal Carcinoma\n" +
//            "Fetal And Neonatal Alloimmune Thrombocytopenia,Thrombasthenia Of Glanzmann And Naegeli,Itgb3-Related,Thrombocytopenia,Neonatal Alloimmune\n" +
//            "Breast Cancer\n" +
//            "Epidermolysis Bullosa With Pyloric Atresia,Cicatricial Pemphigoid,Ocular Cicatricial Pemphigoid\n" +
//            "Amelogenesis Imperfecta,Type Iii Amelogenesis Imperfecta,Type Ib\n" +
//            "Spongiotic Dermatitis\n" +
//            "Isolated Growth Hormone Deficiency\n" +
//            "Aids Dementia Complex,Hypercholesterolemia,Rabies Show all 4\n" +
//            "Lymphoproliferative Syndrome 1,Lymphoproliferative Syndrome,Ebv-Associated,Autosomal,1 Peripheral T-Cell Lymphoma\n" +
//            "Type 2 Diabetes Mellitus,Insulin Resistance,Malignant Pleural Mesothelioma Show all 4\n" +
//            "Dementia,Familial Danish,Dementia Familial British,Retinal Dystrophy With Inner Retinal Dysfunction And Ganglion Cell Anomalies\n" +
//            "Inosine Triphosphate Pyrophosphohydrolase Deficiency,Leukopenia,Susceptibility To Adverse Reaction Due To Mercaptopurine\n" +
//            "Kawasaki Disease Coronary Artery Aneurysm\n" +
//            "Spinocerebellar Ataxia 29,Spinocerebellar Ataxia Type15,Spinocerebellar Ataxia Type 15\n" +
//            "Type 1 Diabetes Mellitus\n" +
//            "Insulinoma\n" +
//            "Isovaleric Acidemia,Radiculopathy,Organic Acidemia\n" +
//            "Senile Angioma,Acanthoma,Hailey-Hailey Disease\n" +
//            "Influenza,Dengue Hemorrhagic Fever,Dengue Shock Syndrome Show all 4\n" +
//            "Thyroid Dyshormonogenesis 4,Croup,Congenital Hypothyroidism,Iyd-Related\n" +
//            "Deafness,Congenital Heart Defects,And Posterior Embryotoxon,Pseudopapilledema,Familial Deafness\n" +
//            "Ossifying Fibroma,Shipyard Eye,Pain Agnosia\n" +
//            "Neutropenia,Severe Congenital,6,Autosomal Recessive\n" +
//            "Thrombocythemia 3,Myelofibrosis,Polycythemia Vera\n" +
//            "Scid,Autosomal Recessive,T-Negative/b-Positive Type,Severe Combined Immune Deficiency,Autosomal Recessive,T Cell-Negative,B Cell-Positive,Nk Cell-Negative,Jak3-Related,Jacobsen Syndrome\n" +
//            "Hemorrhagic Destruction Of The Brain,Subependymal Calcification,And Cataracts,Pseudo-Torch Syndrome Torch Syndrome\n" +
//            "Endometrial Stromal Tumor\n" +
//            "Jacobsen Syndrome Johanson-Blizzard Syndrome\n" +
//            "Skeletal Muscle Neoplasm\n" +
//            "Medulloblastoma\n" +
//            "Central Nervous System Germinoma\n" +
//            "Chorioretinal Scar,Intramuscular Hemangioma Trigeminal Neuralgia\n" +
//            "Papillon-Lefevre Disease,Haim-Munk Syndrome,Periodontitis 1,Juvenile Show all 4\n" +
//            "Cardiomyopathy,Familial Hypertrophic 17\n" +
//            "Huntington Disease-Like 2,Huntingtons Disease,Chorea-Acanthocytosis Show all 4\n" +
//            "Childhood Absence Epilepsy,Epilepsy,Childhood Absence,Susceptibility To,2 Juvenile Myoclonic Epilepsy\n" +
//            "Fatty Liver Disease\n" +
//            "Liver Cancer\n" +
//            "Lymph Node Tuberculosis Tuberculosis\n" +
//            "Sarcoma,Campylobacteriosis,Hemorrhagic Cystitis\n" +
//            "Fumarate Hydratase Deficiency\n" +
//            "Human T-Cell Leukemia Virus Type 1,Wermer Syndrome,Kidney Cancer Show all 4\n" +
//            "Arrhythmogenic Right Ventricular Dysplasia 12,Naxos Disease,Arrhythmogenic Right Ventricular Dysplasia/cardiomyopathy12\n" +
//            "Kallmann Syndrome 1,Hypogonadotropic Hypogonadism 1 With Or Without Anosmia,Kallmann Syndrome\n" +
//            "Coronary Heart Disease 5\n" +
//            "Cerebral Palsy,Cerebral Palsy,Spastic Quadriplegic,2,Renal Cell Carcinoma\n" +
//            "Koolen De Vries Syndrome Koolen-De Vries Syndrome Due To A Point Mutation\n" +
//            "Deafness,Autosomal Recessive 89,Charcot-Marie-Tooth Disease,Recessive Intermediate,B,Kars-Related Intermediate Charcot-Marie-Tooth Neuropathy\n" +
//            "Dosage-Sensitive Sex Reversal\n" +
//            "Enamel Erosion Holt-Oram Syndrome\n" +
//            "Hiv-1 Kaposis Sarcoma\n" +
//            "Acute Myeloid Leukemia With T(8;16)(P11;p13) Translocation,Neonatal Leukemia,Acute Myeloid Leukemia Show all 4\n" +
//            "Kat6B-Related Disorders,Genitopatellar Syndrome,Monocytic Leukemia\n" +
//            "Tinea Capitis\n" +
//            "Kala-Azar 1,Visceral Leishmaniasis Leishmaniasis\n" +
//            "Kala-Azar 2\n" +
//            "Kala-Azar 3\n" +
//            "Malignant Peritoneal Mesothelioma\n" +
//            "Nemaline Myopathy 6,Childhood-Onset Nemaline Myopathy,Kbtbd13-Related Nemaline Myopathy\n" +
//            "Gastric Cancer\n" +
//            "Episodic Ataxia Type 1,Benign Neonatal Seizures,Myokymia 1 With Or Without Hypomagnesemia\n" +
//            "Benign Neonatal Seizures\n" +
//            "Pancreas Adenocarcinoma,Autoimmune Pancreatitis,Breast Adenocarcinoma Show all 4\n" +
//            "Episodic Ataxia Type 1 Pancreas Adenocarcinoma\n" +
//            "Atrial Fibrillation,Familial,7,Kcna5-Related Familial Atrial Fibrillation,Familial Atrial Fibrillation\n" +
//            "Benign Neonatal Seizures Myokymia\n" +
//            "1P36 Deletion Syndrome\n" +
//            "Epileptic Encephalopathy,Early Infantile,26,Blastomycosis Sporotrichosis\n" +
//            "Spinocerebellar Ataxia Type13 Spinocerebellar Ataxia Type 13\n" +
//            "Spinocerebellar Ataxia 19,Myokymia Brugada Syndrome 1\n" +
//            "Jervell And Lange-Nielsen Syndrome 2,Long Qt Syndrome 5,Timothy Syndrome\n" +
//            "Familial Atrial Fibrillation Alport Syndrome - Intellectual Disability - Midface Hypoplasia - Elliptocytosis\n" +
//            "Atrial Fibrillation,Familial,4,Long Qt Syndrome 6,Kcne2-Related Familial Atrial Fibrillation\n" +
//            "Brugada Syndrome 6,Hyperkalemic Periodic Paralysis,Periodic Paralyses\n" +
//            "Melanomatosis,Long Qt Syndrome 2,Short Qt Syndrome 1\n" +
//            "Campylobacteriosis\n" +
//            "Bartter Disease,Bartter Syndrome,Type 2,Bartter Syndrome Antenatal Type 2\n" +
//            "Sesame Syndrome,Enlarged Vestibular Aqueduct,Digenic,Kcnj10-Related Pendred Syndrome\n" +
//            "Intermediate Dend Syndrome,Hyperinsulinemic Hypoglycemia,Permanent Neonatal Diabetes Mellitus\n" +
//            "Bartter Disease,Lens Subluxation Hypokalemic Periodic Paralysis\n" +
//            "Leber Congenital Amaurosis 16,Snowflake Vitreoretinal Degeneration,Vitreous Syneresis\n" +
//            "Body Dysmorphic Disorder,Pierre Robin Sequence Thyrotoxic Periodic Paralysis\n" +
//            "Thyrotoxic Periodic Paralysis 2,Thyrotoxic Periodic Paralysis,Hypokalemic Periodic Paralysis Show all 4\n" +
//            "Atrial Fibrillation,Familial,9,Short Qt Syndrome 3,Andersen-Tawil Syndrome\n" +
//            "Pancreas Adenocarcinoma Juvenile Myoclonic Epilepsy\n" +
//            "Long Qt Syndrome 13,Hyperaldosteronism,Familial Hyperaldosteronism\n" +
//            "Prinzmetals Variant Angina,Sudden Infant Death Syndrome,Cantu Syndrome Show all 4\n" +
//            "Idiopathic Generalized Epilepsy\n" +
//            "Dentin Sensitivity\n" +
//            "Migraine,With Or Without Aura 13,Migraine With Aura Migraine\n" +
//            "Pulmonary Hypertension,Primary,4,Central Sleep Apnea,Primary Pulmonary Hypertension\n" +
//            "Dentin Sensitivity\n" +
//            "Hemopericardium,Brachial Plexus Lesion,Developmental Coordination Disorder Show all 4\n" +
//            "Birk-Barel Syndrome,Fetal Alcohol Spectrum Disorder,Central Sleep Apnea\n" +
//            "Generalized Epilepsy And Paroxysmal Dyskinesia,Impotence Smith-Lemli-Opitz Syndrome\n" +
//            "Hypertension,Diastolic Sleep Apnea\n" +
//            "Idiopathic Generalized Epilepsy\n" +
//            "Schizophrenia\n" +
//            "Bipolar Disorder Schizophrenia\n" +
//            "Short Qt Syndrome 2,Long Qt Syndrome 1,Familial Atrial Fibrillation\n" +
//            "Wilms Tumor\n" +
//            "Beckwith-Wiedemann Syndrome,Hemihypertrophy,Beckwith-Wiedemann Syndrome Due To Imprinting Defect Of 11P15\n" +
//            "Epileptic Encephalopathy,Early Infantile,7,Benign Familial Neonatal Epilepsy,Kcnq2-Related Disorders\n" +
//            "Kcnq3-Related Benign Familial Neonatal Epilepsy,Seizures,Benign Neonatal,Type 2,Kcnq2-Related Disorders\n" +
//            "Dfna2 Nonsyndromic Hearing Loss,Deafness,Autosomal Dominant 2A Deafness,Autosomal Dominant 3B\n" +
//            "Autoimmune Polyendocrine Syndrome Type 1\n" +
//            "Chronic Pain\n" +
//            "Form Agnosia,Cortical Deafness,Epilepsy,Nocturnal Frontal Lobe,5\n" +
//            "Retinal Cone Dystrophy 3B,Retinal Cone Dystrophy 3 Cone Dystrophy 3\n" +
//            "Scalp Ear Nipple Syndrome\n" +
//            "Methylmalonic Acidemia\n" +
//            "Rectal Neoplasm Agoraphobia\n" +
//            "Progressive Myoclonic Epilepsy 3 With Or Without Intracellular Inclusions,Myoclonus Epilepsy,Progressive Myoclonus Epilepsy Show all 4\n" +
//            "Actinobacillosis Hydranencephaly\n" +
//            "Esophageal Squamous Cell Carcinoma\n" +
//            "Retinoblastoma\n" +
//            "Retinoblastoma\n" +
//            "X-Linked Syndromic Mental Retardation,Claes-Jensen Type Mental Retardation\n" +
//            "Y Chromosome Infertility\n" +
//            "Kabuki Syndrome 2,Kdm6A-Related Kabuki Syndrome,Kabuki Syndrome Show all 4\n" +
//            "Olecranon Bursitis,Hemangioma,Capillary Infantile,Bursitis\n" +
//            "Follicular Lymphoma\n" +
//            "Non-Small Cell Lung Carcinoma,Papillary Adenocarcinoma Diabetic Cataract\n" +
//            "Neuroacanthocytosis Chronic Granulomatous Disease\n" +
//            "Exposure Keratitis,Cloacogenic Carcinoma,Posterior Amorphous Corneal Dystrophy\n" +
//            "Smith Magenis Syndrome\n" +
//            "Klippel-Feil Syndrome 2,Autosomal Recessive\n" +
//            "Hydatidiform Mole,Recurrent,2,Gestational Trophoblastic Neoplasm,Hydatidiform Mole,Recurrent Show all 4\n" +
//            "Transvestism,Extratemporal Epilepsy Hypophosphatasia\n" +
//            "Fructosuria,Fructosuria,Essential Obstructive Jaundice\n" +
//            "Spinocerebellar Ataxia Type 17 Pheochromocytoma\n" +
//            "Hepatitis B\n" +
//            "Alcohol Dependence\n" +
//            "In Situ Carcinoma Breast Cancer\n" +
//            "Hepatitis C,Hepatitis C Virus Hepatitis\n" +
//            "Spastic Paraplegia 8,Hereditary Spastic Paraplegia,Dandy-Walker Like Malformation With Atrioventricular Septal Defect\n" +
//            "Spinocerebellar Ataxia,Autosomal Recessive 15 Lactose Intolerance\n" +
//            "Dyslexia 2,Dyslexia,Articulation Disorder\n" +
//            "Limited Scleroderma Dyslexia\n" +
//            "Mental Retardation,Autosomal Recessive 43,Phimosis Mental Retardation,Autosomal Recessive 2\n" +
//            "Celiac Disease Posterior Uveitis\n" +
//            "Goldberg-Shprintzen Megacolon Syndrome,Megacolon Pseudobulbar Palsy\n" +
//            "Monomelic Amyotrophy\n" +
//            "Oxyphilic Adenoma\n" +
//            "Artery Disease\n" +
//            "Chronic Recurrent Multifocal Osteomyelitis\n" +
//            "Pilocytic Astrocytoma,Astrocytoma Dysembryoplastic Neuroepithelial Tumor\n" +
//            "Mental Retardation,X-Linked 98 Kiaa2022-Related X-Linked Mental Retardation\n" +
//            "Microcephaly With Or Without Chorioretinopathy,Lymphedema,Or Mental Retardation,Autosomal Dominant Chorioretinopathy - Microcephaly,Autosomal Dominant Microcephaly\n" +
//            "Breast Cancer\n" +
//            "Congenital Fibrosis Of The Extraocular Muscles\n" +
//            "Asbestosis\n" +
//            "Spastic Paraplegia 30,Spastic Paraplegia 30,Autosomal Recessive,Hereditary Sensory And Autonomic Neuropathy Type Iic\n" +
//            "Charcot-Marie-Tooth Disease,Type 2A1,Neuroblastoma 1,Kif1B-Related Pheochromocytoma\n" +
//            "Benign Glioma,Spastic Ataxia 2,Autosomal Recessive Cutaneous Anthrax\n" +
//            "Charcot-Marie-Tooth Disease Type 4\n" +
//            "Congenital Fibrosis Of The Extraocular Muscles,Moebius Syndrome,Fibrosis Of Extraocular Muscles,Congenital,1\n" +
//            "Multiple Sclerosis Inflammatory Bowel Disease\n" +
//            "Spondyloepimetaphyseal Dysplasia With Joint Laxity,Type 2 Spondyloepimetaphyseal Dysplasia\n" +
//            "Congenital Dyserythropoietic Anemia Type 3\n" +
//            "Megacolon\n" +
//            "Cortical Dysplasia,Complex,With Other Brain Malformations 3 Cortical Dysplasia,Complex,With Other Brain Malformations\n" +
//            "Charcot-Marie-Tooth Disease Type 4\n" +
//            "Orofaciodigital Syndrome\n" +
//            "Benign Glioma\n" +
//            "Mental Retardation,X-Linked 100\n" +
//            "Spastic Paraplegia 10,Spastic Paraplegia 10,Autosomal Dominant,Autosomal Dominant Charcot-Marie-Tooth Disease Type 2 Due To Kif5A Mutation\n" +
//            "Blackwater Fever\n" +
//            "Cortical Dysplasia,Complex,With Other Brain Malformations 2 Cortical Dysplasia,Complex,With Other Brain Malformations\n" +
//            "Hydrolethalus Syndrome 2,Joubert Syndrome 12,Multiple Epiphyseal Dysplasia,Al-Gazali Type\n" +
//            "Large Granular Lymphocyte Leukemia,T-Cell Large Granular Lymphocyte Leukemia,Cutaneous T Cell Lymphoma\n" +
//            "Recurrent Respiratory Papillomatosis,Hematopoietic Stem Cell Transplantation,Type 1 Diabetes Mellitus\n" +
//            "T-Cell Large Granular Lymphocyte Leukemia,Large Granular Lymphocyte Leukemia,Cutaneous T Cell Lymphoma\n" +
//            "Recurrent Respiratory Papillomatosis,Hematopoietic Stem Cell Transplantation Leptospirosis\n" +
//            "Recurrent Respiratory Papillomatosis,Hematopoietic Stem Cell Transplantation,Spondyloarthropathy\n" +
//            "Hepatitis B Virus Infection,Ankylosing Spondylitis Hematopoietic Stem Cell Transplantation\n" +
//            "Guttate Psoriasis,Chronic Myeloid Leukemia,Non-Hodgkin Lymphoma\n" +
//            "Type 1 Diabetes Mellitus,Cytomegalovirus Infection,Non-Hodgkin Lymphoma\n" +
//            "Microscopic Polyangiitis,Hematopoietic Stem Cell Transplantation,Birdshot Chorioretinopathy\n" +
//            "Klippel-Feil Syndrome Birdshot Chorioretinopathy\n" +
//            "Type 1 Diabetes Mellitus,Non-Hodgkin Lymphoma,Chronic Myeloid Leukemia\n" +
//            "Aids,Delayed/rapid Progression To,Behcets Disease,Birdshot Chorioretinopathy Show all 4\n" +
//            "Hematopoietic Stem Cell Transplantation\n" +
//            "Rheumatic Disease,Aids,Delayed/rapid Progression To,Microscopic Polyangiitis\n" +
//            "Mental Retardation,Autosomal Dominant 6\n" +
//            "Hypogonadotropic Hypogonadism 13 With Or Without Anosmia,Gastric Cardia Carcinoma,Kiss1-Related Isolated Gonadotropin-Releasing Hormone Deficiency\n" +
//            "Hypogonadotropic Hypogonadism 8 With Or Without Anosmia,Central Precocious Puberty,Precocious Puberty,Central,1\n" +
//            "Sm-Ahnmd,Extragonadal Seminoma,Mast-Cell Leukemia4\n" +
//            "Familial Progressive Hyper- And Hypopigmentation,Hyperpigmentation,Familial Progressive,2,Mastocytosis\n" +
//            "Retinitis Pigmentosa 69 Retinitis Pigmentosa\n" +
//            "Tumoral Calcinosis,Hyperphosphatemic,Skin Atrophy,Arteriosclerosis\n" +
//            "Diarrhea\n" +
//            "Medulloblastoma\n" +
//            "Congenital Dyserythropoietic Anemia Type Iv,Hereditary Persistence Of Fetal Hemoglobin - Sickle Cell Disease,Hereditary Persistence Of Fetal Hemoglobin\n" +
//            "Pancreatic Cancer,Hemoglobinopathy,Denys-Drash Syndrome\n" +
//            "Maturity-Onset Diabetes Of The Young,Type 7,Maturity-Onset Diabetes Of The Young,Maturity-Onset Diabetes Of The Young,Type 1 Show all 4\n" +
//            "Esophageal Cancer,Malaria,Skin Squamous Cell Carcinoma\n" +
//            "Cerebral Aneurysms Essential Thrombocythemia\n" +
//            "Transient Global Amnesia,Prostate Cancer,Somatic,Gastric Cancer,Somatic Show all 4\n" +
//            "Endometrial Carcinoma Kabuki Syndrome\n" +
//            "Hepatocellular Carcinoma\n" +
//            "Hodgkins Lymphoma\n" +
//            "Spermatogenic Failure 11 Oligospermia\n" +
//            "Monkeypox\n" +
//            "Urethral Stricture Neurogenic Bladder\n" +
//            "Pseudohypoaldosteronism Type Iid,Pseudohypoaldosteronism,Type Iia,Metabolic Acidosis\n" +
//            "Mullerian Aplasia\n" +
//            "Nemaline Myopathy 8,Autosomal Recessive,Nemaline Myopathy 5,Amish Type,Myopathy Show all 4\n" +
//            "Nemaline Myopathy 9,Severe Congenital Nemaline Myopathy,Intermediate Nemaline Myopathy\n" +
//            "Retinitis Pigmentosa 42,Klhl7-Related Retinitis Pigmentosa,Retinitis Pigmentosa Show all 4\n" +
//            "Klhl9-Related Childhood-Onset Distal Myopathy Cutaneous Malignant Melanoma\n" +
//            "Vascular Dementia Abdominal Aortic Aneurysm\n" +
//            "Ovarian Cancer,Prostate Cancer Lung Squamous Cell Carcinoma\n" +
//            "Prostate Cancer\n" +
//            "Eczema Herpeticum\n" +
//            "Breast Cancer Ovarian Cancer\n" +
//            "Peripheral Vascular Disease,Bronchogenic Carcinoma,Prostate Cancer Show all 4\n" +
//            "Prostate Cancer\n" +
//            "Nodular Prostate,Urethral Stricture,Prostatitis\n" +
//            "Urethral Syndrome,Amelogenesis Imperfecta,Type Iia1,Amelogenesis Imperfecta,Hypomaturation Type,Iia1\n" +
//            "Prostate Cancer Ovarian Cancer\n" +
//            "Synucleinopathy,Ovarian Cancer,Spinal Cord Injury\n" +
//            "Atopic Dermatitis,Dermatitis,Netherton Syndrome Show all 4\n" +
//            "Ovarian Cancer,Seborrheic Keratosis,Spinal Cord Injury Show all 4\n" +
//            "Breast Cancer\n" +
//            "Prekallikrein Deficiency,Malignant Essential Hypertension,Fletcher Factor Deficiency\n" +
//            "Cowden Syndrome 4,Breast Cancer Cowden Syndrome 1\n" +
//            "Cytomegalovirus Infection\n" +
//            "Malaria\n" +
//            "Rheumatic Disease,Paroxysmal Nocturnal Hemoglobinuria Toxic Epidermal Necrolysis\n" +
//            "Monkeypox\n" +
//            "Nasopharyngitis\n" +
//            "T-Cell Large Granular Lymphocyte Leukemia\n" +
//            "Alveolar Echinococcosis,T-Cell Large Granular Lymphocyte Leukemia,Large Granular Lymphocyte Leukemia\n" +
//            "Pneumococcal Meningitis,Transient Cerebral Ischemia Huntingtons Disease\n" +
//            "Mckusick-Kaufman Syndrome,Bardet-Biedl Syndrome 6 Hypogonadotropic Hypogonadism 1 With Or Without Anosmia\n" +
//            "Wiedemann-Steiner Syndrome,Acute Biphenotypic Leukemia,Bilineal Acute Leukemia\n" +
//            "Leukemia\n" +
//            "Leukemia\n" +
//            "Kabuki Syndrome 1,Kabuki Syndrome,Kmt2D-Related Kabuki Syndrome Show all 4\n" +
//            "Leukemia\n" +
//            "High Molecular Weight Kininogen Deficiency,Brain Edema,Plasminogen Activator Inhibitor Type 1 Deficiency\n" +
//            "Histrionic Personality Disorder,Dependent Personality Disorder Osteitis Fibrosa\n" +
//            "Kondoh Syndrome\n" +
//            "Borna Disease\n" +
//            "Opiate Dependence\n" +
//            "Partial Corpus Callosum Agenesis-Cerebellar Vermis Hypoplasia With Posterior Fossa Cysts Syndrome\n" +
//            "Campomelic Dysplasia\n" +
//            "Mental Retardation,Autosomal Recessive 41\n" +
//            "Noonan Syndrome 3,Liver Angiosarcoma,Cronkhite-Canada Syndrome9\n" +
//            "Diffuse Mesangial Sclerosis,Wilms Tumor Transient Neonatal Diabetes Mellitus\n" +
//            "Hepatitis\n" +
//            "Osteoporosis-Pseudoglioma Syndrome Sost-Related Sclerosing Bone Dysplasia\n" +
//            "Dental Pulp Necrosis\n" +
//            "Hyperkeratotic Cutaneous Capillary-Venous Malformations Associated With Cerebral Capillary Malformations,Cavernous Malformations Of Cns And Retina,Intracranial Cavernous Angioma\n" +
//            "Hiv-1\n" +
//            "Congenital Ichthyosiform Erythroderma,Syringoma,Nonepidermolytic Palmoplantar Keratoderma\n" +
//            "Ichthyosis With Confetti,Inflammatory Linear Verrucous Epidermal Nevus,Epidermolytic Acanthoma\n" +
//            "Meesmann Corneal Dystrophy,Recurrent Corneal Erosion,Corneal Disease\n" +
//            "Frontal Sinus Inverted Papilloma,Inverted Papilloma,Spindle Cell Sarcoma\n" +
//            "Dermatopathia Pigmentosa Reticularis,Thyroid Hurthle Cell Adenoma,Epidermolysis Bullosa Simplex,Dowling-Meara Type\n" +
//            "Kindler Syndrome,Syringocystadenoma Papilliferum,Spiradenoma Show all 4\n" +
//            "Keratoderma,Pachyonychia Congenita,Palmoplantar Keratoderma,Nonepidermolytic,Focal\n" +
//            "Pachyonychia Congenita 2,Pili Torti,Steatocystoma Multiplex\n" +
//            "Gallbladder Sarcoma,Proliferating Trichilemmal Cyst,Cirrhosis,Noncryptogenic\n" +
//            "Alzheimers Disease\n" +
//            "Acute Interstitial Pneumonia,Lung Cancer,Papillary Thyroid Carcinoma\n" +
//            "Ichthyosis Bullosa Of Siemens,Epidermolytic Hyperkeratosis,Hereditary Mucosal Leukokeratosis\n" +
//            "Seminal Vesicle Adenocarcinoma,Jejunal Adenocarcinoma,Colorectal Cancer\n" +
//            "Hypohidrosis\n" +
//            "Hymenolepiasis,Limbal Stem Cell Deficiency,Burns\n" +
//            "Skin Pilomatrix Carcinoma,Nodular Basal Cell Carcinoma Basal Cell Carcinoma\n" +
//            "Esophageal Squamous Cell Carcinoma\n" +
//            "Nodular Basal Cell Carcinoma,Ectropion Basal Cell Carcinoma\n" +
//            "Hereditary Mucosal Leukokeratosis,Leukoplakia,White Sponge Nevus 1\n" +
//            "Epidermolysis Bullosa Simplex With Migratory Circinate Erythema,Epidermylysis Bullosa Simplex-Mcr,Epidermolysis Bullosa Simplex-Mp\n" +
//            "Pachyonychia Congenita 3,Fissured Tongue,Krt6A-Related Pachyonychia Congenita\n" +
//            "Pachyonychia Congenita 4,Median Rhomboid Glossitis,Glossitis\n" +
//            "Focal Palmoplantar Keratoderma,Palmoplantar Keratoderma,Nonepidermolytic,Focal Or Diffuse Palmoplantar Keratoderma,Nonepidermolytic,Focal\n" +
//            "Mixed Cell Type Cancer,Cell Type Cancer,Renal Adenoma4\n" +
//            "Hypotrichosis 13 Woolly Hair,Autosomal Dominant\n" +
//            "Pachyonychia Congenita\n" +
//            "Hypotrichosis 3,Woolly Hair,Autosomal Dominant,Ectodermal Dysplasia 7,Hair/nail Type\n" +
//            "Loose Anagen Hair Syndrome Pseudofolliculitis Barbae\n" +
//            "Idiopathic Corneal Edema,Keratinizing Squamous Cell Carcinoma,Corneal Edema\n" +
//            "Cervix Uteri Carcinoma In Situ\n" +
//            "Emphysematous Cholecystitis,Monilethrix,Pilomatrixoma\n" +
//            "Petroclival Meningioma,Parotid Gland Cancer,Monilethrix\n" +
//            "Petroclival Meningioma Meningioma\n" +
//            "Ectodermal Dysplasia 4,Hair/nail Type\n" +
//            "Hair Disease,Monilethrix,X-Linked Ichthyosis\n" +
//            "Palmoplantar Keratoderma,Epidermolytic,Acral Lentiginous Melanoma,Opisthorchiasis\n" +
//            "Choroid Cancer\n" +
//            "Choroid Cancer\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "C1 Inhibitor Deficiency\n" +
//            "Nonepidermolytic Palmoplantar Keratoderma,Monilethrix,Hereditary Mucosal Leukokeratosis Show all 4\n" +
//            "Pachyonychia Congenita\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Breast And Colorectal Cancer Colorectal Cancer\n" +
//            "Epidermolytic Hyperkeratosis\n" +
//            "Mixed Gonadal Dysgenesis\n" +
//            "Intrahepatic Cholangiocarcinoma\n" +
//            "Scarlet Fever,Bronchopneumonia Pharyngitis\n" +
//            "Kearns-Sayre Syndrome\n" +
//            "Keratoconus 2\n" +
//            "Keratoconus 3\n" +
//            "Keratoconus 4 Keratoconus\n" +
//            "Keratoconus 5\n" +
//            "Keratoconus 6\n" +
//            "Keratoconus 7 Keratoconus\n" +
//            "Keratoconus 8\n" +
//            "Ostertagiasis\n" +
//            "Klippel-Trenaunay Syndrome Weber Syndrome\n" +
//            "Keratolytic Winter Erythema Skin Disease\n" +
//            "Hydroxykynureninuria,Encephalopathy Due To Hydroxykynureninuria,Transient Cerebral Ischemia Show all 4\n" +
//            "Kyphoscoliosis 1\n" +
//            "Hydrocephalus With Congenital Idiopathic Intestinal Pseudoobstruction,Spastic Paraplegia 1,Hydrocephalus With Hirschsprung Disease\n" +
//            "Tetralogy Of Fallot\n" +
//            "L-2-Hydroxyglutaric Aciduria,2-Hydroxyglutaric Aciduria D-2-Hydroxyglutaric Aciduria\n" +
//            "Intestinal Volvulus Gastric Dilatation\n" +
//            "Blepharitis\n" +
//            "Bacterial Conjunctivitis,Obesity,Subvalvular Aortic Stenosis\n" +
//            "Linear Iga Disease,Epidermolysis Bullosa Acquisita,Bullous Pemphigoid Show all 4\n" +
//            "Neutropenia,Alloimmune Neonatal\n" +
//            "Shipyard Eye\n" +
//            "Chronic Active Epstein-Barr Virus Infection Cytomegalovirus Infection\n" +
//            "Skin Papilloma,Atopy,Mammary Pagets Disease Show all 4\n" +
//            "Acute Lymphoblastic Leukemia Lymphoblastic Leukemia\n" +
//            "Poretti-Boltshauser Syndrome\n" +
//            "Lama2-Related Muscular Dystrophy,Congenital Muscular Dystrophy Type 1A,Muscular Dystrophy,Congenital,Due To Partial Lama2 Deficiency\n" +
//            "Laryngoonychocutaneous Syndrome,Lama3-Related Junctional Epidermolysis Bullosa,Cardiomyopathy,Dilated,1Jj\n" +
//            "Cardiomyopathy,Dilated,1Ii Cardiomyopathy,Dilated,1Jj\n" +
//            "Pontocerebellar Hypoplasia\n" +
//            "Lissencephaly 5,Supravalvular Aortic Stenosis,Secretory Meningioma\n" +
//            "Pierson Syndrome,Nephrotic Syndrome,Type 5,With Or Without Ocular Abnormalities,Diffuse Mesangial Sclerosis\n" +
//            "Maternal Uniparental Disomy Of Chromosome 1,Lamb3-Related Junctional Epidermolysis Bullosa,Junctional Epidermolysis Bullosa\n" +
//            "Junctional Epidermolysis Bullosa Inversa,Junctional Epidermolysis Bullosa,Diffuse Mesangial Sclerosis Show all 4\n" +
//            "Junctional Epidermolysis Bullosa Inversa,Cryptogenic Organizing Pneumonia,Junctional Epidermolysis Bullosa\n" +
//            "Cortical Malformations,Occipital Pachygyria\n" +
//            "Salla Disease Chediak-Higashi Syndrome\n" +
//            "Danon Disease,Vacuolar Myopathy,Salla Disease Show all 4\n" +
//            "Immunodeficiency Due To Defect In Mapbp-Interacting Protein\n" +
//            "Hepatitis B,Hepatitis,Non-Small Cell Lung Carcinoma Show all 4\n" +
//            "Hepatitis B Hepatitis\n" +
//            "Laryngeal Adductor Paralysis,Acute Myeloid Leukemia Acute T Cell Leukemia\n" +
//            "Endometrial Carcinoma,Trichomoniasis Vulvovaginal Candidiasis\n" +
//            "Pigmented Villonodular Synovitis Villonodular Synovitis\n" +
//            "Muscular Dystrophy-Dystroglycanopathy ,Type A,6,Large-Related Muscle Diseases,Muscular Dystrophy-Dystroglycanopathy ,Type B,6\n" +
//            "Alazami Syndrome\n" +
//            "Conjugate Gaze Palsy,Infantile Liver Failure Syndrome 1 Patellofemoral Pain Syndrome\n" +
//            "Perrault Syndrome 4,Nasopharyngitis Perrault Syndrome\n" +
//            "Spinal Muscular Atrophy With Respiratory Distress Type 2\n" +
//            "Colorectal Cancer,B-Cell Lymphomas Breast Cancer\n" +
//            "Williams-Beuren Syndrome\n" +
//            "Childhood Kidney Neoplasm,Tetraploidy Mesoblastic Nephroma\n" +
//            "Intracranial Abscess\n" +
//            "Blepharochalasis,Chondromalacia,Lagophthalmos\n" +
//            "Bacteremia,Spontaneous Pneumothorax,Infective Endocarditis\n" +
//            "Paranoid Personality Disorder,Viral Hemorrhagic Fever,Pelger-Huet Anomaly\n" +
//            "Split Foot,Burns,Split Hand\n" +
//            "Alstrom Syndrome\n" +
//            "Meckel Syndrome 4,Leber Congenital Amaurosis 10,Joubert Syndrome With Oculorenal Anomalies\n" +
//            "Leber Congenital Amaurosis 5,Severe Early-Childhood-Onset Retinal Dystrophy,Lca5-Related Leber Congenital Amaurosis\n" +
//            "Leber Congenital Amaurosis 5\n" +
//            "Leber Congenital Amaurosis 9\n" +
//            "Complete Lcat Deficiency,Fish-Eye Disease,Norum Disease\n" +
//            "Psoriatic Arthritis\n" +
//            "Irritant Dermatitis\n" +
//            "Irritant Dermatitis Atopic Dermatitis\n" +
//            "Allergic Contact Dermatitis,Contact Dermatitis Psoriatic Arthritis\n" +
//            "Allergic Contact Dermatitis,Contact Dermatitis Psoriatic Arthritis\n" +
//            "Irritant Dermatitis\n" +
//            "Immunodeficiency 22\n" +
//            "Barth Syndrome\n" +
//            "Tracheitis Multiple Chemical Sensitivity\n" +
//            "Pre-Eclampsia,Stromal Keratitis,Pulmonary Large Cell Neuroendocrine Carcinoma\n" +
//            "Insulin Resistance,Pancreatic Cancer Renovascular Hypertension\n" +
//            "Tick Infestation\n" +
//            "Liver Cancer\n" +
//            "Croup\n" +
//            "Chromosome 13Q Deletion\n" +
//            "Blue Cone Monochromacy\n" +
//            "Thalassemia,Hispanic Gamma-Delta-Beta\n" +
//            "Aagenaes Syndrome\n" +
//            "Congenital Lactase Deficiency,Lactose Intolerance,Intestinal Disease Show all 4\n" +
//            "Nail-Patella Syndrome\n" +
//            "Cardiomyopathy,Dilated 1C,Myopathy,Myofibrillar,4,Coronary Aneurysm\n" +
//            "Lactate Dehydrogenase A Deficiency,Hereditary Leiomyomatosis And Renal Cell Cancer Fanconi Bickel Syndrome\n" +
//            "Lactate Dehydrogenase B Deficiency\n" +
//            "Ldl Cholesterol Level Qtl2,Familial Hypercholesterolemia,Hyperlipoproteinemia Type 2\n" +
//            "Hypercholesterolemia,Familial,Autosomal Recessive,Familial Hypercholesterolemia Hypercholesterolemia\n" +
//            "Breast Cancer\n" +
//            "Coccidiosis\n" +
//            "Corneal Dystrophy,Lisch Epithelial\n" +
//            "Multiple Myeloma,Myeloma,Aortic Valve Disease Show all 4\n" +
//            "Rheumatoid Arthritis\n" +
//            "Sebaceous Tumors,Somatic,Prostate Cancer,Odontoma\n" +
//            "Ivemark Syndrome\n" +
//            "Left-Right Axis Malformations,Ivemark Syndrome,Lefty2-Related Visceral Heterotaxy\n" +
//            "Esophageal Squamous Cell Carcinoma Epidermolytic Hyperkeratosis\n" +
//            "Familial Cutaneous Collagenoma,Melorheostosis With Osteopoikilosis,Melorheostosis\n" +
//            "Congenital Leptin Deficiency,Diencephalic Syndrome,Leptin Deficiency\n" +
//            "Type 2 Diabetes Mellitus,Marasmus,Leptin Deficiency\n" +
//            "Leptin Receptor Deficiency,Obesity,Lipoblastoma\n" +
//            "Osteogenesis Imperfecta Type 8,Lepre1-Related Osteogenesis Imperfecta,Osteogenesis Imperfecta,Type Ii\n" +
//            "Myopia,High,With Cataract And Vitreoretinal Degeneration,Vitreoretinal Degeneration,Myopia\n" +
//            "Cystitis\n" +
//            "Obesity Acute Promyelocytic Leukemia\n" +
//            "Wolf-Hirschhorn Syndrome\n" +
//            "Cervical Cancer\n" +
//            "Spondylocostal Dysostosis 3,Spondylocostal Dysostosis,Lfng-Related Spondylocostal Dysostosis,Autosomal Recessive\n" +
//            "Li-Fraumeni Syndrome 3\n" +
//            "Osteosarcoma,Chondroblastic Osteosarcoma,Benign Metastasizing Leiomyoma Show all 4\n" +
//            "Myocardial Infarction\n" +
//            "Adult Astrocytic Tumour,Follicular Adenoma,Polymorphous Low-Grade Adenocarcinoma\n" +
//            "Ostertagiasis,Henoch-Schoenlein Purpura Strongyloidiasis\n" +
//            "Colorectal Cancer,Colon Adenocarcinoma Me";

    public static String[] getDisorders(){
        return disprders.split("\n");
    }
}
