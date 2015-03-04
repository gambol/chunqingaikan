package com.j256.ormlite.field; class DataPersisterManager { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/DataPersisterManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DataPersisterManager.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_ENUM_PERSISTER:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;// .field private static final builtInMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/field/DataPersister;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static registeredPersisters:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DataPersister;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-static {}, Lcom/j256/ormlite/field/types/EnumStringType;->getSingleton()Lcom/j256/ormlite/field/types/EnumStringType;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Lcom/j256/ormlite/field/types/EnumStringType;);
a=0;//     sput-object v11, Lcom/j256/ormlite/field/DataPersisterManager;->DEFAULT_ENUM_PERSISTER:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .line 23
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     sput-object v11, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v11, Ljava/util/HashMap;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v11}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v11, Lcom/j256/ormlite/field/DataPersisterManager;->builtInMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-static {}, Lcom/j256/ormlite/field/DataType;->values()[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/DataType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/DataType;);
a=0;//     array-length v8, v0
a=0;// 
a=0;//     .local v8, "len$":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i$":I
a=0;//     #v6=(Null);
a=0;//     move v7, v6
a=0;// 
a=0;//     .end local v0    # "arr$":[Lcom/j256/ormlite/field/DataType;
a=0;//     .end local v6    # "i$":I
a=0;//     .end local v8    # "len$":I
a=0;//     .local v7, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Integer);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     if-ge v7, v8, :cond_2
a=0;// 
a=0;//     aget-object v5, v0, v7
a=0;// 
a=0;//     .line 29
a=0;//     .local v5, "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/field/DataType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 30
a=0;//     .local v10, "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     invoke-interface {v10}, Lcom/j256/ormlite/field/DataPersister;->getAssociatedClasses()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "arr$":[Ljava/lang/Class;
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v9, v1
a=0;// 
a=0;//     .local v9, "len$":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .end local v7    # "i$":I
a=0;//     .restart local v6    # "i$":I
a=0;//     :goto_1
a=0;//     if-ge v6, v9, :cond_0
a=0;// 
a=0;//     aget-object v4, v1, v6
a=0;// 
a=0;//     .line 32
a=0;//     .local v4, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v4=(Null);
a=0;//     sget-object v11, Lcom/j256/ormlite/field/DataPersisterManager;->builtInMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 31
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 34
a=0;//     .end local v4    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v10}, Lcom/j256/ormlite/field/DataPersister;->getAssociatedClassNames()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 35
a=0;//     .local v2, "associatedClassNames":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     invoke-interface {v10}, Lcom/j256/ormlite/field/DataPersister;->getAssociatedClassNames()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "arr$":[Ljava/lang/String;
a=0;//     array-length v9, v1
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     if-ge v6, v9, :cond_1
a=0;// 
a=0;//     aget-object v3, v1, v6
a=0;// 
a=0;//     .line 37
a=0;//     .local v3, "className":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     sget-object v11, Lcom/j256/ormlite/field/DataPersisterManager;->builtInMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v11, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 36
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 28
a=0;//     .end local v1    # "arr$":[Ljava/lang/String;
a=0;//     .end local v2    # "associatedClassNames":[Ljava/lang/String;
a=0;//     .end local v3    # "className":Ljava/lang/String;
a=0;//     .end local v6    # "i$":I
a=0;//     .end local v9    # "len$":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v6, v7, 0x1
a=0;// 
a=0;//     .restart local v6    # "i$":I
a=0;//     move v7, v6
a=0;// 
a=0;//     .end local v6    # "i$":I
a=0;//     .restart local v7    # "i$":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 42
a=0;//     .end local v5    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     .end local v10    # "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/DataPersisterManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static lookupForField(Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DataPersister;
a=0;//     .locals 9
a=0;//     .param p0, "field"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     sget-object v7, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v7, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .line 80
a=0;//     .local v6, "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     invoke-interface {v6, p0}, Lcom/j256/ormlite/field/DataPersister;->isValidForField(Ljava/lang/reflect/Field;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 109
a=0;//     .end local v6    # "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 84
a=0;//     .restart local v6    # "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Reference,Ljava/util/Iterator;);v7=(Boolean);v8=(Uninit);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/field/DataPersister;->getAssociatedClasses()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/Class;
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     .local v5, "len$":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i$":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);v7=(Conflicted);
a=0;//     if-ge v4, v5, :cond_0
a=0;// 
a=0;//     aget-object v1, v0, v4
a=0;// 
a=0;//     .line 85
a=0;//     .local v1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v7, v1, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     .end local v0    # "arr$":[Ljava/lang/Class;
a=0;//     .end local v1    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v4    # "i$":I
a=0;//     .end local v5    # "len$":I
a=0;//     .end local v6    # "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v7, Lcom/j256/ormlite/field/DataPersisterManager;->builtInMap:Ljava/util/Map;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Map;);
a=0;//     invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .line 94
a=0;//     .local v2, "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move-object v6, v2
a=0;// 
a=0;//     .line 95
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Class;->isEnum()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 103
a=0;//     sget-object v6, Lcom/j256/ormlite/field/DataPersisterManager;->DEFAULT_ENUM_PERSISTER:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs registerDataPersisters([Lcom/j256/ormlite/field/DataPersister;)V
a=0;//     .locals 6
a=0;//     .param p0, "dataPersisters"    # [Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     .local v3, "newList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v5, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     sget-object v5, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/DataPersister;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     aget-object v4, v0, v1
a=0;// 
a=0;//     .line 58
a=0;//     .local v4, "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 57
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     .end local v4    # "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     sput-object v3, Lcom/j256/ormlite/field/DataPersisterManager;->registeredPersisters:Ljava/util/List;
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
}}
