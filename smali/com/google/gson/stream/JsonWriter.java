package com.google.gson.stream; class JsonWriter { void a() { int a;
a=0;// .class public Lcom/google/gson/stream/JsonWriter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JsonWriter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Closeable;
a=0;// .implements Ljava/io/Flushable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;// .field private static final REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private deferredName:Ljava/lang/String;
a=0;// 
a=0;// .field private htmlSafe:Z
a=0;// 
a=0;// .field private indent:Ljava/lang/String;
a=0;// 
a=0;// .field private lenient:Z
a=0;// 
a=0;// .field private final out:Ljava/io/Writer;
a=0;// 
a=0;// .field private separator:Ljava/lang/String;
a=0;// 
a=0;// .field private serializeNulls:Z
a=0;// 
a=0;// .field private stack:[I
a=0;// 
a=0;// .field private stackSize:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     sput-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v1, 0x1f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const-string v2, "\\u%04x"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 146
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/16 v2, 0x22
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "\\\""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 150
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x5c
a=0;// 
a=0;//     const-string v3, "\\\\"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 151
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     const-string v3, "\\t"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 152
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     const-string v3, "\\b"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 153
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     const-string v3, "\\n"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 154
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     const-string v3, "\\r"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 155
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     const-string v3, "\\f"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 156
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, [Ljava/lang/String;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Ljava/lang/String;
a=0;// 
a=0;//     sput-object v1, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 157
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x3c
a=0;// 
a=0;//     const-string v3, "\\u003c"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 158
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x3e
a=0;// 
a=0;//     const-string v3, "\\u003e"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 159
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     const-string v3, "\\u0026"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 160
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x3d
a=0;// 
a=0;//     const-string v3, "\\u003d"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 161
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     const/16 v2, 0x27
a=0;// 
a=0;//     const-string v3, "\\u0027"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/Writer;)V
a=0;//     .locals 2
a=0;//     .param p1, "out"    # Ljava/io/Writer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 167
a=0;//     #p0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     .line 168
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     .line 170
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->push(I)V
a=0;// 
a=0;//     .line 182
a=0;//     const-string v0, ":"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->separator:Ljava/lang/String;
a=0;// 
a=0;//     .line 190
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->serializeNulls:Z
a=0;// 
a=0;//     .line 198
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "out == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private beforeName()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->peek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 581
a=0;//     .local v0, "context":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 582
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     const/16 v2, 0x2c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V
a=0;// 
a=0;//     .line 586
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->newline()V
a=0;// 
a=0;//     .line 587
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonWriter;->replaceTop(I)V
a=0;// 
a=0;//     .line 588
a=0;//     return-void
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 584
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Nesting problem."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private beforeValue(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "root"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 600
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->peek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 631
a=0;//     :pswitch_0
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Nesting problem."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 602
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->lenient:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 603
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "JSON must have only one top-level value."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 608
a=0;//     :cond_0
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->lenient:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 609
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "JSON must start with an array or an object."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 612
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->replaceTop(I)V
a=0;// 
a=0;//     .line 633
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 616
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->replaceTop(I)V
a=0;// 
a=0;//     .line 617
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->newline()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 621
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     const/16 v1, 0x2c
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     .line 622
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->newline()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 626
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 627
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->replaceTop(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 600
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private close(IILjava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 4
a=0;//     .param p1, "empty"    # I
a=0;//     .param p2, "nonempty"    # I
a=0;//     .param p3, "closeBracket"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->peek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 338
a=0;//     .local v0, "context":I
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p2, :cond_0
a=0;// 
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 339
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Nesting problem."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 341
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 342
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Dangling name: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 345
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     .line 346
a=0;//     if-ne v0, p2, :cond_2
a=0;// 
a=0;//     .line 347
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->newline()V
a=0;// 
a=0;//     .line 349
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v1, p3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 350
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private newline()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 565
a=0;//     iget-object v2, p0, Lcom/google/gson/stream/JsonWriter;->indent:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 573
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 569
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 570
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     .local v1, "size":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v2, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonWriter;->indent:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 570
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private open(ILjava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 1
a=0;//     .param p1, "empty"    # I
a=0;//     .param p2, "openBracket"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 326
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/stream/JsonWriter;->push(I)V
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 328
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private peek()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 367
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "JsonWriter is closed."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private push(I)V
a=0;//     .locals 4
a=0;//     .param p1, "newTop"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 354
a=0;//     #v3=(Null);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     .line 356
a=0;//     .local v0, "newStack":[I
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 357
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     .line 359
a=0;//     .end local v0    # "newStack":[I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     aput p1, v1, v2
a=0;// 
a=0;//     .line 360
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private replaceTop(I)V
a=0;//     .locals 2
a=0;//     .param p1, "topOfStack"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aput p1, v0, v1
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private string(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "value"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     iget-boolean v6, p0, Lcom/google/gson/stream/JsonWriter;->htmlSafe:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     sget-object v5, Lcom/google/gson/stream/JsonWriter;->HTML_SAFE_REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 534
a=0;//     .local v5, "replacements":[Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/Writer;);
a=0;//     const-string v7, "\""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 535
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 536
a=0;//     .local v2, "last":I
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 537
a=0;//     .local v3, "length":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v1, v3, :cond_6
a=0;// 
a=0;//     .line 538
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 540
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     const/16 v6, 0x80
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-ge v0, v6, :cond_2
a=0;// 
a=0;//     .line 541
a=0;//     aget-object v4, v5, v0
a=0;// 
a=0;//     .line 542
a=0;//     .local v4, "replacement":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 537
a=0;//     .end local v4    # "replacement":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 533
a=0;//     .end local v0    # "c":C
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "last":I
a=0;//     .end local v3    # "length":I
a=0;//     .end local v5    # "replacements":[Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     sget-object v5, Lcom/google/gson/stream/JsonWriter;->REPLACEMENT_CHARS:[Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 545
a=0;//     .restart local v0    # "c":C
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "last":I
a=0;//     .restart local v3    # "length":I
a=0;//     .restart local v5    # "replacements":[Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Char);v1=(Integer);v2=(Integer);v3=(Integer);v4=(Conflicted);v6=(PosShort);v7=(Conflicted);
a=0;//     const/16 v6, 0x2028
a=0;// 
a=0;//     if-ne v0, v6, :cond_5
a=0;// 
a=0;//     .line 546
a=0;//     const-string v4, "\\u2028"
a=0;// 
a=0;//     .line 552
a=0;//     .restart local v4    # "replacement":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-ge v2, v1, :cond_4
a=0;// 
a=0;//     .line 553
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/Writer;);
a=0;//     sub-int v7, v1, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, p1, v2, v7}, Ljava/io/Writer;->write(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 555
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v6, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 556
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 547
a=0;//     .end local v4    # "replacement":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);v6=(PosShort);
a=0;//     const/16 v6, 0x2029
a=0;// 
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     .line 548
a=0;//     const-string v4, "\\u2029"
a=0;// 
a=0;//     .restart local v4    # "replacement":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 558
a=0;//     .end local v0    # "c":C
a=0;//     .end local v4    # "replacement":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v3, :cond_7
a=0;// 
a=0;//     .line 559
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/Writer;);
a=0;//     sub-int v7, v3, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, p1, v2, v7}, Ljava/io/Writer;->write(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 561
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/Writer;);
a=0;//     const-string v7, "\""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 562
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private writeDeferredName()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 401
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->beforeName()V
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->string(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 403
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     .line 405
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 288
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const-string v1, "["
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/google/gson/stream/JsonWriter;->open(ILjava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 308
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const-string v1, "{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/google/gson/stream/JsonWriter;->open(ILjava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 523
a=0;//     #v2=(One);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v1}, Ljava/io/Writer;->close()V
a=0;// 
a=0;//     .line 525
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     .line 526
a=0;//     .local v0, "size":I
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v2, :cond_0
a=0;// 
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->stack:[I
a=0;// 
a=0;//     add-int/lit8 v2, v0, -0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     .line 527
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/io/IOException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v2, "Incomplete document"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 529
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     .line 530
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endArray()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "]"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/google/gson/stream/JsonWriter;->close(IILjava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public endObject()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/google/gson/stream/JsonWriter;->close(IILjava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public flush()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 512
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "JsonWriter is closed."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v0}, Ljava/io/Writer;->flush()V
a=0;// 
a=0;//     .line 515
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final getSerializeNulls()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->serializeNulls:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isHtmlSafe()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->htmlSafe:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isLenient()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->lenient:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 386
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 387
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "name == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 389
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 390
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 392
a=0;//     :cond_1
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonWriter;->stackSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 393
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "JsonWriter is closed."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     .line 396
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 430
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonWriter;->serializeNulls:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 431
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 437
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     const-string v1, "null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 439
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 433
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->deferredName:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final setHtmlSafe(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "htmlSafe"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     iput-boolean p1, p0, Lcom/google/gson/stream/JsonWriter;->htmlSafe:Z
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setIndent(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "indent"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->indent:Ljava/lang/String;
a=0;// 
a=0;//     .line 215
a=0;//     const-string v0, ":"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->separator:Ljava/lang/String;
a=0;// 
a=0;//     .line 220
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iput-object p1, p0, Lcom/google/gson/stream/JsonWriter;->indent:Ljava/lang/String;
a=0;// 
a=0;//     .line 218
a=0;//     const-string v0, ": "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonWriter;->separator:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final setLenient(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "lenient"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     iput-boolean p1, p0, Lcom/google/gson/stream/JsonWriter;->lenient:Z
a=0;// 
a=0;//     .line 236
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setSerializeNulls(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "serializeNulls"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     iput-boolean p1, p0, Lcom/google/gson/stream/JsonWriter;->serializeNulls:Z
a=0;// 
a=0;//     .line 270
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public value(D)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 3
a=0;//     .param p1, "value"    # D
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 463
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Numeric values must be finite, but was "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 465
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 466
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 468
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public value(J)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "value"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 478
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 480
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public value(Ljava/lang/Number;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 4
a=0;//     .param p1, "value"    # Ljava/lang/Number;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 492
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 503
a=0;//     .end local p0    # "this":Lcom/google/gson/stream/JsonWriter;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 495
a=0;//     .restart local p0    # "this":Lcom/google/gson/stream/JsonWriter;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 496
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 497
a=0;//     .local v0, "string":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v1, p0, Lcom/google/gson/stream/JsonWriter;->lenient:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "-Infinity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "Infinity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "NaN"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 499
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Numeric values must be finite, but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 501
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 502
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 415
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 420
a=0;//     .end local p0    # "this":Lcom/google/gson/stream/JsonWriter;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 417
a=0;//     .restart local p0    # "this":Lcom/google/gson/stream/JsonWriter;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 418
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 419
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/stream/JsonWriter;->string(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public value(Z)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "value"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonWriter;->writeDeferredName()V
a=0;// 
a=0;//     .line 449
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;->beforeValue(Z)V
a=0;// 
a=0;//     .line 450
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonWriter;->out:Ljava/io/Writer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 451
a=0;//     return-object p0
a=0;// 
a=0;//     .line 450
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     const-string v0, "false"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
