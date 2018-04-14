package org.zstack.header.identity.role

import java.sql.Timestamp
import java.sql.Timestamp
import org.zstack.header.identity.role.RolePolicyStatementInventory

doc {

	title "在这里输入结构的名称"

	field {
		name "uuid"
		desc "资源的UUID，唯一标示该资源"
		type "String"
		since "0.6"
	}
	field {
		name "name"
		desc "资源名称"
		type "String"
		since "0.6"
	}
	field {
		name "description"
		desc "资源的详细描述"
		type "String"
		since "0.6"
	}
	field {
		name "createDate"
		desc "创建时间"
		type "Timestamp"
		since "0.6"
	}
	field {
		name "lastOpDate"
		desc "最后一次修改时间"
		type "Timestamp"
		since "0.6"
	}
	ref {
		name "statements"
		path "org.zstack.header.identity.role.RoleInventory.statements"
		desc "null"
		type "List"
		since "0.6"
		clz RolePolicyStatementInventory.class
	}
}
