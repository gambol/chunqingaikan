package cn.dm.a.b; class a { void a() { int a;
a=0;// .class public final Lcn/dm/a/b/a;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/a/b/a$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:Ljava/lang/String; = "dm_aow_download.db"
a=0;// 
a=0;// .field static final b:I = 0x2
a=0;// 
a=0;// .field public static final c:Ljava/lang/String; = "download_app_tab"
a=0;// 
a=0;// .field private static d:Lcn/dm/a/b/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcn/dm/a/b/a;->d:Lcn/dm/a/b/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v2=(Null);
a=0;//     const-string v0, "dm_aow_download.db"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcn/dm/a/b/a;);
a=0;//     iput-object v2, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcn/dm/a/b/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const-class v1, Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/dm/a/b/a;->d:Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Lcn/dm/a/b/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/a/b/a;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/a/b/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/b/a;);
a=0;//     sput-object v0, Lcn/dm/a/b/a;->d:Lcn/dm/a/b/a;
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/a/b/a;->d:Lcn/dm/a/b/a;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-virtual {p0}, Lcn/dm/a/b/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     iput-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Lcn/dm/a/b/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     iput-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-virtual {p0}, Lcn/dm/a/b/a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     iput-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     #v5=(Null);
a=0;//     new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/database/sqlite/SQLiteQueryBuilder;);
a=0;//     invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteQueryBuilder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p0}, Lcn/dm/a/b/a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     iput-object v1, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v1, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, p5
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Landroid/content/ContentValues;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-virtual {p0}, Lcn/dm/a/b/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     iput-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcn/dm/a/b/a;->e:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 1
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     const-string v0, "CREATE TABLE IF NOT EXISTS download_app_tab (_app_id long PRIMARY KEY,_app_name VARCHAR,_app_packagename VARCHAR,_app_download_url VARCHAR,_app_logo_url VARCHAR,_app_size long,_app_versioncode int,_app_isupdate int,_app_tr VARCHAR,_app_download_time VARCHAR,_app_download_status int,_app_autoRun int,_app_launch_port int)"
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 0
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "oldVersion"    # I
a=0;//     .param p3, "newVersion"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 0
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "oldVersion"    # I
a=0;//     .param p3, "newVersion"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
}}
