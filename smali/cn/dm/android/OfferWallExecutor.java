package cn.dm.android; class OfferWallExecutor { void a() { int a;
a=0;// .class public Lcn/dm/android/OfferWallExecutor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/dm/android/f/e;
a=0;// 
a=0;// .field private final b:Ljava/lang/String;
a=0;// 
a=0;// .field private final c:Ljava/lang/String;
a=0;// 
a=0;// .field private final d:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcn/dm/android/OfferWallExecutor;);
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     iput-object v0, p0, Lcn/dm/android/OfferWallExecutor;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "inapp"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/OfferWallExecutor;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     const-string v0, "download"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/OfferWallExecutor;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     const-string v0, "launch"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/OfferWallExecutor;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v8, Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v8=(UninitRef,Lcn/dm/a/a/a;);
a=0;//     invoke-direct {v8}, Lcn/dm/a/a/a;-><init>()V
a=0;// 
a=0;//     .line 90
a=0;//     #v8=(Reference,Lcn/dm/a/a/a;);
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v8, v0, v1}, Lcn/dm/a/a/a;->b(J)V
a=0;// 
a=0;//     .line 91
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcn/dm/a/a/a;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     const-string v0, "name"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcn/dm/a/a/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcn/dm/a/a/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v8, p3}, Lcn/dm/a/a/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     const-string v0, "autoRun"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     .line 98
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, v0}, Lcn/dm/a/a/a;->a(I)V
a=0;// 
a=0;//     .line 99
a=0;//     const-string v0, "time_fragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v0, "180"
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Lcn/dm/a/a/a;->d(J)V
a=0;// 
a=0;//     .line 109
a=0;//     if-eqz p5, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     const-string v0, "launch_report"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 113
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1}, Lcn/dm/android/e/b;->a(Landroid/content/Context;)Lcn/dm/android/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcn/dm/a/a/a;->q()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v3, v6, :cond_4
a=0;// 
a=0;//     const-string v7, "task_launch"
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcn/dm/android/e/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {p1}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/a;);
a=0;//     invoke-virtual {v0, v8}, Lcn/dm/a/a;->e(Lcn/dm/a/a/a;)Lcn/dm/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference,Lcn/dm/a/a/a;);
a=0;//     const-string v0, "autoRun"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v3=(Integer);v4=(LongLo);v5=(LongHi);v6=(One);
a=0;//     const-string v7, "install_success"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 129
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-direct {p0, p1, v0}, Lcn/dm/android/OfferWallExecutor;->a(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 132
a=0;//     :pswitch_2
a=0;//     const-string v0, "\u5e94\u7528\u6b63\u5728\u4e0b\u8f7d\u4e2d\u2026"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/h;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 136
a=0;//     :pswitch_3
a=0;//     invoke-direct {p0, p1, v0}, Lcn/dm/android/OfferWallExecutor;->a(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 139
a=0;//     :pswitch_4
a=0;//     invoke-static {p1}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/a;);
a=0;//     invoke-virtual {v1, p1, v0}, Lcn/dm/a/a;->a(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 143
a=0;//     :pswitch_5
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/a;);
a=0;//     invoke-virtual {v1, p1, v0}, Lcn/dm/a/a;->c(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {p1}, Lcn/dm/android/e/b;->a(Landroid/content/Context;)Lcn/dm/android/e/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a/a;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/e/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 150
a=0;//     :pswitch_6
a=0;//     #v1=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " \u5df2\u52a0\u5165\u4e0b\u8f7d\u961f\u5217\uff0c\u8bf7\u7a0d\u540e"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/h;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_6
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lcn/dm/a/d/b;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lcn/dm/android/c/f;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     new-instance v0, Lcn/dm/android/OfferWallExecutor$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/OfferWallExecutor$1;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcn/dm/android/OfferWallExecutor$1;-><init>(Lcn/dm/android/OfferWallExecutor;Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/OfferWallExecutor$1;);
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/f;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 180
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, p1, p2}, Lcn/dm/android/OfferWallExecutor;->b(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/OfferWallExecutor;Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0, p1, p2}, Lcn/dm/android/OfferWallExecutor;->b(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 216
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "time_fragment"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 217
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v0, "180"
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 219
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "name"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 222
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 223
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 225
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     const-string v4, "android.intent.category.LAUNCHER"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 228
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     invoke-static {p1}, Lcn/dm/android/e/b;->a(Landroid/content/Context;)Lcn/dm/android/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x3e8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     mul-long v4, v3, v5
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v7, "task_launch"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcn/dm/android/e/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     invoke-static {p1}, Lcn/dm/android/e/b;->a(Landroid/content/Context;)Lcn/dm/android/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/e/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 217
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Lcn/dm/a/a/a;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-virtual {p2}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {p1}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/a;);
a=0;//     invoke-virtual {v0, p2}, Lcn/dm/a/a;->a(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p2}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2}, Lcn/dm/a/a/a;->i()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 195
a=0;//     :cond_1
a=0;//     invoke-static {p1}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/a;);
a=0;//     invoke-virtual {v0, p2}, Lcn/dm/a/a;->d(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 198
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p2}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " \u5df2\u52a0\u5165\u4e0b\u8f7d\u961f\u5217\uff0c\u8bf7\u7a0d\u540e"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/h;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "tr"    # Ljava/lang/String;
a=0;//     .param p3, "text"    # Ljava/lang/String;
a=0;//     .param p4, "isExecutable"    # Z
a=0;//     .param p5, "action_url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcn/dm/android/OfferWallExecutor;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "js call:doAction"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {p5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 51
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "download"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/OfferWallExecutor;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p4
a=0;// 
a=0;//     .line 53
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/dm/android/OfferWallExecutor;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v0, "inapp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     invoke-direct {p0, v0, p2}, Lcn/dm/android/OfferWallExecutor;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 60
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "launch"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {p1, v0}, Lcn/dm/android/f/a;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/OfferWallExecutor;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p4
a=0;// 
a=0;//     .line 66
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/dm/android/OfferWallExecutor;->b(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 76
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 68
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);
a=0;//     const-string v0, "failsafe"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p4
a=0;// 
a=0;//     .line 72
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/dm/android/OfferWallExecutor;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
