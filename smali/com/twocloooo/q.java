package com.twocloooo; class q { void a() { int a;
a=0;// .class Lcom/twocloooo/q;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/q;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     const-string v2, "showxp"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     const-string v1, "showxp"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/v;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/v;);
a=0;//     invoke-direct {v0}, Lcom/twocloooo/v;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/v;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/twocloooo/v;->a(Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy/MM/dd"
a=0;// 
a=0;//     sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v2, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;//     :try_end_0
a=0;//     .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_1
a=0;//     new-instance v3, Ljava/util/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Date;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     const-string v5, "showxp"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;//     :try_end_1
a=0;//     .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/Date;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     const-string v1, "showxp"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/v;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/v;);
a=0;//     invoke-direct {v0}, Lcom/twocloooo/v;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/v;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/twocloooo/v;->a(Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Reference,Ljava/util/Locale;);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/ParseException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/util/Date;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(One);v5=(PosByte);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v4, :cond_1
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v5, :cond_6
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->e(Lcom/twocloooo/DevNativeService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloooo/ay;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v2}, Lcom/twocloooo/bm;->d(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloooo/q;->a(Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     if-ne v2, v5, :cond_4
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloooo/ay;->m:Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloooo/q;->a(Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v1, v1, Lcom/twocloooo/c;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->e(Lcom/twocloooo/DevNativeService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloooo/ay;->k:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v2, v1}, Lcom/twocloooo/ba;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v1, v4, v6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_7
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloooo/c;->a(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloooo/be;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloooo/DevNativeService;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u6253\u5f00\u653b\u7565"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/twocloooo/c;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->e:Ljava/lang/Integer;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/twocloooo/c;->e:Ljava/lang/Integer;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/c;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     const-string v1, "stp"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&float_active&0"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     const-string v2, "float_show"
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloooo/ay;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v2, v4, v0, v3}, Lcom/twocloooo/bg;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Byte);v4=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloooo/DevNativeService;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "float_view.png"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/twocloooo/c;->a(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/download"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, ".apk"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u770b\u653b\u7565"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u653b\u7565\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(One);v5=(PosByte);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/twocloooo/c;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/c;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u5df2\u4e0b\u8f7d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v2, Lcom/twocloooo/DevNativeService;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "%"
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
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Uninit);
a=0;//     sput v3, Lcom/twocloooo/DevNativeService;->f:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/q;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->f(Lcom/twocloooo/DevNativeService;)Lcom/twocloooo/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u70b9\u6211\u5b89\u88c5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
