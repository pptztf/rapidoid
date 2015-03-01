package org.rapidoid.widget;

/*
 * #%L
 * rapidoid-widget
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.html.Tag;

@Authors("Nikolche Mihajlovski")
@Since("2.2.0")
public class PanelWidget extends AbstractWidget {

	private Object header;
	private Object content;
	private Object footer;

	public PanelWidget(Object content) {
		this.content = content;
	}

	@Override
	protected Tag render() {
		Tag pheader = header != null ? div(header).class_("panel-heading") : null;
		Tag pbody = content != null ? div(content).class_("panel-body") : null;
		Tag pfooter = footer != null ? div(footer).class_("panel-footer") : null;
		return div(pheader, pbody, pfooter).class_("panel panel-default");
	}

	public Object header() {
		return header;
	}

	public PanelWidget header(Object header) {
		this.header = header;
		return this;
	}

	public Object content() {
		return content;
	}

	public PanelWidget content(Object content) {
		this.content = content;
		return this;
	}

	public Object footer() {
		return footer;
	}

	public PanelWidget footer(Object footer) {
		this.footer = footer;
		return this;
	}

}
