package com.twocloo.com.cn.db; class RecodeHistoryTable { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// .super Lcom/twocloo/com/cn/db/BaseDBAccess;
a=0;// .source "RecodeHistoryTable.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DB_CREATE:Ljava/lang/String; = "CREATE TABLE recodehistory (_id integer primary key autoincrement,KEY_uid text,articleid text , tid text , KEY_sync integer);"
a=0;// 
a=0;// .field public static final KEY_ID:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field public static final KEY_Uid:Ljava/lang/String; = "KEY_uid"
a=0;// 
a=0;// .field public static final KEY_articleid:Ljava/lang/String; = "articleid"
a=0;// 
a=0;// .field public static final KEY_hasSync:Ljava/lang/String; = "KEY_sync"
a=0;// 
a=0;// .field public static final KEY_textid:Ljava/lang/String; = "tid"
a=0;// 
a=0;// .field public static final Table_Bookmulu:Ljava/lang/String; = "recodehistory"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/db/BaseDBAccess;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public insertRecode(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
a=0;//     .locals 10
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "hasSync"    # I
a=0;//     .param p4, "tid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 100
a=0;//     #v3=(Byte);
a=0;//     new-instance v4, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 101
a=0;//     .local v4, "newValues":Landroid/content/ContentValues;
a=0;//     #v4=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v6, "KEY_uid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     invoke-virtual {v4, v6, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 103
a=0;//     const-string v6, "tid"
a=0;// 
a=0;//     invoke-virtual {v4, v6, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     const-string v6, "KEY_sync"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v4, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 105
a=0;//     sget-object v6, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v6, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v6, v7}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sput-object v6, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     sget-object v6, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v7, "recodehistory"
a=0;// 
a=0;//     invoke-virtual {v6, v7, v9, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "a":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v6, -0x1
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v0, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "select _id from recodehistory where KEY_uid=\'"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\' and "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "=\'"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 111
a=0;//     const-string v7, "\' and "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "tid"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "=\'"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\'"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 112
a=0;//     .local v5, "string":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "sql:"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     sget-object v6, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v6, v5, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 114
a=0;//     .local v2, "c":Landroid/database/Cursor;
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 121
a=0;//     .end local v2    # "c":Landroid/database/Cursor;
a=0;//     .end local v5    # "string":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public insertRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "sync"    # I
a=0;//     .param p4, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "KEY_uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     const-string v1, "articleid"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 135
a=0;//     const-string v1, "tid"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 136
a=0;//     const-string v1, "KEY_sync"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 137
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "recodehistory"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     .line 142
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 172
a=0;//     .local v2, "orderedTextIds":Ljava/lang/StringBuffer;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     new-instance v4, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v5}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sput-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "select * from recodehistory where KEY_uid="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " and "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 177
a=0;//     .local v3, "sql":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 185
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ","
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 192
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 193
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sput-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 197
a=0;//     .end local v0    # "cursor":Landroid/database/Cursor;
a=0;//     .end local v3    # "sql":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 179
a=0;//     .restart local v0    # "cursor":Landroid/database/Cursor;
a=0;//     .restart local v3    # "sql":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Null);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     :try_start_3
a=0;//     #v4=(PosByte);
a=0;//     invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 180
a=0;//     const-string v4, ","
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     .end local v0    # "cursor":Landroid/database/Cursor;
a=0;//     .end local v3    # "sql":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 190
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 192
a=0;//     :try_start_5
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 193
a=0;//     sget-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sput-object v4, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 169
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .end local v2    # "orderedTextIds":Ljava/lang/StringBuffer;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v4
a=0;// 
a=0;//     .line 191
a=0;//     .restart local v2    # "orderedTextIds":Ljava/lang/StringBuffer;
a=0;//     :catchall_1
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 192
a=0;//     :try_start_6
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v5=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     sget-object v5, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 193
a=0;//     sget-object v5, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v5=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sput-object v5, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 196
a=0;//     throw v4
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public queryUnSyncToServerForOldVersion(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 7
a=0;//     .param p1, "bookid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/UnLoginRecode;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v1, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/UnLoginRecode;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "select * from recodehistory where KEY_sync=0 and KEY_uid="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 49
a=0;//     .local v2, "sql":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v3, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 60
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Null);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 55
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v3=(Boolean);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/beans/UnLoginRecode;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/beans/UnLoginRecode;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v3, v4, p1, v5, v6}, Lcom/twocloo/com/cn/beans/UnLoginRecode;-><init>(ILjava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/UnLoginRecode;);
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public updateRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
a=0;//     .locals 6
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "sync"    # I
a=0;//     .param p4, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "tid"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     const-string v1, "KEY_sync"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 159
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "recodehistory"
a=0;// 
a=0;//     const-string v3, "KEY_uid =? and articleid =?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aput-object p2, v4, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public updateSync(I)V
a=0;//     .locals 5
a=0;//     .param p1, "_id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     .local v1, "values":Landroid/content/ContentValues;
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "KEY_sync"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "update recodehistory set KEY_sync=1 where _id="
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "sql":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "updateSync:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
}}
