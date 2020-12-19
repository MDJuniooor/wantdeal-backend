-- 클라이언트 등록과 관련된 데이터 테이블
create table oauth_client_details (
                                      client_id VARCHAR(256) PRIMARY KEY,
                                      resource_ids VARCHAR(256),
                                      client_secret VARCHAR(256),
                                      scope VARCHAR(256),
                                      authorized_grant_types VARCHAR(256),
                                      web_server_redirect_uri VARCHAR(256),
                                      authorities VARCHAR(256),
                                      access_token_validity INTEGER,
                                      refresh_token_validity INTEGER,
                                      additional_information VARCHAR(2000),
                                      autoapprove VARCHAR(256)
);

-- 사용자(Resource Owner)의 승인을 저장하기 위한 테이블
create table oauth_approvals (
                                 userId VARCHAR(256),
                                 clientId VARCHAR(256),
                                 scope VARCHAR(256),
                                 status VARCHAR(10),
                                 expiresAt TIMESTAMP,
                                 lastModifiedAt TIMESTAMP
);

-- authorization code table
create table oauth_code (
                            code VARCHAR(256), authentication blob
);

insert into oauth_client_details (client_id, client_secret, resource_ids, scope, authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, refresh_token_validity, additional_information, autoapprove) values ('auth_id', '{noop}auth_secret', null, 'read,write', 'authorization_code,password,client_credentials,implicit,refresh_token', null, 'ROLE_MY_CLIENT', 36000, 2592000, null, null);