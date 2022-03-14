package org.sanity.instagraph.data.procedures;

import org.sanity.instagraph.data.models.GetFilterPostsDto;
import org.sanity.instagraph.data.models.PostProcedureCallDto;

import java.util.List;

public interface ProcedureManager {
    void definePostProcedure();

    void defineFilterProcedure();

    void executePostProcedure(PostProcedureCallDto postProcedureCallModel);

    List<GetFilterPostsDto> executeFilterProcedure(String hashtag);
}
