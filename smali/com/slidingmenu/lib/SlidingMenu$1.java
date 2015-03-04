package com.slidingmenu.lib; class SlidingMenu$1 { void a() { int a;
a=0;// .class Lcom/slidingmenu/lib/SlidingMenu$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SlidingMenu.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/slidingmenu/lib/SlidingMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final POSITION_CLOSE:I = 0x1
a=0;// 
a=0;// .field public static final POSITION_OPEN:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/slidingmenu/lib/SlidingMenu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/SlidingMenu$1;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     .line 212
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPageScrolled(IFI)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "positionOffset"    # F
a=0;//     .param p3, "positionOffsetPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageSelected(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$1;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-static {v0}, Lcom/slidingmenu/lib/SlidingMenu;->access$0(Lcom/slidingmenu/lib/SlidingMenu;)Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$1;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/slidingmenu/lib/SlidingMenu;->access$0(Lcom/slidingmenu/lib/SlidingMenu;)Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;->onOpen()V
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$1;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-static {v0}, Lcom/slidingmenu/lib/SlidingMenu;->access$1(Lcom/slidingmenu/lib/SlidingMenu;)Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu$1;->this$0:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/slidingmenu/lib/SlidingMenu;->access$1(Lcom/slidingmenu/lib/SlidingMenu;)Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;->onClose()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
