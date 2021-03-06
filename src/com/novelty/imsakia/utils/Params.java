package com.novelty.imsakia.utils;
/**
 * 
 * @author M.Turki
 *
 */
public abstract class Params {
	public static final class Branches {
		public static final String BRANCH_OBJECT = "branchObject";
	}
	public static final class Quraan {
		public static final String SURAH_LAST_READ_POSITION = "surahLastReadPosition";
		public static int SORA_SECTION = 1;
		public static int JUZE_SECTION = 2;
	}
	public static final class Common {
		public static String LANG      = "lang";
		public static String PREFS_NAME= "Imskyaa";
	}
	public static final class TVGuid {

		public static final String FOLLOW_FLAG            = "followOrUnfollow";
		public static final String CHANNEL_OBJECT         = "channelObject";
		public static final String GROUP_TYPE             = "groupType";
		public static final String TV_DETAILS_OBJECT      = "tvDetailsObject";
		public static final String PROGRAM_DETAILS_OBJECT = "programDetailsObject";
		public static final String SERIESL_DETAILS_OBJECT = "seriesDetailsObject";
		public static final int TV_GUID_ACTVITY    = 1;
		public static final int TV_PROGRAM_ACTVITY = 2;
		public static final int TV_GUID_PROGRAMS   = 0;
		public static final int TV_GUID_SERIES     = 1;
		public static final int TV_FOLLOW          = 0;
		public static final int TV_UN_FOLLOW       = 1;
	}
}