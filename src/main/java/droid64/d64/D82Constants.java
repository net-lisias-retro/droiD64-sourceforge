package droid64.d64;

public class D82Constants {

	/** Array of CbmTrack (SecorCount, SectorOffset, ByteOffset)*/
	protected static final CbmTrack[] D82_TRACKS = {
			//  Sect SectorsIn Offset Track
			new CbmTrack( 29,    0, 0x000000),  // 0 (dummy)
			new CbmTrack( 29,    0, 0x000000),	// 1
			new CbmTrack( 29,   29, 0x001d00),	// 2
			new CbmTrack( 29,   58, 0x003a00),	// 3
			new CbmTrack( 29,   87, 0x005700),	// 4
			new CbmTrack( 29,  116, 0x007400),	// 5
			new CbmTrack( 29,  145, 0x009100),	// 6
			new CbmTrack( 29,  174, 0x00ae00),	// 7
			new CbmTrack( 29,  203, 0x00cb00),	// 8
			new CbmTrack( 29,  232, 0x00e800),	// 9
			new CbmTrack( 29,  261, 0x010500),	// 10
			new CbmTrack( 29,  290, 0x012200),	// 11
			new CbmTrack( 29,  319, 0x013f00),	// 12
			new CbmTrack( 29,  348, 0x015c00),	// 13
			new CbmTrack( 29,  377, 0x017900),	// 14
			new CbmTrack( 29,  406, 0x019600),	// 15
			new CbmTrack( 29,  435, 0x01b300),	// 16
			new CbmTrack( 29,  464, 0x01d000),	// 17
			new CbmTrack( 29,  493, 0x01ed00),	// 18
			new CbmTrack( 29,  522, 0x020a00),	// 19
			new CbmTrack( 29,  551, 0x022700),	// 20
			new CbmTrack( 29,  580, 0x024400),	// 21
			new CbmTrack( 29,  609, 0x026100),	// 22
			new CbmTrack( 29,  638, 0x027e00),	// 23
			new CbmTrack( 29,  667, 0x029b00),	// 24
			new CbmTrack( 29,  696, 0x02b800),	// 25
			new CbmTrack( 29,  725, 0x02d500),	// 26
			new CbmTrack( 29,  754, 0x02f200),	// 27
			new CbmTrack( 29,  783, 0x030f00),	// 28
			new CbmTrack( 29,  812, 0x032c00),	// 29
			new CbmTrack( 29,  841, 0x034900),	// 30
			new CbmTrack( 29,  870, 0x036600),	// 31
			new CbmTrack( 29,  899, 0x038300),	// 32
			new CbmTrack( 29,  928, 0x03a000),	// 33
			new CbmTrack( 29,  957, 0x03bd00),	// 34
			new CbmTrack( 29,  986, 0x03da00),	// 35
			new CbmTrack( 29, 1015, 0x03f700),	// 36
			new CbmTrack( 29, 1044, 0x041400),	// 37
			new CbmTrack( 29, 1073, 0x043100),	// 38
			new CbmTrack( 29, 1102, 0x044e00),	// 39
			new CbmTrack( 27, 1131, 0x046b00),	// 40
			new CbmTrack( 27, 1158, 0x048600),	// 41
			new CbmTrack( 27, 1185, 0x04a100),	// 42
			new CbmTrack( 27, 1212, 0x04bc00),	// 43
			new CbmTrack( 27, 1239, 0x04d700),	// 44
			new CbmTrack( 27, 1266, 0x04f200),	// 45
			new CbmTrack( 27, 1293, 0x050d00),	// 46
			new CbmTrack( 27, 1320, 0x052800),	// 47
			new CbmTrack( 27, 1347, 0x054300),	// 48
			new CbmTrack( 27, 1374, 0x055e00),	// 49
			new CbmTrack( 27, 1401, 0x057900),	// 50
			new CbmTrack( 27, 1428, 0x059400),	// 51
			new CbmTrack( 27, 1455, 0x05af00),	// 52
			new CbmTrack( 27, 1482, 0x05ca00),	// 53
			new CbmTrack( 25, 1509, 0x05e500),	// 54
			new CbmTrack( 25, 1534, 0x05fe00),	// 55
			new CbmTrack( 25, 1559, 0x061700),	// 56
			new CbmTrack( 25, 1584, 0x063000),	// 57
			new CbmTrack( 25, 1609, 0x064900),	// 58
			new CbmTrack( 25, 1634, 0x066200),	// 59
			new CbmTrack( 25, 1659, 0x067b00),	// 60
			new CbmTrack( 25, 1684, 0x069400),	// 61
			new CbmTrack( 25, 1709, 0x06ad00),	// 62
			new CbmTrack( 25, 1734, 0x06c600),	// 63
			new CbmTrack( 25, 1759, 0x06df00),	// 64
			new CbmTrack( 23, 1784, 0x06f800),	// 65
			new CbmTrack( 23, 1807, 0x070f00),	// 66
			new CbmTrack( 23, 1830, 0x072600),	// 67
			new CbmTrack( 23, 1853, 0x073d00),	// 68
			new CbmTrack( 23, 1876, 0x075400),	// 69
			new CbmTrack( 23, 1899, 0x076b00),	// 70
			new CbmTrack( 23, 1922, 0x078200),	// 71
			new CbmTrack( 23, 1945, 0x079900),	// 72
			new CbmTrack( 23, 1968, 0x07b000),	// 73
			new CbmTrack( 23, 1991, 0x07c700),	// 74
			new CbmTrack( 23, 2014, 0x07de00),	// 75
			new CbmTrack( 23, 2037, 0x07f500),	// 76
			new CbmTrack( 23, 2060, 0x080c00),	// 77
			new CbmTrack( 29, 2083, 0x082300),	// 78
			new CbmTrack( 29, 2112, 0x084000),	// 79
			new CbmTrack( 29, 2141, 0x085d00),	// 80
			new CbmTrack( 29, 2170, 0x087a00),	// 81
			new CbmTrack( 29, 2199, 0x089700),	// 82
			new CbmTrack( 29, 2228, 0x08b400),	// 83
			new CbmTrack( 29, 2257, 0x08d100),	// 84
			new CbmTrack( 29, 2286, 0x08ee00),	// 85
			new CbmTrack( 29, 2315, 0x090b00),	// 86
			new CbmTrack( 29, 2344, 0x092800),	// 87
			new CbmTrack( 29, 2373, 0x094500),	// 88
			new CbmTrack( 29, 2402, 0x096200),	// 89
			new CbmTrack( 29, 2431, 0x097f00),	// 90
			new CbmTrack( 29, 2460, 0x099c00),	// 91
			new CbmTrack( 29, 2489, 0x09b900),	// 92
			new CbmTrack( 29, 2518, 0x09d600),	// 93
			new CbmTrack( 29, 2547, 0x09f300),	// 94
			new CbmTrack( 29, 2576, 0x0a1000),	// 95
			new CbmTrack( 29, 2605, 0x0a2d00),	// 96
			new CbmTrack( 29, 2634, 0x0a4a00),	// 97
			new CbmTrack( 29, 2663, 0x0a6700),	// 98
			new CbmTrack( 29, 2692, 0x0a8400),	// 99
			new CbmTrack( 29, 2721, 0x0aa100),	// 100
			new CbmTrack( 29, 2750, 0x0abe00),	// 101
			new CbmTrack( 29, 2779, 0x0adb00),	// 102
			new CbmTrack( 29, 2808, 0x0af800),	// 103
			new CbmTrack( 29, 2837, 0x0b1500),	// 104
			new CbmTrack( 29, 2866, 0x0b3200),	// 105
			new CbmTrack( 29, 2895, 0x0b4f00),	// 106
			new CbmTrack( 29, 2924, 0x0b6c00),	// 107
			new CbmTrack( 29, 2953, 0x0b8900),	// 108
			new CbmTrack( 29, 2982, 0x0ba600),	// 109
			new CbmTrack( 29, 3011, 0x0bc300),	// 110
			new CbmTrack( 29, 3040, 0x0be000),	// 111
			new CbmTrack( 29, 3069, 0x0bfd00),	// 112
			new CbmTrack( 29, 3098, 0x0c1a00),	// 113
			new CbmTrack( 29, 3127, 0x0c3700),	// 114
			new CbmTrack( 29, 3156, 0x0c5400),	// 115
			new CbmTrack( 29, 3185, 0x0c7100),	// 116
			new CbmTrack( 27, 3214, 0x0c8e00),	// 117
			new CbmTrack( 27, 3241, 0x0ca900),	// 118
			new CbmTrack( 27, 3268, 0x0cc400),	// 119
			new CbmTrack( 27, 3295, 0x0cdf00),	// 120
			new CbmTrack( 27, 3322, 0x0cfa00),	// 121
			new CbmTrack( 27, 3349, 0x0d1500),	// 122
			new CbmTrack( 27, 3376, 0x0d3000),	// 123
			new CbmTrack( 27, 3403, 0x0d4b00),	// 124
			new CbmTrack( 27, 3430, 0x0d6600),	// 125
			new CbmTrack( 27, 3457, 0x0d8100),	// 126
			new CbmTrack( 27, 3484, 0x0d9c00),	// 127
			new CbmTrack( 27, 3511, 0x0db700),	// 128
			new CbmTrack( 27, 3538, 0x0dd200),	// 129
			new CbmTrack( 27, 3565, 0x0ded00),	// 130
			new CbmTrack( 25, 3592, 0x0e0800),	// 131
			new CbmTrack( 25, 3617, 0x0e2100),	// 132
			new CbmTrack( 25, 3642, 0x0e3a00),	// 133
			new CbmTrack( 25, 3667, 0x0e5300),	// 134
			new CbmTrack( 25, 3692, 0x0e6c00),	// 135
			new CbmTrack( 25, 3717, 0x0e8500),	// 136
			new CbmTrack( 25, 3742, 0x0e9e00),	// 137
			new CbmTrack( 25, 3767, 0x0eb700),	// 138
			new CbmTrack( 25, 3792, 0x0ed000),	// 139
			new CbmTrack( 25, 3817, 0x0ee900),	// 140
			new CbmTrack( 25, 3842, 0x0f0200),	// 141
			new CbmTrack( 23, 3867, 0x0f1b00),	// 142
			new CbmTrack( 23, 3890, 0x0f3200),	// 143
			new CbmTrack( 23, 3913, 0x0f4900),	// 144
			new CbmTrack( 23, 3936, 0x0f6000),	// 145
			new CbmTrack( 23, 3959, 0x0f7700),	// 146
			new CbmTrack( 23, 3982, 0x0f8e00),	// 147
			new CbmTrack( 23, 4005, 0x0fa500),	// 148
			new CbmTrack( 23, 4028, 0x0fbc00),	// 149
			new CbmTrack( 23, 4051, 0x0fd300),	// 150
			new CbmTrack( 23, 4074, 0x0fea00),	// 151
			new CbmTrack( 23, 4097, 0x100100),	// 152
			new CbmTrack( 23, 4120, 0x101800),	// 153
			new CbmTrack( 23, 4143, 0x102f00),	// 154
	};

	/** Directory track sector sequence */
	protected static final int[]  DIR_SECTORS = {
			1, 4, 7, 10, 13, 16, 19, 22, 25, 28,
			2, 5, 8, 11, 14, 17, 20, 23, 26,
			3, 6, 9, 12, 15, 18, 21, 24, 27 };

	protected static final short[] NEWD82DATA_1 = {
			0x26, 0x03, 0x43, 0x00, 0x01, 0x33, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, // 43100
			0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, // 43110
			0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, // 43120
			0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, // 43130
			0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, // 43140
			0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, // 43150
			0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, // 43160
			0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, // 43170
			0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, // 43180
			0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, // 43190
			0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, // 431a0
			0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x19, // 431b0
			0xb6, 0xfd, 0xff, 0x1f, 0x1b, 0xfc, 0xff, 0xff, 0x1f, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, // 431c0
			0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, // 431d0
			0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, // 431e0
			0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, // 431f0
	};

	protected static final short[] NEWD82DATA_2 = {
			0x26, 0x06, 0x43, 0x00, 0x33, 0x65, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, // 43400
			0x1b, 0xff, 0xff, 0xff, 0x07, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, // 43410
			0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, // 43420
			0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, // 43430
			0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x17, 0xff, 0xff, 0x7f, // 43440
			0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, // 43450
			0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, // 43460
			0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, // 43470
			0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x1d, 0xff, 0xff, // 43480
			0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, // 43490
			0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, // 434a0
			0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, // 434b0
			0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, // 434c0
			0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, // 434d0
			0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, // 434e0
			0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, // 434f0
	};

	protected static final short[] NEWD82DATA_3 = {
			0x26, 0x09, 0x43, 0x00, 0x65, 0x97, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, // 43700
			0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, // 43710
			0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, // 43720
			0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, // 43730
			0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1d, 0xff, 0xff, 0xff, // 43740
			0x1f, 0x1d, 0xff, 0xff, 0xff, 0x1f, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, // 43750
			0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, // 43760
			0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, // 43770
			0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, // 43780
			0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x1b, 0xff, 0xff, 0xff, 0x07, 0x19, 0xff, 0xff, 0xff, // 43790
			0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, // 437a0
			0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, // 437b0
			0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, 0xff, 0xff, 0x01, 0x19, 0xff, // 437c0
			0xff, 0xff, 0x01, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, // 437d0
			0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, // 437e0
			0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, // 437f0
	};

	protected static final short[] NEWD82DATA_4 = {
			0x27, 0x01, 0x43, 0x00, 0x97, 0x9b, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, // 43a00
			0x17, 0xff, 0xff, 0x7f, 0x00, 0x17, 0xff, 0xff, 0x7f, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, // 43a10
	};

	private D82Constants() {
		// Unused
	}
}
