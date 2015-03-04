package com.twocloo.com.cn.db; class DBAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// .super Lcom/twocloo/com/cn/db/BaseDBAccess;
a=0;// .source "DBAdapter.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DB_BF:Ljava/lang/String; = "booksf"
a=0;// 
a=0;// .field public static final DB_CREATE:Ljava/lang/String; = "CREATE TABLE booksf (_id integer primary key autoincrement, articleid text , bookURL text ,bookFile text ,imgFile text ,uid text ,lasttime integer ,lastuptime integer ,hasupdate integer ,finishFlag integer ,title text ,isFromWeb text,author text,updatenumber integer,source text,isFence integer);"
a=0;// 
a=0;// .field public static final DB_CREATE_GX:Ljava/lang/String; = "CREATE TABLE bookuser (_id integer primary key autoincrement, articleid text ,isvip integer ,uid text);"
a=0;// 
a=0;// .field public static final DB_GX:Ljava/lang/String; = "bookuser"
a=0;// 
a=0;// .field public static final DB_SEARCH_HISTROY:Ljava/lang/String; = "searchhistroy"
a=0;// 
a=0;// .field public static final DB_SEARCH_HISTROY_CREATE:Ljava/lang/String; = "CREATE TABLE searchhistroy (_id integer primary key autoincrement, uid text , content text , time text );"
a=0;// 
a=0;// .field public static final DB_SQ:Ljava/lang/String; = "booksq"
a=0;// 
a=0;// .field public static final DB_TABLE_SQ:Ljava/lang/String; = "CREATE TABLE booksq (_id integer primary key autoincrement, articleid text , textid text ,texttitle text ,textjj text ,time integer ,isd integer ,isv integer ,length integer ,location integer);"
a=0;// 
a=0;// .field public static final KEY_ID:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field public static final KEY_IMEI:Ljava/lang/String; = "imei"
a=0;// 
a=0;// .field public static final KEY_ISFENCE:Ljava/lang/String; = "isFence"
a=0;// 
a=0;// .field public static final KEY_ISFROMWEB:Ljava/lang/String; = "isFromWeb"
a=0;// 
a=0;// .field public static final KEY_MODEL:Ljava/lang/String; = "model"
a=0;// 
a=0;// .field public static final KEY_SCREENPIX:Ljava/lang/String; = "screenpix"
a=0;// 
a=0;// .field public static final KEY_SOURCE:Ljava/lang/String; = "source"
a=0;// 
a=0;// .field public static final KEY_articleid:Ljava/lang/String; = "articleid"
a=0;// 
a=0;// .field public static final KEY_author:Ljava/lang/String; = "author"
a=0;// 
a=0;// .field public static final KEY_bookFile:Ljava/lang/String; = "bookFile"
a=0;// 
a=0;// .field public static final KEY_bookURL:Ljava/lang/String; = "bookURL"
a=0;// 
a=0;// .field public static final KEY_content:Ljava/lang/String; = "content"
a=0;// 
a=0;// .field public static final KEY_finishFlag:Ljava/lang/String; = "finishFlag"
a=0;// 
a=0;// .field public static final KEY_hasupdate:Ljava/lang/String; = "hasupdate"
a=0;// 
a=0;// .field public static final KEY_hasupdateNumber:Ljava/lang/String; = "updatenumber"
a=0;// 
a=0;// .field public static final KEY_imgFile:Ljava/lang/String; = "imgFile"
a=0;// 
a=0;// .field public static final KEY_isD:Ljava/lang/String; = "isd"
a=0;// 
a=0;// .field public static final KEY_isVip:Ljava/lang/String; = "isv"
a=0;// 
a=0;// .field public static final KEY_isvip1:Ljava/lang/String; = "isvip"
a=0;// 
a=0;// .field public static final KEY_lasttime:Ljava/lang/String; = "lasttime"
a=0;// 
a=0;// .field public static final KEY_lastuptime:Ljava/lang/String; = "lastuptime"
a=0;// 
a=0;// .field public static final KEY_length:Ljava/lang/String; = "length"
a=0;// 
a=0;// .field public static final KEY_location:Ljava/lang/String; = "location"
a=0;// 
a=0;// .field public static final KEY_textid:Ljava/lang/String; = "textid"
a=0;// 
a=0;// .field public static final KEY_textjj:Ljava/lang/String; = "textjj"
a=0;// 
a=0;// .field public static final KEY_texttitle:Ljava/lang/String; = "texttitle"
a=0;// 
a=0;// .field public static final KEY_time:Ljava/lang/String; = "time"
a=0;// 
a=0;// .field public static final KEY_title:Ljava/lang/String; = "title"
a=0;// 
a=0;// .field public static final KEY_userid:Ljava/lang/String; = "uid"
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
a=0;//     .line 94
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/db/BaseDBAccess;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 95
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private convertToBook(Landroid/database/Cursor;)Ljava/util/ArrayList;
a=0;//     .locals 7
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/database/Cursor;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 715
a=0;//     .local v3, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 716
a=0;//     .local v4, "resultCounts":I
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 738
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 740
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 744
a=0;//     .end local v4    # "resultCounts":I
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 720
a=0;//     .restart local v4    # "resultCounts":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Integer);v5=(Boolean);v6=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v2, v5, :cond_3
a=0;// 
a=0;//     .line 738
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 740
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 721
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v5=(Integer);p1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {p1, v2}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 722
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 723
a=0;//     .local v0, "bfbk":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setId(J)V
a=0;// 
a=0;//     .line 724
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 725
a=0;//     const-string v5, "bookFile"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 726
a=0;//     const-string v5, "bookURL"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setBookURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 727
a=0;//     const-string v5, "imgFile"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 728
a=0;//     const-string v5, "title"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 729
a=0;//     const-string v5, "lastuptime"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setLastuptime(J)V
a=0;// 
a=0;//     .line 730
a=0;//     const-string v5, "hasupdate"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setIsUp(I)V
a=0;// 
a=0;//     .line 731
a=0;//     const-string v5, "finishFlag"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 732
a=0;//     const-string v5, "author"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 733
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 720
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 735
a=0;//     .end local v0    # "bfbk":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "resultCounts":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 736
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 738
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 740
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 737
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);p1=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 738
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 739
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 740
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 742
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private convertToBookMark(Landroid/database/Cursor;)Ljava/util/ArrayList;
a=0;//     .locals 7
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/database/Cursor;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMark;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 798
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 800
a=0;//     .local v2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 801
a=0;//     .local v4, "resultCounts":I
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 823
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 824
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 825
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 828
a=0;//     .end local v4    # "resultCounts":I
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 804
a=0;//     .restart local v4    # "resultCounts":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Integer);v5=(Boolean);v6=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v3=(Conflicted);v5=(Integer);v6=(Conflicted);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-lt v1, v5, :cond_3
a=0;// 
a=0;//     .line 823
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 824
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 825
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 805
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v5=(Integer);p1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 806
a=0;//     new-instance v3, Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/beans/BookMark;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/beans/BookMark;-><init>()V
a=0;// 
a=0;//     .line 807
a=0;//     .local v3, "mark":Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BookMark;);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v3, v5, v6}, Lcom/twocloo/com/cn/beans/BookMark;->setId(J)V
a=0;// 
a=0;//     .line 808
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 809
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setTextid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 810
a=0;//     const-string v5, "texttitle"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setTexttitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 811
a=0;//     const-string v5, "textjj"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setTextjj(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 812
a=0;//     const-string v5, "time"
a=0;// 
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     invoke-virtual {v3, v5, v6}, Lcom/twocloo/com/cn/beans/BookMark;->setTime(J)V
a=0;// 
a=0;//     .line 813
a=0;//     const-string v5, "length"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setLength(I)V
a=0;// 
a=0;//     .line 814
a=0;//     const-string v5, "isd"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setIsd(I)V
a=0;// 
a=0;//     .line 815
a=0;//     const-string v5, "isv"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setIsV(I)V
a=0;// 
a=0;//     .line 816
a=0;//     const-string v5, "location"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BookMark;->setLocation(I)V
a=0;// 
a=0;//     .line 817
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 804
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 820
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "mark":Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     .end local v4    # "resultCounts":I
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 821
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 823
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 824
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 825
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 822
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);p1=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 823
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 824
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 825
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 827
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private convertToBookVec(Ljava/util/Vector;Landroid/database/Cursor;)Ljava/util/Vector;
a=0;//     .locals 9
a=0;//     .param p2, "cursor"    # Landroid/database/Cursor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;",
a=0;//             "Landroid/database/Cursor;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 748
a=0;//     .local p1, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 750
a=0;//     .local v0, "articles":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 751
a=0;//     .local v4, "resultCounts":I
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 788
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 789
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 790
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     .line 794
a=0;//     .end local v4    # "resultCounts":I
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 754
a=0;//     .restart local v4    # "resultCounts":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v3, v7, :cond_3
a=0;// 
a=0;//     .line 788
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 789
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 790
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     #p2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 755
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v7=(Integer);p2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {p2, v3}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 756
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 757
a=0;//     .local v1, "bfbk":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     const-string v7, "_id"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/BFBook;->setId(J)V
a=0;// 
a=0;//     .line 758
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 759
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 760
a=0;//     const-string v7, "bookFile"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 761
a=0;//     const-string v7, "bookURL"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setBookURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 762
a=0;//     const-string v7, "imgFile"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 763
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 764
a=0;//     const-string v7, "lastuptime"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/BFBook;->setLastuptime(J)V
a=0;// 
a=0;//     .line 765
a=0;//     const-string v7, "hasupdate"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setIsUp(I)V
a=0;// 
a=0;//     .line 766
a=0;//     const-string v7, "finishFlag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 767
a=0;//     const-string v7, "isFromWeb"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setIsFromWeb(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 768
a=0;//     const-string v7, "source"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setSource(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 769
a=0;//     const-string v7, "isFence"
a=0;// 
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setIs_fence(I)V
a=0;// 
a=0;//     .line 770
a=0;//     const-string v7, "updatenumber"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 771
a=0;//     .local v6, "temps":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 772
a=0;//     .local v5, "temp":I
a=0;//     #v5=(Null);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 773
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 774
a=0;//     :cond_4
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setUpdatenumber(I)V
a=0;// 
a=0;//     .line 775
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 776
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 777
a=0;//     invoke-virtual {p1, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 754
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 785
a=0;//     .end local v1    # "bfbk":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "resultCounts":I
a=0;//     .end local v5    # "temp":I
a=0;//     .end local v6    # "temps":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 786
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 788
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 789
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 790
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     #p2=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 787
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v7=(Conflicted);p2=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 788
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz p2, :cond_6
a=0;// 
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_6
a=0;// 
a=0;//     .line 789
a=0;//     invoke-interface {p2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 790
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     .line 792
a=0;//     :cond_6
a=0;//     #v8=(Conflicted);
a=0;//     throw v7
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized addSearchResult(Lcom/twocloo/com/cn/beans/SearchHistroyBean;)V
a=0;//     .locals 5
a=0;//     .param p1, "result"    # Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 837
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 838
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 840
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 842
a=0;//     :try_start_1
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 844
a=0;//     .local v1, "newValues":Landroid/content/ContentValues;
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "uid"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 845
a=0;//     const-string v2, "content"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->getContent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 846
a=0;//     const-string v2, "time"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->getTime()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 847
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v3, "searchhistroy"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     .line 848
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 852
a=0;//     :try_start_2
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 854
a=0;//     .end local v1    # "newValues":Landroid/content/ContentValues;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 849
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 850
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 852
a=0;//     :try_start_4
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 837
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 851
a=0;//     :catchall_1
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 852
a=0;//     :try_start_5
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     .line 853
a=0;//     throw v2
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public deleteAllMark(Ljava/lang/String;I)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "isd"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\' and isd="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteBookById(Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteGxOne(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "isvip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "bookuser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\' and uid=\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\'   and isvip="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public deleteGxOne1(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "isvip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "bookuser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\' and (uid=\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\')  and isvip="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public deleteOneBook(J)J
a=0;//     .locals 4
a=0;//     .param p1, "id"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "_id="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteOneMark(J)J
a=0;//     .locals 4
a=0;//     .param p1, "id"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "_id="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteOneMark(Ljava/lang/String;I)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "location"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 351
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "booksq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\' and isd=0 and location="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteOneMarkaid(Ljava/lang/String;Ljava/lang/String;I)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "textid"    # Ljava/lang/String;
a=0;//     .param p3, "location"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " and "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "=\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " and isd=1 and "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "location"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 343
a=0;//     const-string v3, "="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 342
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized deleteSearchHistroy()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 860
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     .line 861
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "searchhistroy"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     .line 862
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;// 
a=0;//     .line 863
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 864
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 860
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public existBookBF(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 12
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 267
a=0;//     #v11=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 269
a=0;//     .local v9, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v9=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' and uid=\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 270
a=0;//     #v9=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     .line 278
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 280
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v8, v11
a=0;// 
a=0;//     .line 284
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Boolean);v10=(Conflicted);
a=0;//     return v8
a=0;// 
a=0;//     .line 272
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(Uninit);v10=(Uninit);
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 273
a=0;//     .local v8, "b":Z
a=0;//     #v8=(Boolean);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "existBookBF b = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 279
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 280
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     .end local v8    # "b":Z
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v10
a=0;// 
a=0;//     .line 276
a=0;//     .local v10, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v10=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 279
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 280
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     move v8, v11
a=0;// 
a=0;//     .line 284
a=0;//     #v8=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 277
a=0;//     .end local v10    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v8=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 278
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v9, :cond_4
a=0;// 
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 279
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 280
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 282
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public exitBF1(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public exitBookBF1(Ljava/lang/String;)Z
a=0;//     .locals 11
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 243
a=0;//     #v10=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 245
a=0;//     .local v8, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 249
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' "
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
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 250
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 256
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 257
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 262
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v9=(Uninit);
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 256
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 257
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 254
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 256
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 257
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 262
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 256
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 257
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 12
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     #v11=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     .local v8, "cursor":Landroid/database/Cursor;
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     .local v10, "flag":Z
a=0;//     :try_start_0
a=0;//     #v10=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "bookuser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' and (uid=\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' or uid=\'0\') and isvip=0"
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
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 122
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 128
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v11
a=0;// 
a=0;//     .line 134
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 124
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v9=(Uninit);v10=(Null);
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 128
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 129
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v9=(Uninit);v10=(Null);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 126
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 128
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 129
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 127
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Reference,Landroid/database/Cursor;);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 129
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public exitBookGx(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;//     .locals 12
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "isvip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     #v11=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     .local v8, "cursor":Landroid/database/Cursor;
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     .local v10, "flag":Z
a=0;//     :try_start_0
a=0;//     #v10=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "bookuser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' and uid=\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'  and isvip="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 143
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v11
a=0;// 
a=0;//     .line 154
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 145
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v9=(Uninit);v10=(Null);
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 149
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 150
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v9=(Uninit);v10=(Null);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 147
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 149
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 150
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 148
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Reference,Landroid/database/Cursor;);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 149
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 150
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 153
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public exitBookGxVip(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 12
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 165
a=0;//     #v11=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 166
a=0;//     .local v8, "cursor":Landroid/database/Cursor;
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 168
a=0;//     .local v10, "flag":Z
a=0;//     :try_start_0
a=0;//     #v10=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "bookuser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' and uid=\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'  and isvip=1"
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
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 169
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v11
a=0;// 
a=0;//     .line 180
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v9=(Uninit);v10=(Null);
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 175
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 176
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v9=(Uninit);v10=(Null);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 173
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 175
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 176
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 174
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Reference,Landroid/database/Cursor;);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 176
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public exitBookVip1(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGxVip(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getupLasttime(Ljava/lang/String;)J
a=0;//     .locals 5
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 402
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 405
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "select lastuptime from  booksf where articleid =\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     .line 406
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 415
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 418
a=0;//     :goto_0
a=0;//     #v0=(Null);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 412
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Uninit);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 413
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 415
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 418
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :goto_1
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 414
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 415
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 417
a=0;//     #v0=(Null);
a=0;//     throw v2
a=0;// 
a=0;//     .line 415
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Uninit);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Null);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "book"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     new-instance v2, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 218
a=0;//     .local v2, "newValues":Landroid/content/ContentValues;
a=0;//     #v2=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v3, "articleid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     const-string v3, "imgFile"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 220
a=0;//     const-string v3, "bookFile"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 221
a=0;//     const-string v3, "bookURL"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getBookURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 222
a=0;//     const-string v3, "finishFlag"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getFinishFlag()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 223
a=0;//     const-string v3, "uid"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 224
a=0;//     const-string v3, "author"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 225
a=0;//     const-string v3, "title"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 226
a=0;//     const-string v3, "lasttime"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 227
a=0;//     const-string v3, "isFromWeb"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getIsFromWeb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     const-string v3, "source"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getSource()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     const-string v3, "isFence"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getIs_fence()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 230
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v3, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "booksf"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "a":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, " >> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " >> "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\u52a0\u5165\u4e66\u67b6\u6210\u529f!"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 235
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 236
a=0;//     const-string v3, "\u52a0\u5165\u4e66\u67b6\u6210\u529f"
a=0;// 
a=0;//     .line 238
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Byte);
a=0;//     const-string v3, "\u52a0\u5165\u4e66\u67b6\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public insertBookMark(Lcom/twocloo/com/cn/beans/BookMark;I)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "bookMark"    # Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     .param p2, "isD"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     new-instance v2, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 300
a=0;//     .local v2, "newValues":Landroid/content/ContentValues;
a=0;//     #v2=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v3, "articleid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getTextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     const-string v3, "texttitle"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getTexttitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 303
a=0;//     const-string v3, "textjj"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getTextjj()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 304
a=0;//     const-string v3, "time"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 305
a=0;//     const-string v3, "length"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getLength()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 306
a=0;//     const-string v3, "location"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getLocation()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 307
a=0;//     const-string v3, "isd"
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 308
a=0;//     const-string v3, "isv"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BookMark;->getIsV()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 309
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     new-instance v3, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 312
a=0;//     :cond_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "booksq"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "a":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 314
a=0;//     const-string v3, "\u6dfb\u52a0\u4e66\u7b7e\u6210\u529f"
a=0;// 
a=0;//     .line 316
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Byte);
a=0;//     const-string v3, "\u6dfb\u52a0\u4e66\u7b7e\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 6
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "isvip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     new-instance v2, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 100
a=0;//     .local v2, "newValues":Landroid/content/ContentValues;
a=0;//     #v2=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v3, "articleid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     const-string v3, "uid"
a=0;// 
a=0;//     invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v3, "isvip"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 103
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "bookuser"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "a":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isNeedUp(Ljava/lang/String;II)J
a=0;//     .locals 5
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "val"    # I
a=0;//     .param p3, "chapterNumber"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 379
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "hasupdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 380
a=0;//     const-string v1, "updatenumber"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 381
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "booksf"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public queryAllBookMark(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/ArrayList;
a=0;//     .locals 9
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "isd"    # I
a=0;//     .param p3, "act"    # Landroid/app/Activity;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "I",
a=0;//             "Landroid/app/Activity;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMark;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 605
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 606
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-direct {v0, p3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 608
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "booksq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     const-string v5, "texttitle"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     const-string v5, "textjj"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     const-string v5, "time"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     const-string v5, "length"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     const-string v5, "isd"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     .line 609
a=0;//     const-string v5, "location"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     const-string v5, "isv"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, "\' and isd="
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     .line 608
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 610
a=0;//     .local v8, "result":Landroid/database/Cursor;
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->convertToBookMark(Landroid/database/Cursor;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;//     .locals 17
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "isd"    # I
a=0;//     .param p3, "act"    # Landroid/app/Activity;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "I",
a=0;//             "Landroid/app/Activity;",
a=0;//             ")",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 618
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v1, v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 620
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v13, Ljava/util/HashMap;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v13}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 621
a=0;//     .local v13, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     #v13=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 623
a=0;//     .local v15, "result":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v15=(Null);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "booksq"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "location"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\' and isd="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 624
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 623
a=0;//     #v8=(Null);
a=0;//     invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 625
a=0;//     #v15=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v15, :cond_1
a=0;// 
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 626
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v10=(Integer);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v10, v1, :cond_3
a=0;// 
a=0;//     .line 638
a=0;//     .end local v10    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz v15, :cond_2
a=0;// 
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 639
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 643
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v13
a=0;// 
a=0;//     .line 627
a=0;//     .restart local v10    # "i":I
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Ujava/lang/Object;);v3=(Reference,[Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Null);v6=(Null);v7=(Null);v8=(Null);v9=(Uninit);v10=(Integer);
a=0;//     invoke-interface {v15, v10}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 628
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v15, v1}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 629
a=0;//     .local v11, "id":J
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-interface {v15, v1}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 630
a=0;//     .local v14, "p":I
a=0;//     #v14=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v15, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 631
a=0;//     .local v16, "t":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v13, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 626
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 634
a=0;//     .end local v10    # "i":I
a=0;//     .end local v11    # "id":J
a=0;//     .end local v14    # "p":I
a=0;//     .end local v16    # "t":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 635
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 638
a=0;//     if-eqz v15, :cond_2
a=0;// 
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 639
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 636
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v9=(Conflicted);v15=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 638
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v15, :cond_4
a=0;// 
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 639
a=0;//     invoke-interface {v15}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 642
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryAllVipData(Ljava/lang/String;)Ljava/util/Vector;
a=0;//     .locals 4
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "select b._id _id,b.articleid articleid,b.bookFile bookFile,b.bookURL bookURL,b.imgFile imgFile,b.title title,b.hasupdate hasupdate,b.finishFlag finishFlag,b.isFromWeb isFromWeb,b.lastuptime lastuptime from booksf b left join  bookuser on b.articleid=bookuser.articleid where bookuser.isvip=1 and bookuser.uid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 514
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 515
a=0;//     const-string v3, "\' order by b.lasttime desc"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 512
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 517
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     new-instance v1, Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v1}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->convertToBookVec(Ljava/util/Vector;Landroid/database/Cursor;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public queryBookFile(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 550
a=0;//     #v11=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 552
a=0;//     .local v10, "result":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v10=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "bookFile"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'  and bookFile is not null"
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
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 553
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 552
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 554
a=0;//     #v10=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 555
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 556
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 557
a=0;//     .local v9, "p":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 558
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 565
a=0;//     :cond_0
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 566
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 567
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 571
a=0;//     .end local v9    # "p":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v9
a=0;// 
a=0;//     .line 562
a=0;//     :catch_0
a=0;//     #v8=(Uninit);v9=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 563
a=0;//     .local v8, "e":Ljava/lang/Exception;
a=0;//     :try_start_1
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 565
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 566
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 567
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     move-object v9, v11
a=0;// 
a=0;//     .line 571
a=0;//     #v9=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 564
a=0;//     :catchall_0
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 565
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 566
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 567
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 569
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 565
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 566
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 567
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public queryBookToUp()Ljava/util/HashMap;
a=0;//     .locals 12
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 576
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 578
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 579
a=0;//     .local v11, "result":Landroid/database/Cursor;
a=0;//     #v11=(Null);
a=0;//     new-instance v10, Ljava/util/HashMap;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v10}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 581
a=0;//     .local v10, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     :try_start_0
a=0;//     #v10=(Reference,Ljava/util/HashMap;);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "articleid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "lastuptime"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const-string v3, "lastuptime is not null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 582
a=0;//     #v11=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 583
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v9=(Integer);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v9, v0, :cond_3
a=0;// 
a=0;//     .line 593
a=0;//     .end local v9    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 594
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 595
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 598
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 584
a=0;//     .restart local v9    # "i":I
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Reference,Ujava/lang/Object;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(Uninit);v9=(Integer);
a=0;//     invoke-interface {v11, v9}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 585
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-interface {v11, v1}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v10, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 583
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 590
a=0;//     .end local v9    # "i":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 591
a=0;//     .local v8, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 593
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 594
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 595
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 592
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Conflicted);v11=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 593
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 594
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 595
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 597
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public queryGxBook(Ljava/lang/String;)Ljava/util/HashSet;
a=0;//     .locals 12
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 521
a=0;//     new-instance v11, Ljava/util/HashSet;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v11}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 522
a=0;//     .local v11, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v11=(Reference,Ljava/util/HashSet;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 524
a=0;//     .local v10, "result":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v10=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "bookuser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "articleid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "(uid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' or uid=\'0\') and isvip=0"
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
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 528
a=0;//     #v10=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 529
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v9=(Integer);
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v9, v0, :cond_2
a=0;// 
a=0;//     .line 537
a=0;//     .end local v9    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 538
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 539
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 542
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v11
a=0;// 
a=0;//     .line 530
a=0;//     .restart local v9    # "i":I
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(Uninit);v9=(Integer);
a=0;//     invoke-interface {v10, v9}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 531
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 529
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 534
a=0;//     .end local v9    # "i":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 535
a=0;//     .local v8, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 537
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 538
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 539
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 536
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Conflicted);v10=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 537
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 538
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 539
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 541
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public queryMyBFCount(Ljava/lang/String;)J
a=0;//     .locals 5
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 430
a=0;//     .local v0, "c":Landroid/database/Cursor;
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 431
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 436
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 437
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "select b._id _id,b.articleid articleid,b.bookFile bookFile,b.bookURL bookURL,b.imgFile imgFile,b.title title,b.hasupdate hasupdate,b.finishFlag finishFlag,b.isFromWeb isFromWeb,b.lastuptime  lastuptime,b.author author,b.updatenumber updatenumber,b.source source,b.isFence isFence from booksf b inner join  bookuser on b.articleid=bookuser.articleid where bookuser.isvip=0 and (bookuser.uid=\'0\' or bookuser.uid=\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 440
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\') order by b.lasttime desc"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 437
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 440
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 436
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 441
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 442
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     .line 446
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 447
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 449
a=0;//     :goto_0
a=0;//     #v0=(Null);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 443
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Uninit);v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 444
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 446
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 447
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 449
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :goto_1
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 445
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 446
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 447
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 448
a=0;//     #v0=(Null);
a=0;//     throw v2
a=0;// 
a=0;//     .line 446
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Null);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 447
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public queryMyBFData(Ljava/util/Vector;Ljava/lang/String;)Ljava/util/Vector;
a=0;//     .locals 4
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     .local p1, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 461
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 463
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 465
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "select distinct b._id _id,b.articleid articleid,b.bookFile bookFile,b.bookURL bookURL,b.imgFile imgFile,b.title title,b.hasupdate hasupdate,b.finishFlag finishFlag,b.isFromWeb isFromWeb,b.lastuptime  lastuptime,b.author author,b.updatenumber updatenumber,b.source source,b.isFence isFence from booksf b inner join  bookuser on b.articleid=bookuser.articleid where bookuser.isvip=0 and (bookuser.uid=\'0\' or bookuser.uid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 468
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\') order by b.lasttime desc"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 468
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 464
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 470
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->convertToBookVec(Ljava/util/Vector;Landroid/database/Cursor;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public queryMyBFData(Ljava/util/Vector;Ljava/lang/String;II)Ljava/util/Vector;
a=0;//     .locals 6
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "start"    # I
a=0;//     .param p4, "maxcount"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "II)",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     .local p1, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 490
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 492
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 494
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "select distinct b._id _id,b.articleid articleid,b.bookFile bookFile,b.bookURL bookURL,b.imgFile imgFile,b.title title,b.hasupdate hasupdate,b.finishFlag finishFlag,b.isFromWeb isFromWeb,b.lastuptime  lastuptime,b.author author,b.updatenumber updatenumber,b.source source,b.isFence isFence from booksf b inner join  bookuser on b.articleid=bookuser.articleid where bookuser.isvip=0 and (bookuser.uid=\'0\' or bookuser.uid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 497
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\') order by b.lasttime desc limit ?,?"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 494
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 498
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     .line 493
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 500
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->convertToBookVec(Ljava/util/Vector;Landroid/database/Cursor;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public queryOneBook(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;//     .locals 9
a=0;//     .param p1, "id"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 422
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "booksf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "bookFile"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     const-string v5, "bookURL"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     const-string v5, "imgFile"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     const-string v5, "title"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     const-string v5, "lastuptime"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     .line 423
a=0;//     const-string v5, "hasupdate"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     const-string v5, "finishFlag"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     const-string v5, "author"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 422
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 424
a=0;//     .local v8, "result":Landroid/database/Cursor;
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->convertToBook(Landroid/database/Cursor;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized querySearchHistroy()Ljava/util/List;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SearchHistroyBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 872
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 873
a=0;//     new-instance v3, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 875
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 876
a=0;//     .local v2, "list":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/SearchHistroyBean;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "select * from searchhistroy group by content"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 877
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 885
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 886
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 878
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/SearchHistroyBean;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;-><init>()V
a=0;// 
a=0;//     .line 879
a=0;//     .local v1, "histroy":Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/SearchHistroyBean;);
a=0;//     const-string v3, "_id"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setId(J)V
a=0;// 
a=0;//     .line 880
a=0;//     const-string v3, "content"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setContent(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 881
a=0;//     const-string v3, "time"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setTime(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 882
a=0;//     const-string v3, "uid"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 883
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 872
a=0;//     .end local v0    # "cursor":Landroid/database/Cursor;
a=0;//     .end local v1    # "histroy":Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;//     .end local v2    # "list":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/SearchHistroyBean;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public upLasttime(Ljava/lang/String;J)J
a=0;//     .locals 5
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "time"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 389
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 391
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 392
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "lastuptime"
a=0;// 
a=0;//     invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 393
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "booksf"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public updateBF(Lcom/twocloo/com/cn/beans/BFBook;Ljava/lang/String;Landroid/app/Activity;)J
a=0;//     .locals 6
a=0;//     .param p1, "book"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .param p2, "articleid"    # Ljava/lang/String;
a=0;//     .param p3, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 210
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 202
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 205
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 206
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "title"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 207
a=0;//     const-string v2, "author"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     const-string v2, "imgFile"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 209
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v3, "booksf"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "articleid=\'"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\'"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v0, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 210
a=0;//     .local v1, "time":I
a=0;//     #v1=(Integer);
a=0;//     int-to-long v2, v1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public updateSetBookFile(Ljava/lang/String;Ljava/lang/String;)J
a=0;//     .locals 5
a=0;//     .param p1, "bookFile"    # Ljava/lang/String;
a=0;//     .param p2, "articleid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 707
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 708
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "bookFile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 709
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "booksf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public updateSetBookFile(Ljava/lang/String;Ljava/lang/String;J)J
a=0;//     .locals 5
a=0;//     .param p1, "bookFile"    # Ljava/lang/String;
a=0;//     .param p2, "articleid"    # Ljava/lang/String;
a=0;//     .param p3, "time"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 693
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 694
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "bookFile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 695
a=0;//     const-string v1, "lastuptime"
a=0;// 
a=0;//     invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 696
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "booksf"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public updateSetBookLT(Ljava/lang/String;Landroid/app/Activity;)J
a=0;//     .locals 6
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 365
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 368
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 369
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "lasttime"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 370
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v3, "booksf"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "articleid=\'"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\'"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v0, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 371
a=0;//     .local v1, "time":I
a=0;//     #v1=(Integer);
a=0;//     int-to-long v2, v1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     return-wide v2
a=0;// .end method
a=0;// 
a=0;// .method public updateUid(Ljava/lang/String;)Ljava/util/HashSet;
a=0;//     .locals 17
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 647
a=0;//     new-instance v16, Ljava/util/HashSet;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct/range {v16 .. v16}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 648
a=0;//     .local v16, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v16=(Reference,Ljava/util/HashSet;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 650
a=0;//     .local v11, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v11=(Null);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v3, "bookuser"
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
a=0;//     const-string v6, "_id"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const-string v5, "uid=\'0\'"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 651
a=0;//     #v11=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v11, :cond_0
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 652
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u957f\u5ea6          ======"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 653
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v13, v2, :cond_2
a=0;// 
a=0;//     .line 681
a=0;//     .end local v13    # "i":I
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v13=(Conflicted);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 683
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 686
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v16
a=0;// 
a=0;//     .line 654
a=0;//     .restart local v13    # "i":I
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Integer);v5=(Reference,Ljava/lang/String;);v6=(Null);v7=(Null);v8=(Null);v9=(Null);v13=(Integer);
a=0;//     invoke-interface {v11, v13}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 655
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v11, v2}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 656
a=0;//     .local v14, "id":Ljava/lang/Long;
a=0;//     #v14=(Reference,Ljava/lang/Long;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v11, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 658
a=0;//     .local v10, "aid":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v10, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     .line 659
a=0;//     new-instance v15, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v15=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v15}, Landroid/content/ContentValues;-><init>()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 661
a=0;//     .local v15, "newValues":Landroid/content/ContentValues;
a=0;//     :try_start_2
a=0;//     #v15=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "single"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 662
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/db/DBAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->insertbookid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 653
a=0;//     .end local v15    # "newValues":Landroid/content/ContentValues;
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v15=(Conflicted);
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 666
a=0;//     .restart local v15    # "newValues":Landroid/content/ContentValues;
a=0;//     :catch_0
a=0;//     #v15=(Reference,Landroid/content/ContentValues;);
a=0;//     move-exception v12
a=0;// 
a=0;//     .line 667
a=0;//     .local v12, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v12=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 678
a=0;//     .end local v10    # "aid":Ljava/lang/String;
a=0;//     .end local v12    # "e":Ljava/lang/Exception;
a=0;//     .end local v13    # "i":I
a=0;//     .end local v14    # "id":Ljava/lang/Long;
a=0;//     .end local v15    # "newValues":Landroid/content/ContentValues;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v12
a=0;// 
a=0;//     .line 679
a=0;//     .restart local v12    # "e":Ljava/lang/Exception;
a=0;//     :try_start_4
a=0;//     #v12=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 681
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 683
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 670
a=0;//     .end local v12    # "e":Ljava/lang/Exception;
a=0;//     .restart local v10    # "aid":Ljava/lang/String;
a=0;//     .restart local v13    # "i":I
a=0;//     .restart local v14    # "id":Ljava/lang/Long;
a=0;//     .restart local v15    # "newValues":Landroid/content/ContentValues;
a=0;//     :cond_3
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v1=(Reference,Ljava/lang/String;);v4=(Integer);v5=(Reference,Ljava/lang/String;);v6=(Null);v7=(Null);v8=(Null);v9=(Null);v10=(Reference,Ljava/lang/String;);v11=(Reference,Landroid/database/Cursor;);v12=(Conflicted);v13=(Integer);v14=(Reference,Ljava/lang/Long;);v15=(Reference,Landroid/content/ContentValues;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 671
a=0;//     const-string v2, "uid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v15, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 672
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v3, "bookuser"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "_id="
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v15, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 680
a=0;//     .end local v10    # "aid":Ljava/lang/String;
a=0;//     .end local v13    # "i":I
a=0;//     .end local v14    # "id":Ljava/lang/Long;
a=0;//     .end local v15    # "newValues":Landroid/content/ContentValues;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 681
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 682
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 683
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 685
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 674
a=0;//     .restart local v10    # "aid":Ljava/lang/String;
a=0;//     .restart local v13    # "i":I
a=0;//     .restart local v14    # "id":Ljava/lang/Long;
a=0;//     :cond_5
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v1=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(LongHi);v5=(Reference,Ljava/lang/String;);v6=(Null);v7=(Null);v8=(Null);v9=(Null);v10=(Reference,Ljava/lang/String;);v13=(Integer);v14=(Reference,Ljava/lang/Long;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/db/DBAdapter;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v3, "bookuser"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "_id="
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
