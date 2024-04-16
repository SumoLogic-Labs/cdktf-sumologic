package com.sumologic.cloudtrail_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.516Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cloudtrailSource.CloudtrailSourcePath")
@software.amazon.jsii.Jsii.Proxy(CloudtrailSourcePath.Jsii$Proxy.class)
public interface CloudtrailSourcePath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#type CloudtrailSource#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#bucket_name CloudtrailSource#bucket_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    /**
     * custom_services block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#custom_services CloudtrailSource#custom_services}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCustomServices() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#limit_to_namespaces CloudtrailSource#limit_to_namespaces}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToNamespaces() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#limit_to_regions CloudtrailSource#limit_to_regions}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToRegions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#limit_to_services CloudtrailSource#limit_to_services}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToServices() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#path_expression CloudtrailSource#path_expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPathExpression() {
        return null;
    }

    /**
     * tag_filters block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#tag_filters CloudtrailSource#tag_filters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTagFilters() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#use_versioned_api CloudtrailSource#use_versioned_api}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseVersionedApi() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudtrailSourcePath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudtrailSourcePath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudtrailSourcePath> {
        java.lang.String type;
        java.lang.String bucketName;
        java.lang.Object customServices;
        java.util.List<java.lang.String> limitToNamespaces;
        java.util.List<java.lang.String> limitToRegions;
        java.util.List<java.lang.String> limitToServices;
        java.lang.String pathExpression;
        java.lang.Object tagFilters;
        java.lang.Object useVersionedApi;

        /**
         * Sets the value of {@link CloudtrailSourcePath#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#type CloudtrailSource#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getBucketName}
         * @param bucketName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#bucket_name CloudtrailSource#bucket_name}.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getCustomServices}
         * @param customServices custom_services block.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#custom_services CloudtrailSource#custom_services}
         * @return {@code this}
         */
        public Builder customServices(com.hashicorp.cdktf.IResolvable customServices) {
            this.customServices = customServices;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getCustomServices}
         * @param customServices custom_services block.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#custom_services CloudtrailSource#custom_services}
         * @return {@code this}
         */
        public Builder customServices(java.util.List<? extends com.sumologic.cloudtrail_source.CloudtrailSourcePathCustomServices> customServices) {
            this.customServices = customServices;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getLimitToNamespaces}
         * @param limitToNamespaces Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#limit_to_namespaces CloudtrailSource#limit_to_namespaces}.
         * @return {@code this}
         */
        public Builder limitToNamespaces(java.util.List<java.lang.String> limitToNamespaces) {
            this.limitToNamespaces = limitToNamespaces;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getLimitToRegions}
         * @param limitToRegions Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#limit_to_regions CloudtrailSource#limit_to_regions}.
         * @return {@code this}
         */
        public Builder limitToRegions(java.util.List<java.lang.String> limitToRegions) {
            this.limitToRegions = limitToRegions;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getLimitToServices}
         * @param limitToServices Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#limit_to_services CloudtrailSource#limit_to_services}.
         * @return {@code this}
         */
        public Builder limitToServices(java.util.List<java.lang.String> limitToServices) {
            this.limitToServices = limitToServices;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getPathExpression}
         * @param pathExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#path_expression CloudtrailSource#path_expression}.
         * @return {@code this}
         */
        public Builder pathExpression(java.lang.String pathExpression) {
            this.pathExpression = pathExpression;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getTagFilters}
         * @param tagFilters tag_filters block.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#tag_filters CloudtrailSource#tag_filters}
         * @return {@code this}
         */
        public Builder tagFilters(com.hashicorp.cdktf.IResolvable tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getTagFilters}
         * @param tagFilters tag_filters block.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#tag_filters CloudtrailSource#tag_filters}
         * @return {@code this}
         */
        public Builder tagFilters(java.util.List<? extends com.sumologic.cloudtrail_source.CloudtrailSourcePathTagFilters> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getUseVersionedApi}
         * @param useVersionedApi Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#use_versioned_api CloudtrailSource#use_versioned_api}.
         * @return {@code this}
         */
        public Builder useVersionedApi(java.lang.Boolean useVersionedApi) {
            this.useVersionedApi = useVersionedApi;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailSourcePath#getUseVersionedApi}
         * @param useVersionedApi Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudtrail_source#use_versioned_api CloudtrailSource#use_versioned_api}.
         * @return {@code this}
         */
        public Builder useVersionedApi(com.hashicorp.cdktf.IResolvable useVersionedApi) {
            this.useVersionedApi = useVersionedApi;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudtrailSourcePath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudtrailSourcePath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudtrailSourcePath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudtrailSourcePath {
        private final java.lang.String type;
        private final java.lang.String bucketName;
        private final java.lang.Object customServices;
        private final java.util.List<java.lang.String> limitToNamespaces;
        private final java.util.List<java.lang.String> limitToRegions;
        private final java.util.List<java.lang.String> limitToServices;
        private final java.lang.String pathExpression;
        private final java.lang.Object tagFilters;
        private final java.lang.Object useVersionedApi;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customServices = software.amazon.jsii.Kernel.get(this, "customServices", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.limitToNamespaces = software.amazon.jsii.Kernel.get(this, "limitToNamespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.limitToRegions = software.amazon.jsii.Kernel.get(this, "limitToRegions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.limitToServices = software.amazon.jsii.Kernel.get(this, "limitToServices", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.pathExpression = software.amazon.jsii.Kernel.get(this, "pathExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tagFilters = software.amazon.jsii.Kernel.get(this, "tagFilters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.useVersionedApi = software.amazon.jsii.Kernel.get(this, "useVersionedApi", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.bucketName = builder.bucketName;
            this.customServices = builder.customServices;
            this.limitToNamespaces = builder.limitToNamespaces;
            this.limitToRegions = builder.limitToRegions;
            this.limitToServices = builder.limitToServices;
            this.pathExpression = builder.pathExpression;
            this.tagFilters = builder.tagFilters;
            this.useVersionedApi = builder.useVersionedApi;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.Object getCustomServices() {
            return this.customServices;
        }

        @Override
        public final java.util.List<java.lang.String> getLimitToNamespaces() {
            return this.limitToNamespaces;
        }

        @Override
        public final java.util.List<java.lang.String> getLimitToRegions() {
            return this.limitToRegions;
        }

        @Override
        public final java.util.List<java.lang.String> getLimitToServices() {
            return this.limitToServices;
        }

        @Override
        public final java.lang.String getPathExpression() {
            return this.pathExpression;
        }

        @Override
        public final java.lang.Object getTagFilters() {
            return this.tagFilters;
        }

        @Override
        public final java.lang.Object getUseVersionedApi() {
            return this.useVersionedApi;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getCustomServices() != null) {
                data.set("customServices", om.valueToTree(this.getCustomServices()));
            }
            if (this.getLimitToNamespaces() != null) {
                data.set("limitToNamespaces", om.valueToTree(this.getLimitToNamespaces()));
            }
            if (this.getLimitToRegions() != null) {
                data.set("limitToRegions", om.valueToTree(this.getLimitToRegions()));
            }
            if (this.getLimitToServices() != null) {
                data.set("limitToServices", om.valueToTree(this.getLimitToServices()));
            }
            if (this.getPathExpression() != null) {
                data.set("pathExpression", om.valueToTree(this.getPathExpression()));
            }
            if (this.getTagFilters() != null) {
                data.set("tagFilters", om.valueToTree(this.getTagFilters()));
            }
            if (this.getUseVersionedApi() != null) {
                data.set("useVersionedApi", om.valueToTree(this.getUseVersionedApi()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cloudtrailSource.CloudtrailSourcePath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudtrailSourcePath.Jsii$Proxy that = (CloudtrailSourcePath.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            if (this.customServices != null ? !this.customServices.equals(that.customServices) : that.customServices != null) return false;
            if (this.limitToNamespaces != null ? !this.limitToNamespaces.equals(that.limitToNamespaces) : that.limitToNamespaces != null) return false;
            if (this.limitToRegions != null ? !this.limitToRegions.equals(that.limitToRegions) : that.limitToRegions != null) return false;
            if (this.limitToServices != null ? !this.limitToServices.equals(that.limitToServices) : that.limitToServices != null) return false;
            if (this.pathExpression != null ? !this.pathExpression.equals(that.pathExpression) : that.pathExpression != null) return false;
            if (this.tagFilters != null ? !this.tagFilters.equals(that.tagFilters) : that.tagFilters != null) return false;
            return this.useVersionedApi != null ? this.useVersionedApi.equals(that.useVersionedApi) : that.useVersionedApi == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.bucketName != null ? this.bucketName.hashCode() : 0);
            result = 31 * result + (this.customServices != null ? this.customServices.hashCode() : 0);
            result = 31 * result + (this.limitToNamespaces != null ? this.limitToNamespaces.hashCode() : 0);
            result = 31 * result + (this.limitToRegions != null ? this.limitToRegions.hashCode() : 0);
            result = 31 * result + (this.limitToServices != null ? this.limitToServices.hashCode() : 0);
            result = 31 * result + (this.pathExpression != null ? this.pathExpression.hashCode() : 0);
            result = 31 * result + (this.tagFilters != null ? this.tagFilters.hashCode() : 0);
            result = 31 * result + (this.useVersionedApi != null ? this.useVersionedApi.hashCode() : 0);
            return result;
        }
    }
}
