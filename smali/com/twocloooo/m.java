package com.twocloooo; class m { void a() { int a;
a=0;// .class Lcom/twocloooo/m;
a=0;// .super Ljava/util/TimerTask;
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
a=0;//     iput-object p1, p0, Lcom/twocloooo/m;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/m;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->e:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->e:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloooo/m;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/bm;->d(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->e:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/m;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/ay;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(PosByte);
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->e:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-ne v1, v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->e:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/twocloooo/ay;);v2=(Integer);v3=(One);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloooo/ay;->m:Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/m;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/ay;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
