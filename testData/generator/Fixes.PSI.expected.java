// ---- GeneratedTypes.java -----------------
// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType A_EXPR = new IElementType("A_EXPR", null);
  IElementType B_EXPR = new IElementType("B_EXPR", null);
  IElementType EXPR = new IElementType("EXPR", null);
  IElementType LEFT_EXPR = new IElementType("LEFT_EXPR", null);
  IElementType SOME = new IElementType("SOME", null);
  IElementType SOME_EXPR = new IElementType("SOME_EXPR", null);
  IElementType SOME_SEQ = new IElementType("SOME_SEQ", null);
  IElementType WITH_RECURSIVE = new IElementType("WITH_RECURSIVE", null);

  IElementType A = new IElementType("A", null);
}
// ---- AExpr.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AExpr extends Expr {

  @NotNull
  List<Expr> getExprList();

}
// ---- BExpr.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BExpr extends Expr {

  @NotNull
  List<Expr> getExprList();

}
// ---- Expr.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Expr extends PsiElement {

}
// ---- LeftExpr.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LeftExpr extends Expr {

  @NotNull
  List<Expr> getExprList();

}
// ---- Some.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Some extends PsiElement {

}
// ---- SomeExpr.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SomeExpr extends Expr {

}
// ---- SomeSeq.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SomeSeq extends PsiElement {

  @NotNull
  List<Some> getSomeList();

}
// ---- WithRecursive.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WithRecursive extends PsiElement {

  @NotNull
  List<Some> getSomeList();

}
// ---- AExprImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import generated.psi.*;

public class AExprImpl extends ExprImpl implements AExpr {

  public AExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitAExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Expr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Expr.class);
  }

}
// ---- BExprImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import generated.psi.*;

public class BExprImpl extends ExprImpl implements BExpr {

  public BExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitBExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Expr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Expr.class);
  }

}
// ---- ExprImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class ExprImpl extends ASTWrapperPsiElement implements Expr {

  public ExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitExpr(this);
    else super.accept(visitor);
  }

}
// ---- LeftExprImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import generated.psi.*;

public class LeftExprImpl extends ExprImpl implements LeftExpr {

  public LeftExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitLeftExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Expr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Expr.class);
  }

}
// ---- SomeImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class SomeImpl extends ASTWrapperPsiElement implements Some {

  public SomeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitSome(this);
    else super.accept(visitor);
  }

}
// ---- SomeExprImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import generated.psi.*;

public class SomeExprImpl extends ExprImpl implements SomeExpr {

  public SomeExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitSomeExpr(this);
    else super.accept(visitor);
  }

}
// ---- SomeSeqImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class SomeSeqImpl extends ASTWrapperPsiElement implements SomeSeq {

  public SomeSeqImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitSomeSeq(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Some> getSomeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Some.class);
  }

}
// ---- WithRecursiveImpl.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class WithRecursiveImpl extends ASTWrapperPsiElement implements WithRecursive {

  public WithRecursiveImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitWithRecursive(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Some> getSomeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Some.class);
  }

}
// ---- Visitor.java -----------------
// This is a generated file. Not intended for manual editing.
package generated.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class Visitor extends PsiElementVisitor {

  public void visitAExpr(@NotNull AExpr o) {
    visitExpr(o);
  }

  public void visitBExpr(@NotNull BExpr o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull Expr o) {
    visitPsiElement(o);
  }

  public void visitLeftExpr(@NotNull LeftExpr o) {
    visitExpr(o);
  }

  public void visitSome(@NotNull Some o) {
    visitPsiElement(o);
  }

  public void visitSomeExpr(@NotNull SomeExpr o) {
    visitExpr(o);
  }

  public void visitSomeSeq(@NotNull SomeSeq o) {
    visitPsiElement(o);
  }

  public void visitWithRecursive(@NotNull WithRecursive o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}