package com.umeng.analytics.game; class UMGameAgent { void a() { int a;
a=0;// .class public Lcom/umeng/analytics/game/UMGameAgent;
a=0;// .super Lcom/umeng/analytics/MobclickAgent;
a=0;// .source "UMGameAgent.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "Input string is null or empty"
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "Input string must be less than 64 chars"
a=0;// 
a=0;// .field private static final c:Ljava/lang/String; = "Input value type is negative"
a=0;// 
a=0;// .field private static final d:Ljava/lang/String; = "The int value for \'Pay Channels\' ranges between 1 ~ 99 "
a=0;// 
a=0;// .field private static final e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;// .field private static f:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     new-instance v0, Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-direct {v0}, Lcom/umeng/analytics/game/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     sput-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/MobclickAgent;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/analytics/game/UMGameAgent;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(One);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 283
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 281
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 283
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bonus(DI)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmpg-double v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input value type is negative"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 255
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p2, v0, :cond_2
a=0;// 
a=0;//     .line 251
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "The int value for \'Pay Channels\' ranges between 1 ~ 99 "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(LongHi);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0, p1, p2}, Lcom/umeng/analytics/game/c;->a(DI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bonus(Ljava/lang/String;IDI)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 274
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmpg-double v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 264
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input value type is negative"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     if-lez p4, :cond_3
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p4, v0, :cond_4
a=0;// 
a=0;//     .line 269
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "The int value for \'Pay Channels\' ranges between 1 ~ 99 "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :cond_4
a=0;//     #v0=(PosByte);v1=(LongHi);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-wide v3, p2
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/umeng/analytics/game/c;->a(Ljava/lang/String;IDI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static buy(Ljava/lang/String;ID)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 218
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmpg-double v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 213
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input value type is negative"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0, p1, p2, p3}, Lcom/umeng/analytics/game/c;->a(Ljava/lang/String;ID)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static failLevel(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string must be less than 64 chars"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/analytics/game/c;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static finishLevel(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string must be less than 64 chars"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/analytics/game/c;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static init(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/analytics/game/c;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/analytics/game/UMGameAgent;->f:Landroid/content/Context;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static onEvent(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p0, p1}, Lcom/umeng/analytics/game/UMGameAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 289
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs onSocialEvent(Landroid/content/Context;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "context is null in onShareEvent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "4"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/umeng/analytics/social/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 297
a=0;//     invoke-static {p0, p1, p2}, Lcom/umeng/analytics/social/UMSocialService;->share(Landroid/content/Context;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs onSocialEvent(Landroid/content/Context;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "context is null in onShareEvent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 312
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 310
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "4"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/umeng/analytics/social/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 311
a=0;//     invoke-static {p0, p1}, Lcom/umeng/analytics/social/UMSocialService;->share(Landroid/content/Context;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static pay(DDI)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 162
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     if-lez p4, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p4, v0, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "The int value for \'Pay Channels\' ranges between 1 ~ 99 "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(LongLo);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     cmpg-double v0, p0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     cmpg-double v0, p2, v1
a=0;// 
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     .line 168
a=0;//     :cond_2
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input value type is negative"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(LongLo);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     move-wide v1, p0
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     move-wide v3, p2
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/umeng/analytics/game/c;->a(DDI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static pay(DLjava/lang/String;IDI)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     if-lez p6, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p6, v0, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "The int value for \'Pay Channels\' ranges between 1 ~ 99 "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 188
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(LongLo);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     cmpg-double v0, p0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     if-ltz p3, :cond_2
a=0;// 
a=0;//     cmpg-double v0, p4, v1
a=0;// 
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     .line 189
a=0;//     :cond_2
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input value type is negative"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(LongLo);
a=0;//     invoke-static {p2}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 194
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(LongLo);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     move-wide v1, p0
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-wide v5, p4
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     move v7, p6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/umeng/analytics/game/c;->a(DLjava/lang/String;IDI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setPlayerInfo(Ljava/lang/String;IILjava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     .line 37
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Input string is null or empty"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move-object p0, v1
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le p1, v2, :cond_2
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "The int value for \'Age\' range between 0~200"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lu/aly/bj;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move p1, v0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p3}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Input string is null or empty"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move-object p3, v1
a=0;// 
a=0;//     .line 58
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-static {p2}, Lcom/umeng/analytics/Gender;->getGender(I)Lcom/umeng/analytics/Gender;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/Gender;);
a=0;//     invoke-virtual {v0, p0, p1, v1, p3}, Lcom/umeng/analytics/game/c;->a(Ljava/lang/String;ILcom/umeng/analytics/Gender;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setPlayerLevel(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string must be less than 64 chars"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/analytics/game/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTraceSleepTime(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/analytics/game/c;->a(Z)V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static startLevel(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string must be less than 64 chars"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0}, Lcom/umeng/analytics/game/c;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static use(Ljava/lang/String;ID)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/game/UMGameAgent;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input string is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmpg-double v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 232
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Input value type is negative"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     sget-object v0, Lcom/umeng/analytics/game/UMGameAgent;->e:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-virtual {v0, p0, p1, p2, p3}, Lcom/umeng/analytics/game/c;->b(Ljava/lang/String;ID)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
