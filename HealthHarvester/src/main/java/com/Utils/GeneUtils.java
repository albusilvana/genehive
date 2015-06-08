package com.Utils;

/**
 * Created by silvana.albert on 5/18/15.
 */
public class GeneUtils {
    private static String geneName =
            "HLA complex group 26 non-protein coding pseudogene\n" +
            "alpha-1-B glycoprotein\n" +
            "APOBEC1 complementation factor\n" +
            "alpha-2-macroglobulin\n" +
            "alpha-2-macroglobulin-like 1\n" +
            "alpha 1,4-galactosyltransferase\n" +
            "Alopecia areata 1\n" +
            "Alopecia areata 2\n" +
            "aortic aneurysm, familial abdominal 1\n" +
            "Aortic aneurysm, familial abdominal 2\n" +
            "Aneurysm, familial abdominal 3\n" +
            "Aortic aneurysm, familial abdominal, 4\n" +
            "achalasia, adrenocortical insufficiency, alacrimia\n" +
            "acetoacetyl-CoA synthetase\n" +
            "arylacetamide deacetylase\n" +
            "aminoadipate aminotransferase\n" +
            "alpha- and gamma-adaptin binding protein\n" +
            "angio-associated, migratory cell protein\n" +
            "aralkylamine N-acetyltransferase\n" +
            "alanyl-tRNA synthetase\n" +
            "alanyl-tRNA synthetase 2, mitochondrial\n" +
            "aminoadipate-semialdehyde synthase\n" +
            "Allergic/atopic asthma related QTL 1\n" +
            "Allergic/atopic asthma related QTL 10\n" +
            "Allergic/atopic asthma related QTL 11\n" +
            "Allergic/atopic asthma related QTL 12\n" +
            "Allergic/atopic asthma related QTL 13\n" +
            "Allergic/atopic asthma related QTL 14\n" +
            "Allergic/atopic asthma related QTL 15\n" +
            "Allergic/atopic asthma related QTL 16\n" +
            "Allergic/atopic asthma related QTL 17\n" +
            "Allergic/atopic asthma related QTL 18\n" +
            "Allergic/atopic asthma related QTL 2\n" +
            "Allergic/atopic asthma related QTL 20\n" +
            "Allergic/atopic asthma related QTL 21\n" +
            "Allergic/atopic asthma related QTL 22\n" +
            "Allergic/atopic asthma related QTL 23\n" +
            "Allergic/atopic asthma related QTL 24\n" +
            "Allergic/atopic asthma related QTL 25\n" +
            "Allergic/atopic asthma related QTL 25\n" +
            "Allergic/atopic asthma related QTL 27\n" +
            "Allergic/Atopic asthma related QTL 28\n" +
            "Allergic/Atopic asthma related QTL 29\n" +
            "Allergic/atopic asthma related QTL 30\n" +
            "Allergic/Atopic asthma related QTL 32\n" +
            "Allergic/atopic asthma related QTL 33\n" +
            "Allergic/atopic asthma related QTL 34\n" +
            "Allergic/atopic asthma related QTL 35\n" +
            "Allergic/atopic asthma related QTL 36\n" +
            "Allergic/atopic asthma related QTL 37\n" +
            "Allergic/atopic asthma related QTL 38\n" +
            "Allergic/atopic asthma related QTL 39\n" +
            "Allergic/atopic asthma related QTL 4\n" +
            "Allergic/atopic asthma related QTL 40\n" +
            "Allergic/Atopic asthma related QTL 41\n" +
            "Allergic/atopic asthma related QTL 42\n" +
            "Allergic/atopic asthma related QTL 43\n" +
            "Allergic/atopic asthma related QTL 44\n" +
            "Allergic/atopic asthma related QTL 47\n" +
            "Allergic/atopic asthma related QTL 48\n" +
            "Allergic/atopic asthma related QTL 49\n" +
            "Allergic/atopic asthma related QTL 5\n" +
            "Allergic/atopic asthma related QTL 50\n" +
            "Allergic/atopic asthma related QTL 51\n" +
            "Allergic/atopic asthma related QTL 52\n" +
            "Allergic/atopic asthma related QTL 53\n" +
            "Allergic/atopic asthma related QTL 54\n" +
            "Allergic/atopic asthma related QTL 5\n" +
            "Allergic/Atopic asthma related QTL 56\n" +
            "Allergic/atopic asthma related QTL 6\n" +
            "Allergic/atopic asthma related QTL 7\n" +
            "Allergic/atopic asthma related QTL 8\n" +
            "Allergic/atopic asthma related QTL 9\n" +
            "Aortic aneurysm, familial thoracic 1\n" +
            "Aortic aneurysm, familial thoracic 2\n" +
            "apoptosis-associated tyrosine kinase\n" +
            "adeno-associated virus integration site 1\n" +
            "4-aminobutyrate aminotransferase\n" +
            "ATP-binding cassette, sub-family A ABC1, member 1\n" +
            "ATP-binding cassette, sub-family A ABC1, member 12\n" +
            "ATP-binding cassette, sub-family A ABC1, member 2\n" +
            "ATP-binding cassette, sub-family A ABC1, member 3\n" +
            "ATP-binding cassette, sub-family A ABC1, member 4\n" +
            "ATP-binding cassette, sub-family A ABC1, member 5\n" +
            "ATP-binding cassette, sub-family B MDR/TAP, member 1\n" +
            "ATP-binding cassette, sub-family B MDR/TAP, member 11\n" +
            "ATP-binding cassette, sub-family B MDR/TAP, member 4\n" +
            "ATP-binding cassette, sub-family B MDR/TAP, member 6\n" +
            "ATP-binding cassette, sub-family B MDR/TAP, member 7\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 1\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 10\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 11\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 12\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 2\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 3\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 4\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 5\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 6\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 8\n" +
            "ATP-binding cassette, sub-family C CFTR/MRP, member 9\n" +
            "ATP-binding cassette, sub-family D ALD, member 1\n" +
            "ATP-binding cassette, sub-family D ALD, member 2\n" +
            "ATP-binding cassette, sub-family D ALD, member 3\n" +
            "ATP-binding cassette, sub-family D ALD, member 4\n" +
            "ATP-binding cassette, sub-family F GCN20, member 2\n" +
            "ATP-binding cassette, sub-family G WHITE, member 1\n" +
            "ATP-binding cassette, sub-family G WHITE, member 2\n" +
            "ATP-binding cassette, sub-family G WHITE, member 5\n" +
            "ATP-binding cassette, sub-family G WHITE, member 8\n" +
            "abhydrolase domain containing 11\n" +
            "abhydrolase domain containing 12\n" +
            "abhydrolase domain containing 5\n" +
            "abl-interactor 1\n" +
            "c-abl oncogene 1, non-receptor tyrosine kinase\n" +
            "c-abl oncogene 2, non-receptor tyrosine kinase\n" +
            "ABO blood group transferase A, alpha 1-3-N-acetylgalactosaminyltransferase; transferase B, alpha 1-3-galactosyltransferase\n" +
            "active BCR-related\n" +
            "actin-binding Rho activating protein\n" +
            "activator of basal transcription 1\n" +
            "uncharacterized LOC101927269\n" +
            "uncharacterized LOC728730\n" +
            "uncharacterized LOC100129434\n" +
            "uncharacterized LOC285626\n" +
            "uncharacterized LOC349160\n" +
            "uncharacterized LOC101927027\n" +
            "uncharacterized LOC101927630\n" +
            "uncharacterized LOC100506725\n" +
            "uncharacterized LOC102659288\n" +
            "uncharacterized LOC151121\n" +
            "uncharacterized LOC285696\n" +
            "uncharacterized LOC654841\n" +
            "acetyl-CoA acyltransferase 1\n" +
            "acetyl-CoA acyltransferase 2\n" +
            "acetyl-CoA carboxylase alpha\n" +
            "acetyl-CoA carboxylase beta\n" +
            "acyl-CoA dehydrogenase family, member 11\n" +
            "acyl-CoA dehydrogenase family, member 8\n" +
            "acyl-CoA dehydrogenase family, member 9\n" +
            "acyl-CoA dehydrogenase, long chain\n" +
            "acyl-CoA dehydrogenase, C-4 to C-12 straight chain\n" +
            "acyl-CoA dehydrogenase, C-2 to C-3 short chain\n" +
            "acyl-CoA dehydrogenase, short/branched chain\n" +
            "acyl-CoA dehydrogenase, very long chain\n" +
            "aggrecan\n" +
            "acetyl-CoA acetyltransferase 1\n" +
            "acetyl-CoA acetyltransferase 2\n" +
            "acyl-CoA binding domain containing 5\n" +
            "adrenocortical dysplasia homolog mouse\n" +
            "angiotensin I converting enzyme\n" +
            "angiotensin I converting enzyme 2\n" +
            "alkaline ceramidase 1\n" +
            "alkaline ceramidase 2\n" +
            "alkaline ceramidase 3\n" +
            "Asymmetric crying facies Cayler cardiofacial syndrome\n" +
            "acetylcholinesterase Yt blood group\n" +
            "apoptotic chromatin condensation inducer 1\n" +
            "atypical chemokine receptor 3\n" +
            "atypical chemokine receptor 4\n" +
            "acrocallosal syndrome\n" +
            "aconitase 1, soluble\n" +
            "aconitase 2, mitochondrial\n" +
            "acyl-CoA thioesterase 11\n" +
            "acyl-CoA thioesterase 13\n" +
            "acyl-CoA thioesterase 7\n" +
            "acyl-CoA oxidase 1, palmitoyl\n" +
            "acyl-CoA oxidase 3, pristanoyl\n" +
            "acid phosphatase 1, soluble\n" +
            "acid phosphatase 2, lysosomal\n" +
            "acid phosphatase 5, tartrate resistant\n" +
            "acid phosphatase 6, lysophosphatidic\n" +
            "acid phosphatase, prostate\n" +
            "acid phosphatase, testicular\n" +
            "acrosin\n" +
            "acrosin binding protein\n" +
            "acidic repeat containing\n" +
            "Acropectoral syndrome\n" +
            "Acropectorovertebral dysplasia F syndrome\n" +
            "acrosomal vesicle protein 1\n" +
            "acyl-CoA synthetase family member 3\n" +
            "acyl-CoA synthetase long-chain family member 3\n" +
            "acyl-CoA synthetase long-chain family member 4\n" +
            "acyl-CoA synthetase long-chain family member 5\n" +
            "acyl-CoA synthetase long-chain family member 6\n" +
            "acyl-CoA synthetase medium-chain family member 3\n" +
            "acyl-CoA synthetase short-chain family member 3\n" +
            "actin-like protein ACT gene\n" +
            "actin, alpha 1, skeletal muscle\n" +
            "actin, alpha 2, smooth muscle, aorta\n" +
            "actin, beta\n" +
            "actin, alpha, cardiac muscle 1\n" +
            "actin, gamma 1\n" +
            "actin, gamma 2, smooth muscle, enteric\n" +
            "actin-like 7A\n" +
            "actin-like 7B\n" +
            "actin-like 9\n" +
            "actinin, alpha 1\n" +
            "actinin, alpha 2\n" +
            "actinin, alpha 3 gene/pseudogene\n" +
            "actinin, alpha 4\n" +
            "ARP2 actin-related protein 2 homolog yeast\n" +
            "ACTR3B pseudogene 6\n" +
            "ARP3 actin-related protein 3 homolog C yeast\n" +
            "activin A receptor, type I\n" +
            "activin A receptor, type IB\n" +
            "activin A receptor, type IC\n" +
            "activin A receptor, type IIA\n" +
            "activin A receptor, type IIB\n" +
            "activin A receptor type II-like 1\n" +
            "aminoacylase 1\n" +
            "aspartoacylase aminocyclase 3\n" +
            "Alzheimer disease-10\n" +
            "Alzheimer disease-11\n" +
            "Alzheimer disease 12\n" +
            "Alzheimer disease-13\n" +
            "Alzheimer disease 14\n" +
            "Alzheimer disease-15\n" +
            "Alzheimer disease 16\n" +
            "Alzheimer disease 17\n" +
            "Alzheimer disease 5\n" +
            "Alzheimer disease 6\n" +
            "Alzheimer disease 7\n" +
            "Alzheimer disease 8\n" +
            "Alzheimer disease 9\n" +
            "adenosine deaminase\n" +
            "adenosine deaminase-like\n" +
            "ADAM metallopeptidase domain 10\n" +
            "ADAM metallopeptidase domain 11\n" +
            "ADAM metallopeptidase domain 17\n" +
            "ADAM metallopeptidase domain 21 pseudogene 1\n" +
            "ADAM metallopeptidase domain 22\n" +
            "ADAM metallopeptidase domain 33\n" +
            "ADAM metallopeptidase domain 3A pseudogene\n" +
            "ADAM metallopeptidase domain 7\n" +
            "ADAM metallopeptidase domain 8\n" +
            "ADAM metallopeptidase domain 9\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 1\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 10\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 13\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 17\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 18\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 2\n" +
            "ADAM metallopeptidase with thrombospondin type 1 motif, 20\n" +
            "ADAMTS-like 1\n" +
            "ADAMTS-like 2\n" +
            "ADAMTS-like 3\n" +
            "ADAMTS-like 4\n" +
            "ArfGAP with dual PH domains 2\n" +
            "adenosine deaminase, RNA-specific\n" +
            "adenosine deaminase, tRNA-specific 3\n" +
            "aarF domain containing kinase 2\n" +
            "aarF domain containing kinase 3\n" +
            "aarF domain containing kinase 4\n" +
            "adenylate cyclase 1 brain\n" +
            "adenylate cyclase 10 soluble\n" +
            "adenylate cyclase 2 brain\n" +
            "adenylate cyclase 3\n" +
            "adenylate cyclase 4\n" +
            "adenylate cyclase 5\n" +
            "adenylate cyclase 6\n" +
            "adenylate cyclase 7\n" +
            "adenylate cyclase 8 brain\n" +
            "adenylate cyclase 9\n" +
            "adenylate cyclase activating polypeptide 1 pituitary\n" +
            "adenylate cyclase activating polypeptide 1 pituitary receptor type I\n" +
            "adducin 1 alpha\n" +
            "adducin 2 beta\n" +
            "adducin 3 gamma\n" +
            "albinism-deafness syndrome\n" +
            "alcohol dehydrogenase 1A class I, alpha polypeptide\n" +
            "alcohol dehydrogenase 1B class I, beta polypeptide\n" +
            "alcohol dehydrogenase 1C class I, gamma polypeptide\n" +
            "alcohol dehydrogenase 4 class II, pi polypeptide\n" +
            "alcohol dehydrogenase 5 class III, chi polypeptide\n" +
            "alcohol dehydrogenase 5 class III, chi polypeptide, pseudogene 4\n" +
            "alcohol dehydrogenase 6 class V\n" +
            "alcohol dehydrogenase 7 class IV, mu or sigma polypeptide\n" +
            "Attention deficit-hyperactivity disorder, susceptibility to, 1\n" +
            "Attention deficit-hyperactivity disorder, susceptibility to, 2\n" +
            "Attention deficit-hyperactivity disorder, susceptibility to, 2\n" +
            "Attention deficit-hyperactivity disorder, susceptibility to, 4\n" +
            "adiponectin, C1Q and collagen domain containing\n" +
            "adiponectin receptor 1\n" +
            "adiponectin receptor 2\n" +
            "Circulating adiponectin QTL on chromosome 5\n" +
            "Circulating adiponectin QTL on chromosome 14\n" +
            "Adiponectin, serum level of, QTL4\n" +
            "Adiponectin, serum level of, QTL5\n" +
            "adipogenesis regulatory factor\n" +
            "adenosine kinase\n" +
            "adrenomedullin\n" +
            "activity-dependent neuroprotector homeobox\n" +
            "adenosine A1 receptor\n" +
            "adenosine A2a receptor\n" +
            "adenosine A2b receptor\n" +
            "adenosine A3 receptor\n" +
            "ADP-dependent glucokinase\n" +
            "ADP-ribosylarginine hydrolase\n" +
            "adrenoceptor alpha 1A\n" +
            "adrenoceptor alpha 1B\n" +
            "adrenoceptor alpha 1D\n" +
            "adrenoceptor alpha 2A\n" +
            "adrenoceptor alpha 2B\n" +
            "adrenoceptor alpha 2C\n" +
            "adrenoceptor beta 1\n" +
            "adrenoceptor beta 2, surface\n" +
            "adrenoceptor beta 3\n" +
            "adrenergic, beta, receptor kinase 2\n" +
            "adenylosuccinate lyase\n" +
            "adenylosuccinate synthase\n" +
            "AE binding protein 1\n" +
            "amino-terminal enhancer of split\n" +
            "ankyloblepharon filiforme adnatum\n" +
            "Alopecia, androgenetic\n" +
            "actin filament associated protein 1-like 1\n" +
            "acrofacial dysostosis 1, Nager type\n" +
            "AF4/FMR2 family, member 1\n" +
            "AF4/FMR2 family, member 2\n" +
            "AF4/FMR2 family, member 3\n" +
            "AF4/FMR2 family, member 4\n" +
            "AFG3-like AAA ATPase 2\n" +
            "afamin\n" +
            "alpha-fetoprotein\n" +
            "aspartylglucosaminidase\n" +
            "Alopecia, androgenetic, 2\n" +
            "Alopecia, androgenetic, 3\n" +
            "ArfGAP with GTPase domain, ankyrin repeat and PH domain 2\n" +
            "ATP/GTP binding protein-like 1\n" +
            "advanced glycosylation end product-specific receptor\n" +
            "ArfGAP with FG repeats 1\n" +
            "ArfGAP with FG repeats 2\n" +
            "angiogenic factor with G patch and FHA domains 1\n" +
            "acylglycerol kinase\n" +
            "amylo-alpha-1, 6-glucosidase, 4-alpha-glucanotransferase\n" +
            "agammaglobulinemia, X-linked 2 with growth hormone deficiency\n" +
            "1-acylglycerol-3-phosphate O-acyltransferase 2\n" +
            "1-acylglycerol-3-phosphate O-acyltransferase 9\n" +
            "alkylglycerone phosphate synthase\n" +
            "anterior gradient 3\n" +
            "agrin\n" +
            "agouti related protein homolog mouse\n" +
            "Angio serpiginosum\n" +
            "angiotensinogen serpin peptidase inhibitor, clade A, member 8\n" +
            "angiotensin II receptor, type 1\n" +
            "angiotensin II receptor, type 2\n" +
            "alanine-glyoxylate aminotransferase\n" +
            "alanine--glyoxylate aminotransferase 2\n" +
            "adenosylhomocysteinase\n" +
            "AT hook, DNA binding motif, containing 1\n" +
            "Abelson helper integration site 1\n" +
            "AHNAK nucleoprotein 2\n" +
            "aryl hydrocarbon receptor\n" +
            "AHA1, activator of heat shock 90kDa protein ATPase homolog 1 yeast\n" +
            "alpha-2-HS-glycoprotein\n" +
            "alpha hemoglobin stabilizing protein\n" +
            "Aicardi syndrome\n" +
            "activation-induced cytidine deaminase\n" +
            "allograft inflammatory factor 1\n" +
            "apoptosis-inducing factor, mitochondrion-associated, 1\n" +
            "apoptosis-inducing factor, mitochondrion-associated, 2\n" +
            "androgen-induced 1\n" +
            "amelogenesis imperfecta 3, hypomaturation or hypoplastic type\n" +
            "absent in melanoma 1\n" +
            "absent in melanoma 2\n" +
            "aminoacyl tRNA synthetase complex-interacting multifunctional protein 1\n" +
            "aryl hydrocarbon receptor interacting protein\n" +
            "aryl hydrocarbon receptor interacting protein-like 1\n" +
            "Acute insulin response 2\n" +
            "autoimmune regulator\n" +
            "autoimmune susceptibility 1\n" +
            "autoimmune susceptibility 2\n" +
            "autoimmune susceptibility 3 vitiligo specific\n" +
            "autoimmune disease, susceptibility to, 4\n" +
            "Autoimmune thyroid disease, susceptibility to, 1\n" +
            "Autoimmune thyroid disease, susceptibility to, 2\n" +
            "Autoimmune thyroid disease, susceptibility to, 4\n" +
            "adenylate kinase 1\n" +
            "adenylate kinase 2\n" +
            "adenylate kinase 5\n" +
            "adenylate kinase 7\n" +
            "A kinase PRKA anchor protein 10\n" +
            "A kinase PRKA anchor protein 12\n" +
            "A kinase PRKA anchor protein 13\n" +
            "A kinase PRKA anchor protein 17A\n" +
            "A kinase PRKA anchor protein 5\n" +
            "A kinase PRKA anchor protein 9\n" +
            "A kinase PRKA interacting protein 1\n" +
            "aldo-keto reductase family 1, member A1 aldehyde reductase\n" +
            "aldo-keto reductase family 1, member B1 aldose reductase\n" +
            "aldo-keto reductase family 1, member B10 aldose reductase\n" +
            "aldo-keto reductase family 1, member B1 pseudogene 2\n" +
            "aldo-keto reductase family 1, member C2\n" +
            "aldo-keto reductase family 1, member C3\n" +
            "aldo-keto reductase family 1, member C4\n" +
            "aldo-keto reductase family 1, member D1\n" +
            "aldo-keto reductase family 7, member A2 aflatoxin aldehyde reductase\n" +
            "aldo-keto reductase family 7, member A3 aflatoxin aldehyde reductase\n" +
            "v-akt murine thymoma viral oncogene homolog 1\n" +
            "v-akt murine thymoma viral oncogene homolog 2\n" +
            "v-akt murine thymoma viral oncogene homolog 3\n" +
            "AKT interacting protein\n" +
            "uncharacterized LOC100129027\n" +
            "aminolevulinate dehydratase\n" +
            "aminolevulinate, delta-, synthase 1\n" +
            "aminolevulinate, delta-, synthase 2\n" +
            "albumin\n" +
            "aldehyde dehydrogenase 16 family, member A1\n" +
            "aldehyde dehydrogenase 18 family, member A1\n" +
            "aldehyde dehydrogenase 1 family, member A1\n" +
            "aldehyde dehydrogenase 1 family, member A2\n" +
            "aldehyde dehydrogenase 1 family, member A3\n" +
            "aldehyde dehydrogenase 1 family, member B1\n" +
            "aldehyde dehydrogenase 1 family, member L1\n" +
            "aldehyde dehydrogenase 2 family mitochondrial\n" +
            "aldehyde dehydrogenase 3 family, member A1\n" +
            "aldehyde dehydrogenase 3 family, member A2\n" +
            "aldehyde dehydrogenase 3 family, member B1\n" +
            "aldehyde dehydrogenase 4 family, member A1\n" +
            "aldehyde dehydrogenase 5 family, member A1\n" +
            "aldehyde dehydrogenase 6 family, member A1\n" +
            "aldehyde dehydrogenase 7 family, member A1\n" +
            "aldehyde dehydrogenase 9 family, member A1\n" +
            "aldolase A, fructose-bisphosphate\n" +
            "aldolase B, fructose-bisphosphate\n" +
            "aldolase C, fructose-bisphosphate\n" +
            "ALG1, chitobiosyldiphosphodolichol beta-mannosyltransferase\n" +
            "ALG10, alpha-1,2-glucosyltransferase\n" +
            "ALG10B, alpha-1,2-glucosyltransferase\n" +
            "ALG11, alpha-1,2-mannosyltransferase\n" +
            "ALG12, alpha-1,6-mannosyltransferase\n" +
            "ALG13, UDP-N-acetylglucosaminyltransferase subunit\n" +
            "ALG14, UDP-N-acetylglucosaminyltransferase subunit\n" +
            "ALG2, alpha-1,3/1,6-mannosyltransferase\n" +
            "ALG3, alpha-1,3- mannosyltransferase\n" +
            "ALG6, alpha-1,3-glucosyltransferase\n" +
            "ALG8, alpha-1,3-glucosyltransferase\n" +
            "ALG9, alpha-1,2-mannosyltransferase\n" +
            "anaplastic lymphoma receptor tyrosine kinase\n" +
            "alkB, alkylation repair homolog 3 E. coli\n" +
            "Leukemia, acute lymphocytic, susceptibility to, 1\n" +
            "Leukemia, acute lymphoblastic, susceptibility to, 2\n" +
            "allantoicase\n" +
            "Alstrom syndrome 1\n" +
            "Alstrom syndrome 1 pseudogene\n" +
            "arachidonate 12-lipoxygenase\n" +
            "arachidonate 12-lipoxygenase, 12R type\n" +
            "arachidonate 15-lipoxygenase\n" +
            "arachidonate 15-lipoxygenase, type B\n" +
            "arachidonate 5-lipoxygenase\n" +
            "arachidonate 5-lipoxygenase-activating protein\n" +
            "arachidonate lipoxygenase 3\n" +
            "alkaline phosphatase, intestinal\n" +
            "alkaline phosphatase, liver/bone/kidney\n" +
            "alkaline phosphatase, placental\n" +
            "alkaline phosphatase, placental-like 2\n" +
            "Alkaline phosphatase, plasma level of, QTL 2\n" +
            "Allergic rhinitis\n" +
            "amyotrophic lateral sclerosis 2 juvenile\n" +
            "ALS2 C-terminal like\n" +
            "amyotrophic lateral sclerosis 3 autosomal dominant\n" +
            "amyotrophic lateral sclerosis 5\n" +
            "apolipoprotein E\n" +
            "apolipoprotein F\n" +
            "apolipoprotein H beta-2-glycoprotein I\n" +
            "apolipoprotein L, 1\n" +
            "apolipoprotein L, 2\n" +
            "apolipoprotein L, 4\n" +
            "apolipoprotein L domain containing 1\n" +
            "apolipoprotein M\n" +
            "apoptogenic 1, mitochondrial\n" +
            "amyloid beta A4 precursor protein\n" +
            "amyloid beta precursor protein cytoplasmic tail binding protein 2\n" +
            "adaptor protein, phosphotyrosine interaction, PH domain and leucine zipper containing 1\n" +
            "adaptor protein, phosphotyrosine interaction, PH domain and leucine zipper containing 2\n" +
            "adenine phosphoribosyltransferase\n" +
            "aprataxin\n" +
            "aquaporin 1 Colton blood group\n" +
            "aquaporin 12B\n" +
            "aquaporin 2 collecting duct\n" +
            "aquaporin 3 Gill blood group\n" +
            "aquaporin 4\n" +
            "aquaporin 5\n" +
            "aquaporin 6, kidney specific\n" +
            "aquaporin 7\n" +
            "aquaporin 8\n" +
            "aquaporin 9\n" +
            "laeverin\n" +
            "androgen receptor\n" +
            "v-raf murine sarcoma 3611 viral oncogene homolog\n" +
            "ArfGAP with RhoGAP domain, ankyrin repeat and PH domain 2\n" +
            "activity-regulated cytoskeleton-associated protein\n" +
            "Ichthyosis, congenital, autosomal recessive 7\n" +
            "Ichthyosis, congenital, autosomal recessive 9\n" +
            "amphiregulin\n" +
            "amphiregulin B\n" +
            "ADP-ribosylation factor 1\n" +
            "ADP-ribosylation factor 1 pseudogene 1\n" +
            "ADP-ribosylation factor 3\n" +
            "ADP-ribosylation factor 4\n" +
            "ADP-ribosylation factor 5\n" +
            "ADP-ribosylation factor 6\n" +
            "ADP-ribosylation factor guanine nucleotide-exchange factor 2 brefeldin A-inhibited\n" +
            "ADP-ribosylation factor related protein 1\n" +
            "arginase 1\n" +
            "arginase 2\n" +
            "Rho GTPase activating protein 1\n" +
            "Rho GTPase activating protein 17\n" +
            "Rho GTPase activating protein 23\n" +
            "Rho GTPase activating protein 24\n" +
            "Rho GTPase activating protein 26\n" +
            "Rho GTPase activating protein 31\n" +
            "Rho GTPase activating protein 32\n" +
            "Rho GTPase activating protein 33\n" +
            "Rho GTPase activating protein 4\n" +
            "Rho GTPase activating protein 6\n" +
            "Rho GDP dissociation inhibitor GDI alpha\n" +
            "Rho guanine nucleotide exchange factor GEF 1\n" +
            "Rho guanine nucleotide exchange factor GEF 10\n" +
            "Rho guanine nucleotide exchange factor GEF 12\n" +
            "Rho guanine nucleotide exchange factor GEF 16\n" +
            "Rho guanine nucleotide exchange factor GEF 19\n" +
            "Rho guanine nucleotide exchange factor GEF 3\n" +
            "Rac/Cdc42 guanine nucleotide exchange factor GEF 6\n" +
            "Rho guanine nucleotide exchange factor GEF 7\n" +
            "Cdc42 guanine nucleotide exchange factor GEF 9\n" +
            "Age-related hearing impairment 1\n" +
            "Age-related hearing impairment 2\n" +
            "AT rich interactive domain 1A SWI-like\n" +
            "AT rich interactive domain 1B SWI1-like\n" +
            "AT rich interactive domain 3B BRIGHT-like\n" +
            "AT rich interactive domain 4A RBP1-like\n" +
            "AT rich interactive domain 4B RBP1-like\n" +
            "AT rich interactive domain 5A MRF1-like\n" +
            "AT rich interactive domain 5B MRF1-like\n" +
            "ADP-ribosylation factor-like 1\n" +
            "ADP-ribosylation factor-like 11\n" +
            "ADP-ribosylation factor-like 13B\n" +
            "ADP-ribosylation factor-like 14\n" +
            "ADP-ribosylation factor-like 17A\n" +
            "ADP-ribosylation factor-like 2\n" +
            "ADP-ribosylation factor-like 2 binding protein\n" +
            "ADP-ribosylation factor-like 3\n" +
            "ADP-ribosylation factor-like 4D\n" +
            "ADP-ribosylation factor-like 5A\n" +
            "ADP-ribosylation factor-like 6\n" +
            "ADP-ribosylation factor-like 6 interacting protein 1\n" +
            "armadillo repeat containing 10\n" +
            "armadillo repeat containing 4\n" +
            "armadillo repeat containing 5\n" +
            "armadillo repeat containing 9\n" +
            "age-related maculopathy susceptibility 2\n" +
            "aryl hydrocarbon receptor nuclear translocator\n" +
            "aryl-hydrocarbon receptor nuclear translocator 2\n" +
            "aryl hydrocarbon receptor nuclear translocator-like 2\n" +
            "actin related protein 2/3 complex, subunit 5-like\n" +
            "arrestin 3, retinal X-arrestin\n" +
            "arrestin, beta 1\n" +
            "arrestin, beta 2\n" +
            "arylsulfatase A\n" +
            "arylsulfatase B\n" +
            "arylsulfatase D\n" +
            "arylsulfatase E chondrodysplasia punctata 1\n" +
            "arylsulfatase family, member H\n" +
            "arylsulfatase family, member I\n" +
            "ADP-ribosyltransferase 1\n" +
            "ADP-ribosyltransferase 4 Dombrock blood group\n" +
            "artemin\n" +
            "armadillo repeat gene deleted in velocardiofacial syndrome\n" +
            "arrhythmogenic right ventricular dysplasia 3\n" +
            "arrhythmogenic right ventricular dysplasia 4\n" +
            "arrhythmogenic right ventricular dysplasia 6\n" +
            "aristaless related homeobox\n" +
            "N-acylsphingosine amidohydrolase acid ceramidase 1\n" +
            "N-acylsphingosine amidohydrolase non-lysosomal ceramidase 2\n" +
            "ArfGAP with SH3 domain, ankyrin repeat and PH domain 2\n" +
            "ArfGAP with SH3 domain, ankyrin repeat and PH domain 3\n" +
            "ankyrin repeat and SOCS box containing 10\n" +
            "ankyrin repeat and SOCS box containing 14\n" +
            "ASB16 antisense RNA 1\n" +
            "ankyrin repeat and SOCS box containing 2\n" +
            "activating signal cointegrator 1 complex subunit 1\n" +
            "achaete-scute family bHLH transcription factor 1\n" +
            "atrial septal defect 1\n" +
            "anal sphincter dysplasia\n" +
            "asialoglycoprotein receptor 1\n" +
            "asialoglycoprotein receptor 2\n" +
            "acid-sensing proton-gated ion channel family member 5\n" +
            "agouti signaling protein\n" +
            "argininosuccinate lyase\n" +
            "anterior segment mesenchymal dysgenesis\n" +
            "acetylserotonin O-methyltransferase\n" +
            "acetylserotonin O-methyltransferase-like\n" +
            "arsA arsenite transporter, ATP-binding, homolog 1 bacterial\n" +
            "asparagine synthetase glutamine-hydrolyzing\n" +
            "aspartoacylase\n" +
            "Asperger syndrome, susceptibility to, 1\n" +
            "Asperger syndrome, susceptibility to, 2\n" +
            "Asperger syndrome, susceptibility to, 3\n" +
            "Asperger syndrome, susceptibility to, 4\n" +
            "aspartate beta-hydroxylase\n" +
            "asp abnormal spindle homolog, microcephaly associated Drosophila\n" +
            "asporin\n" +
            "alveolar soft part sarcoma chromosome region, candidate 1\n" +
            "asparaginase like 1\n" +
            "Asthma-related traits, susceptibility to, 3\n" +
            "Asthma-related traits, susceptibility to, 4\n" +
            "Asthma-related traits, susceptibility to, 6\n" +
            "Asthma-related traits, susceptibility to, 8\n" +
            "argininosuccinate synthase 1\n" +
            "argininosuccinate synthetase 1 pseudogene 7\n" +
            "argininosuccinate synthetase 1 pseudogene 8\n" +
            "asteroid homolog 1 Drosophila\n" +
            "astrotactin 2\n" +
            "additional sex combs like 1 Drosophila\n" +
            "additional sex combs like 3 Drosophila\n" +
            "ATPase family, AAA domain containing 2\n" +
            "ataxia, cerebellar, Cayman type\n" +
            "asphixiating thoracic dystrophy chondroectodermal dysplasia-like syndrome\n" +
            "activating transcription factor 1\n" +
            "activating transcription factor 2\n" +
            "activating transcription factor 3\n" +
            "activating transcription factor 4\n" +
            "activating transcription factor 5\n" +
            "activating transcription factor 6\n" +
            "Atrial fibrillation, familial 1\n" +
            "familial atrial fibrillation 2\n" +
            "Atrial fibrillation, familial, 5\n" +
            "Atrial fibrillation, familial, 8\n" +
            "autophagy related 14\n" +
            "autophagy related 16-like 1 S. cerevisiae\n" +
            "autophagy related 4C, cysteine peptidase\n" +
            "autophagy related 9B\n" +
            "atherosclerosis susceptibility lipoprotein associated\n" +
            "5-aminoimidazole-4-carboxamide ribonucleotide formyltransferase/IMP cyclohydrolase\n" +
            "atlastin GTPase 1\n" +
            "atlastin GTPase 2\n" +
            "atlastin GTPase 3\n" +
            "ataxia telangiectasia mutated\n" +
            "atrophin 1\n" +
            "Dermatitis, atopic\n" +
            "Dermatitis, atopic, 3\n" +
            "Dermatitis, atopic, 5\n" +
            "Dermatitis, atopic, 6\n" +
            "Dermatitis, atopic, susceptibility to, 7\n" +
            "atonal homolog 1 Drosophila\n" +
            "atonal homolog 7 Drosophila\n" +
            "ATPase, class V, type 10A\n" +
            "ATPase, class VI, type 11A\n" +
            "ATPase, H+/K+ transporting, nongastric, alpha polypeptide\n" +
            "ATPase type 13A2\n" +
            "ATPase type 13A4\n" +
            "ATPase, Na+/K+ transporting, alpha 1 polypeptide\n" +
            "ATPase, Na+/K+ transporting, alpha 2 polypeptide\n" +
            "ATPase, Na+/K+ transporting, alpha 3 polypeptide\n" +
            "ATPase, Na+/K+ transporting, beta 1 polypeptide\n" +
            "ATPase, Na+/K+ transporting, beta 2 polypeptide\n" +
            "ATPase, Na+/K+ transporting, beta 4 polypeptide\n" +
            "ATPase, Ca++ transporting, cardiac muscle, fast twitch 1\n" +
            "ATPase, Ca++ transporting, cardiac muscle, slow twitch 2\n" +
            "ATPase, Ca++ transporting, ubiquitous\n" +
            "ATPase, Ca++ transporting, plasma membrane 2\n" +
            "ATPase, Ca++ transporting, plasma membrane 3\n" +
            "ATPase, Ca++ transporting, type 2C, member 1\n" +
            "ATPase, Ca++ transporting, type 2C, member 2\n" +
            "ATPase, H+/K+ exchanging, alpha polypeptide\n" +
            "ATP synthase, H+ transporting, mitochondrial F1 complex, alpha subunit 1, cardiac muscle\n" +
            "ATP synthase, H+ transporting, mitochondrial F1 complex, epsilon subunit\n" +
            "ATP synthase, H+ transporting, mitochondrial Fo complex, subunit C1 subunit 9\n" +
            "ATP synthase, H+ transporting, mitochondrial Fo complex, subunit C2 subunit 9\n" +
            "ATP synthase, H+ transporting, mitochondrial Fo complex, subunit C2 subunit 9 pseudogene 2\n" +
            "ATP synthase, H+ transporting, mitochondrial Fo complex, subunit C3 subunit 9\n" +
            "ATP synthase, H+ transporting, mitochondrial Fo complex, subunit d\n" +
            "ATP synthase, H+ transporting, mitochondrial Fo complex, subunit g, pseudogene 5\n" +
            "ATP synthase, H+ transporting, mitochondrial F1 complex, O subunit\n" +
            "ATPase, H+ transporting, lysosomal accessory protein 2\n" +
            "ATPase, H+ transporting, lysosomal V0 subunit a2\n" +
            "ATPase, H+ transporting, lysosomal V0 subunit a4\n" +
            "ATPase, H+ transporting, lysosomal 21kDa, V0 subunit b\n" +
            "ATPase, H+ transporting V0 subunit e2\n" +
            "ATPase, H+ transporting, lysosomal 70kDa, V1 subunit A\n" +
            "ATPase, H+ transporting, lysosomal 56/58kDa, V1 subunit B1\n" +
            "ATPase, H+ transporting, lysosomal 56/58kDa, V1 subunit B2\n" +
            "ATPase, H+ transporting, lysosomal 31kDa, V1 subunit E1\n" +
            "ATP6V1G2-DDX39B readthrough NMD candidate\n" +
            "ATPase, Cu++ transporting, alpha polypeptide\n" +
            "ATPase, Cu++ transporting, beta polypeptide\n" +
            "ATPase, aminophospholipid transporter, class I, type 8A, member 2\n" +
            "ATPase, aminophospholipid transporter, class I, type 8A, member 2 pseudogene 3\n" +
            "ATPase, aminophospholipid transporter, class I, type 8B, member 1\n" +
            "ATP synthase mitochondrial F1 complex assembly factor 1\n" +
            "ATP synthase mitochondrial F1 complex assembly factor 2\n" +
            "antiphospholipid syndrome, familial\n" +
            "ataxia telangiectasia and Rad3 related\n" +
            "ATR interacting protein\n" +
            "attractin\n" +
            "attractin-like 1\n" +
            "alpha thalassemia/mental retardation syndrome X-linked\n" +
            "ataxin 1\n" +
            "ataxin 10\n" +
            "ataxin 2\n" +
            "ataxin 3\n" +
            "ataxin 3-like\n" +
            "ataxin 7\n" +
            "ataxin 8\n" +
            "ATXN8 opposite strand non-protein coding\n" +
            "AU RNA binding protein/enoyl-CoA hydratase\n" +
            "auditory neuropathy, X-linked recessive 1\n" +
            "aurora kinase A\n" +
            "aurora kinase A interacting protein 1\n" +
            "aurora kinase B\n" +
            "aurora kinase C\n" +
            "autism susceptibility 1\n" +
            "Autism, susceptibility to, 11\n" +
            "autism, susceptibility to, 12\n" +
            "autism, susceptibility to, 13\n" +
            "autism susceptibility candidate 2\n" +
            "Autism, susceptibility to, 3\n" +
            "Autism, susceptibility to, 5\n" +
            "Autism, susceptibility to, 6\n" +
            "Autism, susceptibility to, 7\n" +
            "Autism, susceptibility to, 8\n" +
            "apoptosis, caspase activation inhibitor\n" +
            "advillin\n" +
            "arginine vasopressin\n" +
            "arginine vasopressin receptor 1A\n" +
            "arginine vasopressin receptor 1B\n" +
            "arginine vasopressin receptor 2\n" +
            "atrioventricular septal defect 1\n" +
            "axin 1\n" +
            "axin 2\n" +
            "AXL receptor tyrosine kinase\n" +
            "azoospermia factor 1\n" +
            "alpha-2-glycoprotein 1, zinc-binding\n" +
            "azurocidin 1\n" +
            "beta-2-microglobulin\n" +
            "beta-1,3-N-acetylgalactosaminyltransferase 1 globoside blood group\n" +
            "beta-1,3-N-acetylgalactosaminyltransferase 2\n" +
            "UDP-Gal:betaGlcNAc beta 1,3-galactosyltransferase, polypeptide 2\n" +
            "UDP-Gal:betaGlcNAc beta 1,3-galactosyltransferase, polypeptide 4\n" +
            "UDP-Gal:betaGal beta 1,3-galactosyltransferase polypeptide 6\n" +
            "beta 1,3-galactosyltransferase-like\n" +
            "beta-1,3-glucuronyltransferase 1 glucuronosyltransferase P\n" +
            "beta-1,3-glucuronyltransferase 3 glucuronosyltransferase I\n" +
            "UDP-GlcNAc:betaGal beta-1,3-N-acetylglucosaminyltransferase 1\n" +
            "UDP-GlcNAc:betaGal beta-1,3-N-acetylglucosaminyltransferase 4\n" +
            "beta-1,4-N-acetyl-galactosaminyl transferase 1\n" +
            "beta-1,4-N-acetyl-galactosaminyl transferase 2\n" +
            "UDP-Gal:betaGlcNAc beta 1,4- galactosyltransferase, polypeptide 1\n" +
            "UDP-Gal:betaGlcNAc beta 1,4- galactosyltransferase, polypeptide 5\n" +
            "UDP-Gal:betaGlcNAc beta 1,4- galactosyltransferase, polypeptide 6\n" +
            "xylosylprotein beta 1,4-galactosyltransferase, polypeptide 7\n" +
            "Vitamin B6 plasma level QTL 1\n" +
            "B9 protein domain 1\n" +
            "B9 protein domain 2\n" +
            "melanoma antigen pseudogene\n" +
            "brain and acute leukemia, cytoplasmic\n" +
            "bile acid CoA: amino acid N-acyltransferase glycine N-choloyltransferase\n" +
            "beta-site APP-cleaving enzyme 1\n" +
            "BACE1 antisense RNA\n" +
            "beta-site APP-cleaving enzyme 2\n" +
            "BTB and CNC homology 1, basic leucine zipper transcription factor 1\n" +
            "BCL2-associated agonist of cell death\n" +
            "BCL2-associated athanogene\n" +
            "BCL2-associated athanogene 2\n" +
            "BCL2-associated athanogene 3\n" +
            "BCL2-associated athanogene 4\n" +
            "BCL2-associated athanogene 5\n" +
            "BCL2-associated athanogene 6\n" +
            "B melanoma antigen\n" +
            "bromo adjacent homology domain containing 1\n" +
            "brain-specific angiogenesis inhibitor 1\n" +
            "BAI1-associated protein 2-like 1\n" +
            "BCL2-antagonist/killer 1\n" +
            "BMP and activin membrane-bound inhibitor\n" +
            "barrier to autointegration factor 1\n" +
            "B-cell scaffold protein with ankyrin repeats 1\n" +
            "BRCA1 associated protein-1 ubiquitin carboxy-terminal hydrolase\n" +
            "BRCA1 associated RING domain 1\n" +
            "BARX homeobox 1\n" +
            "basic leucine zipper transcription factor, ATF-like 2\n" +
            "BCL2-associated X protein\n" +
            "bromodomain adjacent to zinc finger domain, 1A\n" +
            "bromodomain adjacent to zinc finger domain, 1B\n" +
            "BCL2 binding component 3\n" +
            "BBSome interacting protein 1\n" +
            "butyrobetaine gamma, 2-oxoglutarate dioxygenase gamma-butyrobetaine hydroxylase 1\n" +
            "Bardet-Biedl syndrome 1\n" +
            "Bardet-Biedl syndrome 10\n" +
            "Bardet-Biedl syndrome 12\n" +
            "Bardet-Biedl syndrome 2\n" +
            "Bardet-Biedl syndrome 4\n" +
            "Bardet-Biedl syndrome 5\n" +
            "Bardet-Biedl syndrome 7\n" +
            "Bardet-Biedl syndrome 9\n" +
            "bobby sox homolog Drosophila\n" +
            "basal cell adhesion molecule Lutheran blood group\n" +
            "B-cell receptor-associated protein 31\n" +
            "breast cancer anti-estrogen resistance 1\n" +
            "breast cancer anti-estrogen resistance 3\n" +
            "breast cancer anti-estrogen resistance 4 non-protein coding\n" +
            "breast carcinoma amplified sequence 1\n" +
            "breast carcinoma amplified sequence 2\n" +
            "breast carcinoma amplified sequence 3\n" +
            "breast carcinoma amplified sequence 4\n" +
            "branched chain amino-acid transaminase 1, cytosolic\n" +
            "branched chain amino-acid transaminase 2, mitochondrial\n" +
            "Basal cell carcinoma, susceptibility to, 1\n" +
            "Basal cell carcinoma, susceptibility to, 2\n" +
            "Basal cell carcinoma, susceptibility to, 3\n" +
            "Basal cell carcinoma, susceptibility to, 4\n" +
            "Basal cell carcinoma, susceptibility to, 5\n" +
            "Basal cell carcinoma, susceptibility to, 6\n" +
            "BCDIN3D antisense RNA 1\n" +
            "butyrylcholinesterase\n" +
            "branched chain keto acid dehydrogenase E1, alpha polypeptide\n" +
            "branched chain keto acid dehydrogenase E1, beta polypeptide\n" +
            "branched chain ketoacid dehydrogenase kinase\n" +
            "B-cell CLL/lymphoma 10\n" +
            "B-cell CLL/lymphoma 11A zinc finger protein\n" +
            "B-cell CLL/lymphoma 2\n" +
            "BCL2-related protein A1\n" +
            "BCL2-like 1\n" +
            "BCL2-like 10 apoptosis facilitator\n" +
            "BCL2-like 11 apoptosis facilitator\n" +
            "BCL2-like 12 proline rich\n" +
            "BCL2-like 13 apoptosis facilitator\n" +
            "BCL2-like 2\n" +
            "B-cell CLL/lymphoma 3\n" +
            "B-cell CLL/lymphoma 6\n" +
            "B-cell CLL/lymphoma 7A\n" +
            "B-cell CLL/lymphoma 7B\n" +
            "B-cell CLL/lymphoma 7C\n" +
            "B-cell CLL/lymphoma 9\n" +
            "B-cell CLL/lymphoma 9-like\n" +
            "beta-carotene 15,15'-monooxygenase 1\n" +
            "BCL6 corepressor\n" +
            "Breast cancer-related regulator of TP53\n" +
            "breakpoint cluster region\n" +
            "BC1 ubiquinol-cytochrome c reductase synthesis-like\n" +
            "Brachydactyly, type A1, locus B\n" +
            "Bleeding disorder, east Texas type\n" +
            "3-hydroxybutyrate dehydrogenase, type 1\n" +
            "bradykinin receptor B1\n" +
            "bradykinin receptor B2\n" +
            "brain-derived neurotrophic factor\n" +
            "brain expressed, associated with NEDD4, 1\n" +
            "beclin 1, autophagy related\n" +
            "Bornholm eye disease\n" +
            "cancer/testis antigen 1B\n" +
            "cancer/testis antigen 2\n" +
            "cutaneous T-cell lymphoma-associated antigen 1\n" +
            "CTAGE family, member 12, pseudogene\n" +
            "CTAGE family, member 5\n" +
            "CTAGE family, member 7, pseudogene\n" +
            "CTBP1 antisense RNA\n" +
            "CTS telomere maintenance complex component 1\n" +
            "CCCTC-binding factor zinc finger protein\n" +
            "Coats disease\n" +
            "CTD carboxy-terminal domain, RNA polymerase II, polypeptide A phosphatase, subunit 1\n" +
            "CTD carboxy-terminal domain, RNA polymerase II, polypeptide A small phosphatase 2\n" +
            "Pulmonary hypertension, chronic thromboembolic, without deep vein thrombosis, susceptibility to\n" +
            "cardiotrophin 1\n" +
            "connective tissue growth factor\n" +
            "cystathionase cystathionine gamma-lyase\n" +
            "cono-truncal heart malformation\n" +
            "collagen triple helix repeat containing 1\n" +
            "cytotoxic T-lymphocyte-associated protein 4\n" +
            "catenin cadherin-associated protein, alpha 1, 102kDa\n" +
            "catenin cadherin-associated protein, alpha 2\n" +
            "catenin cadherin-associated protein, alpha 3\n" +
            "catenin cadherin-associated protein, beta 1, 88kDa\n" +
            "catenin, beta like 1\n" +
            "catenin cadherin-associated protein, delta 1\n" +
            "catenin cadherin-associated protein, delta 2\n" +
            "cystinosin, lysosomal cystine transporter\n" +
            "Cataract, posterior polar\n" +
            "Cataract, posterior polar, 5\n" +
            "CTP synthase 1\n" +
            "chymotrypsinogen B1\n" +
            "chymotrypsin C caldecrin\n" +
            "Cataract, central pouch-like, with sutural opacities\n" +
            "Cataract, congenital, nuclear progressive\n" +
            "Cataract 28\n" +
            "Cataract 29, coralliform\n" +
            "Cataract, autosomal recessive congenital 3\n" +
            "cataract, congenital nuclear, autosomal recessive\n" +
            "Cataract, congenital cerulean type, 5\n" +
            "chymotrypsin-like\n" +
            "cathepsin A\n" +
            "cathepsin B\n" +
            "cathepsin C\n" +
            "cathepsin D\n" +
            "cathepsin E\n" +
            "cathepsin F\n" +
            "cathepsin G\n" +
            "cathepsin H\n" +
            "cathepsin K\n" +
            "cathepsin L\n" +
            "cathepsin S\n" +
            "cathepsin V\n" +
            "cathepsin W\n" +
            "cortactin\n" +
            "cortactin binding protein 2\n" +
            "cytosolic thiouridylase subunit 2 homolog S. pombe\n" +
            "cortexin 1\n" +
            "cortexin 2\n" +
            "cubilin intrinsic factor-cobalamin receptor\n" +
            "cullin 1\n" +
            "cullin 2\n" +
            "cullin 3\n" +
            "cullin 4A\n" +
            "cullin 4B\n" +
            "cullin 5\n" +
            "cullin 7\n" +
            "Syndactyly, type I\n" +
            "cut-like homeobox 1\n" +
            "cubitus valgus with mental retardation and unusual facies\n" +
            "CWC15 spliceosome-associated protein homolog S. cerevisiae\n" +
            "CWC22 spliceosome-associated protein homolog S. cerevisiae\n" +
            "CWC27 spliceosome-associated protein homolog S. cerevisiae\n" +
            "chemokine C-X3-C motif ligand 1\n" +
            "chemokine C-X3-C motif receptor 1\n" +
            "coxsackie virus and adenovirus receptor\n" +
            "chemokine C-X-C motif ligand 1 melanoma growth stimulating activity, alpha\n" +
            "chemokine C-X-C motif ligand 10\n" +
            "chemokine C-X-C motif ligand 11\n" +
            "chemokine C-X-C motif ligand 12\n" +
            "chemokine C-X-C motif ligand 13\n" +
            "chemokine C-X-C motif ligand 14\n" +
            "chemokine C-X-C motif ligand 16\n" +
            "chemokine C-X-C motif ligand 17\n" +
            "chemokine C-X-C motif ligand 2\n" +
            "chemokine C-X-C motif ligand 3\n" +
            "chemokine C-X-C motif ligand 5\n" +
            "chemokine C-X-C motif ligand 6\n" +
            "chemokine C-X-C motif ligand 9\n" +
            "chemokine C-X-C motif receptor 1\n" +
            "chemokine C-X-C motif receptor 2\n" +
            "chemokine C-X-C motif receptor 3\n" +
            "chemokine C-X-C motif receptor 4\n" +
            "chemokine C-X-C motif receptor 5\n" +
            "chemokine C-X-C motif receptor 6\n" +
            "chromosome X open reading frame 40A\n" +
            "CXXC finger protein 4\n" +
            "immunoglobulin lambda light chain-like\n" +
            "cytochrome b5 type A microsomal\n" +
            "cytochrome b5 reductase 1\n" +
            "cytochrome b5 reductase 2\n" +
            "cytochrome b5 reductase 3\n" +
            "cytochrome b5 reductase 4\n" +
            "cytochrome b5 reductase-like\n" +
            "cytochrome b-245, alpha polypeptide\n" +
            "cytochrome b-245, beta polypeptide\n" +
            "cytochrome c-1\n" +
            "cytochrome c, somatic\n" +
            "cytochrome c, somatic pseudogene 12\n" +
            "cytoplasmic FMR1 interacting protein 1\n" +
            "cytoglobin\n" +
            "cylindromatosis turban tumor syndrome\n" +
            "cystoid macular dystrophy\n" +
            "cytochrome P450, family 11, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 11, subfamily B, polypeptide 1\n" +
            "cytochrome P450, family 11, subfamily B, polypeptide 2\n" +
            "cytochrome P450, family 17, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 19, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 1, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 1, subfamily A, polypeptide 2\n" +
            "cytochrome P450, family 1, subfamily B, polypeptide 1\n" +
            "cytochrome P450, family 20, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 21, subfamily A, polypeptide 1 pseudogene\n" +
            "cytochrome P450, family 21, subfamily A, polypeptide 2\n" +
            "cytochrome P450, family 24, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 26, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 26, subfamily B, polypeptide 1\n" +
            "cytochrome P450, family 26, subfamily C, polypeptide 1\n" +
            "cytochrome P450, family 27, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 27, subfamily B, polypeptide 1\n" +
            "cytochrome P450, family 2, subfamily A\n" +
            "cytochrome P450, family 2, subfamily A, polypeptide 13\n" +
            "cytochrome P450, family 2, subfamily A, polypeptide 6\n" +
            "cytochrome P450, family 2, subfamily B, polypeptide 6\n" +
            "cytochrome P450, family 2, subfamily C, polypeptide 19\n" +
            "cytochrome P450, family 2, subfamily C, polypeptide 8\n" +
            "cytochrome P450, family 2, subfamily C, polypeptide 9\n" +
            "cytochrome P450, family 2, subfamily D, polypeptide 6\n" +
            "cytochrome P450, family 2, subfamily E, polypeptide 1\n" +
            "cytochrome P450, family 2, subfamily R, polypeptide 1\n" +
            "cytochrome P450, family 2, subfamily U, polypeptide 1\n" +
            "cytochrome P450, family 3, subfamily A, polypeptide 4\n" +
            "cytochrome P450, family 3, subfamily A, polypeptide 5\n" +
            "cytochrome P450, family 46, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 4, subfamily F, polypeptide 2\n" +
            "cytochrome P450, family 4, subfamily F, polypeptide 22\n" +
            "cytochrome P450, family 4, subfamily F, polypeptide 3\n" +
            "cytochrome P450, family 4, subfamily V, polypeptide 2\n" +
            "cytochrome P450, family 51, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 7, subfamily A, polypeptide 1\n" +
            "cytochrome P450, family 7, subfamily B, polypeptide 1\n" +
            "cysteine-rich, angiogenic inducer, 61\n" +
            "cystin 1\n" +
            "cysteinyl leukotriene receptor 1\n" +
            "cysteinyl leukotriene receptor 2\n" +
            "D-2-hydroxyglutarate dehydrogenase\n" +
            "Dab, reelin signal transducer, homolog 1 Drosophila\n" +
            "dachshund family transcription factor 1\n" +
            "dachshund family transcription factor 2\n" +
            "dishevelled-binding antagonist of beta-catenin 1\n" +
            "dishevelled-binding antagonist of beta-catenin 3\n" +
            "dystroglycan 1 dystrophin-associated glycoprotein 1\n" +
            "diacylglycerol lipase, alpha\n" +
            "DAN domain family member 5, BMP antagonist\n" +
            "D-amino-acid oxidase\n" +
            "D-amino acid oxidase activator\n" +
            "death-associated protein kinase 1\n" +
            "death-associated protein kinase 3\n" +
            "Duffy blood group, atypical chemokine receptor\n" +
            "aspartyl-tRNA synthetase\n" +
            "aspartyl-tRNA synthetase 2, mitochondrial\n" +
            "deleted in azoospermia 1\n" +
            "deleted in azoospermia 2\n" +
            "deleted in azoospermia 3\n" +
            "deleted in azoospermia 4\n" +
            "DAZ associated protein 1\n" +
            "DAZ associated protein 2\n" +
            "deleted in azoospermia-like\n" +
            "Diamond-Blackfan anemia 2\n" +
            "dopamine beta-hydroxylase dopamine beta-monooxygenase\n" +
            "diazepam binding inhibitor GABA receptor modulator, acyl-CoA binding protein\n" +
            "drebrin 1\n" +
            "D site of albumin promoter albumin D-box binding protein\n" +
            "dihydrolipoamide branched chain transacylase E2\n" +
            "DDB1 and CUL4 associated factor 17\n" +
            "DDB1 and CUL4 associated factor 5\n" +
            "DDB1 and CUL4 associated factor 8\n" +
            "deleted in colorectal carcinoma\n" +
            "dermcidin\n" +
            "doublecortin domain containing 2\n" +
            "desmosterol-to-cholesterol enzyme\n" +
            "dachsous cadherin-related 1\n" +
            "deoxycytidine kinase\n" +
            "DNA cross-link repair 1C\n" +
            "decorin\n" +
            "Down syndrome chromosome region\n" +
            "dopachrome tautomerase\n" +
            "dynactin 1\n" +
            "dynactin 2 p50\n" +
            "dynactin 4 p62\n" +
            "doublecortin\n" +
            "dicarbonyl/L-xylulose reductase\n" +
            "damage-specific DNA binding protein 1, 127kDa\n" +
            "damage-specific DNA binding protein 2, 48kDa\n" +
            "dopa decarboxylase aromatic L-amino acid decarboxylase\n" +
            "Dowling-Degos disease 3\n" +
            "Developmental dysplasia of the hip 2\n" +
            "DDHD domain containing 1\n" +
            "DDHD domain containing 2\n" +
            "DNA-damage-inducible transcript 3\n" +
            "DNA-damage-inducible transcript 4-like\n" +
            "dolichyl-diphosphooligosaccharide--protein glycosyltransferase subunit non-catalytic\n" +
            "discoidin domain receptor tyrosine kinase 2\n" +
            "D-dopachrome tautomerase\n" +
            "DEAD Asp-Glu-Ala-Asp box helicase 1\n" +
            "DEAD/H Asp-Glu-Ala-Asp/His box helicase 11\n" +
            "DEAD/H Asp-Glu-Ala-Asp/His box helicase 11 like 8\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 20\n" +
            "DEAD Asp-Glu-Ala-Asp box helicase 21\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 23\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 39B\n" +
            "DEAD Asp-Glu-Ala-Asp box helicase 3, X-linked\n" +
            "DEAD Asp-Glu-Ala-Asp box helicase 3, Y-linked\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 43\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 53\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 58\n" +
            "DEAD Asp-Glu-Ala-Asp box polypeptide 59\n" +
            "DEAD Asp-Glu-Ala-Asp box helicase 6 pseudogene 2\n" +
            "DEAF1 transcription factor\n" +
            "deleted in esophageal cancer 1\n" +
            "2,4-dienoyl CoA reductase 1, mitochondrial\n" +
            "death effector domain containing\n" +
            "defensin, alpha 1\n" +
            "defensin, alpha 1 and alpha 3, variable copy number locus\n" +
            "defensin, alpha 3, neutrophil-specific\n" +
            "defensin, alpha 4, corticostatin\n" +
            "defensin, alpha 5, Paneth cell-specific\n" +
            "defensin, alpha 6, Paneth cell-specific\n" +
            "defensin, beta 1\n" +
            "defensin, beta 103A\n" +
            "defensin, beta 103B\n" +
            "defensin, beta 104A\n" +
            "defensin, beta 118\n" +
            "defensin, beta 119\n" +
            "defensin, beta 126\n" +
            "defensin, beta 127\n" +
            "defensin, beta 4A\n" +
            "defensin, theta 1 pseudogene\n" +
            "defensin, theta 1 pseudogene 2\n" +
            "delta4-desaturase, sphingolipid 1\n" +
            "DEK oncogene\n" +
            "Chromosome 10q deletion syndrome\n" +
            "Wilms tumor, aniridia, genitourinary anomalies and mental retardation syndrome\n" +
            "Chromosome 11p15-p14 deletion syndrome\n" +
            "Chromosome 13q14 deletion syndrome\n" +
            "Chromosome 14q11-q22 deletion syndrome\n" +
            "Chromosome 15q11.2 deletion syndrome\n" +
            "Chromosome 15q13.3 microdeletion syndrome\n" +
            "Deafness and male infertility\n" +
            "Chromosome 15q24 deletion syndrome\n" +
            "Chromosome 15q25 deletion syndrome\n" +
            "Chromosome 15q26-qter deletion syndrome\n" +
            "autism, susceptibility to, 14\n" +
            "Chromosome 16p12.2-p11.2 deletion syndrome\n" +
            "Chromosome 16p13.3 deletion syndrome\n" +
            "Chromosome 17p13.1 deletion syndrome\n" +
            "chromosome 17q11.2 deletion syndrome\n" +
            "Chromosome 17q12 deletion syndrome\n" +
            "Chromosome 17q23.1-q23.2 deletion syndrome\n" +
            "Chromosome 18p deletion syndrome\n" +
            "Chromosome 18q deletion syndrome\n" +
            "Chromosome 19p13.13 deletion syndrome\n" +
            "Chromosome 19q13.11 deletion syndrome\n" +
            "Chromosome 1p32-p31 deletion syndrome\n" +
            "Chromosome 1p36 deletion syndrome\n" +
            "Chromosome 1q21.1 deletion syndrome\n" +
            "Chromosome 1q41-q42 deletion syndrome\n" +
            "Chromosome 1q42-q44 deletion syndrome\n" +
            "Chromosome 22q11.2 deletion syndrome, distal\n" +
            "Chromosome 2p12-p11.2 deletion syndrome\n" +
            "Chromosome 2p16.1-p15 deletion syndrome\n" +
            "Hypotonia-cystinuria syndrome\n" +
            "Chromosome 2q31.2 deletion syndrome\n" +
            "3p- syndrome\n" +
            "Chromosome 3q13.31 deletion syndrome\n" +
            "Chromosome 3q29 microdeletion syndrome\n" +
            "Chromosome 4q21 deletion syndrome\n" +
            "Chromosome 5q12 deletion sydrome\n" +
            "Chromosome 6pter deletion syndrome\n" +
            "Chromosome 6q11-q14 deletion syndrome\n" +
            "Chromosome 6q25-q25 deletion syndrome\n" +
            "Chromosome 7q11.23 deletion syndrome, distal, 1.2Mb\n" +
            "Bor-Duane hydrocephalus contiguous gene syndrome\n" +
            "Mesomelia-synostoses syndrome\n" +
            "Chromosome 8q21.11 deletion syndrome\n" +
            "Chromosome 9p deletion syndrome\n" +
            "Chromosome Xp11.3 deletion syndrome\n" +
            "Chromosome Xp21 deletion syndrome\n" +
            "Autism, X-linked, susceptibility to, 4\n" +
            "Choroideremia, deafness, and mental retardation\n" +
            "Sertoli cell-only syndrome, Y-linked\n" +
            "density-regulated protein\n" +
            "DEP domain containing 1B\n" +
            "DEP domain containing 5\n" +
            "Emanuel syndrome\n" +
            "Supernumerary der22t8-22 syndrome\n" +
            "deoxyribose-phosphate aldolase putative\n" +
            "derlin 1\n" +
            "derlin 2\n" +
            "desmin\n" +
            "Deafness, cataract, retinitis pigmentosa, and sperm abnormalities\n" +
            "DNA fragmentation factor, 40kDa, beta polypeptide caspase-activated DNase\n" +
            "deafness, X-linked 5\n" +
            "deafness, X-linked 8\n" +
            "deafness, autosomal dominant 16\n" +
            "deafness, autosomal dominant 18\n" +
            "deafness, autosomal dominant 21\n" +
            "deafness, autosomal dominant 24\n" +
            "deafness, autosomal dominant 27\n" +
            "deafness, autosomal dominant 30\n" +
            "deafness, autosomal dominant 31\n" +
            "deafness, autosomal dominant 33\n" +
            "deafness, autosomal dominant 40\n" +
            "deafness, autosomal dominant 41\n" +
            "deafness, autosomal dominant 42\n" +
            "deafness, autosomal dominant 43\n" +
            "deafness, autosomal dominant 47\n" +
            "deafness, autosomal dominant 49\n" +
            "deafness, autosomal dominant 5\n" +
            "deafness, autosomal dominant 52\n" +
            "deafness, autosomal dominant 53\n" +
            "deafness, autosomal dominant 54\n" +
            "deafness, autosomal dominant 55\n" +
            "deafness, autosomal dominant 58\n" +
            "deafness, autosomal dominant 59\n" +
            "deafness, autosomal dominant 7\n" +
            "deafness, autosomal recessive 13\n" +
            "deafness, autosomal recessive 14\n" +
            "deafness, autosomal recessive 17\n" +
            "deafness, autosomal recessive 20\n" +
            "deafness, autosomal recessive 26\n" +
            "deafness, autosomal recessive 27\n" +
            "deafness, autosomal recessive 31\n" +
            "deafness, autosomal recessive 32\n" +
            "deafness, autosomal recessive 33\n" +
            "deafness, autosomal recessive 38\n" +
            "deafness, autosomal recessive 40\n" +
            "deafness, autosomal recessive 44\n" +
            "deafness, autosomal recessive 45\n" +
            "deafness, autosomal recessive 46\n" +
            "deafness, autosomal recessive 47\n" +
            "deafness, autosomal recessive 5\n" +
            "deafness, autosomal recessive 51\n" +
            "deafness, autosomal recessive 55\n" +
            "deafness, autosomal recessive 59\n" +
            "deafness, autosomal recessive 62\n" +
            "deafness, autosomal recessive 65\n" +
            "deafness, autosomal recessive 66\n" +
            "deafness, autosomal recessive 68\n" +
            "deafness, autosomal recessive 71\n" +
            "deafness, autosomal recessive 74\n" +
            "deafness, autosomal recessive 81\n" +
            "deafness, autosomal recessive 83\n" +
            "deafness, autosomal recessive 85\n" +
            "deafness, autosomal recessive 93\n" +
            "deafness, autosomal recessive 96\n" +
            "deafness recessive, nonsyndromic modifier 1\n" +
            "deafness, X-linked 3\n" +
            "deafness, Y-linked 1\n" +
            "diacylglycerol O-acyltransferase 1\n" +
            "diacylglycerol O-acyltransferase 2-like 6\n" +
            "DiGeorge syndrome chromosome region\n" +
            "DiGeorge syndrome critical region gene 10 non-protein coding\n" +
            "DiGeorge syndrome critical region gene 11 non-protein coding\n" +
            "DiGeorge syndrome critical region gene 14\n" +
            "DiGeorge syndrome critical region gene 2\n" +
            "DiGeorge syndrome critical region gene 6\n" +
            "DiGeorge syndrome critical region gene 6-like\n" +
            "DGCR8 microprocessor complex subunit\n" +
            "diacylglycerol kinase, epsilon 64kDa\n" +
            "diacylglycerol kinase, gamma 90kDa\n" +
            "diacylglycerol kinase, theta 110kDa\n" +
            "DiGeorge syndrome/velocardiofacial syndrome complex 2\n" +
            "deoxyguanosine kinase\n" +
            "24-dehydrocholesterol reductase\n" +
            "7-dehydrocholesterol reductase\n" +
            "dehydrodolichyl diphosphate synthase\n" +
            "dihydrodiol dehydrogenase dimeric\n" +
            "dihydrofolate reductase\n" +
            "dihydrofolate reductase-like 1\n" +
            "dihydrofolate reductase pseudogene 2\n" +
            "desert hedgehog\n" +
            "dihydroorotate dehydrogenase quinone\n" +
            "deoxyhypusine synthase\n" +
            "dehydrogenase/reductase SDR family member 9\n" +
            "dehydrated hereditary stomatocytosis\n" +
            "dehydrogenase E1 and transketolase domain containing 1\n" +
            "DEAH Asp-Glu-Ala-His box polypeptide 34\n" +
            "DEAH Asp-Glu-Ala-His box polypeptide 40\n" +
            "DEAH Asp-Glu-Ala-His box polypeptide 8\n" +
            "DEAH Asp-Glu-Ala-His box helicase 9\n" +
            "diablo, IAP-binding mitochondrial protein\n" +
            "diabetic nephropathy\n" +
            "diaphanous-related formin 1\n" +
            "diaphanous-related formin 2\n" +
            "diaphanous-related formin 3\n" +
            "dicer 1, ribonuclease type III\n" +
            "diaphragmatic hernia 1\n" +
            "Hernia, congenital diaphragmatic 2\n" +
            "deiodinase, iodothyronine, type I\n" +
            "deiodinase, iodothyronine, type II\n" +
            "deiodinase, iodothyronine, type III\n" +
            "DIP2 disco-interacting protein 2 homolog B Drosophila\n" +
            "DIRAS family, GTP-binding RAS-like 1\n" +
            "disrupted in renal carcinoma 2\n" +
            "disrupted in renal carcinoma 3\n" +
            "DIS3 like 3'-5' exoribonuclease 2\n" +
            "disrupted in schizophrenia 1\n" +
            "disrupted in schizophrenia 2 non-protein coding\n" +
            "dispatched homolog 1 Drosophila\n" +
            "Dyskeratosis, hereditary benign intraepithelial\n" +
            "dyskeratosis congenita 1, dyskerin\n" +
            "dickkopf WNT signaling pathway inhibitor 1\n" +
            "dickkopf WNT signaling pathway inhibitor 4\n" +
            "dihydrolipoamide S-acetyltransferase\n" +
            "deleted in liver cancer 1\n" +
            "dihydrolipoamide dehydrogenase\n" +
            "deleted in lung and esophageal cancer 1\n" +
            "deleted in lung and esophageal cancer 1 pseudogene 1\n" +
            "deleted in lymphocytic leukemia 1 non-protein coding\n" +
            "deleted in lymphocytic leukemia 2 non-protein coding\n" +
            "deleted in lymphocytic leukemia 2-like\n" +
            "discs, large homolog 1 Drosophila\n" +
            "discs, large homolog 2 Drosophila\n" +
            "discs, large homolog 3 Drosophila\n" +
            "discs, large homolog 4 Drosophila\n" +
            "discs, large Drosophila homolog-associated protein 1\n" +
            "discs, large Drosophila homolog-associated protein 3\n" +
            "delta-like 1 homolog Drosophila\n" +
            "delta-like 1 Drosophila\n" +
            "delta-like 3 Drosophila\n" +
            "dihydrolipoamide S-succinyltransferase E2 component of 2-oxo-glutarate complex\n" +
            "distal-less homeobox 1\n" +
            "distal-less homeobox 2\n" +
            "distal-less homeobox 3\n" +
            "distal-less homeobox 4\n" +
            "distal-less homeobox 5\n" +
            "distal-less homeobox 6\n" +
            "DNA methyltransferase 1 associated protein 1\n" +
            "deleted in malignant brain tumors 1\n" +
            "dystrophin\n" +
            "dimethylglycine dehydrogenase\n" +
            "dentin matrix acidic phosphoprotein 1\n" +
            "dystrophia myotonica-protein kinase\n" +
            "doublesex and mab-3 related transcription factor 1\n" +
            "doublesex and mab-3 related transcription factor 2\n" +
            "DMRT-like family C1\n" +
            "cyclin D binding myb-like transcription factor 1\n" +
            "DNA replication helicase/nuclease 2\n" +
            "dynein, axonemal, assembly factor 1\n" +
            "dynein, axonemal, assembly factor 2\n" +
            "dynein, axonemal, assembly factor 3\n" +
            "dynein, axonemal, heavy chain 1\n" +
            "dynein, axonemal, heavy chain 11\n" +
            "dynein, axonemal, heavy chain 17\n" +
            "dynein, axonemal, heavy chain 5\n" +
            "dynein, axonemal, heavy chain 8\n" +
            "dynein, axonemal, intermediate chain 1\n" +
            "dynein, axonemal, intermediate chain 2\n" +
            "DnaJ Hsp40 homolog, subfamily A, member 1\n" +
            "DnaJ Hsp40 homolog, subfamily A, member 2\n" +
            "DnaJ Hsp40 homolog, subfamily A, member 3\n" +
            "DnaJ Hsp40 homolog, subfamily B, member 1\n" +
            "DnaJ Hsp40 homolog, subfamily B, member 12\n" +
            "DnaJ Hsp40 homolog, subfamily B, member 2\n" +
            "DnaJ Hsp40 homolog, subfamily B, member 4\n" +
            "DnaJ Hsp40 homolog, subfamily B, member 6\n" +
            "DnaJ Hsp40 homolog, subfamily B, member 8\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 12\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 13\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 14\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 15\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 19\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 28\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 30\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 4\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 5\n" +
            "DnaJ Hsp40 homolog, subfamily C, member 6\n" +
            "dynein, axonemal, light chain 1\n" +
            "dynein, axonemal, light chain 4\n" +
            "deoxyribonuclease I\n" +
            "deoxyribonuclease I-like 1\n" +
            "deoxyribonuclease I-like 3\n" +
            "deoxyribonuclease II beta\n" +
            "DND microRNA-mediated repression inhibitor 1\n" +
            "dynamin 1\n" +
            "dynamin 1-like\n" +
            "dynamin 2\n" +
            "dynamin 3\n" +
            "DNA cytosine-5--methyltransferase 1\n" +
            "DNA cytosine-5--methyltransferase 3 alpha\n" +
            "DNA cytosine-5--methyltransferase 3 beta\n" +
            "DNA cytosine-5--methyltransferase 3-like\n" +
            "DNA nucleotidylexotransferase\n" +
            "deoxynucleotidyltransferase, terminal, interacting protein 2\n" +
            "dedicator of cytokinesis 3\n" +
            "dedicator of cytokinesis 6\n" +
            "dedicator of cytokinesis 7\n" +
            "dedicator of cytokinesis 8\n" +
            "deoxyhypusine hydroxylase/monooxygenase\n" +
            "docking protein 1, 62kDa downstream of tyrosine kinase 1\n" +
            "docking protein 7\n" +
            "dolichol kinase\n" +
            "dolichyl-phosphate UDP-N-acetylglucosamine N-acetylglucosaminephosphotransferase 1 GlcNAc-1-P transferase\n" +
            "diffuse panbronchiolitis critical region 1\n" +
            "dipeptidase 1 renal\n" +
            "D4, zinc and double PHD fingers family 2\n" +
            "diphthamide biosynthesis 1\n" +
            "DPH2 homolog S. cerevisiae\n" +
            "diphthamide biosynthesis 3\n" +
            "dolichyl-phosphate mannosyltransferase polypeptide 1, catalytic subunit\n" +
            "dolichyl-phosphate mannosyltransferase polypeptide 2, regulatory subunit\n" +
            "dolichyl-phosphate mannosyltransferase polypeptide 3\n" +
            "dipeptidyl-peptidase 10 non-functional\n" +
            "dipeptidyl-peptidase 3\n" +
            "dipeptidyl-peptidase 4\n" +
            "dipeptidyl-peptidase 6\n" +
            "dipeptidyl-peptidase 7\n" +
            "dipeptidyl-peptidase 9\n" +
            "developmental pluripotency associated 3\n" +
            "dermatopontin\n" +
            "dpy-19-like 2 C. elegans\n" +
            "dihydropyrimidine dehydrogenase\n" +
            "dihydropyrimidinase\n" +
            "dihydropyrimidinase-like 2\n" +
            "dihydropyrimidinase-like 5\n" +
            "down-regulator of transcription 1, TBP-binding negative cofactor 2\n" +
            "dynein regulatory complex subunit 1 homolog Chlamydomonas\n" +
            "dopamine receptor D1\n" +
            "dopamine receptor D2\n" +
            "dopamine receptor D3\n" +
            "dopamine receptor D4\n" +
            "dopamine receptor D5\n" +
            "desmocollin 1\n" +
            "desmocollin 2\n" +
            "desmocollin 3\n" +
            "Down syndrome cell adhesion molecule\n" +
            "Down syndrome cell adhesion molecule like 1\n" +
            "Down syndrome critical region gene 10 non-protein coding\n" +
            "Down syndrome critical region gene 3\n" +
            "Down syndrome critical region gene 4\n" +
            "Down syndrome critical region gene 8\n" +
            "dermatan sulfate epimerase\n" +
            "desmoglein 1\n" +
            "desmoglein 2\n" +
            "desmoglein 3\n" +
            "desmoglein 4\n" +
            "desmoplakin\n" +
            "dentin sialophosphoprotein\n" +
            "dystonin\n" +
            "dual serine/threonine and tyrosine protein kinase\n" +
            "dystrobrevin, alpha\n" +
            "dystrobrevin binding protein 1\n" +
            "Dyschromatosis universalis hereditaria\n" +
            "Dyschromatosis universalis hereditaria 2\n" +
            "dual oxidase 1\n" +
            "dual oxidase 2\n" +
            "dual oxidase maturation factor 1\n" +
            "dual oxidase maturation factor 2\n" +
            "Chromosome 16p11.2 duplication syndrome\n" +
            "Chromosome 16p13.3 duplication syndrome\n" +
            "Chromosome 17p13.3 duplication syndrome\n" +
            "Chromosome 17q12 duplication syndrome\n" +
            "Chromosome 17q21.31 duplication syndrome\n" +
            "Chromosome 17q23.1-q23.2 duplication syndrome\n" +
            "Chromosome 18 pericentric inversion\n" +
            "Chromosome 1q21.1 duplication syndrome\n" +
            "Chromosome 22q11.2 microduplication syndrome\n" +
            "Chromosome 22q13 duplication syndrome\n" +
            "Chromosome 2q31.1 duplication syndrome\n" +
            "chromosome 3q29 microduplication syndrome\n" +
            "Chromosome 5p13 duplication syndrome\n" +
            "Chromosome 7q11.23 duplication syndrome\n" +
            "Dupuytren contracture 1\n" +
            "Chromosome Xp11.23-p11.22 duplication syndrome\n" +
            "Chromosome Xq27.3-q28 duplication syndrome\n" +
            "Chromosome Xq28 duplication syndrome\n" +
            "Duane retraction syndrome 1\n" +
            "dihydrouridine synthase 2\n" +
            "dual specificity phosphatase 1\n" +
            "dual specificity phosphatase 10\n" +
            "dual specificity phosphatase 13\n" +
            "dual specificity phosphatase 15\n" +
            "dual specificity phosphatase 19\n" +
            "dual specificity phosphatase 2\n" +
            "dual specificity phosphatase 21\n" +
            "dual specificity phosphatase 22\n" +
            "dual specificity phosphatase 23\n" +
            "dual specificity phosphatase 26 putative\n" +
            "dual specificity phosphatase 3\n" +
            "dual specificity phosphatase 5\n" +
            "dual specificity phosphatase 6\n" +
            "dual specificity phosphatase 8\n" +
            "deoxyuridine triphosphatase\n" +
            "double homeobox 4\n" +
            "dishevelled segment polarity protein 1\n" +
            "dishevelled segment polarity protein 2\n" +
            "dishevelled segment polarity protein 3\n" +
            "dandy-walker syndrome\n" +
            "DPY30 domain containing 1\n" +
            "DPY30 domain containing 2\n" +
            "dymeclin\n" +
            "dynein, cytoplasmic 1, heavy chain 1\n" +
            "dynein, cytoplasmic 1, intermediate chain 2\n" +
            "dynein, cytoplasmic 2, heavy chain 1\n" +
            "dynein, light chain, Tctex-type 3\n" +
            "dual-specificity tyrosine-Y-phosphorylation regulated kinase 1A\n" +
            "dual-specificity tyrosine-Y-phosphorylation regulated kinase 1B\n" +
            "dysferlin\n" +
            "dystonia 10\n" +
            "dystonia 13, torsion\n" +
            "dystonia 15, myoclonic\n" +
            "dystonia 17\n" +
            "dystonia 2, torsion autosomal recessive\n" +
            "dystonia 21, torsion autosomal dominant\n" +
            "dystonia 7, torsion autosomal dominant\n" +
            "dyslexia susceptibility 1\n" +
            "dyslexia susceptibility 1 candidate 1\n" +
            "DYX1C1-CCPG1 readthrough NMD candidate\n" +
            "dyslexia susceptibility 2\n" +
            "dyslexia susceptibility 3\n" +
            "dyslexia susceptibility 5\n" +
            "dyslexia susceptibility 6\n" +
            "dyslexia susceptibility 8\n" +
            "dyslexia susceptibility 9\n" +
            "E2F transcription factor 1\n" +
            "E2F transcription factor 2\n" +
            "E2F transcription factor 3\n" +
            "E2F transcription factor 8\n" +
            "E4F transcription factor 1\n" +
            "Episodic ataxia, type 3\n" +
            "Episodic ataxia, type 7\n" +
            "ELL associated factor 1\n" +
            "EAF1 antisense RNA 1\n";

    private static String secondName =      "bestrophin 1\n" +
            "bestrophin 2\n" +
            "bestrophin 3\n" +
            "bestrophin 4\n" +
            "Bet1 golgi vesicular membrane trafficking protein\n" +
            "Bet1 golgi vesicular membrane trafficking protein-like\n" +
            "brain expressed, X-linked 1\n" +
            "brain expressed X-linked 2\n" +
            "Benign familial infantile convulsions-2\n" +
            "benign familial infantile convulsions\n" +
            "Convulsions, benign familial infantile, 4\n" +
            "beaded filament structural protein 1, filensin\n" +
            "beaded filament structural protein 2, phakinin\n" +
            "bone gamma-carboxyglutamate gla protein\n" +
            "biglycan\n" +
            "Beukes familial hip dysplasia\n" +
            "basic helix-loop-helix family, member a9\n" +
            "basic helix-loop-helix family, member e41\n" +
            "betaine--homocysteine S-methyltransferase\n" +
            "betaine--homocysteine S-methyltransferase 2\n" +
            "BicC family RNA binding protein 1\n" +
            "cell division cycle 5-like\n" +
            "cell division cycle 6\n" +
            "cell division cycle 73\n" +
            "cell division cycle associated 2\n" +
            "cell division cycle associated 3\n" +
            "cell division cycle associated 4\n" +
            "cell division cycle associated 5\n" +
            "cell division cycle associated 7\n" +
            "cell division cycle associated 8\n" +
            "cadherin 1, type 1, E-cadherin epithelial\n" +
            "cadherin 11, type 2, OB-cadherin osteoblast\n" +
            "cadherin 12, type 2 N-cadherin 2\n" +
            "cadherin 13\n" +
            "cadherin 15, type 1, M-cadherin myotubule\n" +
            "cadherin 16, KSP-cadherin\n" +
            "cadherin 19, type 2\n" +
            "cadherin 2, type 1, N-cadherin neuronal\n" +
            "cadherin-related 23\n" +
            "cadherin 3, type 1, P-cadherin placental\n" +
            "cadherin 5, type 2 vascular endothelium\n" +
            "cadherin 7, type 2\n" +
            "cadherin 8, type 2\n" +
            "cadherin 9, type 2 T1-cadherin\n" +
            "cadherin-related family member 1\n" +
            "CDP-diacylglycerol--inositol 3-phosphatidyltransferase\n" +
            "cyclin-dependent kinase 1\n" +
            "cyclin-dependent kinase 10\n" +
            "cyclin-dependent kinase 11A\n" +
            "cyclin-dependent kinase 11B\n" +
            "cyclin-dependent kinase 15\n" +
            "cyclin-dependent kinase 2\n" +
            "cyclin-dependent kinase 20\n" +
            "cyclin-dependent kinase 2 associated protein 1\n" +
            "cyclin-dependent kinase 2 associated protein 2\n" +
            "cyclin-dependent kinase 4\n" +
            "cyclin-dependent kinase 5\n" +
            "cyclin-dependent kinase 5, regulatory subunit 1 p35\n" +
            "CDK5 regulatory subunit associated protein 1\n" +
            "CDK5 regulatory subunit associated protein 2\n" +
            "cyclin-dependent kinase 6\n" +
            "cyclin-dependent kinase 7\n" +
            "cyclin-dependent kinase 9\n" +
            "CDK5 regulatory subunit associated protein 1-like 1\n" +
            "cyclin-dependent kinase-like 3\n" +
            "cyclin-dependent kinase-like 5\n" +
            "cyclin-dependent kinase inhibitor 1A p21, Cip1\n" +
            "cyclin-dependent kinase inhibitor 1B p27, Kip1\n" +
            "cyclin-dependent kinase inhibitor 1C p57, Kip2\n" +
            "cyclin-dependent kinase inhibitor 2A\n" +
            "cyclin-dependent kinase inhibitor 2B p15, inhibits CDK4\n" +
            "CDKN2B antisense RNA 1\n" +
            "cyclin-dependent kinase inhibitor 2C p18, inhibits CDK4\n" +
            "cyclin-dependent kinase inhibitor 2D p19, inhibits CDK4\n" +
            "cyclin-dependent kinase inhibitor 3\n" +
            "Cornelia de Lange syndrome 1\n" +
            "Cornelia de Lange syndrome 2\n" +
            "cysteine dioxygenase type 1\n" +
            "cell adhesion associated, oncogene regulated\n" +
            "cerebellar degeneration-related protein 1, 34kDa\n" +
            "cerebellar degeneration-related protein 2, 62kDa\n" +
            "Cerebellar degeneration-related autoantigen-3\n" +
            "CDP-diacylglycerol synthase phosphatidate cytidylyltransferase 1\n" +
            "corneodesmosin\n" +
            "chromatin licensing and DNA replication factor 1\n" +
            "caudal type homeobox 1\n" +
            "caudal type homeobox 2\n" +
            "caudal type homeobox 4\n" +
            "chromodomain protein, Y-linked, 1\n" +
            "chromodomain protein, Y-linked, 2A\n" +
            "chromodomain protein, Y-like\n" +
            "chromodomain protein, Y-like 2\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 1 biliary glycoprotein\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 16\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 3\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 4\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 5\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 6 non-specific cross reacting antigen\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 7\n" +
            "carcinoembryonic antigen-related cell adhesion molecule 8\n" +
            "CCAAT/enhancer binding protein C/EBP, alpha\n" +
            "CCAAT/enhancer binding protein C/EBP, beta\n" +
            "CCAAT/enhancer binding protein C/EBP, epsilon\n" +
            "CCAAT/enhancer binding protein C/EBP, zeta\n" +
            "cat eye syndrome chromosome region\n" +
            "cat eye syndrome chromosome region, candidate 1\n" +
            "cat eye syndrome chromosome region, candidate 2\n" +
            "cat eye syndrome chromosome region, candidate 3 non-protein coding\n" +
            "cat eye syndrome chromosome region, candidate 5\n" +
            "CECR5 antisense RNA 1\n" +
            "cat eye syndrome chromosome region, candidate 6\n" +
            "cat eye syndrome chromosome region, candidate 7 non-protein coding\n" +
            "cat eye syndrome chromosome region, candidate 9 non-protein coding\n" +
            "carboxyl ester lipase\n" +
            "chymotrypsin-like elastase family, member 1\n" +
            "chymotrypsin-like elastase family, member 3B\n" +
            "CUGBP, Elav-like family member 1\n" +
            "CUGBP, Elav-like family member 2\n" +
            "CUGBP, Elav-like family member 4\n" +
            "Celiac disease, susceptibility to, 10\n" +
            "Celiac disease, susceptibility to, 11\n" +
            "Celiac disease, susceptibility to, 12\n" +
            "Celiac disease, susceptibility to, 13\n" +
            "celiac disease 2\n" +
            "Celiac disease, susceptibility to, 5\n" +
            "Celiac disease, susceptibility to, 6\n" +
            "Celiac disease, susceptibility to, 7\n" +
            "Celiac disease, susceptibility to, 8\n" +
            "Celiac disease, susceptibility to, 9\n" +
            "cadherin, EGF LAG seven-pass G-type receptor 1\n" +
            "cadherin, EGF LAG seven-pass G-type receptor 2\n" +
            "cell migration inducing protein, hyaluronan binding\n" +
            "cementum protein 1\n" +
            "cell cycle exit and neuronal differentiation 1\n" +
            "centromere protein B, 80kDa\n" +
            "centromere protein C\n" +
            "centromere protein C pseudogene 1\n" +
            "centromere protein E, 312kDa\n" +
            "centromere protein J\n" +
            "centromere protein V\n" +
            "centrosomal protein 135kDa\n" +
            "centrosomal protein 152kDa\n" +
            "centrosomal protein 164kDa\n" +
            "centrosomal protein 19kDa\n" +
            "centrosomal protein 290kDa\n" +
            "centrosomal protein 41kDa\n" +
            "centrosomal protein 55kDa\n" +
            "centrosomal protein 57kDa\n" +
            "centrosomal protein 63kDa\n" +
            "centrosomal protein 76kDa\n" +
            "centrosomal protein 83kDa\n" +
            "centrosomal protein 85kDa-like\n" +
            "centrosomal protein 89kDa\n" +
            "cerberus 1, DAN family BMP antagonist\n" +
            "ceramide kinase\n" +
            "ceramide kinase-like\n" +
            "ceramide synthase 3\n" +
            "carboxylesterase 1\n" +
            "carboxylesterase 2\n" +
            "carboxylesterase 3\n" +
            "centrin, EF-hand protein, 2\n" +
            "cholesteryl ester transfer protein, plasma\n" +
            "complement factor B\n" +
            "cripto, FRL-1, cryptic family 1\n" +
            "complement factor D adipsin\n" +
            "complement factor H\n" +
            "complement factor H-related 1\n" +
            "complement factor H-related 2\n" +
            "complement factor H-related 3\n" +
            "complement factor H-related 4\n" +
            "complement factor H-related 5\n" +
            "complement factor I\n" +
            "cofilin 1 non-muscle\n" +
            "cofilin 2 muscle\n" +
            "CASP8 and FADD-like apoptosis regulator\n" +
            "cystic fibrosis modifier 1\n" +
            "cystic fibrosis modifier 2\n" +
            "complement factor properdin\n" +
            "craniofacioskeletal syndrome\n" +
            "Myopathy, congenital, with fiber-type disproportion, X-linked\n" +
            "cystic fibrosis transmembrane conductance regulator ATP-binding cassette sub-family C, member 7\n" +
            "cystic fibrosis transmembrane conductance regulator pseudogene 1\n" +
            "glycoprotein hormones, alpha polypeptide\n" +
            "chorionic gonadotropin, beta polypeptide\n" +
            "chorionic gonadotropin, beta polypeptide 5\n" +
            "chorionic gonadotropin, beta polypeptide 7\n" +
            "chorionic gonadotropin, beta polypeptide 8\n" +
            "cingulin-like 1\n" +
            "cholesterol 25-hydroxylase\n" +
            "choline O-acetyltransferase\n" +
            "coiled-coil-helix-coiled-coil-helix domain containing 10\n" +
            "chromodomain helicase DNA binding protein 1-like\n" +
            "chromodomain helicase DNA binding protein 2\n" +
            "chromodomain helicase DNA binding protein 3\n" +
            "chromodomain helicase DNA binding protein 4\n" +
            "chromodomain helicase DNA binding protein 5\n" +
            "chromodomain helicase DNA binding protein 6\n" +
            "chromodomain helicase DNA binding protein 7\n" +
            "chromodomain helicase DNA binding protein 8\n" +
            "Chordoma\n" +
            "Coronary heart disease, susceptibility to, 1\n" +
            "Coronary heart disease, susceptibility to, 2\n" +
            "Coronary heart disease, susceptibility to, 3\n" +
            "Coronary heart disease, susceptibility to, 4\n" +
            "Coronary heart disease, susceptibility to, 8\n" +
            "Coronary heart disease, suscpetibility to, 9\n" +
            "Congenital heart defects, multiple types, 3\n" +
            "corneal endothelial dystrophy 1 autosomal dominant\n" +
            "checkpoint kinase 1\n" +
            "checkpoint kinase 2\n" +
            "calcium homeostasis endoplasmic reticulum protein\n" +
            "checkpoint suppressor 1-like 1\n" +
            "chromogranin A parathyroid secretory protein 1\n" +
            "chromogranin B secretogranin 1\n" +
            "chitinase 3-like 1 cartilage glycoprotein-39\n" +
            "chitinase, acidic\n" +
            "cysteine-rich hydrophobic domain 2\n" +
            "chitinase 1 chitotriosidase\n" +
            "choline kinase alpha\n" +
            "choline kinase beta\n" +
            "cell adhesion molecule L1-like\n" +
            "choroideremia Rab escort protein 1\n" +
            "choroideremia-like Rab escort protein 2\n" +
            "charged multivesicular body protein 1A\n" +
            "charged multivesicular body protein 2A\n" +
            "charged multivesicular body protein 2B\n" +
            "charged multivesicular body protein 3\n" +
            "charged multivesicular body protein 4B\n" +
            "chimerin 1\n" +
            "chimerin 2\n" +
            "Hypothyroidism, congenital, nongoitrous, 3\n" +
            "cysteine and histidine-rich domain CHORD containing 1\n" +
            "calcineurin-like EF-hand protein 2\n" +
            "chondroitin polymerizing factor 2\n" +
            "choline phosphotransferase 1\n" +
            "chordin-like 1\n" +
            "CHRNA7 cholinergic receptor, nicotinic, alpha 7, exons 5-10 and FAM7A family with sequence similarity 7A, exons A-E fusion\n" +
            "cholinergic receptor, muscarinic 1\n" +
            "cholinergic receptor, muscarinic 2\n" +
            "cholinergic receptor, muscarinic 3\n" +
            "cholinergic receptor, muscarinic 5\n" +
            "cholinergic receptor, nicotinic, alpha 1 muscle\n" +
            "cholinergic receptor, nicotinic, alpha 2 neuronal\n" +
            "cholinergic receptor, nicotinic, alpha 3 neuronal\n" +
            "cholinergic receptor, nicotinic, alpha 4 neuronal\n" +
            "cholinergic receptor, nicotinic, alpha 5 neuronal\n" +
            "cholinergic receptor, nicotinic, alpha 6 neuronal\n" +
            "cholinergic receptor, nicotinic, alpha 7 neuronal\n" +
            "cholinergic receptor, nicotinic, alpha 9 neuronal\n" +
            "cholinergic receptor, nicotinic, beta 1 muscle\n" +
            "cholinergic receptor, nicotinic, beta 2 neuronal\n" +
            "cholinergic receptor, nicotinic, beta 3 neuronal\n" +
            "cholinergic receptor, nicotinic, beta 4 neuronal\n" +
            "cholinergic receptor, nicotinic, delta muscle\n" +
            "cholinergic receptor, nicotinic, epsilon muscle\n" +
            "cholinergic receptor, nicotinic, gamma muscle\n" +
            "carbohydrate keratan sulfate Gal-6 sulfotransferase 1\n" +
            "carbohydrate chondroitin 4 sulfotransferase 11\n" +
            "carbohydrate N-acetylgalactosamine 4-0 sulfotransferase 14\n" +
            "carbohydrate chondroitin 6 sulfotransferase 3\n" +
            "carbohydrate N-acetylglucosamine 6-O sulfotransferase 5\n" +
            "carbohydrate N-acetylglucosamine 6-O sulfotransferase 6\n" +
            "carbohydrate N-acetylgalactosamine 4-0 sulfotransferase 8\n" +
            "chondroitin sulfate synthase 1\n" +
            "CTF8, chromosome transmission fidelity factor 8 homolog S. cerevisiae\n" +
            "conserved helix-loop-helix ubiquitous kinase\n" +
            "calcium and integrin binding 1 calmyrin\n" +
            "calcium and integrin binding family member 2\n" +
            "capicua transcriptional repressor\n" +
            "cell death-inducing DFFA-like effector a\n" +
            "cell death-inducing DFFA-like effector c\n" +
            "hearing loss, cisplatin-induced, susceptibility to\n" +
            "class II, major histocompatibility complex, transactivator\n" +
            "ciliary dyskinesia, primary 2\n" +
            "Ciliary dyskinesia, primary, 4\n" +
            "Ciliary dyskinesia, primary, 8\n" +
            "cartilage intermediate layer protein, nucleotide pyrophosphohydrolase\n" +
            "Carotid intimal medial thickness\n" +
            "cyclin-dependent kinase 2 interacting protein\n" +
            "cirrhosis, autosomal recessive 1A cirhin\n" +
            "CDGSH iron sulfur domain 1\n" +
            "CDGSH iron sulfur domain 2\n" +
            "cytokine inducible SH2-containing protein\n" +
            "citron rho-interacting, serine/threonine kinase 21\n" +
            "Cbp/p300-interacting transactivator, with Glu/Asp-rich carboxy-terminal domain, 2\n" +
            "CDKN1A interacting zinc finger protein 1\n" +
            "cytoskeleton associated protein 2\n" +
            "cytoskeleton-associated protein 4\n" +
            "creatine kinase, brain\n" +
            "chemokine-like factor\n" +
            "creatine kinase, muscle\n" +
            "creatine kinase, mitochondrial 1A\n" +
            "creatine kinase, mitochondrial 1B\n" +
            "creatine kinase, mitochondrial 2 sarcomeric\n" +
            "CDC28 protein kinase regulatory subunit 1B\n" +
            "CDC28 protein kinase regulatory subunit 1B pseudogene 2\n" +
            "cerebellar ataxia 3 cerebellar parenchyma disorder 1\n" +
            "cerebellar atrophy with progressive microcephaly\n" +
            "Charcot-Leyden crystal galectin\n" +
            "chloride channel accessory 1\n" +
            "chloride channel accessory 2\n" +
            "chloride channel accessory 4\n" +
            "cardiotrophin-like cytokine factor 1\n" +
            "chloride channel, voltage-sensitive 1\n" +
            "chloride channel, voltage-sensitive 2\n" +
            "chloride channel, voltage-sensitive 4\n" +
            "chloride channel, voltage-sensitive 5\n" +
            "chloride channel, voltage-sensitive 7\n" +
            "chloride channel, voltage-sensitive Ka\n" +
            "chloride channel, voltage-sensitive Kb\n" +
            "claudin 1\n" +
            "claudin 10\n" +
            "claudin 11\n" +
            "claudin 14\n" +
            "claudin 15\n" +
            "claudin 16\n" +
            "claudin 18\n" +
            "claudin 19\n" +
            "claudin 23\n" +
            "claudin 3\n" +
            "claudin 4\n" +
            "claudin 5\n" +
            "claudin 6\n" +
            "claudin 7\n" +
            "claudin 8\n" +
            "claudin 9\n" +
            "C-type lectin domain family 11, member A\n" +
            "C-type lectin domain family 12, member A\n" +
            "C-type lectin domain family 16, member A\n" +
            "C-type lectin domain family 1, member B\n" +
            "C-type lectin domain family 2, member A\n" +
            "C-type lectin domain family 3, member A\n" +
            "C-type lectin domain family 3, member B\n" +
            "C-type lectin domain family 4, member A\n" +
            "C-type lectin domain family 4, member E\n" +
            "C-type lectin domain family 4, member G\n" +
            "C-type lectin domain family 4, member M\n" +
            "C-type lectin domain family 5, member A\n" +
            "C-type lectin domain family 7, member A\n" +
            "calmegin\n" +
            "chloride intracellular channel 2\n" +
            "chloride intracellular channel 4\n" +
            "chloride intracellular channel 5\n" +
            "clathrin interactor 1\n" +
            "CAP-GLY domain containing linker protein 1\n" +
            "CAP-GLY domain containing linker protein 2\n" +
            "CDC-like kinase 1\n" +
            "Leukemia, chronic lymphocytic, susceptibility to, 1\n" +
            "Disrupted in B-cell neoplasia\n" +
            "Leukemia, chronic lymphocytic, susceptibility to, 3\n" +
            "Leukemia, chronic lymphocytic susceptibility to, 4\n" +
            "Leukemia, chronic lymphocytic susceptiblity to, 5\n" +
            "chronic lymphocytic leukemia up-regulated 1\n" +
            "chronic lymphocytic leukemia up-regulated 1 opposite strand\n" +
            "CXADR-like membrane protein\n" +
            "ceroid-lipofuscinosis, neuronal 3\n" +
            "ceroid-lipofuscinosis, neuronal 5\n" +
            "ceroid-lipofuscinosis, neuronal 6, late infantile, variant\n" +
            "ceroid-lipofuscinosis, neuronal 8 epilepsy, progressive with mental retardation\n" +
            "cytokine-dependent hematopoietic cell linker\n" +
            "clock circadian regulator\n" +
            "cleavage and polyadenylation factor I subunit 1\n" +
            "ClpB caseinolytic peptidase B homolog E. coli\n" +
            "caseinolytic mitochondrial matrix peptidase proteolytic subunit\n" +
            "colipase, pancreatic\n" +
            "cleft lip and palate associated transmembrane protein 1\n" +
            "CLPTM1-like\n" +
            "clarin 1\n" +
            "CLRN1 antisense RNA 1\n" +
            "clarin 3\n" +
            "clathrin, heavy chain Hc\n" +
            "clathrin, heavy chain-like 1\n" +
            "clusterin\n" +
            "clusterin-like 1 retinal\n" +
            "clavesin 1\n" +
            "chymase 1, mast cell\n" +
            "cytidine monophospho-N-acetylneuraminic acid hydroxylase, pseudogene\n" +
            "Capillary malformations, hereditary\n" +
            "cytidine monophosphate N-acetylneuraminic acid synthetase\n" +
            "C-x9-C motif containing 1\n" +
            "cardiomyopathy, dilated 1B autosomal dominant\n" +
            "cardiomyopathy, dilated 1C autosomal dominant\n" +
            "cardiomyopathy, dilated 1F autosomal dominant\n" +
            "cardiomyopathy, dilated 1H autosomal dominant\n" +
            "cardiomyopathy, dilated 1K autosomal dominant\n" +
            "cardiomyopathy, dilated 1Q autosomal dominant\n" +
            "Craniometaphyseal dysplasia, autosomal recessive\n" +
            "Cardiomyopathy, familial hypertrophic, 21\n" +
            "cutaneous malignant melanoma/dysplastic nevus\n" +
            "Melanoma, cutaneous malignant, 4\n" +
            "Melanoma, cutaneous malignant, susceptibility to, 7\n" +
            "myasthenia gravis, familial infantile, 1\n" +
            "Charcot-Marie-Tooth neuropathy 1A greatly reduced nerve conduction velocity, hereditary motor sensory neuropathy Ia\n" +
            "Charcot-Marie-Tooth neuropathy 2B\n" +
            "Charcot-Marie-Tooth disease, axonal, type 2G\n" +
            "Charcot-Marie-Tooth disease, dominant intermediate 2\n" +
            "CKLF-like MARVEL transmembrane domain containing 5\n" +
            "Charcot-Marie-Tooth neuropathy, X-linked 2 recessive\n" +
            "Charcot-Marie-Tooth neuropathy, X-linked 3 dominant\n" +
            "CCHC-type zinc finger, nucleic acid binding protein\n" +
            "Carney complex type 2, multiple neoplasia and lentiginosis\n" +
            "Corneal dermoids\n" +
            "carnosine dipeptidase 1 metallopeptidase M20 family\n" +
            "CNDP dipeptidase 2 metallopeptidase M20 family\n" +
            "cyclic nucleotide gated channel alpha 1\n" +
            "cyclic nucleotide gated channel alpha 2\n" +
            "cyclic nucleotide gated channel alpha 3\n" +
            "cyclic nucleotide gated channel beta 1\n" +
            "cyclic nucleotide gated channel beta 3\n" +
            "cyclin M1\n" +
            "cyclin M2\n" +
            "cyclin M4\n" +
            "CCR4-NOT transcription complex, subunit 3\n" +
            "CCR4-NOT transcription complex, subunit 8\n" +
            "2',3'-cyclic nucleotide 3' phosphodiesterase\n" +
            "canopy FGF signaling regulator 3\n" +
            "cannabinoid receptor 1 brain\n" +
            "cannabinoid receptor 2 macrophage\n" +
            "Carnosinemia carnosinase\n" +
            "ciliary neurotrophic factor\n" +
            "ciliary neurotrophic factor receptor\n" +
            "contactin 1\n" +
            "contactin 2 axonal\n" +
            "contactin 4\n" +
            "contactin associated protein 1\n" +
            "contactin associated protein-like 2\n" +
            "centriolin\n" +
            "cytochrome c oxidase assembly factor 5\n" +
            "CoA synthase\n" +
            "cochlin\n" +
            "cone dystrophy 2 X-linked\n" +
            "Cavitary optic disc anomalies\n" +
            "component of oligomeric golgi complex 1\n" +
            "component of oligomeric golgi complex 2\n" +
            "component of oligomeric golgi complex 4\n" +
            "component of oligomeric golgi complex 5\n" +
            "component of oligomeric golgi complex 6\n" +
            "component of oligomeric golgi complex 7\n" +
            "component of oligomeric golgi complex 8\n" +
            "Cohen syndrome QTL 1\n" +
            "Cohen syndrome QTL 2\n" +
            "coilin\n" +
            "collagen, type X, alpha 1\n" +
            "collagen, type XI, alpha 1\n" +
            "collagen, type XI, alpha 2\n" +
            "collagen, type XII, alpha 1\n" +
            "collagen, type XIV, alpha 1\n" +
            "collagen, type XVII, alpha 1\n" +
            "collagen, type XVIII, alpha 1\n" +
            "collagen, type I, alpha 1\n" +
            "collagen, type I, alpha 2\n" +
            "collagen, type XXV, alpha 1\n" +
            "collagen, type XXVI, alpha 1\n" +
            "collagen, type XXVII, alpha 1\n" +
            "collagen, type II, alpha 1\n" +
            "collagen, type III, alpha 1\n" +
            "collagen, type IV, alpha 1\n" +
            "collagen, type IV, alpha 2\n" +
            "collagen, type IV, alpha 3 Goodpasture antigen\n" +
            "collagen, type IV, alpha 3 Goodpasture antigen binding protein\n" +
            "collagen, type IV, alpha 4\n" +
            "collagen, type IV, alpha 5\n" +
            "collagen, type IV, alpha 6\n" +
            "collagen, type V, alpha 1\n" +
            "collagen, type V, alpha 2\n" +
            "collagen, type V, alpha 3\n" +
            "collagen, type VI, alpha 1\n" +
            "collagen, type VI, alpha 2\n" +
            "collagen, type VI, alpha 3\n" +
            "collagen, type VI, alpha 5\n" +
            "collagen, type VII, alpha 1\n" +
            "collagen, type VIII, alpha 1\n" +
            "collagen, type VIII, alpha 2\n" +
            "collagen, type IX, alpha 1\n" +
            "collagen, type IX, alpha 2\n" +
            "collagen, type IX, alpha 3\n" +
            "colorectal cancer associated 1\n" +
            "colorectal cancer associated 2\n" +
            "collectin sub-family member 11\n" +
            "collagen-like tail subunit single strand of homotrimer of asymmetric acetylcholinesterase\n" +
            "Cogan-type congential oculomotor apraxia\n" +
            "copper metabolism Murr1 domain containing 1\n" +
            "COMM domain containing 5\n" +
            "cartilage oligomeric matrix protein\n" +
            "catechol-O-methyltransferase\n" +
            "coatomer protein complex, subunit beta 1\n" +
            "Pulmonary disease, chronic obstructive, severe early-onset\n" +
            "Chronic obstructive pulmonary disease QTL 1\n" +
            "Chronic obstructive pulmonary disease QTL 10\n" +
            "Chronic obstructive pulmonary disease QTL 11\n" +
            "Chronic obstructive pulmonary disease QTL 12\n" +
            "Chronic obstructive pulmonary disease QTL 13\n" +
            "Chronic obstructive pulmonary disease QTL 14\n" +
            "Chronic obstructive pulmonary disease QTL 15\n" +
            "Chronic obstructive pulmonary disease QTL 16\n" +
            "Chronic obstructive pulmonary disease QTL 17\n" +
            "Chronic obstructive pulmonary disease QTL 18\n" +
            "Chronic obstructive pulmonary disease QTL 19\n" +
            "Chronic obstructive pulmonary disease QTL 2\n" +
            "Chronic obstructive pulmonary disease QTL 20\n" +
            "Chronic obstructive pulmonary disease QTL 21\n" +
            "Chronic obstructive pulmonary disease QTL 22\n" +
            "Chronic obstructive pulmonary disease QTL 23\n" +
            "Chronic obstructive pulmonary disease QTL 24\n" +
            "Chronic obstructive pulmonary disease QTL 25\n" +
            "Chronic obstructive pulmonary disease QTL 26\n" +
            "Chronic obstructive pulmonary disease QTL 27\n" +
            "Chronic obstructive pulmonary disease QTL 28\n" +
            "Chronic obstructive pulmonary disease QTL 29\n" +
            "Chronic obstructive pulmonary disease QTL 3\n" +
            "Chronic obstructive pulmonary disease QTL 4\n" +
            "Chronic obstructive pulmonary disease QTL 5\n" +
            "Chronic obstructive pulmonary disease QTL 6\n" +
            "Chronic obstructive pulmonary disease QTL 7\n" +
            "Chronic obstructive pulmonary disease QTL 8\n" +
            "Chronic obstructive pulmonary disease QTL 9\n" +
            "COP9 signalosome subunit 2\n" +
            "COP9 signalosome subunit 5\n" +
            "COP9 signalosome subunit 6\n" +
            "coenzyme Q10 homolog A S. cerevisiae\n" +
            "coenzyme Q2 4-hydroxybenzoate polyprenyltransferase\n" +
            "coenzyme Q6 monooxygenase\n" +
            "coenzyme Q9\n" +
            "cone rod dystrophy 1 autosomal dominant\n" +
            "cone rod dystrophy 17 autosomal dominant\n" +
            "cone rod dystrophy 8\n" +
            "corin, serine peptidase\n" +
            "coronin, actin binding protein, 1A\n" +
            "coronin, actin binding protein, 1B\n" +
            "coronin, actin binding protein, 1C\n" +
            "cortistatin\n" +
            "COTL1 pseudogene 1\n" +
            "cytochrome c oxidase assembly homolog 10 yeast\n" +
            "cytochrome c oxidase assembly homolog 11 yeast\n" +
            "cytochrome c oxidase assembly homolog 14 S. cerevisiae\n" +
            "cytochrome c oxidase assembly homolog 15 yeast\n" +
            "COX16 cytochrome c oxidase assembly homolog S. cerevisiae\n" +
            "COX17 cytochrome c oxidase copper chaperone\n" +
            "COX20 cytochrome C oxidase assembly factor\n" +
            "cytochrome c oxidase subunit IV isoform 1\n" +
            "cytochrome c oxidase subunit IV isoform 2 lung\n" +
            "cytochrome c oxidase subunit Va\n" +
            "cytochrome c oxidase subunit VIa polypeptide 1\n" +
            "cytochrome c oxidase subunit VIb polypeptide 1 ubiquitous\n" +
            "cytochrome c oxidase subunit VIc\n" +
            "cytochrome c oxidase subunit VIIa polypeptide 2 liver\n" +
            "cytochrome c oxidase subunit VIIa polypeptide 2 like\n" +
            "cytochrome c oxidase subunit VIIb\n" +
            "cytochrome c oxidase subunit VIIIC\n" +
            "ceruloplasmin ferroxidase\n" +
            "Lymphocyte cytosolic protein, molecular weight 20kD\n" +
            "carboxypeptidase A1 pancreatic\n" +
            "carboxypeptidase A4\n" +
            "carboxypeptidase A6\n" +
            "cerebral palsy, ataxic 1\n" +
            "carboxypeptidase B1 tissue\n" +
            "carboxypeptidase B2 plasma\n" +
            "Chondrodysplasia with platyspondyly, distinctive brachydactyly, hydrocephaly, and microphthalmia\n" +
            "carboxypeptidase D\n" +
            "carboxypeptidase E\n" +
            "complexin 1\n" +
            "complexin 2\n" +
            "complexin 3\n" +
            "carboxypeptidase N, polypeptide 1\n" +
            "carboxypeptidase O\n" +
            "coproporphyrinogen oxidase\n" +
            "ceruloplasmin ferroxidase pseudogene\n" +
            "carboxypeptidase Q\n" +
            "carbamoyl-phosphate synthase 1, mitochondrial\n" +
            "cleavage and polyadenylation specific factor 2, 100kDa\n" +
            "cleavage and polyadenylation specific factor 3-like\n" +
            "cleavage and polyadenylation specific factor 4, 30kDa\n" +
            "carnitine palmitoyltransferase 1A liver\n" +
            "carnitine palmitoyltransferase 1B muscle\n" +
            "carnitine palmitoyltransferase 2\n" +
            "Ventricular tachycardia, catecholaminergic polymorphic, 3\n" +
            "CPX chromosome region, candidate 1\n" +
            "carboxypeptidase Z\n" +
            "complement component 3b/4b receptor 1 Knops blood group\n" +
            "complement component 3d/Epstein Barr virus receptor 2\n" +
            "cellular retinoic acid binding protein 1\n" +
            "cellular retinoic acid binding protein 2\n" +
            "colorectal adenoma and carcinoma 1\n" +
            "CASP2 and RIPK1 domain containing adaptor with death domain\n" +
            "carnitine O-acetyltransferase\n" +
            "crumbs family member 1, photoreceptor morphogenesis associated\n" +
            "cereblon\n" +
            "Creatinine clearance QTL\n" +
            "Colorectal cancer, susceptibility to, 10\n" +
            "Colorectal cancer, susceptibility to, 11\n" +
            "Colorectal cancer, susceptibility to, 2\n" +
            "Colorectal cancer, susceptibility to, 5\n" +
            "colorectal cancer, susceptibility to, 6\n" +
            "colorectal cancer, susceptibility to, 7\n" +
            "Colorectal cancer, susceptibility to, 8\n" +
            "colorectal cancer, susceptibility to, 9\n" +
            "cAMP responsive element binding protein 1\n" +
            "cAMP responsive element binding protein 3\n" +
            "cAMP responsive element binding protein 3-like 1\n" +
            "cAMP responsive element binding protein 3-like 2\n" +
            "cAMP responsive element binding protein 3-like 3\n" +
            "CREB binding protein\n" +
            "cysteine-rich with EGF-like domains 1\n" +
            "cysteine-rich with EGF-like domains 2\n" +
            "corticotropin releasing hormone\n" +
            "corticotropin releasing hormone binding protein\n" +
            "corticotropin releasing hormone receptor 1\n" +
            "cysteine-rich PDZ-binding protein\n" +
            "cysteine-rich secretory protein 2\n" +
            "cysteine-rich secretory protein 3\n" +
            "v-crk avian sarcoma virus CT10 oncogene homolog\n" +
            "v-crk avian sarcoma virus CT10 oncogene homolog-like\n" +
            "cytokine receptor-like factor 1\n" +
            "cytokine receptor-like factor 2\n" +
            "cytokine receptor-like factor 3\n" +
            "cardiolipin synthase 1\n" +
            "cornulin\n" +
            "ciliary rootlet coiled-coil, rootletin\n" +
            "C-reactive protein, pentraxin-related\n" +
            "Craniosynostosis, Adelaide type\n" +
            "cartilage acidic protein 1\n" +
            "cartilage associated protein\n" +
            "CREB regulated transcription coactivator 1\n" +
            "CREB regulated transcription coactivator 2\n" +
            "CREB regulated transcription coactivator 3\n" +
            "cone-rod homeobox\n" +
            "crystallin, alpha A\n" +
            "crystallin, alpha B\n" +
            "crystallin, beta A1\n" +
            "crystallin, beta A2\n" +
            "crystallin, beta A4\n" +
            "crystallin, beta B1\n" +
            "crystallin, beta B2\n" +
            "crystallin, beta B2 pseudogene 1\n" +
            "crystallin, beta B3\n" +
            "crystallin, gamma B\n" +
            "crystallin, gamma C\n" +
            "crystallin, gamma D\n" +
            "crystallin, gamma S\n" +
            "crystallin, mu\n" +
            "citrate synthase\n" +
            "cysteine sulfinic acid decarboxylase\n" +
            "chondrosarcoma associated gene 1\n" +
            "CSAG family, member 2\n" +
            "CSAG family, member 3\n" +
            "choreoathetosis/spasticity, episodic paroxysmal choreoathetosis/spasticity\n" +
            "colony stimulating factor 1 macrophage\n" +
            "colony stimulating factor 1 receptor\n" +
            "colony stimulating factor 2 granulocyte-macrophage\n" +
            "colony stimulating factor 2 receptor, alpha, low-affinity granulocyte-macrophage\n" +
            "colony stimulating factor 2 receptor, beta, low-affinity granulocyte-macrophage\n" +
            "colony stimulating factor 3 granulocyte\n" +
            "colony stimulating factor 3 receptor granulocyte\n" +
            "chorionic somatomammotropin hormone 1 placental lactogen\n" +
            "chorionic somatomammotropin hormone 2\n" +
            "chorionic somatomammotropin hormone-like 1\n" +
            "CUB and Sushi multiple domains 2\n" +
            "CUB and Sushi multiple domains 3\n" +
            "casein alpha s1\n" +
            "casein beta\n" +
            "casein kappa\n" +
            "casein kinase 1, alpha 1\n" +
            "casein kinase 1, alpha 1-like\n" +
            "casein kinase 1, delta\n" +
            "casein kinase 1, epsilon\n" +
            "casein kinase 2, alpha 1 polypeptide\n" +
            "casein kinase 2, alpha prime polypeptide\n" +
            "casein kinase 2, alpha 3 polypeptide\n" +
            "casein kinase 2, beta polypeptide\n" +
            "chondroitin sulfate proteoglycan 4\n" +
            "chondroitin sulfate proteoglycan 5 neuroglycan C\n" +
            "centrosome and spindle pole associated protein 1\n" +
            "cysteine-serine-rich nuclear protein 3\n" +
            "cysteine and glycine-rich protein 1\n" +
            "cysteine and glycine-rich protein 3 cardiac LIM protein\n" +
            "cystatin SN\n" +
            "cystatin SA\n" +
            "cystatin C\n" +
            "cystatin S\n" +
            "cystatin E/M\n" +
            "cystatin 9 testatin\n" +
            "cystatin A stefin A\n" +
            "cystatin B stefin B\n" +
            "cleavage stimulation factor, 3' pre-RNA, subunit 2, 64kDa\n" +
            "cancer/testis antigen family 45, member A1\n" +
            "cancer/testis antigen 83\n" +
            "cataract, anterior polar 1\n" +
            "cataract, anterior polar 2\n" +
            "cancer/testis antigen 1A\n" ;
    private static String genes =
            "A1BG\n" +
            "A1CF\n" +
            "A2M\n" +
            "A2ML1\n" +
            "A4GALT\n" +
            "AA1\n" +
            "AA2\n" +
            "AAA1\n" +
            "AAA2\n" +
            "AAA3\n" +
            "AAA4\n" +
            "AAAS\n" +
            "AACS\n" +
            "AADAC\n" +
            "AADAT\n" +
            "AAGAB\n" +
            "AAMP\n" +
            "AANAT\n" +
            "AARS\n" +
            "AARS2\n" +
            "AASS\n" +
            "AASTH1\n" +
            "AASTH10\n" +
            "AASTH11\n" +
            "AASTH12\n" +
            "AASTH13\n" +
            "AASTH14\n" +
            "AASTH15\n" +
            "AASTH16\n" +
            "AASTH17\n" +
            "AASTH18\n" +
            "AASTH2\n" +
            "AASTH20\n" +
            "AASTH21\n" +
            "AASTH22\n" +
            "AASTH23\n" +
            "AASTH24\n" +
            "AASTH25\n" +
            "AASTH26\n" +
            "AASTH27\n" +
            "AASTH28\n" +
            "AASTH29\n" +
            "AASTH30\n" +
            "AASTH32\n" +
            "AASTH33\n" +
            "AASTH34\n" +
            "AASTH35\n" +
            "AASTH36\n" +
            "AASTH37\n" +
            "AASTH38\n" +
            "AASTH39\n" +
            "AASTH4\n" +
            "AASTH40\n" +
            "AASTH41\n" +
            "AASTH42\n" +
            "AASTH43\n" +
            "AASTH44\n" +
            "AASTH47\n" +
            "AASTH48\n" +
            "AASTH49\n" +
            "AASTH5\n" +
            "AASTH50\n" +
            "AASTH51\n" +
            "AASTH52\n" +
            "AASTH53\n" +
            "AASTH54\n" +
            "AASTH55\n" +
            "AASTH56\n" +
            "AASTH6\n" +
            "AASTH7\n" +
            "AASTH8\n" +
            "AASTH9\n" +
            "AAT1\n" +
            "AAT2\n" +
            "AATK\n" +
            "AAVS1\n" +
            "ABAT\n" +
            "ABCA1\n" +
            "ABCA12\n" +
            "ABCA2\n" +
            "ABCA3\n" +
            "ABCA4\n" +
            "ABCA5\n" +
            "ABCB1\n" +
            "ABCB11\n" +
            "ABCB4\n" +
            "ABCB6\n" +
            "ABCB7\n" +
            "ABCC1\n" +
            "ABCC10\n" +
            "ABCC11\n" +
            "ABCC12\n" +
            "ABCC2\n" +
            "ABCC3\n" +
            "ABCC4\n" +
            "ABCC5\n" +
            "ABCC6\n" +
            "ABCC8\n" +
            "ABCC9\n" +
            "ABCD1\n" +
            "ABCD2\n" +
            "ABCD3\n" +
            "ABCD4\n" +
            "ABCF2\n" +
            "ABCG1\n" +
            "ABCG2\n" +
            "ABCG5\n" +
            "ABCG8\n" +
            "ABHD11\n" +
            "ABHD12\n" +
            "ABHD5\n" +
            "ABI1\n" +
            "ABL1\n" +
            "ABL2\n" +
            "ABO\n" +
            "ABR\n" +
            "ABRA\n" +
            "ABT1\n" +
            "AC004862.6\n" +
            "AC007246.3\n" +
            "AC007743.1\n" +
            "AC008697.1\n" +
            "AC009264.1\n" +
            "AC009948.5\n" +
            "AC017060.1\n" +
            "AC018647.3\n" +
            "AC019117.1\n" +
            "AC079586.1\n" +
            "AC091878.1\n" +
            "AC097662.2\n" +
            "ACAA1\n" +
            "ACAA2\n" +
            "ACACA\n" +
            "ACACB\n" +
            "ACAD11\n" +
            "ACAD8\n" +
            "ACAD9\n" +
            "ACADL\n" +
            "ACADM\n" +
            "ACADS\n" +
            "ACADSB\n" +
            "ACADVL\n" +
            "ACAN\n" +
            "ACAT1\n" +
            "ACAT2\n" +
            "ACBD5\n" +
            "ACD\n" +
            "ACE\n" +
            "ACE2\n" +
            "ACER1\n" +
            "ACER2\n" +
            "ACER3\n" +
            "ACF\n" +
            "ACHE\n" +
            "ACIN1\n" +
            "ACKR3\n" +
            "ACKR4\n" +
            "ACLS\n" +
            "ACO1\n" +
            "ACO2\n" +
            "ACOT11\n" +
            "ACOT13\n" +
            "ACOT7\n" +
            "ACOX1\n" +
            "ACOX3\n" +
            "ACP1\n" +
            "ACP2\n" +
            "ACP5\n" +
            "ACP6\n" +
            "ACPP\n" +
            "ACPT\n" +
            "ACR\n" +
            "ACRBP\n" +
            "ACRC\n" +
            "ACRPS\n" +
            "ACRPV\n" +
            "ACRV1\n" +
            "ACSF3\n" +
            "ACSL3\n" +
            "ACSL4\n" +
            "ACSL5\n" +
            "ACSL6\n" +
            "ACSM3\n" +
            "ACSS3\n" +
            "ACT\n" +
            "ACTA1\n" +
            "ACTA2\n" +
            "ACTB\n" +
            "ACTC1\n" +
            "ACTG1\n" +
            "ACTG2\n" +
            "ACTL7A\n" +
            "ACTL7B\n" +
            "ACTL9\n" +
            "ACTN1\n" +
            "ACTN2\n" +
            "ACTN3\n" +
            "ACTN4\n" +
            "ACTR2\n" +
            "ACTR3BP6\n" +
            "ACTR3C\n" +
            "ACVR1\n" +
            "ACVR1B\n" +
            "ACVR1C\n" +
            "ACVR2A\n" +
            "ACVR2B\n" +
            "ACVRL1\n" +
            "ACY1\n" +
            "ACY3\n" +
            "AD10\n" +
            "AD11\n" +
            "AD12\n" +
            "AD13\n" +
            "AD14\n" +
            "AD15\n" +
            "AD16\n" +
            "AD17\n" +
            "AD5\n" +
            "AD6\n" +
            "AD7\n" +
            "AD8\n" +
            "AD9\n" +
            "ADA\n" +
            "ADAL\n" +
            "ADAM10\n" +
            "ADAM11\n" +
            "ADAM17\n" +
            "ADAM21P1\n" +
            "ADAM22\n" +
            "ADAM33\n" +
            "ADAM3A\n" +
            "ADAM7\n" +
            "ADAM8\n" +
            "ADAM9\n" +
            "ADAMTS1\n" +
            "ADAMTS10\n" +
            "ADAMTS13\n" +
            "ADAMTS17\n" +
            "ADAMTS18\n" +
            "ADAMTS2\n" +
            "ADAMTS20\n" +
            "ADAMTSL1\n" +
            "ADAMTSL2\n" +
            "ADAMTSL3\n" +
            "ADAMTSL4\n" +
            "ADAP2\n" +
            "ADAR\n" +
            "ADAT3\n" +
            "ADCK2\n" +
            "ADCK3\n" +
            "ADCK4\n" +
            "ADCY1\n" +
            "ADCY10\n" +
            "ADCY2\n" +
            "ADCY3\n" +
            "ADCY4\n" +
            "ADCY5\n" +
            "ADCY6\n" +
            "ADCY7\n" +
            "ADCY8\n" +
            "ADCY9\n" +
            "ADCYAP1\n" +
            "ADCYAP1R1\n" +
            "ADD1\n" +
            "ADD2\n" +
            "ADD3\n" +
            "ADFN\n" +
            "ADH1A\n" +
            "ADH1B\n" +
            "ADH1C\n" +
            "ADH4\n" +
            "ADH5\n" +
            "ADH5P4\n" +
            "ADH6\n" +
            "ADH7\n" +
            "ADHD1\n" +
            "ADHD2\n" +
            "ADHD3\n" +
            "ADHD4\n" +
            "ADIPOQ\n" +
            "ADIPOR1\n" +
            "ADIPOR2\n" +
            "ADIPQTL2\n" +
            "ADIPQTL3\n" +
            "ADIPQTL4\n" +
            "ADIPQTL5\n" +
            "ADIRF\n" +
            "ADK\n" +
            "ADM\n" +
            "ADNP\n" +
            "ADORA1\n" +
            "ADORA2A\n" +
            "ADORA2B\n" +
            "ADORA3\n" +
            "ADPGK\n" +
            "ADPRH\n" +
            "ADRA1A\n" +
            "ADRA1B\n" +
            "ADRA1D\n" +
            "ADRA2A\n" +
            "ADRA2B\n" +
            "ADRA2C\n" +
            "ADRB1\n" +
            "ADRB2\n" +
            "ADRB3\n" +
            "ADRBK2\n" +
            "ADSL\n" +
            "ADSS\n" +
            "AEBP1\n" +
            "AES\n" +
            "AFA\n" +
            "AFA1\n" +
            "AFAP1L1\n" +
            "AFD1\n" +
            "AFF1\n" +
            "AFF2\n" +
            "AFF3\n" +
            "AFF4\n" +
            "AFG3L2\n" +
            "AFM\n" +
            "AFP\n" +
            "AGA\n" +
            "AGA2\n" +
            "AGA3\n" +
            "AGAP2\n" +
            "AGBL1\n" +
            "AGER\n" +
            "AGFG1\n" +
            "AGFG2\n" +
            "AGGF1\n" +
            "AGK\n" +
            "AGL\n" +
            "AGMX2\n" +
            "AGPAT2\n" +
            "AGPAT9\n" +
            "AGPS\n" +
            "AGR3\n" +
            "AGRN\n" +
            "AGRP\n" +
            "AGSPX\n" +
            "AGT\n" +
            "AGTR1\n" +
            "AGTR2\n" +
            "AGXT\n" +
            "AGXT2\n" +
            "AHCY\n" +
            "AHDC1\n" +
            "AHI1\n" +
            "AHNAK2\n" +
            "AHR\n" +
            "AHSA1\n" +
            "AHSG\n" +
            "AHSP\n" +
            "AIC\n" +
            "AICDA\n" +
            "AIF1\n" +
            "AIFM1\n" +
            "AIFM2\n" +
            "AIG1\n" +
            "AIH3\n" +
            "AIM1\n" +
            "AIM2\n" +
            "AIMP1\n" +
            "AIP\n" +
            "AIPL1\n" +
            "AIR\n" +
            "AIRE\n" +
            "AIS1\n" +
            "AIS2\n" +
            "AIS3\n" +
            "AIS4\n" +
            "AITD1\n" +
            "AITD2\n" +
            "AITD4\n" +
            "AK1\n" +
            "AK2\n" +
            "AK5\n" +
            "AK7\n" +
            "AKAP10\n" +
            "AKAP12\n" +
            "AKAP13\n" +
            "AKAP17A\n" +
            "AKAP5\n" +
            "AKAP9\n" +
            "AKIP1\n" +
            "AKR1A1\n" +
            "AKR1B1\n" +
            "AKR1B10\n" +
            "AKR1B1P2\n" +
            "AKR1C2\n" +
            "AKR1C3\n" +
            "AKR1C4\n" +
            "AKR1D1\n" +
            "AKR7A2\n" +
            "AKR7A3\n" +
            "AKT1\n" +
            "AKT2\n" +
            "AKT3\n" +
            "AKTIP\n" +
            "AL592528.1\n" +
            "ALAD\n" +
            "ALAS1\n" +
            "ALAS2\n" +
            "ALB\n" +
            "ALDH16A1\n" +
            "ALDH18A1\n" +
            "ALDH1A1\n" +
            "ALDH1A2\n" +
            "ALDH1A3\n" +
            "ALDH1B1\n" +
            "ALDH1L1\n" +
            "ALDH2\n" +
            "ALDH3A1\n" +
            "ALDH3A2\n" +
            "ALDH3B1\n" +
            "ALDH4A1\n" +
            "ALDH5A1\n" +
            "ALDH6A1\n" +
            "ALDH7A1\n" +
            "ALDH9A1\n" +
            "ALDOA\n" +
            "ALDOB\n" +
            "ALDOC\n" +
            "ALG1\n" +
            "ALG10\n" +
            "ALG10B\n" +
            "ALG11\n" +
            "ALG12\n" +
            "ALG13\n" +
            "ALG14\n" +
            "ALG2\n" +
            "ALG3\n" +
            "ALG6\n" +
            "ALG8\n" +
            "ALG9\n" +
            "ALK\n" +
            "ALKBH3\n" +
            "ALL1\n" +
            "ALL2\n" +
            "ALLC\n" +
            "ALMS1\n" +
            "ALMS1P\n" +
            "ALOX12\n" +
            "ALOX12B\n" +
            "ALOX15\n" +
            "ALOX15B\n" +
            "ALOX5\n" +
            "ALOX5AP\n" +
            "ALOXE3\n" +
            "ALPI\n" +
            "ALPL\n" +
            "ALPP\n" +
            "ALPPL2\n" +
            "ALPQTL2\n" +
            "ALRH\n" +
            "ALS2\n" +
            "ALS2CL\n" +
            "ALS3\n" +
            "ALS5\n" +
            "ALS7\n" +
            "ALX1\n" +
            "ALX3\n" +
            "ALX4\n" +
            "AMACR\n" +
            "AMBN\n" +
            "AMBP\n" +
            "AMCN\n" +
            "AMD1\n" +
            "AMELX\n" +
            "AMELY\n" +
            "AMER1\n" +
            "AMER2\n" +
            "AMFR\n" +
            "AMH\n" +
            "AMHR2\n" +
            "AMIGO2\n" +
            "AMIGO3\n" +
            "AMLCR2\n" +
            "AMMEC\n" +
            "AMMECR1\n" +
            "AMN\n" +
            "AMPD1\n" +
            "AMPD2\n" +
            "AMPD3\n" +
            "AMPH\n" +
            "AMT\n" +
            "AMTN\n" +
            "AMY2A\n" +
            "AN\n" +
            "ANAPC11\n" +
            "ANBC\n" +
            "ANC\n" +
            "ANCR\n" +
            "ANG\n" +
            "ANGPT1\n" +
            "ANGPT2\n" +
            "ANGPTL2\n" +
            "ANGPTL3\n" +
            "ANGPTL4\n" +
            "ANGPTL6\n" +
            "ANIB1\n" +
            "ANIB10\n" +
            "ANIB11\n" +
            "ANIB2\n" +
            "ANIB3\n" +
            "ANIB4\n" +
            "ANIB5\n" +
            "ANIB6\n" +
            "ANIB7\n" +
            "ANIB8\n" +
            "ANIB9\n" +
            "ANIC\n" +
            "ANK1\n" +
            "ANK2\n" +
            "ANK3\n" +
            "ANKEF1\n" +
            "ANKFN1\n" +
            "ANKH\n" +
            "ANKHD1\n" +
            "ANKK1\n" +
            "ANKLE2\n" +
            "ANKRD1\n" +
            "ANKRD11\n" +
            "ANKRD16\n" +
            "ANKRD17\n" +
            "ANKRD2\n" +
            "ANKRD26\n" +
            "ANKRD30A\n" +
            "ANKRD30B\n" +
            "ANKRD36B\n" +
            "ANKRD55\n" +
            "ANKS1A\n" +
            "ANKS1B\n" +
            "ANKS4B\n" +
            "ANKS6\n" +
            "ANLN\n" +
            "ANMA\n" +
            "ANO1\n" +
            "ANO10\n" +
            "ANO3\n" +
            "ANO5\n" +
            "ANO6\n" +
            "ANO7\n" +
            "ANON1\n" +
            "ANOP1\n" +
            "ANP32A\n" +
            "ANPEP\n" +
            "ANTXR1\n" +
            "ANTXR2\n" +
            "ANXA2R\n" +
            "ANXA4\n" +
            "ANXA5\n" +
            "ANXA6\n" +
            "ANXA7\n" +
            "ANXA8\n" +
            "ANXA8L2\n" +
            "AOC1\n" +
            "AOC2\n" +
            "AOC3\n" +
            "AOCH\n" +
            "AOMS1\n" +
            "AOMS2\n" +
            "AOS\n" +
            "AOX1\n" +
            "AP1B1\n" +
            "AP1G1\n" +
            "AP1S1\n" +
            "AP1S2\n" +
            "AP1S3\n" +
            "AP2A2\n" +
            "AP2S1\n" +
            "AP3B1\n" +
            "AP3B2\n" +
            "AP4B1\n" +
            "AP4E1\n" +
            "AP4M1\n" +
            "AP4S1\n" +
            "AP5M1\n" +
            "AP5Z1\n" +
            "APAF1\n" +
            "APBA1\n" +
            "APBA3\n" +
            "APBB1\n" +
            "APBB2\n" +
            "APC\n" +
            "APC2\n" +
            "APCDD1\n" +
            "APCS\n" +
            "APEH\n" +
            "APEX1\n" +
            "APEX2\n" +
            "APITD1\n" +
            "APLF\n" +
            "APLN\n" +
            "APLNR\n" +
            "APLP1\n" +
            "APMR1\n" +
            "APMR2\n" +
            "APMR3\n" +
            "APOA1\n" +
            "APOA2\n" +
            "APOA4\n" +
            "APOA5\n" +
            "APOB\n" +
            "APOBEC1\n" +
            "APOBEC3A\n" +
            "APOBEC3B\n" +
            "APOBEC3C\n" +
            "APOBEC3D\n" +
            "APOBEC3F\n" +
            "APOBEC3G\n" +
            "APOBEC3H\n" +
            "APOC1\n" +
            "APOC1P1\n" +
            "APOC2\n" +
            "APOC3\n" +
            "APOC4\n" +
            "APOD\n" +
            "APOE\n" +
            "APOF" +
            "APOH\n" +
            "APOL1\n" +
            "APOL2\n" +
            "APOL4\n" +
            "APOLD1\n" +
            "APOM\n" +
            "APOPT1\n" +
            "APP\n" +
            "APPBP2\n" +
            "APPL1\n" +
            "APPL2\n" +
            "APRT\n" +
            "APTX\n" +
            "AQP1\n" +
            "AQP12B\n" +
            "AQP2\n" +
            "AQP3\n" +
            "AQP4\n" +
            "AQP5\n" +
            "AQP6\n" +
            "AQP7\n" +
            "AQP8\n" +
            "AQP9\n" +
            "AQPEP\n" +
            "AR\n" +
            "ARAF\n" +
            "ARAP2\n" +
            "ARC\n" +
            "ARCI7\n" +
            "ARCI9\n" +
            "AREG\n" +
            "AREGB\n" +
            "ARF1\n" +
            "ARF1P1\n" +
            "ARF3\n" +
            "ARF4\n" +
            "ARF5\n" +
            "ARF6\n" +
            "ARFGEF2\n" +
            "ARFRP1\n" +
            "ARG1\n" +
            "ARG2\n" +
            "ARHGAP1\n" +
            "ARHGAP17\n" +
            "ARHGAP23\n" +
            "ARHGAP24\n" +
            "ARHGAP26\n" +
            "ARHGAP31\n" +
            "ARHGAP32\n" +
            "ARHGAP33\n" +
            "ARHGAP4\n" +
            "ARHGAP6\n" +
            "ARHGDIA\n" +
            "ARHGEF1\n" +
            "ARHGEF10\n" +
            "ARHGEF12\n" +
            "ARHGEF16\n" +
            "ARHGEF19\n" +
            "ARHGEF3\n" +
            "ARHGEF6\n" +
            "ARHGEF7\n" +
            "ARHGEF9\n" +
            "ARHI1\n" +
            "ARHI2\n" +
            "ARID1A\n" +
            "ARID1B\n" +
            "ARID3B\n" +
            "ARID4A\n" +
            "ARID4B\n" +
            "ARID5A\n" +
            "ARID5B\n" +
            "ARL1\n" +
            "ARL11\n" +
            "ARL13B\n" +
            "ARL14\n" +
            "ARL17A\n" +
            "ARL2\n" +
            "ARL2BP\n" +
            "ARL3\n" +
            "ARL4D\n" +
            "ARL5A\n" +
            "ARL6\n" +
            "ARL6IP1\n" +
            "ARMC10\n" +
            "ARMC4\n" +
            "ARMC5\n" +
            "ARMC9\n" +
            "ARMS2\n" +
            "ARNT\n" +
            "ARNT2\n" +
            "ARNTL2\n" +
            "ARPC5L\n" +
            "ARR3\n" +
            "ARRB1\n" +
            "ARRB2\n" +
            "ARSA\n" +
            "ARSB\n" +
            "ARSD\n" +
            "ARSE\n" +
            "ARSH\n" +
            "ARSI\n" +
            "ART1\n" +
            "ART4\n" +
            "ARTN\n" +
            "ARVCF\n" +
            "ARVD3\n" +
            "ARVD4\n" +
            "ARVD6\n" +
            "ARX\n" +
            "ASAH1\n" +
            "ASAH2\n" +
            "ASAP2\n" +
            "ASAP3\n" +
            "ASB10\n" +
            "ASB14\n" +
            "ASB16-AS1\n" +
            "ASB2\n" +
            "ASCC1\n" +
            "ASCL1\n" +
            "ASD1\n" +
            "ASDP\n" +
            "ASGR1\n" +
            "ASGR2\n" +
            "ASIC5\n" +
            "ASIP\n" +
            "ASL\n" +
            "ASMD\n" +
            "ASMT\n" +
            "ASMTL\n" +
            "ASNA1\n" +
            "ASNS\n" +
            "ASPA\n" +
            "ASPG1\n" +
            "ASPG2\n" +
            "ASPG3\n" +
            "ASPG4\n" +
            "ASPH\n" +
            "ASPM\n" +
            "ASPN\n" +
            "ASPSCR1\n" +
            "ASRGL1\n" +
            "ASRT3\n" +
            "ASRT4\n" +
            "ASRT6\n" +
            "ASRT8\n" +
            "ASS1\n" +
            "ASS1P7\n" +
            "ASS1P8\n" +
            "ASTE1\n" +
            "ASTN2\n" +
            "ASXL1\n" +
            "ASXL3\n" +
            "ATAD2\n" +
            "ATCAY\n" +
            "ATD\n" +
            "ATF1\n" +
            "ATF2\n" +
            "ATF3\n" +
            "ATF4\n" +
            "ATF5\n" +
            "ATF6\n" +
            "ATFB1\n" +
            "ATFB2\n" +
            "ATFB5\n" +
            "ATFB8\n" +
            "ATG14\n" +
            "ATG16L1\n" +
            "ATG4C\n" +
            "ATG9B\n" +
            "ATHS\n" +
            "ATIC\n" +
            "ATL1\n" +
            "ATL2\n" +
            "ATL3\n" +
            "ATM\n" +
            "ATN1\n" +
            "ATOD1\n" +
            "ATOD3\n" +
            "ATOD5\n" +
            "ATOD6\n" +
            "ATOD7\n" +
            "ATOH1\n" +
            "ATOH7\n" +
            "ATP10A\n" +
            "ATP11A\n" +
            "ATP12A\n" +
            "ATP13A2\n" +
            "ATP13A4\n" +
            "ATP1A1\n" +
            "ATP1A2\n" +
            "ATP1A3\n" +
            "ATP1B1\n" +
            "ATP1B2\n" +
            "ATP1B4\n" +
            "ATP2A1\n" +
            "ATP2A2\n" +
            "ATP2A3\n" +
            "ATP2B2\n" +
            "ATP2B3\n" +
            "ATP2C1\n" +
            "ATP2C2\n" +
            "ATP4A\n" +
            "ATP5A1\n" +
            "ATP5E\n" +
            "ATP5G1\n" +
            "ATP5G2\n" +
            "ATP5G2P2\n" +
            "ATP5G3\n" +
            "ATP5H\n" +
            "ATP5LP5\n" +
            "ATP5O\n" +
            "ATP6AP2\n" +
            "ATP6V0A2\n" +
            "ATP6V0A4\n" +
            "ATP6V0B\n" +
            "ATP6V0E2\n" +
            "ATP6V1A\n" +
            "ATP6V1B1\n" +
            "ATP6V1B2\n" +
            "ATP6V1E1\n" +
            "ATP6V1G2-DDX39B\n" +
            "ATP7A\n" +
            "ATP7B\n" +
            "ATP8A2\n" +
            "ATP8A2P3\n" +
            "ATP8B1\n" +
            "ATPAF1\n" +
            "ATPAF2\n" +
            "ATPLS\n" +
            "ATR\n" +
            "ATRIP\n" +
            "ATRN\n" +
            "ATRNL1\n" +
            "ATRX\n" +
            "ATXN1\n" +
            "ATXN10\n" +
            "ATXN2\n" +
            "ATXN3\n" +
            "ATXN3L\n" +
            "ATXN7\n" +
            "ATXN8\n" +
            "ATXN8OS\n" +
            "AUH\n" +
            "AUNX1\n" +
            "AURKA\n" +
            "AURKAIP1\n" +
            "AURKB\n" +
            "AURKC\n" +
            "AUTS1\n" +
            "AUTS11\n" +
            "AUTS12\n" +
            "AUTS13\n" +
            "AUTS2\n" +
            "AUTS3\n" +
            "AUTS5\n" +
            "AUTS6\n" +
            "AUTS7\n" +
            "AUTS8\n" +
            "AVEN\n" +
            "AVIL\n" +
            "AVP\n" +
            "AVPR1A\n" +
            "AVPR1B\n" +
            "AVPR2\n" +
            "AVSD1\n" +
            "AXIN1\n" +
            "AXIN2\n" +
            "AXL\n" +
            "AZF1\n" +
            "AZGP1\n" +
            "AZU1\n" +
            "B2M\n" +
            "B3GALNT1\n" +
            "B3GALNT2\n" +
            "B3GALT2\n" +
            "B3GALT4\n" +
            "B3GALT6\n" +
            "B3GALTL\n" +
            "B3GAT1\n" +
            "B3GAT3\n" +
            "B3GNT1\n" +
            "B3GNT4\n" +
            "B4GALNT1\n" +
            "B4GALNT2\n" +
            "B4GALT1\n" +
            "B4GALT5\n" +
            "B4GALT6\n" +
            "B4GALT7\n" +
            "B6QTL1\n" +
            "B9D1\n" +
            "B9D2\n" +
            "bA255A11.4\n" +
            "BAALC\n" +
            "BAAT\n" +
            "BACE1\n" +
            "BACE1-AS\n" +
            "BACE2\n" +
            "BACH1\n" +
            "BAD\n" +
            "BAG1\n" +
            "BAG2\n" +
            "BAG3\n" +
            "BAG4\n" +
            "BAG5\n" +
            "BAG6\n" +
            "BAGE\n" +
            "BAHD1\n" +
            "BAI1\n" +
            "BAIAP2L1\n" +
            "BAK1\n" +
            "BAMBI\n" +
            "BANF1\n" +
            "BANK1\n" +
            "BAP1\n" +
            "BARD1\n" +
            "BARX1\n" +
            "BATF2\n" +
            "BAX\n" +
            "BAZ1A\n" +
            "BAZ1B\n" +
            "BBC3\n" +
            "BBIP1\n" +
            "BBOX1\n" +
            "BBS1\n" +
            "BBS10\n" +
            "BBS12\n" +
            "BBS2\n" +
            "BBS4\n" +
            "BBS5\n" +
            "BBS7\n" +
            "BBS9\n" +
            "BBX\n" +
            "BCAM\n" +
            "BCAP31\n" +
            "BCAR1\n" +
            "BCAR3\n" +
            "BCAR4\n" +
            "BCAS1\n" +
            "BCAS2\n" +
            "BCAS3\n" +
            "BCAS4\n" +
            "BCAT1\n" +
            "BCAT2\n" +
            "BCC1\n" +
            "BCC2\n" +
            "BCC3\n" +
            "BCC4\n" +
            "BCC5\n" +
            "BCC6\n" +
            "BCDIN3D-AS1\n" +
            "BCHE\n" +
            "BCKDHA\n" +
            "BCKDHB\n" +
            "BCKDK\n" +
            "BCL10\n" +
            "BCL11A\n" +
            "BCL2\n" +
            "BCL2A1\n" +
            "BCL2L1\n" +
            "BCL2L10\n" +
            "BCL2L11\n" +
            "BCL2L12\n" +
            "BCL2L13\n" +
            "BCL2L2\n" +
            "BCL3\n" +
            "BCL6\n" +
            "BCL7A\n" +
            "BCL7B\n" +
            "BCL7C\n" +
            "BCL9\n" +
            "BCL9L\n" +
            "BCMO1\n" +
            "BCOR\n" +
            "BCPR\n" +
            "BCR\n" +
            "BCS1L\n" +
            "BDA1B\n" +
            "BDET\n" +
            "BDH1\n" +
            "BDKRB1\n" +
            "BDKRB2\n" +
            "BDNF\n" +
            "BEAN1\n" +
            "BECN1\n" +
            "BED\n" +
            "BEST1\n" +
            "BEST2\n" +
            "BEST3\n" +
            "BEST4\n" +
            "BET1\n" +
            "BET1L\n" +
            "BEX1\n" +
            "BEX2\n" +
            "BFIC2\n" +
            "BFIS1\n" +
            "BFIS4\n" +
            "BFSP1\n" +
            "BFSP2\n" +
            "BGLAP\n" +
            "BGN\n" +
            "BHD\n" +
            "BHLHA9\n" +
            "BHLHE41\n" +
            "BHMT\n" +
            "BHMT2\n" +
            "BICC1\n" +
            "BICD1\n" +
            "BICD2\n" +
            "BID\n" +
            "BIN1\n" +
            "BIN2\n" +
            "BIN3\n" +
            "BIRC2\n" +
            "BIRC3\n" +
            "BIRC5\n" +
            "BIRC7\n" +
            "BLACE\n" +
            "BLID\n" +
            "BLK\n" +
            "BLM\n" +
            "BLMH\n" +
            "BLNK\n" +
            "BLOC1S3\n" +
            "BLOC1S6\n" +
            "BLVRA\n" +
            "BLVRB\n" +
            "BLZF1\n" +
            "BMI1\n" +
            "BMIQ10\n" +
            "BMIQ16\n" +
            "BMIQ4\n" +
            "BMIQ7\n" +
            "BMIQ8\n" +
            "BMND7\n" +
            "BMND8\n" +
            "BMP1\n" +
            "BMP10\n" +
            "BMP15\n" +
            "BMP2\n" +
            "BMP3\n" +
            "BMP4\n" +
            "BMP5\n" +
            "BMP6\n" +
            "BMP7\n" +
            "BMP8B\n" +
            "BMPER\n" +
            "BMPR1A\n" +
            "BMPR1B\n" +
            "BMPR2\n" +
            "BMS1\n" +
            "BMX\n" +
            "BNIP1\n" +
            "BNIP3\n" +
            "BNIP3L\n" +
            "BNIPL\n" +
            "BOK\n" +
            "BOLA3\n" +
            "BOLL\n" +
            "BOP\n" +
            "BOS2\n" +
            "BP1\n" +
            "BP28\n" +
            "BP51\n" +
            "BPGM\n" +
            "BPI\n" +
            "BPIFA1\n" +
            "BPIFA4P\n" +
            "BPPV\n" +
            "BPY2\n" +
            "BPY2B\n" +
            "BPY2C\n" +
            "BRAF\n" +
            "BRAT1\n" +
            "BRCA1\n" +
            "BRCA2\n" +
            "BRCA3\n" +
            "BRCATA\n" +
            "BRCC3\n" +
            "BRD2\n" +
            "BRD7\n" +
            "BRD9\n" +
            "BREA2\n" +
            "BRF2\n" +
            "BRI3BP\n" +
            "BRINP3\n" +
            "BRIP1\n" +
            "BRKS1\n" +
            "BRMS1\n" +
            "BRMS1L" +
            "BRS3\n" +
            "BRSK2\n" +
            "BRV2\n" +
            "BRWD1\n" +
            "BRWD3\n" +
            "BSCL2\n" +
            "BSG\n" +
            "BSND\n" +
            "BST1\n" +
            "BST2\n" +
            "BSX\n" +
            "BTBD1\n" +
            "BTBD10\n" +
            "BTBD9\n" +
            "BTC\n" +
            "BTD\n" +
            "BTG1\n" +
            "BTK\n" +
            "BTLA\n" +
            "BTNL2\n" +
            "BTRC\n" +
            "BTS1\n" +
            "BUB1\n" +
            "BUB1B\n" +
            "BUB3\n" +
            "BULN\n" +
            "BVR1\n" +
            "BW32\n" +
            "BW33\n" +
            "BW34\n" +
            "BYSL\n" +
            "BZW1\n" +
            "BZX\n" +
            "C10orf11\n" +
            "C10orf2\n" +
            "C10orf25\n" +
            "C11orf31\n" +
            "C11orf68\n" +
            "C11orf74\n" +
            "C11orf82\n" +
            "C11orf95\n" +
            "C12orf39\n" +
            "C12orf57\n" +
            "C12orf65\n" +
            "C15orf41\n" +
            "C15orf48\n" +
            "C16DELQ22\n" +
            "C16orf62\n" +
            "C17orf70\n" +
            "C17orf80\n" +
            "C17orf85\n" +
            "C18orf54\n" +
            "C18orf8\n" +
            "C19orf12\n" +
            "C19orf26\n" +
            "C19orf40\n" +
            "C19orf48\n" +
            "C19orf80\n" +
            "C1GALT1\n" +
            "C1GALT1C1\n" +
            "C1orf127\n" +
            "C1orf192\n" +
            "C1orf35\n" +
            "C1orf43\n" +
            "C1orf64\n" +
            "C1QA\n" +
            "C1QB\n" +
            "C1QC\n" +
            "C1QTNF5\n" +
            "C1R\n" +
            "C1RL\n" +
            "C1S\n" +
            "C2\n" +
            "C20orf57\n" +
            "C20orf85\n" +
            "C21orf2\n" +
            "C21orf33\n" +
            "C21orf59\n" +
            "C2CD3\n" +
            "C2orf40\n" +
            "C2orf43\n" +
            "C2orf68\n" +
            "C2orf71\n" +
            "C3\n" +
            "C3AR1\n" +
            "C3orf35\n" +
            "C3orf58\n" +
            "C3orf72\n" +
            "C4A\n" +
            "C4B\n" +
            "C4BPA\n" +
            "C4BPB\n" +
            "C4B_2\n" +
            "C4orf26\n" +
            "C4orf3\n" +
            "C4orf6\n" +
            "C5\n" +
            "C5AR1\n" +
            "C5AR2\n" +
            "C5orf20\n" +
            "C5orf42\n" +
            "C6\n" +
            "C6orf100\n" +
            "C6orf15\n" +
            "C6orf211\n" +
            "C6orf25\n" +
            "C6orf47\n" +
            "C6orf7\n" +
            "C7\n" +
            "C7orf49\n" +
            "C7orf55\n" +
            "C7orf66\n" +
            "C8A\n" +
            "C8B\n" +
            "C8G\n" +
            "C8orf12\n" +
            "C8orf37\n" +
            "C8orf4\n" +
            "C9\n" +
            "C9orf3\n" +
            "C9orf53\n" +
            "C9orf72\n" +
            "C9orf78\n" +
            "C9orf9\n" +
            "CA1\n" +
            "CA10\n" +
            "CA12\n" +
            "CA13\n" +
            "CA2\n" +
            "CA3\n" +
            "CA4\n" +
            "CA5A\n" +
            "CA6\n" +
            "CA8\n" +
            "CA9\n" +
            "CABIN1\n" +
            "CABP2\n" +
            "CABP4\n" +
            "CABP5\n" +
            "CACNA1A\n" +
            "CACNA1B\n" +
            "CACNA1C\n" +
            "CACNA1D\n" +
            "CACNA1E\n" +
            "CACNA1F\n" +
            "CACNA1H\n" +
            "CACNA1S\n" +
            "CACNA2D1\n" +
            "CACNA2D2\n" +
            "CACNA2D3\n" +
            "CACNA2D4\n" +
            "CACNB1\n" +
            "CACNB2\n" +
            "CACNB3\n" +
            "CACNB4\n" +
            "CACNG1\n" +
            "CACNG2\n" +
            "CACNG3\n" +
            "CACNG5\n" +
            "CACNG6\n" +
            "CACNG8\n" +
            "CACYBP\n" +
            "CADM1\n" +
            "CADPS\n" +
            "CAHM\n" +
            "CALB1\n" +
            "CALB2\n" +
            "CALCA\n" +
            "CALCB\n" +
            "CALCR\n" +
            "CALCRL\n" +
            "CALD1\n" +
            "CALHM1\n" +
            "CALHM3\n" +
            "CALM1\n" +
            "CALM2\n" +
            "CALM2P1\n" +
            "CALM3\n" +
            "CALML3\n" +
            "CALML4\n" +
            "CALML5\n" +
            "CALML6\n" +
            "CALN1\n" +
            "CALR\n" +
            "CALR3\n" +
            "CALY\n" +
            "CAMK1G\n" +
            "CAMK2B\n" +
            "CAMK2G\n" +
            "CAMK2N2\n" +
            "CAMK4\n" +
            "CAMKMT\n" +
            "CAMP\n" +
            "CAMPD1\n" +
            "CAMTA1\n" +
            "CAND1\n" +
            "CANDF1\n" +
            "CANDN1\n" +
            "CANT1\n" +
            "CANX\n" +
            "CAP1\n" +
            "CAPN1\n" +
            "CAPN10\n" +
            "CAPN11\n" +
            "CAPN12\n" +
            "CAPN14\n" +
            "CAPN3\n" +
            "CAPN5\n" +
            "CAPN6\n" +
            "CAPN7\n" +
            "CAPN8\n" +
            "CAPN9\n" +
            "CAPNS1\n" +
            "CAPNS2\n" +
            "CAPRIN1\n" +
            "CAPRIN2\n" +
            "CAPS2\n" +
            "CAPSL\n" +
            "CARD11\n" +
            "CARD14\n" +
            "CARD16\n" +
            "CARD17\n" +
            "CARD8\n" +
            "CARD9\n" +
            "CARF\n" +
            "CARS\n" +
            "CARTPT\n" +
            "CASC1\n" +
            "CASC16\n" +
            "CASC5\n" +
            "CASD1\n" +
            "CASK\n" +
            "CASP1\n" +
            "CASP10\n" +
            "CASP12\n" +
            "CASP14\n" +
            "CASP2\n" +
            "CASP3\n" +
            "CASP4\n" +
            "CASP5\n" +
            "CASP6\n" +
            "CASP7\n" +
            "CASP8\n" +
            "CASP9\n" +
            "CASQ1\n" +
            "CASQ2\n" +
            "CASR\n" +
            "CAT\n" +
            "CATMANS\n" +
            "CATSPER1\n" +
            "CATSPER2\n" +
            "CATSPER2P1\n" +
            "CAV1\n" +
            "CAV2\n" +
            "CAV3\n" +
            "CBFA2T2\n" +
            "CBFA2T3\n" +
            "CBFB\n" +
            "CBL\n" +
            "CBLB\n" +
            "CBLN1\n" +
            "CBLN2\n" +
            "CBLN3\n" +
            "CBLN4\n" +
            "CBR3\n" +
            "CBR3-AS1\n" +
            "CBS\n" +
            "CBX1\n" +
            "CBX2\n" +
            "CBX4\n" +
            "CBY1\n" +
            "CC2D1A\n" +
            "CC2D2A\n" +
            "CC2D2B\n" +
            "CCA1\n" +
            "CCAL1\n" +
            "CCAR2\n" +
            "CCAT1\n" +
            "CCAT2\n" +
            "CCBE1\n" +
            "CCBL1\n" +
            "CCCSX\n" +
            "CCDC101\n" +
            "CCDC102A\n" +
            "CCDC103\n" +
            "CCDC11\n" +
            "CCDC114\n" +
            "CCDC130\n" +
            "CCDC151\n" +
            "CCDC170\n" +
            "CCDC18\n" +
            "CCDC19\n" +
            "CCDC22\n" +
            "CCDC28B\n" +
            "CCDC34\n" +
            "CCDC37\n" +
            "CCDC39\n" +
            "CCDC40\n" +
            "CCDC50\n" +
            "CCDC6\n" +
            "CCDC65\n" +
            "CCDC78\n" +
            "CCDC8\n" +
            "CCDC85B\n" +
            "CCDC88C\n" +
            "CCK\n" +
            "CCKAR\n" +
            "CCKBR\n" +
            "CCL1\n" +
            "CCL11\n" +
            "CCL13\n" +
            "CCL15\n" +
            "CCL17\n" +
            "CCL18\n" +
            "CCL19\n" +
            "CCL2\n" +
            "CCL20\n" +
            "CCL21\n" +
            "CCL22\n" +
            "CCL23\n" +
            "CCL24\n" +
            "CCL25\n" +
            "CCL26\n" +
            "CCL27\n" +
            "CCL3\n" +
            "CCL3L1\n" +
            "CCL3L3\n" +
            "CCL4\n" +
            "CCL5\n" +
            "CCL7\n" +
            "CCL8\n" +
            "CCM2\n" +
            "CCM2L\n" +
            "CCNA1\n" +
            "CCNA2\n" +
            "CCNB1\n" +
            "CCNB2\n" +
            "CCND1\n" +
            "CCND2\n" +
            "CCND3\n" +
            "CCNDBP1\n" +
            "CCNE1\n" +
            "CCNF\n" +
            "CCNG1\n" +
            "CCNG2\n" +
            "CCNK\n" +
            "CCNL2\n" +
            "CCNO\n" +
            "CCNT1\n" +
            "CCNT2\n" +
            "CCR1\n" +
            "CCR10\n" +
            "CCR2\n" +
            "CCR3\n" +
            "CCR4\n" +
            "CCR5\n" +
            "CCR6\n" +
            "CCR7\n" +
            "CCR8\n" +
            "CCR9\n" +
            "CCT\n" +
            "CCT4\n" +
            "CCT5\n" +
            "CCT6A\n" +
            "CCT7\n" +
            "CCV\n" +
            "CD109\n" +
            "CD14\n" +
            "CD151\n" +
            "CD160\n" +
            "CD163\n" +
            "CD164\n" +
            "CD177\n" +
            "CD180\n" +
            "CD19\n" +
            "CD1A\n" +
            "CD1B\n" +
            "CD1C\n" +
            "CD1D\n" +
            "CD1E\n" +
            "CD2\n" +
            "CD200\n" +
            "CD200R1L\n" +
            "CD207\n" +
            "CD209\n" +
            "CD22\n" +
            "CD226\n" +
            "CD244\n" +
            "CD247\n" +
            "CD27\n" +
            "CD274\n" +
            "CD28\n" +
            "CD2AP\n" +
            "CD2BP2\n" +
            "CD300E\n" +
            "CD320\n" +
            "CD33\n" +
            "CD34\n" +
            "CD36\n" +
            "CD38\n" +
            "CD3D\n" +
            "CD3E\n" +
            "CD3EAP\n" +
            "CD3G\n" +
            "CD4\n" +
            "CD40\n" +
            "CD40LG\n" +
            "CD44\n" +
            "CD46\n" +
            "CD47\n" +
            "CD5\n" +
            "CD52\n" +
            "CD53\n" +
            "CD55\n" +
            "CD58\n" +
            "CD59\n" +
            "CD5L\n" +
            "CD6\n" +
            "CD63\n" +
            "CD68\n" +
            "CD69\n" +
            "CD7\n" +
            "CD70\n" +
            "CD79A\n" +
            "CD79B\n" +
            "CD80\n" +
            "CD81\n" +
            "CD82\n" +
            "CD84\n" +
            "CD86\n" +
            "CD8A\n" +
            "CD9\n" +
            "CD93\n" +
            "CD96\n" +
            "CD99\n" +
            "CDA\n" +
            "CDAGS\n" +
            "CDAN1\n" +
            "CDAN3\n" +
            "CDB2\n" +
            "CDC14A\n" +
            "CDC25C\n" +
            "CDC26\n" +
            "CDC42\n" +
            "CDC42BPA\n" +
            "CDC42BPB\n" +
            "CDC42BPG\n" +
            "CDC42EP5\n" +
            "CDC42SE1\n" +
            "CDC45\n" +
            "CDC5L\n" +
            "CDC6\n" +
            "CDC73\n" +
            "CDCA2\n" +
            "CDCA3\n" +
            "CDCA4\n" +
            "CDCA5\n" +
            "CDCA7\n" +
            "CDCA8\n" +
            "CDH1\n" +
            "CDH11\n" +
            "CDH12\n" +
            "CDH13\n" +
            "CDH15\n" +
            "CDH16\n" +
            "CDH19\n" +
            "CDH2\n" +
            "CDH23\n" +
            "CDH3\n" +
            "CDH5\n" +
            "CDH7\n" +
            "CDH8\n" +
            "CDH9\n" +
            "CDHR1\n" +
            "CDIPT\n" +
            "CDK1\n" +
            "CDK10\n" +
            "CDK11A\n" +
            "CDK11B\n" +
            "CDK15\n" +
            "CDK2\n" +
            "CDK20\n" +
            "CDK2AP1\n" +
            "CDK2AP2\n" +
            "CDK4\n" +
            "CDK5\n" +
            "CDK5R1\n" +
            "CDK5RAP1\n" +
            "CDK5RAP2\n" +
            "CDK6\n" +
            "CDK7\n" +
            "CDK9\n" +
            "CDKAL1\n" +
            "CDKL3\n" +
            "CDKL5\n" +
            "CDKN1A\n" +
            "CDKN1B\n" +
            "CDKN1C\n" +
            "CDKN2A\n" +
            "CDKN2B\n" +
            "CDKN2B-AS1\n" +
            "CDKN2C\n" +
            "CDKN2D\n" +
            "CDKN3\n" +
            "CDL1\n" +
            "CDL2\n" +
            "CDO1\n" +
            "CDON\n" +
            "CDR1\n" +
            "CDR2\n" +
            "CDR3\n" +
            "CDS1\n" +
            "CDSN\n" +
            "CDT1\n" +
            "CDX1\n" +
            "CDX2\n" +
            "CDX4\n" +
            "CDY1\n" +
            "CDY2A\n" +
            "CDYL\n" +
            "CDYL2\n" +
            "CEACAM1\n" +
            "CEACAM16\n" +
            "CEACAM3\n" +
            "CEACAM4\n" +
            "CEACAM5\n" +
            "CEACAM6\n" +
            "CEACAM7\n" +
            "CEACAM8\n" +
            "CEBPA\n" +
            "CEBPB\n" +
            "CEBPE\n" +
            "CEBPZ\n" +
            "CECR\n" +
            "CECR1\n" +
            "CECR2\n" +
            "CECR3\n" +
            "CECR5\n" +
            "CECR5-AS1\n" +
            "CECR6\n" +
            "CECR7\n" +
            "CECR9\n" +
            "CEL\n" +
            "CELA1\n" +
            "CELA3B\n" +
            "CELF1\n" +
            "CELF2\n" +
            "CELF4\n" +
            "CELIAC10\n" +
            "CELIAC11\n" +
            "CELIAC12\n" +
            "CELIAC13\n" +
            "CELIAC2\n" +
            "CELIAC5\n" +
            "CELIAC6\n" +
            "CELIAC7\n" +
            "CELIAC8\n" +
            "CELIAC9\n" +
            "CELSR1\n" +
            "CELSR2\n" +
            "CEMIP\n" +
            "CEMP1\n" +
            "CEND1\n" +
            "CENPB\n" +
            "CENPC\n" +
            "CENPCP1\n" +
            "CENPE\n" +
            "CENPJ\n" +
            "CENPV\n" +
            "CEP135\n" +
            "CEP152\n" +
            "CEP164\n" +
            "CEP19\n" +
            "CEP290\n" +
            "CEP41\n" +
            "CEP55\n" +
            "CEP57\n" +
            "CEP63\n" +
            "CEP76\n" +
            "CEP83\n" +
            "CEP85L\n" +
            "CEP89\n" +
            "CER1\n" +
            "CERK\n" +
            "CERKL\n" +
            "CERS3\n" +
            "CES1\n" +
            "CES2\n" +
            "CES3\n" +
            "CETN2\n" +
            "CETP\n" +
            "CFB\n" +
            "CFC1\n" +
            "CFD\n" +
            "CFH\n" +
            "CFHR1\n" +
            "CFHR2\n" +
            "CFHR3\n" +
            "CFHR4\n" +
            "CFHR5\n" +
            "CFI\n" +
            "CFL1\n" +
            "CFL2\n" +
            "CFLAR\n" +
            "CFM1\n" +
            "CFM2\n" +
            "CFP\n" +
            "CFSS\n" +
            "CFTDX\n" +
            "CFTR\n" +
            "CFTRP1\n" +
            "CGA\n" +
            "CGB\n" +
            "CGB5\n" +
            "CGB7\n" +
            "CGB8\n" +
            "CGNL1\n" +
            "CH25H\n" +
            "CHAT\n" +
            "CHCHD10\n" +
            "CHD1L" +
            "CHD2\n" +
            "CHD3\n" +
            "CHD4\n" +
            "CHD5\n" +
            "CHD6\n" +
            "CHD7\n" +
            "CHD8\n" +
            "CHDM\n" +
            "CHDS1\n" +
            "CHDS2\n" +
            "CHDS3\n" +
            "CHDS4\n" +
            "CHDS8\n" +
            "CHDS9\n" +
            "CHDT3\n" +
            "CHED1\n" +
            "CHEK1\n" +
            "CHEK2\n" +
            "CHERP\n" +
            "CHES1L1\n" +
            "CHGA\n" +
            "CHGB\n" +
            "CHI3L1\n" +
            "CHIA\n" +
            "CHIC2\n" +
            "CHIT1\n" +
            "CHKA\n" +
            "CHKB\n" +
            "CHL1\n" +
            "CHM\n" +
            "CHML\n" +
            "CHMP1A\n" +
            "CHMP2A\n" +
            "CHMP2B\n" +
            "CHMP3\n" +
            "CHMP4B\n" +
            "CHN1\n" +
            "CHN2\n" +
            "CHNG3\n" +
            "CHORDC1\n" +
            "CHP2\n" +
            "CHPF2\n" +
            "CHPT1\n" +
            "CHRDL1\n" +
            "CHRFAM7A\n" +
            "CHRM1\n" +
            "CHRM2\n" +
            "CHRM3\n" +
            "CHRM5\n" +
            "CHRNA1\n" +
            "CHRNA2\n" +
            "CHRNA3\n" +
            "CHRNA4\n" +
            "CHRNA5\n" +
            "CHRNA6\n" +
            "CHRNA7\n" +
            "CHRNA9\n" +
            "CHRNB1\n" +
            "CHRNB2\n" +
            "CHRNB3\n" +
            "CHRNB4\n" +
            "CHRND\n" +
            "CHRNE\n" +
            "CHRNG\n" +
            "CHST1\n" +
            "CHST11\n" +
            "CHST14\n" +
            "CHST3\n" +
            "CHST5\n" +
            "CHST6\n" +
            "CHST8\n" +
            "CHSY1\n" +
            "CHTF8\n" +
            "CHUK\n" +
            "CIB1\n" +
            "CIB2\n" +
            "CIC\n" +
            "CIDEA\n" +
            "CIDEC\n" +
            "CIHL\n" +
            "CIITA\n" +
            "CILD2\n" +
            "CILD4\n" +
            "CILD8\n" +
            "CILP\n" +
            "CIMT\n" +
            "CINP\n" +
            "CIRH1A\n" +
            "CISD1\n" +
            "CISD2\n" +
            "CISH\n" +
            "CIT\n" +
            "CITED2\n" +
            "CIZ1\n" +
            "CKAP2\n" +
            "CKAP4\n" +
            "CKB\n" +
            "CKLF\n" +
            "CKM\n" +
            "CKMT1A\n" +
            "CKMT1B\n" +
            "CKMT2\n" +
            "CKS1B\n" +
            "CKS1BP2\n" +
            "CLA3\n" +
            "CLAM\n" +
            "CLC\n" +
            "CLCA1\n" +
            "CLCA2\n" +
            "CLCA4\n" +
            "CLCF1\n" +
            "CLCN1\n" +
            "CLCN2\n" +
            "CLCN4\n" +
            "CLCN5\n" +
            "CLCN7\n" +
            "CLCNKA\n" +
            "CLCNKB\n" +
            "CLDN1\n" +
            "CLDN10\n" +
            "CLDN11\n" +
            "CLDN14\n" +
            "CLDN15\n" +
            "CLDN16\n" +
            "CLDN18\n" +
            "CLDN19\n" +
            "CLDN23\n" +
            "CLDN3\n" +
            "CLDN4\n" +
            "CLDN5\n" +
            "CLDN6\n" +
            "CLDN7\n" +
            "CLDN8\n" +
            "CLDN9\n" +
            "CLEC11A\n" +
            "CLEC12A\n" +
            "CLEC16A\n" +
            "CLEC1B\n" +
            "CLEC2A\n" +
            "CLEC3A\n" +
            "CLEC3B\n" +
            "CLEC4A\n" +
            "CLEC4E\n" +
            "CLEC4G\n" +
            "CLEC4M\n" +
            "CLEC5A\n" +
            "CLEC7A\n" +
            "CLGN\n" +
            "CLIC2\n" +
            "CLIC4\n" +
            "CLIC5\n" +
            "CLINT1\n" +
            "CLIP1\n" +
            "CLIP2\n" +
            "CLK1\n" +
            "CLLS1\n" +
            "CLLS2\n" +
            "CLLS3\n" +
            "CLLS4\n" +
            "CLLS5\n" +
            "CLLU1\n" +
            "CLLU1OS\n" +
            "CLMP\n" +
            "CLN3\n" +
            "CLN5\n" +
            "CLN6\n" +
            "CLN8\n" +
            "CLNK\n" +
            "CLOCK\n" +
            "CLP1\n" +
            "CLPB\n" +
            "CLPP\n" +
            "CLPS\n" +
            "CLPTM1\n" +
            "CLPTM1L\n" +
            "CLRN1\n" +
            "CLRN1-AS1\n" +
            "CLRN3\n" +
            "CLTC\n" +
            "CLTCL1\n" +
            "CLU\n" +
            "CLUL1\n" +
            "CLVS1\n" +
            "CMA1\n" +
            "CMAHP\n" +
            "CMAL\n" +
            "CMAS\n" +
            "CMC1\n" +
            "CMD1B\n" +
            "CMD1C\n" +
            "CMD1F\n" +
            "CMD1H\n" +
            "CMD1K\n" +
            "CMD1Q\n" +
            "CMDR\n" +
            "CMH21\n" +
            "CMM\n" +
            "CMM4\n" +
            "CMM7\n" +
            "CMS1A1\n" +
            "CMT1A\n" +
            "CMT2B\n" +
            "CMT2G\n" +
            "CMTDIA\n" +
            "CMTM5\n" +
            "CMTX2\n" +
            "CMTX3\n" +
            "CNBP\n" +
            "CNC2\n" +
            "CND\n" +
            "CNDP1\n" +
            "CNDP2\n" +
            "CNGA1\n" +
            "CNGA2\n" +
            "CNGA3\n" +
            "CNGB1\n" +
            "CNGB3\n" +
            "CNNM1\n" +
            "CNNM2\n" +
            "CNNM4\n" +
            "CNOT3\n" +
            "CNOT8\n" +
            "CNP\n" +
            "CNPY3\n" +
            "CNR1\n" +
            "CNR2\n" +
            "CNSN\n" +
            "CNTF\n" +
            "CNTFR\n" +
            "CNTN1\n" +
            "CNTN2\n" +
            "CNTN4\n" +
            "CNTNAP1\n" +
            "CNTNAP2\n" +
            "CNTRL\n" +
            "COA5\n" +
            "COASY\n" +
            "COCH\n" +
            "COD2\n" +
            "CODA\n" +
            "COG1\n" +
            "COG2\n" +
            "COG4\n" +
            "COG5\n" +
            "COG6\n" +
            "COG7\n" +
            "COG8\n" +
            "COHEN1\n" +
            "COHEN2\n" +
            "COIL\n" +
            "COL10A1\n" +
            "COL11A1\n" +
            "COL11A2\n" +
            "COL12A1\n" +
            "COL14A1\n" +
            "COL17A1\n" +
            "COL18A1\n" +
            "COL1A1\n" +
            "COL1A2\n" +
            "COL25A1\n" +
            "COL26A1\n" +
            "COL27A1\n" +
            "COL2A1\n" +
            "COL3A1\n" +
            "COL4A1\n" +
            "COL4A2\n" +
            "COL4A3\n" +
            "COL4A3BP\n" +
            "COL4A4\n" +
            "COL4A5\n" +
            "COL4A6\n" +
            "COL5A1\n" +
            "COL5A2\n" +
            "COL5A3\n" +
            "COL6A1\n" +
            "COL6A2\n" +
            "COL6A3\n" +
            "COL6A5\n" +
            "COL7A1\n" +
            "COL8A1\n" +
            "COL8A2\n" +
            "COL9A1\n" +
            "COL9A2\n" +
            "COL9A3\n" +
            "COLCA1\n" +
            "COLCA2\n" +
            "COLEC11\n" +
            "COLQ\n" +
            "COMA\n" +
            "COMMD1\n" +
            "COMMD5\n" +
            "COMP\n" +
            "COMT\n" +
            "COPB1\n" +
            "COPD\n" +
            "COPD1\n" +
            "COPD10\n" +
            "COPD11\n" +
            "COPD12\n" +
            "COPD13\n" +
            "COPD14\n" +
            "COPD15\n" +
            "COPD16\n" +
            "COPD17\n" +
            "COPD18\n" +
            "COPD19\n" +
            "COPD2\n" +
            "COPD20\n" +
            "COPD21\n" +
            "COPD22\n" +
            "COPD23\n" +
            "COPD24\n" +
            "COPD25\n" +
            "COPD26\n" +
            "COPD27\n" +
            "COPD28\n" +
            "COPD29\n" +
            "COPD3\n" +
            "COPD4\n" +
            "COPD5\n" +
            "COPD6\n" +
            "COPD7\n" +
            "COPD8\n" +
            "COPD9\n" +
            "COPS2\n" +
            "COPS5\n" +
            "COPS6\n" +
            "COQ10A\n" +
            "COQ2\n" +
            "COQ6\n" +
            "COQ9\n" +
            "CORD1\n" +
            "CORD17\n" +
            "CORD8\n" +
            "CORIN\n" +
            "CORO1A\n" +
            "CORO1B\n" +
            "CORO1C\n" +
            "CORT\n" +
            "COTL1P1\n" +
            "COX10\n" +
            "COX11\n" +
            "COX14\n" +
            "COX15\n" +
            "COX16\n" +
            "COX17\n" +
            "COX20\n" +
            "COX4I1\n" +
            "COX4I2\n" +
            "COX5A\n" +
            "COX6A1\n" +
            "COX6B1\n" +
            "COX6C\n" +
            "COX7A2\n" +
            "COX7A2L\n" +
            "COX7B\n" +
            "COX8C\n" +
            "CP\n" +
            "CP20\n" +
            "CPA1\n" +
            "CPA4\n" +
            "CPA6\n" +
            "CPAT1\n" +
            "CPB1\n" +
            "CPB2\n" +
            "CPBHM\n" +
            "CPD\n" +
            "CPE\n" +
            "CPLX1\n" +
            "CPLX2\n" +
            "CPLX3\n" +
            "CPN1\n" +
            "CPO\n" +
            "CPOX\n" +
            "CPP\n" +
            "CPQ\n" +
            "CPS1\n" +
            "CPSF2\n" +
            "CPSF3L\n" +
            "CPSF4\n" +
            "CPT1A\n" +
            "CPT1B\n" +
            "CPT2\n" +
            "CPVT3\n" +
            "CPXCR1\n" +
            "CPZ\n" +
            "CR1\n" +
            "CR2\n" +
            "CRABP1\n" +
            "CRABP2\n" +
            "CRAC1\n" +
            "CRADD\n" +
            "CRAT\n" +
            "CRB1\n" +
            "CRBN\n" +
            "CRCL\n" +
            "CRCS10\n" +
            "CRCS11\n" +
            "CRCS2\n" +
            "CRCS5\n" +
            "CRCS6\n" +
            "CRCS7\n" +
            "CRCS8\n" +
            "CRCS9\n" +
            "CREB1\n" +
            "CREB3\n" +
            "CREB3L1\n" +
            "CREB3L2\n" +
            "CREB3L3\n" +
            "CREBBP\n" +
            "CRELD1\n" +
            "CRELD2\n" +
            "CRH\n" +
            "CRHBP\n" +
            "CRHR1\n" +
            "CRIPT\n" +
            "CRISP2\n" +
            "CRISP3\n" +
            "CRK\n" +
            "CRKL\n" +
            "CRLF1\n" +
            "CRLF2\n" +
            "CRLF3\n" +
            "CRLS1\n" +
            "CRNN\n" +
            "CROCC\n" +
            "CRP\n" +
            "CRSA\n" +
            "CRTAC1\n" +
            "CRTAP\n" +
            "CRTC1\n" +
            "CRTC2\n" +
            "CRTC3\n" +
            "CRX\n" +
            "CRYAA\n" +
            "CRYAB\n" +
            "CRYBA1\n" +
            "CRYBA2\n" +
            "CRYBA4\n" +
            "CRYBB1\n" +
            "CRYBB2\n" +
            "CRYBB2P1\n" +
            "CRYBB3\n" +
            "CRYGB\n" +
            "CRYGC\n" +
            "CRYGD\n" +
            "CRYGS\n" +
            "CRYM\n" +
            "CS\n" +
            "CSAD\n" +
            "CSAG1\n" +
            "CSAG2\n" +
            "CSAG3\n" +
            "CSE\n" +
            "CSF1\n" +
            "CSF1R\n" +
            "CSF2\n" +
            "CSF2RA\n" +
            "CSF2RB\n" +
            "CSF3\n" +
            "CSF3R\n" +
            "CSH1\n" +
            "CSH2\n" +
            "CSHL1\n" +
            "CSMD2\n" +
            "CSMD3\n" +
            "CSN1S1\n" +
            "CSN2\n" +
            "CSN3\n" +
            "CSNK1A1\n" +
            "CSNK1A1L\n" +
            "CSNK1D\n" +
            "CSNK1E\n" +
            "CSNK2A1\n" +
            "CSNK2A2\n" +
            "CSNK2A3\n" +
            "CSNK2B\n" +
            "CSPG4\n" +
            "CSPG5\n" +
            "CSPP1\n" +
            "CSRNP3\n" +
            "CSRP1\n" +
            "CSRP3\n" +
            "CST1\n" +
            "CST2\n" +
            "CST3\n" +
            "CST4\n" +
            "CST6\n" +
            "CST9\n" +
            "CSTA\n" +
            "CSTB\n" +
            "CSTF2\n" +
            "CT45A1\n" +
            "CT83\n" +
            "CTAA1\n" +
            "CTAA2\n" +
            "CTAG1A\n" +
            "CTAG1B\n" +
            "CTAG2\n" +
            "CTAGE1\n" +
            "CTAGE12P\n" +
            "CTAGE5\n" +
            "CTAGE7P\n" +
            "CTBP1-AS\n" +
            "CTC1\n" +
            "CTCF\n" +
            "CTD\n" +
            "CTDP1\n" +
            "CTDSP2\n" +
            "CTEPH1\n" +
            "CTF1\n" +
            "CTGF\n" +
            "CTH\n" +
            "CTHM\n" +
            "CTHRC1\n" +
            "CTLA4\n" +
            "CTNNA1\n" +
            "CTNNA2\n" +
            "CTNNA3\n" +
            "CTNNB1\n" +
            "CTNNBL1\n" +
            "CTNND1\n" +
            "CTNND2\n" +
            "CTNS\n" +
            "CTPP\n" +
            "CTPP5\n" +
            "CTPS1\n" +
            "CTRB1\n" +
            "CTRC\n" +
            "CTRCT25\n" +
            "CTRCT27\n" +
            "CTRCT28\n" +
            "CTRCT29\n" +
            "CTRCT34\n" +
            "CTRCT35\n" +
            "CTRCT37\n" +
            "CTRL\n" +
            "CTSA\n" +
            "CTSB\n" +
            "CTSC\n" +
            "CTSD\n" +
            "CTSE\n" +
            "CTSF\n" +
            "CTSG\n" +
            "CTSH\n" +
            "CTSK\n" +
            "CTSL\n" +
            "CTSS\n" +
            "CTSV\n" +
            "CTSW\n" +
            "CTTN\n" +
            "CTTNBP2\n" +
            "CTU2\n" +
            "CTXN1\n" +
            "CTXN2\n" +
            "CUBN\n" +
            "CUL1\n" +
            "CUL2\n" +
            "CUL3\n" +
            "CUL4A\n" +
            "CUL4B\n" +
            "CUL5\n" +
            "CUL7\n" +
            "CUP2Q35\n" +
            "CUX1\n" +
            "CVMRF\n" +
            "CWC15\n" +
            "CWC22\n" +
            "CWC27\n" +
            "CX3CL1\n" +
            "CX3CR1\n" +
            "CXADR\n" +
            "CXCL1\n" +
            "CXCL10\n" +
            "CXCL11\n" +
            "CXCL12\n" +
            "CXCL13\n" +
            "CXCL14\n" +
            "CXCL16\n" +
            "CXCL17\n" +
            "CXCL2\n" +
            "CXCL3\n" +
            "CXCL5\n" +
            "CXCL6\n" +
            "CXCL9\n" +
            "CXCR1\n" +
            "CXCR2\n" +
            "CXCR3\n" +
            "CXCR4\n" +
            "CXCR5\n" +
            "CXCR6\n" +
            "CXorf40A\n" +
            "CXXC4\n" +
            "CYAT1\n" +
            "CYB5A\n" +
            "CYB5R1\n" +
            "CYB5R2\n" +
            "CYB5R3\n" +
            "CYB5R4\n" +
            "CYB5RL\n" +
            "CYBA\n" +
            "CYBB\n" +
            "CYC1\n" +
            "CYCS\n" +
            "CYCSP12\n" +
            "CYFIP1\n" +
            "CYGB\n" +
            "CYLD\n" +
            "CYMD\n" +
            "CYP11A1\n" +
            "CYP11B1\n" +
            "CYP11B2\n" +
            "CYP17A1\n" +
            "CYP19A1\n" +
            "CYP1A1\n" +
            "CYP1A2\n" +
            "CYP1B1\n" +
            "CYP20A1\n" +
            "CYP21A1P\n" +
            "CYP21A2\n" +
            "CYP24A1\n" +
            "CYP26A1\n" +
            "CYP26B1\n" +
            "CYP26C1\n" +
            "CYP27A1\n" +
            "CYP27B1\n" +
            "CYP2A\n" +
            "CYP2A13\n" +
            "CYP2A6\n" +
            "CYP2B6\n" +
            "CYP2C19\n" +
            "CYP2C8\n" +
            "CYP2C9\n" +
            "CYP2D6\n" +
            "CYP2E1\n" +
            "CYP2R1\n" +
            "CYP2U1\n" +
            "CYP3A4\n" +
            "CYP3A5\n" +
            "CYP46A1\n" +
            "CYP4F2\n" +
            "CYP4F22\n" +
            "CYP4F3\n" +
            "CYP4V2\n" +
            "CYP51A1\n" +
            "CYP7A1\n" +
            "CYP7B1\n" +
            "CYR61\n" +
            "CYS1\n" +
            "CYSLTR1\n" +
            "CYSLTR2\n" +
            "D2HGDH\n" +
            "DAB1\n" +
            "DACH1\n" +
            "DACH2\n" +
            "DACT1\n" +
            "DACT3\n" +
            "DAG1\n" +
            "DAGLA\n" +
            "DAND5\n" +
            "DAO\n" +
            "DAOA\n" +
            "DAPK1\n" +
            "DAPK3\n" +
            "DARC\n" +
            "DARS\n" +
            "DARS2\n" +
            "DAZ1\n" +
            "DAZ2\n" +
            "DAZ3\n" +
            "DAZ4\n" +
            "DAZAP1\n" +
            "DAZAP2\n" +
            "DAZL\n" +
            "DBA2\n" +
            "DBH\n" +
            "DBI\n" +
            "DBN1\n" +
            "DBP\n" +
            "DBT\n" +
            "DCAF17\n" +
            "DCAF5\n" +
            "DCAF8\n" +
            "DCC\n" +
            "DCD\n" +
            "DCDC2\n" +
            "DCE\n" +
            "DCHS1\n" +
            "DCK\n" +
            "DCLRE1C\n" +
            "DCN\n" +
            "DCR\n" +
            "DCT\n" +
            "DCTN1\n" +
            "DCTN2\n" +
            "DCTN4\n" +
            "DCX\n" +
            "DCXR\n" +
            "DDB1\n" +
            "DDB2\n" +
            "DDC\n" +
            "DDD3\n" +
            "DDH2\n" +
            "DDHD1\n" +
            "DDHD2\n" +
            "DDIT3\n" +
            "DDIT4L\n" +
            "DDOST\n" +
            "DDR2\n" +
            "DDT\n" +
            "DDX1\n" +
            "DDX11\n" +
            "DDX11L8\n" +
            "DDX20\n" +
            "DDX21\n" +
            "DDX23\n" +
            "DDX39B\n" +
            "DDX3X\n" +
            "DDX3Y\n" +
            "DDX43\n" +
            "DDX53\n" +
            "DDX58\n" +
            "DDX59\n" +
            "DDX6P2\n" +
            "DEAF1\n" +
            "1-Dec\n" +
            "DECR1\n" +
            "DEDD\n" +
            "DEFA1\n" +
            "DEFA1A3\n" +
            "DEFA3\n" +
            "DEFA4\n" +
            "DEFA5\n" +
            "DEFA6\n" +
            "DEFB1\n" +
            "DEFB103A\n" +
            "DEFB103B\n" +
            "DEFB104A\n" +
            "DEFB118\n" +
            "DEFB119\n" +
            "DEFB126\n" +
            "DEFB127\n" +
            "DEFB4A\n" +
            "DEFT1P\n" +
            "DEFT1P2\n" +
            "DEGS1\n" +
            "DEK\n" +
            "DEL10Q26\n" +
            "DEL11P13\n" +
            "DEL11P15P14\n" +
            "DEL13Q14\n" +
            "DEL14Q11Q22\n" +
            "DEL15Q11.2\n" +
            "DEL15Q13.3\n" +
            "DEL15Q15.3\n" +
            "DEL15Q24\n" +
            "DEL15Q25\n" +
            "DEL15Q26QTER\n" +
            "DEL16P11.2\n" +
            "DEL16P12.1P11.2\n" +
            "DEL16P13.3\n" +
            "DEL17P13.1\n" +
            "DEL17Q11.2\n" +
            "DEL17Q12\n" +
            "DEL17Q23.1Q23.2\n" +
            "DEL18P\n" +
            "DEL18Q\n" +
            "DEL19P13.13\n" +
            "DEL19Q13.11\n" +
            "DEL1P32P31\n" +
            "DEL1P36\n" +
            "DEL1Q21\n" +
            "DEL1Q41Q42\n" +
            "DEL1Q43Q44\n" +
            "DEL22Q11.2\n" +
            "DEL2P12P11.2\n" +
            "DEL2P16.1-P15\n" +
            "DEL2P21\n" +
            "DEL2Q31\n" +
            "DEL3PTERP25\n" +
            "DEL3Q13.31\n" +
            "DEL3Q29\n" +
            "DEL4Q21\n" +
            "DEL5Q12\n" +
            "DEL6PTER\n" +
            "DEL6Q11Q14\n" +
            "DEL6Q24Q25\n" +
            "DEL7Q11.23\n" +
            "DEL8Q12Q21\n" +
            "DEL8Q13\n" +
            "DEL8Q21.11\n" +
            "DEL9P\n" +
            "DELXP11.3\n" +
            "DELXP21\n" +
            "DELXP22.11\n" +
            "DELXQ21\n" +
            "DELYQ11\n" +
            "DENR\n" +
            "DEPDC1B\n" +
            "DEPDC5\n" +
            "DER22T11-22\n" +
            "DER22T8-22\n" +
            "DERA\n" +
            "DERL1\n" +
            "DERL2\n" +
            "DES\n" +
            "DFCTRPS\n" +
            "DFFB\n" +
            "DFN5\n" +
            "DFN8\n" +
            "DFNA16\n" +
            "DFNA18\n" +
            "DFNA21\n" +
            "DFNA24\n" +
            "DFNA27\n" +
            "DFNA30\n" +
            "DFNA31\n" +
            "DFNA33\n" +
            "DFNA40\n" +
            "DFNA41\n" +
            "DFNA42\n" +
            "DFNA43\n" +
            "DFNA47\n" +
            "DFNA49\n" +
            "DFNA5\n" +
            "DFNA52\n" +
            "DFNA53\n" +
            "DFNA54\n" +
            "DFNA55\n" +
            "DFNA58\n" +
            "DFNA59\n" +
            "DFNA7\n" +
            "DFNB13\n" +
            "DFNB14\n" +
            "DFNB17\n" +
            "DFNB20\n" +
            "DFNB26\n" +
            "DFNB27\n" +
            "DFNB31\n" +
            "DFNB32\n" +
            "DFNB33\n" +
            "DFNB38\n" +
            "DFNB40\n" +
            "DFNB44\n" +
            "DFNB45\n" +
            "DFNB46\n" +
            "DFNB47\n" +
            "DFNB5\n" +
            "DFNB51\n" +
            "DFNB55\n" +
            "DFNB59\n" +
            "DFNB62\n" +
            "DFNB65\n" +
            "DFNB66\n" +
            "DFNB68\n" +
            "DFNB71\n" +
            "DFNB74\n" +
            "DFNB81\n" +
            "DFNB83\n" +
            "DFNB85\n" +
            "DFNB93\n" +
            "DFNB96\n" +
            "DFNM1\n" +
            "DFNX3\n" +
            "DFNY1\n" +
            "DGAT1\n" +
            "DGAT2L6\n" +
            "DGCR\n" +
            "DGCR10\n" +
            "DGCR11\n" +
            "DGCR14\n" +
            "DGCR2\n" +
            "DGCR6\n" +
            "DGCR6L\n" +
            "DGCR8\n" +
            "DGKE\n" +
            "DGKG\n" +
            "DGKQ\n" +
            "DGS2\n" +
            "DGUOK\n" +
            "DHCR24\n" +
            "DHCR7\n" +
            "DHDDS\n" +
            "DHDH\n" +
            "DHFR\n" +
            "DHFRL1\n" +
            "DHFRP2\n" +
            "DHH\n" +
            "DHODH\n" +
            "DHPS\n" +
            "DHRS9\n" +
            "DHS\n" +
            "DHTKD1\n" +
            "DHX34\n" +
            "DHX40\n" +
            "DHX8\n" +
            "DHX9\n" +
            "DIABLO\n" +
            "DIANPH\n" +
            "DIAPH1\n" +
            "DIAPH2\n" +
            "DIAPH3\n" +
            "DICER1\n" +
            "DIH1\n" +
            "DIH2\n" +
            "DIO1\n" +
            "DIO2\n" +
            "DIO3\n" +
            "DIP2B\n" +
            "DIRAS1\n" +
            "DIRC2\n" +
            "DIRC3\n" +
            "DIS3L2\n" +
            "DISC1\n" +
            "DISC2\n" +
            "DISP1\n" +
            "DKBI\n" +
            "DKC1\n" +
            "DKK1\n" +
            "DKK4\n" +
            "DLAT\n" +
            "DLC1\n" +
            "DLD\n" +
            "DLEC1\n" +
            "DLEC1P1\n" +
            "DLEU1\n" +
            "DLEU2\n" +
            "DLEU2L\n" +
            "DLG1\n" +
            "DLG2\n" +
            "DLG3\n" +
            "DLG4\n" +
            "DLGAP1\n" +
            "DLGAP3\n" +
            "DLK1\n" +
            "DLL1\n" +
            "DLL3\n" +
            "DLST\n" +
            "DLX1\n" +
            "DLX2\n" +
            "DLX3\n" +
            "DLX4\n" +
            "DLX5\n" +
            "DLX6\n" +
            "DMAP1\n" +
            "DMBT1\n" +
            "DMD\n" +
            "DMGDH\n" +
            "DMP1\n" +
            "DMPK\n" +
            "DMRT1\n" +
            "DMRT2\n" +
            "DMRTC1\n" +
            "DMTF1\n" +
            "DNA2\n" +
            "DNAAF1\n" +
            "DNAAF2\n" +
            "DNAAF3\n" +
            "DNAH1\n" +
            "DNAH11\n" +
            "DNAH17\n" +
            "DNAH5\n" +
            "DNAH8\n" +
            "DNAI1\n" +
            "DNAI2\n" +
            "DNAJA1\n" +
            "DNAJA2\n" +
            "DNAJA3\n" +
            "DNAJB1\n" +
            "DNAJB12\n" +
            "DNAJB2\n" +
            "DNAJB4\n" +
            "DNAJB6\n" +
            "DNAJB8\n" +
            "DNAJC12\n" +
            "DNAJC13\n" +
            "DNAJC14\n" +
            "DNAJC15\n" +
            "DNAJC19\n" +
            "DNAJC28\n" +
            "DNAJC30\n" +
            "DNAJC4\n" +
            "DNAJC5\n" +
            "DNAJC6\n" +
            "DNAL1\n" +
            "DNAL4\n" +
            "DNASE1\n" +
            "DNASE1L1\n" +
            "DNASE1L3\n" +
            "DNASE2B\n" +
            "DND1\n" +
            "DNM1\n" +
            "DNM1L\n" +
            "DNM2\n" +
            "DNM3\n" +
            "DNMT1\n" +
            "DNMT3A\n" +
            "DNMT3B\n" +
            "DNMT3L\n" +
            "DNTT\n" +
            "DNTTIP2\n" +
            "DOCK3\n" +
            "DOCK6\n" +
            "DOCK7\n" +
            "DOCK8\n" +
            "DOHH\n" +
            "DOK1\n" +
            "DOK7\n" +
            "DOLK\n" +
            "DPAGT1\n" +
            "DPCR1\n" +
            "DPEP1\n" +
            "DPF2\n" +
            "DPH1\n" +
            "DPH2\n" +
            "DPH3\n" +
            "DPM1\n" +
            "DPM2\n" +
            "DPM3\n" +
            "DPP10\n" +
            "DPP3\n" +
            "DPP4\n" +
            "DPP6\n" +
            "DPP7\n" +
            "DPP9\n" +
            "DPPA3\n" +
            "DPT\n" +
            "DPY19L2\n" +
            "DPYD\n" +
            "DPYS\n" +
            "DPYSL2\n" +
            "DPYSL5\n" +
            "DR1\n" +
            "DRC1\n" +
            "DRD1\n" +
            "DRD2\n" +
            "DRD3\n" +
            "DRD4\n" +
            "DRD5\n" +
            "DSC1\n" +
            "DSC2\n" +
            "DSC3\n" +
            "DSCAM\n" +
            "DSCAML1\n" +
            "DSCR10\n" +
            "DSCR3\n" +
            "DSCR4\n" +
            "DSCR8\n" +
            "DSE\n" +
            "DSG1\n" +
            "DSG2\n" +
            "DSG3\n" +
            "DSG4\n" +
            "DSP\n" +
            "DSPP\n" +
            "DST\n" +
            "DSTYK\n" +
            "DTNA\n" +
            "DTNBP1\n" +
            "DUH1\n" +
            "DUH2\n" +
            "DUOX1\n" +
            "DUOX2\n" +
            "DUOXA1\n" +
            "DUOXA2\n" +
            "DUP16P11.2\n" +
            "DUP16P13.3\n" +
            "DUP17P13.3\n" +
            "DUP17Q12\n" +
            "DUP17Q21.31\n" +
            "DUP17Q23.1Q23.2\n" +
            "DUP18PDEL18Q\n" +
            "DUP1Q21\n" +
            "DUP22Q11.2\n" +
            "DUP22Q13\n" +
            "DUP2Q31.1\n" +
            "DUP3Q29\n" +
            "DUP5P13\n" +
            "DUP7Q11.23\n" +
            "DUPC1\n" +
            "DUPXP11.23P11.22\n" +
            "DUPXQ27.3Q28\n" +
            "DUPXQ28\n" +
            "DURS1\n" +
            "DUS2\n" +
            "DUSP1\n" +
            "DUSP10\n" +
            "DUSP13\n" +
            "DUSP15\n" +
            "DUSP19\n" +
            "DUSP2\n" +
            "DUSP21\n" +
            "DUSP22\n" +
            "DUSP23\n" +
            "DUSP26\n" +
            "DUSP3\n" +
            "DUSP5\n" +
            "DUSP6\n" +
            "DUSP8\n" +
            "DUT\n" +
            "DUX4\n" +
            "DVL1\n" +
            "DVL2\n" +
            "DVL3\n" +
            "DWS\n" +
            "DYDC1\n" +
            "DYDC2\n" +
            "DYM\n" +
            "DYNC1H1\n" +
            "DYNC1I2\n" +
            "DYNC2H1\n" +
            "DYNLT3\n" +
            "DYRK1A\n" +
            "DYRK1B\n" +
            "DYSF\n" +
            "DYT10\n" +
            "DYT13\n" +
            "DYT15\n" +
            "DYT17\n" +
            "DYT2\n" +
            "DYT21\n" +
            "DYT7\n" +
            "DYX1\n" +
            "DYX1C1\n" +
            "DYX1C1-CCPG1\n" +
            "DYX2\n" +
            "DYX3\n" +
            "DYX5\n" +
            "DYX6\n" +
            "DYX8\n" +
            "DYX9\n" +
            "E2F1\n" +
            "E2F2\n" +
            "E2F3\n" +
            "E2F8\n" +
            "E4F1\n" +
            "EA3\n" +
            "EA7\n" +
            "EAF1\n" +
            "EAF1-AS1\n" +
            "EARS2\n" +
            "EBAG9\n" +
            "EBF3\n" +
            "EBF4\n" +
            "EBI3\n" +
            "EBNA1BP2\n" +
            "EBP\n" +
            "ECA1\n" +
            "ECE1\n" +
            "ECEL1\n" +
            "ECH1\n" +
            "ECHS1\n" +
            "ECI2\n" +
            "ECM1\n" +
            "ECRP\n" +
            "ECSIT\n" +
            "ECT\n" +
            "ECTD5\n" +
            "ECTD6\n" +
            "ECTD7\n" +
            "ECTD8\n" +
            "EDA\n" +
            "EDA2R\n" +
            "EDAR\n" +
            "EDARADD\n" +
            "EDC3\n" +
            "EDC4\n" +
            "EDN1\n" +
            "EDN2\n" +
            "EDN3\n" +
            "EDNRA\n" +
            "EDNRB\n" +
            "EDS8\n" +
            "EDSS2\n" +
            "EEC1\n" +
            "EED\n" +
            "EEF1A1\n" +
            "EEF1A1P14\n" +
            "EEF1A1P24\n" +
            "EEF1A1P5\n" +
            "EEF1A1P6" +
            "EEF1A1P9\n" +
            "EEF1A2\n" +
            "EEF1D\n" +
            "EEF2\n" +
            "EFEMP1\n" +
            "EFEMP2\n" +
            "EFHC1\n" +
            "EFHC2\n" +
            "EFNA1\n" +
            "EFNA2\n" +
            "EFNA3\n" +
            "EFNB1\n" +
            "EFNB2\n" +
            "EFS\n" +
            "EFTUD1\n" +
            "EFTUD2\n" +
            "EGF\n" +
            "EGFL6\n" +
            "EGFR\n" +
            "EGI\n" +
            "EGID-100124696\n" +
            "EGID-100505381\n" +
            "EGID-7795\n" +
            "EGLN1\n" +
            "EGLN1P1\n" +
            "EGLN2\n" +
            "EGLN3\n" +
            "EGOT\n" +
            "EGR1\n" +
            "EGR2\n" +
            "EGR3\n" +
            "EHBP1\n" +
            "EHD1\n" +
            "EHD2\n" +
            "EHD4\n" +
            "EHF\n" +
            "EHHADH\n" +
            "EHMT1\n" +
            "EIF2AK2\n" +
            "EIF2AK3\n" +
            "EIF2AK4\n" +
            "EIF2B1\n" +
            "EIF2B2\n" +
            "EIF2B3\n" +
            "EIF2B4\n" +
            "EIF2B5\n" +
            "EIF2D\n" +
            "EIF3FP3\n" +
            "EIF3H\n" +
            "EIF3I\n" +
            "EIF3M\n" +
            "EIF4A1\n" +
            "EIF4A1P1\n" +
            "EIF4A3\n" +
            "EIF4E\n" +
            "EIF4EBP1\n" +
            "EIF4EBP3\n" +
            "EIF4G1\n" +
            "EIF4G2\n" +
            "EIF4H\n" +
            "EIF5A\n" +
            "EIF5AP2\n" +
            "EIF5AP3\n" +
            "EIF6\n" +
            "EIG2\n" +
            "EIG3\n" +
            "EIG4\n" +
            "EIG5\n" +
            "EIM\n" +
            "EJM2\n" +
            "EJM3\n" +
            "EJM4\n" +
            "EJM9\n" +
            "EKD2\n" +
            "EKV3\n" +
            "ELAC2\n" +
            "ELANE\n" +
            "ELAVL2\n" +
            "ELAVL3\n" +
            "ELAVL4\n" +
            "ELF3\n" +
            "ELF4\n" +
            "ELK3\n" +
            "ELL\n" +
            "ELMO1\n" +
            "ELMOD2\n" +
            "ELMOD3\n" +
            "ELN\n" +
            "ELOF1\n" +
            "ELOVL1\n" +
            "ELOVL2\n" +
            "ELOVL4\n" +
            "ELOVL5\n" +
            "ELOVL6\n" +
            "ELP2\n" +
            "ELP3\n" +
            "ELP4\n" +
            "EMCN\n" +
            "EMD\n" +
            "EMG1\n" +
            "EMILIN2\n" +
            "EML1\n" +
            "EML4\n" +
            "EMP2\n" +
            "EMWX\n" +
            "EMX2\n" +
            "EN1\n" +
            "EN2\n" +
            "ENAM\n" +
            "ENDO1\n" +
            "ENDOG\n" +
            "ENDOU\n" +
            "ENFL2\n" +
            "ENG\n" +
            "ENGASE\n" +
            "ENO1\n" +
            "ENO2\n" +
            "ENO3\n" +
            "ENOSF1\n" +
            "ENPEP\n" +
            "ENPP1\n" +
            "ENPP3\n" +
            "ENPP7\n" +
            "ENSG00000112474\n" +
            "ENSG00000137197\n" +
            "ENSG00000137397\n" +
            "ENSG00000183214\n" +
            "ENSG00000184494\n" +
            "ENSG00000200150\n" +
            "ENSG00000204692\n" +
            "ENSG00000206235\n" +
            "ENSG00000206282\n" +
            "ENSG00000206290\n" +
            "ENSG00000206298\n" +
            "ENSG00000206308\n" +
            "ENSG00000206331\n" +
            "ENSG00000206340\n" +
            "ENSG00000206353\n" +
            "ENSG00000206378\n" +
            "ENSG00000206468\n" +
            "ENSG00000206478\n" +
            "ENSG00000206501\n" +
            "ENSG00000215641\n" +
            "ENSG00000223493\n" +
            "ENSG00000223531\n" +
            "ENSG00000223957\n" +
            "ENSG00000224168\n" +
            "ENSG00000224487\n" +
            "ENSG00000224841\n" +
            "ENSG00000225130\n" +
            "ENSG00000225141\n" +
            "ENSG00000225312\n" +
            "ENSG00000225737\n" +
            "ENSG00000226201\n" +
            "ENSG00000226260\n" +
            "ENSG00000227122\n" +
            "ENSG00000227129\n" +
            "ENSG00000227231\n" +
            "ENSG00000227315\n" +
            "ENSG00000227720\n" +
            "ENSG00000227746\n" +
            "ENSG00000227801\n" +
            "ENSG00000227993\n" +
            "ENSG00000228263\n" +
            "ENSG00000228267\n" +
            "ENSG00000228357\n" +
            "ENSG00000228454\n" +
            "ENSG00000228691\n" +
            "ENSG00000228712\n" +
            "ENSG00000228736\n" +
            "ENSG00000228896\n" +
            "ENSG00000228913\n" +
            "ENSG00000228987\n" +
            "ENSG00000229006\n" +
            "ENSG00000229071\n" +
            "ENSG00000229077\n" +
            "ENSG00000229488\n" +
            "ENSG00000230034\n" +
            "ENSG00000230128\n" +
            "ENSG00000230279\n" +
            "ENSG00000230669\n" +
            "ENSG00000230726\n" +
            "ENSG00000230930\n" +
            "ENSG00000231408\n" +
            "ENSG00000231479\n" +
            "ENSG00000231631\n" +
            "ENSG00000231968\n" +
            "ENSG00000232180\n" +
            "ENSG00000232357\n" +
            "ENSG00000232616\n" +
            "ENSG00000233314\n" +
            "ENSG00000233573\n" +
            "ENSG00000234058\n" +
            "ENSG00000234343\n" +
            "ENSG00000234495\n" +
            "ENSG00000234794\n" +
            "ENSG00000234846\n" +
            "ENSG00000235030\n" +
            "ENSG00000235336\n" +
            "ENSG00000235708\n" +
            "ENSG00000235715\n" +
            "ENSG00000235956\n" +
            "ENSG00000236443\n" +
            "ENSG00000236560\n" +
            "ENSG00000236625\n" +
            "ENSG00000236884\n" +
            "ENSG00000237071\n" +
            "ENSG00000237114\n" +
            "ENSG00000237123\n" +
            "ENSG00000237155\n" +
            "ENSG00000237165\n" +
            "ENSG00000237403\n" +
            "ENSG00000237825\n" +
            "ENSG00000237829\n" +
            "ENSG00000238056\n" +
            "ENSG00000242022\n" +
            "ENSG00000258947\n" +
            "ENTPD1\n" +
            "ENTPD2\n" +
            "ENTPD3\n" +
            "ENTPD8\n" +
            "EOE1\n" +
            "EOE2\n" +
            "EOGT\n" +
            "EOMES\n" +
            "EOS\n" +
            "EP300\n" +
            "EP400\n" +
            "EPAS1\n" +
            "EPB41\n" +
            "EPB41L1\n" +
            "EPB41L2\n" +
            "EPB41L3\n" +
            "EPB41L5\n" +
            "EPB42\n" +
            "EPC1\n" +
            "EPC2\n" +
            "EPCAM\n" +
            "EPDR1\n" +
            "EPG5\n" +
            "EPGN\n" +
            "EPHA2\n" +
            "EPHA3\n" +
            "EPHA4\n" +
            "EPHA5\n" +
            "EPHA7\n" +
            "EPHB2\n" +
            "EPHB3\n" +
            "EPHB4\n" +
            "EPHB6\n" +
            "EPHX1\n" +
            "EPHX2\n" +
            "EPM2A\n" +
            "EPO\n" +
            "EPOR\n" +
            "EPPIN\n" +
            "EPPK1\n" +
            "EPPS\n" +
            "EPRPDC\n" +
            "EPRS\n" +
            "EPS15\n" +
            "EPS8\n" +
            "EPS8L3\n" +
            "EPT1\n" +
            "EPX\n" +
            "EPYC\n" +
            "ERAP1\n" +
            "ERAS\n" +
            "ERBB2\n" +
            "ERBB3\n" +
            "ERBB4\n" +
            "ERC1\n" +
            "ERC2\n" +
            "ERCC1\n" +
            "ERCC2\n" +
            "ERCC3\n" +
            "ERCC4\n" +
            "ERCC5\n" +
            "ERCC6\n" +
            "ERCC6L2\n" +
            "ERCC8\n" +
            "EREG\n" +
            "ERF\n" +
            "ERG\n" +
            "ERGIC3\n" +
            "ERLIN1\n" +
            "ERLIN2\n" +
            "ERMARD\n" +
            "ERV3-1\n" +
            "ERVE-4\n" +
            "ERVK-10\n" +
            "ERVK-6\n" +
            "ERVW-1\n" +
            "ESCO1\n" +
            "ESCO2\n" +
            "ESD\n" +
            "ESPN\n" +
            "ESR1\n" +
            "ESR2\n" +
            "ESRRA\n" +
            "ESRRB\n" +
            "ESRRG\n" +
            "ESX1\n" +
            "ETFA\n" +
            "ETFB\n" +
            "ETFDH\n" +
            "ETHE1\n" +
            "ETL2\n" +
            "ETL4\n" +
            "ETM1\n" +
            "ETM2\n" +
            "ETM3\n" +
            "ETNPPL\n" +
            "ETS1\n" +
            "ETS2\n" +
            "ETV1\n" +
            "ETV3\n" +
            "ETV4\n" +
            "ETV6\n" +
            "ETV7\n" +
            "EVC\n" +
            "EVC2\n" +
            "EVI5\n" +
            "EVL\n" +
            "EVPL\n" +
            "EVR3\n" +
            "EWSR1\n" +
            "EXO1\n" +
            "EXOC3L2\n" +
            "EXOC7\n" +
            "EXOSC10\n" +
            "EXOSC3\n" +
            "EXOSC5\n" +
            "EXOSC7\n" +
            "EXOSC8\n" +
            "EXOSC9\n" +
            "EXPH5\n" +
            "EXT1\n" +
            "EXT2\n" +
            "EXT3\n" +
            "EXTL1\n" +
            "EXTL2\n" +
            "EXTL3\n" +
            "EYA1\n" +
            "EYA4\n" +
            "EYS\n" +
            "EZH1\n" +
            "EZH2\n" +
            "EZR\n" +
            "F10\n" +
            "F11\n" +
            "F12\n" +
            "F13A1\n" +
            "F13B\n" +
            "F2\n" +
            "F2R\n" +
            "F2RL1\n" +
            "F2RL2\n" +
            "F3\n" +
            "F5\n" +
            "F7\n" +
            "F8\n" +
            "F8A1\n" +
            "F8A2\n" +
            "F8A3\n" +
            "F9\n" +
            "FA2H\n" +
            "FAAH\n" +
            "FABP1\n" +
            "FABP12\n" +
            "FABP2\n" +
            "FABP3\n" +
            "FABP3P2\n" +
            "FABP4\n" +
            "FABP5\n" +
            "FABP6\n" +
            "FABP7\n" +
            "FABP9\n" +
            "FADD\n" +
            "FADS1\n" +
            "FADS2\n" +
            "FAF2\n" +
            "FAH\n" +
            "FAM107A\n" +
            "FAM111A\n" +
            "FAM111B\n" +
            "FAM117B\n" +
            "FAM120A\n" +
            "FAM126A\n" +
            "FAM129A\n" +
            "FAM129B\n" +
            "FAM134B\n" +
            "FAM135B\n" +
            "FAM13A\n" +
            "FAM155B\n" +
            "FAM161A\n" +
            "FAM161B\n" +
            "FAM163A\n" +
            "FAM167A\n" +
            "FAM168A\n" +
            "FAM172A\n" +
            "FAM174A\n" +
            "FAM175A\n" +
            "FAM178A\n" +
            "FAM208A\n" +
            "FAM20A\n" +
            "FAM20B\n" +
            "FAM20C\n" +
            "FAM215A\n" +
            "FAM21B\n" +
            "FAM21C\n" +
            "FAM221B\n" +
            "FAM27L\n" +
            "FAM3C\n" +
            "FAM46C\n" +
            "FAM46D\n" +
            "FAM57A\n" +
            "FAM58A\n" +
            "FAM65B\n" +
            "FAM72D\n" +
            "FAM83H\n" +
            "FAM84B\n" +
            "FAM86A\n" +
            "FAM8A6P\n" +
            "FAM9A\n" +
            "FAME3\n" +
            "FAME4\n" +
            "FAN1\n" +
            "FANCA\n" +
            "FANCB\n" +
            "FANCC\n" +
            "FANCD2\n" +
            "FANCD2P1\n" +
            "FANCD2P2\n" +
            "FANCE\n" +
            "FANCF\n" +
            "FANCG\n" +
            "FANCI\n" +
            "FANCL\n" +
            "FANCM\n" +
            "FAP\n" +
            "FARS2\n" +
            "FARSA\n" +
            "FAS\n" +
            "FASLG\n" +
            "FASN\n" +
            "FASTK\n" +
            "FASTKD2\n" +
            "FAT1\n" +
            "FAT2\n" +
            "FAT4\n" +
            "FAU\n" +
            "FBF1\n" +
            "FBL\n" +
            "FBLIM1\n" +
            "FBLN1 \n" +
            "FBLN2\n" +
            "FBLN5\n" +
            "FBN1\n" +
            "FBN2\n" +
            "FBN3\n" +
            "FBP1\n" +
            "FBP2\n" +
            "FBXL19\n" +
            "FBXL3\n" +
            "FBXL4\n" +
            "FBXO11\n" +
            "FBXO2\n" +
            "FBXO21\n" +
            "FBXO27\n" +
            "FBXO31\n" +
            "FBXO32\n" +
            "FBXO33\n" +
            "FBXO38\n" +
            "FBXO47\n" +
            "FBXO5\n" +
            "FBXO7\n" +
            "FBXW2\n" +
            "FBXW4\n" +
            "FBXW4P1\n" +
            "FBXW7\n" +
            "FBXW8\n" +
            "FBXW9\n" +
            "FCAR\n" +
            "FCER1A\n" +
            "FCER1G\n" +
            "FCER2\n" +
            "FCGR1A\n" +
            "FCGR2A\n" +
            "FCGR2B\n" +
            "FCGR2C\n" +
            "FCGR3A\n" +
            "FCGR3B\n" +
            "FCGRT\n" +
            "FCMTE3\n" +
            "FCN1\n" +
            "FCN2\n" +
            "FCN3\n" +
            "FCP1\n" +
            "FCRL1\n" +
            "FCRL2\n" +
            "FCRL3\n" +
            "FCRL4\n" +
            "FCRL5\n" +
            "FCRL6\n" +
            "FDFT1\n" +
            "FDPS\n" +
            "FDX1\n" +
            "FDXR\n" +
            "1-Feb\n" +
            "10-Feb\n" +
            "2-Feb\n" +
            "4-Feb\n" +
            "5-Feb\n" +
            "6-Feb\n" +
            "7-Feb\n" +
            "9-Feb\n" +
            "FECD2\n" +
            "FECD3\n" +
            "FECD5\n" +
            "FECD7\n" +
            "FECH\n" +
            "FECHP1\n" +
            "FEN1\n" +
            "FEOM3\n" +
            "FER\n" +
            "FERD3L\n" +
            "FERMT1\n" +
            "FERMT2\n" +
            "FERMT3\n" +
            "FES\n" +
            "FETUB\n" +
            "FEV\n" +
            "FEZ1\n" +
            "FEZF1\n" +
            "FEZF2\n" +
            "FFAR3\n" +
            "FFAR4\n" +
            "FGA\n" +
            "FGB\n" +
            "FGD1\n" +
            "FGD2\n" +
            "FGD3\n" +
            "FGD4\n" +
            "FGD5\n" +
            "FGF1\n" +
            "FGF10\n" +
            "FGF13\n" +
            "FGF14\n" +
            "FGF16\n" +
            "FGF17\n" +
            "FGF19\n" +
            "FGF2\n" +
            "FGF20\n" +
            "FGF21\n" +
            "FGF23\n" +
            "FGF3\n" +
            "FGF4\n" +
            "FGF5\n" +
            "FGF6\n" +
            "FGF7\n" +
            "FGF8\n" +
            "FGF9\n" +
            "FGFBP1\n" +
            "FGFBP2\n" +
            "FGFR1\n" +
            "FGFR1OP\n" +
            "FGFR1OP2\n" +
            "FGFR2\n" +
            "FGFR3\n" +
            "FGFR4\n" +
            "FGFRL1\n" +
            "FGG\n" +
            "FGL1\n" +
            "FGR\n" +
            "FGS2\n" +
            "FGS3\n" +
            "FGS5\n" +
            "FH\n" +
            "FHII\n" +
            "FHIT\n" +
            "FHL1\n" +
            "FHL2\n" +
            "FHL3\n" +
            "FHL5\n" +
            "FIG4\n" +
            "FIGF\n" +
            "FIGLA\n" +
            "FIGNL1\n" +
            "FILIP1\n" +
            "FILIP1L\n" +
            "FIM1\n" +
            "FIP1L1\n" +
            "FIS1\n" +
            "FKBP10\n" +
            "FKBP14\n" +
            "FKBP1B\n" +
            "FKBP4\n" +
            "FKBP5\n" +
            "FKBP6\n" +
            "FKRP\n" +
            "FKTN\n" +
            "FL1\n" +
            "FLAD1\n" +
            "FLCN\n" +
            "FLG\n" +
            "FLG2\n" +
            "FLI1\n" +
            "FLII\n" +
            "FLJ90680\n" +
            "FLNA\n" +
            "FLNB\n" +
            "FLNC\n" +
            "FLOT1\n" +
            "FLOT2\n" +
            "FLRT1\n" +
            "FLRT3\n" +
            "FLT1\n" +
            "FLT3\n" +
            "FLT3LG\n" +
            "FLT4\n" +
            "FLVCR1\n" +
            "FLVCR2\n" +
            "FMN1\n" +
            "FMO1\n" +
            "FMO2\n" +
            "FMO3\n" +
            "FMO4\n" +
            "FMO5\n" +
            "FMOD\n" +
            "FMR1\n" +
            "FMR1-AS1\n" +
            "FMR1NB\n" +
            "FMR3\n" +
            "FMTLE\n" +
            "FN1\n" +
            "FN3K\n" +
            "FNBP4\n" +
            "FNDC1\n" +
            "FNTB\n" +
            "FOLH1\n" +
            "FOLR1\n" +
            "FOLR2\n" +
            "FOS\n" +
            "FOSB\n" +
            "FOSL1\n" +
            "FOXA2\n" +
            "FOXB1\n" +
            "FOXC1\n" +
            "FOXC2\n" +
            "FOXD2\n" +
            "FOXD3\n" +
            "FOXD4\n" +
            "FOXE1\n" +
            "FOXE3\n" +
            "FOXF1\n" +
            "FOXF2\n" +
            "FOXG1\n" +
            "FOXH1\n" +
            "FOXI1\n" +
            "FOXJ1\n" +
            "FOXL1\n" +
            "FOXL2\n" +
            "FOXM1\n" +
            "FOXN1\n" +
            "FOXN2\n" +
            "FOXN3\n" +
            "FOXO1\n" +
            "FOXO3\n" +
            "FOXO4\n" +
            "FOXP1\n" +
            "FOXP2\n" +
            "FOXP3\n" +
            "FOXQ1\n" +
            "FOXRED1\n" +
            "FPGS\n" +
            "FPR1\n" +
            "FPR2\n" +
            "FRA16A\n" +
            "FRAS1\n" +
            "FRAT1\n" +
            "FRAXA\n" +
            "FRAXD\n" +
            "FRAXE\n" +
            "FRAXF\n" +
            "FRDA2\n" +
            "FREM1\n" +
            "FREM2\n" +
            "FREM3\n" +
            "FRG1\n" +
            "FRG2\n" +
            "FRMD3\n" +
            "FRMD7\n" +
            "FRRS1\n" +
            "FRS2\n" +
            "FRTS1\n" +
            "FRZB\n" +
            "FSCN1\n" +
            "FSCN2\n" +
            "FSCN3\n" +
            "FSHB\n" +
            "FSHMD1A\n" +
            "FSHMD1B\n" +
            "FSHR\n" +
            "FST\n" +
            "FSTL1\n" +
            "FTCD\n" +
            "FTH1\n" +
            "FTHL17\n" +
            "FTL\n" +
            "FTLP4\n" +
            "FTMT\n" +
            "FTO\n" +
            "FTOP1\n" +
            "FTSJ1\n" +
            "FTSJ2\n" +
            "FUBP1\n" +
            "FUCA1\n" +
            "FUCA1P1\n" +
            "FUCA2\n" +
            "FUNDC2\n" +
            "FURIN\n" +
            "FUS\n" +
            "FUT2\n" +
            "FUT3\n" +
            "FUT4\n" +
            "FUT6\n" +
            "FUT7\n" +
            "FUT8\n" +
            "FUT9\n" +
            "FUZ\n" +
            "FWS\n" +
            "FXN\n" +
            "FXR1\n" +
            "FXR2\n" +
            "FXYD1\n" +
            "FXYD2\n" +
            "FXYD5\n" +
            "FYCO1\n" +
            "FYN\n" +
            "FZD1\n" +
            "FZD10\n" +
            "FZD3\n" +
            "FZD4\n" +
            "FZD5\n" +
            "FZD6\n" +
            "FZD7\n" +
            "FZD8\n" +
            "FZD9\n" +
            "G0S2\n" +
            "G3BP2\n" +
            "G6PC\n" +
            "G6PC2\n" +
            "G6PC3\n" +
            "G6PD\n" +
            "GAA\n" +
            "GAB1\n" +
            "GABARAP\n" +
            "GABARAPL1\n" +
            "GABBR1\n" +
            "GABBR2\n" +
            "GABPA\n" +
            "GABPB1\n" +
            "GABRA1\n" +
            "GABRA2\n" +
            "GABRA3\n" +
            "GABRA5\n" +
            "GABRA6\n" +
            "GABRB1\n" +
            "GABRB2\n" +
            "GABRB3\n" +
            "GABRD\n" +
            "GABRG2\n" +
            "GAD1\n" +
            "GAD2\n" +
            "GADD45A\n" +
            "GADD45B\n" +
            "GAEC1\n" +
            "GAGE1\n" +
            "GAGE12I\n" +
            "GAL\n" +
            "GAL3ST1\n" +
            "GALC\n" +
            "GALE\n" +
            "GALK1\n" +
            "GALK2\n" +
            "GALNS\n" +
            "GALNT11\n" +
            "GALNT12\n" +
            "GALNT13\n" +
            "GALNT15\n" +
            "GALNT3\n" +
            "GALNT5\n" +
            "GALT\n" +
            "GAMT\n" +
            "GAN\n" +
            "GANAB\n" +
            "GANC\n" +
            "GAP43\n" +
            "GAPDH\n" +
            "GAR1\n" +
            "GARS\n" +
            "GART\n" +
            "GAS1\n" +
            "GAS2\n" +
            "GAS6\n" +
            "GAS7\n" +
            "GAST\n" +
            "GATA1\n" +
            "GATA2\n" +
            "GATA3\n" +
            "GATA4\n" +
            "GATA5\n" +
            "GATA6\n" +
            "GATAD1\n" +
            "GATAD2B\n" +
            "GATM\n" +
            "GBA\n" +
            "GBA2\n" +
            "GBA3\n" +
            "GBAS\n" +
            "GBD2\n" +
            "GBD3\n" +
            "GBE1\n" +
            "GBP1\n" +
            "GBP3\n" +
            "GBP5\n" +
            "GBX2\n" +
            "GC\n" +
            "GC06M011196\n" +
            "GC07P072301\n" +
            "GCC1\n" +
            "GCC2\n" +
            "GCCD2\n" +
            "GCCD3\n" +
            "GCDH\n" +
            "GCG\n" +
            "GCGR\n" +
            "GCH1\n" +
            "GCK\n" +
            "GCKR\n" +
            "GCLC\n" +
            "GCLM\n" +
            "GCM2\n" +
            "GCNT1\n" +
            "GCNT2\n" +
            "GCNT4\n" +
            "GCSAM\n" +
            "GCSH\n" +
            "GDAP1\n" +
            "GDAP1L1\n" +
            "GDF1\n" +
            "GDF10\n" +
            "GDF15\n" +
            "GDF2\n" +
            "GDF3\n" +
            "GDF5\n" +
            "GDF6\n" +
            "GDF7\n" +
            "GDF9\n" +
            "GDI1\n" +
            "GDNF\n" +
            "GEFSP4\n" +
            "GEFSP6\n" +
            "GEFSP8\n" +
            "GEMIN2\n" +
            "GER\n" +
            "GET4\n" +
            "GFAP\n" +
            "GFER\n" +
            "GFI1\n" +
            "GFI1B\n" +
            "GFM1\n" +
            "GFM2\n" +
            "GFND1\n" +
            "GFPT1\n" +
            "GFRA1\n" +
            "GFRA2\n" +
            "GGCX\n" +
            "GGH\n" +
            "GGT1\n" +
            "GGT3P\n" +
            "GGT6\n" +
            "GGTA1P\n" +
            "GH1\n" +
            "GH2\n" +
            "GHR\n" +
            "GHRH\n" +
            "GHRHR\n" +
            "GHRL\n" +
            "GHS\n" +
            "GHSR\n" +
            "GIF\n" +
            "GIGYF2\n" +
            "GIMAP1\n" +
            "GIMAP4\n" +
            "GIMAP5\n" +
            "GIMAP6\n" +
            "GIN1\n" +
            "GINGF2\n" +
            "GINGF3\n" +
            "GINGF4\n" +
            "GIP\n" +
            "GIPC3\n" +
            "GIPR\n" +
            "GJA1\n" +
            "GJA3\n" +
            "GJA4\n" +
            "GJA5\n" +
            "GJA8\n" +
            "GJB1\n" +
            "GJB2\n" +
            "GJB3\n" +
            "GJB4\n" +
            "GJB5\n" +
            "GJB6\n" +
            "GJC1\n" +
            "GJC2\n" +
            "GJC3\n" +
            "GJD2\n" +
            "GJE1\n" +
            "GK\n" +
            "GK2\n" +
            "GKN1\n" +
            "GKN2\n" +
            "GLA\n" +
            "GLB1\n" +
            "GLB1L\n" +
            "GLC1B\n" +
            "GLC1C\n" +
            "GLC1D\n" +
            "GLC1F\n" +
            "GLC1H\n" +
            "GLC1I\n" +
            "GLC1K\n" +
            "GLC1M\n" +
            "GLC1N\n" +
            "GLC1P\n" +
            "GLC3B\n" +
            "GLC3C\n" +
            "GLCCI1\n" +
            "GLDC\n" +
            "GLE1\n" +
            "GLI1\n" +
            "GLI2\n" +
            "GLI3\n" +
            "GLIDR\n" +
            "GLIPR1\n" +
            "GLIS2\n" +
            "GLIS3\n" +
            "GLM4\n" +
            "GLM5\n" +
            "GLM6\n" +
            "GLM7\n" +
            "GLM8\n" +
            "GLMN\n" +
            "GLO1\n" +
            "GLP1R\n" +
            "GLRA1\n" +
            "GLRA2\n" +
            "GLRA3\n" +
            "GLRA4\n" +
            "GLRB\n" +
            "GLRX\n" +
            "GLRX3\n" +
            "GLRX5\n" +
            "GLS\n" +
            "GLS2\n" +
            "GLTSCR2\n" +
            "GLUD1\n" +
            "GLUD1P5\n" +
            "GLUD2\n" +
            "GLUL\n" +
            "GLYAT\n" +
            "GLYATL1\n" +
            "GLYATL1P2\n" +
            "GLYCAM1\n" +
            "GLYCTK\n" +
            "GLYR1\n" +
            "GLYS1\n" +
            "GM2A\n" +
            "GMDS\n" +
            "GMNN\n" +
            "GMPPA\n" +
            "GMPPB\n" +
            "GMPS\n" +
            "GNA11\n" +
            "GNA12\n" +
            "GNA14\n" +
            "GNAI1\n" +
            "GNAI2\n" +
            "GNAI3\n" +
            "GNAL\n" +
            "GNAO1\n" +
            "GNAQ\n" +
            "GNAS\n" +
            "GNAS-AS1\n" +
            "GNAT1\n" +
            "GNAT2\n" +
            "GNAZ\n" +
            "GNB1\n" +
            "GNB1L\n" +
            "GNB2L1\n" +
            "GNB3\n" +
            "GNB4\n" +
            "GNE\n" +
            "GNG2\n" +
            "GNG8\n" +
            "GNGT2\n" +
            "GNL3\n" +
            "GNLY\n" +
            "GNMT\n" +
            "GNPAT\n" +
            "GNPATP\n" +
            "GNPDA2\n" +
            "GNPTAB\n" +
            "GNPTG\n" +
            "GNRH1\n" +
            "GNRH2\n" +
            "GNRHR\n" +
            "GNS\n" +
            "GOLGA2\n" +
            "GOLGA5\n" +
            "GOLGA6A\n" +
            "GOLGA6B\n" +
            "GOLGA6L2\n" +
            "GOLIM4\n" +
            "GOLM1\n" +
            "GOLPH3\n" +
            "GOPC\n" +
            "GORAB\n" +
            "GORASP2\n" +
            "GOSR2\n" +
            "GOT1\n" +
            "GOT1L1\n" +
            "GOT2\n" +
            "GP1BA\n" +
            "GP1BB\n" +
            "GP2\n" +
            "GP5\n" +
            "GP6\n" +
            "GP9\n" +
            "GPBAR1\n" +
            "GPBP1\n" +
            "GPC1\n" +
            "GPC2\n" +
            "GPC3\n" +
            "GPC4\n" +
            "GPC6\n" +
            "GPD1\n" +
            "GPD1L\n" +
            "GPD2\n" +
            "GPDS1\n" +
            "GPER1\n" +
            "GPHA2\n" +
            "GPHN\n" +
            "GPI\n" +
            "GPIHBP1\n" +
            "GPM6B\n" +
            "GPNMB\n" +
            "GPR112\n" +
            "GPR125\n" +
            "GPR143\n" +
            "GPR148\n" +
            "GPR15\n" +
            "GPR152\n" +
            "GPR17\n" +
            "GPR171\n" +
            "GPR179\n" +
            "GPR182\n" +
            "GPR35\n" +
            "GPR37\n" +
            "GPR45\n" +
            "GPR50\n" +
            "GPR56\n" +
            "GPR68\n" +
            "GPR75\n" +
            "GPR78\n" +
            "GPR83\n" +
            "GPR84\n" +
            "GPR87\n" +
            "GPR98\n" +
            "GPRASP2\n" +
            "GPSM2\n" +
            "GPT\n" +
            "GPX1\n" +
            "GPX1P2\n" +
            "GPX2\n" +
            "GPX3\n" +
            "GPX4\n" +
            "GPX5\n" +
            "GPX6\n" +
            "GPX7\n" +
            "GPX8\n" +
            "GRAMD3\n" +
            "GRB10\n" +
            "GRB2\n" +
            "GRD1\n" +
            "GRD2\n" +
            "GRDX\n" +
            "GREB1\n" +
            "GREB1L\n" +
            "GREM1\n" +
            "GREM2\n" +
            "GRHL2\n" +
            "GRHL3\n" +
            "GRHPR\n" +
            "GRIA1\n" +
            "GRIA2\n" +
            "GRIA3\n" +
            "GRIA4\n" +
            "GRID2\n" +
            "GRIK1\n" +
            "GRIK2\n" +
            "GRIK3\n" +
            "GRIK5\n" +
            "GRIN1\n" +
            "GRIN2A\n" +
            "GRIN2B\n" +
            "GRIN2C\n" +
            "GRIN3B\n" +
            "GRIP1\n" +
            "GRK1\n" +
            "GRK4\n" +
            "GRK6\n" +
            "GRM1\n" +
            "GRM2\n" +
            "GRM3\n" +
            "GRM5\n" +
            "GRM6\n" +
            "GRN\n" +
            "GRP\n" +
            "GRPR\n" +
            "GRXCR1\n" +
            "GRXCR2\n" +
            "GS1-204I12.1\n" +
            "GS1-251I9.4\n" +
            "GS1-279B7.1\n" +
            "GSAP\n" +
            "GSC\n" +
            "GSC2\n" +
            "GSDMB\n" +
            "GSDMC\n" +
            "GSG2\n" +
            "GSK3A\n" +
            "GSK3B\n" +
            "GSM1\n" +
            "GSN\n" +
            "GSR\n" +
            "GSS\n" +
            "GSTA1\n" +
            "GSTA2\n" +
            "GSTA3\n" +
            "GSTA4\n" +
            "GSTM1\n" +
            "GSTM3\n" +
            "GSTM4\n" +
            "GSTM5\n" +
            "GSTO1\n" +
            "GSTO2\n" +
            "GSTP1\n" +
            "GSTT1\n" +
            "GSTT2\n" +
            "GSTZ1\n" +
            "GSX1\n" +
            "GTF2E1\n" +
            "GTF2H1\n" +
            "GTF2H2\n" +
            "GTF2H4\n" +
            "GTF2H5\n" +
            "GTF2I\n" +
            "GTF2IRD1\n" +
            "GTF2IRD2\n" +
            "GTF2IRD2B\n" +
            "GTF3A\n" +
            "GTS\n" +
            "GUCA1A\n" +
            "GUCA1B\n" +
            "GUCA2A\n" +
            "GUCA2B\n" +
            "GUCY1A2\n" +
            "GUCY1A3\n" +
            "GUCY2C\n" +
            "GUCY2D\n" +
            "GUCY2F\n" +
            "GUK1\n" +
            "GULOP\n" +
            "GUSB\n" +
            "GUST\n" +
            "GYG1\n" +
            "GYG2\n" +
            "GYLTL1B\n" +
            "GYPA\n" +
            "GYPB\n" +
            "GYPC\n" +
            "GYPE\n" +
            "GYS1\n" +
            "GYS2\n" +
            "GZMA\n" +
            "GZMB\n" +
            "GZMK\n" +
            "H19\n" +
            "H2AFB3\n" +
            "H2AFX\n" +
            "H2AFY\n" +
            "H2BFS\n" +
            "H2BFWT\n" +
            "H3F3C\n" +
            "H6PD\n" +
            "HAAO\n" +
            "HABP2\n" +
            "HACE1\n" +
            "HACL1\n" +
            "HADH\n" +
            "HADHA\n" +
            "HADHB\n" +
            "HAL\n" +
            "HAMP\n" +
            "HAND1\n" +
            "HAND2\n" +
            "HAND2-AS1\n" +
            "HAO1\n" +
            "HAO2\n" +
            "HAP1\n" +
            "HAPLN1\n" +
            "HARS\n" +
            "HARS2\n" +
            "HAS1\n" +
            "HAS2\n" +
            "HAS3\n" +
            "HAUS2\n" +
            "HAVCR1\n" +
            "HAVCR2\n" +
            "HAX1\n" +
            "HBA1\n" +
            "HBA2\n" +
            "HBB\n" +
            "HBBP1\n" +
            "HBD\n" +
            "HBE1\n" +
            "HBEGF\n" +
            "HBFQTL2\n" +
            "HBFQTL4\n" +
            "HBG1\n" +
            "HBG2\n" +
            "HBHR\n" +
            "HBP1\n" +
            "HBQ1\n" +
            "HBS1L\n" +
            "HBZ\n" +
            "HCA1\n" +
            "HCAR3\n" +
            "HCCS\n" +
            "HCFC1\n" +
            "HCFC2\n" +
            "HCG22\n" +
            "HCHOLA4\n" +
            "HCK\n" +
            "HCL3\n" +
            "HCLS1\n" +
            "HCN1\n" +
            "HCN2\n" +
            "HCN3\n" +
            "HCN4\n" +
            "HCP5\n" +
            "HCRP1\n" +
            "HCRT\n" +
            "HCRTR1\n" +
            "HCRTR2\n" +
            "HDAC1\n" +
            "HDAC4\n" +
            "HDAC5\n" +
            "HDAC6\n" +
            "HDAC8\n" +
            "HDAC9\n" +
            "HDC\n" +
            "HDDC2\n" +
            "HDHD1\n" +
            "HDL3\n" +
            "HDLBP\n" +
            "HDLC3\n" +
            "HDLCQ1\n" +
            "HDLCQ14\n" +
            "HDPA\n" +
            "HEATR2\n" +
            "HEATR6\n" +
            "HEBP1 \n" +
            "HECA\n" +
            "HEIH\n" +
            "HELLS\n" +
            "HELZ\n" +
            "HEMGN\n" +
            "HEMK1\n" +
            "HEPACAM\n" +
            "HEPH\n" +
            "HERC2\n" +
            "HERC2P1\n" +
            "HERC2P5\n" +
            "HERC2P6\n" +
            "HERC2P8\n" +
            "HERC5\n" +
            "HES1\n" +
            "HES6\n" +
            "HES7\n" +
            "HESX1\n" +
            "HEXA\n" +
            "HEXB\n" +
            "HEXDC\n" +
            "HEY\n" +
            "HEY1\n" +
            "HEY2\n" +
            "HFE\n" +
            "HFE2\n" +
            "HFM\n" +
            "HFM1\n" +
            "HGC6.3\n" +
            "HGD\n" +
            "HGF\n" +
            "HGFAC\n" +
            "HGS\n" +
            "HGSNAT\n" +
            "HHAT\n" +
            "HHATL\n" +
            "HHC3\n" +
            "HHEX\n" +
            "HHIP\n" +
            "HHLA1\n" +
            "HHPP\n" +
            "HHT3\n" +
            "HHT4\n" +
            "HHV8S\n" +
            "HIBADH\n" +
            "HIBCH\n" +
            "HIC1\n" +
            "HIF1A\n" +
            "HIF1AN\n" +
            "HIF3A\n" +
            "HIGD1A\n" +
            "HIGD1B\n" +
            "HIGD2B\n" +
            "HILPDA\n" +
            "HINT1\n" +
            "HIP1\n" +
            "HIRA\n" +
            "HIST1H1A\n" +
            "HIST1H1B\n" +
            "HIST1H1D\n" +
            "HIST1H2AA\n" +
            "HIST1H2AD\n" +
            "HIST1H2AE\n" +
            "HIST1H2AH\n" +
            "HIST2H3C\n" +
            "HIST4H4\n" +
            "HIVEP3\n" +
            "HJURP\n" +
            "HK1\n" +
            "HK2\n" +
            "HKDC1\n" +
            "HLA-A\n" +
            "HLA-B\n" +
            "HLA-C\n" +
            "HLA-DMA\n" +
            "HLA-DOA\n" +
            "HLA-DOB\n" +
            "HLA-DPA1\n" +
            "HLA-DPB1\n" +
            "HLA-DPB2\n" +
            "HLA-DQA1\n" +
            "HLA-DQB1\n" +
            "HLA-DQB3\n" +
            "HLA-DRA\n" +
            "HLA-DRB1\n" +
            "HLA-DRB2\n" +
            "HLA-DRB3\n" +
            "HLA-DRB4\n" +
            "HLA-DRB5\n" +
            "HLA-DRB6\n" +
            "HLA-DRB9\n" +
            "HLA-F\n" +
            "HLA-G\n" +
            "HLA-H\n" +
            "HLA-K\n" +
            "HLA-N\n" +
            "HLA-S\n" +
            "HLA-T\n" +
            "HLA-W\n" +
            "HLCS\n" +
            "HLF\n" +
            "HLP\n" +
            "HLX\n" +
            "HM13\n" +
            "HMBS\n" +
            "HMCN1\n" +
            "HMGA1\n" +
            "HMGA2\n" +
            "HMGB1\n" +
            "HMGB2\n" +
            "HMGB3\n" +
            "HMGCL\n" +
            "HMGCR\n" +
            "HMGCS2\n" +
            "HMHB1\n" +
            "HMMR\n" +
            "HMN7A\n" +
            "HMNJ\n" +
            "HMOX1\n" +
            "HMOX2\n" +
            "HMSD\n" +
            "HMSN5\n" +
            "HMSNO\n" +
            "HMX1\n" +
            "HMX2\n" +
            "HMX3\n" +
            "HN1\n" +
            "HNB1\n" +
            "HNF1A\n" +
            "HNF1B\n" +
            "HNF4A\n" +
            "HNFJ3\n" +
            "HNMT\n" +
            "HNP1\n" +
            "HNRNPA1\n" +
            "HNRNPA1P1\n" +
            "HNRNPA1P2\n" +
            "HNRNPA2B1\n" +
            "HNRNPA3\n" +
            "HNRNPAB\n" +
            "HNRNPC\n" +
            "HNRNPCL1\n" +
            "HNRNPDL\n" +
            "HNRNPH1\n" +
            "HNRNPLL\n" +
            "HNRNPU\n" +
            "HNRNPUL2-BSCL2\n" +
            "HOGA1\n" +
            "HOPX\n" +
            "HOXA1\n" +
            "HOXA10\n" +
            "HOXA11\n" +
            "HOXA13\n" +
            "HOXA2\n" +
            "HOXA3\n" +
            "HOXA4\n" +
            "HOXA5\n" +
            "HOXA7\n" +
            "HOXA9\n" +
            "HOXA@\n" +
            "HOXB1\n" +
            "HOXB13\n" +
            "HOXB2\n" +
            "HOXB3\n" +
            "HOXB5\n" +
            "HOXB6\n" +
            "HOXB7\n" +
            "HOXB8\n" +
            "HOXB9\n" +
            "HOXB@\n" +
            "HOXC13\n" +
            "HOXC4\n" +
            "HOXC5\n" +
            "HOXC6\n" +
            "HOXD10\n" +
            "HOXD11\n" +
            "HOXD12\n" +
            "HOXD13\n" +
            "HOXD3\n" +
            "HOXD4\n" +
            "HOXD9\n" +
            "HOXD@\n" +
            "HP\n" +
            "HPBP\n" +
            "HPC1\n" +
            "HPC10\n" +
            "HPC14\n" +
            "HPC15\n" +
            "HPC3\n" +
            "HPC4\n" +
            "HPC5\n" +
            "HPC6\n" +
            "HPC7\n" +
            "HPC9\n" +
            "HPCA\n" +
            "HPCQTL19\n" +
            "HPCX\n" +
            "HPCX2\n" +
            "HPD\n" +
            "HPE1\n" +
            "HPE6\n" +
            "HPE8\n" +
            "HPFH2\n" +
            "HPGD\n" +
            "HPLH1\n" +
            "HPN\n" +
            "HPPD\n" +
            "HPR\n" +
            "HPRHP\n" +
            "HPRT1\n" +
            "HPS1\n" +
            "HPS3\n" +
            "HPS4\n" +
            "HPS5\n" +
            "HPS6\n" +
            "HPSE\n" +
            "HPSE2\n" +
            "HPT\n" +
            "HPV18I1\n" +
            "HPX\n" +
            "HR\n" +
            "HRAS\n" +
            "HRC\n" +
            "HRES1\n" +
            "HRG\n" +
            "HRH1\n" +
            "HRH2\n" +
            "HRH3\n" +
            "HRH4\n" +
            "HRPT3\n" +
            "HRX\n" +
            "HS1BP3\n" +
            "HS3ST3B1\n" +
            "HS3ST4\n" +
            "HS3ST5\n" +
            "HS3ST6\n" +
            "HS6ST1\n" +
            "HSCB\n" +
            "HSCR5\n" +
            "HSCR6\n" +
            "HSCR7\n" +
            "HSCR8\n" +
            "HSCR9\n" +
            "HSD11B1\n" +
            "HSD11B2\n" +
            "HSD17B1\n" +
            "HSD17B10\n" +
            "HSD17B13\n" +
            "HSD17B14\n" +
            "HSD17B1P1\n" +
            "HSD17B2\n" +
            "HSD17B3\n" +
            "HSD17B4\n" +
            "HSD17B6\n" +
            "HSD3B1\n" +
            "HSD3B2\n" +
            "HSD3B7\n" +
            "HSD3BP4\n" +
            "HSF1\n" +
            "HSF4\n" +
            "HSF5\n" +
            "HSFY1\n" +
            "HSFY1P1\n" +
            "HSN1B\n" +
            "HSP90AA1\n" +
            "HSP90AB3P\n" +
            "HSP90B1\n" +
            "HSPA12B\n" +
            "HSPA14\n" +
            "HSPA1A\n" +
            "HSPA1B\n" +
            "HSPA1L\n" +
            "HSPA4\n" +
            "HSPA4L\n" +
            "HSPA5\n" +
            "HSPA8\n" +
            "HSPA9\n" +
            "HSPB1\n" +
            "HSPB2\n" +
            "HSPB3\n" +
            "HSPB6\n" +
            "HSPB8\n" +
            "HSPD1\n" +
            "HSPD1P9\n" +
            "HSPG2\n" +
            "HSPH1\n" +
            "HT\n" +
            "HTATIP2\n" +
            "HTATSF1\n" +
            "HTATSF1P1\n" +
            "HTATSF1P2\n" +
            "HTC1\n" +
            "HTC2\n" +
            "HTGH\n" +
            "HTGS\n" +
            "HTLVR\n" +
            "HTN1\n" +
            "HTN3\n" +
            "HTNB\n" +
            "HTR1A\n" +
            "HTR1B\n" +
            "HTR1D\n" +
            "HTR1E\n" +
            "HTR2A\n" +
            "HTR2B\n" +
            "HTR2C\n" +
            "HTR3A\n" +
            "HTR3B\n" +
            "HTR3C\n" +
            "HTR3D\n" +
            "HTR3E\n" +
            "HTR4\n" +
            "HTR5A\n" +
            "HTR6\n" +
            "HTR7\n" +
            "HTRA1\n" +
            "HTRA2\n" +
            "HTRA3\n" +
            "HTRA4\n" +
            "HTT\n" +
            "HTX2\n" +
            "HTX3\n" +
            "HULC\n" +
            "HUWE1\n" +
            "HV1S\n" +
            "HVBS7\n" +
            "HVBS8\n" +
            "HWE1\n" +
            "HWE2\n" +
            "HYAL1\n" +
            "HYAL2\n" +
            "HYAL3\n" +
            "HYAL4\n" +
            "HYD2\n" +
            "HYDIN\n" +
            "HYDIN2\n" +
            "HYI\n" +
            "HYKK\n" +
            "HYLS1\n" +
            "HYMAI\n" +
            "HYOU1\n" +
            "HYP10\n" +
            "HYPLIP2\n" +
            "HYPT9\n" +
            "HYSP3\n" +
            "HYSP4\n" +
            "HYT1\n" +
            "HYT2\n" +
            "HYT3\n" +
            "HYT4\n" +
            "HYT5\n" +
            "HYT6\n" +
            "HYT7\n" +
            "HYT8\n" +
            "IAPP\n" +
            "IARS\n" +
            "IBA57\n" +
            "IBD11\n" +
            "IBD12\n" +
            "IBD15\n" +
            "IBD16\n" +
            "IBD18\n" +
            "IBD19\n" +
            "IBD2\n" +
            "IBD20\n" +
            "IBD21\n" +
            "IBD22\n" +
            "IBD23\n" +
            "IBD24\n" +
            "IBD25\n" +
            "IBD26\n" +
            "IBD27\n" +
            "IBD3\n" +
            "IBD4\n" +
            "IBD5\n" +
            "IBD6\n" +
            "IBD7\n" +
            "IBD8\n" +
            "IBD9\n" +
            "IBGC1\n" +
            "IBGC2\n" +
            "IBSP\n" +
            "ICA1\n" +
            "ICA1L\n" +
            "ICAM1\n" +
            "ICAM2\n" +
            "ICAM3\n" +
            "ICAM4\n" +
            "ICAM5\n" +
            "ICCA\n" +
            "ICK\n" +
            "ICOS\n" +
            "ID1\n" +
            "ID2\n" +
            "ID4\n" +
            "IDDM10\n" +
            "IDDM11\n" +
            "IDDM13\n" +
            "IDDM14\n" +
            "IDDM15\n" +
            "IDDM17\n" +
            "IDDM18\n" +
            "IDDM2\n" +
            "IDDM23\n" +
            "IDDM24\n" +
            "IDDM3\n" +
            "IDDM4\n" +
            "IDDM6\n" +
            "IDDM7\n" +
            "IDDM8\n" +
            "IDDMX\n" +
            "IDE\n" +
            "IDH1\n" +
            "IDH2\n" +
            "IDH3B\n" +
            "IDI1\n" +
            "IDO1\n" +
            "IDS\n" +
            "IDUA\n" +
            "IER3\n" +
            "IER3IP1\n" +
            "IER5\n" +
            "IFI27\n" +
            "IFI30\n" +
            "IFI44\n" +
            "IFIH1\n" +
            "IFIT2\n" +
            "IFIT3\n" +
            "IFITM1\n" +
            "IFITM2\n" +
            "IFITM3\n" +
            "IFITM5\n" +
            "IFLTD1\n" +
            "IFN1@\n" +
            "IFNA1\n" +
            "IFNA10\n" +
            "IFNA13\n" +
            "IFNA14\n" +
            "IFNA16\n" +
            "IFNA17\n" +
            "IFNA2\n" +
            "IFNA21\n" +
            "IFNA4\n" +
            "IFNA5\n" +
            "IFNA6\n" +
            "IFNA7\n" +
            "IFNA8\n" +
            "IFNAR1\n" +
            "IFNAR2\n" +
            "IFNB1\n" +
            "IFNE\n" +
            "IFNG\n" +
            "IFNGR1\n" +
            "IFNGR2\n" +
            "IFNK\n" +
            "IFNL3\n" +
            "IFNL4 \n" +
            "IFNW1\n" +
            "IFRD1\n" +
            "IFT122\n" +
            "IFT140\n" +
            "IFT172\n" +
            "IFT27\n" +
            "IFT43\n" +
            "IFT80\n" +
            "IFT88\n" +
            "IGAD1\n" +
            "IGAN1\n" +
            "IGAN2\n" +
            "IGAT\n" +
            "IGBP1\n" +
            "IGES\n" +
            "IGF1\n" +
            "IGF1R\n" +
            "IGF2\n" +
            "IGF2-AS\n" +
            "IGF2BP2\n" +
            "IGF2BP3\n" +
            "IGF2R\n" +
            "IGFALS\n" +
            "IGFBP1\n" +
            "IGFBP2\n" +
            "IGFBP3\n" +
            "IGFBP4\n" +
            "IGFBP5\n" +
            "IGFBP6\n" +
            "IGFBP7\n" +
            "IGFL1\n" +
            "IGFL2\n" +
            "IGFL3\n" +
            "IGFLR1\n" +
            "IGH\n" +
            "IGHA1\n" +
            "IGHD\n" +
            "IGHE\n" +
            "IGHG1\n" +
            "IGHG2\n" +
            "IGHG3\n" +
            "IGHM\n" +
            "IGHMBP2\n" +
            "IGHV1-2\n" +
            "IGHV1OR21-1\n" +
            "IGHV3-21\n" +
            "IGHV4-31\n" +
            "IGHV4-34\n" +
            "IGK\n" +
            "IGKC\n" +
            "IGKV1-33\n" +
            "IGKV1-5\n" +
            "IGKV1-6\n" +
            "IGKV2D-23\n" +
            "IGL\n" +
            "IGLL1\n" +
            "IGLL5\n" +
            "IGLV1-40\n" +
            "IGLV1-44\n" +
            "IGLV1-51\n" +
            "IGLV9-49\n" +
            "IGSF1\n" +
            "IGSF6\n" +
            "IGSF6-DREV1\n" +
            "IH\n" +
            "IHG1\n" +
            "IHH\n" +
            "IHPS2\n" +
            "IHPS3\n" +
            "IHPS4\n" +
            "IHPS5\n" +
            "IK\n" +
            "IKBKAP\n" +
            "IKBKB\n" +
            "IKBKE\n" +
            "IKBKG\n" +
            "IKZF1\n" +
            "IKZF3\n" +
            "IL10\n" +
            "IL10RA\n" +
            "IL10RB\n" +
            "IL11\n" +
            "IL11RA\n" +
            "IL12A\n" +
            "IL12B\n" +
            "IL12RB1\n" +
            "IL12RB2\n" +
            "IL13\n" +
            "IL13RA1\n" +
            "IL13RA2\n" +
            "IL15\n" +
            "IL15RA\n" +
            "IL16\n" +
            "IL17A\n" +
            "IL17C\n" +
            "IL17F\n" +
            "IL17RA\n" +
            "IL17RD\n" +
            "IL18\n" +
            "IL18BP\n" +
            "IL18R1\n" +
            "IL18RAP\n" +
            "IL19\n" +
            "IL1A\n" +
            "IL1B\n" +
            "IL1R1\n" +
            "IL1R2\n" +
            "IL1RAP\n" +
            "IL1RAPL1\n" +
            "IL1RAPL2\n" +
            "IL1RL1\n" +
            "IL1RN\n" +
            "IL2\n" +
            "IL20\n" +
            "IL20RA\n" +
            "IL21\n" +
            "IL21R\n" +
            "IL22\n" +
            "IL22RA1\n" +
            "IL22RA2\n" +
            "IL23A\n" +
            "IL23R\n" +
            "IL24\n" +
            "IL25\n" +
            "IL27\n" +
            "IL2RA\n" +
            "IL2RB\n" +
            "IL2RG\n" +
            "IL3\n" +
            "IL31\n" +
            "IL31RA\n" +
            "IL32\n" +
            "IL33\n" +
            "IL36G\n" +
            "IL36RN\n" +
            "IL37\n" +
            "IL3RA\n" +
            "IL4\n" +
            "IL4I1\n" +
            "IL4R\n" +
            "IL5\n" +
            "IL5RA\n" +
            "IL6\n" +
            "IL6R\n" +
            "IL6ST\n" +
            "IL7\n" +
            "IL7R\n" +
            "IL8\n" +
            "IL9\n" +
            "IL9R\n" +
            "ILDR1\n" +
            "ILF2\n" +
            "ILK\n" +
            "IMMP2L\n" +
            "IMMT\n" +
            "IMMTP1\n" +
            "IMPA1\n" +
            "IMPA2\n" +
            "IMPACT\n" +
            "IMPAD1\n" +
            "IMPDH1\n" +
            "IMPG1\n" +
            "IMPG2\n" +
            "INA\n" +
            "INCENP\n" +
            "INDX\n" +
            "INF2\n" +
            "ING1\n" +
            "ING2\n" +
            "ING3\n" +
            "INHA\n" +
            "INHBA\n" +
            "INHBB\n" +
            "INHBC\n" +
            "INHBE\n" +
            "INPP5A\n" +
            "INPP5B\n" +
            "INPP5D\n" +
            "INPP5E\n" +
            "INPP5J\n" +
            "INPP5K\n" +
            "INPPL1\n" +
            "INS\n" +
            "INSC\n" +
            "INSIG2\n" +
            "INSL3\n" +
            "INSL4\n" +
            "INSM1\n" +
            "INSR\n" +
            "INSRL\n" +
            "INSRR\n" +
            "INTLQ1\n" +
            "INTLQ2\n" +
            "INTLQ3\n" +
            "INTS10\n" +
            "INTS8\n" +
            "INTS9\n" +
            "INVS\n" +
            "IPO11\n" +
            "IPOX\n" +
            "IPP\n" +
            "IPPK\n" +
            "IPW\n" +
            "IQCB1\n" +
            "IQGAP1\n" +
            "IQSEC2\n" +
            "IRAK1\n" +
            "IRAK3\n" +
            "IRAK4\n" +
            "IREB2\n" +
            "IRF1\n" +
            "IRF2\n" +
            "IRF2BP1\n" +
            "IRF2BP2\n" +
            "IRF3\n" +
            "IRF4\n" +
            "IRF5\n" +
            "IRF6\n" +
            "IRF7\n" +
            "IRF8\n" +
            "IRF9\n" +
            "IRGM\n" +
            "IRS1\n" +
            "IRS2\n" +
            "IRS4\n" +
            "IRX2\n" +
            "IRX5\n" +
            "IS1\n" +
            "IS2\n" +
            "IS4\n" +
            "ISCA1P2\n" +
            "ISCU\n" +
            "ISG15\n" +
            "ISG20\n" +
            "ISL1\n" +
            "ISL2\n" +
            "ISM1\n" +
            "ISPD\n" +
            "IST1\n" +
            "ISYNA1\n" +
            "ITC1\n" +
            "ITCH\n" +
            "ITFG1\n" +
            "ITGA1\n" +
            "ITGA10\n" +
            "ITGA11\n" +
            "ITGA2\n" +
            "ITGA2B\n" +
            "ITGA3\n" +
            "ITGA4\n" +
            "ITGA5\n" +
            "ITGA6\n" +
            "ITGA7\n" +
            "ITGA8\n" +
            "ITGA9\n" +
            "ITGAD\n" +
            "ITGAE\n" +
            "ITGAL\n" +
            "ITGAM\n" +
            "ITGAV\n" +
            "ITGAX\n" +
            "ITGB1\n" +
            "ITGB1BP1\n" +
            "ITGB2\n" +
            "ITGB3\n" +
            "ITGB3BP\n" +
            "ITGB4\n" +
            "ITGB6\n" +
            "ITGB7\n" +
            "ITGBL1\n" +
            "ITIH4\n" +
            "ITK\n" +
            "ITLN1\n" +
            "ITM2B\n" +
            "ITPA\n" +
            "ITPKC\n" +
            "ITPR1\n" +
            "ITPR3\n" +
            "ITS\n" +
            "IVD\n" +
            "IVL\n" +
            "IVNS1ABP\n" +
            "IYD\n" +
            "JAG1\n" +
            "JAG2\n" +
            "JAGN1\n" +
            "JAK2\n" +
            "JAK3\n" +
            "JAM3\n" +
            "JAZF1\n" +
            "JBS\n" +
            "JDP2\n" +
            "JKAMP\n" +
            "JMJD1C\n" +
            "JMJD6\n" +
            "JPD\n" +
            "JPH2\n" +
            "JPH3\n" +
            "JRK\n" +
            "JRKL\n" +
            "JST\n" +
            "JTB\n" +
            "JUN\n" +
            "JUNB\n" +
            "JUND\n" +
            "JUP\n" +
            "KAL1\n" +
            "KALRN\n" +
            "KANK1\n" +
            "KANSL1\n" +
            "KARS\n" +
            "KAT2A\n" +
            "KAT2B\n" +
            "KAT5\n" +
            "KAT6A\n" +
            "KAT6B\n" +
            "KATNAL2\n" +
            "KAZA1\n" +
            "KAZA2\n" +
            "KAZA3\n" +
            "KAZALD1\n" +
            "KBTBD13\n" +
            "KCMF1\n" +
            "KCNA1\n" +
            "KCNA2\n" +
            "KCNA3\n" +
            "KCNA4\n" +
            "KCNA5\n" +
            "KCNA6\n" +
            "KCNAB2\n" +
            "KCNB1\n" +
            "KCNC3\n" +
            "KCND3\n" +
            "KCNE1\n" +
            "KCNE1L\n" +
            "KCNE2\n" +
            "KCNE3\n" +
            "KCNH2\n" +
            "KCNH4\n" +
            "KCNJ1\n" +
            "KCNJ10\n" +
            "KCNJ11\n" +
            "KCNJ12\n" +
            "KCNJ13\n" +
            "KCNJ16\n" +
            "KCNJ18\n" +
            "KCNJ2\n" +
            "KCNJ3\n" +
            "KCNJ5\n" +
            "KCNJ8\n" +
            "KCNJ9\n" +
            "KCNK10\n" +
            "KCNK18\n" +
            "KCNK3\n" +
            "KCNK4\n" +
            "KCNK6\n" +
            "KCNK9\n" +
            "KCNMA1\n" +
            "KCNMB1\n" +
            "KCNMB3\n" +
            "KCNN1\n" +
            "KCNN3\n" +
            "KCNQ1\n" +
            "KCNQ1DN\n" +
            "KCNQ1OT1\n" +
            "KCNQ2\n" +
            "KCNQ3\n" +
            "KCNQ4\n" +
            "KCNRG\n" +
            "KCNS1\n" +
            "KCNT1\n" +
            "KCNV2\n" +
            "KCTD1\n" +
            "KCTD10\n" +
            "KCTD5\n" +
            "KCTD7\n" +
            "KDELR1\n" +
            "KDM4C\n" +
            "KDM5A\n" +
            "KDM5B\n" +
            "KDM5C\n" +
            "KDM5D\n" +
            "KDM6A\n" +
            "KDR\n" +
            "KDSR\n" +
            "KEAP1\n" +
            "KEL\n" +
            "KERA\n" +
            "KERSMCR\n" +
            "KFM\n" +
            "KHDC3L\n" +
            "KHDRBS3\n" +
            "KHK\n" +
            "KHSRP\n" +
            "KIAA0020\n" +
            "KIAA0040\n" +
            "KIAA0100\n" +
            "KIAA0101\n" +
            "KIAA0196\n" +
            "KIAA0226\n" +
            "KIAA0319\n" +
            "KIAA0319L\n" +
            "KIAA1033\n" +
            "KIAA1109\n" +
            "KIAA1279\n" +
            "KIAA1377\n" +
            "KIAA1429\n" +
            "KIAA1462\n" +
            "KIAA1468\n" +
            "KIAA1549\n" +
            "KIAA2022\n" +
            "KIF11\n" +
            "KIF15\n" +
            "KIF16B\n" +
            "KIF18A\n" +
            "KIF1A\n" +
            "KIF1B\n" +
            "KIF1C\n" +
            "KIF20A\n" +
            "KIF21A\n" +
            "KIF21B\n" +
            "KIF22\n" +
            "KIF23\n" +
            "KIF26A\n" +
            "KIF2A\n" +
            "KIF2B\n" +
            "KIF3A\n" +
            "KIF3C\n" +
            "KIF4A\n" +
            "KIF5A\n" +
            "KIF5B\n" +
            "KIF5C\n" +
            "KIF7\n" +
            "KIR2DL1\n" +
            "KIR2DL2\n" +
            "KIR2DL3\n" +
            "KIR2DL4\n" +
            "KIR2DL5A\n" +
            "KIR2DP1\n" +
            "KIR2DS1\n" +
            "KIR2DS2\n" +
            "KIR2DS3\n" +
            "KIR2DS4\n" +
            "KIR2DS5\n" +
            "KIR3DL1\n" +
            "KIR3DP1\n" +
            "KIR3DS1\n" +
            "KIRREL3\n" +
            "KISS1\n" +
            "KISS1R\n" +
            "KIT\n" +
            "KITLG\n" +
            "KIZ\n" +
            "KL\n" +
            "KLB\n" +
            "KLC1\n" +
            "KLF1\n" +
            "KLF10\n" +
            "KLF11\n" +
            "KLF4\n" +
            "KLF5\n" +
            "KLF6\n" +
            "KLF9\n" +
            "KLHDC2\n" +
            "KLHDC8B\n" +
            "KLHL10\n" +
            "KLHL2\n" +
            "KLHL24\n" +
            "KLHL3\n" +
            "KLHL4\n" +
            "KLHL40\n" +
            "KLHL41\n" +
            "KLHL7\n" +
            "KLHL9\n" +
            "KLK1\n" +
            "KLK10\n" +
            "KLK11\n" +
            "KLK12\n" +
            "KLK13\n" +
            "KLK15\n" +
            "KLK2\n" +
            "KLK3\n" +
            "KLK4\n" +
            "KLK5\n" +
            "KLK6\n" +
            "KLK7\n" +
            "KLK8\n" +
            "KLK9\n" +
            "KLKB1\n" +
            "KLLN\n" +
            "KLRB1\n" +
            "KLRC1\n" +
            "KLRC2\n" +
            "KLRC3\n" +
            "KLRC4\n" +
            "KLRD1\n" +
            "KLRK1\n" +
            "KMO\n" +
            "KMS\n" +
            "KMT2A\n" +
            "KMT2B\n" +
            "KMT2C\n" +
            "KMT2D\n" +
            "KMT2E\n" +
            "KNG1\n" +
            "KNTC1\n" +
            "KONDS\n" +
            "KPNA2\n" +
            "KPNA3\n" +
            "KPNA7\n" +
            "KPNB1\n" +
            "KPTN\n" +
            "KRAS\n" +
            "KRBOX4\n" +
            "KRCC1\n" +
            "KREMEN1\n" +
            "KRI1\n" +
            "KRIT1\n" +
            "KRR1\n" +
            "KRT1\n" +
            "KRT10\n" +
            "KRT12\n" +
            "KRT13\n" +
            "KRT14\n" +
            "KRT15\n" +
            "KRT16\n" +
            "KRT17\n" +
            "KRT18\n" +
            "KRT18P16\n" +
            "KRT19\n" +
            "KRT2\n" +
            "KRT20\n" +
            "KRT24\n" +
            "KRT3\n" +
            "KRT31\n" +
            "KRT34\n" +
            "KRT38\n" +
            "KRT4\n" +
            "KRT5\n" +
            "KRT6A\n" +
            "KRT6B\n" +
            "KRT6C\n" +
            "KRT7\n" +
            "KRT71\n" +
            "KRT72\n" +
            "KRT74\n" +
            "KRT75\n" +
            "KRT8\n" +
            "KRT80\n" +
            "KRT81\n" +
            "KRT83\n" +
            "KRT84\n" +
            "KRT85\n" +
            "KRT86\n" +
            "KRT9\n" +
            "KRTAP1-1\n" +
            "KRTAP1-3\n" +
            "KRTAP10-8\n" +
            "KRTAP10-9\n" +
            "KRTAP11-1\n" +
            "KRTAP17-1\n" +
            "KRTAP20-1\n" +
            "KRTAP21-1\n" +
            "KRTAP5-1\n" +
            "KRTAP9-3\n" +
            "KRTCAP3\n" +
            "KSR1\n" +
            "KSS\n" +
            "KTCN2\n" +
            "KTCN3\n" +
            "KTCN4\n" +
            "KTCN5\n" +
            "KTCN6\n" +
            "KTCN7\n" +
            "KTCN8\n" +
            "KTI12\n" +
            "KTWS\n" +
            "KWE\n" +
            "KYNU\n" +
            "KYPSC1\n" +
            "L1CAM\n" +
            "L1RE1\n" +
            "L2HGDH\n" +
            "L3MBTL3\n" +
            "LACRT\n" +
            "LACTB\n" +
            "LAD1\n" +
            "LAG5\n" +
            "LAGE3\n" +
            "LAIR1\n" +
            "LALBA\n" +
            "LALL\n" +
            "LAMA1\n" +
            "LAMA2\n" +
            "LAMA3\n" +
            "LAMA4\n" +
            "LAMA5\n" +
            "LAMB1\n" +
            "LAMB2\n" +
            "LAMB3\n" +
            "LAMC1\n" +
            "LAMC2\n" +
            "LAMC3\n" +
            "LAMP1\n" +
            "LAMP2\n" +
            "LAMTOR2\n" +
            "LAMTOR5\n" +
            "LAMTOR5P1\n" +
            "LAP\n" +
            "LAP3\n" +
            "LAPTM5\n" +
            "LARGE\n" +
            "LARP7\n" +
            "LARS\n" +
            "LARS2\n" +
            "LAS1L\n" +
            "LASP1\n" +
            "LAT2\n" +
            "LATS1\n" +
            "LATS2\n" +
            "LAX1\n" +
            "LBP\n" +
            "LBR\n" +
            "LBX1\n" +
            "LBX2\n" +
            "LCA10\n" +
            "LCA5\n" +
            "LCA5L\n" +
            "LCA9\n" +
            "LCAT\n" +
            "LCE1C\n" +
            "LCE2B\n" +
            "LCE3A\n" +
            "LCE3B\n" +
            "LCE3C\n" +
            "LCE5A\n" +
            "LCK\n" +
            "LCLAT1\n" +
            "LCMT2\n" +
            "LCN1\n" +
            "LCN2\n" +
            "LCN9\n" +
            "LCO\n" +
            "LCORL\n" +
            "LCP1\n" +
            "LCR-OPSIN\n" +
            "LCRB\n" +
            "LCS1\n" +
            "LCT\n" +
            "LDB1\n" +
            "LDB3\n" +
            "LDHA\n" +
            "LDHB\n" +
            "LDLR\n" +
            "LDLRAP1\n" +
            "LDOC1\n" +
            "LEAP2\n" +
            "LECD\n" +
            "LECT1\n" +
            "LECT2\n" +
            "LEF1\n" +
            "LEFTY1\n" +
            "LEFTY2\n" +
            "LELP1\n" +
            "LEMD3\n" +
            "LEP\n" +
            "LEPQTL1\n" +
            "LEPR\n" +
            "LEPRE1\n" +
            "LEPREL1\n" +
            "LEPREL4\n" +
            "LEPROT\n" +
            "LETM1\n" +
            "LETMD1\n" +
            "LFNG\n" +
            "LFS3\n" +
            "LGALS1\n" +
            "LGALS2\n" +
            "LGALS3\n" +
            "LGALS3BP\n" +
            "LGALS4";

    public static String[] getGenes(){
        return genes.split("\n");
    }


    public static String[] getGenesNames(){
        return geneName.split("\n");
    }
}
