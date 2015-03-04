package com.google.gson.reflect; class TypeToken { void a() { int a;
a=0;// .class public Lcom/google/gson/reflect/TypeToken;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TypeToken.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final hashCode:I
a=0;// 
a=0;// .field final rawType:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<-TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final type:Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->getSuperclassTypeParameter(Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/reflect/TypeToken;->rawType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/google/gson/reflect/TypeToken;->hashCode:I
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/reflect/Type;)V
a=0;//     .locals 1
a=0;//     .param p1, "type"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 72
a=0;//     #p0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/$Gson$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/reflect/TypeToken;->rawType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/google/gson/reflect/TypeToken;->hashCode:I
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs buildUnexpectedTypeError(Ljava/lang/reflect/Type;[Ljava/lang/Class;)Ljava/lang/AssertionError;
a=0;//     .locals 7
a=0;//     .param p0, "token"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/AssertionError;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     .local p1, "expected":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Unexpected type. Expected one of: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 259
a=0;//     .local v2, "exceptionMessage":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/Class;
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     if-ge v3, v4, :cond_0
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 260
a=0;//     .local v1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 259
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     .end local v1    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     const-string v5, "but got: "
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", for type token: "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/16 v6, 0x2e
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 265
a=0;//     new-instance v5, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/AssertionError;);
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     new-instance v0, Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/reflect/TypeToken;-><init>(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;//     .locals 1
a=0;//     .param p0, "type"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     new-instance v0, Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/reflect/TypeToken;-><init>(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static getSuperclassTypeParameter(Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     .local p0, "subclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "superclass":Ljava/lang/reflect/Type;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v2, v1, Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v3, "Missing type parameter."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "parameterized":Ljava/lang/reflect/ParameterizedType;
a=0;//     invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v2, v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private static isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/GenericArrayType;)Z
a=0;//     .locals 4
a=0;//     .param p0, "from"    # Ljava/lang/reflect/Type;
a=0;//     .param p1, "to"    # Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "toGenericComponentType":Ljava/lang/reflect/Type;
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 163
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 164
a=0;//     .local v1, "t":Ljava/lang/reflect/Type;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v3, p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     check-cast p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .end local p0    # "from":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     check-cast v2, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local v2    # "toGenericComponentType":Ljava/lang/reflect/Type;
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 178
a=0;//     .end local v1    # "t":Ljava/lang/reflect/Type;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 166
a=0;//     .restart local v1    # "t":Ljava/lang/reflect/Type;
a=0;//     .restart local v2    # "toGenericComponentType":Ljava/lang/reflect/Type;
a=0;//     .restart local p0    # "from":Ljava/lang/reflect/Type;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v3, p0, Ljava/lang/Class;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 167
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 168
a=0;//     .local v0, "classType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_2
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 171
a=0;//     :cond_2
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     .end local v0    # "classType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v1    # "t":Ljava/lang/reflect/Type;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;//     .locals 16
a=0;//     .param p0, "from"    # Ljava/lang/reflect/Type;
a=0;//     .param p1, "to"    # Ljava/lang/reflect/ParameterizedType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/reflect/ParameterizedType;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     .local p2, "typeVarMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/reflect/Type;>;"
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Boolean);
a=0;//     return v15
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/ParameterizedType;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_1
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v15=(Boolean);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 198
a=0;//     .local v4, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     .local v9, "ptype":Ljava/lang/reflect/ParameterizedType;
a=0;//     #v9=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     instance-of v15, v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     if-eqz v15, :cond_2
a=0;// 
a=0;//     move-object/from16 v9, p0
a=0;// 
a=0;//     .line 200
a=0;//     #v9=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v9, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 204
a=0;//     :cond_2
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     .line 205
a=0;//     invoke-interface {v9}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 206
a=0;//     .local v11, "tArgs":[Ljava/lang/reflect/Type;
a=0;//     #v11=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 207
a=0;//     .local v12, "tParams":[Ljava/lang/reflect/TypeVariable;, "[Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     #v12=(Reference,[Ljava/lang/reflect/TypeVariable;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v5=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     array-length v15, v11
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ge v5, v15, :cond_4
a=0;// 
a=0;//     .line 208
a=0;//     aget-object v2, v11, v5
a=0;// 
a=0;//     .line 209
a=0;//     .local v2, "arg":Ljava/lang/reflect/Type;
a=0;//     #v2=(Null);
a=0;//     aget-object v14, v12, v5
a=0;// 
a=0;//     .line 210
a=0;//     .local v14, "var":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);v14=(Null);v15=(Conflicted);
a=0;//     instance-of v15, v2, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_3
a=0;// 
a=0;//     move-object v13, v2
a=0;// 
a=0;//     .line 211
a=0;//     #v13=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v13, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     .line 212
a=0;//     .local v13, "v":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     invoke-interface {v13}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "arg":Ljava/lang/reflect/Type;
a=0;//     check-cast v2, Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 213
a=0;//     .restart local v2    # "arg":Ljava/lang/reflect/Type;
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 214
a=0;//     .end local v13    # "v":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :cond_3
a=0;//     #v13=(Conflicted);v15=(Boolean);
a=0;//     invoke-interface {v14}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 207
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 218
a=0;//     .end local v2    # "arg":Ljava/lang/reflect/Type;
a=0;//     .end local v14    # "var":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v14=(Conflicted);v15=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     invoke-static {v9, v0, v1}, Lcom/google/gson/reflect/TypeToken;->typeEquals(Ljava/lang/reflect/ParameterizedType;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_5
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     .end local v5    # "i":I
a=0;//     .end local v11    # "tArgs":[Ljava/lang/reflect/Type;
a=0;//     .end local v12    # "tParams":[Ljava/lang/reflect/TypeVariable;, "[Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);v11=(Conflicted);v12=(Conflicted);v15=(Boolean);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "arr$":[Ljava/lang/reflect/Type;
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v8, v3
a=0;// 
a=0;//     .local v8, "len$":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i$":I
a=0;//     :goto_3
a=0;//     #v6=(Integer);v7=(Conflicted);
a=0;//     if-ge v6, v8, :cond_7
a=0;// 
a=0;//     aget-object v7, v3, v6
a=0;// 
a=0;//     .line 224
a=0;//     .local v7, "itype":Ljava/lang/reflect/Type;
a=0;//     #v7=(Null);
a=0;//     new-instance v15, Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v15, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v7, v0, v15}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_6
a=0;// 
a=0;//     .line 225
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     :cond_6
a=0;//     #v15=(Boolean);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 230
a=0;//     .end local v7    # "itype":Ljava/lang/reflect/Type;
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 231
a=0;//     .local v10, "sType":Ljava/lang/reflect/Type;
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     new-instance v15, Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v15, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v10, v0, v15}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static matches(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z
a=0;//     .locals 1
a=0;//     .param p0, "from"    # Ljava/lang/reflect/Type;
a=0;//     .param p1, "to"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     .local p2, "typeMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/reflect/Type;>;"
a=0;//     invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p0, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     check-cast p0, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     .end local p0    # "from":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static typeEquals(Ljava/lang/reflect/ParameterizedType;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;//     .locals 6
a=0;//     .param p0, "from"    # Ljava/lang/reflect/ParameterizedType;
a=0;//     .param p1, "to"    # Ljava/lang/reflect/ParameterizedType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/ParameterizedType;",
a=0;//             "Ljava/lang/reflect/ParameterizedType;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "typeVarMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/reflect/Type;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 241
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 242
a=0;//     .local v0, "fromArgs":[Ljava/lang/reflect/Type;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 243
a=0;//     .local v2, "toArgs":[Ljava/lang/reflect/Type;
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_2
a=0;// 
a=0;//     .line 244
a=0;//     aget-object v4, v0, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v5, v2, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, v5, p2}, Lcom/google/gson/reflect/TypeToken;->matches(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 250
a=0;//     .end local v0    # "fromArgs":[Ljava/lang/reflect/Type;
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "toArgs":[Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Integer);v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     return v3
a=0;// 
a=0;//     .line 243
a=0;//     .restart local v0    # "fromArgs":[Ljava/lang/reflect/Type;
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "toArgs":[Ljava/lang/reflect/Type;
a=0;//     :cond_1
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);v1=(Integer);v2=(Reference,[Ljava/lang/reflect/Type;);v3=(Null);v4=(Boolean);v5=(Null);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_2
a=0;//     #v4=(Integer);v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final equals(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     instance-of v0, p1, Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast p1, Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     .end local p1    # "o":Ljava/lang/Object;
a=0;//     iget-object v1, p1, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v0, v1}, Lcom/google/gson/internal/$Gson$Types;->equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getRawType()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<-TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->rawType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getType()Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     iget v0, p0, Lcom/google/gson/reflect/TypeToken;->hashCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isAssignableFrom(Lcom/google/gson/reflect/TypeToken;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     .local p1, "token":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {p0, v0}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isAssignableFrom(Ljava/lang/Class;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     .local p1, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isAssignableFrom(Ljava/lang/reflect/Type;)Z
a=0;//     .locals 5
a=0;//     .param p1, "from"    # Ljava/lang/reflect/Type;
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 123
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 128
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->rawType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->rawType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/google/gson/reflect/TypeToken;->isAssignableFrom(Ljava/lang/reflect/Type;Ljava/lang/reflect/GenericArrayType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 140
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const-class v4, Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const-class v2, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/google/gson/reflect/TypeToken;->buildUnexpectedTypeError(Ljava/lang/reflect/Type;[Ljava/lang/Class;)Ljava/lang/AssertionError;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     .local p0, "this":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/reflect/TypeToken;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
