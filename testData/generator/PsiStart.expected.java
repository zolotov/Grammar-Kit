// ---- GeneratedParser.java -----------------
// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static generated.GeneratedTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ELEMENT) {
      result_ = element(builder_, 0);
    }
    else if (root_ == ENTRY) {
      result_ = entry(builder_, 0);
    }
    else if (root_ == LIST) {
      result_ = list(builder_, 0);
    }
    else if (root_ == MAP) {
      result_ = map(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return grammar(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // 'id'
  public static boolean element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<element>");
    result_ = consumeToken(builder_, "id");
    exit_section_(builder_, level_, marker_, ELEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'name' '->' element
  public static boolean entry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "entry")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<entry>");
    result_ = consumeToken(builder_, "name");
    result_ = result_ && consumeToken(builder_, "->");
    result_ = result_ && element(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENTRY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // list | map
  static boolean grammar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammar")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = list(builder_, level_ + 1);
    if (!result_) result_ = map(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' element (',' element) * ')'
  public static boolean list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<list>");
    result_ = consumeToken(builder_, "(");
    result_ = result_ && element(builder_, level_ + 1);
    result_ = result_ && list_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, level_, marker_, LIST, result_, false, null);
    return result_;
  }

  // (',' element) *
  private static boolean list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!list_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "list_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' element
  private static boolean list_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && element(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' entry (',' entry) * ')'
  public static boolean map(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<map>");
    result_ = consumeToken(builder_, "(");
    result_ = result_ && entry(builder_, level_ + 1);
    result_ = result_ && map_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, level_, marker_, MAP, result_, false, null);
    return result_;
  }

  // (',' entry) *
  private static boolean map_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!map_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "map_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' entry
  private static boolean map_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && entry(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}