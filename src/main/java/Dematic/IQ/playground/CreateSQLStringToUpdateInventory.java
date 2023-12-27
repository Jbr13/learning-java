package Dematic.IQ.playground;

public class CreateSQLStringToUpdateInventory {
    public static void main(String[] args) {
        String[] arrays = {
                "2039556438,0005977807,31.08.2024",
                "2039556440,0005977807,31.08.2024",
                "2039554474,0006049836,30.10.2024",
                "2039556446,0006056718,03.07.2024",
                "2039556448,0006056718,03.07.2024",
                "2039556437,0006007477,25.09.2024",
                "2039556441,0006007477,25.09.2024",
                "2039076109,0005963806,27.11.2023",
                "2039556432,0006086930,15.04.2024",
                "2039556405,0006093404,22.04.2024",
                "2039556409,0006077012,11.03.2024",
                "2039556419,0006062158,08.05.2024",
                "2039556768,0006058994,06.05.2024",
                "2039556411,0006006146,23.03.2024",
                "2039556763,0006094035,22.04.2024",
                "2039129287,0005984833,29.01.2024",
                "2039556422,0005984833,29.01.2024",
                "2039556394,0006069176,11.03.2024",
                "2039023472,0006010402,22.01.2024",
                "2039556433,0006058705,04.03.2024",
                "2038947265,0005823233,12.05.2024",
                "2038947266,0005823233,12.05.2024",
                "2038947269,0005823233,12.05.2024",
                "2039556765,0005823233,12.05.2024",
                "2038660521,0005823217,05.05.2024",
                "2038947264,0005823217,05.05.2024",
                "2039207899,0005823217,05.05.2024",
                "2039554469,0005823217,05.05.2024",
                "2038936389,0005823235,12.05.2024",
                "2039554473,0005823235,12.05.2024",
                "2039556423,0006098529,22.04.2024",
                "2039556393,0006075696,04.03.2024",
                "2039556404,0006073754,08.04.2024",
                "2039556414,0006052758,19.02.2024",
                "2039556401,0006081758,18.03.2024",
                "2039556442,0006073904,11.03.2024",
                "2039556410,0006082106,18.03.2024",
                "2039556408,0006081995,15.04.2024",
                "2039556424,0006009352,11.03.2024",
                "2039556439,0005937252,04.08.2024",
                "2039556398,0005973116,29.09.2024",
                "2039554477,0006046983,15.10.2024",
                "2039554476,0006065156,23.10.2024",
                "2039556427,0006065156,23.10.2024",
                "2039556751,0006065156,23.10.2024",
                "2039556753,0006065156,23.10.2024",
                "2038936387,0005825507,28.08.2023",
                "2039556450,0005825507,28.08.2023",
                "2039556416,0006057483,25.03.2024",
                "2039556766,0006086296,15.04.2024",
                "2039556421,0006096791,22.04.2024",
                "2039556418,0006091785,22.04.2024",
                "2039556396,0006091786,22.04.2024",
                "2039556430,0006098532,22.04.2024",
                "2039020770,0005892468,02.10.2023",
                "2039556407,0005892468,02.10.2023",
                "2039556417,0006098530,22.04.2024",
                "2039556429,0006094854,22.04.2024",
                "2039556391,0006052268,04.03.2024",
                "2039556758,0006098448,25.03.2024",
                "2039556767,0006049134,04.03.2024",
                "2039556402,0006048242,19.02.2024",
                "2039556426,0006055884,19.02.2024",
                "2039556395,0006086202,18.03.2024",
                "2039556760,0006053258,01.11.2024",
                "2039554471,0006052686,01.11.2024",
                "2039554472,0006052686,01.11.2024",
                "2039556428,0005931916,26.07.2024",
                "2039556447,0005931916,26.07.2024",
                "2039023477,0006002698,08.01.2024",
                "2039556761,0006066229,29.04.2024",
                "2038677045,0005942272,18.12.2023",
                "2039036248,0005942272,18.12.2023",
                "2039036249,0005942272,18.12.2023",
                "2039036250,0005942272,18.12.2023",
                "2039036251,0005942272,18.12.2023",
                "2039036252,0005942272,18.12.2023",
                "2039036253,0005942272,18.12.2023",
                "2039036254,0005942272,18.12.2023",
                "2039036255,0005942272,18.12.2023",
                "2039036256,0005942272,18.12.2023",
                "2039556413,0006092244,22.04.2024",
                "2039556436,0006096907,22.04.2024",
                "2039556420,0006077046,08.04.2024",
                "2039556415,0006075391,08.04.2024",
                "2039556403,0006029026,01.04.2024",
                "2039556444,0006055024,22.04.2024",
                "2039556770,0006053706,15.04.2024",
                "2039556757,0006050934,15.04.2024",
                "2039556764,0006022127,25.03.2024",
                "2039020969,0006006224,08.01.2024",
                "2039029645,0006006224,08.01.2024",
                "2039029647,0006006224,08.01.2024",
                "2039029650,0006006224,08.01.2024",
                "2039029659,0006006224,08.01.2024",
                "2039556443,0005940099,15.01.2024",
                "2039556445,0005940099,15.01.2024",
                "2039023475,0005992255,29.01.2024",
                "2039023476,0005992255,29.01.2024",
                "2039556431,0006096257,22.04.2024",
                "2038936388,0005942005,18.12.2023",
                "2039556412,0006019809,19.02.2024",
        };

        String sqlPattern = "UPDATE WCR_INV_UNIT SET best_before_date = TO_DATE('%s', 'DD.MM.YYYY'), BATCH = '%s' WHERE LOAD_UNIT = '%s';";

        for(String str : arrays) {
            String[] splittedStr = str.split(",");
            String LU = splittedStr[0];
            String batch = splittedStr[1];
            String bestBeforeDate = splittedStr[2];

            String newSQLPattern = String.format(sqlPattern, bestBeforeDate, batch, LU);

            System.out.println(newSQLPattern);
        }

    }
}