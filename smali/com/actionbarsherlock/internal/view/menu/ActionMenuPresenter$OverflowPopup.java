package com.actionbarsherlock.internal.view.menu; class ActionMenuPresenter$OverflowPopup { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// .super Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OverflowPopup"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;//     .locals 1
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p4, "anchorView"    # Landroid/view/View;
a=0;//     .param p5, "overflowOnly"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 632
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 633
a=0;//     invoke-direct {p0, p2, p3, p4, p5}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 634
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     iget-object v0, p1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;->setCallback(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 635
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 639
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->onDismiss()V
a=0;// 
a=0;//     .line 640
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->close()V
a=0;// 
a=0;//     .line 641
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->access$1(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;)V
a=0;// 
a=0;//     .line 642
a=0;//     return-void
a=0;// .end method
}}
