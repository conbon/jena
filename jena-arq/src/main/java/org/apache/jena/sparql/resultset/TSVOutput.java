/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.sparql.resultset;

import java.io.OutputStream ;

import org.apache.jena.query.ResultSet ;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.riot.resultset.ResultSetLang;
import org.apache.jena.riot.resultset.rw.ResultsWriter;

/**
 * Tab Separated Values. First row is variable names (with ?). Subsequent rows are
 * RDF terms, written Turtle style.
 *
 * @deprecated This will become an internal class. Use
 *     {@link ResultSetFormatter#outputAsTSV} or
 *     {@code ResultsWriter.create().lang(ResultSetLang.RS_TSV).write(...)}
 */
@Deprecated
public class TSVOutput extends OutputBase
{
    // Tab Separated Values
    // http://www.iana.org/assignments/media-types/text/tab-separated-values

    @Override
    public void format(OutputStream out, ResultSet resultSet) {
        ResultsWriter.create().lang(ResultSetLang.RS_TSV).write(out, resultSet);
    }

    @Override
    public void format(OutputStream out, boolean booleanResult) {
        ResultsWriter.create().lang(ResultSetLang.RS_TSV).write(out, booleanResult);
    }
}
