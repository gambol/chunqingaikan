package com.twocloo.com.cn.db; class UserBookTable { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/db/UserBookTable;
a=0;// .super Lcom/twocloo/com/cn/db/BaseDBAccess;
a=0;// .source "UserBookTable.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DB_CREATE:Ljava/lang/String; = "CREATE TABLE hdbook (_id integer primary key autoincrement, articleid text , isVip integer ,uid text);"
a=0;// 
a=0;// .field public static final KEY_ID:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field public static final KEY_articleid:Ljava/lang/String; = "articleid"
a=0;// 
a=0;// .field public static final KEY_isVip:Ljava/lang/String; = "isVip"
a=0;// 
a=0;// .field public static final KEY_uid:Ljava/lang/String; = "uid"
a=0;// 
a=0;// .field public static final Table_tbName:Ljava/lang/String; = "hdbook"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/db/BaseDBAccess;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/UserBookTable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/db/BaseDBAccess;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/UserBookTable;);
a=0;//     sput-object p2, Lcom/twocloo/com/cn/db/BaseDBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public exitBook(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;//     .locals 10
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/UserBookTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "hdbook"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const-string v3, "_id"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v9
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "articleid=\'"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, "\' and uid=\'"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, "\' and isvip="
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 44
a=0;//     .local v8, "cursor":Landroid/database/Cursor;
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v9=(Boolean);
a=0;//     return v9
a=0;// 
a=0;//     .line 46
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v9=(Null);
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 47
a=0;//     .local v9, "fla":Z
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public insert(Ljava/lang/String;Ljava/lang/String;I)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "articleid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "isVip"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/UserBookTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "hdbook"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
}}
