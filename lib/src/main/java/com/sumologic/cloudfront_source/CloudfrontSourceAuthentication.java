package com.sumologic.cloudfront_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.461Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cloudfrontSource.CloudfrontSourceAuthentication")
@software.amazon.jsii.Jsii.Proxy(CloudfrontSourceAuthentication.Jsii$Proxy.class)
public interface CloudfrontSourceAuthentication extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#type CloudfrontSource#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#access_key CloudfrontSource#access_key}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccessKey() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#auth_provider_x509_cert_url CloudfrontSource#auth_provider_x509_cert_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAuthProviderX509CertUrl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#auth_uri CloudfrontSource#auth_uri}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAuthUri() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#client_email CloudfrontSource#client_email}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientEmail() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#client_id CloudfrontSource#client_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#client_x509_cert_url CloudfrontSource#client_x509_cert_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientX509CertUrl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#private_key CloudfrontSource#private_key}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateKey() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#private_key_id CloudfrontSource#private_key_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateKeyId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#project_id CloudfrontSource#project_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProjectId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#region CloudfrontSource#region}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#role_arn CloudfrontSource#role_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#secret_key CloudfrontSource#secret_key}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretKey() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#token_uri CloudfrontSource#token_uri}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTokenUri() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontSourceAuthentication}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontSourceAuthentication}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontSourceAuthentication> {
        java.lang.String type;
        java.lang.String accessKey;
        java.lang.String authProviderX509CertUrl;
        java.lang.String authUri;
        java.lang.String clientEmail;
        java.lang.String clientId;
        java.lang.String clientX509CertUrl;
        java.lang.String privateKey;
        java.lang.String privateKeyId;
        java.lang.String projectId;
        java.lang.String region;
        java.lang.String roleArn;
        java.lang.String secretKey;
        java.lang.String tokenUri;

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#type CloudfrontSource#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getAccessKey}
         * @param accessKey Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#access_key CloudfrontSource#access_key}.
         * @return {@code this}
         */
        public Builder accessKey(java.lang.String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getAuthProviderX509CertUrl}
         * @param authProviderX509CertUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#auth_provider_x509_cert_url CloudfrontSource#auth_provider_x509_cert_url}.
         * @return {@code this}
         */
        public Builder authProviderX509CertUrl(java.lang.String authProviderX509CertUrl) {
            this.authProviderX509CertUrl = authProviderX509CertUrl;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getAuthUri}
         * @param authUri Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#auth_uri CloudfrontSource#auth_uri}.
         * @return {@code this}
         */
        public Builder authUri(java.lang.String authUri) {
            this.authUri = authUri;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getClientEmail}
         * @param clientEmail Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#client_email CloudfrontSource#client_email}.
         * @return {@code this}
         */
        public Builder clientEmail(java.lang.String clientEmail) {
            this.clientEmail = clientEmail;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getClientId}
         * @param clientId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#client_id CloudfrontSource#client_id}.
         * @return {@code this}
         */
        public Builder clientId(java.lang.String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getClientX509CertUrl}
         * @param clientX509CertUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#client_x509_cert_url CloudfrontSource#client_x509_cert_url}.
         * @return {@code this}
         */
        public Builder clientX509CertUrl(java.lang.String clientX509CertUrl) {
            this.clientX509CertUrl = clientX509CertUrl;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getPrivateKey}
         * @param privateKey Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#private_key CloudfrontSource#private_key}.
         * @return {@code this}
         */
        public Builder privateKey(java.lang.String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getPrivateKeyId}
         * @param privateKeyId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#private_key_id CloudfrontSource#private_key_id}.
         * @return {@code this}
         */
        public Builder privateKeyId(java.lang.String privateKeyId) {
            this.privateKeyId = privateKeyId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getProjectId}
         * @param projectId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#project_id CloudfrontSource#project_id}.
         * @return {@code this}
         */
        public Builder projectId(java.lang.String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getRegion}
         * @param region Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#region CloudfrontSource#region}.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getRoleArn}
         * @param roleArn Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#role_arn CloudfrontSource#role_arn}.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getSecretKey}
         * @param secretKey Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#secret_key CloudfrontSource#secret_key}.
         * @return {@code this}
         */
        public Builder secretKey(java.lang.String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontSourceAuthentication#getTokenUri}
         * @param tokenUri Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudfront_source#token_uri CloudfrontSource#token_uri}.
         * @return {@code this}
         */
        public Builder tokenUri(java.lang.String tokenUri) {
            this.tokenUri = tokenUri;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontSourceAuthentication}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontSourceAuthentication build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontSourceAuthentication}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontSourceAuthentication {
        private final java.lang.String type;
        private final java.lang.String accessKey;
        private final java.lang.String authProviderX509CertUrl;
        private final java.lang.String authUri;
        private final java.lang.String clientEmail;
        private final java.lang.String clientId;
        private final java.lang.String clientX509CertUrl;
        private final java.lang.String privateKey;
        private final java.lang.String privateKeyId;
        private final java.lang.String projectId;
        private final java.lang.String region;
        private final java.lang.String roleArn;
        private final java.lang.String secretKey;
        private final java.lang.String tokenUri;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessKey = software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authProviderX509CertUrl = software.amazon.jsii.Kernel.get(this, "authProviderX509CertUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authUri = software.amazon.jsii.Kernel.get(this, "authUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientEmail = software.amazon.jsii.Kernel.get(this, "clientEmail", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientId = software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientX509CertUrl = software.amazon.jsii.Kernel.get(this, "clientX509CertUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateKey = software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateKeyId = software.amazon.jsii.Kernel.get(this, "privateKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.projectId = software.amazon.jsii.Kernel.get(this, "projectId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretKey = software.amazon.jsii.Kernel.get(this, "secretKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tokenUri = software.amazon.jsii.Kernel.get(this, "tokenUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.accessKey = builder.accessKey;
            this.authProviderX509CertUrl = builder.authProviderX509CertUrl;
            this.authUri = builder.authUri;
            this.clientEmail = builder.clientEmail;
            this.clientId = builder.clientId;
            this.clientX509CertUrl = builder.clientX509CertUrl;
            this.privateKey = builder.privateKey;
            this.privateKeyId = builder.privateKeyId;
            this.projectId = builder.projectId;
            this.region = builder.region;
            this.roleArn = builder.roleArn;
            this.secretKey = builder.secretKey;
            this.tokenUri = builder.tokenUri;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getAccessKey() {
            return this.accessKey;
        }

        @Override
        public final java.lang.String getAuthProviderX509CertUrl() {
            return this.authProviderX509CertUrl;
        }

        @Override
        public final java.lang.String getAuthUri() {
            return this.authUri;
        }

        @Override
        public final java.lang.String getClientEmail() {
            return this.clientEmail;
        }

        @Override
        public final java.lang.String getClientId() {
            return this.clientId;
        }

        @Override
        public final java.lang.String getClientX509CertUrl() {
            return this.clientX509CertUrl;
        }

        @Override
        public final java.lang.String getPrivateKey() {
            return this.privateKey;
        }

        @Override
        public final java.lang.String getPrivateKeyId() {
            return this.privateKeyId;
        }

        @Override
        public final java.lang.String getProjectId() {
            return this.projectId;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getSecretKey() {
            return this.secretKey;
        }

        @Override
        public final java.lang.String getTokenUri() {
            return this.tokenUri;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getAccessKey() != null) {
                data.set("accessKey", om.valueToTree(this.getAccessKey()));
            }
            if (this.getAuthProviderX509CertUrl() != null) {
                data.set("authProviderX509CertUrl", om.valueToTree(this.getAuthProviderX509CertUrl()));
            }
            if (this.getAuthUri() != null) {
                data.set("authUri", om.valueToTree(this.getAuthUri()));
            }
            if (this.getClientEmail() != null) {
                data.set("clientEmail", om.valueToTree(this.getClientEmail()));
            }
            if (this.getClientId() != null) {
                data.set("clientId", om.valueToTree(this.getClientId()));
            }
            if (this.getClientX509CertUrl() != null) {
                data.set("clientX509CertUrl", om.valueToTree(this.getClientX509CertUrl()));
            }
            if (this.getPrivateKey() != null) {
                data.set("privateKey", om.valueToTree(this.getPrivateKey()));
            }
            if (this.getPrivateKeyId() != null) {
                data.set("privateKeyId", om.valueToTree(this.getPrivateKeyId()));
            }
            if (this.getProjectId() != null) {
                data.set("projectId", om.valueToTree(this.getProjectId()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getRoleArn() != null) {
                data.set("roleArn", om.valueToTree(this.getRoleArn()));
            }
            if (this.getSecretKey() != null) {
                data.set("secretKey", om.valueToTree(this.getSecretKey()));
            }
            if (this.getTokenUri() != null) {
                data.set("tokenUri", om.valueToTree(this.getTokenUri()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cloudfrontSource.CloudfrontSourceAuthentication"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontSourceAuthentication.Jsii$Proxy that = (CloudfrontSourceAuthentication.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.accessKey != null ? !this.accessKey.equals(that.accessKey) : that.accessKey != null) return false;
            if (this.authProviderX509CertUrl != null ? !this.authProviderX509CertUrl.equals(that.authProviderX509CertUrl) : that.authProviderX509CertUrl != null) return false;
            if (this.authUri != null ? !this.authUri.equals(that.authUri) : that.authUri != null) return false;
            if (this.clientEmail != null ? !this.clientEmail.equals(that.clientEmail) : that.clientEmail != null) return false;
            if (this.clientId != null ? !this.clientId.equals(that.clientId) : that.clientId != null) return false;
            if (this.clientX509CertUrl != null ? !this.clientX509CertUrl.equals(that.clientX509CertUrl) : that.clientX509CertUrl != null) return false;
            if (this.privateKey != null ? !this.privateKey.equals(that.privateKey) : that.privateKey != null) return false;
            if (this.privateKeyId != null ? !this.privateKeyId.equals(that.privateKeyId) : that.privateKeyId != null) return false;
            if (this.projectId != null ? !this.projectId.equals(that.projectId) : that.projectId != null) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            if (this.roleArn != null ? !this.roleArn.equals(that.roleArn) : that.roleArn != null) return false;
            if (this.secretKey != null ? !this.secretKey.equals(that.secretKey) : that.secretKey != null) return false;
            return this.tokenUri != null ? this.tokenUri.equals(that.tokenUri) : that.tokenUri == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.accessKey != null ? this.accessKey.hashCode() : 0);
            result = 31 * result + (this.authProviderX509CertUrl != null ? this.authProviderX509CertUrl.hashCode() : 0);
            result = 31 * result + (this.authUri != null ? this.authUri.hashCode() : 0);
            result = 31 * result + (this.clientEmail != null ? this.clientEmail.hashCode() : 0);
            result = 31 * result + (this.clientId != null ? this.clientId.hashCode() : 0);
            result = 31 * result + (this.clientX509CertUrl != null ? this.clientX509CertUrl.hashCode() : 0);
            result = 31 * result + (this.privateKey != null ? this.privateKey.hashCode() : 0);
            result = 31 * result + (this.privateKeyId != null ? this.privateKeyId.hashCode() : 0);
            result = 31 * result + (this.projectId != null ? this.projectId.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            result = 31 * result + (this.secretKey != null ? this.secretKey.hashCode() : 0);
            result = 31 * result + (this.tokenUri != null ? this.tokenUri.hashCode() : 0);
            return result;
        }
    }
}
