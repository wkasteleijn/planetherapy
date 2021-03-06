package nl.wilcokas.luckystackworker.constants;

import java.math.BigDecimal;

public class Constants {
	public static final String OUTPUT_POSTFIX = "_LSW";
	public static final String STATUS_IDLE = "Idle";
	public static final String STATUS_WORKING = "Working";
	public static final String SUPPORTED_OUTPUT_FORMAT = "tif";
	public static final int MAX_ROI_X = 1024;
	public static final int MAX_ROI_Y = 768;
	public static final int MAX_WINDOW_SIZE = 1280;
	public static final BigDecimal DEFAULT_DENOISE_RADIUS = BigDecimal.valueOf(1);
	public static final BigDecimal DEFAULT_DENOISE_SIGMA = BigDecimal.valueOf(2);
	public static final int DEFAULT_DENOISE_ITERATIONS = 1;
	public static final String VERSION_URL = "https://www.wilcokas.com/luckystackworker/version";
	public static final String VERSION_URL_MARKER = "{lswVersion:";
	public static final String VERSION_URL_ENDMARKER = "}";
	public static final int VERSION_REQUEST_TIMEOUT = 5; // seconds
	public static final int VERSION_REQUEST_FREQUENCY = 14; // days
	public static final int DEFAULT_WINDOWS_POSITION_X = 742;
	public static final int DEFAULT_WINDOWS_POSITION_Y = 64;
}
