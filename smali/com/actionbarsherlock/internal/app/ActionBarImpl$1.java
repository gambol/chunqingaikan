package com.actionbarsherlock.internal.app; class ActionBarImpl$1 { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorListenerAdapter;
a=0;// .source "ActionBarImpl.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     .line 110
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorListenerAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 3
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$0(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$0(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->setTranslationY(F)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$1(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTranslationY(F)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$2(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$3(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$2(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$1(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$1(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTransitioning(Z)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->access$4(Lcom/actionbarsherlock/internal/app/ActionBarImpl;Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;->this$0:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->completeDeferredDestroyActionMode()V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
}}
