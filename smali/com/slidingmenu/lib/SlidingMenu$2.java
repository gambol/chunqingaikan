package com.slidingmenu.lib; class SlidingMenu$2 { void a() { int a;
a=0;// .class Lcom/slidingmenu/lib/SlidingMenu$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SlidingMenu.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/slidingmenu/lib/SlidingMenu;->manageLayers(F)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;// .field private final synthetic val$layerType:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/slidingmenu/lib/SlidingMenu;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     iput p2, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->val$layerType:I
a=0;// 
a=0;//     .line 979
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 981
a=0;//     #v4=(Null);
a=0;//     const-string v1, "SlidingMenu"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "changing layerType. hardware? "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->val$layerType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 982
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->getContent()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->val$layerType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 983
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->getMenu()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->val$layerType:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 984
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->getSecondaryMenu()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 985
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->getSecondaryMenu()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/SlidingMenu$2;->val$layerType:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 987
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 981
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
