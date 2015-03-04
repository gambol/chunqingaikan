package com.j256.ormlite.table; class DatabaseTableConfigLoader { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/table/DatabaseTableConfigLoader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DatabaseTableConfigLoader.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CONFIG_FILE_END_MARKER:Ljava/lang/String; = "# --table-end--"
a=0;// 
a=0;// .field private static final CONFIG_FILE_FIELDS_END:Ljava/lang/String; = "# --table-fields-end--"
a=0;// 
a=0;// .field private static final CONFIG_FILE_FIELDS_START:Ljava/lang/String; = "# --table-fields-start--"
a=0;// 
a=0;// .field private static final CONFIG_FILE_START_MARKER:Ljava/lang/String; = "# --table-start--"
a=0;// 
a=0;// .field private static final FIELD_NAME_DATA_CLASS:Ljava/lang/String; = "dataClass"
a=0;// 
a=0;// .field private static final FIELD_NAME_TABLE_NAME:Ljava/lang/String; = "tableName"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfigLoader;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static fromReader(Ljava/io/BufferedReader;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .locals 8
a=0;//     .param p0, "reader"    # Ljava/io/BufferedReader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/io/BufferedReader;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     new-instance v1, Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-direct {v1}, Lcom/j256/ormlite/table/DatabaseTableConfig;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v1, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "anything":Z
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 56
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 84
a=0;//     .end local v1    # "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 53
a=0;//     .end local v3    # "line":Ljava/lang/String;
a=0;//     .restart local v1    # "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 54
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     const-string v5, "Could not read DatabaseTableConfig from stream"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 60
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     .restart local v3    # "line":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     const-string v5, "# --table-end--"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     const-string v5, "# --table-fields-start--"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 65
a=0;//     invoke-static {p0, v1}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->readFields(Ljava/io/BufferedReader;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_3
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     const-string v5, "#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     const-string v5, "# --table-start--"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-virtual {v3, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 73
a=0;//     .local v4, "parts":[Ljava/lang/String;
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-eq v5, v6, :cond_4
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v5, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "DatabaseTableConfig reading from stream cannot parse line: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 76
a=0;//     :cond_4
a=0;//     #v5=(Integer);v6=(PosByte);v7=(Uninit);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aget-object v5, v4, v5
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget-object v6, v4, v6
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v1, v5, v6}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->readTableField(Lcom/j256/ormlite/table/DatabaseTableConfig;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     .end local v4    # "parts":[Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static loadDatabaseConfigFromReader(Ljava/io/BufferedReader;)Ljava/util/List;
a=0;//     .locals 2
a=0;//     .param p0, "reader"    # Ljava/io/BufferedReader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/BufferedReader;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     .local v1, "list":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/table/DatabaseTableConfig<*>;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p0}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->fromReader(Ljava/io/BufferedReader;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     return-object v1
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static readFields(Ljava/io/BufferedReader;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 5
a=0;//     .param p0, "reader"    # Ljava/io/BufferedReader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/io/BufferedReader;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     .local p1, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 156
a=0;//     .local v2, "fields":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/util/ArrayList;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 160
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v4, "# --table-fields-end--"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/table/DatabaseTableConfig;->setFieldConfigs(Ljava/util/List;)V
a=0;// 
a=0;//     .line 170
a=0;//     return-void
a=0;// 
a=0;//     .line 157
a=0;//     .end local v3    # "line":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v4, "Could not read next field from config file"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     throw v4
a=0;// 
a=0;//     .line 163
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .restart local v3    # "line":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Boolean);
a=0;//     invoke-static {p0}, Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;->fromReader(Ljava/io/BufferedReader;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 164
a=0;//     .local v1, "fieldConfig":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static readTableField(Lcom/j256/ormlite/table/DatabaseTableConfig;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "field"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     .local p0, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const-string v2, "dataClass"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     :try_start_0
a=0;//     invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 139
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->setDataClass(Ljava/lang/Class;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 146
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 141
a=0;//     .local v1, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v1=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Unknown class specified for dataClass: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 143
a=0;//     .end local v1    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v2, "tableName"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p0, p2}, Lcom/j256/ormlite/table/DatabaseTableConfig;->setTableName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static write(Ljava/io/BufferedWriter;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 2
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/io/BufferedWriter;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     .local p1, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     :try_start_0
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->writeConfig(Ljava/io/BufferedWriter;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "Could not write config to writer"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static writeConfig(Ljava/io/BufferedWriter;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 5
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/io/BufferedWriter;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const/16 v4, 0x3d
a=0;// 
a=0;//     .line 108
a=0;//     #v4=(PosByte);
a=0;//     const-string v2, "# --table-start--"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     const-string v2, "dataClass"
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 115
a=0;//     const-string v2, "tableName"
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 118
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     const-string v2, "# --table-fields-start--"
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getFieldConfigs()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getFieldConfigs()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "field":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;->write(Ljava/io/BufferedWriter;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     .end local v0    # "field":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .end local v1    # "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v2, "# --table-fields-end--"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 127
a=0;//     const-string v2, "# --table-end--"
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
}}
