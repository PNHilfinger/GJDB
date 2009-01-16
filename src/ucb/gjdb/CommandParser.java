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
       2, 2, 2, 2, 2, 2, 2, 2, 96, 2,
      49, 50, 99, 68, 97, 2, 90, 16, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 12, 101,
      94, 2, 95, 2, 2, 2, 2, 2, 2, 2,
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
      47, 48, 51, 52, 53, 54, 55, 56, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 67, 69,
      70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
      80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
      91, 92, 93, 98, 100, 102, 103, 104
};


/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static final char yyprhs[] =
{
       0, 0, 3, 5, 8, 9, 14, 17, 22, 25,
      27, 31, 37, 43, 46, 48, 51, 54, 55, 60,
      64, 67, 71, 75, 78, 82, 86, 90, 94, 96,
     100, 103, 107, 113, 119, 123, 127, 132, 137, 141,
     145, 149, 154, 158, 162, 165, 169, 172, 176, 179,
     183, 187, 190, 194, 197, 201, 205, 207, 210, 216,
     221, 224, 228, 231, 235, 238, 241, 244, 246, 249,
     253, 258, 264, 268, 272, 276, 279, 283, 287, 290,
     292, 296, 300, 305, 309, 313, 317, 321, 325, 328,
     335, 343, 348, 353, 357, 362, 366, 370, 374, 379,
     384, 387, 390, 393, 396, 401, 405, 410, 415, 418,
     422, 425, 429, 432, 436, 439, 443, 446, 449, 452,
     456, 461, 467, 474, 476, 478, 480, 483, 487, 489,
     490, 492, 493, 495, 497, 500, 502, 504, 506, 509,
     511, 513, 515, 517, 521, 523, 526, 529, 532, 536,
     537, 539, 540, 544, 547, 549, 553, 555, 558, 560,
     564, 570, 575, 577, 580, 582, 587, 591, 595, 597,
     601, 604, 606, 610, 611, 613, 615, 617, 619, 623,
     627, 631, 633, 634, 638, 645, 655, 656, 658, 660,
     661, 663, 665, 668, 669, 670, 671, 672, 673, 674,
     675
};

/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
     106, 0, -1, 107, -1, 9, 146, -1, -1, 9,
     146, 108, 118, -1, 10, 116, -1, 11, 3, 12,
     121, -1, 13, 117, -1, 14, -1, 15, 142, 138,
      -1, 15, 142, 16, 3, 138, -1, 15, 142, 16,
     110, 138, -1, 17, 138, -1, 18, -1, 18, 3,
      -1, 19, 146, -1, -1, 19, 146, 109, 118, -1,
      20, 3, 143, -1, 20, 143, -1, 20, 21, 143,
      -1, 22, 5, 143, -1, 22, 143, -1, 22, 21,
     143, -1, 23, 111, 143, -1, 24, 111, 143, -1,
      25, 110, 143, -1, 26, -1, 26, 3, 138, -1,
      27, 138, -1, 28, 142, 138, -1, 28, 142, 16,
       3, 138, -1, 28, 142, 16, 110, 138, -1, 29,
      15, 30, -1, 29, 15, 31, -1, 29, 15, 32,
     110, -1, 29, 15, 33, 110, -1, 29, 34, 35,
      -1, 29, 34, 36, -1, 29, 37, 138, -1, 29,
       3, 145, 4, -1, 38, 114, 143, -1, 39, 3,
     143, -1, 40, 145, -1, 40, 145, 4, -1, 41,
     143, -1, 41, 115, 143, -1, 42, 143, -1, 42,
     115, 143, -1, 43, 114, 138, -1, 44, 143, -1,
      44, 114, 143, -1, 45, 141, -1, 45, 141, 126,
      -1, 46, 141, 127, -1, 47, -1, 47, 110, -1,
      48, 49, 144, 4, 50, -1, 48, 110, 144, 4,
      -1, 51, 141, -1, 51, 141, 133, -1, 52, 141,
      -1, 52, 141, 133, -1, 53, 135, -1, 54, 141,
      -1, 54, 135, -1, 55, -1, 55, 113, -1, 56,
     110, 110, -1, 57, 143, 137, 58, -1, 57, 143,
     137, 58, 114, -1, 59, 143, 58, -1, 60, 143,
      23, -1, 60, 143, 111, -1, 61, 143, -1, 62,
     143, 111, -1, 63, 143, 111, -1, 64, 143, -1,
      65, -1, 65, 141, 66, -1, 65, 141, 67, -1,
      65, 141, 68, 130, -1, 65, 141, 130, -1, 69,
     143, 138, -1, 70, 143, 138, -1, 71, 143, 138,
      -1, 72, 73, 143, -1, 72, 74, -1, 72, 75,
     141, 143, 125, 140, -1, 72, 75, 141, 143, 125,
     140, 21, -1, 72, 58, 141, 125, -1, 72, 76,
     141, 125, -1, 72, 77, 143, -1, 72, 77, 143,
       3, -1, 72, 78, 143, -1, 72, 79, 143, -1,
      72, 80, 143, -1, 72, 80, 143, 21, -1, 72,
      80, 143, 114, -1, 72, 9, -1, 72, 45, -1,
      72, 53, -1, 72, 51, -1, 72, 81, 3, 143,
      -1, 72, 81, 143, -1, 72, 81, 21, 143, -1,
      82, 141, 143, 125, -1, 79, 146, -1, 79, 146,
       3, -1, 83, 146, -1, 83, 146, 3, -1, 84,
     144, -1, 84, 144, 4, -1, 85, 110, -1, 86,
     146, 3, -1, 87, 141, -1, 87, 110, -1, 87,
       3, -1, 88, 141, 125, -1, 88, 141, 125, 8,
      -1, 89, 141, 143, 125, 8, -1, 89, 141, 143,
     125, 90, 8, -1, 91, -1, 92, -1, 93, -1,
      93, 3, -1, 110, 145, 4, -1, 5, -1, -1,
       5, -1, -1, 5, -1, 110, -1, 113, 110, -1,
       8, -1, 5, -1, 114, -1, 115, 114, -1, 110,
      -1, 112, -1, 119, -1, 3, -1, 3, 139, 118,
      -1, 120, -1, 119, 120, -1, 94, 3, -1, 95,
       3, -1, 95, 96, 3, -1, -1, 3, -1, -1,
      49, 123, 50, -1, 49, 50, -1, 124, -1, 123,
      97, 124, -1, 125, -1, 124, 98, -1, 8, -1,
     125, 90, 8, -1, 129, 90, 8, 122, 134, -1,
     129, 12, 110, 134, -1, 128, -1, 127, 128, -1,
     110, -1, 129, 90, 8, 122, -1, 129, 12, 110,
      -1, 99, 90, 8, -1, 8, -1, 129, 90, 8,
      -1, 129, 100, -1, 132, -1, 130, 131, 132, -1,
      -1, 97, -1, 101, -1, 8, -1, 99, -1, 132,
      90, 8, -1, 132, 90, 99, -1, 99, 90, 125,
      -1, 125, -1, -1, 102, 144, 4, -1, 141, 137,
     136, 125, 90, 8, -1, 141, 137, 136, 49, 138,
      50, 141, 90, 8, -1, -1, 21, -1, 103, -1,
      -1, 104, -1, 38, -1, 144, 4, -1, -1, -1,
      -1, -1, -1, -1, -1, -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static final char yyrline[] =
{
       0, 52, 52, 56, 59, 59, 62, 65, 68, 71,
      73, 76, 80, 83, 86, 88, 90, 92, 92, 94,
      96, 98, 100, 102, 104, 106, 108, 110, 112, 115,
     118, 120, 123, 127, 130, 132, 134, 136, 138, 140,
     142, 144, 147, 149, 151, 153, 155, 157, 159, 161,
     163, 165, 167, 169, 171, 173, 175, 177, 179, 181,
     183, 185, 187, 189, 191, 193, 195, 197, 199, 201,
     203, 205, 207, 209, 212, 215, 218, 221, 224, 226,
     228, 230, 232, 234, 236, 239, 242, 245, 247, 249,
     251, 253, 255, 257, 259, 261, 263, 265, 267, 269,
     271, 273, 275, 277, 279, 281, 283, 285, 287, 289,
     291, 293, 295, 297, 299, 301, 303, 305, 307, 309,
     311, 313, 315, 317, 319, 321, 323, 325, 330, 333,
     334, 338, 339, 343, 345, 350, 351, 355, 358, 362,
     366, 371, 372, 376, 385, 386, 391, 397, 403, 412,
     413, 417, 418, 420, 424, 427, 432, 433, 437, 438,
     442, 444, 449, 453, 458, 459, 461, 466, 467, 468,
     472, 479, 484, 488, 490, 491, 495, 496, 497, 498,
     502, 503, 507, 508, 513, 515, 521, 522, 523, 527,
     528, 529, 533, 538, 543, 546, 550, 554, 558, 562,
     566
};


static final int YY_NUM_TERMINALS = 105;

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
  "\"max-frames\"", "\"stdin\"", "\"on\"", "\"off\"", "\"variable\"",
  "\"thread\"", "\"threadgroup\"", "\"^F\"", "\"suspend\"", "\"resume\"",
  "\"kill\"", "\"interrupt\"", "\"break\"", "\"clear\"", "\"command\"",
  "\"condition\"", "'('", "')'", "\"catch\"", "\"pass\"", "\"watch\"",
  "\"unwatch\"", "\"delete\"", "\"ignore\"", "\"trace\"", "\"methods\"",
  "\"untrace\"", "\"step\"", "\"finish\"", "\"next\"", "\"stepi\"",
  "\"continue\"", "\"exclude\"", "\"none\"", "\"reset\"", "'+'",
  "\"lock\"", "\"disablegc\"", "\"enablegc\"", "\"info\"", "\"locals\"",
  "\"classes\"", "\"class\"", "\"fields\"", "\"threads\"",
  "\"threadgroups\"", "\"classpath\"", "\"threadlocks\"", "\"stack\"",
  "\"loadclass\"", "\"sourcepath\"", "\"monitor\"", "\"unmonitor\"",
  "\"source\"", "\"list\"", "\"lines\"", "\"bytecodes\"", "'.'",
  "\"version\"", "\"quit\"", "\"help\"", "'<'", "'>'", "'&'", "','",
  "\"[]\"", "'*'", "\".0\"", "';'", "\"if\"", "\"access\"", "\"go\"",
  "$accept", "start", "command", "@1", "@2", "intlit", "intlit_dflt1",
  "intlit_dflt_m1", "int_list", "thread_id", "thread_id_list", "address",
  "address_opt", "run_args", "file_specs", "file_spec", "connector_args",
  "formal_types_opt", "formal_types", "formal_type", "class_id",
  "breakpoint_spec", "delete_breakpoint_spec_list",
  "delete_breakpoint_spec", "break_class_id", "exclude_class_id_list",
  "opt_sep", "id_pattern", "exception_spec", "if_clause_opt",
  "watchpoint_spec", "watch_type", "suspend_policy", "expr",
  "_copy_two_back", "_default_mode", "_break_mode", "_print_mode",
  "_check_connect", "_balanced_collect_mode", "_collect_all_mode",
  "_run_args_mode", 0
};

/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static final int[] yytoknum =
{
       0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
     265, 266, 58, 267, 268, 269, 47, 270, 271, 272,
     273, 274, 275, 276, 277, 278, 279, 280, 281, 282,
     283, 284, 285, 286, 287, 288, 289, 290, 291, 292,
     293, 294, 295, 296, 297, 298, 299, 300, 301, 40,
      41, 302, 303, 304, 305, 306, 307, 308, 309, 310,
     311, 312, 313, 314, 315, 316, 317, 318, 43, 319,
     320, 321, 322, 323, 324, 325, 326, 327, 328, 329,
     330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
      46, 340, 341, 342, 60, 62, 38, 44, 343, 42,
     344, 59, 345, 346, 347
};

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 105, 106, 107, 108, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 109, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 107, 107,
     107, 107, 107, 107, 107, 107, 107, 107, 110, 111,
     111, 112, 112, 113, 113, 114, 114, 115, 115, 116,
     117, 118, 118, 118, 119, 119, 120, 120, 120, 121,
     121, 122, 122, 122, 123, 123, 124, 124, 125, 125,
     126, 126, 127, 127, 128, 128, 128, 129, 129, 129,
     129, 130, 130, 131, 131, 131, 132, 132, 132, 132,
     133, 133, 134, 134, 135, 135, 136, 136, 136, 137,
     137, 137, 138, 139, 140, 141, 142, 143, 144, 145,
     146
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static final short yyr2[] =
{
       0, 2, 1, 2, 0, 4, 2, 4, 2, 1,
       3, 5, 5, 2, 1, 2, 2, 0, 4, 3,
       2, 3, 3, 2, 3, 3, 3, 3, 1, 3,
       2, 3, 5, 5, 3, 3, 4, 4, 3, 3,
       3, 4, 3, 3, 2, 3, 2, 3, 2, 3,
       3, 2, 3, 2, 3, 3, 1, 2, 5, 4,
       2, 3, 2, 3, 2, 2, 2, 1, 2, 3,
       4, 5, 3, 3, 3, 2, 3, 3, 2, 1,
       3, 3, 4, 3, 3, 3, 3, 3, 2, 6,
       7, 4, 4, 3, 4, 3, 3, 3, 4, 4,
       2, 2, 2, 2, 4, 3, 4, 4, 2, 3,
       2, 3, 2, 3, 2, 3, 2, 2, 2, 3,
       4, 5, 6, 1, 1, 1, 2, 3, 1, 0,
       1, 0, 1, 1, 2, 1, 1, 1, 2, 1,
       1, 1, 1, 3, 1, 2, 2, 2, 3, 0,
       1, 0, 3, 2, 1, 3, 1, 2, 1, 3,
       5, 4, 1, 2, 1, 4, 3, 3, 1, 3,
       2, 1, 3, 0, 1, 1, 1, 1, 3, 3,
       3, 1, 0, 3, 6, 9, 0, 1, 1, 0,
       1, 1, 2, 0, 0, 0, 0, 0, 0, 0,
       0
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 128, 200, 0, 0, 131, 9, 196, 198, 14,
     200, 197, 197, 129, 129, 0, 28, 198, 196, 0,
       0, 0, 199, 197, 197, 0, 197, 195, 195, 56,
       0, 195, 195, 195, 195, 67, 0, 197, 197, 197,
     197, 197, 197, 197, 195, 197, 197, 197, 0, 200,
     195, 200, 198, 0, 200, 195, 195, 195, 123, 124,
     125, 0, 2, 199, 4, 139, 6, 0, 132, 140,
       8, 198, 13, 0, 15, 17, 197, 197, 20, 197,
     197, 23, 130, 197, 197, 197, 198, 30, 198, 199,
       0, 0, 198, 136, 135, 197, 197, 44, 137, 197,
      46, 197, 48, 198, 197, 51, 53, 0, 57, 198,
     198, 60, 62, 64, 189, 66, 189, 133, 68, 0,
     189, 0, 129, 75, 129, 129, 78, 0, 198, 198,
     198, 100, 101, 103, 102, 195, 197, 88, 195, 195,
     197, 197, 197, 197, 197, 108, 197, 110, 112, 114,
       0, 118, 117, 116, 0, 197, 126, 1, 0, 0,
     149, 0, 10, 192, 0, 19, 21, 22, 24, 25,
      26, 27, 29, 0, 31, 0, 34, 35, 0, 0,
      38, 39, 40, 42, 43, 45, 138, 47, 49, 50,
      52, 168, 0, 54, 0, 164, 55, 162, 0, 0,
       0, 158, 0, 181, 61, 63, 191, 190, 186, 134,
      69, 0, 72, 73, 74, 76, 77, 176, 80, 81,
       0, 177, 173, 171, 84, 85, 86, 0, 87, 197,
       0, 93, 95, 96, 97, 197, 197, 105, 109, 0,
     111, 113, 115, 119, 0, 127, 193, 0, 0, 5,
     141, 144, 150, 7, 198, 198, 18, 198, 198, 41,
      36, 37, 0, 0, 0, 170, 163, 0, 0, 0,
      59, 0, 0, 187, 188, 0, 70, 173, 174, 175,
       0, 0, 91, 0, 92, 94, 98, 99, 104, 106,
     107, 120, 0, 0, 146, 147, 0, 145, 11, 12,
      32, 33, 167, 182, 169, 166, 151, 58, 180, 159,
     198, 0, 71, 172, 178, 179, 194, 121, 0, 143,
     148, 198, 161, 0, 182, 165, 0, 0, 89, 159,
       0, 153, 0, 154, 156, 160, 195, 159, 90, 183,
     152, 0, 157, 0, 155, 0, 185
};

/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 61, 62, 159, 164, 195, 83, 69, 118, 98,
      99, 66, 70, 249, 250, 251, 253, 324, 332, 333,
     203, 193, 196, 197, 198, 222, 280, 223, 204, 322,
     113, 275, 208, 72, 293, 328, 106, 71, 78, 73,
      97, 64
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */

static final short yypact[] =
{
     312, -151, -151, 41, 54, 53, -151, -151, -151, 68,
    -151, 60, 75, 81, 81, 41, 90, -151, -151, 165,
      77, 97, -151, 77, 77, 77, 77, -151, -151, 41,
      25, -151, -151, -151, -151, 41, 41, -151, -151, -151,
    -151, -151, -151, -151, 104, -151, -151, -151, 207, -151,
    -151, -151, -151, 41, -151, 30, -151, -151, -151, -151,
     119, 129, -151, -151, 141, -151, -151, 134, -151, -151,
    -151, 146, -151, 162, -151, 169, -151, -151, -151, -151,
    -151, -151, -151, -151, -151, -151, -151, -151, 167, -151,
     142, -4, -151, -151, -151, -151, -151, 172, -151, 77,
    -151, 77, -151, -151, -151, -151, 39, 32, -151, -151,
    -151, 43, 43, -151, -13, -151, 11, -151, 41, 41,
     -13, 120, 56, -151, 81, 81, -151, 35, -151, -151,
    -151, -151, -151, -151, -151, -151, -151, -151, -151, -151,
    -151, -151, -151, -151, 62, 178, -151, 181, 182, -151,
     188, -151, -151, -151, 177, -151, -151, -151, 190, 38,
     192, 94, -151, -151, 38, -151, -151, -151, -151, -151,
    -151, -151, -151, 160, -151, 196, -151, -151, 41, 41,
    -151, -151, -151, -151, -151, -151, -151, -151, -151, -151,
    -151, -151, 111, -151, -2, -151, 32, -151, 5, 199,
     200, -151, 115, 116, -151, -151, -151, -151, 27, -151,
    -151, 149, -151, -151, -151, -151, -151, -151, -151, -151,
      45, -151, 20, 121, -151, -151, -151, 177, -151, -151,
     177, 210, -151, -151, 156, -151, -151, -151, -151, 177,
    -151, -151, -151, 58, 177, -151, 215, 217, 12, -151,
      -5, -151, -151, -151, -151, -151, -151, -151, -151, -151,
    -151, -151, 202, 41, 213, -151, -151, 41, 214, 168,
    -151, 177, 216, -151, -151, 28, 77, 23, -151, -151,
      45, 46, 116, 177, 116, -151, -151, -151, -151, -151,
     116, -151, 59, 38, -151, -151, 220, -151, -151, -151,
    -151, -151, -151, 123, 7, -151, 57, -151, 116, -151,
    -151, 136, -151, 121, -151, -151, 116, -151, 221, -151,
    -151, -151, -151, 34, 123, -151, 180, 223, 211, 228,
     229, -151, -29, 137, 116, -151, -151, 234, -151, -151,
    -151, 177, -151, 150, 137, 235, -151
};

/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -151, -151, -151, -151, -151, 9, -6, -151, -151, -7,
     212, -151, -151, -150, -151, -3, -151, -62, -151, -96,
    -104, -151, -151, 50, 144, 31, -151, -32, 151, -63,
     230, -151, 147, -16, -151, -151, -28, 244, 113, -50,
     -37, 24
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */

static final short yytable[] =
{
     107, 87, 148, 111, 112, 114, 116, -151, 84, 63,
     263, -65, 65, 95, 256, 295, 127, 267, 103, 104,
     -83, 340, 146, -82, 85, 206, 158, 153, 154, 155,
       1, 180, 181, 151, 75, 1, 201, 1, 108, 110,
     191, 246, 201, 217, 117, 119, 1, 191, 273, 206,
     243, 201, 175, 217, 314, 162, 323, 67, 68, 199,
     200, 82, 149, 76, 152, 235, 291, 317, 341, -169,
     172, 74, 174, 145, 109, 147, 182, 310, 150, 213,
      79, 77, 93, 236, 331, 94, 82, 189, 264, 247,
     248, 207, 186, 86, 186, 268, 80, 254, 265, 1,
      96, 218, 219, 220, -79, 265, 323, 227, 296, -151,
     229, 230, 224, 225, 226, 207, 214, 278, 215, 216,
     278, 279, 156, 282, 279, 81, 284, 209, 210, 157,
     274, 192, 247, 248, 221, 290, 100, 102, 192, 105,
     292, -3, 202, 319, 221, 315, 160, -169, 272, 318,
     120, 121, 122, 123, 124, 125, 126, -169, 128, 129,
     130, 93, 161, 257, 94, 1, 163, 308, 89, -16,
     255, 311, 176, 177, 178, 179, 185, 286, 212, 316,
      90, 238, 258, 173, 240, 201, 241, 260, 261, 165,
     166, 242, 167, 168, 245, 252, 169, 170, 171, 91,
     259, 262, 92, 269, 270, 271, 272, 276, 183, 184,
     302, 281, 187, 285, 188, -142, 131, 190, 307, 334,
     294, 304, 306, 320, 309, 321, 327, 287, -122, 329,
     336, 337, 338, 339, -184, 342, 101, 334, 298, 299,
     345, 300, 301, 346, 325, 344, 266, 297, 313, 228,
     194, 277, 132, 231, 232, 233, 234, 237, 133, 239,
     134, 335, 88, 205, 115, 135, 0, 211, 244, 312,
       0, 330, 303, 0, 0, 0, 305, 0, 0, 0,
     136, 137, 138, 139, 140, 141, 142, 143, 144, 0,
       0, 0, 0, 0, 326, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 343, 0,
       0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
       0, 2, 3, 4, 0, 5, 6, 7, 0, 8,
       9, 10, 11, 0, 12, 13, 14, 15, 16, 17,
      18, 19, 283, 0, 0, 0, 0, 0, 288, 289,
      20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
      30, 0, 0, 31, 32, 33, 34, 35, 36, 37,
       0, 38, 39, 40, 41, 42, 43, 44, 0, 0,
       0, 45, 46, 47, 48, 0, 0, 0, 0, 0,
       0, 49, 0, 0, 50, 51, 52, 53, 54, 55,
      56, 57, 0, 58, 59, 60
};

static final short yycheck[] =
{
      28, 17, 52, 31, 32, 33, 34, 0, 14, 0,
      12, 0, 3, 20, 164, 3, 44, 12, 25, 26,
       0, 50, 50, 0, 15, 38, 63, 55, 56, 57,
       5, 35, 36, 3, 10, 5, 8, 5, 29, 30,
       8, 3, 8, 8, 35, 36, 5, 8, 21, 38,
     154, 8, 89, 8, 8, 71, 49, 3, 5, 109,
     110, 5, 53, 3, 55, 3, 8, 8, 97, 12,
      86, 3, 88, 49, 49, 51, 92, 49, 54, 23,
       5, 21, 5, 21, 50, 8, 5, 103, 90, 94,
      95, 104, 99, 3, 101, 90, 21, 3, 100, 5,
       3, 66, 67, 68, 0, 100, 49, 135, 96, 102,
     138, 139, 128, 129, 130, 104, 122, 97, 124, 125,
      97, 101, 3, 227, 101, 12, 230, 118, 119, 0,
     103, 99, 94, 95, 99, 239, 23, 24, 99, 26,
     244, 0, 99, 293, 99, 99, 12, 90, 90, 90,
      37, 38, 39, 40, 41, 42, 43, 100, 45, 46,
      47, 5, 16, 3, 8, 5, 4, 271, 3, 0,
     161, 275, 30, 31, 32, 33, 4, 21, 58, 283,
      15, 3, 173, 16, 3, 8, 4, 178, 179, 76,
      77, 3, 79, 80, 4, 3, 83, 84, 85, 34,
       4, 90, 37, 4, 4, 90, 90, 58, 95, 96,
       8, 90, 99, 3, 101, 0, 9, 104, 50, 323,
       3, 8, 8, 3, 8, 102, 90, 234, 0, 8,
      50, 8, 21, 4, 0, 98, 24, 341, 254, 255,
      90, 257, 258, 8, 306, 341, 196, 250, 280, 136,
     106, 220, 45, 140, 141, 142, 143, 144, 51, 146,
      53, 324, 18, 112, 34, 58, -1, 120, 155, 276,
      -1, 321, 263, -1, -1, -1, 267, -1, -1, -1,
      73, 74, 75, 76, 77, 78, 79, 80, 81, -1,
      -1, -1, -1, -1, 310, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, 336, -1,
      -1, -1, -1, -1, -1, -1, -1, 5, -1, -1,
      -1, 9, 10, 11, -1, 13, 14, 15, -1, 17,
      18, 19, 20, -1, 22, 23, 24, 25, 26, 27,
      28, 29, 229, -1, -1, -1, -1, -1, 235, 236,
      38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
      48, -1, -1, 51, 52, 53, 54, 55, 56, 57,
      -1, 59, 60, 61, 62, 63, 64, 65, -1, -1,
      -1, 69, 70, 71, 72, -1, -1, -1, -1, -1,
      -1, 79, -1, -1, 82, 83, 84, 85, 86, 87,
      88, 89, -1, 91, 92, 93
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 5, 9, 10, 11, 13, 14, 15, 17, 18,
      19, 20, 22, 23, 24, 25, 26, 27, 28, 29,
      38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
      48, 51, 52, 53, 54, 55, 56, 57, 59, 60,
      61, 62, 63, 64, 65, 69, 70, 71, 72, 79,
      82, 83, 84, 85, 86, 87, 88, 89, 91, 92,
      93, 106, 107, 110, 146, 110, 116, 3, 5, 112,
     117, 142, 138, 144, 3, 146, 3, 21, 143, 5,
      21, 143, 5, 111, 111, 110, 3, 138, 142, 3,
      15, 34, 37, 5, 8, 114, 3, 145, 114, 115,
     143, 115, 143, 114, 114, 143, 141, 141, 110, 49,
     110, 141, 141, 135, 141, 135, 141, 110, 113, 110,
     143, 143, 143, 143, 143, 143, 143, 141, 143, 143,
     143, 9, 45, 51, 53, 58, 73, 74, 75, 76,
      77, 78, 79, 80, 81, 146, 141, 146, 144, 110,
     146, 3, 110, 141, 141, 141, 3, 0, 145, 108,
      12, 16, 138, 4, 109, 143, 143, 143, 143, 143,
     143, 143, 138, 16, 138, 145, 30, 31, 32, 33,
      35, 36, 138, 143, 143, 4, 114, 143, 143, 138,
     143, 8, 99, 126, 129, 110, 127, 128, 129, 144,
     144, 8, 99, 125, 133, 133, 38, 104, 137, 110,
     110, 137, 58, 23, 111, 111, 111, 8, 66, 67,
      68, 99, 130, 132, 138, 138, 138, 141, 143, 141,
     141, 143, 143, 143, 143, 3, 21, 143, 3, 143,
       3, 4, 3, 125, 143, 4, 3, 94, 95, 118,
     119, 120, 3, 121, 3, 110, 118, 3, 110, 4,
     110, 110, 90, 12, 90, 100, 128, 12, 90, 4,
       4, 90, 90, 21, 103, 136, 58, 130, 97, 101,
     131, 90, 125, 143, 125, 3, 21, 114, 143, 143,
     125, 8, 125, 139, 3, 3, 96, 120, 138, 138,
     138, 138, 8, 110, 8, 110, 8, 50, 125, 8,
      49, 125, 114, 132, 8, 99, 125, 8, 90, 118,
       3, 102, 134, 49, 122, 122, 138, 90, 140, 8,
     144, 50, 123, 124, 125, 134, 50, 8, 21, 4,
      50, 97, 98, 141, 124, 90, 8
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
  if (yytype < 105)
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
  if (yyn == -151)
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
      yytoken = ((yychar) >= 0 && (yychar) <= 347 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 405 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -185)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }

  if (yyn == 157)
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
    { evaluator.commandSet ("stdin", "on", 0); ;}
    break;

  case 39:
// _line_ 141 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "off", 0); ;}
    break;

  case 40:
// _line_ 143 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false); ;}
    break;

  case 41:
// _line_ 145 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(-2)]) + " " + ((String)yyvsa[yyvsp+(0)]),
       evaluator.PRINT, ' ', false); ;}
    break;

  case 42:
// _line_ 148 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThread (((String)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 43:
// _line_ 150 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroup (((String)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 44:
// _line_ 152 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;

  case 45:
// _line_ 154 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;

  case 46:
// _line_ 156 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;

  case 47:
// _line_ 158 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (((List)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 48:
// _line_ 160 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (); ;}
    break;

  case 49:
// _line_ 162 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (((List)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 50:
// _line_ 164 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandKill (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 51:
// _line_ 166 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (); ;}
    break;

  case 52:
// _line_ 168 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (((String)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 53:
// _line_ 170 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (); ;}
    break;

  case 54:
// _line_ 172 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;

  case 55:
// _line_ 174 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClear (((List)yyvsa[yyvsp+(0)])); ;}
    break;

  case 56:
// _line_ 176 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (reader, false); ;}
    break;

  case 57:
// _line_ 178 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (((Integer)yyvsa[yyvsp+(0)]), reader, false); ;}
    break;

  case 58:
// _line_ 180 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((String)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 59:
// _line_ 182 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 60:
// _line_ 184 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (); ;}
    break;

  case 61:
// _line_ 186 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;

  case 62:
// _line_ 188 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (); ;}
    break;

  case 63:
// _line_ 190 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;

  case 64:
// _line_ 192 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWatch (((List)yyvsa[yyvsp+(0)])); ;}
    break;

  case 65:
// _line_ 194 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (); ;}
    break;

  case 66:
// _line_ 196 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (((List)yyvsa[yyvsp+(0)])); ;}
    break;

  case 67:
// _line_ 198 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (); ;}
    break;

  case 68:
// _line_ 200 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (((List)yyvsa[yyvsp+(0)])); ;}
    break;

  case 69:
// _line_ 202 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandIgnore (((Integer)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 70:
// _line_ 204 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-1)]), null); ;}
    break;

  case 71:
// _line_ 206 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 72:
// _line_ 208 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUntrace (); ;}
    break;

  case 73:
// _line_ 210 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_OUT, 1); ;}
    break;

  case 74:
// _line_ 213 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 75:
// _line_ 216 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_OUT, 1); ;}
    break;

  case 76:
// _line_ 219 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_OVER, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 77:
// _line_ 222 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_MIN,
      StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 78:
// _line_ 225 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCont (); ;}
    break;

  case 79:
// _line_ 227 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExclude (); ;}
    break;

  case 80:
// _line_ 229 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeClear (); ;}
    break;

  case 81:
// _line_ 231 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeReset (); ;}
    break;

  case 82:
// _line_ 233 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeAdd (((List)yyvsa[yyvsp+(0)])); ;}
    break;

  case 83:
// _line_ 235 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeSet (((List)yyvsa[yyvsp+(0)])); ;}
    break;

  case 84:
// _line_ 237 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLock (((String)yyvsa[yyvsp+(0)]));
    showPrompt = false; ;}
    break;

  case 85:
// _line_ 240 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), false);
    showPrompt = false; ;}
    break;

  case 86:
// _line_ 243 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), true);
    showPrompt = false; ;}
    break;

  case 87:
// _line_ 246 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLocals (); ;}
    break;

  case 88:
// _line_ 248 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasses (); ;}
    break;

  case 89:
// _line_ 250 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;

  case 90:
// _line_ 252 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-2)]), true); ;}
    break;

  case 91:
// _line_ 254 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMethods (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 92:
// _line_ 256 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFields (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 93:
// _line_ 258 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (); ;}
    break;

  case 94:
// _line_ 260 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 95:
// _line_ 262 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroups (); ;}
    break;

  case 96:
// _line_ 264 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspathInfo (); ;}
    break;

  case 97:
// _line_ 266 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (); ;}
    break;

  case 98:
// _line_ 268 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocksAll (); ;}
    break;

  case 99:
// _line_ 270 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 100:
// _line_ 272 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInfoRun (); ;}
    break;

  case 101:
// _line_ 274 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); ;}
    break;

  case 102:
// _line_ 276 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); ;}
    break;

  case 103:
// _line_ 278 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); ;}
    break;

  case 104:
// _line_ 280 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;

  case 105:
// _line_ 282 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;

  case 106:
// _line_ 284 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;

  case 107:
// _line_ 286 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLoadclass (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 108:
// _line_ 288 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (); ;}
    break;

  case 109:
// _line_ 290 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 110:
// _line_ 292 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (); ;}
    break;

  case 111:
// _line_ 294 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 112:
// _line_ 296 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (); ;}
    break;

  case 113:
// _line_ 298 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 114:
// _line_ 300 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnmonitor (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 115:
// _line_ 302 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRead (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 116:
// _line_ 304 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, null); ;}
    break;

  case 117:
// _line_ 306 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;

  case 118:
// _line_ 308 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 119:
// _line_ 310 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(0)]), null); ;}
    break;

  case 120:
// _line_ 312 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 121:
// _line_ 314 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 122:
// _line_ 316 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 123:
// _line_ 318 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandVersion (GJDB.progname, Version.value); ;}
    break;

  case 124:
// _line_ 320 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandQuit (); ;}
    break;

  case 125:
// _line_ 322 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (); ;}
    break;

  case 126:
// _line_ 324 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 127:
// _line_ 326 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRepeat (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)]), reader); ;}
    break;

  case 128:
// _line_ 330 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 129:
// _line_ 333 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = 1; ;}
    break;

  case 130:
// _line_ 334 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 131:
// _line_ 338 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = -1; ;}
    break;

  case 132:
// _line_ 339 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 133:
// _line_ 343 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Integer> L = new ArrayList<Integer> ();
     yyval = L; L.add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 134:
// _line_ 346 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 137:
// _line_ 355 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> v = new ArrayList<String> ();
     v.add (((String)yyvsa[yyvsp+(0)]));
     yyval = v; ;}
    break;

  case 138:
// _line_ 359 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 142:
// _line_ 373 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
     spec.cmdArgs += " " + shellConvert (((String)yyvsa[yyvsp+(0)]));
     yyval = spec; ;}
    break;

  case 143:
// _line_ 377 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
     spec.cmdArgs = " " + shellConvert (((String)yyvsa[yyvsp+(-2)]))
      + spec.cmdArgs;
     yyval = spec; ;}
    break;

  case 145:
// _line_ 386 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;

  case 146:
// _line_ 392 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
     if (spec.inFile != null)
         throw ERROR ("Ambiguous input redirection");
     spec.inFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
   ;}
    break;

  case 147:
// _line_ 398 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
     if (spec.outFile != null)
         throw ERROR ("Ambiguous output redirection");
     spec.outFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
   ;}
    break;

  case 148:
// _line_ 404 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-3)]);
     if (spec.outFile != null)
         throw ERROR ("Ambiguous output redirection");
     spec.outFile = spec.errFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
   ;}
    break;

  case 149:
// _line_ 412 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;

  case 151:
// _line_ 417 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;

  case 152:
// _line_ 419 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ;}
    break;

  case 153:
// _line_ 420 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;

  case 154:
// _line_ 424 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
     yyval = L;
     L.add (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 155:
// _line_ 428 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 157:
// _line_ 433 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-1)]) + "[]"; ;}
    break;

  case 159:
// _line_ 438 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 160:
// _line_ 443 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-2)]), ((List)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 161:
// _line_ 445 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((Integer)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 162:
// _line_ 450 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Object> L = new ArrayList<Object> ();
        yyval = L;
        L.add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;

  case 163:
// _line_ 454 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;

  case 164:
// _line_ 458 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 165:
// _line_ 460 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-1)]), ((List)yyvsa[yyvsp+(0)]), null); ;}
    break;

  case 166:
// _line_ 462 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-2)]), ((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;

  case 167:
// _line_ 466 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 169:
// _line_ 469 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-2)]).endsWith (".0"))
           throw ERROR ("Bad class specification");
       yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 170:
// _line_ 473 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-1)]).endsWith (".0"))
           throw ERROR ("Bad class specification");
       yyval = ((String)yyvsa[yyvsp+(-1)]) + ".0"; ;}
    break;

  case 171:
// _line_ 480 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
     L.add (((String)yyvsa[yyvsp+(0)]));
     yyval = L;
   ;}
    break;

  case 172:
// _line_ 485 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 177:
// _line_ 496 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*"; ;}
    break;

  case 178:
// _line_ 497 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 179:
// _line_ 498 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + ".*"; ;}
    break;

  case 180:
// _line_ 502 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec ("*." + ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 181:
// _line_ 503 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec (((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 182:
// _line_ 507 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;

  case 183:
// _line_ 509 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 184:
// _line_ 514 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-2)]), null, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 185:
// _line_ 517 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-7)]), ((String)yyvsa[yyvsp+(-6)]), null, ((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 186:
// _line_ 521 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;

  case 187:
// _line_ 522 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "all"; ;}
    break;

  case 188:
// _line_ 523 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "access"; ;}
    break;

  case 189:
// _line_ 527 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_ALL; ;}
    break;

  case 190:
// _line_ 528 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_NONE; ;}
    break;

  case 191:
// _line_ 529 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; ;}
    break;

  case 192:
// _line_ 534 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 193:
// _line_ 538 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;

  case 194:
// _line_ 543 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toDefaultMode (); ;}
    break;

  case 195:
// _line_ 546 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBreakMode (); ;}
    break;

  case 196:
// _line_ 550 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toPrintMode (); ;}
    break;

  case 197:
// _line_ 554 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.checkConnect (); ;}
    break;

  case 198:
// _line_ 558 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBalancedCollectMode (); ;}
    break;

  case 199:
// _line_ 562 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toCollectMode (); ;}
    break;

  case 200:
// _line_ 566 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toRunArgsMode (); ;}
    break;


    }

/* Line 813 of yacc.java.  */
// _line_ 2078 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"

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

  yystate = yypgoto[yyn - 105] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 405 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 105];

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
      if (yyn != -151)
 {
   yyn += 1;
   if (0 <= yyn && yyn <= 405 && yycheck[yyn] == 1)
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

  if (yyn == 157)
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

// _line_ 569 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"


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
 } catch (Exception e) {
     throw ERROR ("Unknown error in command: %s", e);
        }
    } catch (CommandException e) {
 if (passException)
     throw e;
 Env.errorln (e.getMessage ());
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
