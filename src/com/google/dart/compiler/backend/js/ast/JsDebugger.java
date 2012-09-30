// Copyright (c) 2011, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

package com.google.dart.compiler.backend.js.ast;

/**
 * Represents a JavaScript debugger statement.
 */
public class JsDebugger extends JsNodeImpl implements JsStatement {

  public JsDebugger() {
  }

  @Override
  public void traverse(JsVisitor v, JsContext context) {
    v.visit(this, context);
    v.endVisit(this, context);
  }

  @Override
  public NodeKind getKind() {
    return NodeKind.DEBUGGER;
  }
}
