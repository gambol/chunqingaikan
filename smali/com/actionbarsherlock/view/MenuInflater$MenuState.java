package com.actionbarsherlock.view; class MenuInflater$MenuState { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/view/MenuInflater$MenuState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuInflater.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/view/MenuInflater;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "MenuState"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final defaultGroupId:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemCategory:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemCheckable:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemChecked:Z = false
a=0;// 
a=0;// .field private static final defaultItemEnabled:Z = true
a=0;// 
a=0;// .field private static final defaultItemId:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemOrder:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemVisible:Z = true
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private groupCategory:I
a=0;// 
a=0;// .field private groupCheckable:I
a=0;// 
a=0;// .field private groupEnabled:Z
a=0;// 
a=0;// .field private groupId:I
a=0;// 
a=0;// .field private groupOrder:I
a=0;// 
a=0;// .field private groupVisible:Z
a=0;// 
a=0;// .field private itemActionProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;// .field private itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;// .field private itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;// .field private itemActionViewLayout:I
a=0;// 
a=0;// .field private itemAdded:Z
a=0;// 
a=0;// .field private itemAlphabeticShortcut:C
a=0;// 
a=0;// .field private itemCategoryOrder:I
a=0;// 
a=0;// .field private itemCheckable:I
a=0;// 
a=0;// .field private itemChecked:Z
a=0;// 
a=0;// .field private itemEnabled:Z
a=0;// 
a=0;// .field private itemIconResId:I
a=0;// 
a=0;// .field private itemId:I
a=0;// 
a=0;// .field private itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;// .field private itemNumericShortcut:C
a=0;// 
a=0;// .field private itemShowAsAction:I
a=0;// 
a=0;// .field private itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private itemTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private itemVisible:Z
a=0;// 
a=0;// .field private menu:Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/view/MenuInflater;Lcom/actionbarsherlock/view/Menu;)V
a=0;//     .locals 0
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 307
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/view/MenuInflater$MenuState;);
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->menu:Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .line 309
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->resetGroup()V
a=0;// 
a=0;//     .line 310
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/view/MenuInflater$MenuState;)Lcom/actionbarsherlock/view/ActionProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getShortcut(Ljava/lang/String;)C
a=0;//     .locals 1
a=0;//     .param p1, "shortcutString"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 406
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 409
a=0;//     :goto_0
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "className"    # Ljava/lang/String;
a=0;//     .param p2, "constructorSignature"    # [Ljava/lang/Class;
a=0;//     .param p3, "arguments"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 486
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/view/MenuInflater;->access$0(Lcom/actionbarsherlock/view/MenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 487
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 488
a=0;//     .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     #v1=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 492
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 489
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 490
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "MenuInflater"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Cannot instantiate class: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 492
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setItem(Lcom/actionbarsherlock/view/MenuItem;)V
a=0;//     .locals 7
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 414
a=0;//     #v4=(One);
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemChecked:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {p1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setChecked(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 415
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     iget-boolean v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemVisible:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-interface {v3, v5}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 416
a=0;//     iget-boolean v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemEnabled:Z
a=0;// 
a=0;//     invoke-interface {v3, v5}, Lcom/actionbarsherlock/view/MenuItem;->setEnabled(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 417
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v3, v4, :cond_1
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v5, v3}, Lcom/actionbarsherlock/view/MenuItem;->setCheckable(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 418
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-interface {v3, v5}, Lcom/actionbarsherlock/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 419
a=0;//     iget v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemIconResId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, v5}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 420
a=0;//     iget-char v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemAlphabeticShortcut:C
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-interface {v3, v5}, Lcom/actionbarsherlock/view/MenuItem;->setAlphabeticShortcut(C)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 421
a=0;//     iget-char v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemNumericShortcut:C
a=0;// 
a=0;//     invoke-interface {v3, v5}, Lcom/actionbarsherlock/view/MenuItem;->setNumericShortcut(C)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 423
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemShowAsAction:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     .line 424
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemShowAsAction:I
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setShowAsAction(I)V
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/view/MenuInflater;->access$0(Lcom/actionbarsherlock/view/MenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->isRestricted()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 429
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v4, "The android:onClick attribute cannot be used within a restricted context"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 417
a=0;//     :cond_1
a=0;//     #v3=(Integer);v4=(One);v5=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 433
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v5=(Char);
a=0;//     new-instance v3, Lcom/actionbarsherlock/view/MenuInflater$InflatedOnMenuItemClickListener;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/actionbarsherlock/view/MenuInflater$InflatedOnMenuItemClickListener;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-static {v5}, Lcom/actionbarsherlock/view/MenuInflater;->access$3(Lcom/actionbarsherlock/view/MenuInflater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5, v6}, Lcom/actionbarsherlock/view/MenuInflater$InflatedOnMenuItemClickListener;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 432
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/MenuInflater$InflatedOnMenuItemClickListener;);
a=0;//     invoke-interface {p1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 436
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v3, v5, :cond_4
a=0;// 
a=0;//     .line 437
a=0;//     instance-of v3, p1, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     .line 438
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 439
a=0;//     .local v2, "impl":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->setExclusiveCheckable(Z)V
a=0;// 
a=0;//     .line 445
a=0;//     .end local v2    # "impl":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 446
a=0;//     .local v1, "actionViewSpecified":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 448
a=0;//     invoke-static {}, Lcom/actionbarsherlock/view/MenuInflater;->access$4()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-static {v5}, Lcom/actionbarsherlock/view/MenuInflater;->access$5(Lcom/actionbarsherlock/view/MenuInflater;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 447
a=0;//     invoke-direct {p0, v3, v4, v5}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "actionView":Landroid/view/View;
a=0;//     invoke-interface {p1, v0}, Lcom/actionbarsherlock/view/MenuItem;->setActionView(Landroid/view/View;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 450
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 452
a=0;//     .end local v0    # "actionView":Landroid/view/View;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_6
a=0;// 
a=0;//     .line 453
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 454
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setActionView(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 455
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 461
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setActionProvider(Lcom/actionbarsherlock/view/ActionProvider;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 464
a=0;//     :cond_7
a=0;//     return-void
a=0;// 
a=0;//     .line 441
a=0;//     .end local v1    # "actionViewSpecified":Z
a=0;//     :cond_8
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(One);v5=(PosByte);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->menu:Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/Menu;);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, v5, v4, v4}, Lcom/actionbarsherlock/view/Menu;->setGroupCheckable(IZZ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 457
a=0;//     .restart local v1    # "actionViewSpecified":Z
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v3, "MenuInflater"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addItem()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     .line 468
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->menu:Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/Menu;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCategoryOrder:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v0, v1, v2, v3, v4}, Lcom/actionbarsherlock/view/Menu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->setItem(Lcom/actionbarsherlock/view/MenuItem;)V
a=0;// 
a=0;//     .line 469
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenuItem()Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     .line 473
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->menu:Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/view/Menu;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCategoryOrder:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v1, v2, v3, v4, v5}, Lcom/actionbarsherlock/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 474
a=0;//     .local v0, "subMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/SubMenu;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/SubMenu;->getItem()Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->setItem(Lcom/actionbarsherlock/view/MenuItem;)V
a=0;// 
a=0;//     .line 475
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasAddedItem()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public readGroup(Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 325
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/view/MenuInflater;->access$0(Lcom/actionbarsherlock/view/MenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 326
a=0;//     sget-object v2, Lcom/actionbarsherlock/R$styleable;->SherlockMenuGroup:[I
a=0;// 
a=0;//     .line 325
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 328
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     .line 329
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupCategory:I
a=0;// 
a=0;//     .line 330
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupOrder:I
a=0;// 
a=0;//     .line 331
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupCheckable:I
a=0;// 
a=0;//     .line 332
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupVisible:Z
a=0;// 
a=0;//     .line 333
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupEnabled:Z
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 336
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public readItem(Landroid/util/AttributeSet;)V
a=0;//     .locals 12
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0xb
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 342
a=0;//     #v7=(Null);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-static {v5}, Lcom/actionbarsherlock/view/MenuInflater;->access$0(Lcom/actionbarsherlock/view/MenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 343
a=0;//     sget-object v9, Lcom/actionbarsherlock/R$styleable;->SherlockMenuItem:[I
a=0;// 
a=0;//     .line 342
a=0;//     #v9=(Reference,[I);
a=0;//     invoke-virtual {v5, p1, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 346
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemId:I
a=0;// 
a=0;//     .line 347
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v9, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupCategory:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v5, v9}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 348
a=0;//     .local v1, "category":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     iget v9, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupOrder:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v9}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 349
a=0;//     .local v3, "order":I
a=0;//     #v3=(Integer);
a=0;//     const/high16 v5, -0x10000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/2addr v5, v1
a=0;// 
a=0;//     const v9, 0xffff
a=0;// 
a=0;//     #v9=(Char);
a=0;//     and-int/2addr v9, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     or-int/2addr v5, v9
a=0;// 
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCategoryOrder:I
a=0;// 
a=0;//     .line 350
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 351
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {v0, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemIconResId:I
a=0;// 
a=0;//     .line 354
a=0;//     const/16 v5, 0x9
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->getShortcut(Ljava/lang/String;)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 353
a=0;//     #v5=(Char);
a=0;//     iput-char v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemAlphabeticShortcut:C
a=0;// 
a=0;//     .line 356
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->getShortcut(Ljava/lang/String;)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 355
a=0;//     #v5=(Char);
a=0;//     iput-char v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemNumericShortcut:C
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 359
a=0;//     invoke-virtual {v0, v11, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     :goto_0
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     .line 366
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v10, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemChecked:Z
a=0;// 
a=0;//     .line 367
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget-boolean v9, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupVisible:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-virtual {v0, v5, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemVisible:Z
a=0;// 
a=0;//     .line 368
a=0;//     iget-boolean v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupEnabled:Z
a=0;// 
a=0;//     invoke-virtual {v0, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemEnabled:Z
a=0;// 
a=0;//     .line 370
a=0;//     new-instance v4, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 371
a=0;//     .local v4, "value":Landroid/util/TypedValue;
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     const/16 v5, 0xd
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 372
a=0;//     iget v5, v4, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v9, 0x11
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v5, v9, :cond_2
a=0;// 
a=0;//     iget v5, v4, Landroid/util/TypedValue;->data:I
a=0;// 
a=0;//     :goto_2
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemShowAsAction:I
a=0;// 
a=0;//     .line 374
a=0;//     const/16 v5, 0xc
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;//     .line 375
a=0;//     const/16 v5, 0xe
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     .line 378
a=0;//     new-instance v4, Landroid/util/TypedValue;
a=0;// 
a=0;//     .end local v4    # "value":Landroid/util/TypedValue;
a=0;//     #v4=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 379
a=0;//     .restart local v4    # "value":Landroid/util/TypedValue;
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     const/16 v5, 0xf
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 380
a=0;//     iget v5, v4, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v10, :cond_3
a=0;// 
a=0;//     iget-object v5, v4, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_3
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 383
a=0;//     new-instance v4, Landroid/util/TypedValue;
a=0;// 
a=0;//     .end local v4    # "value":Landroid/util/TypedValue;
a=0;//     #v4=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 384
a=0;//     .restart local v4    # "value":Landroid/util/TypedValue;
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 385
a=0;//     iget v5, v4, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v10, :cond_4
a=0;// 
a=0;//     iget-object v5, v4, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_4
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 387
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 388
a=0;//     .local v2, "hasActionProvider":Z
a=0;//     :goto_5
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     iget v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 390
a=0;//     invoke-static {}, Lcom/actionbarsherlock/view/MenuInflater;->access$1()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 391
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->this$0:Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     invoke-static {v8}, Lcom/actionbarsherlock/view/MenuInflater;->access$2(Lcom/actionbarsherlock/view/MenuInflater;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 389
a=0;//     invoke-direct {p0, v5, v6, v8}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     .line 400
a=0;//     :goto_6
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 402
a=0;//     iput-boolean v7, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     .line 403
a=0;//     return-void
a=0;// 
a=0;//     .end local v2    # "hasActionProvider":Z
a=0;//     .end local v4    # "value":Landroid/util/TypedValue;
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v4=(Uninit);v5=(Boolean);v6=(One);v8=(Null);v9=(Integer);
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 359
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 363
a=0;//     :cond_1
a=0;//     #v5=(Boolean);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupCheckable:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 372
a=0;//     .restart local v4    # "value":Landroid/util/TypedValue;
a=0;//     :cond_2
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);v9=(PosByte);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Integer);
a=0;//     move-object v5, v8
a=0;// 
a=0;//     .line 380
a=0;//     #v5=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Integer);
a=0;//     move-object v5, v8
a=0;// 
a=0;//     .line 385
a=0;//     #v5=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 387
a=0;//     #v2=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 393
a=0;//     .restart local v2    # "hasActionProvider":Z
a=0;//     :cond_6
a=0;//     #v2=(Boolean);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 394
a=0;//     const-string v5, "MenuInflater"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Ignoring attribute \'actionProviderClass\'. Action view already specified."
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 397
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->itemActionProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public resetGroup()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     .line 314
a=0;//     iput v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupCategory:I
a=0;// 
a=0;//     .line 315
a=0;//     iput v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupOrder:I
a=0;// 
a=0;//     .line 316
a=0;//     iput v0, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupCheckable:I
a=0;// 
a=0;//     .line 317
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupVisible:Z
a=0;// 
a=0;//     .line 318
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->groupEnabled:Z
a=0;// 
a=0;//     .line 319
a=0;//     return-void
a=0;// .end method
}}
