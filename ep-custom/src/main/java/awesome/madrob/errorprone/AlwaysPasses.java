package awesome.madrob.errorprone;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker;
import com.google.errorprone.fixes.Fix;
import com.google.errorprone.fixes.SuggestedFix;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matcher;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.ImportTree;

@AutoService(BugChecker.class)
@BugPattern(name = "AlwaysPasses",
    category = BugPattern.Category.JDK,
    summary = "A placeholder rule that never matches.",
    severity = BugPattern.SeverityLevel.ERROR,
    suppressibility = BugPattern.Suppressibility.UNSUPPRESSIBLE,
    linkType = BugPattern.LinkType.NONE)
public class AlwaysPasses extends BugChecker implements BugChecker.CompilationUnitTreeMatcher {
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    return Description.NO_MATCH;
  }
}
