package cn.dm.a.b; class b { void a() { int a;
a=0;// .class public Lcn/dm/a/b/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcn/dm/android/f/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/dm/a/b/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/a/b/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcn/dm/a/b/b;);
a=0;//     iput-object p1, p0, Lcn/dm/a/b/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 20
a=0;//     iget-object v0, p0, Lcn/dm/a/b/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/a/b/a;->a(Landroid/content/Context;)Lcn/dm/a/b/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d(Lcn/dm/a/a/a;)Landroid/database/Cursor;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v4, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v4, v0
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     const-string v1, "download_app_tab"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "_app_id=?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/dm/a/b/a;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v4, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v4, v0
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     const-string v1, "download_app_tab"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "_app_packagename=?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/dm/a/b/a;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v1, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get getDownloadAppInfo failed:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e(Lcn/dm/a/a/a;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1}, Lcn/dm/a/b/b;->d(Lcn/dm/a/a/a;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 136
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     sget-object v1, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "crs count and columncount is:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "  ,"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->getColumnCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v4=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 144
a=0;//     #v0=(One);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 142
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v3, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 144
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 145
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_2
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/dm/a/a/a;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     const-string v1, "download_app_tab"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/dm/a/b/a;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 26
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Lcn/dm/a/a/a;);v3=(Integer);v4=(Conflicted);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v2, Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/a/a/a;);
a=0;//     invoke-direct {v2}, Lcn/dm/a/a/a;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #v2=(Reference,Lcn/dm/a/a/a;);
a=0;//     const-string v3, "_app_id"
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
a=0;//     invoke-virtual {v2, v3, v4}, Lcn/dm/a/a/a;->b(J)V
a=0;// 
a=0;//     .line 30
a=0;//     const-string v3, "_app_name"
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
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 31
a=0;//     const-string v3, "_app_packagename"
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
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 32
a=0;//     const-string v3, "_app_download_status"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->f(I)V
a=0;// 
a=0;//     .line 33
a=0;//     const-string v3, "_app_size"
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
a=0;//     #v3=(LongLo);
a=0;//     invoke-virtual {v2, v3, v4}, Lcn/dm/a/a/a;->c(J)V
a=0;// 
a=0;//     .line 34
a=0;//     const-string v3, "_app_download_url"
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
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 35
a=0;//     const-string v3, "_app_logo_url"
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
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->f(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     const-string v3, "_app_versioncode"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->e(I)V
a=0;// 
a=0;//     .line 37
a=0;//     const-string v3, "_app_isupdate"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->d(I)V
a=0;// 
a=0;//     .line 38
a=0;//     const-string v3, "_app_tr"
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
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     const-string v3, "_app_download_time"
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
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     const-string v3, "_app_autoRun"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/a/a/a;->a(I)V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public a(J)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     const-string v1, "download_app_tab"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "_app_id="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
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
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcn/dm/a/b/a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 85
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u5220\u9664\u6570\u636e\u6210\u529f\uff0cdelete number "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v0, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     const-string v1, " delete failed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/a/a/a;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "_app_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 55
a=0;//     const-string v1, "_app_name"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 56
a=0;//     const-string v1, "_app_packagename"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     const-string v1, "_app_download_status"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 58
a=0;//     const-string v1, "_app_size"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->l()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 59
a=0;//     const-string v1, "_app_download_url"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->m()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 60
a=0;//     const-string v1, "_app_logo_url"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->o()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     const-string v1, "_app_versioncode"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->g()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 62
a=0;//     const-string v1, "_app_isupdate"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->f()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 63
a=0;//     const-string v1, "_app_tr"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     const-string v1, "_app_download_time"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     const-string v1, "_app_autoRun"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     const-string v2, "download_app_tab"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcn/dm/a/b/a;->a(Ljava/lang/String;Landroid/content/ContentValues;)Z
a=0;// 
a=0;//     .line 68
a=0;//     sget-object v0, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u63d2\u5165\u6570\u636e\uff0c\u4e0b\u8f7d\u72b6\u6001\u4e3a\uff1a"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "  ,\u662f\u5426\u771f\u7684\u63d2\u5165\u4e86\uff1a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/dm/a/b/b;->e(Lcn/dm/a/a/a;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 69
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 70
a=0;//     sget-object v0, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "the "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is already exist, insert failed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v1, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     const-string v1, "download_app_tab"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "_app_packagename=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
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
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcn/dm/a/b/a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u5220\u9664\u6570\u636e\u6210\u529f\uff0cdelete number "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 103
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 101
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v0, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     const-string v1, " delete failed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/dm/a/a/a;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 159
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "_app_id="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 171
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v2, "_app_download_status"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 172
a=0;//     const-string v2, "_app_versioncode"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->g()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 173
a=0;//     const-string v2, "_app_isupdate"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->f()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v2, p0, Lcn/dm/a/b/b;->b:Lcn/dm/a/b/a;
a=0;// 
a=0;//     const-string v3, "download_app_tab"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v1, v0, v4}, Lcn/dm/a/b/a;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u66f4\u65b0\u6570\u636e\u5e93\u4e0b\u8f7d\u72b6\u6001\uff1a"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "  ,appname:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "  ,result:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);v4=(LongLo);
a=0;//     invoke-direct {p0, p1}, Lcn/dm/a/b/b;->e(Lcn/dm/a/a/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "_app_packagename="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 164
a=0;//     sget-object v2, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "downloadAppInfo\u5728\u6570\u636e\u5e93\u4e2d\u5b58\u5728\uff0c\u91c7\u7528\u5305\u540d\u8bc6\u522b\uff1a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(LongLo);v3=(LongHi);v4=(LongLo);
a=0;//     sget-object v0, Lcn/dm/a/b/b;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "downloadAppInfo\u5728\u6570\u636e\u5e93\u4e2d\u4e0d\u5b58\u5728"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
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
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     invoke-direct {p0, p1}, Lcn/dm/a/b/b;->e(Lcn/dm/a/a/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {p0, p1}, Lcn/dm/a/b/b;->b(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 187
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1}, Lcn/dm/a/b/b;->a(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
