package safiap.framework.a; class c$a { void a() { int a;
a=0;// .class final Lsafiap/framework/a/c$a;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/a/c;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final b:Ljava/lang/String; = "SafFramework.db"
a=0;// 
a=0;// .field private static final c:I = 0x9
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Ljava/lang/Object;
a=0;// 
a=0;// .field private synthetic d:Lsafiap/framework/a/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lsafiap/framework/a/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     iput-object p1, p0, Lsafiap/framework/a/c$a;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 755
a=0;//     invoke-static {p1}, Lsafiap/framework/a/c;->a(Lsafiap/framework/a/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "SafFramework.db"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 728
a=0;//     #p0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     .line 757
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "get writable database"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 758
a=0;//     iget-object v1, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 759
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lsafiap/framework/a/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 760
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 903
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "update...where: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 904
a=0;//     iget-object v2, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 905
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lsafiap/framework/a/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 906
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 907
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 908
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "exec update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 909
a=0;//     invoke-virtual {v3, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     .line 911
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 912
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 871
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "insert....table: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 872
a=0;//     iget-object v2, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 873
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lsafiap/framework/a/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 874
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 875
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 876
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "exec insert"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 877
a=0;//     invoke-virtual {v3, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 879
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 880
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 934
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "delete...where: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 935
a=0;//     iget-object v2, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 936
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lsafiap/framework/a/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 937
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 938
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 939
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "exec delete"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 940
a=0;//     invoke-virtual {v3, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     .line 942
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 943
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/a/c$a;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lsafiap/framework/a/c$a;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/a/c$a;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     invoke-direct {p0, p1, p2, p3}, Lsafiap/framework/a/c$a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/a/c$a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lsafiap/framework/a/c$a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 985
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "query...where: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 986
a=0;//     iget-object v8, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v8
a=0;// 
a=0;//     .line 987
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lsafiap/framework/a/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 988
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 989
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v7, p7
a=0;// 
a=0;//     .line 990
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 992
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "query().exec.count:"
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 995
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit v8
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 992
a=0;//     :cond_0
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);v4=(Reference,[Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 996
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v8
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 727
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "create table = PluginInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 793
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 811
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 812
a=0;//     :try_start_1
a=0;//     const-string v0, "CREATE table PluginInfo (cnname text,action_name text primary key,package_name text,version INTEGER,description text,needsafe INTEGER,version_latest INTEGER default -1,update_option INTEGER,isdownloading INTEGER,lastupdateVERSION text,UpdateURL text,downloadedfile_name text,downloadedfile_version INTEGER,digest text,app_size text,app_update_type text);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 814
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 816
a=0;//     :try_start_2
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "create Table Success!"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 819
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 821
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     iget-object v0, p0, Lsafiap/framework/a/c$a;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/a/c;->a(Lsafiap/framework/a/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lsafiap/framework/sdk/b/d;->d(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 822
a=0;//     #v0=(Integer);
a=0;//     new-instance v2, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 823
a=0;//     #v2=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "cnname"
a=0;// 
a=0;//     const-string v3, "SAF\u80fd\u529b\u7ba1\u7406\u6846\u67b6"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 824
a=0;//     const-string v1, "action_name"
a=0;// 
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 825
a=0;//     const-string v1, "package_name"
a=0;// 
a=0;//     const-string v3, "safiap.framework"
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 826
a=0;//     const-string v1, "version"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 827
a=0;//     const-string v1, "description"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "New version for Create Table and version is "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 830
a=0;//     const-string v1, "version_latest"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 831
a=0;//     const-string v0, "update_option"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 832
a=0;//     const-string v0, "isdownloading"
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 835
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 836
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v3, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v3
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 837
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 838
a=0;//     :try_start_3
a=0;//     const-string v0, "PluginInfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 840
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit v3
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 841
a=0;//     :try_start_4
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "insert framework info result: "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 846
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 814
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     .line 842
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 843
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 844
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 840
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/lang/Object;);v4=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 768
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/a/c$a;->a(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     .line 769
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 773
a=0;//     iget-object v1, p0, Lsafiap/framework/a/c$a;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 776
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 777
a=0;//     :try_start_0
a=0;//     const-string v0, "drop table if exists PluginInfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 779
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 781
a=0;//     invoke-static {}, Lsafiap/framework/a/c;->b()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "onUpgrade()"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 782
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/a/c$a;->a(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     .line 783
a=0;//     return-void
a=0;// 
a=0;//     .line 779
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
