package com.j256.ormlite.android; class AndroidCompiledStatement { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/AndroidCompiledStatement;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AndroidCompiledStatement.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/android/AndroidCompiledStatement$1;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final NO_STRING_ARGS:[Ljava/lang/String;
a=0;// 
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private args:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private cursor:Landroid/database/Cursor;
a=0;// 
a=0;// .field private final db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;// .field private max:Ljava/lang/Integer;
a=0;// 
a=0;// .field private final sql:Ljava/lang/String;
a=0;// 
a=0;// .field private final type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const-class v0, Lcom/j256/ormlite/android/AndroidCompiledStatement;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->NO_STRING_ARGS:[Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;//     .locals 0
a=0;//     .param p1, "sql"    # Ljava/lang/String;
a=0;//     .param p2, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p3, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidCompiledStatement;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->sql:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static execSql(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
a=0;//     .locals 6
a=0;//     .param p0, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p1, "label"    # Ljava/lang/String;
a=0;//     .param p2, "finalSql"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 188
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 191
a=0;//     .local v2, "stmt":Landroid/database/sqlite/SQLiteStatement;
a=0;//     :try_start_1
a=0;//     #v2=(Null);
a=0;//     const-string v3, "SELECT CHANGES()"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 192
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteStatement;);
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J
a=0;//     :try_end_1
a=0;//     .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     long-to-int v1, v3
a=0;// 
a=0;//     .line 197
a=0;//     .local v1, "result":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v3, Lcom/j256/ormlite/android/AndroidCompiledStatement;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v4, "executing statement {} changed {} rows: {}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3, v4, p1, v5, p2}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 202
a=0;//     return v1
a=0;// 
a=0;//     .line 184
a=0;//     .end local v1    # "result":I
a=0;//     .end local v2    # "stmt":Landroid/database/sqlite/SQLiteStatement;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Problems executing "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " Android statement: "
a=0;// 
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
a=0;//     invoke-static {v3, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 193
a=0;//     .end local v0    # "e":Landroid/database/SQLException;
a=0;//     .restart local v2    # "stmt":Landroid/database/sqlite/SQLiteStatement;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Reference,Landroid/database/sqlite/SQLiteStatement;);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 195
a=0;//     .restart local v0    # "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 197
a=0;//     .restart local v1    # "result":I
a=0;//     #v1=(One);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     .end local v0    # "e":Landroid/database/SQLException;
a=0;//     .end local v1    # "result":I
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     :cond_1
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method private getArgArray()[Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->NO_STRING_ARGS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getStringArray()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->NO_STRING_ARGS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 225
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isInPrep()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Query already run. Cannot add argument values."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 209
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 84
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     const-string v1, "Problems closing Android cursor"
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public closeQuietly()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getColumnCount()I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getColumnCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getColumnName(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "column"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCursor()Landroid/database/Cursor;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     .local v1, "finalSql":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->max:Ljava/lang/Integer;
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->sql:Ljava/lang/String;
a=0;// 
a=0;//     .line 162
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->getStringArray()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 164
a=0;//     sget-object v2, Lcom/j256/ormlite/android/AndroidCompiledStatement;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v3, "{}: started rawQuery cursor for: {}"
a=0;// 
a=0;//     invoke-virtual {v2, v3, p0, v1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 170
a=0;//     .end local v1    # "finalSql":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 160
a=0;//     .restart local v1    # "finalSql":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Null);v3=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->sql:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->max:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 165
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 166
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Problems executing Android query: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public runExecute()I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->isOkForExecute()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Cannot call execute on a "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " statement"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "runExecute"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->sql:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->getArgArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->execSql(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public runQuery(Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .locals 3
a=0;//     .param p1, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->isOkForQuery()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Cannot call query on a "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " statement"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {v0, v1, p1}, Lcom/j256/ormlite/android/AndroidDatabaseResults;-><init>(Landroid/database/Cursor;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public runUpdate()I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->isOkForUpdate()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Cannot call update on a "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " statement"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->max:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->sql:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "finalSql":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "runUpdate"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->getArgArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2, v0, v3}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->execSql(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 68
a=0;//     .end local v0    # "finalSql":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/Integer;);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->sql:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->max:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "finalSql":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setMaxRows(I)V
a=0;//     .locals 1
a=0;//     .param p1, "max"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->isInPrep()V
a=0;// 
a=0;//     .line 139
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->max:Ljava/lang/Integer;
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setObject(ILjava/lang/Object;Lcom/j256/ormlite/field/SqlType;)V
a=0;//     .locals 3
a=0;//     .param p1, "parameterIndex"    # I
a=0;//     .param p2, "obj"    # Ljava/lang/Object;
a=0;//     .param p3, "sqlType"    # Lcom/j256/ormlite/field/SqlType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->isInPrep()V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 135
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidCompiledStatement$1;->$SwitchMap$com$j256$ormlite$field$SqlType:[I
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/field/SqlType;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Unknown sql argument type: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 120
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidCompiledStatement;->args:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Invalid Android type: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 108
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setQueryTimeout(J)V
a=0;//     .locals 0
a=0;//     .param p1, "millis"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "@"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
