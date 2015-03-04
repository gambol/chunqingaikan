package com.umeng.analytics; class g { void a() { int a;
a=0;// .class public final Lcom/umeng/analytics/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StoreHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/umeng/analytics/g; = null
a=0;// 
a=0;// .field private static b:Landroid/content/Context; = null
a=0;// 
a=0;// .field private static c:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static d:J = 0x0L
a=0;// 
a=0;// .field private static e:J = 0x0L
a=0;// 
a=0;// .field private static final f:Ljava/lang/String; = "age"
a=0;// 
a=0;// .field private static final g:Ljava/lang/String; = "sex"
a=0;// 
a=0;// .field private static final h:Ljava/lang/String; = "id"
a=0;// 
a=0;// .field private static final i:Ljava/lang/String; = "url"
a=0;// 
a=0;// .field private static final j:Ljava/lang/String; = "mobclick_agent_user_"
a=0;// 
a=0;// .field private static final k:Ljava/lang/String; = "mobclick_agent_online_setting_"
a=0;// 
a=0;// .field private static final l:Ljava/lang/String; = "mobclick_agent_header_"
a=0;// 
a=0;// .field private static final m:Ljava/lang/String; = "mobclick_agent_update_"
a=0;// 
a=0;// .field private static final n:Ljava/lang/String; = "mobclick_agent_state_"
a=0;// 
a=0;// .field private static final o:Ljava/lang/String; = "mobclick_agent_cached_"
a=0;// 
a=0;// .field private static final p:Ljava/lang/String; = "mobclick_agent_sealed_"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     new-instance v0, Lcom/umeng/analytics/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/g;);
a=0;//     invoke-direct {v0}, Lcom/umeng/analytics/g;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/g;);
a=0;//     sput-object v0, Lcom/umeng/analytics/g;->a:Lcom/umeng/analytics/g;
a=0;// 
a=0;//     .line 38
a=0;//     const-wide/32 v0, 0x48190800
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/umeng/analytics/g;->d:J
a=0;// 
a=0;//     .line 39
a=0;//     const-wide/32 v0, 0x200000
a=0;// 
a=0;//     sput-wide v0, Lcom/umeng/analytics/g;->e:J
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/analytics/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->a:Lcom/umeng/analytics/g;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/File;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-virtual {p0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     sget-wide v2, Lcom/umeng/analytics/g;->e:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private k()Landroid/content/SharedPreferences;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mobclick_agent_user_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private l()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "mobclick_agent_header_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
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
a=0;// .method private m()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "mobclick_agent_cached_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lu/aly/bi;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
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
a=0;// .method private n()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "mobclick_agent_sealed_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/g;->a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/umeng/analytics/g;->g()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 117
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 119
a=0;//     const-string v1, "umeng_net_report_policy"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 120
a=0;//     const-string v1, "umeng_net_report_interval"
a=0;// 
a=0;//     int-to-long v2, p2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 122
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;II)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->k()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     if-lez p3, :cond_2
a=0;// 
a=0;//     const-string v1, "age"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "sex"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 65
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a([B)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->m()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1, p1}, Lu/aly/bv;->a(Ljava/io/File;[B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 155
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 156
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a()[I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 102
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0}, Lcom/umeng/analytics/g;->g()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [I
a=0;// 
a=0;//     .line 104
a=0;//     #v1=(Reference,[I);
a=0;//     const-string v2, "umeng_net_report_policy"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     const-string v2, "umeng_net_report_policy"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v1, v5
a=0;// 
a=0;//     .line 106
a=0;//     const-string v2, "umeng_net_report_interval"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aput v0, v1, v4
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);v2=(Integer);v3=(Byte);
a=0;//     const-string v2, "umeng_local_report_policy"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v1, v5
a=0;// 
a=0;//     .line 109
a=0;//     const-string v2, "umeng_local_report_interval"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aput v0, v1, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b([B)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v1, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0, p1}, Lu/aly/bv;->a(Ljava/io/File;[B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 205
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 201
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 202
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->m()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 128
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 129
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Lcom/umeng/analytics/g;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     :try_start_0
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 141
a=0;//     :try_start_1
a=0;//     invoke-static {v2}, Lu/aly/bv;->b(Ljava/io/InputStream;)[B
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 143
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 145
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 145
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 146
a=0;//     throw v0
a=0;// 
a=0;//     .line 144
a=0;//     :catchall_1
a=0;//     #v0=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 142
a=0;//     :catch_1
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b(Landroid/content/Context;)[Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 74
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->k()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 77
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v2, "id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     const-string v2, "url"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v3, "url"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 85
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     const-string v2, "age"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "age"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const-string v2, "sex"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "sex"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v1, v2
a=0;// 
a=0;//     .line 93
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 162
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->m()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()[B
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 172
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 177
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->length()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v2, v4, v6
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 195
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 183
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Byte);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_2
a=0;//     invoke-static {v2}, Lu/aly/bv;->b(Ljava/io/InputStream;)[B
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 188
a=0;//     :try_start_3
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 190
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :goto_1
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 186
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 188
a=0;//     :try_start_5
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 187
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 188
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 189
a=0;//     throw v0
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
a=0;// 
a=0;//     .line 187
a=0;//     :catchall_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 185
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public e()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 209
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 211
a=0;//     #v0=(Boolean);
a=0;//     const-string v1, "--->"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "delete envelope:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public f()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/g;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 216
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 218
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
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
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public g()Landroid/content/SharedPreferences;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mobclick_agent_online_setting_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public h()Landroid/content/SharedPreferences;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mobclick_agent_header_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public i()Landroid/content/SharedPreferences;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mobclick_agent_update_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public j()Landroid/content/SharedPreferences;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     sget-object v0, Lcom/umeng/analytics/g;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mobclick_agent_state_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/umeng/analytics/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
