package com.rethinkdb.ast.query.gen;

import com.rethinkdb.RethinkDBConnection;
import com.rethinkdb.ast.query.RqlQuery;
import com.rethinkdb.proto.Q2L;

import java.util.List;
import java.util.Map;

// extends RqlMethodQuery
public class ConcatMap extends RqlQuery {

    public ConcatMap(List<Object> args, java.util.Map<String, Object> optionalArgs) {
        this(null, args, optionalArgs);
    }

    public ConcatMap(RqlQuery prev, List<Object> args, Map<String, Object> optionalArgs) {
        super(prev, Q2L.Term.TermType.CONCAT_MAP, args, optionalArgs);
    }

    @Override
    public List run(RethinkDBConnection connection) {
        return (List)super.run(connection);
    }

    public <T> List<T> runTyped(RethinkDBConnection connection) {
        return (List<T>)super.run(connection);
    }
}
        