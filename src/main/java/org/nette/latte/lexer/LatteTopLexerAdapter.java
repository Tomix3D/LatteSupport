package org.nette.latte.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.MergingLexerAdapter;
import org.nette.latte.utils.LatteHtmlUtil;

/**
 * Adapter for {@link LatteTopLexer} which is generated by JFlex to IntelliJ's interface
 * {@link com.intellij.lexer.Lexer}.
 *
 * Also merges any sequence of selected tokens to a single token.
 */
public class LatteTopLexerAdapter extends MergingLexerAdapter {
	public LatteTopLexerAdapter() {
		super(
			new FlexAdapter(new LatteTopLexer((java.io.Reader) null)),
				LatteHtmlUtil.HTML_TOKENS
		);
	}
}