package com.sumologic.policies;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.142Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.policies.PoliciesUserConcurrentSessionsLimit")
@software.amazon.jsii.Jsii.Proxy(PoliciesUserConcurrentSessionsLimit.Jsii$Proxy.class)
public interface PoliciesUserConcurrentSessionsLimit extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#enabled Policies#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#max_concurrent_sessions Policies#max_concurrent_sessions}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxConcurrentSessions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PoliciesUserConcurrentSessionsLimit}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PoliciesUserConcurrentSessionsLimit}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PoliciesUserConcurrentSessionsLimit> {
        java.lang.Object enabled;
        java.lang.Number maxConcurrentSessions;

        /**
         * Sets the value of {@link PoliciesUserConcurrentSessionsLimit#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#enabled Policies#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesUserConcurrentSessionsLimit#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#enabled Policies#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesUserConcurrentSessionsLimit#getMaxConcurrentSessions}
         * @param maxConcurrentSessions Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#max_concurrent_sessions Policies#max_concurrent_sessions}.
         * @return {@code this}
         */
        public Builder maxConcurrentSessions(java.lang.Number maxConcurrentSessions) {
            this.maxConcurrentSessions = maxConcurrentSessions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PoliciesUserConcurrentSessionsLimit}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PoliciesUserConcurrentSessionsLimit build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PoliciesUserConcurrentSessionsLimit}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PoliciesUserConcurrentSessionsLimit {
        private final java.lang.Object enabled;
        private final java.lang.Number maxConcurrentSessions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maxConcurrentSessions = software.amazon.jsii.Kernel.get(this, "maxConcurrentSessions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
            this.maxConcurrentSessions = builder.maxConcurrentSessions;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Number getMaxConcurrentSessions() {
            return this.maxConcurrentSessions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));
            if (this.getMaxConcurrentSessions() != null) {
                data.set("maxConcurrentSessions", om.valueToTree(this.getMaxConcurrentSessions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.policies.PoliciesUserConcurrentSessionsLimit"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PoliciesUserConcurrentSessionsLimit.Jsii$Proxy that = (PoliciesUserConcurrentSessionsLimit.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            return this.maxConcurrentSessions != null ? this.maxConcurrentSessions.equals(that.maxConcurrentSessions) : that.maxConcurrentSessions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.maxConcurrentSessions != null ? this.maxConcurrentSessions.hashCode() : 0);
            return result;
        }
    }
}
