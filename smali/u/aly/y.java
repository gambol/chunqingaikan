package u.aly; class y { void a() { int a;
a=0;// .class public Lu/aly/y;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TrafficTracker.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "uptr"
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "dntr"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lu/aly/y;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lu/aly/be;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-wide/16 v11, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     :try_start_0
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     new-instance v0, Lu/aly/be;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/be;);
a=0;//     invoke-direct {v0}, Lu/aly/be;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #v0=(Reference,Lu/aly/be;);
a=0;//     invoke-static {p0}, Lu/aly/y;->b(Landroid/content/Context;)[J
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 28
a=0;//     #v2=(Reference,[J);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-wide v3, v2, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v3, v11
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-wide v3, v2, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v3, v3, v11
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 30
a=0;//     :cond_1
a=0;//     #v2=(Reference,[J);v3=(Byte);v4=(LongHi);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     invoke-static {p0}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 32
a=0;//     #v3=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v4, "uptr"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v5, -0x1
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 33
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v6, "dntr"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v7, -0x1
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-interface {v3, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 34
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v8, "uptr"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aget-wide v9, v2, v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-interface {v3, v8, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 35
a=0;//     const-string v8, "dntr"
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aget-wide v9, v2, v9
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     invoke-interface {v3, v8, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 36
a=0;//     invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 38
a=0;//     cmp-long v3, v4, v11
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     cmp-long v3, v6, v11
a=0;// 
a=0;//     if-gtz v3, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lu/aly/be;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-wide v8, v2, v3
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long v6, v8, v6
a=0;// 
a=0;//     aput-wide v6, v2, v3
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-wide v6, v2, v3
a=0;// 
a=0;//     sub-long v4, v6, v4
a=0;// 
a=0;//     aput-wide v4, v2, v3
a=0;// 
a=0;//     .line 43
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-wide v3, v2, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v3, v11
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-wide v3, v2, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v3, v3, v11
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_5
a=0;//     #v0=(Reference,Lu/aly/be;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-wide v3, v2, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     long-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Lu/aly/be;->c(I)Lu/aly/be;
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-wide v2, v2, v3
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Lu/aly/be;->a(I)Lu/aly/be;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 50
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v2, "sdk less than 2.2 has get no traffic"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lu/aly/bj;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 52
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)[J
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v8=(Null);
a=0;//     const-string v0, "android.net.TrafficStats"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     const-string v2, "getUidRxBytes"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v3, v8
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 58
a=0;//     const-string v2, "getUidTxBytes"
a=0;// 
a=0;//     new-array v4, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v4, v8
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v5, v0, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     .line 62
a=0;//     #v5=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v5, v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v0=(Reference,[J);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v2, v0, [J
a=0;// 
a=0;//     .line 65
a=0;//     new-array v0, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v0, v8
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     aput-wide v6, v2, v8
a=0;// 
a=0;//     .line 66
a=0;//     new-array v0, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v0, v8
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     aput-wide v0, v2, v9
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Reference,[J);
a=0;//     goto :goto_0
a=0;// .end method
}}
