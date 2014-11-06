/* A Bison parser, made by GNU Bison 2.3j6.  */

/* Skeleton parser for Yacc-like parsing with Bison, Java version

   Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005 Free
   Software Foundation, Inc.

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor,
   Boston, MA 02110-1301, USA.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* As a special exception, when this file is copied by Bison into a
   Bison output file, you may use that output file without restriction.
   This special exception was added by the Free Software Foundation
   in version 1.24 of Bison.  */

/* Written by Richard Stallman by simplifying the original so called
   ``semantic'' parser.  Adopted for Java by P. N. Hilfinger */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output.  */


/* Bison version.  */


/* Skeleton name.  */


/* Pure parsers.  */


/* Using locations.  */





   package ucb.gjdb;

   import com.sun.jdi.*;
   import com.sun.jdi.request.*;

   import java.io.BufferedReader;
   import java.io.IOException;

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;
   import java.util.regex.Pattern;
   import java.util.regex.Matcher;
   import java.util.Formatter;

   import static ucb.gjdb.CommandException.ERROR;

   class CommandParser
{

/* Tokens.  */
   public static final int
     WORD = 258,
     TEXT = 259,
     INTLIT = 260,
     CHARLIT = 261,
     STRINGLIT = 262,
     IDENT = 263;

/* Copy the first part of user declarations.  */

/* End first part of user declarations.  */





/* TEMPORARY CHANGE: FIXME */





static int YYLTYPE_INIT;

/* Enabling traces.  */




/* Enabling verbose error messages.  */







/* Copy the second part of user declarations.  */


/* Line 221 of yacc.java.  */
// _line_ 115 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"



/* YYFINAL -- State number of the termination state. */

/* YYLAST -- Last index in YYTABLE.  */


/* YYNTOKENS -- Number of terminals. */

/* YYNNTS -- Number of nonterminals. */

/* YYNRULES -- Number of rules. */

/* YYNRULES -- Number of states. */


/* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */






/* YYTRANSLATE[YYLEX] -- Bison symbol number corresponding to YYLEX.  */
static final short yytranslate[] =
{
       0, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 104, 2,
      55, 56, 107, 76, 105, 2, 98, 16, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 12, 109,
     102, 2, 103, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 1, 2, 3, 4,
       5, 6, 7, 8, 9, 10, 11, 13, 14, 15,
      17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
      27, 28, 29, 30, 31, 32, 33, 34, 35, 36,
      37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
      47, 48, 49, 50, 51, 52, 53, 54, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 67, 68,
      69, 70, 71, 72, 73, 74, 75, 77, 78, 79,
      80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
      90, 91, 92, 93, 94, 95, 96, 97, 99, 100,
     101, 106, 108, 110, 111, 112
};


/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static final char yyprhs[] =
{
       0, 0, 3, 5, 8, 9, 14, 17, 22, 25,
      27, 31, 37, 43, 46, 48, 51, 54, 55, 60,
      64, 67, 71, 75, 78, 82, 86, 90, 94, 97,
     102, 105, 109, 115, 121, 125, 129, 134, 139, 144,
     149, 154, 159, 164, 168, 172, 176, 180, 185, 189,
     193, 196, 200, 203, 207, 210, 214, 218, 221, 225,
     228, 232, 236, 238, 241, 247, 252, 255, 259, 262,
     266, 269, 272, 275, 277, 280, 283, 286, 290, 295,
     301, 305, 309, 313, 316, 320, 324, 327, 329, 333,
     337, 342, 346, 350, 354, 358, 362, 365, 372, 380,
     385, 390, 394, 399, 403, 407, 411, 416, 421, 424,
     427, 430, 433, 438, 442, 447, 452, 455, 459, 462,
     466, 469, 473, 476, 480, 483, 486, 489, 493, 498,
     504, 511, 513, 515, 517, 520, 524, 526, 527, 529,
     530, 532, 534, 537, 539, 541, 543, 546, 548, 550,
     552, 554, 558, 560, 563, 566, 569, 573, 574, 576,
     577, 581, 584, 586, 590, 592, 595, 597, 601, 607,
     612, 614, 617, 619, 624, 628, 632, 634, 638, 641,
     643, 647, 648, 650, 652, 654, 656, 660, 664, 668,
     670, 671, 675, 682, 692, 693, 695, 697, 698, 700,
     702, 705, 706, 707, 708, 709, 710, 711, 712
};

/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
     114, 0, -1, 115, -1, 9, 154, -1, -1, 9,
     154, 116, 126, -1, 10, 124, -1, 11, 3, 12,
     129, -1, 13, 125, -1, 14, -1, 15, 150, 146,
      -1, 15, 150, 16, 3, 146, -1, 15, 150, 16,
     118, 146, -1, 17, 146, -1, 18, -1, 18, 3,
      -1, 19, 154, -1, -1, 19, 154, 117, 126, -1,
      20, 3, 151, -1, 20, 151, -1, 20, 21, 151,
      -1, 22, 5, 151, -1, 22, 151, -1, 22, 21,
     151, -1, 23, 119, 151, -1, 24, 119, 151, -1,
      25, 118, 151, -1, 26, 151, -1, 26, 151, 3,
     146, -1, 27, 146, -1, 28, 150, 146, -1, 28,
     150, 16, 3, 146, -1, 28, 150, 16, 118, 146,
      -1, 29, 15, 30, -1, 29, 15, 31, -1, 29,
      15, 32, 118, -1, 29, 15, 33, 118, -1, 29,
      15, 34, 35, -1, 29, 15, 34, 36, -1, 29,
      15, 37, 38, -1, 29, 15, 37, 39, -1, 29,
      15, 37, 40, -1, 29, 41, 35, -1, 29, 41,
      36, -1, 29, 42, 146, -1, 29, 43, 118, -1,
      29, 3, 153, 4, -1, 44, 122, 151, -1, 45,
       3, 151, -1, 46, 153, -1, 46, 153, 4, -1,
      47, 151, -1, 47, 123, 151, -1, 48, 151, -1,
      48, 123, 151, -1, 49, 122, 146, -1, 50, 151,
      -1, 50, 122, 151, -1, 51, 149, -1, 51, 149,
     134, -1, 52, 149, 135, -1, 53, -1, 53, 118,
      -1, 54, 55, 152, 4, 56, -1, 54, 118, 152,
       4, -1, 57, 149, -1, 57, 149, 141, -1, 58,
     149, -1, 58, 149, 141, -1, 59, 143, -1, 60,
     149, -1, 60, 143, -1, 61, -1, 61, 121, -1,
      62, 118, -1, 63, 118, -1, 64, 118, 118, -1,
      65, 151, 145, 66, -1, 65, 151, 145, 66, 122,
      -1, 67, 151, 66, -1, 68, 151, 23, -1, 68,
     151, 119, -1, 69, 151, -1, 70, 151, 119, -1,
      71, 151, 119, -1, 72, 151, -1, 73, -1, 73,
     149, 74, -1, 73, 149, 75, -1, 73, 149, 76,
     138, -1, 73, 149, 138, -1, 77, 151, 146, -1,
      78, 151, 146, -1, 79, 151, 146, -1, 80, 81,
     151, -1, 80, 82, -1, 80, 83, 149, 151, 133,
     148, -1, 80, 83, 149, 151, 133, 148, 21, -1,
      80, 66, 149, 133, -1, 80, 84, 149, 133, -1,
      80, 85, 151, -1, 80, 85, 151, 3, -1, 80,
      86, 151, -1, 80, 87, 151, -1, 80, 88, 151,
      -1, 80, 88, 151, 21, -1, 80, 88, 151, 122,
      -1, 80, 9, -1, 80, 51, -1, 80, 59, -1,
      80, 57, -1, 80, 89, 3, 151, -1, 80, 89,
     151, -1, 80, 89, 21, 151, -1, 90, 149, 151,
     133, -1, 87, 154, -1, 87, 154, 3, -1, 91,
     154, -1, 91, 154, 3, -1, 92, 152, -1, 92,
     152, 4, -1, 93, 118, -1, 94, 154, 3, -1,
      95, 149, -1, 95, 118, -1, 95, 3, -1, 96,
     149, 133, -1, 96, 149, 133, 8, -1, 97, 149,
     151, 133, 8, -1, 97, 149, 151, 133, 98, 8,
      -1, 99, -1, 100, -1, 101, -1, 101, 3, -1,
     118, 153, 4, -1, 5, -1, -1, 5, -1, -1,
       5, -1, 118, -1, 121, 118, -1, 8, -1, 5,
      -1, 122, -1, 123, 122, -1, 118, -1, 120, -1,
     127, -1, 3, -1, 3, 147, 126, -1, 128, -1,
     127, 128, -1, 102, 3, -1, 103, 3, -1, 103,
     104, 3, -1, -1, 3, -1, -1, 55, 131, 56,
      -1, 55, 56, -1, 132, -1, 131, 105, 132, -1,
     133, -1, 132, 106, -1, 8, -1, 133, 98, 8,
      -1, 137, 98, 8, 130, 142, -1, 137, 12, 118,
     142, -1, 136, -1, 135, 136, -1, 118, -1, 137,
      98, 8, 130, -1, 137, 12, 118, -1, 107, 98,
       8, -1, 8, -1, 137, 98, 8, -1, 137, 108,
      -1, 140, -1, 138, 139, 140, -1, -1, 105, -1,
     109, -1, 8, -1, 107, -1, 140, 98, 8, -1,
     140, 98, 107, -1, 107, 98, 133, -1, 133, -1,
      -1, 110, 152, 4, -1, 149, 145, 144, 133, 98,
       8, -1, 149, 145, 144, 55, 146, 56, 149, 98,
       8, -1, -1, 21, -1, 111, -1, -1, 112, -1,
      44, -1, 152, 4, -1, -1, -1, -1, -1, -1,
      -1, -1, -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static final char yyrline[] =
{
       0, 52, 52, 56, 59, 59, 62, 65, 68, 71,
      73, 76, 80, 83, 86, 88, 90, 92, 92, 94,
      96, 98, 100, 102, 104, 106, 108, 110, 112, 115,
     118, 120, 123, 127, 130, 132, 134, 136, 138, 140,
     142, 144, 146, 148, 150, 152, 154, 156, 159, 161,
     163, 165, 167, 169, 171, 173, 175, 177, 179, 181,
     183, 185, 187, 189, 191, 193, 195, 197, 199, 201,
     203, 205, 207, 209, 211, 213, 215, 217, 219, 221,
     223, 225, 228, 231, 234, 237, 240, 242, 244, 246,
     248, 250, 252, 255, 258, 261, 263, 265, 267, 269,
     271, 273, 275, 277, 279, 281, 283, 285, 287, 289,
     291, 293, 295, 297, 299, 301, 303, 305, 307, 309,
     311, 313, 315, 317, 319, 321, 323, 325, 327, 329,
     331, 333, 335, 337, 339, 341, 346, 349, 350, 354,
     355, 359, 361, 366, 367, 371, 374, 378, 382, 387,
     388, 392, 401, 402, 407, 413, 419, 428, 429, 433,
     434, 436, 440, 443, 448, 449, 453, 454, 458, 460,
     465, 469, 474, 475, 477, 482, 483, 484, 488, 495,
     500, 504, 506, 507, 511, 512, 513, 514, 518, 519,
     523, 524, 529, 531, 537, 538, 539, 543, 544, 545,
     549, 554, 559, 562, 566, 570, 574, 578, 582
};


static final int YY_NUM_TERMINALS = 113;

static String yytname (int i) {
   if (i == yytname.length-1)
     return null;
   else
     return (String) yytname[i];
}

/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals. */
static final Object yytname[] =
{
  "$end", "error", "$undefined", "WORD", "TEXT", "INTLIT", "CHARLIT",
  "STRINGLIT", "IDENT", "\"run\"", "\"attach\"", "\"connect\"", "':'",
  "\"listen\"", "\"detach\"", "\"print\"", "'/'", "\"call\"",
  "\"exec-class\"", "\"exec-args\"", "\"backtrace\"", "\"all\"",
  "\"wherei\"", "\"up\"", "\"down\"", "\"frame\"", "\"save\"", "\"ptype\"",
  "\"dumpall\"", "\"set\"", "\"compressed\"", "\"pretty\"", "\"elements\"",
  "\"max-frames\"", "\"return\"", "\"on\"", "\"off\"", "\"prefix\"",
  "\"standard\"", "\"exprs\"", "\"both\"", "\"stdin\"", "\"variable\"",
  "\"history\"", "\"thread\"", "\"threadgroup\"", "\"^F\"", "\"suspend\"",
  "\"resume\"", "\"kill\"", "\"interrupt\"", "\"break\"", "\"clear\"",
  "\"command\"", "\"condition\"", "'('", "')'", "\"catch\"", "\"pass\"",
  "\"watch\"", "\"unwatch\"", "\"delete\"", "\"disable\"", "\"enable\"",
  "\"ignore\"", "\"trace\"", "\"methods\"", "\"untrace\"", "\"step\"",
  "\"finish\"", "\"next\"", "\"stepi\"", "\"continue\"", "\"exclude\"",
  "\"none\"", "\"reset\"", "'+'", "\"lock\"", "\"disablegc\"",
  "\"enablegc\"", "\"info\"", "\"locals\"", "\"classes\"", "\"class\"",
  "\"fields\"", "\"threads\"", "\"threadgroups\"", "\"classpath\"",
  "\"threadlocks\"", "\"stack\"", "\"loadclass\"", "\"sourcepath\"",
  "\"monitor\"", "\"unmonitor\"", "\"source\"", "\"list\"", "\"lines\"",
  "\"bytecodes\"", "'.'", "\"version\"", "\"quit\"", "\"help\"", "'<'",
  "'>'", "'&'", "','", "\"[]\"", "'*'", "\".0\"", "';'", "\"if\"",
  "\"access\"", "\"go\"", "$accept", "start", "command", "@1", "@2",
  "intlit", "intlit_dflt1", "intlit_dflt_m1", "int_list", "thread_id",
  "thread_id_list", "address", "address_opt", "run_args", "file_specs",
  "file_spec", "connector_args", "formal_types_opt", "formal_types",
  "formal_type", "class_id", "breakpoint_spec",
  "delete_breakpoint_spec_list", "delete_breakpoint_spec",
  "break_class_id", "exclude_class_id_list", "opt_sep", "id_pattern",
  "exception_spec", "if_clause_opt", "watchpoint_spec", "watch_type",
  "suspend_policy", "expr", "_copy_two_back", "_default_mode",
  "_break_mode", "_print_mode", "_check_connect", "_balanced_collect_mode",
  "_collect_all_mode", "_run_args_mode", 0
};

/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static final int[] yytoknum =
{
       0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
     265, 266, 58, 267, 268, 269, 47, 270, 271, 272,
     273, 274, 275, 276, 277, 278, 279, 280, 281, 282,
     283, 284, 285, 286, 287, 288, 289, 290, 291, 292,
     293, 294, 295, 296, 297, 298, 299, 300, 301, 302,
     303, 304, 305, 306, 307, 40, 41, 308, 309, 310,
     311, 312, 313, 314, 315, 316, 317, 318, 319, 320,
     321, 322, 323, 324, 325, 326, 43, 327, 328, 329,
     330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
     340, 341, 342, 343, 344, 345, 346, 347, 46, 348,
     349, 350, 60, 62, 38, 44, 351, 42, 352, 59,
     353, 354, 355
};

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 113, 114, 115, 116, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 117, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 115, 115, 115, 115,
     115, 115, 115, 115, 115, 115, 118, 119, 119, 120,
     120, 121, 121, 122, 122, 123, 123, 124, 125, 126,
     126, 126, 127, 127, 128, 128, 128, 129, 129, 130,
     130, 130, 131, 131, 132, 132, 133, 133, 134, 134,
     135, 135, 136, 136, 136, 137, 137, 137, 137, 138,
     138, 139, 139, 139, 140, 140, 140, 140, 141, 141,
     142, 142, 143, 143, 144, 144, 144, 145, 145, 145,
     146, 147, 148, 149, 150, 151, 152, 153, 154
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static final short yyr2[] =
{
       0, 2, 1, 2, 0, 4, 2, 4, 2, 1,
       3, 5, 5, 2, 1, 2, 2, 0, 4, 3,
       2, 3, 3, 2, 3, 3, 3, 3, 2, 4,
       2, 3, 5, 5, 3, 3, 4, 4, 4, 4,
       4, 4, 4, 3, 3, 3, 3, 4, 3, 3,
       2, 3, 2, 3, 2, 3, 3, 2, 3, 2,
       3, 3, 1, 2, 5, 4, 2, 3, 2, 3,
       2, 2, 2, 1, 2, 2, 2, 3, 4, 5,
       3, 3, 3, 2, 3, 3, 2, 1, 3, 3,
       4, 3, 3, 3, 3, 3, 2, 6, 7, 4,
       4, 3, 4, 3, 3, 3, 4, 4, 2, 2,
       2, 2, 4, 3, 4, 4, 2, 3, 2, 3,
       2, 3, 2, 3, 2, 2, 2, 3, 4, 5,
       6, 1, 1, 1, 2, 3, 1, 0, 1, 0,
       1, 1, 2, 1, 1, 1, 2, 1, 1, 1,
       1, 3, 1, 2, 2, 2, 3, 0, 1, 0,
       3, 2, 1, 3, 1, 2, 1, 3, 5, 4,
       1, 2, 1, 4, 3, 3, 1, 3, 2, 1,
       3, 0, 1, 1, 1, 1, 3, 3, 3, 1,
       0, 3, 6, 9, 0, 1, 1, 0, 1, 1,
       2, 0, 0, 0, 0, 0, 0, 0, 0
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 136, 208, 0, 0, 139, 9, 204, 206, 14,
     208, 205, 205, 137, 137, 0, 205, 206, 204, 0,
       0, 0, 207, 205, 205, 0, 205, 203, 203, 62,
       0, 203, 203, 203, 203, 73, 0, 0, 0, 205,
     205, 205, 205, 205, 205, 205, 203, 205, 205, 205,
       0, 208, 203, 208, 206, 0, 208, 203, 203, 203,
     131, 132, 133, 0, 2, 207, 4, 147, 6, 0,
     140, 148, 8, 206, 13, 0, 15, 17, 205, 205,
      20, 205, 205, 23, 138, 205, 205, 205, 28, 30,
     206, 207, 0, 0, 206, 0, 144, 143, 205, 205,
      50, 145, 205, 52, 205, 54, 206, 205, 57, 59,
       0, 63, 206, 206, 66, 68, 70, 197, 72, 197,
     141, 74, 75, 76, 0, 197, 0, 137, 83, 137,
     137, 86, 0, 206, 206, 206, 108, 109, 111, 110,
     203, 205, 96, 203, 203, 205, 205, 205, 205, 205,
     116, 205, 118, 120, 122, 0, 126, 125, 124, 0,
     205, 134, 1, 0, 0, 157, 0, 10, 200, 0,
      19, 21, 22, 24, 25, 26, 27, 206, 0, 31,
       0, 34, 35, 0, 0, 0, 0, 43, 44, 45,
      46, 48, 49, 51, 146, 53, 55, 56, 58, 176,
       0, 60, 0, 172, 61, 170, 0, 0, 0, 166,
       0, 189, 67, 69, 199, 198, 194, 142, 77, 0,
      80, 81, 82, 84, 85, 184, 88, 89, 0, 185,
     181, 179, 92, 93, 94, 0, 95, 205, 0, 101,
     103, 104, 105, 205, 205, 113, 117, 0, 119, 121,
     123, 127, 0, 135, 201, 0, 0, 5, 149, 152,
     158, 7, 206, 206, 18, 29, 206, 206, 47, 36,
      37, 38, 39, 40, 41, 42, 0, 0, 0, 178,
     171, 0, 0, 0, 65, 0, 0, 195, 196, 0,
      78, 181, 182, 183, 0, 0, 99, 0, 100, 102,
     106, 107, 112, 114, 115, 128, 0, 0, 154, 155,
       0, 153, 11, 12, 32, 33, 175, 190, 177, 174,
     159, 64, 188, 167, 206, 0, 79, 180, 186, 187,
     202, 129, 0, 151, 156, 206, 169, 0, 190, 173,
       0, 0, 97, 167, 0, 161, 0, 162, 164, 168,
     203, 167, 98, 191, 160, 0, 165, 0, 163, 0,
     193
};

/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 63, 64, 164, 169, 203, 85, 71, 121, 101,
     102, 68, 72, 257, 258, 259, 261, 338, 346, 347,
     211, 201, 204, 205, 206, 230, 294, 231, 212, 336,
     116, 289, 216, 74, 307, 342, 109, 73, 80, 75,
     100, 66
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */

static final short yypact[] =
{
     292, -162, -162, 30, 29, 78, -162, -162, -162, 46,
    -162, 50, 89, 83, 83, 30, -162, -162, -162, 168,
      51, 52, -162, 51, 51, 51, 51, -162, -162, 30,
      20, -162, -162, -162, -162, 30, 30, 30, 30, -162,
    -162, -162, -162, -162, -162, -162, 47, -162, -162, -162,
     155, -162, -162, -162, -162, 30, -162, 81, -162, -162,
    -162, -162, 108, 92, -162, -162, 144, -162, -162, 141,
    -162, -162, -162, 162, -162, 170, -162, 184, -162, -162,
    -162, -162, -162, -162, -162, -162, -162, -162, 186, -162,
     182, -162, 192, 145, -162, 30, -162, -162, -162, -162,
     195, -162, 51, -162, 51, -162, -162, -162, -162, 38,
      33, -162, -162, -162, 42, 42, -162, -27, -162, 21,
    -162, 30, -162, -162, 30, -27, 134, 53, -162, 83,
      83, -162, 32, -162, -162, -162, -162, -162, -162, -162,
    -162, -162, -162, -162, -162, -162, -162, -162, -162, 60,
     205, -162, 210, 213, -162, 215, -162, -162, -162, 212,
    -162, -162, -162, 224, 45, 227, 154, -162, -162, 45,
    -162, -162, -162, -162, -162, -162, -162, -162, 164, -162,
     228, -162, -162, 30, 30, 158, 148, -162, -162, -162,
    -162, -162, -162, -162, -162, -162, -162, -162, -162, -162,
     135, -162, 54, -162, 33, -162, 58, 230, 231, -162,
     147, 150, -162, -162, -162, -162, -2, -162, -162, 183,
    -162, -162, -162, -162, -162, -162, -162, -162, 43, -162,
      16, 156, -162, -162, -162, 212, -162, -162, 212, 249,
    -162, -162, 171, -162, -162, -162, -162, 212, -162, -162,
    -162, 15, 212, -162, 253, 252, 10, -162, 93, -162,
    -162, -162, -162, -162, -162, -162, -162, -162, -162, -162,
    -162, -162, -162, -162, -162, -162, 248, 30, 250, -162,
    -162, 30, 251, 201, -162, 212, 254, -162, -162, 18,
      51, 27, -162, -162, 43, 44, 150, 212, 150, -162,
    -162, -162, -162, -162, 150, -162, 25, 45, -162, -162,
     257, -162, -162, -162, -162, -162, -162, 151, 12, -162,
      22, -162, 150, -162, -162, 165, -162, 156, -162, -162,
     150, -162, 256, -162, -162, -162, -162, 31, 151, -162,
     209, 258, 247, 269, 266, -162, -36, 166, 150, -162,
    -162, 271, -162, -162, -162, 212, -162, 175, 166, 267,
    -162
};

/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -162, -162, -162, -162, -162, 7, -3, -162, -162, -11,
     262, -162, -162, -161, -162, 19, -162, -46, -162, -79,
     -70, -162, -162, 74, 172, 59, -162, -14, 167, -49,
     260, -162, 173, -16, -162, -162, -28, 272, 56, -52,
     -37, 119
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */

static final short yytable[] =
{
     110, 89, 153, 114, 115, 117, 119, 65, 264, 98,
      67, 86, -159, 309, 106, 107, -91, 214, 132, 287,
     354, -71, 87, 305, 151, 1, 209, -90, 163, 158,
     159, 160, 69, 331, -177, 1, 111, 113, 1, 209,
     225, 199, 120, 122, 123, 124, 199, -87, 254, 76,
     209, 225, 328, 78, 180, 99, 96, 167, 84, 97,
     207, 208, 154, 243, 157, 214, 277, 337, 83, 355,
     281, 79, 88, 324, 179, 112, 221, 337, 189, 103,
     105, 244, 108, 70, 156, 215, 1, 345, 84, 251,
     197, 194, 162, 194, 81, 125, 126, 127, 128, 129,
     130, 131, 190, 133, 134, 135, 226, 227, 228, 288,
      82, 161, 235, 286, 310, 237, 238, 232, 233, 234,
    -177, 292, -159, 332, 222, 293, 223, 224, 217, 77,
    -177, 218, 292, 215, 170, 171, 293, 172, 173, 229,
     200, 174, 175, 176, -3, 200, 333, 255, 256, 210,
     229, 329, 278, 165, 191, 192, 282, 262, 195, 1,
     196, 265, 279, 198, 136, 296, 279, 266, 298, 1,
     150, 91, 152, 263, 168, 155, 96, 304, 166, 97,
     187, 188, 306, 92, -16, 267, 273, 274, 275, 177,
     269, 270, 300, 271, 272, 255, 256, 236, 178, 193,
     220, 239, 240, 241, 242, 245, 137, 247, 246, 93,
      94, 95, 138, 248, 139, 322, 252, 249, 250, 325,
     209, 140, 181, 182, 183, 184, 185, 330, 253, 186,
     260, 301, 268, 276, 283, 284, 141, 142, 143, 144,
     145, 146, 147, 148, 149, 285, 312, 313, 286, 290,
     314, 315, 299, -150, 295, 308, 316, 321, 318, 320,
     334, 335, 323, 341, 343, 350, 351, 348, 352, -130,
     353, -192, 356, 359, 339, 360, 358, 311, 280, 326,
     327, 202, 213, 344, 317, 348, 104, 291, 319, 349,
      90, 0, 0, 297, 118, 0, 0, 1, 219, 302,
     303, 2, 3, 4, 0, 5, 6, 7, 340, 8,
       9, 10, 11, 0, 12, 13, 14, 15, 16, 17,
      18, 19, 357, 0, 0, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 20, 21, 22, 23,
      24, 25, 26, 27, 28, 29, 30, 0, 0, 31,
      32, 33, 34, 35, 36, 37, 38, 39, 0, 40,
      41, 42, 43, 44, 45, 46, 0, 0, 0, 47,
      48, 49, 50, 0, 0, 0, 0, 0, 0, 51,
       0, 0, 52, 53, 54, 55, 56, 57, 58, 59,
       0, 60, 61, 62
};

static final short yycheck[] =
{
      28, 17, 54, 31, 32, 33, 34, 0, 169, 20,
       3, 14, 0, 3, 25, 26, 0, 44, 46, 21,
      56, 0, 15, 8, 52, 5, 8, 0, 65, 57,
      58, 59, 3, 8, 12, 5, 29, 30, 5, 8,
       8, 8, 35, 36, 37, 38, 8, 0, 3, 3,
       8, 8, 8, 3, 91, 3, 5, 73, 5, 8,
     112, 113, 55, 3, 57, 44, 12, 55, 12, 105,
      12, 21, 16, 55, 90, 55, 23, 55, 94, 23,
      24, 21, 26, 5, 3, 112, 5, 56, 5, 159,
     106, 102, 0, 104, 5, 39, 40, 41, 42, 43,
      44, 45, 95, 47, 48, 49, 74, 75, 76, 111,
      21, 3, 140, 98, 104, 143, 144, 133, 134, 135,
      98, 105, 110, 98, 127, 109, 129, 130, 121, 10,
     108, 124, 105, 112, 78, 79, 109, 81, 82, 107,
     107, 85, 86, 87, 0, 107, 307, 102, 103, 107,
     107, 107, 98, 12, 98, 99, 98, 3, 102, 5,
     104, 177, 108, 107, 9, 235, 108, 3, 238, 5,
      51, 3, 53, 166, 4, 56, 5, 247, 16, 8,
      35, 36, 252, 15, 0, 178, 38, 39, 40, 3,
     183, 184, 21, 35, 36, 102, 103, 141, 16, 4,
      66, 145, 146, 147, 148, 149, 51, 151, 3, 41,
      42, 43, 57, 3, 59, 285, 160, 4, 3, 289,
       8, 66, 30, 31, 32, 33, 34, 297, 4, 37,
       3, 242, 4, 98, 4, 4, 81, 82, 83, 84,
      85, 86, 87, 88, 89, 98, 262, 263, 98, 66,
     266, 267, 3, 0, 98, 3, 8, 56, 8, 8,
       3, 110, 8, 98, 8, 56, 8, 337, 21, 0,
       4, 0, 106, 98, 320, 8, 355, 258, 204, 290,
     294, 109, 115, 335, 277, 355, 24, 228, 281, 338,
      18, -1, -1, 237, 34, -1, -1, 5, 125, 243,
     244, 9, 10, 11, -1, 13, 14, 15, 324, 17,
      18, 19, 20, -1, 22, 23, 24, 25, 26, 27,
      28, 29, 350, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, 44, 45, 46, 47,
      48, 49, 50, 51, 52, 53, 54, -1, -1, 57,
      58, 59, 60, 61, 62, 63, 64, 65, -1, 67,
      68, 69, 70, 71, 72, 73, -1, -1, -1, 77,
      78, 79, 80, -1, -1, -1, -1, -1, -1, 87,
      -1, -1, 90, 91, 92, 93, 94, 95, 96, 97,
      -1, 99, 100, 101
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 5, 9, 10, 11, 13, 14, 15, 17, 18,
      19, 20, 22, 23, 24, 25, 26, 27, 28, 29,
      44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
      54, 57, 58, 59, 60, 61, 62, 63, 64, 65,
      67, 68, 69, 70, 71, 72, 73, 77, 78, 79,
      80, 87, 90, 91, 92, 93, 94, 95, 96, 97,
      99, 100, 101, 114, 115, 118, 154, 118, 124, 3,
       5, 120, 125, 150, 146, 152, 3, 154, 3, 21,
     151, 5, 21, 151, 5, 119, 119, 118, 151, 146,
     150, 3, 15, 41, 42, 43, 5, 8, 122, 3,
     153, 122, 123, 151, 123, 151, 122, 122, 151, 149,
     149, 118, 55, 118, 149, 149, 143, 149, 143, 149,
     118, 121, 118, 118, 118, 151, 151, 151, 151, 151,
     151, 151, 149, 151, 151, 151, 9, 51, 57, 59,
      66, 81, 82, 83, 84, 85, 86, 87, 88, 89,
     154, 149, 154, 152, 118, 154, 3, 118, 149, 149,
     149, 3, 0, 153, 116, 12, 16, 146, 4, 117,
     151, 151, 151, 151, 151, 151, 151, 3, 16, 146,
     153, 30, 31, 32, 33, 34, 37, 35, 36, 146,
     118, 151, 151, 4, 122, 151, 151, 146, 151, 8,
     107, 134, 137, 118, 135, 136, 137, 152, 152, 8,
     107, 133, 141, 141, 44, 112, 145, 118, 118, 145,
      66, 23, 119, 119, 119, 8, 74, 75, 76, 107,
     138, 140, 146, 146, 146, 149, 151, 149, 149, 151,
     151, 151, 151, 3, 21, 151, 3, 151, 3, 4,
       3, 133, 151, 4, 3, 102, 103, 126, 127, 128,
       3, 129, 3, 118, 126, 146, 3, 118, 4, 118,
     118, 35, 36, 38, 39, 40, 98, 12, 98, 108,
     136, 12, 98, 4, 4, 98, 98, 21, 111, 144,
      66, 138, 105, 109, 139, 98, 133, 151, 133, 3,
      21, 122, 151, 151, 133, 8, 133, 147, 3, 3,
     104, 128, 146, 146, 146, 146, 8, 118, 8, 118,
       8, 56, 133, 8, 55, 133, 122, 140, 8, 107,
     133, 8, 98, 126, 3, 110, 142, 55, 130, 130,
     146, 98, 148, 8, 152, 56, 131, 132, 133, 142,
      56, 8, 21, 4, 56, 105, 106, 149, 132, 98,
       8
};
/* Like YYERROR except do call yyerror.  This remains here temporarily
   to ease the transition to the new meaning of YYERROR, for GCC.
   Once GCC version 2 has supplanted version 1, this can go.  */
/* Enable debugging if requested.  */
static private final String yyendl
    = System.getProperty ("line.separator", "\n");
/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/
private void yy_stack_print (int[] stack, int bottom, int top)
{
  System.err.print ("Stack now");
  for (/* Nothing. */; bottom <= top; bottom += 1)
    System.err.print (" " + stack[bottom]);
  System.err.print (yyendl);
}
/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/
private void yy_reduce_print (int yyrule)
{
  int yyi;
  int yylno = yyrline[yyrule];
  System.err.print ("Reducing stack by rule " + (yyrule - 1)
      + " (line " + yylno + "), ");
  /* Print the symbols being reduced, and their result.  */
  for (yyi = yyprhs[yyrule]; 0 <= yyrhs[yyi]; yyi += 1)
    System.err.print (yytname [yyrhs[yyi]] + " ");
  System.err.print ("-> " + yytname [yyr1[yyrule]] + yyendl);
}
/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
/* YYINITDEPTH -- initial size of the parser's stacks.  */
/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   SIZE_MAX < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */
/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/
private void yysymprint (int yytype, Object yyvaluep, int yylocationp)
{
  if (yytype < 113)
    System.err.print ("token " + yytname[yytype]);
  else
    System.err.print ("nterm " + yytname[yytype]);
}
/*----------.
| parse.  |
`----------*/
  private static final int
    yyabortlab = 1,
    yyacceptlab = 2,
    yybackup = 3,
    yydefault = 4,
    yyerrlab = 5,
    yyerrlab1 = 6,
    yyerrorlab = 7,
    yynewstate = 8,
    yyoverflowlab = 9,
    yyreduce = 10,
    yyreturn = 11,
    yysetstate = 12;
  /* The semantic value of the look-ahead symbol.  */
  public Object yylval;
  /* Location data for the look-ahead symbol.  */
  public int yylloc;
public int parse ()
{
  /* The look-ahead symbol.  */
  int yychar;
  /* Number of syntax errors so far.  */
  int yynerrs;
  int yystate;
  int yyn;
  int yyresult;
  /* Number of tokens to shift before error messages enabled.  */
  int yyerrstatus;
  /* Look-ahead token as an internal (translated) token number.  */
  int yytoken = 0;
  /* Three stacks and their tools:
     `yyss': related to states,
     `yyvs': related to semantic values,
     `yyls': related to locations.

     Refer to the stacks thru separate pointers, to allow yyoverflow
     to reallocate them elsewhere.  */
  /* The state stack.  */
  int yyssa[] = new int [200];
  int yyss = 0;
  int yyssp;
  /* The semantic value stack.  */
  Object yyvsa[] = new Object[200];
  int yyvs = 0;
  int yyvsp;
  /* The location stack.  */
  int yylsa[] = new int[200];
  int yyls = 0;
  int yylsp;
  /* The locations where the error started and ended. */
  int yyerror_range[] = new int[2];
  int yystacksize = 200;
  /* The variables used to return semantic value and location from the
     action routines.  */
  Object yyval;
  int yyloc;
  /* When reducing, the number of symbols on the RHS of the reduced
     rule.  */
  int yylen;
  do { if (yydebug != 0) System.err.print ( "Starting parse" + yyendl); } while (false);
  yystate = 0;
  yyerrstatus = 0;
  yynerrs = 0;
  yychar = (-2); /* Cause a token to be read.  */
  /* Initialize stack pointers.
     Waste one element of value and location stack
     so that they stay on the same level as the state stack.
     The wasted elements are never initialized.  */
  yyssp = yyss;
  yyvsp = yyvs;
  yylsp = yyls;
  yyloc = YYLTYPE_INIT;
  yylsa[yylsp] = yyloc;
  /* Artificial initializations to keep Java happy */
  yyn = 0;
  yylen = 0;
  yyresult = 0;
  /* pc is used to hold a goto label (or FSA state, if you prefer). */
  int pc;
  pc = yysetstate;
Loop:
  while (true) {
    switch (pc) {
/*------------------------------------------------------------.
| yynewstate -- Push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
 case yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed. so pushing a state here evens the stacks.
     */
  yyssp++;
 case yysetstate:
  yyssa[yyssp] = yystate;
  if (yyss + yystacksize - 1 <= yyssp)
    {
      /* Get the current used size of the three stacks, in elements.  */
      int yysize = yyssp - yyss + 1;
      /* Extend the stack our own way.  */
      if (10000 <= yystacksize)
 do { pc = yyoverflowlab; continue Loop; } while (false);
      yystacksize *= 2;
      if (10000 < yystacksize)
 yystacksize = 10000;
      { int[] newStack = new int[yystacksize]; System.arraycopy (yyssa, 0, newStack, 0, yyssa.length); yyssa = newStack; };
      { Object[] newStack = new Object[yystacksize]; System.arraycopy (yyvsa, 0, newStack, 0, yyvsa.length); yyvsa = newStack; };
      { int[] newStack = new int[yystacksize]; System.arraycopy (yylsa, 0, newStack, 0, yylsa.length); yylsa = newStack; };
      do { if (yydebug != 0) System.err.print ( "Stack size increased to " + yystacksize + yyendl); } while (false);
    }
  do { if (yydebug != 0) System.err.print ( "Entering state " + yystate + yyendl); } while (false);
  do { pc = yybackup; continue Loop; } while (false);
/*-----------.
| yybackup.  |
`-----------*/
case yybackup:
/* Do appropriate processing given the current state.  */
/* Read a look-ahead token if we need one and don't already have one.  */
/* yyresume: */
  /* First try to decide what to do without reference to look-ahead token.  */
  yyn = yypact[yystate];
  if (yyn == -162)
    do { pc = yydefault; continue Loop; } while (false);
  /* Not known => get a look-ahead token if don't already have one.  */
  /* YYCHAR is either YYEMPTY or YYEOF or a valid look-ahead symbol.  */
  if (yychar == (-2))
    {
      do { if (yydebug != 0) System.err.print ( "Reading a token: "); } while (false);
      yychar = yylex ();
    }
  if (yychar <= 0)
    {
      yychar = yytoken = 0;
      do { if (yydebug != 0) System.err.print ( "Now at end of input." + yyendl); } while (false);
    }
  else
    {
      yytoken = ((yychar) >= 0 && (yychar) <= 355 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }
  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 393 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -193)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }
  if (yyn == 162)
    do { pc = yyacceptlab; continue Loop; } while (false);
  /* Shift the look-ahead token.  */
  do { if (yydebug != 0) { System.err.print ("Shifting" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
  /* Discard the token being shifted unless it is eof.  */
  if (yychar != 0)
    yychar = (-2);
  yyvsa[++yyvsp] = yylval;
  yylsa[++yylsp] = yylloc;
  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus != 0)
    yyerrstatus--;
  yystate = yyn;
  do { pc = yynewstate; continue Loop; } while (false);
/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
case yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    do { pc = yyerrlab; continue Loop; } while (false);
  do { pc = yyreduce; continue Loop; } while (false);
/*-----------------------------.
| yyreduce -- Do a reduction.  |
`-----------------------------*/
case yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];
  /* If YYLEN is nonzero, implement the default value of the action:
     `$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsa[yyvsp+1-yylen];
  /* Default location. */
  ;
  do { if (yydebug != 0) yy_reduce_print (yyn); } while (false);
  switch (yyn)
    {
        case 3:
// _line_ 57 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRun ();
                  startHandler (); ;}
    break;
  case 4:
// _line_ 59 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = new CommandLineSpec (); ;}
    break;
  case 5:
// _line_ 60 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRun (((CommandLineSpec)yyvsa[yyvsp+(-1)]));
                   startHandler (); ;}
    break;
  case 6:
// _line_ 63 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandAttach (((Integer)yyvsa[yyvsp+(0)]));
                  startHandler (); ;}
    break;
  case 7:
// _line_ 66 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandConnect (((String)yyvsa[yyvsp+(-2)]) + ":" + ((String)yyvsa[yyvsp+(0)]));
                  startHandler (); ;}
    break;
  case 8:
// _line_ 69 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandListen (((Integer)yyvsa[yyvsp+(0)]));
                  startHandler (); ;}
    break;
  case 9:
// _line_ 72 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDetach (); ;}
    break;
  case 10:
// _line_ 74 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false);
                  showPrompt = false; ;}
    break;
  case 11:
// _line_ 77 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])), printFormat (((String)yyvsa[yyvsp+(-1)])),
                                          false);
                  showPrompt = false; ;}
    break;
  case 12:
// _line_ 81 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', false);
                  showPrompt = false; ;}
    break;
  case 13:
// _line_ 84 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.NO_PRINT, ' ', false);
                  showPrompt = false; ;}
    break;
  case 14:
// _line_ 87 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetClass (""); ;}
    break;
  case 15:
// _line_ 89 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetClass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 16:
// _line_ 91 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetArgs (new CommandLineSpec ()); ;}
    break;
  case 17:
// _line_ 92 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = new CommandLineSpec (); ;}
    break;
  case 18:
// _line_ 93 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetArgs (((CommandLineSpec)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 19:
// _line_ 95 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 20:
// _line_ 97 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 21:
// _line_ 99 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 22:
// _line_ 101 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), true); ;}
    break;
  case 23:
// _line_ 103 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, true); ;}
    break;
  case 24:
// _line_ 105 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (true); ;}
    break;
  case 25:
// _line_ 107 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUp (((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 26:
// _line_ 109 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUp (-((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 27:
// _line_ 111 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFrame (((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 28:
// _line_ 113 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSave ();
                  showPrompt = false; ;}
    break;
  case 29:
// _line_ 116 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSave (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)]));
                   showPrompt = false; ;}
    break;
  case 30:
// _line_ 119 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPtype (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 31:
// _line_ 121 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.EXAMINE, ' ', true);
                  showPrompt = false; ;}
    break;
  case 32:
// _line_ 124 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])),
                                          printFormat (((String)yyvsa[yyvsp+(-1)])), true);
                  showPrompt = false; ;}
    break;
  case 33:
// _line_ 128 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', true);
                  showPrompt = false; ;}
    break;
  case 34:
// _line_ 131 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "compressed", 0); ;}
    break;
  case 35:
// _line_ 133 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "pretty", 0); ;}
    break;
  case 36:
// _line_ 135 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "elements", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 37:
// _line_ 137 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "max-frames", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 38:
// _line_ 139 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "return", 1); ;}
    break;
  case 39:
// _line_ 141 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "return", 0); ;}
    break;
  case 40:
// _line_ 143 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "prefix", 0); ;}
    break;
  case 41:
// _line_ 145 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "prefix", 1); ;}
    break;
  case 42:
// _line_ 147 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "prefix", 2); ;}
    break;
  case 43:
// _line_ 149 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "on", 0); ;}
    break;
  case 44:
// _line_ 151 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "off", 0); ;}
    break;
  case 45:
// _line_ 153 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false); ;}
    break;
  case 46:
// _line_ 155 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("history", "save", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 47:
// _line_ 157 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(-2)]) + " " + ((String)yyvsa[yyvsp+(0)]),
                                          evaluator.PRINT, ' ', false); ;}
    break;
  case 48:
// _line_ 160 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThread (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 49:
// _line_ 162 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroup (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 50:
// _line_ 164 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 51:
// _line_ 166 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 52:
// _line_ 168 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 53:
// _line_ 170 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (((List)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 54:
// _line_ 172 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (); ;}
    break;
  case 55:
// _line_ 174 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (((List)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 56:
// _line_ 176 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandKill (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 57:
// _line_ 178 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (); ;}
    break;
  case 58:
// _line_ 180 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 59:
// _line_ 182 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (); ;}
    break;
  case 60:
// _line_ 184 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 61:
// _line_ 186 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClear (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 62:
// _line_ 188 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (reader, false); ;}
    break;
  case 63:
// _line_ 190 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (((Integer)yyvsa[yyvsp+(0)]), reader, false); ;}
    break;
  case 64:
// _line_ 192 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 65:
// _line_ 194 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 66:
// _line_ 196 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (); ;}
    break;
  case 67:
// _line_ 198 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 68:
// _line_ 200 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (); ;}
    break;
  case 69:
// _line_ 202 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 70:
// _line_ 204 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWatch (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 71:
// _line_ 206 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (); ;}
    break;
  case 72:
// _line_ 208 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 73:
// _line_ 210 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (); ;}
    break;
  case 74:
// _line_ 212 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 75:
// _line_ 214 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnable (((Integer)yyvsa[yyvsp+(0)]), false); ;}
    break;
  case 76:
// _line_ 216 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnable (((Integer)yyvsa[yyvsp+(0)]), true); ;}
    break;
  case 77:
// _line_ 218 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandIgnore (((Integer)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 78:
// _line_ 220 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-1)]), null); ;}
    break;
  case 79:
// _line_ 222 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 80:
// _line_ 224 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUntrace (); ;}
    break;
  case 81:
// _line_ 226 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OUT, 1); ;}
    break;
  case 82:
// _line_ 229 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 83:
// _line_ 232 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OUT, 1); ;}
    break;
  case 84:
// _line_ 235 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OVER, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 85:
// _line_ 238 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_MIN,
                                         StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 86:
// _line_ 241 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCont (); ;}
    break;
  case 87:
// _line_ 243 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExclude (); ;}
    break;
  case 88:
// _line_ 245 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeClear (); ;}
    break;
  case 89:
// _line_ 247 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeReset (); ;}
    break;
  case 90:
// _line_ 249 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeAdd (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 91:
// _line_ 251 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeSet (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 92:
// _line_ 253 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLock (((String)yyvsa[yyvsp+(0)]));
                  showPrompt = false; ;}
    break;
  case 93:
// _line_ 256 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), false);
                  showPrompt = false; ;}
    break;
  case 94:
// _line_ 259 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), true);
                  showPrompt = false; ;}
    break;
  case 95:
// _line_ 262 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLocals (); ;}
    break;
  case 96:
// _line_ 264 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasses (); ;}
    break;
  case 97:
// _line_ 266 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 98:
// _line_ 268 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-2)]), true); ;}
    break;
  case 99:
// _line_ 270 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMethods (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 100:
// _line_ 272 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFields (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 101:
// _line_ 274 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (); ;}
    break;
  case 102:
// _line_ 276 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 103:
// _line_ 278 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroups (); ;}
    break;
  case 104:
// _line_ 280 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspathInfo (); ;}
    break;
  case 105:
// _line_ 282 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (); ;}
    break;
  case 106:
// _line_ 284 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocksAll (); ;}
    break;
  case 107:
// _line_ 286 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 108:
// _line_ 288 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInfoRun (); ;}
    break;
  case 109:
// _line_ 290 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); ;}
    break;
  case 110:
// _line_ 292 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); ;}
    break;
  case 111:
// _line_ 294 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); ;}
    break;
  case 112:
// _line_ 296 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 113:
// _line_ 298 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 114:
// _line_ 300 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 115:
// _line_ 302 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLoadclass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 116:
// _line_ 304 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (); ;}
    break;
  case 117:
// _line_ 306 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 118:
// _line_ 308 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (); ;}
    break;
  case 119:
// _line_ 310 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 120:
// _line_ 312 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (); ;}
    break;
  case 121:
// _line_ 314 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 122:
// _line_ 316 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnmonitor (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 123:
// _line_ 318 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRead (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 124:
// _line_ 320 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, null); ;}
    break;
  case 125:
// _line_ 322 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 126:
// _line_ 324 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 127:
// _line_ 326 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 128:
// _line_ 328 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 129:
// _line_ 330 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 130:
// _line_ 332 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 131:
// _line_ 334 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandVersion (GJDB.progname, Version.value); ;}
    break;
  case 132:
// _line_ 336 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandQuit (); ;}
    break;
  case 133:
// _line_ 338 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (); ;}
    break;
  case 134:
// _line_ 340 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 135:
// _line_ 342 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRepeat (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)]), reader); ;}
    break;
  case 136:
// _line_ 346 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 137:
// _line_ 349 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = 1; ;}
    break;
  case 138:
// _line_ 350 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 139:
// _line_ 354 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = -1; ;}
    break;
  case 140:
// _line_ 355 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 141:
// _line_ 359 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Integer> L = new ArrayList<Integer> ();
                          yyval = L; L.add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 142:
// _line_ 362 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 145:
// _line_ 371 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> v = new ArrayList<String> ();
                          v.add (((String)yyvsa[yyvsp+(0)]));
                          yyval = v; ;}
    break;
  case 146:
// _line_ 375 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 150:
// _line_ 389 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
                          spec.cmdArgs += " " + shellConvert (((String)yyvsa[yyvsp+(0)]));
                          yyval = spec; ;}
    break;
  case 151:
// _line_ 393 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
                          spec.cmdArgs = " " + shellConvert (((String)yyvsa[yyvsp+(-2)]))
                                         + spec.cmdArgs;
                          yyval = spec; ;}
    break;
  case 152:
// _line_ 401 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((CommandLineSpec)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 153:
// _line_ 402 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 154:
// _line_ 408 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
                          if (spec.inFile != null)
                              throw ERROR ("Ambiguous input redirection");
                          spec.inFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 155:
// _line_ 414 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 156:
// _line_ 420 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-3)]);
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = spec.errFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 157:
// _line_ 428 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 159:
// _line_ 433 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 160:
// _line_ 435 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 161:
// _line_ 436 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;
  case 162:
// _line_ 440 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
                          yyval = L;
                          L.add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 163:
// _line_ 444 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 165:
// _line_ 449 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-1)]) + "[]"; ;}
    break;
  case 167:
// _line_ 454 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 168:
// _line_ 459 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-2)]), ((List)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 169:
// _line_ 461 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((Integer)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 170:
// _line_ 466 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Object> L = new ArrayList<Object> ();
               yyval = L;
               L.add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 171:
// _line_ 470 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 172:
// _line_ 474 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 173:
// _line_ 476 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-1)]), ((List)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 174:
// _line_ 478 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-2)]), ((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 175:
// _line_ 482 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 177:
// _line_ 485 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-2)]).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 178:
// _line_ 489 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-1)]).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)yyvsa[yyvsp+(-1)]) + ".0"; ;}
    break;
  case 179:
// _line_ 496 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
                          L.add (((String)yyvsa[yyvsp+(0)]));
                          yyval = L;
                        ;}
    break;
  case 180:
// _line_ 501 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 185:
// _line_ 512 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*"; ;}
    break;
  case 186:
// _line_ 513 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 187:
// _line_ 514 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + ".*"; ;}
    break;
  case 188:
// _line_ 518 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec ("*." + ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 189:
// _line_ 519 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 190:
// _line_ 523 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 191:
// _line_ 525 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 192:
// _line_ 530 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-2)]), null, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 193:
// _line_ 533 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-7)]), ((String)yyvsa[yyvsp+(-6)]), null, ((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 194:
// _line_ 537 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 195:
// _line_ 538 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "all"; ;}
    break;
  case 196:
// _line_ 539 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "access"; ;}
    break;
  case 197:
// _line_ 543 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_ALL; ;}
    break;
  case 198:
// _line_ 544 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_NONE; ;}
    break;
  case 199:
// _line_ 545 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; ;}
    break;
  case 200:
// _line_ 550 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 201:
// _line_ 554 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 202:
// _line_ 559 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toDefaultMode (); ;}
    break;
  case 203:
// _line_ 562 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBreakMode (); ;}
    break;
  case 204:
// _line_ 566 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toPrintMode (); ;}
    break;
  case 205:
// _line_ 570 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.checkConnect (); ;}
    break;
  case 206:
// _line_ 574 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBalancedCollectMode (); ;}
    break;
  case 207:
// _line_ 578 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toCollectMode (); ;}
    break;
  case 208:
// _line_ 582 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toRunArgsMode (); ;}
    break;
    }
/* Line 813 of yacc.java.  */
// _line_ 2134 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"
  yyvsp -= yylen;
  yyssp -= yylen;
  yylsp -= yylen;
  do { if (yydebug != 0) yy_stack_print (yyssa, (yyss), (yyssp)); } while (false);
  yyvsa[++yyvsp] = yyval;
  yylsa[++yylsp] = yyloc;
  /* Now `shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */
  yyn = yyr1[yyn];
  yystate = yypgoto[yyn - 113] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 393 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 113];
  do { pc = yynewstate; continue Loop; } while (false);
/*------------------------------------.
| yyerrlab -- here on detecting error |
`------------------------------------*/
case yyerrlab:
  /* If not already recovering from an error, report this error.  */
  if (yyerrstatus == 0)
    {
      ++yynerrs;
 yyerror (yylloc, "syntax error");
    }
  yyerror_range[0] = yylloc;
  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse look-ahead token after an
	 error, discard it.  */
      if (yychar <= 0)
        {
          /* If at end of input, pop the error token,
	     then the rest of the stack, then return failure.  */
   if (yychar == 0)
      for (;;)
        {
                 yyerror_range[0] = yylsa[yylsp];
   yyvsp--; yyssp--; yylsp--;
   if (yyssp == yyss)
     do { pc = yyabortlab; continue Loop; } while (false);
        }
        }
      else
 {
   yychar = (-2);
 }
    }
  /* Else will try to reuse look-ahead token after shifting the error
     token.  */
  do { pc = yyerrlab1; continue Loop; } while (false);
/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
case yyerrorlab:
  yyerror_range[0] = yylsa[yylsp+1-yylen];
  yylsp -= yylen;
  yyvsp -= yylen;
  yyssp -= yylen;
  yystate = yyssa[yyssp];
  do { pc = yyerrlab1; continue Loop; } while (false);
/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
case yyerrlab1:
  yyerrstatus = 3; /* Each real token shifted decrements this.  */
  for (;;)
    {
      yyn = yypact[yystate];
      if (yyn != -162)
 {
   yyn += 1;
   if (0 <= yyn && yyn <= 393 && yycheck[yyn] == 1)
     {
       yyn = yytable[yyn];
       if (0 < yyn)
  break;
     }
 }
      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
 do { pc = yyabortlab; continue Loop; } while (false);
      yyerror_range[0] = yylsa[yylsp];
      yyvsp--; yyssp--; yylsp--;
      yystate = yyssa[yyssp];
      do { if (yydebug != 0) yy_stack_print (yyssa, (yyss), (yyssp)); } while (false);
    }
  if (yyn == 162)
    do { pc = yyacceptlab; continue Loop; } while (false);
  yyvsa[++yyvsp] = yylval;
  yyerror_range[1] = yylloc;
  /* Using YYLLOC is tempting, but would change the location of
     the look-ahead.  YYLOC is available though. */
  ;
  yylsa[++yylsp] = yyloc;
  /* Shift the error token. */
  do { if (yydebug != 0) { System.err.print ("Shifting" + " "); yysymprint (yystos[yyn], yyvsa[yyvsp], yylsa[yylsp]); System.err.print (yyendl); } } while (false);
  yystate = yyn;
  do { pc = yynewstate; continue Loop; } while (false);
/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
case yyacceptlab:
  yyresult = 0;
  do { pc = yyreturn; continue Loop; } while (false);
/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
case yyabortlab:
  yychar = (-2);
  yyresult = 1;
  do { pc = yyreturn; continue Loop; } while (false);
/*----------------------------------------------.
| yyoverflowlab -- parser overflow comes here.  |
`----------------------------------------------*/
case yyoverflowlab:
  yyerror (yylloc, "parser stack overflow");
  yyresult = 2;
  /* Fall through.  */
case yyreturn:
  return yyresult;
}
}
}
// _line_ 585 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
private Commands evaluator;
private boolean showPrompt;
private BufferedReader reader;
private static final HashMap<String, Integer> tokenMap =
        new HashMap<String, Integer> ();
static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt)
{
    execute (src, evaluator, reader, prompt, false);
}
static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt, boolean passException)
{
    CommandParser parser = new CommandParser (new CommandLexer (src));
    try {
        try {
            parser.reader = reader;
            parser.evaluator = evaluator;
            parser.showPrompt = prompt;
            parser.parse ();
        } catch (UnsupportedOperationException uoe) {
            throw ERROR ("Command is not supported on the target VM");
        } catch (VMNotConnectedException vmnse) {
            throw ERROR ("Command is not valid until the program is started or attached");
        } catch (CommandException e) {
            throw e;
        } catch (VMDisconnectedException e) {
            Env.shutdown (null);
            throw ERROR ("Debugged process has disconnected.");
        } catch (Exception e) {
            throw ERROR ("Unknown error in command: %s", e);
        }
    } catch (CommandException e) {
        if (passException)
            throw e;
        Env.errorln ("%s", e.getMessage ());
    }
    if (parser.showPrompt)
        evaluator.printPrompt ();
}
private CommandParser (CommandLexer lexer) {
    this.lexer = lexer;
    lexer.parser = this;
}
private CommandLexer lexer;
private int convertInt (String s) {
    try {
        return Integer.decode (s);
    } catch (NumberFormatException e) {
        throw ERROR ("badly formed integer numeral");
    }
}
static final private Pattern PRINT_OPTIONS_PATN
  = Pattern.compile ("(?i)([xodbcsr]?)(\\d*)([xodbcsr]?)$");
private void startHandler () {
    evaluator.startHandler ();
}
private int printDepth (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches ()) {
        if (m.group (2).equals (""))
            return 0;
        else
            return Integer.parseInt (m.group (2));
    } else
        throw ERROR ("bad print format or depth specifier");
}
private char printFormat (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches () && m.group (1).length () + m.group (3).length () < 2) {
        if (m.group (1).equals ("") && m.group (3).equals (""))
            return ' ';
        else
            return (m.group (1) + m.group (3)).charAt (0);
    } else
        throw ERROR ("bad print format or depth specifier");
}
private BreakpointSpec createBreakpointSpec(int number)
{
    BreakpointSpec breakpoint =
        (BreakpointSpec) EventRequestSpec.idToSpec
            (Env.eventRequestSpecs (BreakpointSpec.EXMPL), number);
    if (breakpoint == null)
        throw ERROR ("No such breakpoint: %d", number);
    return breakpoint;
}
private BreakpointSpec createBreakpointSpec(String breakClass,
                                            int lineNum,
                                            String cond)
{
    try {
        BreakpointSpec breakpoint = (BreakpointSpec)
            Env.specList.createBreakpoint(breakClass, lineNum);
        breakpoint.setCondition (cond);
        return breakpoint;
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}
private BreakpointSpec createBreakpointSpec(String breakClass,
                                            String method,
                                            List<String> formals,
                                            String cond)
{
    try {
        BreakpointSpec spec =
                (BreakpointSpec) Env.specList.createBreakpoint(breakClass,
                                                               method, formals);
        spec.setCondition (cond);
        return spec;
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad method name: %s", method);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}
private EventRequestSpec createExceptionSpec (String className) {
    try {
        return Env.specList.createExceptionCatch(className);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", className);
    }
}
private List<EventRequestSpec> createWatchSpec (int policy, String type,
                                                String classId, String expr,
                                                String fld)
{
    ArrayList<EventRequestSpec> specs = new ArrayList<EventRequestSpec> ();
    boolean access = !type.equals ("");
    boolean modification = !type.equals ("access");
    ObjectReference obj;
    if (expr == null) {
        obj = null;
    } else {
        Value val = evaluator.evaluate (expr);
        if (val instanceof ObjectReference)
           obj = (ObjectReference) val;
        else
           throw ERROR ("Value of (%s) is not object an object reference.",
                        expr);
    }
    try {
        if (access) {
            EventRequestSpec spec =
                Env.specList.createAccessWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add (spec);
        }
        if (modification) {
            EventRequestSpec spec =
                Env.specList.createModificationWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add(spec);
        }
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad field name: %s", fld);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", classId);
    }
    return specs;
}
private int yylex () {
    try {
       int v = lexer.scan ();
       yylval = lexer.lexeme;
       return v;
    } catch (CommandException e) {
       throw e;
    } catch (Exception e) {
       throw ERROR ("problem reading expression: %s", e);
    }
}
private void yyerror (int ignored0, String ignored1) {
    if (lexer.lastCommand == null)
        throw ERROR ("Unknown command.");
    List<String> usage = GJDB.commandUsageMsgs (lexer.lastCommand);
    if (usage.size () == 0)
        throw ERROR ("Syntax error in command.");
    Formatter result = new Formatter ();
    String format;
    format = "Usage: %s";
    for (String S : usage) {
        result.format (format, S);
        format = "%n       %s";
    }
    throw ERROR ("%s", result);
}
static int findQuotedToken (String s) {
    Integer i = tokenMap.get (s);
    return i == null ? 0 : i;
}
static String tildeConvert (String s) {
    if (s.equals ("~"))
        return System.getProperty ("user.home");
    try {
        Process p = Runtime.getRuntime ().exec (new String[] {
            System.getenv ("SHELL"), "-c", "echo " + s });
        StringBuilder r = new StringBuilder ();
        while (true) {
            int c = p.getInputStream ().read ();
            if (c == '\n' || c == -1)
                break;
            r.append ((char) c);
        }
        p.destroy ();
        return r.toString ();
    } catch (IOException e) {
        return s;
    }
}
static String shellConvert (String s) {
    if (s.startsWith ("~")) {
        int sl = s.indexOf (System.getProperty ("file.separator"));
        if (sl < 0)
            sl = s.length ();
        return tildeConvert (s.substring (0, sl)) + s.substring (sl);
    } else
        return s;
}
static {
    for (int i = 0; i < yytname.length; i += 1) {
        if (yytname[i] instanceof String) {
            String token = (String) yytname[i];
            if (token.startsWith ("\""))
                tokenMap.put (token.substring (1, token.length () - 1),
                              yytoknum[i]);
        }
    }
}
}
