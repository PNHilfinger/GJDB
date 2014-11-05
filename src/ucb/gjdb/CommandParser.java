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
       2, 2, 2, 2, 2, 2, 2, 2, 102, 2,
      55, 56, 105, 74, 103, 2, 96, 16, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 12, 107,
     100, 2, 101, 2, 2, 2, 2, 2, 2, 2,
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
      69, 70, 71, 72, 73, 75, 76, 77, 78, 79,
      80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
      90, 91, 92, 93, 94, 95, 97, 98, 99, 104,
     106, 108, 109, 110
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
     266, 269, 272, 275, 277, 280, 284, 289, 295, 299,
     303, 307, 310, 314, 318, 321, 323, 327, 331, 336,
     340, 344, 348, 352, 356, 359, 366, 374, 379, 384,
     388, 393, 397, 401, 405, 410, 415, 418, 421, 424,
     427, 432, 436, 441, 446, 449, 453, 456, 460, 463,
     467, 470, 474, 477, 480, 483, 487, 492, 498, 505,
     507, 509, 511, 514, 518, 520, 521, 523, 524, 526,
     528, 531, 533, 535, 537, 540, 542, 544, 546, 548,
     552, 554, 557, 560, 563, 567, 568, 570, 571, 575,
     578, 580, 584, 586, 589, 591, 595, 601, 606, 608,
     611, 613, 618, 622, 626, 628, 632, 635, 637, 641,
     642, 644, 646, 648, 650, 654, 658, 662, 664, 665,
     669, 676, 686, 687, 689, 691, 692, 694, 696, 699,
     700, 701, 702, 703, 704, 705, 706
};

/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
     112, 0, -1, 113, -1, 9, 152, -1, -1, 9,
     152, 114, 124, -1, 10, 122, -1, 11, 3, 12,
     127, -1, 13, 123, -1, 14, -1, 15, 148, 144,
      -1, 15, 148, 16, 3, 144, -1, 15, 148, 16,
     116, 144, -1, 17, 144, -1, 18, -1, 18, 3,
      -1, 19, 152, -1, -1, 19, 152, 115, 124, -1,
      20, 3, 149, -1, 20, 149, -1, 20, 21, 149,
      -1, 22, 5, 149, -1, 22, 149, -1, 22, 21,
     149, -1, 23, 117, 149, -1, 24, 117, 149, -1,
      25, 116, 149, -1, 26, 149, -1, 26, 149, 3,
     144, -1, 27, 144, -1, 28, 148, 144, -1, 28,
     148, 16, 3, 144, -1, 28, 148, 16, 116, 144,
      -1, 29, 15, 30, -1, 29, 15, 31, -1, 29,
      15, 32, 116, -1, 29, 15, 33, 116, -1, 29,
      15, 34, 35, -1, 29, 15, 34, 36, -1, 29,
      15, 37, 38, -1, 29, 15, 37, 39, -1, 29,
      15, 37, 40, -1, 29, 41, 35, -1, 29, 41,
      36, -1, 29, 42, 144, -1, 29, 43, 116, -1,
      29, 3, 151, 4, -1, 44, 120, 149, -1, 45,
       3, 149, -1, 46, 151, -1, 46, 151, 4, -1,
      47, 149, -1, 47, 121, 149, -1, 48, 149, -1,
      48, 121, 149, -1, 49, 120, 144, -1, 50, 149,
      -1, 50, 120, 149, -1, 51, 147, -1, 51, 147,
     132, -1, 52, 147, 133, -1, 53, -1, 53, 116,
      -1, 54, 55, 150, 4, 56, -1, 54, 116, 150,
       4, -1, 57, 147, -1, 57, 147, 139, -1, 58,
     147, -1, 58, 147, 139, -1, 59, 141, -1, 60,
     147, -1, 60, 141, -1, 61, -1, 61, 119, -1,
      62, 116, 116, -1, 63, 149, 143, 64, -1, 63,
     149, 143, 64, 120, -1, 65, 149, 64, -1, 66,
     149, 23, -1, 66, 149, 117, -1, 67, 149, -1,
      68, 149, 117, -1, 69, 149, 117, -1, 70, 149,
      -1, 71, -1, 71, 147, 72, -1, 71, 147, 73,
      -1, 71, 147, 74, 136, -1, 71, 147, 136, -1,
      75, 149, 144, -1, 76, 149, 144, -1, 77, 149,
     144, -1, 78, 79, 149, -1, 78, 80, -1, 78,
      81, 147, 149, 131, 146, -1, 78, 81, 147, 149,
     131, 146, 21, -1, 78, 64, 147, 131, -1, 78,
      82, 147, 131, -1, 78, 83, 149, -1, 78, 83,
     149, 3, -1, 78, 84, 149, -1, 78, 85, 149,
      -1, 78, 86, 149, -1, 78, 86, 149, 21, -1,
      78, 86, 149, 120, -1, 78, 9, -1, 78, 51,
      -1, 78, 59, -1, 78, 57, -1, 78, 87, 3,
     149, -1, 78, 87, 149, -1, 78, 87, 21, 149,
      -1, 88, 147, 149, 131, -1, 85, 152, -1, 85,
     152, 3, -1, 89, 152, -1, 89, 152, 3, -1,
      90, 150, -1, 90, 150, 4, -1, 91, 116, -1,
      92, 152, 3, -1, 93, 147, -1, 93, 116, -1,
      93, 3, -1, 94, 147, 131, -1, 94, 147, 131,
       8, -1, 95, 147, 149, 131, 8, -1, 95, 147,
     149, 131, 96, 8, -1, 97, -1, 98, -1, 99,
      -1, 99, 3, -1, 116, 151, 4, -1, 5, -1,
      -1, 5, -1, -1, 5, -1, 116, -1, 119, 116,
      -1, 8, -1, 5, -1, 120, -1, 121, 120, -1,
     116, -1, 118, -1, 125, -1, 3, -1, 3, 145,
     124, -1, 126, -1, 125, 126, -1, 100, 3, -1,
     101, 3, -1, 101, 102, 3, -1, -1, 3, -1,
      -1, 55, 129, 56, -1, 55, 56, -1, 130, -1,
     129, 103, 130, -1, 131, -1, 130, 104, -1, 8,
      -1, 131, 96, 8, -1, 135, 96, 8, 128, 140,
      -1, 135, 12, 116, 140, -1, 134, -1, 133, 134,
      -1, 116, -1, 135, 96, 8, 128, -1, 135, 12,
     116, -1, 105, 96, 8, -1, 8, -1, 135, 96,
       8, -1, 135, 106, -1, 138, -1, 136, 137, 138,
      -1, -1, 103, -1, 107, -1, 8, -1, 105, -1,
     138, 96, 8, -1, 138, 96, 105, -1, 105, 96,
     131, -1, 131, -1, -1, 108, 150, 4, -1, 147,
     143, 142, 131, 96, 8, -1, 147, 143, 142, 55,
     144, 56, 147, 96, 8, -1, -1, 21, -1, 109,
      -1, -1, 110, -1, 44, -1, 150, 4, -1, -1,
      -1, -1, -1, -1, -1, -1, -1
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
     224, 227, 230, 233, 236, 238, 240, 242, 244, 246,
     248, 251, 254, 257, 259, 261, 263, 265, 267, 269,
     271, 273, 275, 277, 279, 281, 283, 285, 287, 289,
     291, 293, 295, 297, 299, 301, 303, 305, 307, 309,
     311, 313, 315, 317, 319, 321, 323, 325, 327, 329,
     331, 333, 335, 337, 342, 345, 346, 350, 351, 355,
     357, 362, 363, 367, 370, 374, 378, 383, 384, 388,
     397, 398, 403, 409, 415, 424, 425, 429, 430, 432,
     436, 439, 444, 445, 449, 450, 454, 456, 461, 465,
     470, 471, 473, 478, 479, 480, 484, 491, 496, 500,
     502, 503, 507, 508, 509, 510, 514, 515, 519, 520,
     525, 527, 533, 534, 535, 539, 540, 541, 545, 550,
     555, 558, 562, 566, 570, 574, 578
};


static final int YY_NUM_TERMINALS = 111;

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
  "\"watch\"", "\"unwatch\"", "\"delete\"", "\"ignore\"", "\"trace\"",
  "\"methods\"", "\"untrace\"", "\"step\"", "\"finish\"", "\"next\"",
  "\"stepi\"", "\"continue\"", "\"exclude\"", "\"none\"", "\"reset\"",
  "'+'", "\"lock\"", "\"disablegc\"", "\"enablegc\"", "\"info\"",
  "\"locals\"", "\"classes\"", "\"class\"", "\"fields\"", "\"threads\"",
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
     293, 294, 295, 296, 297, 298, 299, 300, 301, 302,
     303, 304, 305, 306, 307, 40, 41, 308, 309, 310,
     311, 312, 313, 314, 315, 316, 317, 318, 319, 320,
     321, 322, 323, 324, 43, 325, 326, 327, 328, 329,
     330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
     340, 341, 342, 343, 344, 345, 46, 346, 347, 348,
      60, 62, 38, 44, 349, 42, 350, 59, 351, 352,
     353
};

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 111, 112, 113, 114, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 115, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 113, 113, 113, 113, 113, 113,
     113, 113, 113, 113, 116, 117, 117, 118, 118, 119,
     119, 120, 120, 121, 121, 122, 123, 124, 124, 124,
     125, 125, 126, 126, 126, 127, 127, 128, 128, 128,
     129, 129, 130, 130, 131, 131, 132, 132, 133, 133,
     134, 134, 134, 135, 135, 135, 135, 136, 136, 137,
     137, 137, 138, 138, 138, 138, 139, 139, 140, 140,
     141, 141, 142, 142, 142, 143, 143, 143, 144, 145,
     146, 147, 148, 149, 150, 151, 152
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
       2, 2, 2, 1, 2, 3, 4, 5, 3, 3,
       3, 2, 3, 3, 2, 1, 3, 3, 4, 3,
       3, 3, 3, 3, 2, 6, 7, 4, 4, 3,
       4, 3, 3, 3, 4, 4, 2, 2, 2, 2,
       4, 3, 4, 4, 2, 3, 2, 3, 2, 3,
       2, 3, 2, 2, 2, 3, 4, 5, 6, 1,
       1, 1, 2, 3, 1, 0, 1, 0, 1, 1,
       2, 1, 1, 1, 2, 1, 1, 1, 1, 3,
       1, 2, 2, 2, 3, 0, 1, 0, 3, 2,
       1, 3, 1, 2, 1, 3, 5, 4, 1, 2,
       1, 4, 3, 3, 1, 3, 2, 1, 3, 0,
       1, 1, 1, 1, 3, 3, 3, 1, 0, 3,
       6, 9, 0, 1, 1, 0, 1, 1, 2, 0,
       0, 0, 0, 0, 0, 0, 0
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 134, 206, 0, 0, 137, 9, 202, 204, 14,
     206, 203, 203, 135, 135, 0, 203, 204, 202, 0,
       0, 0, 205, 203, 203, 0, 203, 201, 201, 62,
       0, 201, 201, 201, 201, 73, 0, 203, 203, 203,
     203, 203, 203, 203, 201, 203, 203, 203, 0, 206,
     201, 206, 204, 0, 206, 201, 201, 201, 129, 130,
     131, 0, 2, 205, 4, 145, 6, 0, 138, 146,
       8, 204, 13, 0, 15, 17, 203, 203, 20, 203,
     203, 23, 136, 203, 203, 203, 28, 30, 204, 205,
       0, 0, 204, 0, 142, 141, 203, 203, 50, 143,
     203, 52, 203, 54, 204, 203, 57, 59, 0, 63,
     204, 204, 66, 68, 70, 195, 72, 195, 139, 74,
       0, 195, 0, 135, 81, 135, 135, 84, 0, 204,
     204, 204, 106, 107, 109, 108, 201, 203, 94, 201,
     201, 203, 203, 203, 203, 203, 114, 203, 116, 118,
     120, 0, 124, 123, 122, 0, 203, 132, 1, 0,
       0, 155, 0, 10, 198, 0, 19, 21, 22, 24,
      25, 26, 27, 204, 0, 31, 0, 34, 35, 0,
       0, 0, 0, 43, 44, 45, 46, 48, 49, 51,
     144, 53, 55, 56, 58, 174, 0, 60, 0, 170,
      61, 168, 0, 0, 0, 164, 0, 187, 67, 69,
     197, 196, 192, 140, 75, 0, 78, 79, 80, 82,
      83, 182, 86, 87, 0, 183, 179, 177, 90, 91,
      92, 0, 93, 203, 0, 99, 101, 102, 103, 203,
     203, 111, 115, 0, 117, 119, 121, 125, 0, 133,
     199, 0, 0, 5, 147, 150, 156, 7, 204, 204,
      18, 29, 204, 204, 47, 36, 37, 38, 39, 40,
      41, 42, 0, 0, 0, 176, 169, 0, 0, 0,
      65, 0, 0, 193, 194, 0, 76, 179, 180, 181,
       0, 0, 97, 0, 98, 100, 104, 105, 110, 112,
     113, 126, 0, 0, 152, 153, 0, 151, 11, 12,
      32, 33, 173, 188, 175, 172, 157, 64, 186, 165,
     204, 0, 77, 178, 184, 185, 200, 127, 0, 149,
     154, 204, 167, 0, 188, 171, 0, 0, 95, 165,
       0, 159, 0, 160, 162, 166, 201, 165, 96, 189,
     158, 0, 163, 0, 161, 0, 191
};

/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 61, 62, 160, 165, 199, 83, 69, 119, 99,
     100, 66, 70, 253, 254, 255, 257, 334, 342, 343,
     207, 197, 200, 201, 202, 226, 290, 227, 208, 332,
     114, 285, 212, 72, 303, 338, 107, 71, 78, 73,
      98, 64
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */

static final short yypact[] =
{
     318, -158, -158, 41, 47, 54, -158, -158, -158, 68,
    -158, 44, 28, 84, 84, 41, -158, -158, -158, 170,
      91, 80, -158, 91, 91, 91, 91, -158, -158, 41,
      20, -158, -158, -158, -158, 41, 41, -158, -158, -158,
    -158, -158, -158, -158, 63, -158, -158, -158, 210, -158,
    -158, -158, -158, 41, -158, 37, -158, -158, -158, -158,
      88, 98, -158, -158, 101, -158, -158, 97, -158, -158,
    -158, 100, -158, 135, -158, 125, -158, -158, -158, -158,
    -158, -158, -158, -158, -158, -158, 140, -158, 134, -158,
     202, 71, -158, 41, -158, -158, -158, -158, 151, -158,
      91, -158, 91, -158, -158, -158, -158, 22, 26, -158,
    -158, -158, 27, 27, -158, -30, -158, 7, -158, 41,
      41, -30, 108, 31, -158, 84, 84, -158, 13, -158,
    -158, -158, -158, -158, -158, -158, -158, -158, -158, -158,
    -158, -158, -158, -158, -158, 53, 172, -158, 177, 178,
    -158, 183, -158, -158, -158, 173, -158, -158, -158, 186,
      34, 184, 64, -158, -158, 34, -158, -158, -158, -158,
    -158, -158, -158, -158, 79, -158, 187, -158, -158, 41,
      41, 113, 65, -158, -158, -158, -158, -158, -158, -158,
    -158, -158, -158, -158, -158, -158, 99, -158, 46, -158,
      26, -158, 78, 189, 190, -158, 103, 106, -158, -158,
    -158, -158, 60, -158, -158, 132, -158, -158, -158, -158,
    -158, -158, -158, -158, 33, -158, 17, 112, -158, -158,
    -158, 173, -158, -158, 173, 206, -158, -158, 171, -158,
    -158, -158, -158, 173, -158, -158, -158, 40, 173, -158,
     214, 207, 8, -158, 77, -158, -158, -158, -158, -158,
    -158, -158, -158, -158, -158, -158, -158, -158, -158, -158,
    -158, -158, 208, 41, 212, -158, -158, 41, 216, 166,
    -158, 173, 217, -158, -158, 18, 91, 23, -158, -158,
      33, 35, 106, 173, 106, -158, -158, -158, -158, -158,
     106, -158, 58, 34, -158, -158, 224, -158, -158, -158,
    -158, -158, -158, 120, 15, -158, 45, -158, 106, -158,
    -158, 133, -158, 112, -158, -158, 106, -158, 222, -158,
    -158, -158, -158, 12, 120, -158, 181, 230, 219, 241,
     240, -158, -24, 141, 106, -158, -158, 248, -158, -158,
    -158, 173, -158, 153, 141, 242, -158
};

/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -158, -158, -158, -158, -158, 9, -4, -158, -158, -7,
     227, -158, -158, -157, -158, -2, -158, -63, -158, -97,
     -78, -158, -158, 56, 150, 36, -158, -31, 157, -62,
     237, -158, 154, -16, -158, -158, -28, 258, 121, -50,
     -11, 43
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */

static final short yytable[] =
{
     108, 87, 149, 112, 113, 115, 117, -71, 260, 63,
      84, 305, 65, 96, 210, -157, 128, -89, 104, 105,
     205, 221, 147, -88, 85, 1, 205, 154, 155, 156,
     195, 1, 350, 79, 195, 205, 82, 250, 109, 111,
     152, 221, 1, 324, 118, 120, 1, 76, 301, 80,
      67, 210, 159, 75, 217, 163, 239, -175, 273, 68,
     203, 204, 150, -85, 153, 77, 327, 258, 341, 1,
     333, 74, 175, 320, 240, 110, 185, 247, 176, 351,
     211, 283, 262, 97, 1, 222, 223, 224, 193, 82,
     277, 157, 146, 190, 148, 190, 94, 151, 158, 95,
     333, -3, 186, 269, 270, 271, 183, 184, 231, 161,
     306, 233, 234, 228, 229, 230, 162, 211, 225, 218,
     288, 219, 220, -157, 289, -16, 288, 196, 213, 214,
     289, 196, 206, 81, 251, 252, 282, 86, 225, 164,
     325, -175, 274, 173, 101, 103, 329, 106, 267, 268,
     174, -175, 275, 292, 328, 189, 294, 261, 121, 122,
     123, 124, 125, 126, 127, 300, 129, 130, 131, 284,
     302, 259, 216, 89, 278, 242, 94, 251, 252, 95,
     244, 205, 245, 263, 275, 90, 246, 256, 265, 266,
     249, 264, 296, 279, 280, 272, 286, 166, 167, 281,
     168, 169, 282, 318, 170, 171, 172, 321, 291, 295,
     304, 91, 92, 93, -148, 326, 312, 187, 188, 132,
     314, 191, 317, 192, 316, 319, 194, 330, 331, 337,
     339, 297, 177, 178, 179, 180, 181, 346, 347, 182,
     348, -128, 308, 309, 349, 352, 310, 311, -190, 355,
     356, 102, 307, 335, 354, 344, 276, 198, 232, 323,
     287, 133, 235, 236, 237, 238, 241, 134, 243, 135,
     209, 116, 345, 344, 136, 215, 88, 248, 0, 322,
       0, 340, 313, 0, 0, 0, 315, 0, 0, 137,
     138, 139, 140, 141, 142, 143, 144, 145, 0, 0,
       0, 0, 0, 0, 336, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 353, 0,
       0, 0, 0, 1, 0, 0, 0, 2, 3, 4,
       0, 5, 6, 7, 0, 8, 9, 10, 11, 0,
      12, 13, 14, 15, 16, 17, 18, 19, 0, 0,
       0, 0, 0, 0, 293, 0, 0, 0, 0, 0,
     298, 299, 20, 21, 22, 23, 24, 25, 26, 27,
      28, 29, 30, 0, 0, 31, 32, 33, 34, 35,
      36, 37, 0, 38, 39, 40, 41, 42, 43, 44,
       0, 0, 0, 45, 46, 47, 48, 0, 0, 0,
       0, 0, 0, 49, 0, 0, 50, 51, 52, 53,
      54, 55, 56, 57, 0, 58, 59, 60
};

static final short yycheck[] =
{
      28, 17, 52, 31, 32, 33, 34, 0, 165, 0,
      14, 3, 3, 20, 44, 0, 44, 0, 25, 26,
       8, 8, 50, 0, 15, 5, 8, 55, 56, 57,
       8, 5, 56, 5, 8, 8, 5, 3, 29, 30,
       3, 8, 5, 8, 35, 36, 5, 3, 8, 21,
       3, 44, 63, 10, 23, 71, 3, 12, 12, 5,
     110, 111, 53, 0, 55, 21, 8, 3, 56, 5,
      55, 3, 88, 55, 21, 55, 92, 155, 89, 103,
     110, 21, 3, 3, 5, 72, 73, 74, 104, 5,
      12, 3, 49, 100, 51, 102, 5, 54, 0, 8,
      55, 0, 93, 38, 39, 40, 35, 36, 136, 12,
     102, 139, 140, 129, 130, 131, 16, 110, 105, 123,
     103, 125, 126, 108, 107, 0, 103, 105, 119, 120,
     107, 105, 105, 12, 100, 101, 96, 16, 105, 4,
     105, 96, 96, 3, 23, 24, 303, 26, 35, 36,
      16, 106, 106, 231, 96, 4, 234, 173, 37, 38,
      39, 40, 41, 42, 43, 243, 45, 46, 47, 109,
     248, 162, 64, 3, 96, 3, 5, 100, 101, 8,
       3, 8, 4, 174, 106, 15, 3, 3, 179, 180,
       4, 4, 21, 4, 4, 96, 64, 76, 77, 96,
      79, 80, 96, 281, 83, 84, 85, 285, 96, 3,
       3, 41, 42, 43, 0, 293, 8, 96, 97, 9,
       8, 100, 56, 102, 8, 8, 105, 3, 108, 96,
       8, 238, 30, 31, 32, 33, 34, 56, 8, 37,
      21, 0, 258, 259, 4, 104, 262, 263, 0, 96,
       8, 24, 254, 316, 351, 333, 200, 107, 137, 290,
     224, 51, 141, 142, 143, 144, 145, 57, 147, 59,
     113, 34, 334, 351, 64, 121, 18, 156, -1, 286,
      -1, 331, 273, -1, -1, -1, 277, -1, -1, 79,
      80, 81, 82, 83, 84, 85, 86, 87, -1, -1,
      -1, -1, -1, -1, 320, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, 346, -1,
      -1, -1, -1, 5, -1, -1, -1, 9, 10, 11,
      -1, 13, 14, 15, -1, 17, 18, 19, 20, -1,
      22, 23, 24, 25, 26, 27, 28, 29, -1, -1,
      -1, -1, -1, -1, 233, -1, -1, -1, -1, -1,
     239, 240, 44, 45, 46, 47, 48, 49, 50, 51,
      52, 53, 54, -1, -1, 57, 58, 59, 60, 61,
      62, 63, -1, 65, 66, 67, 68, 69, 70, 71,
      -1, -1, -1, 75, 76, 77, 78, -1, -1, -1,
      -1, -1, -1, 85, -1, -1, 88, 89, 90, 91,
      92, 93, 94, 95, -1, 97, 98, 99
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 5, 9, 10, 11, 13, 14, 15, 17, 18,
      19, 20, 22, 23, 24, 25, 26, 27, 28, 29,
      44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
      54, 57, 58, 59, 60, 61, 62, 63, 65, 66,
      67, 68, 69, 70, 71, 75, 76, 77, 78, 85,
      88, 89, 90, 91, 92, 93, 94, 95, 97, 98,
      99, 112, 113, 116, 152, 116, 122, 3, 5, 118,
     123, 148, 144, 150, 3, 152, 3, 21, 149, 5,
      21, 149, 5, 117, 117, 116, 149, 144, 148, 3,
      15, 41, 42, 43, 5, 8, 120, 3, 151, 120,
     121, 149, 121, 149, 120, 120, 149, 147, 147, 116,
      55, 116, 147, 147, 141, 147, 141, 147, 116, 119,
     116, 149, 149, 149, 149, 149, 149, 149, 147, 149,
     149, 149, 9, 51, 57, 59, 64, 79, 80, 81,
      82, 83, 84, 85, 86, 87, 152, 147, 152, 150,
     116, 152, 3, 116, 147, 147, 147, 3, 0, 151,
     114, 12, 16, 144, 4, 115, 149, 149, 149, 149,
     149, 149, 149, 3, 16, 144, 151, 30, 31, 32,
      33, 34, 37, 35, 36, 144, 116, 149, 149, 4,
     120, 149, 149, 144, 149, 8, 105, 132, 135, 116,
     133, 134, 135, 150, 150, 8, 105, 131, 139, 139,
      44, 110, 143, 116, 116, 143, 64, 23, 117, 117,
     117, 8, 72, 73, 74, 105, 136, 138, 144, 144,
     144, 147, 149, 147, 147, 149, 149, 149, 149, 3,
      21, 149, 3, 149, 3, 4, 3, 131, 149, 4,
       3, 100, 101, 124, 125, 126, 3, 127, 3, 116,
     124, 144, 3, 116, 4, 116, 116, 35, 36, 38,
      39, 40, 96, 12, 96, 106, 134, 12, 96, 4,
       4, 96, 96, 21, 109, 142, 64, 136, 103, 107,
     137, 96, 131, 149, 131, 3, 21, 120, 149, 149,
     131, 8, 131, 145, 3, 3, 102, 126, 144, 144,
     144, 144, 8, 116, 8, 116, 8, 56, 131, 8,
      55, 131, 120, 138, 8, 105, 131, 8, 96, 124,
       3, 108, 140, 55, 128, 128, 144, 96, 146, 8,
     150, 56, 129, 130, 131, 140, 56, 8, 21, 4,
      56, 103, 104, 147, 130, 96, 8
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
  if (yytype < 111)
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
  if (yyn == -158)
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
      yytoken = ((yychar) >= 0 && (yychar) <= 353 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }
  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 417 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -191)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }
  if (yyn == 158)
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
    { evaluator.commandIgnore (((Integer)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 76:
// _line_ 216 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-1)]), null); ;}
    break;
  case 77:
// _line_ 218 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 78:
// _line_ 220 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUntrace (); ;}
    break;
  case 79:
// _line_ 222 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OUT, 1); ;}
    break;
  case 80:
// _line_ 225 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 81:
// _line_ 228 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OUT, 1); ;}
    break;
  case 82:
// _line_ 231 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OVER, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 83:
// _line_ 234 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_MIN,
                                         StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 84:
// _line_ 237 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCont (); ;}
    break;
  case 85:
// _line_ 239 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExclude (); ;}
    break;
  case 86:
// _line_ 241 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeClear (); ;}
    break;
  case 87:
// _line_ 243 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeReset (); ;}
    break;
  case 88:
// _line_ 245 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeAdd (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 89:
// _line_ 247 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeSet (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 90:
// _line_ 249 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLock (((String)yyvsa[yyvsp+(0)]));
                  showPrompt = false; ;}
    break;
  case 91:
// _line_ 252 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), false);
                  showPrompt = false; ;}
    break;
  case 92:
// _line_ 255 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), true);
                  showPrompt = false; ;}
    break;
  case 93:
// _line_ 258 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLocals (); ;}
    break;
  case 94:
// _line_ 260 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasses (); ;}
    break;
  case 95:
// _line_ 262 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 96:
// _line_ 264 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-2)]), true); ;}
    break;
  case 97:
// _line_ 266 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMethods (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 98:
// _line_ 268 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFields (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 99:
// _line_ 270 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (); ;}
    break;
  case 100:
// _line_ 272 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 101:
// _line_ 274 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroups (); ;}
    break;
  case 102:
// _line_ 276 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspathInfo (); ;}
    break;
  case 103:
// _line_ 278 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (); ;}
    break;
  case 104:
// _line_ 280 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocksAll (); ;}
    break;
  case 105:
// _line_ 282 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 106:
// _line_ 284 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInfoRun (); ;}
    break;
  case 107:
// _line_ 286 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); ;}
    break;
  case 108:
// _line_ 288 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); ;}
    break;
  case 109:
// _line_ 290 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); ;}
    break;
  case 110:
// _line_ 292 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 111:
// _line_ 294 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 112:
// _line_ 296 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 113:
// _line_ 298 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLoadclass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 114:
// _line_ 300 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (); ;}
    break;
  case 115:
// _line_ 302 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 116:
// _line_ 304 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (); ;}
    break;
  case 117:
// _line_ 306 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 118:
// _line_ 308 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (); ;}
    break;
  case 119:
// _line_ 310 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 120:
// _line_ 312 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnmonitor (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 121:
// _line_ 314 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRead (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 122:
// _line_ 316 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, null); ;}
    break;
  case 123:
// _line_ 318 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 124:
// _line_ 320 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 125:
// _line_ 322 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 126:
// _line_ 324 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 127:
// _line_ 326 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 128:
// _line_ 328 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 129:
// _line_ 330 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandVersion (GJDB.progname, Version.value); ;}
    break;
  case 130:
// _line_ 332 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandQuit (); ;}
    break;
  case 131:
// _line_ 334 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (); ;}
    break;
  case 132:
// _line_ 336 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 133:
// _line_ 338 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRepeat (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)]), reader); ;}
    break;
  case 134:
// _line_ 342 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 135:
// _line_ 345 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = 1; ;}
    break;
  case 136:
// _line_ 346 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 137:
// _line_ 350 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = -1; ;}
    break;
  case 138:
// _line_ 351 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 139:
// _line_ 355 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Integer> L = new ArrayList<Integer> ();
                          yyval = L; L.add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 140:
// _line_ 358 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 143:
// _line_ 367 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> v = new ArrayList<String> ();
                          v.add (((String)yyvsa[yyvsp+(0)]));
                          yyval = v; ;}
    break;
  case 144:
// _line_ 371 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 148:
// _line_ 385 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
                          spec.cmdArgs += " " + shellConvert (((String)yyvsa[yyvsp+(0)]));
                          yyval = spec; ;}
    break;
  case 149:
// _line_ 389 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
                          spec.cmdArgs = " " + shellConvert (((String)yyvsa[yyvsp+(-2)]))
                                         + spec.cmdArgs;
                          yyval = spec; ;}
    break;
  case 150:
// _line_ 397 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((CommandLineSpec)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 151:
// _line_ 398 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 152:
// _line_ 404 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
                          if (spec.inFile != null)
                              throw ERROR ("Ambiguous input redirection");
                          spec.inFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 153:
// _line_ 410 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 154:
// _line_ 416 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-3)]);
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = spec.errFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 155:
// _line_ 424 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 157:
// _line_ 429 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 158:
// _line_ 431 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 159:
// _line_ 432 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;
  case 160:
// _line_ 436 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
                          yyval = L;
                          L.add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 161:
// _line_ 440 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 163:
// _line_ 445 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-1)]) + "[]"; ;}
    break;
  case 165:
// _line_ 450 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 166:
// _line_ 455 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-2)]), ((List)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 167:
// _line_ 457 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((Integer)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 168:
// _line_ 462 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Object> L = new ArrayList<Object> ();
               yyval = L;
               L.add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 169:
// _line_ 466 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 170:
// _line_ 470 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 171:
// _line_ 472 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-1)]), ((List)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 172:
// _line_ 474 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-2)]), ((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 173:
// _line_ 478 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 175:
// _line_ 481 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-2)]).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 176:
// _line_ 485 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-1)]).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)yyvsa[yyvsp+(-1)]) + ".0"; ;}
    break;
  case 177:
// _line_ 492 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
                          L.add (((String)yyvsa[yyvsp+(0)]));
                          yyval = L;
                        ;}
    break;
  case 178:
// _line_ 497 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 183:
// _line_ 508 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*"; ;}
    break;
  case 184:
// _line_ 509 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 185:
// _line_ 510 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + ".*"; ;}
    break;
  case 186:
// _line_ 514 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec ("*." + ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 187:
// _line_ 515 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 188:
// _line_ 519 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 189:
// _line_ 521 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 190:
// _line_ 526 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-2)]), null, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 191:
// _line_ 529 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-7)]), ((String)yyvsa[yyvsp+(-6)]), null, ((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 192:
// _line_ 533 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 193:
// _line_ 534 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "all"; ;}
    break;
  case 194:
// _line_ 535 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "access"; ;}
    break;
  case 195:
// _line_ 539 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_ALL; ;}
    break;
  case 196:
// _line_ 540 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_NONE; ;}
    break;
  case 197:
// _line_ 541 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; ;}
    break;
  case 198:
// _line_ 546 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 199:
// _line_ 550 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 200:
// _line_ 555 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toDefaultMode (); ;}
    break;
  case 201:
// _line_ 558 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBreakMode (); ;}
    break;
  case 202:
// _line_ 562 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toPrintMode (); ;}
    break;
  case 203:
// _line_ 566 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.checkConnect (); ;}
    break;
  case 204:
// _line_ 570 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBalancedCollectMode (); ;}
    break;
  case 205:
// _line_ 574 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toCollectMode (); ;}
    break;
  case 206:
// _line_ 578 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toRunArgsMode (); ;}
    break;
    }
/* Line 813 of yacc.java.  */
// _line_ 2124 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"
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
  yystate = yypgoto[yyn - 111] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 417 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 111];
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
      if (yyn != -158)
 {
   yyn += 1;
   if (0 <= yyn && yyn <= 417 && yycheck[yyn] == 1)
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
  if (yyn == 158)
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
// _line_ 581 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
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
