package u.aly; class v { void a() { int a;
a=0;// .class public Lu/aly/v;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SessionTracker.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "session_start_time"
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "session_end_time"
a=0;// 
a=0;// .field private static final c:Ljava/lang/String; = "session_id"
a=0;// 
a=0;// .field private static final f:Ljava/lang/String; = "activities"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final d:Ljava/lang/String;
a=0;// 
a=0;// .field private final e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lu/aly/v;);
a=0;//     const-string v0, "a_start_time"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lu/aly/v;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     const-string v0, "a_end_time"
a=0;// 
a=0;//     iput-object v0, p0, Lu/aly/v;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Landroid/content/SharedPreferences;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     invoke-static {p1}, Lu/aly/k;->a(Landroid/content/Context;)Lu/aly/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Lu/aly/k;);
a=0;//     invoke-virtual {p0, p1}, Lu/aly/v;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 183
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1}, Lu/aly/v;->a(Landroid/content/Context;)Lu/aly/af;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 185
a=0;//     #v2=(Reference,Lu/aly/af;);
a=0;//     invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 187
a=0;//     #v3=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v4, "session_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 188
a=0;//     const-string v4, "session_start_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 189
a=0;//     const-string v4, "session_end_time"
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 191
a=0;//     invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 193
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v0, v2}, Lu/aly/k;->a(Lu/aly/p;)V
a=0;// 
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Lu/aly/k;->a(Lu/aly/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/SharedPreferences;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "session_start_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 88
a=0;//     const-string v1, "session_end_time"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 89
a=0;//     const-string v1, "session_id"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v1, "a_start_time"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 91
a=0;//     const-string v1, "a_end_time"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 93
a=0;//     const-string v1, "activities"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/SharedPreferences;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     .line 162
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-string v1, "a_start_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 163
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-string v3, "a_end_time"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 164
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 167
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v7, v1, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     sub-long v1, v5, v1
a=0;// 
a=0;//     sget-wide v7, Lcom/umeng/analytics/AnalyticsConfig;->kContinueSessionMillis:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     cmp-long v1, v1, v7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "onResume called before onPause"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(LongHi);
a=0;//     sub-long v1, v5, v3
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     sget-wide v3, Lcom/umeng/analytics/AnalyticsConfig;->kContinueSessionMillis:J
a=0;// 
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;)Lu/aly/af;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-static {p1}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 36
a=0;//     #v8=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v0, "session_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v8, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 38
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const-string v0, "session_start_time"
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v8, v0, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 41
a=0;//     const-string v0, "session_end_time"
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-interface {v8, v0, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 42
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v7, v5, v9
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     sub-long v0, v5, v3
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     const-wide/32 v11, 0x5265c00
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     cmp-long v7, v9, v11
a=0;// 
a=0;//     if-lez v7, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     new-instance v7, Lu/aly/af;
a=0;// 
a=0;//     #v7=(UninitRef,Lu/aly/af;);
a=0;//     invoke-direct {v7}, Lu/aly/af;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #v7=(Reference,Lu/aly/af;);
a=0;//     invoke-virtual {v7, v2}, Lu/aly/af;->a(Ljava/lang/String;)Lu/aly/bd;
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {v7, v3, v4}, Lu/aly/af;->a(J)Lu/aly/bd;
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {v7, v5, v6}, Lu/aly/af;->b(J)Lu/aly/bd;
a=0;// 
a=0;//     .line 56
a=0;//     invoke-virtual {v7, v0, v1}, Lu/aly/af;->c(J)Lu/aly/bd;
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->getLocation()[D
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 59
a=0;//     #v3=(Reference,[D);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Lu/aly/aw;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/aw;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-wide v1, v3, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-wide v3, v3, v4
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lu/aly/aw;-><init>(DDJ)V
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Reference,Lu/aly/aw;);
a=0;//     invoke-virtual {v7}, Lu/aly/af;->y()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {v7, v0}, Lu/aly/af;->a(Lu/aly/aw;)V
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p1}, Lu/aly/y;->a(Landroid/content/Context;)Lu/aly/be;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(Reference,Lu/aly/be;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v7, v0}, Lu/aly/af;->a(Lu/aly/be;)Lu/aly/bd;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_3
a=0;//     invoke-static {v8}, Lu/aly/z;->a(Landroid/content/SharedPreferences;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 75
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {v7, v0}, Lu/aly/af;->a(Ljava/util/List;)Lu/aly/bd;
a=0;// 
a=0;//     .line 79
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     invoke-direct {p0, v8}, Lu/aly/v;->a(Landroid/content/SharedPreferences;)V
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 81
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v2=(LongHi);v3=(LongLo);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Lu/aly/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lu/aly/aw;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object v0, v1, v2
a=0;// 
a=0;//     invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lu/aly/af;->b(Ljava/util/List;)Lu/aly/bd;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     invoke-static {p1}, Lu/aly/bi;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 101
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->getAppkey(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 104
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "Appkey is null or empty, Please check AndroidManifest.xml"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 109
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lu/aly/bv;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     invoke-static {p1}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-direct {p0, v0}, Lu/aly/v;->b(Landroid/content/SharedPreferences;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0, p1, v0}, Lu/aly/v;->a(Landroid/content/Context;Landroid/content/SharedPreferences;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 124
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Start new session: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     :goto_1
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 132
a=0;//     const-string v1, "a_start_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 133
a=0;//     const-string v1, "a_end_time"
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 135
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v1, "session_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 128
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Extend current session: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public d(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {p1}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 140
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "a_start_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 146
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     sget-boolean v1, Lcom/umeng/analytics/AnalyticsConfig;->ACTIVITY_DURATION_OPEN:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 147
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "onPause called before onResume"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     #v1=(Byte);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 151
a=0;//     #v1=(LongLo);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 153
a=0;//     const-string v3, "a_start_time"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 154
a=0;//     const-string v3, "a_end_time"
a=0;// 
a=0;//     invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 155
a=0;//     const-string v3, "session_end_time"
a=0;// 
a=0;//     invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 157
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
