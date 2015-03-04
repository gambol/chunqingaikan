package u.aly; class q { void a() { int a;
a=0;// .class public Lu/aly/q;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MemoCache.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lu/aly/p;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private b:Lu/aly/ah;
a=0;// 
a=0;// .field private c:Lu/aly/ai;
a=0;// 
a=0;// .field private d:Lu/aly/ak;
a=0;// 
a=0;// .field private e:Lu/aly/ax;
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lu/aly/q;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lu/aly/q;->a:Ljava/util/List;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object v1, p0, Lu/aly/q;->b:Lu/aly/ah;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object v1, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object v1, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object v1, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p1, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ai;);
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->getAppkey(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->a(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->e(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 164
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperType:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperVersion:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperType:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->f(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperVersion:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->g(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->u(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->c(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     sget-object v1, Lu/aly/bc;->a:Lu/aly/bc;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->a(Lu/aly/bc;)Lu/aly/ai;
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     const-string v1, "5.2.4"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->d(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->b(Ljava/lang/String;)Lu/aly/ai;
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->a(I)Lu/aly/ai;
a=0;// 
a=0;//     .line 175
a=0;//     sget v0, Lcom/umeng/analytics/AnalyticsConfig;->mVerticalType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ai;);
a=0;//     sget v1, Lcom/umeng/analytics/AnalyticsConfig;->mVerticalType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->c(I)Lu/aly/ai;
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     const-string v1, "5.2.4.1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ai;->d(Ljava/lang/String;)Lu/aly/ai;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 179
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ak;);
a=0;//     invoke-static {}, Lu/aly/bi;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->f(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->a(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->g(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->b(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->p(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->c(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->e(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     const-string v1, "Android"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->g(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->h(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {p1}, Lu/aly/bi;->r(Landroid/content/Context;)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 196
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v1, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     new-instance v2, Lu/aly/ba;
a=0;// 
a=0;//     #v2=(UninitRef,Lu/aly/ba;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget v3, v0, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v0, v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v2, v3, v0}, Lu/aly/ba;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/ba;);
a=0;//     invoke-virtual {v1, v2}, Lu/aly/ak;->a(Lu/aly/ba;)Lu/aly/ak;
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->GPU_RENDERER:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->GPU_VENDER:Ljava/lang/String;
a=0;// 
a=0;//     .line 204
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->i(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->j(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-wide v1, Landroid/os/Build;->TIME:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lu/aly/ak;->a(J)Lu/aly/ak;
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->k(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->l(Ljava/lang/String;)Lu/aly/ak;
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ak;->m(Ljava/lang/String;)Lu/aly/ak;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 213
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 210
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 211
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lu/aly/bi;->j(Landroid/content/Context;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const-string v1, "Wi-Fi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/ax;);
a=0;//     sget-object v2, Lu/aly/ag;->c:Lu/aly/ag;
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/ag;);
a=0;//     invoke-virtual {v1, v2}, Lu/aly/ax;->a(Lu/aly/ag;)Lu/aly/ax;
a=0;// 
a=0;//     .line 227
a=0;//     :goto_0
a=0;//     const-string v1, ""
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/ax;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1, v0}, Lu/aly/ax;->e(Ljava/lang/String;)Lu/aly/ax;
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);v1=(Conflicted);v2=(Boolean);
a=0;//     iget-object v0, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->s(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ax;->c(Ljava/lang/String;)Lu/aly/ax;
a=0;// 
a=0;//     .line 233
a=0;//     invoke-static {p1}, Lu/aly/bi;->n(Landroid/content/Context;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lu/aly/ax;->b(Ljava/lang/String;)Lu/aly/ax;
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1, v0}, Lu/aly/ax;->a(Ljava/lang/String;)Lu/aly/ax;
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ax;);
a=0;//     invoke-static {p1}, Lu/aly/bi;->m(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lu/aly/ax;->a(I)Lu/aly/ax;
a=0;// 
a=0;//     .line 239
a=0;//     sget v0, Lcom/umeng/analytics/AnalyticsConfig;->sAge:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 240
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->sGender:Lcom/umeng/analytics/Gender;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/Gender;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->sId:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 242
a=0;//     sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->sSource:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 243
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lu/aly/bg;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/bg;);
a=0;//     invoke-direct {v0}, Lu/aly/bg;-><init>()V
a=0;// 
a=0;//     .line 244
a=0;//     #v0=(Reference,Lu/aly/bg;);
a=0;//     sget v1, Lcom/umeng/analytics/AnalyticsConfig;->sAge:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/bg;->a(I)Lu/aly/bg;
a=0;// 
a=0;//     .line 245
a=0;//     sget-object v1, Lcom/umeng/analytics/AnalyticsConfig;->sGender:Lcom/umeng/analytics/Gender;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/Gender;);
a=0;//     invoke-static {v1}, Lcom/umeng/analytics/Gender;->transGender(Lcom/umeng/analytics/Gender;)Lu/aly/ap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/bg;->a(Lu/aly/ap;)Lu/aly/bg;
a=0;// 
a=0;//     .line 246
a=0;//     sget-object v1, Lcom/umeng/analytics/AnalyticsConfig;->sId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/bg;->a(Ljava/lang/String;)Lu/aly/bg;
a=0;// 
a=0;//     .line 247
a=0;//     sget-object v1, Lcom/umeng/analytics/AnalyticsConfig;->sSource:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lu/aly/bg;->b(Ljava/lang/String;)Lu/aly/bg;
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lu/aly/ax;->a(Lu/aly/bg;)Lu/aly/ax;
a=0;// 
a=0;//     .line 254
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 221
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Null);
a=0;//     const-string v1, "2G/3G"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/ax;);
a=0;//     sget-object v2, Lu/aly/ag;->b:Lu/aly/ag;
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/ag;);
a=0;//     invoke-virtual {v1, v2}, Lu/aly/ax;->a(Lu/aly/ag;)Lu/aly/ax;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 252
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 224
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Null);
a=0;//     iget-object v1, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/ax;);
a=0;//     sget-object v2, Lu/aly/ag;->a:Lu/aly/ag;
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/ag;);
a=0;//     invoke-virtual {v1, v2}, Lu/aly/ax;->a(Lu/aly/ag;)Lu/aly/ax;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private i()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "session_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized a(Lu/aly/ah;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-object p1, p0, Lu/aly/q;->b:Lu/aly/ah;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 102
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lu/aly/bf;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-direct {p0}, Lu/aly/q;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 70
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 75
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lu/aly/q;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lu/aly/q;->b:Lu/aly/ah;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lu/aly/q;->b:Lu/aly/ah;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/ah;)Lu/aly/bf;
a=0;// 
a=0;//     .line 83
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lu/aly/q;->b:Lu/aly/ah;
a=0;// 
a=0;//     .line 74
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lu/aly/ah;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {p0}, Lu/aly/q;->c()Lu/aly/ai;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/ai;)Lu/aly/bf;
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {p0}, Lu/aly/q;->d()Lu/aly/ak;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/ak;)Lu/aly/bf;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p0}, Lu/aly/q;->e()Lu/aly/ax;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/ax;)Lu/aly/bf;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {p0}, Lu/aly/q;->h()Lu/aly/aj;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/aj;)Lu/aly/bf;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p0}, Lu/aly/q;->f()Lu/aly/at;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/at;)Lu/aly/bf;
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {p0}, Lu/aly/q;->g()Lu/aly/as;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lu/aly/bf;->a(Lu/aly/as;)Lu/aly/bf;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lu/aly/p;
a=0;// 
a=0;//     .line 76
a=0;//     invoke-interface {v0, p1, v1}, Lu/aly/p;->a(Lu/aly/bf;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 74
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized a(Lu/aly/p;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 66
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 61
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lu/aly/q;->b:Lu/aly/ah;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/ah;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 51
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized c()Lu/aly/ai;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ai;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Lu/aly/ai;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/ai;);
a=0;//     invoke-direct {v0}, Lu/aly/ai;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ai;);
a=0;//     iput-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lu/aly/q;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lu/aly/q;->c:Lu/aly/ai;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 105
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized d()Lu/aly/ak;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ak;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v0, Lu/aly/ak;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/ak;);
a=0;//     invoke-direct {v0}, Lu/aly/ak;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ak;);
a=0;//     iput-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lu/aly/q;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lu/aly/q;->d:Lu/aly/ak;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 114
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized e()Lu/aly/ax;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ax;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v0, Lu/aly/ax;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/ax;);
a=0;//     invoke-direct {v0}, Lu/aly/ax;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/ax;);
a=0;//     iput-object v0, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lu/aly/q;->c(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lu/aly/q;->e:Lu/aly/ax;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 124
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public f()Lu/aly/at;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/h;->b(Landroid/content/Context;)Lu/aly/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lu/aly/f;->a()Lu/aly/at;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 135
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public g()Lu/aly/as;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/h;->a(Landroid/content/Context;)Lu/aly/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lu/aly/d;->b()Lu/aly/as;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 144
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public h()Lu/aly/aj;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/q;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/w;->a(Landroid/content/Context;)Lu/aly/aj;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 155
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 153
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v0, Lu/aly/aj;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/aj;);
a=0;//     invoke-direct {v0}, Lu/aly/aj;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/aj;);
a=0;//     goto :goto_0
a=0;// .end method
}}
