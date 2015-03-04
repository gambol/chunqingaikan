package com.j256.ormlite.android; class AndroidDatabaseConnection { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AndroidDatabaseConnection.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/android/AndroidDatabaseConnection$1;,
a=0;//         Lcom/j256/ormlite/android/AndroidDatabaseConnection$OurSavePoint;
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
a=0;// .field private final db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;// .field private final readWrite:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const-class v0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 30
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->NO_STRING_ARGS:[Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "readWrite"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 37
a=0;//     iput-boolean p2, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->readWrite:Z
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "{}: db {} opened, read-write = {}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0, v1, p0, p1, v2}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private bindArgs(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 6
a=0;//     .param p1, "stmt"    # Landroid/database/sqlite/SQLiteStatement;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 347
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 307
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 308
a=0;//     aget-object v0, p2, v1
a=0;// 
a=0;//     .line 309
a=0;//     .local v0, "arg":Ljava/lang/Object;
a=0;//     #v0=(Null);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 310
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/database/sqlite/SQLiteStatement;->bindNull(I)V
a=0;// 
a=0;//     .line 307
a=0;//     .end local v0    # "arg":Ljava/lang/Object;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 312
a=0;//     .restart local v0    # "arg":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     aget-object v3, p3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 313
a=0;//     .local v2, "sqlType":Lcom/j256/ormlite/field/SqlType;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     sget-object v3, Lcom/j256/ormlite/android/AndroidDatabaseConnection$1;->$SwitchMap$com$j256$ormlite$field$SqlType:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/SqlType;->ordinal()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v3, v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 343
a=0;//     new-instance v3, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Unknown sql argument type: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 317
a=0;//     :pswitch_0
a=0;//     #v3=(Integer);v4=(Integer);v5=(Conflicted);
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 324
a=0;//     :pswitch_1
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     .end local v0    # "arg":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {p1, v3, v4, v5}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 328
a=0;//     .restart local v0    # "arg":Ljava/lang/Object;
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v4=(Integer);v5=(Conflicted);
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     .end local v0    # "arg":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-virtual {p1, v3, v4, v5}, Landroid/database/sqlite/SQLiteStatement;->bindDouble(ID)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 332
a=0;//     .restart local v0    # "arg":Ljava/lang/Object;
a=0;//     :pswitch_3
a=0;//     #v0=(Null);v4=(Integer);v5=(Conflicted);
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .end local v0    # "arg":Ljava/lang/Object;
a=0;//     #v0=(Reference,[B);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     invoke-virtual {p1, v3, v0}, Landroid/database/sqlite/SQLiteStatement;->bindBlob(I[B)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 340
a=0;//     .restart local v0    # "arg":Ljava/lang/Object;
a=0;//     :pswitch_4
a=0;//     #v0=(Null);
a=0;//     new-instance v3, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Invalid Android type: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 313
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private toStrings([Ljava/lang/Object;)[Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 350
a=0;//     #v3=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 363
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,[Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 353
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Integer);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/String;
a=0;// 
a=0;//     .line 354
a=0;//     .local v2, "strings":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_1
a=0;// 
a=0;//     .line 355
a=0;//     aget-object v0, p1, v1
a=0;// 
a=0;//     .line 356
a=0;//     .local v0, "arg":Ljava/lang/Object;
a=0;//     #v0=(Null);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 357
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     .line 354
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 359
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private update(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)I
a=0;//     .locals 6
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "label"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     .local v2, "stmt":Landroid/database/sqlite/SQLiteStatement;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v3, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 277
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteStatement;);
a=0;//     invoke-direct {p0, v2, p2, p3}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->bindArgs(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->execute()V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 282
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "SELECT CHANGES()"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J
a=0;//     :try_end_1
a=0;//     .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     long-to-int v1, v3
a=0;// 
a=0;//     .line 295
a=0;//     .local v1, "result":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     .line 299
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v3, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v4, "{} statement is compiled and executed, changed {}: {}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3, v4, p4, v5, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 300
a=0;//     return v1
a=0;// 
a=0;//     .line 279
a=0;//     .end local v1    # "result":I
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 280
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "updating database failed: "
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
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 282
a=0;//     .end local v0    # "e":Landroid/database/SQLException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :cond_2
a=0;//     throw v3
a=0;// 
a=0;//     .line 291
a=0;//     :catch_1
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 293
a=0;//     .restart local v0    # "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 295
a=0;//     .restart local v1    # "result":I
a=0;//     #v1=(One);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 295
a=0;//     .end local v0    # "e":Landroid/database/SQLException;
a=0;//     .end local v1    # "result":I
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 236
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: db {} closed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1, v2, p0, v3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// 
a=0;//     .line 237
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 238
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     const-string v1, "problems closing the database connection"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
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
a=0;//     .line 244
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 248
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 245
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public commit(Ljava/sql/Savepoint;)V
a=0;//     .locals 4
a=0;//     .param p1, "savepoint"    # Ljava/sql/Savepoint;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     .line 94
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: transaction is successfuly ended"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: transaction {} is successfuly ended"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0, v3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "problems commiting transaction "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .locals 3
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     new-instance v0, Lcom/j256/ormlite/android/AndroidCompiledStatement;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/android/AndroidCompiledStatement;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-direct {v0, p1, v1, p2}, Lcom/j256/ormlite/android/AndroidCompiledStatement;-><init>(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/AndroidCompiledStatement;);
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: compiled statement got {}: {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0, v0, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 125
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;I)Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .locals 1
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "resultFlags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public delete(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)I
a=0;//     .locals 1
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     const-string v0, "deleted"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->update(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public executeStatement(Ljava/lang/String;I)I
a=0;//     .locals 2
a=0;//     .param p1, "statementStr"    # Ljava/lang/String;
a=0;//     .param p2, "resultFlags"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->NO_STRING_ARGS:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {v0, p1, p1, v1}, Lcom/j256/ormlite/android/AndroidCompiledStatement;->execSql(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public insert(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/GeneratedKeyHolder;)I
a=0;//     .locals 8
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "keyHolder"    # Lcom/j256/ormlite/support/GeneratedKeyHolder;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     .local v4, "stmt":Landroid/database/sqlite/SQLiteStatement;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v5=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v5, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 139
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteStatement;);
a=0;//     invoke-direct {p0, v4, p2, p3}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->bindArgs(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 141
a=0;//     .local v2, "rowId":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {p4, v5}, Lcom/j256/ormlite/support/GeneratedKeyHolder;->addKey(Ljava/lang/Number;)V
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 149
a=0;//     .local v1, "result":I
a=0;//     #v1=(One);
a=0;//     sget-object v5, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v6, "{}: insert statement is compiled and executed, changed {}: {}"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v6, p0, v7, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 154
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     :cond_1
a=0;//     return v1
a=0;// 
a=0;//     .line 151
a=0;//     .end local v1    # "result":I
a=0;//     .end local v2    # "rowId":J
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "inserting to database failed: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 154
a=0;//     .end local v0    # "e":Landroid/database/SQLException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public isAutoCommit()Z
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 48
a=0;//     .local v1, "inTransaction":Z
a=0;//     #v1=(Boolean);
a=0;//     sget-object v2, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v3, "{}: in transaction is {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v3, p0, v4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 50
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     .end local v1    # "inTransaction":Z
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     const-string v2, "problems getting auto-commit from database"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public isAutoCommitSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isClosed()Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 253
a=0;//     .local v1, "isOpen":Z
a=0;//     #v1=(Boolean);
a=0;//     sget-object v2, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v3, "{}: db {} isOpen returned {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v3, p0, v4, v5}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 254
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     .end local v1    # "isOpen":Z
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 256
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     const-string v2, "problems detecting if the database is closed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public isReadWrite()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->readWrite:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isTableExists(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = \'"
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
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 264
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 265
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 269
a=0;//     .local v1, "result":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     sget-object v2, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "{}: isTableExists \'{}\' returned {}"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v3, p0, p1, v4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 270
a=0;//     return v1
a=0;// 
a=0;//     .line 267
a=0;//     .end local v1    # "result":Z
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Conflicted);v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "result":Z
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryForLong(Ljava/lang/String;)J
a=0;//     .locals 7
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     .local v3, "stmt":Landroid/database/sqlite/SQLiteStatement;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v4, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 199
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteStatement;);
a=0;//     invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 200
a=0;//     .local v1, "result":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sget-object v4, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v5, "{}: query for long simple query returned {}: {}"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v4, v5, p0, v6, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 205
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 202
a=0;//     .end local v1    # "result":J
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "queryForLong from database failed: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     throw v4
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 205
a=0;//     .end local v0    # "e":Landroid/database/SQLException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->close()V
a=0;// 
a=0;//     :cond_1
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public queryForLong(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)J
a=0;//     .locals 8
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v5=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-direct {p0, p2}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->toStrings([Ljava/lang/Object;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v5, p1, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 215
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     new-instance v4, Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v4, v0, v5}, Lcom/j256/ormlite/android/AndroidDatabaseResults;-><init>(Landroid/database/Cursor;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 217
a=0;//     .local v4, "results":Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 222
a=0;//     .local v2, "result":J
a=0;//     :goto_0
a=0;//     #v2=(LongLo);v3=(LongHi);v5=(Boolean);
a=0;//     sget-object v5, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v6, "{}: query for long raw query returned {}: {}"
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v5, v6, p0, v7, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 227
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 220
a=0;//     .end local v2    # "result":J
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Boolean);v7=(Uninit);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "result":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     .end local v2    # "result":J
a=0;//     .end local v4    # "results":Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 225
a=0;//     .local v1, "e":Landroid/database/SQLException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "queryForLong from database failed: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 227
a=0;//     .end local v1    # "e":Landroid/database/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 228
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public queryForOne(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p5, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Object;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
a=0;//             "Ljava/lang/Object;"
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
a=0;//     .line 171
a=0;//     .local p4, "rowMapper":Lcom/j256/ormlite/stmt/GenericRowMapper;, "Lcom/j256/ormlite/stmt/GenericRowMapper<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-direct {p0, p2}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->toStrings([Ljava/lang/Object;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v4, p1, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     new-instance v3, Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     invoke-direct {v3, v0, p5}, Lcom/j256/ormlite/android/AndroidDatabaseResults;-><init>(Landroid/database/Cursor;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 175
a=0;//     .local v3, "results":Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;//     #v3=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     sget-object v4, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v5, "{}: queried for one result: {}"
a=0;// 
a=0;//     invoke-virtual {v4, v5, p0, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->first()Z
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     #v2=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 179
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     invoke-interface {p4, v3}, Lcom/j256/ormlite/stmt/GenericRowMapper;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 180
a=0;//     .local v2, "first":Ljava/lang/Object;, "TT;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->next()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 181
a=0;//     sget-object v2, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->MORE_THAN_ONE:Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 189
a=0;//     .end local v2    # "first":Ljava/lang/Object;, "TT;"
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     .restart local v2    # "first":Ljava/lang/Object;, "TT;"
a=0;//     :cond_2
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     .end local v2    # "first":Ljava/lang/Object;, "TT;"
a=0;//     .end local v3    # "results":Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 187
a=0;//     .local v1, "e":Landroid/database/SQLException;
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "queryForOne from database failed: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     throw v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 189
a=0;//     .end local v1    # "e":Landroid/database/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 190
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public rollback(Ljava/sql/Savepoint;)V
a=0;//     .locals 4
a=0;//     .param p1, "savepoint"    # Ljava/sql/Savepoint;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     .line 108
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: transaction is ended, unsuccessfuly"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 116
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: transaction {} is ended, unsuccessfuly"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0, v3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "problems rolling back transaction "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setAutoCommit(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "autoCommit"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSavePoint(Ljava/lang/String;)Ljava/sql/Savepoint;
a=0;//     .locals 3
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     .line 76
a=0;//     sget-object v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "{}: save-point set with name {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection$OurSavePoint;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseConnection$OurSavePoint;);
a=0;//     invoke-direct {v1, p1}, Lcom/j256/ormlite/android/AndroidDatabaseConnection$OurSavePoint;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection$OurSavePoint;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 78
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "e":Landroid/database/SQLException;
a=0;//     #v0=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "problems beginning transaction "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
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
a=0;// 
a=0;// .method public update(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)I
a=0;//     .locals 1
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     const-string v0, "updated"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;->update(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
