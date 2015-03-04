package com.actionbarsherlock.internal.view.menu; class ActionMenuPresenter$ActionButtonSubmenu { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
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
a=0;//     name = "ActionButtonSubmenu"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)V
a=0;//     .locals 6
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "subMenu"    # Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 648
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 649
a=0;//     invoke-direct {p0, p2, p3}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 652
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;);
a=0;//     invoke-virtual {p3}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getItem()Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 653
a=0;//     .local v3, "item":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isActionButton()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 655
a=0;//     invoke-static {p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->access$2(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     iget-object v5, p1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     check-cast v5, Landroid/view/View;
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 658
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->setCallback(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 660
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 661
a=0;//     .local v4, "preserveIconSpacing":Z
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p3}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 662
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     if-lt v2, v1, :cond_2
a=0;// 
a=0;//     .line 669
a=0;//     :goto_2
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->setForceShowIcon(Z)V
a=0;// 
a=0;//     .line 670
a=0;//     return-void
a=0;// 
a=0;//     .line 655
a=0;//     .end local v1    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "preserveIconSpacing":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Reference,Landroid/view/View;);
a=0;//     invoke-static {p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->access$2(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 663
a=0;//     .restart local v1    # "count":I
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v4    # "preserveIconSpacing":Z
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v4=(Null);v5=(Conflicted);
a=0;//     invoke-virtual {p3, v2}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 664
a=0;//     .local v0, "childItem":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->isVisible()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 665
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 666
a=0;//     #v4=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 662
a=0;//     :cond_3
a=0;//     #v4=(Null);v5=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 674
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->onDismiss()V
a=0;// 
a=0;//     .line 675
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->access$3(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;)V
a=0;// 
a=0;//     .line 676
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I
a=0;// 
a=0;//     .line 677
a=0;//     return-void
a=0;// .end method
}}
