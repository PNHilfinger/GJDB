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

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;

   import static ucb.gjdb.CommandException.ERROR;

   class ExpressionParser
{

/* Tokens.  */
   public static final int
     BOOLEAN = 258,
     BYTE = 259,
     CHAR = 260,
     DOUBLE = 261,
     FLOAT = 262,
     INT = 263,
     LONG = 264,
     SHORT = 265,
     FLOATLIT = 266,
     INTLIT = 267,
     CHARLIT = 268,
     STRINGLIT = 269,
     IDENT = 270,
     INTERNALVAR = 271,
     HISTORYVAR = 272,
     POSTFIX = 296;

/* Copy the first part of user declarations.  */
// _line_ 62 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
/* End first part of user declarations.  */
/* TEMPORARY CHANGE: FIXME */
static int YYLTYPE_INIT;
/* Enabling traces.  */
/* Enabling verbose error messages.  */
/* Copy the second part of user declarations.  */
/* Line 221 of yacc.java.  */
// _line_ 139 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.java"
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
       2, 2, 2, 53, 2, 2, 2, 51, 36, 2,
      59, 58, 49, 47, 71, 48, 57, 50, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 31, 2,
      40, 18, 42, 30, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 65, 2, 66, 35, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 69, 34, 70, 52, 2, 2, 2,
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
       5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
      15, 16, 17, 19, 20, 21, 22, 23, 24, 25,
      26, 27, 28, 29, 32, 33, 37, 38, 39, 41,
      43, 44, 45, 46, 54, 55, 56, 60, 61, 62,
      63, 64, 67, 68
};
/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static final char yyprhs[] =
{
       0, 0, 3, 5, 7, 9, 11, 15, 19, 23,
      27, 31, 35, 39, 43, 47, 51, 55, 59, 63,
      67, 71, 75, 79, 83, 87, 91, 95, 99, 103,
     107, 111, 115, 119, 123, 127, 131, 132, 137, 138,
     143, 144, 145, 153, 155, 157, 159, 161, 163, 167,
     169, 173, 175, 177, 179, 181, 183, 185, 189, 191,
     194, 197, 202, 206, 211, 214, 219, 223, 225, 228,
     231, 233, 236, 239, 242, 245, 250, 256, 262, 267,
     270, 272, 274, 276, 278, 280, 282, 284, 286, 288,
     292, 293, 299, 303, 307, 308, 314, 316, 319, 323,
     328, 331, 335, 339, 344, 346, 347, 350, 354, 355,
     360, 364, 367, 369, 373, 376, 378
};
/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
      73, 0, -1, 74, -1, 82, -1, 84, -1, 87,
      -1, 74, 49, 74, -1, 74, 50, 74, -1, 74,
      51, 74, -1, 74, 47, 74, -1, 74, 48, 74,
      -1, 74, 44, 74, -1, 74, 45, 74, -1, 74,
      46, 74, -1, 74, 40, 74, -1, 74, 42, 74,
      -1, 74, 39, 74, -1, 74, 41, 74, -1, 74,
      37, 74, -1, 74, 38, 74, -1, 74, 36, 74,
      -1, 74, 34, 74, -1, 74, 35, 74, -1, 74,
      18, 74, -1, 74, 21, 74, -1, 74, 22, 74,
      -1, 74, 23, 74, -1, 74, 19, 74, -1, 74,
      20, 74, -1, 74, 26, 74, -1, 74, 24, 74,
      -1, 74, 25, 74, -1, 74, 27, 74, -1, 74,
      29, 74, -1, 74, 28, 74, -1, 74, 43, 98,
      -1, -1, 74, 33, 75, 74, -1, -1, 74, 32,
      76, 74, -1, -1, -1, 74, 30, 77, 74, 31,
      78, 74, -1, 80, -1, 11, -1, 12, -1, 13,
      -1, 14, -1, 59, 74, 58, -1, 60, -1, 61,
      57, 15, -1, 62, -1, 63, -1, 64, -1, 16,
      -1, 17, -1, 15, -1, 80, 57, 15, -1, 79,
      -1, 81, 54, -1, 81, 55, -1, 81, 65, 74,
      66, -1, 81, 57, 15, -1, 81, 57, 15, 96,
      -1, 15, 96, -1, 80, 57, 15, 96, -1, 59,
      80, 58, -1, 83, -1, 47, 83, -1, 48, 83,
      -1, 81, -1, 54, 81, -1, 55, 81, -1, 52,
      82, -1, 53, 82, -1, 59, 86, 58, 82, -1,
      59, 86, 85, 58, 82, -1, 59, 80, 85, 58,
      82, -1, 59, 80, 58, 83, -1, 85, 67, -1,
      67, -1, 8, -1, 9, -1, 5, -1, 10, -1,
       4, -1, 3, -1, 7, -1, 6, -1, 68, 86,
      90, -1, -1, 68, 86, 85, 88, 92, -1, 68,
      80, 96, -1, 68, 80, 90, -1, -1, 68, 80,
      85, 89, 92, -1, 91, -1, 90, 67, -1, 65,
      74, 66, -1, 91, 65, 74, 66, -1, 69, 70,
      -1, 69, 71, 70, -1, 69, 93, 70, -1, 69,
      93, 71, 70, -1, 74, -1, -1, 94, 92, -1,
      93, 71, 74, -1, -1, 93, 71, 95, 92, -1,
      59, 97, 58, -1, 59, 58, -1, 74, -1, 97,
      71, 74, -1, 86, 85, -1, 80, -1, 80, 85,
      -1
};
/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static final char yyrline[] =
{
       0, 80, 80, 83, 84, 85, 86, 87, 88, 89,
      90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
     100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
     110, 111, 112, 113, 114, 115, 123, 123, 143, 143,
     163, 172, 163, 184, 187, 189, 191, 193, 195, 196,
     199, 204, 206, 208, 214, 220, 229, 230, 234, 235,
     241, 247, 254, 257, 264, 275, 283, 289, 290, 291,
     295, 296, 297, 298, 299, 303, 312, 314, 315, 319,
     320, 324, 325, 326, 327, 328, 329, 330, 331, 335,
     340, 339, 343, 347, 352, 351, 358, 359, 366, 373,
     382, 383, 384, 385, 390, 391, 391, 393, 394, 394,
     399, 400, 404, 411, 419, 420, 421
};
static final int YY_NUM_TERMINALS = 72;
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
  "$end", "error", "$undefined", "\"boolean\"", "\"byte\"", "\"char\"",
  "\"double\"", "\"float\"", "\"int\"", "\"long\"", "\"short\"",
  "FLOATLIT", "INTLIT", "CHARLIT", "STRINGLIT", "IDENT", "INTERNALVAR",
  "HISTORYVAR", "'='", "\"+=\"", "\"-=\"", "\"*=\"", "\"/=\"", "\"%=\"",
  "\">>=\"", "\">>>=\"", "\"<<=\"", "\"&=\"", "\"|=\"", "\"^=\"", "'?'",
  "':'", "\"||\"", "\"&&\"", "'|'", "'^'", "'&'", "\"==\"", "\"!=\"",
  "\"<=\"", "'<'", "\">=\"", "'>'", "\"instanceof\"", "\"<<\"", "\">>\"",
  "\">>>\"", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'!'", "\"++\"",
  "\"--\"", "POSTFIX", "'.'", "')'", "'('", "\"this\"", "\"super\"",
  "\"true\"", "\"false\"", "\"null\"", "'['", "']'", "\"[]\"", "\"new\"",
  "'{'", "'}'", "','", "$accept", "start", "expr", "@1", "@2", "@3", "@4",
  "primary", "name", "postfix", "unary", "unary_no_pm", "cast", "dims",
  "primitive_type", "create", "@5", "@6", "dimensions",
  "dimensions_prefix", "array_initializer", "array_items", "@7", "@8",
  "params", "expr_list", "reference_type", 0
};
/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static final int[] yytoknum =
{
       0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
     265, 266, 267, 268, 269, 270, 271, 272, 61, 273,
     274, 275, 276, 277, 278, 279, 280, 281, 282, 283,
      63, 58, 284, 285, 124, 94, 38, 286, 287, 288,
      60, 289, 62, 290, 291, 292, 293, 43, 45, 42,
      47, 37, 126, 33, 294, 295, 296, 46, 41, 40,
     297, 298, 299, 300, 301, 91, 93, 302, 303, 123,
     125, 44
};
/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 72, 73, 74, 74, 74, 74, 74, 74, 74,
      74, 74, 74, 74, 74, 74, 74, 74, 74, 74,
      74, 74, 74, 74, 74, 74, 74, 74, 74, 74,
      74, 74, 74, 74, 74, 74, 75, 74, 76, 74,
      77, 78, 74, 79, 79, 79, 79, 79, 79, 79,
      79, 79, 79, 79, 79, 79, 80, 80, 81, 81,
      81, 81, 81, 81, 81, 81, 81, 82, 82, 82,
      83, 83, 83, 83, 83, 84, 84, 84, 84, 85,
      85, 86, 86, 86, 86, 86, 86, 86, 86, 87,
      88, 87, 87, 87, 89, 87, 90, 90, 91, 91,
      92, 92, 92, 92, 93, 94, 93, 93, 95, 93,
      96, 96, 97, 97, 98, 98, 98
};
/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static final short yyr2[] =
{
       0, 2, 1, 1, 1, 1, 3, 3, 3, 3,
       3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
       3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
       3, 3, 3, 3, 3, 3, 0, 4, 0, 4,
       0, 0, 7, 1, 1, 1, 1, 1, 3, 1,
       3, 1, 1, 1, 1, 1, 1, 3, 1, 2,
       2, 4, 3, 4, 2, 4, 3, 1, 2, 2,
       1, 2, 2, 2, 2, 4, 5, 5, 4, 2,
       1, 1, 1, 1, 1, 1, 1, 1, 1, 3,
       0, 5, 3, 3, 0, 5, 1, 2, 3, 4,
       2, 3, 3, 4, 1, 0, 2, 3, 0, 4,
       3, 2, 1, 3, 2, 1, 2
};
/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 44, 45, 46, 47, 56, 54, 55, 0, 0,
       0, 0, 0, 0, 0, 49, 0, 51, 52, 53,
       0, 0, 2, 58, 43, 70, 3, 67, 4, 5,
       0, 64, 0, 68, 69, 73, 74, 71, 72, 86,
      85, 83, 88, 87, 81, 82, 84, 0, 43, 0,
       0, 56, 0, 0, 1, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 40, 38, 36,
       0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 0, 59,
      60, 0, 0, 111, 112, 0, 43, 48, 66, 80,
       0, 0, 0, 50, 0, 0, 94, 93, 96, 92,
      90, 89, 23, 27, 28, 24, 25, 26, 30, 31,
      29, 32, 34, 33, 0, 0, 0, 21, 22, 20,
      18, 19, 16, 14, 17, 15, 115, 0, 35, 11,
      12, 13, 9, 10, 6, 7, 8, 57, 62, 0,
     110, 0, 66, 78, 0, 79, 75, 0, 57, 0,
       0, 97, 0, 0, 0, 39, 37, 116, 114, 65,
      63, 61, 113, 77, 76, 98, 105, 95, 0, 91,
      41, 100, 0, 104, 0, 0, 99, 0, 101, 102,
     108, 106, 42, 103, 107, 0, 109
};
/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 21, 47, 126, 125, 124, 187, 23, 24, 25,
      26, 27, 28, 100, 49, 29, 163, 160, 107, 108,
     177, 184, 185, 195, 31, 95, 138
};
/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
static final short yypact[] =
{
     269, -158, -158, -158, -158, -52, -158, -158, 340, 340,
     327, 327, 407, 407, 105, -158, -44, -158, -158, -158,
     285, 36, 602, -158, 22, -30, -158, -158, -158, -158,
     251, -158, 269, -158, -158, -158, -158, -30, -30, -158,
    -158, -158, -158, -158, -158, -158, -158, 527, -41, 33,
       4, -158, -47, -28, -158, 269, 269, 269, 269, 269,
     269, 269, 269, 269, 269, 269, 269, -158, -158, -158,
     269, 269, 269, 269, 269, 269, 269, 269, 269, 285,
     269, 269, 269, 269, 269, 269, 269, 269, 25, -158,
    -158, 86, 269, -158, 602, -49, 11, -158, 353, -158,
      37, 327, 89, -158, 91, 269, 40, 56, 83, -158,
      40, 56, 624, 624, 624, 624, 624, 624, 624, 624,
     624, 624, 624, 624, 269, 269, 269, 679, 695, 710,
       3, 3, 147, 147, 147, 147, -36, 87, -158, 222,
     222, 222, -17, -17, -158, -158, -158, -52, -52, 408,
    -158, 269, -158, -158, 327, -158, -158, 327, -158, 457,
      81, -158, 269, 81, 568, 94, 662, 40, 40, -158,
    -158, -158, 602, -158, -158, -158, 166, -158, 492, -158,
    -158, -158, 85, 602, 19, 81, -158, 269, -158, -158,
     191, -158, 644, -158, 602, 81, -158
};
/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -158, -158, 0, -158, -158, -158, -158, -158, 9, 90,
      -8, -4, -158, -38, -12, -158, -158, -158, 108, -158,
    -157, -158, -158, -158, -51, -158, -158
};
/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
static final short yytable[] =
{
      22, 109, 35, 36, 33, 34, 179, 30, 53, 150,
     104, 102, 30, 50, 106, 110, 88, 98, 105, 103,
      99, 104, 151, 48, 89, 90, 99, 91, 191, 52,
      94, 99, 85, 86, 87, 92, 54, 105, 196, 99,
     147, 96, 75, 76, 77, 78, 79, 80, 81, 82,
      83, 84, 85, 86, 87, 112, 113, 114, 115, 116,
     117, 118, 119, 120, 121, 122, 123, 137, 88, 152,
     127, 128, 129, 130, 131, 132, 133, 134, 135, 88,
     139, 140, 141, 142, 143, 144, 145, 146, 136, 189,
     190, 101, 149, 156, 153, 154, 169, 170, 167, 168,
      99, 148, 37, 38, 155, 159, 158, 155, 39, 40,
      41, 42, 43, 44, 45, 46, 1, 2, 3, 4,
       5, 6, 7, 161, 164, 165, 166, 69, 70, 71,
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
      82, 83, 84, 85, 86, 87, 173, 157, 162, 174,
     176, 172, 8, 9, 99, 188, 155, 10, 11, 12,
      13, 111, 178, 0, 14, 15, 16, 17, 18, 19,
       0, 0, 0, 20, 0, 0, 183, 1, 2, 3,
       4, 5, 6, 7, 0, 0, 0, 192, 0, 0,
     194, 80, 81, 82, 83, 84, 85, 86, 87, 0,
       0, 0, 1, 2, 3, 4, 5, 6, 7, 0,
       0, 0, 0, 8, 9, 0, 0, 0, 10, 11,
      12, 13, 0, 0, 0, 14, 15, 16, 17, 18,
      19, 0, 0, 0, 20, 0, 181, 182, 8, 9,
       0, 0, 0, 10, 11, 12, 13, 0, 0, 0,
      14, 15, 16, 17, 18, 19, 0, 0, 0, 20,
       0, 193, 1, 2, 3, 4, 5, 6, 7, 83,
      84, 85, 86, 87, 0, 0, 0, 0, 0, 0,
       1, 2, 3, 4, 5, 6, 7, 0, 39, 40,
      41, 42, 43, 44, 45, 46, 0, 0, 8, 9,
      51, 0, 0, 10, 11, 12, 13, 0, 0, 93,
      14, 15, 16, 17, 18, 19, 8, 9, 0, 20,
       0, 10, 11, 12, 13, 0, 0, 0, 14, 15,
      16, 17, 18, 19, 0, 0, 0, 20, 1, 2,
       3, 4, 5, 6, 7, 0, 0, 0, 0, 0,
       0, 1, 2, 3, 4, 5, 6, 7, 0, 0,
       0, 0, 0, 0, 1, 2, 3, 4, 5, 6,
       7, 0, 0, 0, 8, 9, 0, 0, 0, 10,
      11, 12, 13, 0, 0, 0, 32, 15, 16, 17,
      18, 19, 10, 11, 12, 13, 0, 0, 0, 32,
      15, 16, 17, 18, 19, 10, 11, 0, 0, 0,
       0, 0, 32, 15, 16, 17, 18, 19, 1, 2,
       3, 4, 5, 6, 7, 0, 55, 56, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 67, 0,
      68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
      78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
       0, 0, 0, 0, 0, 0, 32, 15, 16, 17,
      18, 19, 0, 0, 171, 55, 56, 57, 58, 59,
      60, 61, 62, 63, 64, 65, 66, 67, 0, 68,
      69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
      79, 80, 81, 82, 83, 84, 85, 86, 87, 0,
      55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
      65, 66, 67, 175, 68, 69, 70, 71, 72, 73,
      74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
      84, 85, 86, 87, 0, 55, 56, 57, 58, 59,
      60, 61, 62, 63, 64, 65, 66, 67, 186, 68,
      69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
      79, 80, 81, 82, 83, 84, 85, 86, 87, 0,
       0, 0, 0, 0, 0, 97, 55, 56, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 67, 180,
      68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
      78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
      55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
      65, 66, 67, 0, 68, 69, 70, 71, 72, 73,
      74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
      84, 85, 86, 87, 67, 0, 68, 69, 70, 71,
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
      82, 83, 84, 85, 86, 87, 68, 69, 70, 71,
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
      82, 83, 84, 85, 86, 87, 70, 71, 72, 73,
      74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
      84, 85, 86, 87, 71, 72, 73, 74, 75, 76,
      77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
      87, 72, 73, 74, 75, 76, 77, 78, 79, 80,
      81, 82, 83, 84, 85, 86, 87, 73, 74, 75,
      76, 77, 78, 79, 80, 81, 82, 83, 84, 85,
      86, 87
};
static final short yycheck[] =
{
       0, 52, 10, 11, 8, 9, 163, 59, 20, 58,
      57, 49, 59, 57, 52, 53, 57, 58, 65, 15,
      67, 57, 71, 14, 54, 55, 67, 57, 185, 20,
      30, 67, 49, 50, 51, 65, 0, 65, 195, 67,
      15, 32, 39, 40, 41, 42, 43, 44, 45, 46,
      47, 48, 49, 50, 51, 55, 56, 57, 58, 59,
      60, 61, 62, 63, 64, 65, 66, 79, 57, 58,
      70, 71, 72, 73, 74, 75, 76, 77, 78, 57,
      80, 81, 82, 83, 84, 85, 86, 87, 79, 70,
      71, 58, 92, 101, 98, 58, 147, 148, 136, 137,
      67, 15, 12, 13, 67, 105, 15, 67, 3, 4,
       5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
      15, 16, 17, 67, 124, 125, 126, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
      46, 47, 48, 49, 50, 51, 154, 58, 65, 157,
      69, 151, 47, 48, 67, 70, 67, 52, 53, 54,
      55, 53, 162, -1, 59, 60, 61, 62, 63, 64,
      -1, -1, -1, 68, -1, -1, 176, 11, 12, 13,
      14, 15, 16, 17, -1, -1, -1, 187, -1, -1,
     190, 44, 45, 46, 47, 48, 49, 50, 51, -1,
      -1, -1, 11, 12, 13, 14, 15, 16, 17, -1,
      -1, -1, -1, 47, 48, -1, -1, -1, 52, 53,
      54, 55, -1, -1, -1, 59, 60, 61, 62, 63,
      64, -1, -1, -1, 68, -1, 70, 71, 47, 48,
      -1, -1, -1, 52, 53, 54, 55, -1, -1, -1,
      59, 60, 61, 62, 63, 64, -1, -1, -1, 68,
      -1, 70, 11, 12, 13, 14, 15, 16, 17, 47,
      48, 49, 50, 51, -1, -1, -1, -1, -1, -1,
      11, 12, 13, 14, 15, 16, 17, -1, 3, 4,
       5, 6, 7, 8, 9, 10, -1, -1, 47, 48,
      15, -1, -1, 52, 53, 54, 55, -1, -1, 58,
      59, 60, 61, 62, 63, 64, 47, 48, -1, 68,
      -1, 52, 53, 54, 55, -1, -1, -1, 59, 60,
      61, 62, 63, 64, -1, -1, -1, 68, 11, 12,
      13, 14, 15, 16, 17, -1, -1, -1, -1, -1,
      -1, 11, 12, 13, 14, 15, 16, 17, -1, -1,
      -1, -1, -1, -1, 11, 12, 13, 14, 15, 16,
      17, -1, -1, -1, 47, 48, -1, -1, -1, 52,
      53, 54, 55, -1, -1, -1, 59, 60, 61, 62,
      63, 64, 52, 53, 54, 55, -1, -1, -1, 59,
      60, 61, 62, 63, 64, 52, 53, -1, -1, -1,
      -1, -1, 59, 60, 61, 62, 63, 64, 11, 12,
      13, 14, 15, 16, 17, -1, 18, 19, 20, 21,
      22, 23, 24, 25, 26, 27, 28, 29, 30, -1,
      32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
      42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
      -1, -1, -1, -1, -1, -1, 59, 60, 61, 62,
      63, 64, -1, -1, 66, 18, 19, 20, 21, 22,
      23, 24, 25, 26, 27, 28, 29, 30, -1, 32,
      33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
      43, 44, 45, 46, 47, 48, 49, 50, 51, -1,
      18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
      28, 29, 30, 66, 32, 33, 34, 35, 36, 37,
      38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
      48, 49, 50, 51, -1, 18, 19, 20, 21, 22,
      23, 24, 25, 26, 27, 28, 29, 30, 66, 32,
      33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
      43, 44, 45, 46, 47, 48, 49, 50, 51, -1,
      -1, -1, -1, -1, -1, 58, 18, 19, 20, 21,
      22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
      32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
      42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
      18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
      28, 29, 30, -1, 32, 33, 34, 35, 36, 37,
      38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
      48, 49, 50, 51, 30, -1, 32, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
      46, 47, 48, 49, 50, 51, 32, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
      46, 47, 48, 49, 50, 51, 34, 35, 36, 37,
      38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
      48, 49, 50, 51, 35, 36, 37, 38, 39, 40,
      41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
      51, 36, 37, 38, 39, 40, 41, 42, 43, 44,
      45, 46, 47, 48, 49, 50, 51, 37, 38, 39,
      40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
      50, 51
};
/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 11, 12, 13, 14, 15, 16, 17, 47, 48,
      52, 53, 54, 55, 59, 60, 61, 62, 63, 64,
      68, 73, 74, 79, 80, 81, 82, 83, 84, 87,
      59, 96, 59, 83, 83, 82, 82, 81, 81, 3,
       4, 5, 6, 7, 8, 9, 10, 74, 80, 86,
      57, 15, 80, 86, 0, 18, 19, 20, 21, 22,
      23, 24, 25, 26, 27, 28, 29, 30, 32, 33,
      34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
      44, 45, 46, 47, 48, 49, 50, 51, 57, 54,
      55, 57, 65, 58, 74, 97, 80, 58, 58, 67,
      85, 58, 85, 15, 57, 65, 85, 90, 91, 96,
      85, 90, 74, 74, 74, 74, 74, 74, 74, 74,
      74, 74, 74, 74, 77, 76, 75, 74, 74, 74,
      74, 74, 74, 74, 74, 74, 80, 86, 98, 74,
      74, 74, 74, 74, 74, 74, 74, 15, 15, 74,
      58, 71, 58, 83, 58, 67, 82, 58, 15, 74,
      89, 67, 65, 88, 74, 74, 74, 85, 85, 96,
      96, 66, 74, 82, 82, 66, 69, 92, 74, 92,
      31, 70, 71, 74, 93, 94, 66, 78, 70, 70,
      71, 92, 74, 70, 74, 95, 92
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
  if (yytype < 72)
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
      yytoken = ((yychar) >= 0 && (yychar) <= 303 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }
  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 761 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -1)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }
  if (yyn == 54)
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
        case 2:
// _line_ 80 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { value = ((LValue)yyvsa[yyvsp+(0)]); ;}
    break;
  case 6:
// _line_ 86 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "*", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 7:
// _line_ 87 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "/", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 8:
// _line_ 88 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "%", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 9:
// _line_ 89 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "+", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)])), framer) : null); ;}
    break;
  case 10:
// _line_ 90 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "-", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)])), framer) : null); ;}
    break;
  case 11:
// _line_ 91 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "<<", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 12:
// _line_ 92 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, ">>", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 13:
// _line_ 93 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, ">>>", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 14:
// _line_ 94 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "<", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 15:
// _line_ 95 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, ">", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 16:
// _line_ 96 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "<=", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 17:
// _line_ 97 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, ">=", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 18:
// _line_ 98 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "==", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 19:
// _line_ 99 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "!=", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 20:
// _line_ 100 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "&", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 21:
// _line_ 101 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "|", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 22:
// _line_ 102 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "^", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 23:
// _line_ 103 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 24:
// _line_ 104 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "*=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 25:
// _line_ 105 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "/=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 26:
// _line_ 106 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "%=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 27:
// _line_ 107 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "+=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 28:
// _line_ 108 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "-=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 29:
// _line_ 109 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "<<=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 30:
// _line_ 110 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, ">>=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 31:
// _line_ 111 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, ">>>=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 32:
// _line_ 112 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "&=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 33:
// _line_ 113 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "^=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 34:
// _line_ 114 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "|=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 35:
// _line_ 116 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = (eval)
     ? ((LValue)yyvsa[yyvsp+(-2)]).instanceOf (vm, framer, ((String)yyvsa[yyvsp+(0)]))
     : null; ;}
    break;
  case 36:
// _line_ 123 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { pushEval ();
     if (eval) {
         Value cond1 = ((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ();
         if (! (cond1 instanceof BooleanValue))
      throw ERROR ("non-boolean operand to &&");
         eval = ((BooleanValue) cond1).booleanValue ();
         yyval = eval;
     }
   ;}
    break;
  case 37:
// _line_ 132 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     if (eval) {
         yyval = ((LValue)yyvsa[yyvsp+(-3)]);
         if (((Boolean)yyvsa[yyvsp+(-1)])) {
      Value cond2 = ((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ();
      if (! (cond2 instanceof BooleanValue))
         throw ERROR ("non-boolean operand to &&");
      yyval = ((LValue)yyvsa[yyvsp+(0)]);
         }
     }
   ;}
    break;
  case 38:
// _line_ 143 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { pushEval ();
     if (eval) {
         Value cond1 = ((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ();
         if (! (cond1 instanceof BooleanValue))
      throw ERROR ("non-boolean operand to ||");
         eval = !((BooleanValue) cond1).booleanValue ();
         yyval = !eval;
     }
   ;}
    break;
  case 39:
// _line_ 152 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     if (eval) {
         yyval = ((LValue)yyvsa[yyvsp+(-3)]);
         if (! ((Boolean)yyvsa[yyvsp+(-1)])) {
      Value cond2 = ((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ();
      if (! (cond2 instanceof BooleanValue))
         throw ERROR ("non-boolean operand to ||");
      yyval = ((LValue)yyvsa[yyvsp+(0)]);
         }
     }
   ;}
    break;
  case 40:
// _line_ 163 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { pushEval ();
     if (eval) {
         Value cond = ((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ();
         if (! (cond instanceof BooleanValue))
      throw ERROR ("non-boolean condition on ?:");
         eval = ((BooleanValue) cond).booleanValue ();
         yyval = eval;
     }
   ;}
    break;
  case 41:
// _line_ 172 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     pushEval ();
     if (eval)
         eval = ! ((Boolean)yyvsa[yyvsp+(-2)]);
   ;}
    break;
  case 42:
// _line_ 177 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     if (eval)
         yyval = ((Boolean)yyvsa[yyvsp+(-4)]) ? ((LValue)yyvsa[yyvsp+(-3)]) : ((LValue)yyvsa[yyvsp+(0)]);
   ;}
    break;
  case 43:
// _line_ 185 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeName (vm, framer, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 44:
// _line_ 187 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeFloat (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 45:
// _line_ 189 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeInteger (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 46:
// _line_ 191 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeCharacter (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 47:
// _line_ 193 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeString (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 48:
// _line_ 195 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((LValue)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 49:
// _line_ 196 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeThisObject (vm, framer,
                "this"); ;}
    break;
  case 50:
// _line_ 200 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeThisObject (vm, framer,
         "super")
     .superLValue (framer, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 51:
// _line_ 204 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeBoolean (vm, "true"); ;}
    break;
  case 52:
// _line_ 206 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeBoolean (vm, "false"); ;}
    break;
  case 53:
// _line_ 208 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeNull (vm, "null"); ;}
    break;
  case 54:
// _line_ 214 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         Value val = Env.connection ()
             .retrieveHistory (((String)yyvsa[yyvsp+(0)]).substring (1));
         yyval = LValue.makeConstant (val);
      }
   ;}
    break;
  case 55:
// _line_ 220 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
           Value val = Env.connection ()
             .retrieveHistory (Integer.parseInt (((String)yyvsa[yyvsp+(0)]).substring (1)));
         yyval = LValue.makeConstant (val);
      }
   ;}
    break;
  case 57:
// _line_ 230 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 59:
// _line_ 236 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        yyval = LValue.makeConstant (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
        doIncr (((LValue)yyvsa[yyvsp+(-1)]), 1);
    }
   ;}
    break;
  case 60:
// _line_ 242 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        yyval = LValue.makeConstant (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
        doIncr (((LValue)yyvsa[yyvsp+(-1)]), -1);
    }
  ;}
    break;
  case 61:
// _line_ 248 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
        yyval = ((LValue)yyvsa[yyvsp+(-3)]).arrayElementLValue (((LValue)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 62:
// _line_ 255 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
        yyval = ((LValue)yyvsa[yyvsp+(-2)]).memberLValue (framer, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 63:
// _line_ 258 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        LValue v = ((LValue)yyvsa[yyvsp+(-3)]).memberLValue (framer, ((String)yyvsa[yyvsp+(-1)]));
        yyval = v;
        v.invokeWith (((List)yyvsa[yyvsp+(0)]));
    }
  ;}
    break;
  case 64:
// _line_ 265 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        LValue v = LValue.makeName (vm, framer, ((String)yyvsa[yyvsp+(-1)]));
        v.invokeWith (((List)yyvsa[yyvsp+(0)]));
        yyval = v;
    }
  ;}
    break;
  case 65:
// _line_ 276 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        LValue v = LValue.makeName (vm, framer,
               ((String)yyvsa[yyvsp+(-3)]) + "." + ((String)yyvsa[yyvsp+(-1)]));
        v.invokeWith (((List)yyvsa[yyvsp+(0)]));
        yyval = v;
     }
  ;}
    break;
  case 66:
// _line_ 284 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
       yyval = LValue.makeName (vm, framer, ((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 68:
// _line_ 290 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "+", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 69:
// _line_ 291 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "-", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 71:
// _line_ 296 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval ? doIncr (((LValue)yyvsa[yyvsp+(0)]), 1) : null; ;}
    break;
  case 72:
// _line_ 297 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval ? doIncr (((LValue)yyvsa[yyvsp+(0)]), -1) : null; ;}
    break;
  case 73:
// _line_ 298 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "~", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 74:
// _line_ 299 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "!", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;
  case 75:
// _line_ 304 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
     ? LValue.castPrimitive (vm, ((String)yyvsa[yyvsp+(-2)]), ((LValue)yyvsa[yyvsp+(0)]))
     : null; ;}
    break;
  case 76:
// _line_ 313 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 77:
// _line_ 314 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((LValue)yyvsa[yyvsp+(0)]); ;}
    break;
  case 78:
// _line_ 315 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((LValue)yyvsa[yyvsp+(0)]); ;}
    break;
  case 79:
// _line_ 319 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((Integer)yyvsa[yyvsp+(-1)]) + 1; ;}
    break;
  case 80:
// _line_ 320 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = 1; ;}
    break;
  case 89:
// _line_ 336 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
    ? LValue.makeArray (vm, ((String)yyvsa[yyvsp+(-1)]), framer, ((List)yyvsa[yyvsp+(0)]))
           : null; ;}
    break;
  case 90:
// _line_ 340 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 91:
// _line_ 342 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = finishArray (); ;}
    break;
  case 92:
// _line_ 344 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
          ? LValue.makeNewObject (vm, framer, ((String)yyvsa[yyvsp+(-1)]), ((List)yyvsa[yyvsp+(0)]))
          : null; ;}
    break;
  case 93:
// _line_ 348 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
    ? LValue.makeArray (vm, ((String)yyvsa[yyvsp+(-1)]), framer, ((List)yyvsa[yyvsp+(0)]))
           : null; ;}
    break;
  case 94:
// _line_ 352 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 95:
// _line_ 354 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = finishArray (); ;}
    break;
  case 97:
// _line_ 359 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (null);
      }
    ;}
    break;
  case 98:
// _line_ 366 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         ArrayList<Value> v =
     new ArrayList<Value> ();
         v.add (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
         yyval = v;
      }
    ;}
    break;
  case 99:
// _line_ 374 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         ((List)yyvsa[yyvsp+(-3)]).add (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
         yyval = ((List)yyvsa[yyvsp+(-3)]);
      }
    ;}
    break;
  case 100:
// _line_ 382 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;
  case 101:
// _line_ 383 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;
  case 102:
// _line_ 384 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;
  case 103:
// _line_ 386 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;
  case 104:
// _line_ 390 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { addInitializer (((LValue)yyvsa[yyvsp+(0)])); ;}
    break;
  case 105:
// _line_ 391 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (); ;}
    break;
  case 107:
// _line_ 393 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { addInitializer (((LValue)yyvsa[yyvsp+(0)])); ;}
    break;
  case 108:
// _line_ 394 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (); ;}
    break;
  case 110:
// _line_ 399 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 111:
// _line_ 400 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;
  case 112:
// _line_ 404 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         ArrayList<Value> v =
     new ArrayList<Value> ();
                v.add (((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ());
         yyval = v;
      }
    ;}
    break;
  case 113:
// _line_ 411 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
          ((List)yyvsa[yyvsp+(-2)]).add (((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ());
          yyval = ((List)yyvsa[yyvsp+(-2)]);
      }
    ;}
    break;
  case 114:
// _line_ 419 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = LValue.JVM_typeName (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 115:
// _line_ 420 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 116:
// _line_ 421 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    { yyval = LValue.JVM_typeName (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
    }
/* Line 813 of yacc.java.  */
// _line_ 1680 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.java"
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
  yystate = yypgoto[yyn - 72] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 761 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 72];
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
   if (0 <= yyn && yyn <= 761 && yycheck[yyn] == 1)
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
  if (yyn == 54)
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
// _line_ 423 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/ExpressionParser.y"
    private static final HashMap<String, Integer> tokenMap =
              new HashMap<String, Integer> ();
static Value evaluate (String src, VirtualMachine vm, GetFrame framer,
         String[] uncommentedSrc)
    throws InvocationException, InvalidTypeException,
    IncompatibleThreadStateException, ClassNotLoadedException
{
    if (vm == null)
 throw ERROR ("Expression evaluation requires a running program.");
    ExpressionParser parser =
 new ExpressionParser (new ExpressionLexer (src), vm, framer);
    parser.parse ();
    EventHandler.setEnables (false);
    Value val;
    try {
 val = parser.value.getValue ();
 if (uncommentedSrc != null)
     uncommentedSrc[0] = parser.lexer.uncommentedSource ();
    } finally {
 EventHandler.setEnables (true);
    }
    return val;
}
static Value evaluate (String src, VirtualMachine vm, GetFrame framer)
    throws InvocationException, InvalidTypeException,
    IncompatibleThreadStateException, ClassNotLoadedException
{
    return evaluate (src, vm, framer, null);
}
private ExpressionParser (ExpressionLexer lexer, VirtualMachine vm,
     GetFrame framer) {
    eval = true;
    this.lexer = lexer;
    this.vm = vm;
    this.framer = framer;
    this.value = null;
}
private Stack<Boolean> evalState = new Stack<Boolean> ();
private boolean eval;
LValue value;
private ExpressionLexer lexer;
private VirtualMachine vm;
private GetFrame framer;
private void pushEval () {
    evalState.push (eval);
}
private void popEval () {
    eval = evalState.pop ();
}
private LValue doIncr (LValue var, int n) {
    return var.doAssign (vm, "+=", LValue.make (vm, n));
}
private static class ArrayInitializer {
    int dims;
    String eltType;
    ArrayList<LValue> elts = new ArrayList<LValue> ();
}
private Stack<ArrayInitializer> arrayInits = new Stack<ArrayInitializer>();
private void startArrayInitializer (String eltType, int dims) {
    ArrayInitializer v = new ArrayInitializer ();
    v.eltType = eltType; v.dims = dims;
    arrayInits.push (v);
}
private void startArrayInitializer () {
    startArrayInitializer (arrayInits.peek ().eltType,
      arrayInits.peek ().dims - 1);
}
private void addInitializer (LValue x) {
    arrayInits.peek ().elts.add (x);
}
private LValue finishArray () {
    ArrayInitializer I = arrayInits.pop ();
    if (eval) {
 ArrayReference val =
     LValue.makeSimpleArray (vm, I.eltType, framer, I.dims,
        I.elts.size ());
 for (int i = 0; i < I.elts.size (); i += 1) {
     try {
  val.setValue (i, I.elts.get (i).interiorGetValue ());
     } catch (Exception e) {
  throw ERROR ("Problem setting array element: " + e);
     }
 }
 return LValue.makeConstant (val);
    } else
 return null;
}
private int yylex () {
    try {
        int v = lexer.yylex ();
        yylval = lexer.lexeme;
        return v;
    } catch (CommandException e) {
        throw e;
    } catch (Exception e) {
        throw ERROR ("problem reading expression: %s", e);
    }
}
private void yyerror (int dummy, String msg) {
    throw ERROR ("%s", msg);
}
static int findQuotedToken (String s) {
    Integer i = tokenMap.get (s);
    return i == null ? 0 : i;
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
