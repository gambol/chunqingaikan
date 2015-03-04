package com.google.gson.stream; class JsonReader { void a() { int a;
a=0;// .class public Lcom/google/gson/stream/JsonReader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JsonReader.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Closeable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MIN_INCOMPLETE_INTEGER:J = -0xcccccccccccccccL
a=0;// 
a=0;// .field private static final NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;// .field private static final NUMBER_CHAR_DECIMAL:I = 0x3
a=0;// 
a=0;// .field private static final NUMBER_CHAR_DIGIT:I = 0x2
a=0;// 
a=0;// .field private static final NUMBER_CHAR_EXP_DIGIT:I = 0x7
a=0;// 
a=0;// .field private static final NUMBER_CHAR_EXP_E:I = 0x5
a=0;// 
a=0;// .field private static final NUMBER_CHAR_EXP_SIGN:I = 0x6
a=0;// 
a=0;// .field private static final NUMBER_CHAR_FRACTION_DIGIT:I = 0x4
a=0;// 
a=0;// .field private static final NUMBER_CHAR_NONE:I = 0x0
a=0;// 
a=0;// .field private static final NUMBER_CHAR_SIGN:I = 0x1
a=0;// 
a=0;// .field private static final PEEKED_BEGIN_ARRAY:I = 0x3
a=0;// 
a=0;// .field private static final PEEKED_BEGIN_OBJECT:I = 0x1
a=0;// 
a=0;// .field private static final PEEKED_BUFFERED:I = 0xb
a=0;// 
a=0;// .field private static final PEEKED_DOUBLE_QUOTED:I = 0x9
a=0;// 
a=0;// .field private static final PEEKED_DOUBLE_QUOTED_NAME:I = 0xd
a=0;// 
a=0;// .field private static final PEEKED_END_ARRAY:I = 0x4
a=0;// 
a=0;// .field private static final PEEKED_END_OBJECT:I = 0x2
a=0;// 
a=0;// .field private static final PEEKED_EOF:I = 0x11
a=0;// 
a=0;// .field private static final PEEKED_FALSE:I = 0x6
a=0;// 
a=0;// .field private static final PEEKED_LONG:I = 0xf
a=0;// 
a=0;// .field private static final PEEKED_NONE:I = 0x0
a=0;// 
a=0;// .field private static final PEEKED_NULL:I = 0x7
a=0;// 
a=0;// .field private static final PEEKED_NUMBER:I = 0x10
a=0;// 
a=0;// .field private static final PEEKED_SINGLE_QUOTED:I = 0x8
a=0;// 
a=0;// .field private static final PEEKED_SINGLE_QUOTED_NAME:I = 0xc
a=0;// 
a=0;// .field private static final PEEKED_TRUE:I = 0x5
a=0;// 
a=0;// .field private static final PEEKED_UNQUOTED:I = 0xa
a=0;// 
a=0;// .field private static final PEEKED_UNQUOTED_NAME:I = 0xe
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final buffer:[C
a=0;// 
a=0;// .field private final in:Ljava/io/Reader;
a=0;// 
a=0;// .field private lenient:Z
a=0;// 
a=0;// .field private limit:I
a=0;// 
a=0;// .field private lineNumber:I
a=0;// 
a=0;// .field private lineStart:I
a=0;// 
a=0;// .field private peeked:I
a=0;// 
a=0;// .field private peekedLong:J
a=0;// 
a=0;// .field private peekedNumberLength:I
a=0;// 
a=0;// .field private peekedString:Ljava/lang/String;
a=0;// 
a=0;// .field private pos:I
a=0;// 
a=0;// .field private stack:[I
a=0;// 
a=0;// .field private stackSize:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     const-string v0, ")]}\'\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/google/gson/stream/JsonReader;->NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;//     .line 1532
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonReader$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonReader$1;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/stream/JsonReader$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonReader$1;);
a=0;//     sput-object v0, Lcom/google/gson/internal/JsonReaderInternalAccess;->INSTANCE:Lcom/google/gson/internal/JsonReaderInternalAccess;
a=0;// 
a=0;//     .line 1554
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/Reader;)V
a=0;//     .locals 3
a=0;//     .param p1, "in"    # Ljava/io/Reader;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 230
a=0;//     #p0=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     iput-boolean v1, p0, Lcom/google/gson/stream/JsonReader;->lenient:Z
a=0;// 
a=0;//     .line 238
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     .line 239
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 240
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 242
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 243
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     .line 245
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 269
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     .line 270
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 279
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "in == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iput-object p1, p0, Lcom/google/gson/stream/JsonReader;->in:Ljava/io/Reader;
a=0;// 
a=0;//     .line 283
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/google/gson/stream/JsonReader;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$002(Lcom/google/gson/stream/JsonReader;I)I
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iput p1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Lcom/google/gson/stream/JsonReader;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcom/google/gson/stream/JsonReader;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lcom/google/gson/stream/JsonReader;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private checkLenient()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1385
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonReader;->lenient:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1386
a=0;//     const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 1388
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private consumeNonExecutePrefix()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1514
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     .line 1515
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1517
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     sget-object v2, Lcom/google/gson/stream/JsonReader;->NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonReader;->NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1529
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 1521
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonReader;->NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 1522
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     sget-object v2, Lcom/google/gson/stream/JsonReader;->NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-char v2, v2, v0
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 1521
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1528
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     sget-object v2, Lcom/google/gson/stream/JsonReader;->NON_EXECUTE_PREFIX:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private doPeek()I
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 451
a=0;//     #v4=(One);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     aget v1, v6, v7
a=0;// 
a=0;//     .line 452
a=0;//     .local v1, "peekStack":I
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v4, :cond_3
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     aput v3, v6, v7
a=0;// 
a=0;//     .line 538
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     :sswitch_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 539
a=0;//     .local v0, "c":I
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 568
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 571
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 572
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 575
a=0;//     :cond_1
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->peekKeyword()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 576
a=0;//     .local v2, "result":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_14
a=0;// 
a=0;//     .line 590
a=0;//     .end local v2    # "result":I
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 454
a=0;//     .end local v0    # "c":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(PosByte);v4=(One);v5=(PosByte);v6=(Reference,[I);
a=0;//     if-ne v1, v3, :cond_4
a=0;// 
a=0;//     .line 456
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 457
a=0;//     .restart local v0    # "c":I
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_1
a=0;// 
a=0;//     .line 465
a=0;//     const-string v3, "Unterminated array"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 459
a=0;//     :sswitch_1
a=0;//     #v3=(PosByte);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 461
a=0;//     :sswitch_2
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     .end local v0    # "c":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-eq v1, v6, :cond_5
a=0;// 
a=0;//     if-ne v1, v8, :cond_9
a=0;// 
a=0;//     .line 468
a=0;//     :cond_5
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     aput v2, v5, v6
a=0;// 
a=0;//     .line 470
a=0;//     if-ne v1, v8, :cond_6
a=0;// 
a=0;//     .line 471
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 472
a=0;//     .restart local v0    # "c":I
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_2
a=0;// 
a=0;//     .line 480
a=0;//     const-string v3, "Unterminated object"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 474
a=0;//     :sswitch_3
a=0;//     #v3=(PosByte);
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 476
a=0;//     :sswitch_4
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 483
a=0;//     .end local v0    # "c":I
a=0;//     :cond_6
a=0;//     :sswitch_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 484
a=0;//     .restart local v0    # "c":I
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_3
a=0;// 
a=0;//     .line 497
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 498
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 499
a=0;//     int-to-char v3, v0
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->isLiteral(C)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 500
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 486
a=0;//     :sswitch_6
a=0;//     #v3=(PosByte);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 488
a=0;//     :sswitch_7
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 489
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 491
a=0;//     :sswitch_8
a=0;//     if-eq v1, v8, :cond_7
a=0;// 
a=0;//     .line 492
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 494
a=0;//     :cond_7
a=0;//     const-string v3, "Expected name"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 502
a=0;//     :cond_8
a=0;//     #v3=(Boolean);
a=0;//     const-string v3, "Expected name"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 505
a=0;//     .end local v0    # "c":I
a=0;//     :cond_9
a=0;//     #v0=(Uninit);v3=(PosByte);v5=(PosByte);v6=(PosByte);
a=0;//     if-ne v1, v2, :cond_b
a=0;// 
a=0;//     .line 506
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     aput v8, v6, v7
a=0;// 
a=0;//     .line 508
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 509
a=0;//     .restart local v0    # "c":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 519
a=0;//     :pswitch_1
a=0;//     const-string v3, "Expected \':\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 513
a=0;//     :pswitch_2
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 514
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-lt v6, v7, :cond_a
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v6=(Integer);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     aget-char v6, v6, v7
a=0;// 
a=0;//     #v6=(Char);
a=0;//     const/16 v7, 0x3e
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_0
a=0;// 
a=0;//     .line 515
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 521
a=0;//     .end local v0    # "c":I
a=0;//     :cond_b
a=0;//     #v0=(Uninit);v6=(PosByte);v7=(Integer);
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     if-ne v1, v6, :cond_d
a=0;// 
a=0;//     .line 522
a=0;//     iget-boolean v6, p0, Lcom/google/gson/stream/JsonReader;->lenient:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_c
a=0;// 
a=0;//     .line 523
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->consumeNonExecutePrefix()V
a=0;// 
a=0;//     .line 525
a=0;//     :cond_c
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     aput v5, v6, v7
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 526
a=0;//     :cond_d
a=0;//     #v6=(PosByte);
a=0;//     if-ne v1, v5, :cond_f
a=0;// 
a=0;//     .line 527
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {p0, v6}, Lcom/google/gson/stream/JsonReader;->nextNonWhitespace(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 528
a=0;//     .restart local v0    # "c":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v0, v6, :cond_e
a=0;// 
a=0;//     .line 529
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 531
a=0;//     :cond_e
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 532
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 534
a=0;//     .end local v0    # "c":I
a=0;//     :cond_f
a=0;//     #v0=(Uninit);v6=(PosByte);
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     if-ne v1, v6, :cond_0
a=0;// 
a=0;//     .line 535
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v4, "JsonReader is closed"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 541
a=0;//     .restart local v0    # "c":I
a=0;//     :sswitch_9
a=0;//     #v0=(Integer);v3=(PosByte);v4=(One);v6=(Conflicted);
a=0;//     if-ne v1, v4, :cond_10
a=0;// 
a=0;//     .line 542
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 548
a=0;//     :cond_10
a=0;//     :sswitch_a
a=0;//     if-eq v1, v4, :cond_11
a=0;// 
a=0;//     if-ne v1, v3, :cond_12
a=0;// 
a=0;//     .line 549
a=0;//     :cond_11
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 550
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 551
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 553
a=0;//     :cond_12
a=0;//     #v3=(PosByte);
a=0;//     const-string v3, "Unexpected value"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 556
a=0;//     :sswitch_b
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 557
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 559
a=0;//     :sswitch_c
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v4, :cond_13
a=0;// 
a=0;//     .line 560
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 562
a=0;//     :cond_13
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 564
a=0;//     :sswitch_d
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 566
a=0;//     :sswitch_e
a=0;//     iput v4, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 580
a=0;//     .restart local v2    # "result":I
a=0;//     :cond_14
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->peekNumber()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 581
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->isLiteral(C)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_15
a=0;// 
a=0;//     .line 586
a=0;//     const-string v3, "Expected value"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 589
a=0;//     :cond_15
a=0;//     #v3=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 590
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 539
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x22 -> :sswitch_c
a=0;//         0x27 -> :sswitch_b
a=0;//         0x2c -> :sswitch_a
a=0;//         0x3b -> :sswitch_a
a=0;//         0x5b -> :sswitch_d
a=0;//         0x5d -> :sswitch_9
a=0;//         0x7b -> :sswitch_e
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 457
a=0;//     :sswitch_data_1
a=0;//     .sparse-switch
a=0;//         0x2c -> :sswitch_0
a=0;//         0x3b -> :sswitch_2
a=0;//         0x5d -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 472
a=0;//     :sswitch_data_2
a=0;//     .sparse-switch
a=0;//         0x2c -> :sswitch_5
a=0;//         0x3b -> :sswitch_4
a=0;//         0x7d -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 484
a=0;//     :sswitch_data_3
a=0;//     .sparse-switch
a=0;//         0x22 -> :sswitch_6
a=0;//         0x27 -> :sswitch_7
a=0;//         0x7d -> :sswitch_8
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 509
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3a
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private fillBuffer(I)Z
a=0;//     .locals 7
a=0;//     .param p1, "minimum"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1252
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     .line 1253
a=0;//     .local v0, "buffer":[C
a=0;//     #v0=(Reference,[C);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     .line 1254
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     if-eq v3, v4, :cond_3
a=0;// 
a=0;//     .line 1255
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 1256
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     invoke-static {v0, v3, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 1261
a=0;//     :goto_0
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1263
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->in:Ljava/io/Reader;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/Reader;);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4, v5}, Ljava/io/Reader;->read([CII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "total":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v1, v3, :cond_2
a=0;// 
a=0;//     .line 1264
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 1267
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     aget-char v3, v0, v2
a=0;// 
a=0;//     #v3=(Char);
a=0;//     const v4, 0xfeff
a=0;// 
a=0;//     #v4=(Char);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 1268
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1269
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     .line 1270
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     .line 1273
a=0;//     :cond_1
a=0;//     #v4=(Integer);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-lt v3, p1, :cond_0
a=0;// 
a=0;//     .line 1274
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1277
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 1258
a=0;//     .end local v1    # "total":I
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getColumnNumber()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1285
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getLineNumber()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1281
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private isLiteral(C)Z
a=0;//     .locals 1
a=0;//     .param p1, "c"    # C
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 741
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 761
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 747
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 759
a=0;//     :sswitch_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 741
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x9 -> :sswitch_1
a=0;//         0xa -> :sswitch_1
a=0;//         0xc -> :sswitch_1
a=0;//         0xd -> :sswitch_1
a=0;//         0x20 -> :sswitch_1
a=0;//         0x23 -> :sswitch_0
a=0;//         0x2c -> :sswitch_1
a=0;//         0x2f -> :sswitch_0
a=0;//         0x3a -> :sswitch_1
a=0;//         0x3b -> :sswitch_0
a=0;//         0x3d -> :sswitch_0
a=0;//         0x5b -> :sswitch_1
a=0;//         0x5c -> :sswitch_0
a=0;//         0x5d -> :sswitch_1
a=0;//         0x7b -> :sswitch_1
a=0;//         0x7d -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private nextNonWhitespace(Z)I
a=0;//     .locals 10
a=0;//     .param p1, "throwOnEof"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1303
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     .line 1304
a=0;//     .local v0, "buffer":[C
a=0;//     #v0=(Reference,[C);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1305
a=0;//     .local v4, "p":I
a=0;//     #v4=(Integer);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 1307
a=0;//     .local v3, "l":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ne v4, v3, :cond_1
a=0;// 
a=0;//     .line 1308
a=0;//     iput v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1309
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 1376
a=0;//     if-eqz p1, :cond_8
a=0;// 
a=0;//     .line 1377
a=0;//     new-instance v7, Ljava/io/EOFException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/EOFException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "End of input at line "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " column "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/EOFException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1312
a=0;//     :cond_0
a=0;//     #v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1313
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 1316
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "p":I
a=0;//     .local v5, "p":I
a=0;//     #v5=(Integer);
a=0;//     aget-char v1, v0, v4
a=0;// 
a=0;//     .line 1317
a=0;//     .local v1, "c":I
a=0;//     #v1=(Char);
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v1, v7, :cond_2
a=0;// 
a=0;//     .line 1318
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 1319
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1320
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1321
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_2
a=0;//     #v7=(PosByte);
a=0;//     const/16 v7, 0x20
a=0;// 
a=0;//     if-eq v1, v7, :cond_9
a=0;// 
a=0;//     const/16 v7, 0xd
a=0;// 
a=0;//     if-eq v1, v7, :cond_9
a=0;// 
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     if-ne v1, v7, :cond_3
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1322
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1325
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_3
a=0;//     const/16 v7, 0x2f
a=0;// 
a=0;//     if-ne v1, v7, :cond_6
a=0;// 
a=0;//     .line 1326
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1327
a=0;//     if-ne v5, v3, :cond_4
a=0;// 
a=0;//     .line 1328
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1329
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1330
a=0;//     .local v2, "charsLoaded":Z
a=0;//     #v2=(Boolean);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1331
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1380
a=0;//     .end local v1    # "c":I
a=0;//     .end local v2    # "charsLoaded":Z
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v5=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1336
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v1    # "c":I
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_4
a=0;//     #v1=(Char);v5=(Integer);
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 1337
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     aget-char v6, v0, v7
a=0;// 
a=0;//     .line 1338
a=0;//     .local v6, "peek":C
a=0;//     #v6=(Char);
a=0;//     sparse-switch v6, :sswitch_data_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1358
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1341
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     :sswitch_0
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1342
a=0;//     const-string v7, "*/"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->skipTo(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 1343
a=0;//     const-string v7, "Unterminated comment"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     throw v7
a=0;// 
a=0;//     .line 1345
a=0;//     :cond_5
a=0;//     #v7=(Boolean);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v4, v7, 0x2
a=0;// 
a=0;//     .line 1346
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 1347
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1351
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     :sswitch_1
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1352
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->skipToEndOfLine()V
a=0;// 
a=0;//     .line 1353
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1354
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 1355
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1360
a=0;//     .end local v4    # "p":I
a=0;//     .end local v6    # "peek":C
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v7=(PosByte);
a=0;//     const/16 v7, 0x23
a=0;// 
a=0;//     if-ne v1, v7, :cond_7
a=0;// 
a=0;//     .line 1361
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1367
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 1368
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->skipToEndOfLine()V
a=0;// 
a=0;//     .line 1369
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1370
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1372
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_7
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1373
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1380
a=0;//     .end local v1    # "c":I
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v5=(Conflicted);v7=(Boolean);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v1    # "c":I
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_9
a=0;//     #v1=(Char);v5=(Integer);v7=(PosByte);
a=0;//     move v4, v5
a=0;// 
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1338
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x2a -> :sswitch_0
a=0;//         0x2f -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private nextQuotedValue(C)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p1, "quote"    # C
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 976
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     .line 977
a=0;//     .local v0, "buffer":[C
a=0;//     #v0=(Reference,[C);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 979
a=0;//     .local v1, "builder":Ljava/lang/StringBuilder;
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 980
a=0;//     .local v4, "p":I
a=0;//     #v4=(Integer);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 982
a=0;//     .local v3, "l":I
a=0;//     #v3=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     .local v6, "start":I
a=0;//     #v6=(Integer);
a=0;//     move v5, v4
a=0;// 
a=0;//     .line 983
a=0;//     .end local v4    # "p":I
a=0;//     .local v5, "p":I
a=0;//     :goto_0
a=0;//     #v5=(Integer);
a=0;//     if-ge v5, v3, :cond_4
a=0;// 
a=0;//     .line 984
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     aget-char v2, v0, v5
a=0;// 
a=0;//     .line 986
a=0;//     .local v2, "c":I
a=0;//     #v2=(Char);
a=0;//     if-ne v2, p1, :cond_1
a=0;// 
a=0;//     .line 987
a=0;//     iput v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 988
a=0;//     sub-int v7, v4, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0, v6, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 989
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 990
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     const/16 v7, 0x5c
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v2, v7, :cond_3
a=0;// 
a=0;//     .line 991
a=0;//     iput v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 992
a=0;//     sub-int v7, v4, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0, v6, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 993
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->readEscapeCharacter()C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 994
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 995
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 996
a=0;//     move v6, v4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     move v5, v4
a=0;// 
a=0;//     .line 1001
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 997
a=0;//     .end local v5    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     :cond_3
a=0;//     #v7=(PosByte);
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     if-ne v2, v7, :cond_2
a=0;// 
a=0;//     .line 998
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 999
a=0;//     iput v4, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1003
a=0;//     .end local v2    # "c":I
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v5    # "p":I
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v7=(Conflicted);
a=0;//     sub-int v7, v5, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v1, v0, v6, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1004
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1005
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 1006
a=0;//     const-string v7, "Unterminated string"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     throw v7
a=0;// .end method
a=0;// 
a=0;// .method private nextUnquotedValue()Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1016
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1017
a=0;//     .local v0, "builder":Ljava/lang/StringBuilder;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1021
a=0;//     .local v1, "i":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     .line 1022
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/2addr v4, v1
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     sparse-switch v3, :sswitch_data_0
a=0;// 
a=0;//     .line 1021
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1028
a=0;//     :sswitch_0
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :sswitch_1
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 1067
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     invoke-direct {v2, v3, v4, v1}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     .line 1072
a=0;//     .local v2, "result":Ljava/lang/String;
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1073
a=0;//     return-object v2
a=0;// 
a=0;//     .line 1045
a=0;//     .end local v2    # "result":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_3
a=0;// 
a=0;//     .line 1046
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_3
a=0;//     #v3=(Integer);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1055
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .end local v0    # "builder":Ljava/lang/StringBuilder;
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 1057
a=0;//     .restart local v0    # "builder":Ljava/lang/StringBuilder;
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1058
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1059
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1060
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1069
a=0;//     :cond_5
a=0;//     #v1=(Integer);v3=(Char);
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1070
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .restart local v2    # "result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1022
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x9 -> :sswitch_1
a=0;//         0xa -> :sswitch_1
a=0;//         0xc -> :sswitch_1
a=0;//         0xd -> :sswitch_1
a=0;//         0x20 -> :sswitch_1
a=0;//         0x23 -> :sswitch_0
a=0;//         0x2c -> :sswitch_1
a=0;//         0x2f -> :sswitch_0
a=0;//         0x3a -> :sswitch_1
a=0;//         0x3b -> :sswitch_0
a=0;//         0x3d -> :sswitch_0
a=0;//         0x5b -> :sswitch_1
a=0;//         0x5c -> :sswitch_0
a=0;//         0x5d -> :sswitch_1
a=0;//         0x7b -> :sswitch_1
a=0;//         0x7d -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private peekKeyword()I
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 595
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget-char v0, v7, v8
a=0;// 
a=0;//     .line 599
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     const/16 v7, 0x74
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v0, v7, :cond_0
a=0;// 
a=0;//     const/16 v7, 0x54
a=0;// 
a=0;//     if-ne v0, v7, :cond_1
a=0;// 
a=0;//     .line 600
a=0;//     :cond_0
a=0;//     const-string v2, "true"
a=0;// 
a=0;//     .line 601
a=0;//     .local v2, "keyword":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "TRUE"
a=0;// 
a=0;//     .line 602
a=0;//     .local v3, "keywordUpper":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     .line 616
a=0;//     .local v5, "peeking":I
a=0;//     :goto_0
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 617
a=0;//     .local v4, "length":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v7=(Char);
a=0;//     if-ge v1, v4, :cond_8
a=0;// 
a=0;//     .line 618
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v7, v1
a=0;// 
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-lt v7, v8, :cond_6
a=0;// 
a=0;//     add-int/lit8 v7, v1, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 634
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "keyword":Ljava/lang/String;
a=0;//     .end local v3    # "keywordUpper":Ljava/lang/String;
a=0;//     .end local v4    # "length":I
a=0;//     .end local v5    # "peeking":I
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);v7=(Char);
a=0;//     return v5
a=0;// 
a=0;//     .line 603
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(PosByte);
a=0;//     const/16 v7, 0x66
a=0;// 
a=0;//     if-eq v0, v7, :cond_2
a=0;// 
a=0;//     const/16 v7, 0x46
a=0;// 
a=0;//     if-ne v0, v7, :cond_3
a=0;// 
a=0;//     .line 604
a=0;//     :cond_2
a=0;//     const-string v2, "false"
a=0;// 
a=0;//     .line 605
a=0;//     .restart local v2    # "keyword":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "FALSE"
a=0;// 
a=0;//     .line 606
a=0;//     .restart local v3    # "keywordUpper":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     .restart local v5    # "peeking":I
a=0;//     #v5=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 607
a=0;//     .end local v2    # "keyword":Ljava/lang/String;
a=0;//     .end local v3    # "keywordUpper":Ljava/lang/String;
a=0;//     .end local v5    # "peeking":I
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     const/16 v7, 0x6e
a=0;// 
a=0;//     if-eq v0, v7, :cond_4
a=0;// 
a=0;//     const/16 v7, 0x4e
a=0;// 
a=0;//     if-ne v0, v7, :cond_5
a=0;// 
a=0;//     .line 608
a=0;//     :cond_4
a=0;//     const-string v2, "null"
a=0;// 
a=0;//     .line 609
a=0;//     .restart local v2    # "keyword":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "NULL"
a=0;// 
a=0;//     .line 610
a=0;//     .restart local v3    # "keywordUpper":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     .restart local v5    # "peeking":I
a=0;//     #v5=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v2    # "keyword":Ljava/lang/String;
a=0;//     .end local v3    # "keywordUpper":Ljava/lang/String;
a=0;//     .end local v5    # "peeking":I
a=0;//     :cond_5
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 612
a=0;//     #v5=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 621
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "keyword":Ljava/lang/String;
a=0;//     .restart local v3    # "keywordUpper":Ljava/lang/String;
a=0;//     .restart local v4    # "length":I
a=0;//     .restart local v5    # "peeking":I
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Integer);v5=(PosByte);v7=(Integer);
a=0;//     iget-object v7, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/2addr v8, v1
a=0;// 
a=0;//     aget-char v0, v7, v8
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     if-eq v0, v7, :cond_7
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eq v0, v7, :cond_7
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 623
a=0;//     #v5=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 617
a=0;//     :cond_7
a=0;//     #v5=(PosByte);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 627
a=0;//     :cond_8
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v7, v4
a=0;// 
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-lt v7, v8, :cond_9
a=0;// 
a=0;//     add-int/lit8 v7, v4, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     :cond_9
a=0;//     #v7=(Integer);
a=0;//     iget-object v7, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/2addr v8, v4
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-direct {p0, v7}, Lcom/google/gson/stream/JsonReader;->isLiteral(C)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 629
a=0;//     #v5=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 633
a=0;//     :cond_a
a=0;//     #v5=(PosByte);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v6, v4
a=0;// 
a=0;//     iput v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 634
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private peekNumber()I
a=0;//     .locals 17
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 639
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     iget-object v1, v0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     .line 640
a=0;//     .local v1, "buffer":[C
a=0;//     #v1=(Reference,[C);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v10, v0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 641
a=0;//     .local v10, "p":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 643
a=0;//     .local v5, "l":I
a=0;//     #v5=(Integer);
a=0;//     const-wide/16 v11, 0x0
a=0;// 
a=0;//     .line 644
a=0;//     .local v11, "value":J
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 645
a=0;//     .local v7, "negative":Z
a=0;//     #v7=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 646
a=0;//     .local v3, "fitsInLong":Z
a=0;//     #v3=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 648
a=0;//     .local v6, "last":I
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 652
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Boolean);v4=(Integer);v6=(PosByte);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     add-int v13, v10, v4
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ne v13, v5, :cond_4
a=0;// 
a=0;//     .line 653
a=0;//     array-length v13, v1
a=0;// 
a=0;//     if-ne v4, v13, :cond_0
a=0;// 
a=0;//     .line 656
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 736
a=0;//     .end local v11    # "value":J
a=0;//     :goto_1
a=0;//     #v13=(PosByte);
a=0;//     return v13
a=0;// 
a=0;//     .line 658
a=0;//     .restart local v11    # "value":J
a=0;//     :cond_0
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v13, v4, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v13}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_3
a=0;// 
a=0;//     .line 727
a=0;//     :cond_1
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-ne v6, v13, :cond_17
a=0;// 
a=0;//     if-eqz v3, :cond_17
a=0;// 
a=0;//     const-wide/high16 v13, -0x8000000000000000L
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v13, v11, v13
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-nez v13, :cond_2
a=0;// 
a=0;//     if-eqz v7, :cond_17
a=0;// 
a=0;//     .line 728
a=0;//     :cond_2
a=0;//     if-eqz v7, :cond_16
a=0;// 
a=0;//     .end local v11    # "value":J
a=0;//     :goto_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-wide v11, v0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     .line 729
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/2addr v13, v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v13, v0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 730
a=0;//     const/16 v13, 0xf
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v13, v0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 661
a=0;//     .restart local v11    # "value":J
a=0;//     :cond_3
a=0;//     #v13=(Boolean);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v10, v0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 662
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .line 665
a=0;//     :cond_4
a=0;//     #v13=(Integer);
a=0;//     add-int v13, v10, v4
a=0;// 
a=0;//     aget-char v2, v1, v13
a=0;// 
a=0;//     .line 666
a=0;//     .local v2, "c":C
a=0;//     #v2=(Char);
a=0;//     sparse-switch v2, :sswitch_data_0
a=0;// 
a=0;//     .line 701
a=0;//     const/16 v13, 0x30
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-lt v2, v13, :cond_5
a=0;// 
a=0;//     const/16 v13, 0x39
a=0;// 
a=0;//     if-le v2, v13, :cond_d
a=0;// 
a=0;//     .line 702
a=0;//     :cond_5
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v2}, Lcom/google/gson/stream/JsonReader;->isLiteral(C)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     .line 705
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 668
a=0;//     :sswitch_0
a=0;//     #v13=(Integer);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 669
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 670
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 651
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v7=(Boolean);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 672
a=0;//     :cond_7
a=0;//     const/4 v13, 0x5
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-ne v6, v13, :cond_8
a=0;// 
a=0;//     .line 673
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     .line 674
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 676
a=0;//     :cond_8
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 679
a=0;//     :sswitch_1
a=0;//     #v13=(Integer);
a=0;//     const/4 v13, 0x5
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-ne v6, v13, :cond_9
a=0;// 
a=0;//     .line 680
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     .line 681
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 683
a=0;//     :cond_9
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 687
a=0;//     :sswitch_2
a=0;//     #v13=(Integer);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-eq v6, v13, :cond_a
a=0;// 
a=0;//     const/4 v13, 0x4
a=0;// 
a=0;//     if-ne v6, v13, :cond_b
a=0;// 
a=0;//     .line 688
a=0;//     :cond_a
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     .line 689
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 691
a=0;//     :cond_b
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 694
a=0;//     :sswitch_3
a=0;//     #v13=(Integer);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-ne v6, v13, :cond_c
a=0;// 
a=0;//     .line 695
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     .line 696
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 698
a=0;//     :cond_c
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 707
a=0;//     :cond_d
a=0;//     #v13=(PosByte);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     if-eq v6, v13, :cond_e
a=0;// 
a=0;//     if-nez v6, :cond_f
a=0;// 
a=0;//     .line 708
a=0;//     :cond_e
a=0;//     add-int/lit8 v13, v2, -0x30
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     neg-int v13, v13
a=0;// 
a=0;//     int-to-long v11, v13
a=0;// 
a=0;//     .line 709
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 710
a=0;//     :cond_f
a=0;//     #v13=(One);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-ne v6, v13, :cond_13
a=0;// 
a=0;//     .line 711
a=0;//     const-wide/16 v13, 0x0
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v13, v11, v13
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-nez v13, :cond_10
a=0;// 
a=0;//     .line 712
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 714
a=0;//     :cond_10
a=0;//     #v13=(Byte);
a=0;//     const-wide/16 v13, 0xa
a=0;// 
a=0;//     #v13=(LongLo);
a=0;//     mul-long/2addr v13, v11
a=0;// 
a=0;//     add-int/lit8 v15, v2, -0x30
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     int-to-long v15, v15
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     sub-long v8, v13, v15
a=0;// 
a=0;//     .line 715
a=0;//     .local v8, "newValue":J
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide v13, -0xcccccccccccccccL
a=0;// 
a=0;//     cmp-long v13, v11, v13
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-gtz v13, :cond_11
a=0;// 
a=0;//     const-wide v13, -0xcccccccccccccccL
a=0;// 
a=0;//     #v13=(LongLo);
a=0;//     cmp-long v13, v11, v13
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-nez v13, :cond_12
a=0;// 
a=0;//     cmp-long v13, v8, v11
a=0;// 
a=0;//     if-gez v13, :cond_12
a=0;// 
a=0;//     :cond_11
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     #v13=(Boolean);
a=0;//     and-int/2addr v3, v13
a=0;// 
a=0;//     .line 717
a=0;//     move-wide v11, v8
a=0;// 
a=0;//     .line 718
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 715
a=0;//     :cond_12
a=0;//     #v13=(Byte);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 718
a=0;//     .end local v8    # "newValue":J
a=0;//     :cond_13
a=0;//     #v8=(Conflicted);v9=(Conflicted);v13=(PosByte);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     const/4 v13, 0x3
a=0;// 
a=0;//     if-ne v6, v13, :cond_14
a=0;// 
a=0;//     .line 719
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 720
a=0;//     :cond_14
a=0;//     const/4 v13, 0x5
a=0;// 
a=0;//     if-eq v6, v13, :cond_15
a=0;// 
a=0;//     const/4 v13, 0x6
a=0;// 
a=0;//     if-ne v6, v13, :cond_6
a=0;// 
a=0;//     .line 721
a=0;//     :cond_15
a=0;//     const/4 v6, 0x7
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 728
a=0;//     .end local v2    # "c":C
a=0;//     :cond_16
a=0;//     #v2=(Conflicted);v13=(Byte);v14=(LongHi);
a=0;//     neg-long v11, v11
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 731
a=0;//     :cond_17
a=0;//     #v14=(Conflicted);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-eq v6, v13, :cond_18
a=0;// 
a=0;//     const/4 v13, 0x4
a=0;// 
a=0;//     if-eq v6, v13, :cond_18
a=0;// 
a=0;//     const/4 v13, 0x7
a=0;// 
a=0;//     if-ne v6, v13, :cond_19
a=0;// 
a=0;//     .line 733
a=0;//     :cond_18
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v4, v0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     .line 734
a=0;//     const/16 v13, 0x10
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v13, v0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 736
a=0;//     :cond_19
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 666
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x2b -> :sswitch_1
a=0;//         0x2d -> :sswitch_0
a=0;//         0x2e -> :sswitch_3
a=0;//         0x45 -> :sswitch_2
a=0;//         0x65 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private push(I)V
a=0;//     .locals 4
a=0;//     .param p1, "newTop"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1238
a=0;//     #v3=(Null);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 1239
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     .line 1240
a=0;//     .local v0, "newStack":[I
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 1241
a=0;//     iput-object v0, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     .line 1243
a=0;//     .end local v0    # "newStack":[I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     aput p1, v1, v2
a=0;// 
a=0;//     .line 1244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private readEscapeCharacter()C
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     .line 1444
a=0;//     #v10=(PosByte);
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1445
a=0;//     const-string v5, "Unterminated escape sequence"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 1448
a=0;//     :cond_0
a=0;//     #v5=(Integer);
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v7, v6, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     aget-char v2, v5, v6
a=0;// 
a=0;//     .line 1449
a=0;//     .local v2, "escaped":C
a=0;//     #v2=(Char);
a=0;//     sparse-switch v2, :sswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 1496
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Char);
a=0;//     return v4
a=0;// 
a=0;//     .line 1451
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,[C);
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x4
a=0;// 
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-le v5, v6, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, v10}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 1452
a=0;//     const-string v5, "Unterminated escape sequence"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 1455
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1456
a=0;//     .local v4, "result":C
a=0;//     #v4=(Null);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v1, v3, 0x4
a=0;// 
a=0;//     .local v1, "end":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Char);
a=0;//     if-ge v3, v1, :cond_5
a=0;// 
a=0;//     .line 1457
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     aget-char v0, v5, v3
a=0;// 
a=0;//     .line 1458
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     shl-int/lit8 v5, v4, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-char v4, v5
a=0;// 
a=0;//     .line 1459
a=0;//     const/16 v5, 0x30
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v0, v5, :cond_2
a=0;// 
a=0;//     const/16 v5, 0x39
a=0;// 
a=0;//     if-gt v0, v5, :cond_2
a=0;// 
a=0;//     .line 1460
a=0;//     add-int/lit8 v5, v0, -0x30
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v4
a=0;// 
a=0;//     int-to-char v4, v5
a=0;// 
a=0;//     .line 1456
a=0;//     :goto_3
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1461
a=0;//     :cond_2
a=0;//     #v5=(PosByte);
a=0;//     const/16 v5, 0x61
a=0;// 
a=0;//     if-lt v0, v5, :cond_3
a=0;// 
a=0;//     const/16 v5, 0x66
a=0;// 
a=0;//     if-gt v0, v5, :cond_3
a=0;// 
a=0;//     .line 1462
a=0;//     add-int/lit8 v5, v0, -0x61
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0xa
a=0;// 
a=0;//     add-int/2addr v5, v4
a=0;// 
a=0;//     int-to-char v4, v5
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1463
a=0;//     :cond_3
a=0;//     #v5=(PosByte);
a=0;//     const/16 v5, 0x41
a=0;// 
a=0;//     if-lt v0, v5, :cond_4
a=0;// 
a=0;//     const/16 v5, 0x46
a=0;// 
a=0;//     if-gt v0, v5, :cond_4
a=0;// 
a=0;//     .line 1464
a=0;//     add-int/lit8 v5, v0, -0x41
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0xa
a=0;// 
a=0;//     add-int/2addr v5, v4
a=0;// 
a=0;//     int-to-char v4, v5
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1466
a=0;//     :cond_4
a=0;//     #v5=(PosByte);
a=0;//     new-instance v5, Ljava/lang/NumberFormatException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\\u"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     iget v9, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-direct {v7, v8, v9, v10}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1469
a=0;//     .end local v0    # "c":C
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v5, v5, 0x4
a=0;// 
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1473
a=0;//     .end local v1    # "end":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "result":C
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,[C);
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1476
a=0;//     :sswitch_2
a=0;//     #v4=(Uninit);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1479
a=0;//     :sswitch_3
a=0;//     #v4=(Uninit);
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1482
a=0;//     :sswitch_4
a=0;//     #v4=(Uninit);
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1485
a=0;//     :sswitch_5
a=0;//     #v4=(Uninit);
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1488
a=0;//     :sswitch_6
a=0;//     #v4=(Uninit);
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 1489
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1449
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0xa -> :sswitch_6
a=0;//         0x62 -> :sswitch_2
a=0;//         0x66 -> :sswitch_5
a=0;//         0x6e -> :sswitch_3
a=0;//         0x72 -> :sswitch_4
a=0;//         0x74 -> :sswitch_1
a=0;//         0x75 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private skipQuotedValue(C)V
a=0;//     .locals 6
a=0;//     .param p1, "quote"    # C
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1078
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     .line 1080
a=0;//     .local v0, "buffer":[C
a=0;//     :cond_0
a=0;//     #v0=(Reference,[C);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1081
a=0;//     .local v3, "p":I
a=0;//     #v3=(Integer);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     .local v2, "l":I
a=0;//     #v2=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 1083
a=0;//     .end local v3    # "p":I
a=0;//     .local v4, "p":I
a=0;//     :goto_0
a=0;//     #v4=(Integer);
a=0;//     if-ge v4, v2, :cond_4
a=0;// 
a=0;//     .line 1084
a=0;//     add-int/lit8 v3, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v3    # "p":I
a=0;//     aget-char v1, v0, v4
a=0;// 
a=0;//     .line 1085
a=0;//     .local v1, "c":I
a=0;//     #v1=(Char);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 1086
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1087
a=0;//     return-void
a=0;// 
a=0;//     .line 1088
a=0;//     :cond_1
a=0;//     const/16 v5, 0x5c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v1, v5, :cond_3
a=0;// 
a=0;//     .line 1089
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1090
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->readEscapeCharacter()C
a=0;// 
a=0;//     .line 1091
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1092
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 1097
a=0;//     .end local v3    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1093
a=0;//     .end local v4    # "p":I
a=0;//     .restart local v3    # "p":I
a=0;//     :cond_3
a=0;//     #v5=(PosByte);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     if-ne v1, v5, :cond_2
a=0;// 
a=0;//     .line 1094
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 1095
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1098
a=0;//     .end local v1    # "c":I
a=0;//     .end local v3    # "p":I
a=0;//     .restart local v4    # "p":I
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     iput v4, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1099
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1100
a=0;//     const-string v5, "Unterminated string"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private skipTo(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p1, "toFind"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1413
a=0;//     :goto_0
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1414
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 1415
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 1416
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     .line 1413
a=0;//     :cond_1
a=0;//     #v2=(Char);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1419
a=0;//     :cond_2
a=0;//     #v1=(Char);v2=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "c":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Char);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_3
a=0;// 
a=0;//     .line 1420
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 1419
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1424
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1426
a=0;//     .end local v0    # "c":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     :cond_4
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private skipToEndOfLine()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1396
a=0;//     :cond_0
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1397
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     aget-char v0, v1, v2
a=0;// 
a=0;//     .line 1398
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 1399
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->lineNumber:I
a=0;// 
a=0;//     .line 1400
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->lineStart:I
a=0;// 
a=0;//     .line 1406
a=0;//     .end local v0    # "c":C
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1402
a=0;//     .restart local v0    # "c":C
a=0;//     :cond_3
a=0;//     #v0=(Char);v1=(PosByte);v3=(Integer);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private skipUnquotedValue()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1105
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1106
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->limit:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 1107
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 1106
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1113
a=0;//     :sswitch_0
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->checkLenient()V
a=0;// 
a=0;//     .line 1125
a=0;//     :sswitch_1
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1131
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 1129
a=0;//     :cond_1
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1130
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->fillBuffer(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1107
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x9 -> :sswitch_1
a=0;//         0xa -> :sswitch_1
a=0;//         0xc -> :sswitch_1
a=0;//         0xd -> :sswitch_1
a=0;//         0x20 -> :sswitch_1
a=0;//         0x23 -> :sswitch_0
a=0;//         0x2c -> :sswitch_1
a=0;//         0x2f -> :sswitch_0
a=0;//         0x3a -> :sswitch_1
a=0;//         0x3b -> :sswitch_0
a=0;//         0x3d -> :sswitch_0
a=0;//         0x5b -> :sswitch_1
a=0;//         0x5c -> :sswitch_0
a=0;//         0x5d -> :sswitch_1
a=0;//         0x7b -> :sswitch_1
a=0;//         0x7d -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private syntaxError(Ljava/lang/String;)Ljava/io/IOException;
a=0;//     .locals 3
a=0;//     .param p1, "message"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1505
a=0;//     new-instance v0, Lcom/google/gson/stream/MalformedJsonException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " at line "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " column "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public beginArray()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 331
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 332
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 334
a=0;//     :cond_0
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 335
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->push(I)V
a=0;// 
a=0;//     .line 336
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 341
a=0;//     return-void
a=0;// 
a=0;//     .line 338
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected BEGIN_ARRAY but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public beginObject()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 367
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 368
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 370
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 371
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lcom/google/gson/stream/JsonReader;->push(I)V
a=0;// 
a=0;//     .line 372
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// 
a=0;//     .line 374
a=0;//     :cond_1
a=0;//     #v1=(One);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected BEGIN_OBJECT but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1193
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 1194
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->stack:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aput v1, v0, v2
a=0;// 
a=0;//     .line 1195
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     .line 1196
a=0;//     iget-object v0, p0, Lcom/google/gson/stream/JsonReader;->in:Ljava/io/Reader;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Reader;);
a=0;//     invoke-virtual {v0}, Ljava/io/Reader;->close()V
a=0;// 
a=0;//     .line 1197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endArray()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 349
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 353
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     .line 354
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 359
a=0;//     return-void
a=0;// 
a=0;//     .line 356
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected END_ARRAY but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public endObject()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 385
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 389
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     .line 390
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 395
a=0;//     return-void
a=0;// 
a=0;//     .line 392
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected END_OBJECT but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public hasNext()Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 402
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 405
a=0;//     :cond_0
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final isLenient()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-boolean v0, p0, Lcom/google/gson/stream/JsonReader;->lenient:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public nextBoolean()Z
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 836
a=0;//     #v1=(Null);
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 837
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 838
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 840
a=0;//     :cond_0
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 841
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 842
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 845
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 843
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 844
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 847
a=0;//     :cond_2
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected a boolean but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public nextDouble()D
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0xb
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 881
a=0;//     #v7=(Null);
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 882
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 883
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 886
a=0;//     :cond_0
a=0;//     const/16 v3, 0xf
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     .line 887
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 888
a=0;//     iget-wide v3, p0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     long-to-double v1, v3
a=0;// 
a=0;//     .line 911
a=0;//     :goto_0
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 891
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(PosByte);v4=(PosByte);v5=(Uninit);v6=(Uninit);
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     if-ne v0, v3, :cond_4
a=0;// 
a=0;//     .line 892
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v3, v4, v5, v6}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 893
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 903
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iput v8, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 904
a=0;//     iget-object v3, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 905
a=0;//     .local v1, "result":D
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     iget-boolean v3, p0, Lcom/google/gson/stream/JsonReader;->lenient:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Double;->isInfinite(D)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 906
a=0;//     :cond_3
a=0;//     new-instance v3, Lcom/google/gson/stream/MalformedJsonException;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "JSON forbids NaN and infinities: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " at line "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " column "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 894
a=0;//     .end local v1    # "result":D
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(PosByte);v4=(PosByte);v5=(Uninit);v6=(Uninit);
a=0;//     if-eq v0, v4, :cond_5
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     if-ne v0, v3, :cond_7
a=0;// 
a=0;//     .line 895
a=0;//     :cond_5
a=0;//     if-ne v0, v4, :cond_6
a=0;// 
a=0;//     const/16 v3, 0x27
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-direct {p0, v3}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(PosByte);
a=0;//     const/16 v3, 0x22
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 896
a=0;//     :cond_7
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     if-ne v0, v3, :cond_8
a=0;// 
a=0;//     .line 897
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->nextUnquotedValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 898
a=0;//     :cond_8
a=0;//     #v3=(PosByte);
a=0;//     if-eq v0, v8, :cond_2
a=0;// 
a=0;//     .line 899
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Expected a double but was "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " at line "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " column "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 909
a=0;//     .restart local v1    # "result":D
a=0;//     :cond_9
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);v3=(Boolean);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 910
a=0;//     iput v7, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public nextInt()I
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 1144
a=0;//     #v9=(Null);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 1145
a=0;//     .local v2, "p":I
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1146
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1150
a=0;//     :cond_0
a=0;//     const/16 v5, 0xf
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v2, v5, :cond_2
a=0;// 
a=0;//     .line 1151
a=0;//     iget-wide v5, p0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     long-to-int v3, v5
a=0;// 
a=0;//     .line 1152
a=0;//     .local v3, "result":I
a=0;//     #v3=(Integer);
a=0;//     iget-wide v5, p0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     int-to-long v7, v3
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v5, v5, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 1153
a=0;//     new-instance v5, Ljava/lang/NumberFormatException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Expected an int but was "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-wide v7, p0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " at line "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " column "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1156
a=0;//     :cond_1
a=0;//     #v5=(Byte);v6=(LongHi);v7=(LongLo);
a=0;//     iput v9, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 1186
a=0;//     .end local v3    # "result":I
a=0;//     .local v4, "result":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 1160
a=0;//     .end local v4    # "result":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(PosByte);v6=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     if-ne v2, v5, :cond_3
a=0;// 
a=0;//     .line 1161
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v5, v6, v7, v8}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 1162
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 1177
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 1178
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 1179
a=0;//     .local v0, "asDouble":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     double-to-int v3, v0
a=0;// 
a=0;//     .line 1180
a=0;//     .restart local v3    # "result":I
a=0;//     #v3=(Integer);
a=0;//     int-to-double v5, v3
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     cmpl-double v5, v5, v0
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 1181
a=0;//     new-instance v5, Ljava/lang/NumberFormatException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Expected an int but was "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " at line "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " column "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1163
a=0;//     .end local v0    # "asDouble":D
a=0;//     .end local v3    # "result":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v5=(PosByte);v6=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     if-eq v2, v6, :cond_4
a=0;// 
a=0;//     const/16 v5, 0x9
a=0;// 
a=0;//     if-ne v2, v5, :cond_6
a=0;// 
a=0;//     .line 1164
a=0;//     :cond_4
a=0;//     if-ne v2, v6, :cond_5
a=0;// 
a=0;//     const/16 v5, 0x27
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 1166
a=0;//     :try_start_0
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1167
a=0;//     .restart local v3    # "result":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 1168
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v4    # "result":I
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1164
a=0;//     .end local v4    # "result":I
a=0;//     :cond_5
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(PosByte);
a=0;//     const/16 v5, 0x22
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1173
a=0;//     :cond_6
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Expected an int but was "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " at line "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " column "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1184
a=0;//     .restart local v0    # "asDouble":D
a=0;//     .restart local v3    # "result":I
a=0;//     :cond_7
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);v3=(Integer);v5=(Byte);v6=(DoubleHi);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 1185
a=0;//     iput v9, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 1186
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v4    # "result":I
a=0;//     #v4=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1169
a=0;//     .end local v0    # "asDouble":D
a=0;//     .end local v4    # "result":I
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Conflicted);v4=(Uninit);v5=(Reference,Ljava/lang/String;);v6=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public nextLong()J
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 925
a=0;//     #v9=(Null);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 926
a=0;//     .local v2, "p":I
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 927
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 930
a=0;//     :cond_0
a=0;//     const/16 v5, 0xf
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v2, v5, :cond_1
a=0;// 
a=0;//     .line 931
a=0;//     iput v9, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 932
a=0;//     iget-wide v3, p0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     .line 961
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(LongLo);v4=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-wide v3
a=0;// 
a=0;//     .line 935
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     if-ne v2, v5, :cond_2
a=0;// 
a=0;//     .line 936
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     iget v7, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v5, v6, v7, v8}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 937
a=0;//     iget v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     .line 952
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 953
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 954
a=0;//     .local v0, "asDouble":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     double-to-long v3, v0
a=0;// 
a=0;//     .line 955
a=0;//     .local v3, "result":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     long-to-double v5, v3
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     cmpl-double v5, v5, v0
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 956
a=0;//     new-instance v5, Ljava/lang/NumberFormatException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Expected a long but was "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " at line "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " column "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 938
a=0;//     .end local v0    # "asDouble":D
a=0;//     .end local v3    # "result":J
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(PosByte);v6=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     if-eq v2, v6, :cond_3
a=0;// 
a=0;//     const/16 v5, 0x9
a=0;// 
a=0;//     if-ne v2, v5, :cond_5
a=0;// 
a=0;//     .line 939
a=0;//     :cond_3
a=0;//     if-ne v2, v6, :cond_4
a=0;// 
a=0;//     const/16 v5, 0x27
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 941
a=0;//     :try_start_0
a=0;//     iget-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 942
a=0;//     .restart local v3    # "result":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput v5, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 944
a=0;//     .end local v3    # "result":J
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 939
a=0;//     :cond_4
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(PosByte);
a=0;//     const/16 v5, 0x22
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 948
a=0;//     :cond_5
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Expected a long but was "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " at line "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " column "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 959
a=0;//     .restart local v0    # "asDouble":D
a=0;//     .restart local v3    # "result":J
a=0;//     :cond_6
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);v3=(LongLo);v4=(LongHi);v5=(Byte);v6=(DoubleHi);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput-object v5, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 960
a=0;//     iput v9, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public nextName()Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 773
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 774
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 775
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 778
a=0;//     :cond_0
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 779
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->nextUnquotedValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 788
a=0;//     .local v1, "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 789
a=0;//     return-object v1
a=0;// 
a=0;//     .line 780
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(PosByte);
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 781
a=0;//     const/16 v2, 0x27
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 782
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 783
a=0;//     const/16 v2, 0x22
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 785
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Expected a name but was "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " at line "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " column "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public nextNull()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 859
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 860
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 861
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 863
a=0;//     :cond_0
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 864
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 869
a=0;//     return-void
a=0;// 
a=0;//     .line 866
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected null but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public nextString()Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 801
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 802
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 803
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 806
a=0;//     :cond_0
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 807
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->nextUnquotedValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 824
a=0;//     .local v1, "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 825
a=0;//     return-object v1
a=0;// 
a=0;//     .line 808
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 809
a=0;//     const/16 v2, 0x27
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 810
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 811
a=0;//     const/16 v2, 0x22
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/stream/JsonReader;->nextQuotedValue(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 812
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     if-ne v0, v2, :cond_4
a=0;// 
a=0;//     .line 813
a=0;//     iget-object v1, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     .line 814
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/google/gson/stream/JsonReader;->peekedString:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 815
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(PosByte);
a=0;//     const/16 v2, 0xf
a=0;// 
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 816
a=0;//     iget-wide v2, p0, Lcom/google/gson/stream/JsonReader;->peekedLong:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 817
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(PosByte);v3=(Uninit);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     if-ne v0, v2, :cond_6
a=0;// 
a=0;//     .line 818
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/google/gson/stream/JsonReader;->buffer:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v1, v2, v3, v4}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     .line 819
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 821
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Expected a string but was "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " at line "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " column "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public peek()Lcom/google/gson/stream/JsonToken;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iget v0, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 413
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 414
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 417
a=0;//     :cond_0
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 446
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 419
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->BEGIN_OBJECT:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     .line 444
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 421
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->END_OBJECT:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->BEGIN_ARRAY:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->END_ARRAY:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 429
a=0;//     :pswitch_4
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->NAME:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 432
a=0;//     :pswitch_5
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->BOOLEAN:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 434
a=0;//     :pswitch_6
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 439
a=0;//     :pswitch_7
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->STRING:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 442
a=0;//     :pswitch_8
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->NUMBER:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 444
a=0;//     :pswitch_9
a=0;//     #v1=(Uninit);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 417
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_7
a=0;//         :pswitch_7
a=0;//         :pswitch_7
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_8
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final setLenient(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "lenient"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     iput-boolean p1, p0, Lcom/google/gson/stream/JsonReader;->lenient:Z
a=0;// 
a=0;//     .line 316
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public skipValue()V
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 1205
a=0;//     #v4=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1207
a=0;//     .local v0, "count":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v1, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 1208
a=0;//     .local v1, "p":I
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1209
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->doPeek()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1212
a=0;//     :cond_1
a=0;//     if-ne v1, v5, :cond_3
a=0;// 
a=0;//     .line 1213
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/stream/JsonReader;->push(I)V
a=0;// 
a=0;//     .line 1214
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 1233
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->peeked:I
a=0;// 
a=0;//     .line 1234
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1235
a=0;//     return-void
a=0;// 
a=0;//     .line 1215
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     if-ne v1, v4, :cond_4
a=0;// 
a=0;//     .line 1216
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/stream/JsonReader;->push(I)V
a=0;// 
a=0;//     .line 1217
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1218
a=0;//     :cond_4
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_5
a=0;// 
a=0;//     .line 1219
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     .line 1220
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1221
a=0;//     :cond_5
a=0;//     #v2=(PosByte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     if-ne v1, v2, :cond_6
a=0;// 
a=0;//     .line 1222
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->stackSize:I
a=0;// 
a=0;//     .line 1223
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1224
a=0;//     :cond_6
a=0;//     #v2=(PosByte);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     if-eq v1, v2, :cond_7
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     if-ne v1, v2, :cond_8
a=0;// 
a=0;//     .line 1225
a=0;//     :cond_7
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->skipUnquotedValue()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1226
a=0;//     :cond_8
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     if-eq v1, v2, :cond_9
a=0;// 
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     if-ne v1, v2, :cond_a
a=0;// 
a=0;//     .line 1227
a=0;//     :cond_9
a=0;//     const/16 v2, 0x27
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/stream/JsonReader;->skipQuotedValue(C)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1228
a=0;//     :cond_a
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     if-eq v1, v2, :cond_b
a=0;// 
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     if-ne v1, v2, :cond_c
a=0;// 
a=0;//     .line 1229
a=0;//     :cond_b
a=0;//     const/16 v2, 0x22
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/stream/JsonReader;->skipQuotedValue(C)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1230
a=0;//     :cond_c
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 1231
a=0;//     iget v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/google/gson/stream/JsonReader;->peekedNumberLength:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/google/gson/stream/JsonReader;->pos:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1430
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " at line "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getLineNumber()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " column "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/stream/JsonReader;->getColumnNumber()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
