package prm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class findTheLastestFileFromList {

	public static void main(String[] args) throws ParseException {
        String[] fileNames = {
            "ABC_CompanyHR_10-03-2023_ProjectX.txt",
            "XYZ_CorporationIT_15-12-2022_ProjectY.txt",
            "LMN_EnterprisesSales_20-06-2024_ProjectZ.txt"
        };

        Date latestDate = null;
        String latestFileName = "";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (String fileName : fileNames) {
            String dateString = fileName.split("_")[2];
            Date date = dateFormat.parse(dateString);

            if (latestDate == null || date.after(latestDate)) {
                latestDate = date;
                latestFileName = fileName;
            }
        }

        System.out.println("Latest file name: " + latestFileName);
    }
}
